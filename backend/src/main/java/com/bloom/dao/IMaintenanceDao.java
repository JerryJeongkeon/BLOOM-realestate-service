package com.bloom.dao;

import com.bloom.model.Maintenance;

import java.util.List;

public interface IMaintenanceDao {
	int createMaintenance(Maintenance maintenance);

	List<Maintenance> getMaintenanceNum(Maintenance maintenance);

	Maintenance getMaintenanceByNum(long num);

	List<Maintenance> getAgentContribution(String license);

	int getLastCountMaintenance();

	List<Maintenance> getAllMaintenance();

	List<Maintenance> getMaintenanceDetail(Maintenance tempMain);

	long getRecentNum(Maintenance maintenance);
}
