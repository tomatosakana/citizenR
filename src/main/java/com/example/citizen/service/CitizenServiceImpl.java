package com.example.citizen.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.citizen.entity.Citizen;
import com.example.citizen.repository.CitizenRepository;

@Service
@Transactional
public class CitizenServiceImpl implements CitizenService {
	private final CitizenRepository citizenRepository;
	
	public CitizenServiceImpl(CitizenRepository citizenRepository) {
		this.citizenRepository = citizenRepository;
	}
	@Override
	public List<Citizen> selectAll() {
		// TODO 自動生成されたメソッド・スタブ
		return citizenRepository.findAll();
	}

	@Override
	public Citizen selectOneById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		return citizenRepository.findById(id);
	}

	@Override
	public void insertCitizen(Citizen citizen) {
		// TODO 自動生成されたメソッド・スタブ
		citizenRepository.insert(citizen);
	}

	@Override
	public void updateCitizen(Citizen citizen) {
		// TODO 自動生成されたメソッド・スタブ
		citizenRepository.update(citizen);
	}

	@Override
	public void deleteCitizen(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		citizenRepository.delete(id);
	}

}
