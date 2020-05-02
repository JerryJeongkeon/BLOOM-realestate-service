package com.bloom.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bloom.dao.IBuildingDao;
import com.bloom.model.Building;
import com.bloom.model.Maintenance;
import com.bloom.service.impl.AgentService;

@Repository
public class BuildingDao implements IBuildingDao {

	private String ns = "building.";

	@Autowired
	private SqlSession sqlSession;

	@Override
	public int createBuilding(Building building) {
		return sqlSession.insert(ns + "createBuilding", building);
	}

	@Override
	public List<Building> getAllBuilding() {
		return sqlSession.selectList(ns + "getAllBuilding");
	}

	@Override
	public List<Building> getBuildingDetail(Building building) {
		return sqlSession.selectList(ns + "getBuildingDetail", building);
	}

	@Override
	public long getRecentNum(Building building) {
		return sqlSession.selectOne(ns + "getRecentNum", building);
	}

	@Override
	public List<Building> getBuildingNum(Building building) {
		return sqlSession.selectList(ns + "getBuildingNum", building);
	}

	@Override
	public List<Building> getAgentContribution(String license) {
		return sqlSession.selectList(ns + "getAgentContribution", license);
	}

	@Override
	public Building getBuildingByNum(long num) {
		return sqlSession.selectOne(ns + "getBuildingByNum", num);
	}

	@Override
	public void deleteDatabase() {
		sqlSession.delete(ns + "deleteDatabase");
	}

	@Override
	public void auto() {
		sqlSession.update(ns + "auto");
	}

	@Override
	public int getLastCount() {
		return sqlSession.selectOne(ns + "getLastCount");
	}

	@Override
	public List<Building> getBuildingDetailM(Building b) {
		return sqlSession.selectList(ns + "getBuildingDetailM", b);
	}

	@Override
	public List<Building> getDetailLis(Building tempBuilding) {
		return sqlSession.selectList(ns + "getDetailLis", tempBuilding);
	}

	@Override
	public String getBImage(Building building) {
		return sqlSession.selectOne(ns + "getBImage", building);
	}

	@Override
	public String getMImage(Building building) {
		return sqlSession.selectOne(ns + "getMImage", building);
	}

	@Override
	public List<Maintenance> getAgentContributionM(String license) {
		return sqlSession.selectList(ns + "getAgentContributionM", license);
	}

}
