package com.bloom.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloom.fabric.IFabricCCService;
import com.bloom.fabric.MaintenanceRecord;
import com.bloom.model.Maintenance;
import com.bloom.service.IAgentService;
import com.bloom.service.IMaintenanceService;
import com.bloom.service.impl.FileUploadDownloadService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class MaintenanceController {
	public static final Logger logger = LoggerFactory.getLogger(MaintenanceController.class);

	@Autowired
	private IAgentService agentService;

	@Autowired
	private IMaintenanceService maintenanceService;

	@Autowired
	private IFabricCCService fabricService;
	
	@PostMapping("/maintenance")
	@ApiOperation("패브릭과 DB에 상태 정보 저장")
	public ResponseEntity<Object> registMaintenanceFabric(@RequestBody Maintenance maintenance) throws IOException {
		logger.info("POST : /api/maintenance");
		
		if(maintenance.getAddress().equals("string")) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}

		// PK로 사용할 num 값 DB로부터 받아오기
		int num = maintenanceService.getLastCountMaintenance();
		String mrNum = "MM" + num;
		
		// 이미지 이름 변경
		if (maintenance.getImage() == null || maintenance.getImage().equals("")) {
			maintenance.setImage("default.png");
		} else {
			maintenance.setImage(FileUploadDownloadService.newFileName(maintenance.getImage()));
		}

		MaintenanceRecord mr = new MaintenanceRecord();
		logger.info("Request Building Data : " + maintenance.toString());

		mr.setNum(mrNum);
		mr.setAddress(maintenance.getAddress());
		mr.setDong(maintenance.getDong());
		mr.setHo(maintenance.getHo());
		mr.setLatitude(maintenance.getLatitude());
		mr.setLongitude(maintenance.getLongitude());
		mr.setCategory(maintenance.getCategory());
		mr.setDetails(maintenance.getDetails());
		mr.setCost(maintenance.getCost());
		mr.setStartDate(maintenance.getStartDate());
		mr.setEndDate(maintenance.getEndDate());
		mr.setLicense(maintenance.getLicense());
		mr.setImage(maintenance.getImage());
		mr.setCreatedAt("0");
		mr.setExpiredAt("0");

		// 빈 데이터에 대한 에러처리
		if (mr.getEndDate() == null || mr.getEndDate().equals("")) {
			mr.setEndDate("-");
		}

		if (mr.getDong() == null || mr.getDong().equals("")) {
			mr.setDong("-");
		}

		if (mr.getHo() == null || mr.getHo().equals("")) {
			mr.setHo("-");
		}

		logger.info("원장 저장 시작");
		logger.info("원장에 저장할 데이터 : " + mr.toString());
		boolean result = fabricService.registerMaintenanceInfo(mr);
		if (result == true) {
			// 디비저장해주자
			logger.info("원장 저장 성공");
			if (maintenance.getDong() == null) {
				maintenance.setDong("");
			}
			
			// <createBuilding> Test 성공했음 !, 04-27
			if (maintenanceService.createMaintenance(maintenance) == 0) {
				logger.debug("createBuilding failed");
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}

			// <countUp> xml 확인했음 !, 04-27
			if (agentService.countUp(maintenance.getLicense()) == 0) {
				logger.debug("countUp failed");
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}

			// <pointUp> xml 확인했음 !, 04-27
			if (agentService.pointUp(maintenance.getLicense()) == 0) {
				logger.debug("pointUp failed");
				return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
			}
			logger.info("DB 저장 성공");
			return new ResponseEntity<Object>(String.valueOf(maintenance.getNum()), HttpStatus.OK);
		} else {
			logger.info("원장 저장 실패!!");
			logger.info("실패한 등록 빌딩 데이터 : " + mr.toString());

			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}


}