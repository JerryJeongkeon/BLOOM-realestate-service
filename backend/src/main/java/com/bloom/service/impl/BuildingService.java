package com.bloom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloom.dao.IBuildingDao;
import com.bloom.model.Building;
import com.bloom.model.Maintenance;
import com.bloom.service.IBuildingService;

@Service
public class BuildingService implements IBuildingService {

	@Autowired
	private IBuildingDao buildingDao;

	@Override
	public int createBuilding(Building building) {
		return buildingDao.createBuilding(building);
	}

	@Override
	public List<Building> getAllBuilding() {
		return buildingDao.getAllBuilding();
	}

	@Override
	public List<Building> getBuildingDetail(Building building) {
		return buildingDao.getBuildingDetail(building);
	}

	@Override
	public long getRecentNum(Building building) {
		return buildingDao.getRecentNum(building);
	}

	@Override
	public List<Building> getBuildingNum(Building building) {
		return buildingDao.getBuildingNum(building);
	}

	@Override
	public List<Building> getAgentContribution(String license) {
		return buildingDao.getAgentContribution(license);
	}

	@Override
	public Building getBuildingByNum(long num) {
		return buildingDao.getBuildingByNum(num);
	}

	@Override
	public void deleteDatabase() {
		buildingDao.deleteDatabase();
	}

	public void auto() {
		buildingDao.auto();
	}

	@Override
	public int getLastCount() {
		return buildingDao.getLastCount();
	}

	@Override
	public List<Building> getBuildingDetailM(Building b) {
		return buildingDao.getBuildingDetailM(b);
	}

	@Override
	public List<Building> getDetailList(Building tempBuilding) {
		return buildingDao.getDetailLis(tempBuilding);
	}

	@Override
	public String getBImage(Building building) {
		return buildingDao.getBImage(building);
	}

	@Override
	public String getMImage(Building building) {
		return buildingDao.getMImage(building);
	}

	@Override
	public List<Maintenance> getAgentContributionM(String license) {
		return buildingDao.getAgentContributionM(license);
	}

}
