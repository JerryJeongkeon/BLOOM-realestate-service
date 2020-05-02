package com.bloom.service.impl;

import com.bloom.dao.IMaintenanceDao;
import com.bloom.model.Maintenance;
import com.bloom.service.IMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceService implements IMaintenanceService {

    @Autowired
    private IMaintenanceDao maintenanceDao;

    @Override
    public int createMaintenance(Maintenance maintenance) {
        return maintenanceDao.createMaintenance(maintenance);
    }

    @Override
    public List<Maintenance> getMaintenanceNum(Maintenance maintenance) {
        return maintenanceDao.getMaintenanceNum(maintenance);
    }

    @Override
    public List<Maintenance> getAgentContribution(String license) {
        return maintenanceDao.getAgentContribution(license);
    }

    @Override
    public Maintenance getMaintenanceByNum(long num) {
        return maintenanceDao.getMaintenanceByNum(num);
    }

	@Override
	public int getLastCountMaintenance() {
		return maintenanceDao.getLastCountMaintenance();
	}

	@Override
	public List<Maintenance> getAllMaintenance() {
		return maintenanceDao.getAllMaintenance();
	}

	@Override
	public List<Maintenance> getMaintenanceDetail(Maintenance tempMain) {
		return maintenanceDao.getMaintenanceDetail(tempMain);
	}

	@Override
	public long getRecentNum(Maintenance maintenance) {
		return maintenanceDao.getRecentNum(maintenance);
	}
}
