package com.example.citizen.repository;

import java.util.List;

import com.example.citizen.entity.Citizen;

public interface CitizenRepository {
	void insert(Citizen citizen);
	void update(Citizen citizen);
	void delete(Integer id);
	List<Citizen> findAll();
	Citizen findById(Integer id);
}
