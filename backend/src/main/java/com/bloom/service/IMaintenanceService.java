package com.bloom.service;

import com.bloom.model.Maintenance;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IMaintenanceService {

	@Transactional
	int createMaintenance(Maintenance maintenance);

	List<Maintenance> getMaintenanceNum(Maintenance maintenance);

	List<Maintenance> getAgentContribution(String license);

	Maintenance getMaintenanceByNum(long num);

	int getLastCountMaintenance();

	List<Maintenance> getAllMaintenance();

	List<Maintenance> getMaintenanceDetail(Maintenance tempMain);

	long getRecentNum(Maintenance maintenance);
}