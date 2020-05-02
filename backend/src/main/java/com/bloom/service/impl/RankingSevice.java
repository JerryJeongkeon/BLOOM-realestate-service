package com.bloom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloom.dao.IRankingDao;
import com.bloom.model.Ranking;
import com.bloom.service.IRankingService;

@Service
public class RankingSevice implements IRankingService {

	@Autowired
	private IRankingDao rankingDao;

	@Override
	public List<Ranking> getRanking() {
		return rankingDao.getRanking();
	}

}
