package com.bloom.dao;

import java.util.List;

import com.bloom.model.Search;

public interface ISearchDao {
	List<Search> getAllSearch(long num);

	Search isSearched(Search search);

	int search(Search search);

	int deleteSearch(Search search);

	int updateSearch(Search search);
}
