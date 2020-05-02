package com.bloom.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.bloom.model.Building;
import com.bloom.model.Maintenance;

public interface IBuildingService {

	@Transactional
	int createBuilding(Building building);

	List<Building> getAllBuilding();

	List<Building> getBuildingDetail(Building building);

	long getRecentNum(Building building);

	List<Building> getBuildingNum(Building building);

	List<Building> getAgentContribution(String license);

	Building getBuildingByNum(long num);

    void deleteDatabase();
    
    void auto();
    
	int getLastCount();

	List<Building> getBuildingDetailM(Building b);

	List<Building> getDetailList(Building tempBuilding);

	String getBImage(Building building);

	String getMImage(Building building);
	
	List<Maintenance> getAgentContributionM(String license);
}
