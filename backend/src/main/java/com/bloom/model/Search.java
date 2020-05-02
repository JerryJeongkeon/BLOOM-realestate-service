package com.bloom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Search {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num;

	private String keyword;

}
