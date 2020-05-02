package com.bloom.dao.impl;

import com.bloom.dao.IMaintenanceDao;
import com.bloom.model.Maintenance;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class MaintenanceDao implements IMaintenanceDao {

    private String ns = "maintenance.";

    @Autowired
    private SqlSession sqlSession;

    @Override
    public int createMaintenance(Maintenance maintenance) {
        return sqlSession.insert(ns + "createMaintenance", maintenance);
    }

    @Override
    public List<Maintenance> getMaintenanceNum(Maintenance maintenance) {
        return sqlSession.selectList(ns + "getMaintenanceNum", maintenance);
    }

    @Override
    public Maintenance getMaintenanceByNum(long num) {
        return sqlSession.selectOne(ns + "getMaintenanceByNum", num);
    }

    @Override
    public List<Maintenance> getAgentContribution(String license) {
        return sqlSession.selectList(ns + "getAgentContribution", license);
    }

	@Override
	public int getLastCountMaintenance() {
		return sqlSession.selectOne(ns + "getLastCountMaintenance");
	}

	@Override
	public List<Maintenance> getAllMaintenance() {
		return sqlSession.selectList(ns + "getAllMaintenance");
	}

	@Override
	public List<Maintenance> getMaintenanceDetail(Maintenance tempMain) {
		return sqlSession.selectList(ns + "getMaintenanceDetail", tempMain);
	}

	@Override
	public long getRecentNum(Maintenance maintenance) {
		return sqlSession.selectOne(ns + "getRecentNum", maintenance);
	}
}
