package com.example.citizen.service;

import java.util.List;

import com.example.citizen.entity.Citizen;

public interface CitizenService {
	// 団体情報の全件取得 
	List<Citizen> selectAll();
	// 団体情報をidをキーに一件取得 
	Citizen selectOneById(Integer id);
	// 団体情報登録 
	void insertCitizen(Citizen citizen);
	// 団体情報更新 
	void updateCitizen(Citizen citizen);
	// 団体情報削除 
	void deleteCitizen(Integer id);
	
}
