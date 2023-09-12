package com.example.citizen.repository;

import java.util.List;

import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.citizen.entity.Citizen;

@Repository
public class CitizenRepositoryImpl implements CitizenRepository {
	private final JdbcTemplate jdbcTemplate;
	
	//JdbcTemplateの注入
    public CitizenRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
	
    //データベースへの行の挿入
	@Override
	public void insert(Citizen citizen) {
		// TODO 自動生成されたメソッド・スタブ
		
		jdbcTemplate.update("INSERT INTO citizen (status, name, activity, field) VALUES ( ?, ?, ?, ?)",
                
                citizen.getStatus(),
                citizen.getName(),
                citizen.getActivity(),
                citizen.getField()
                );
	}

	//データベースの行の更新
	@Override
	public void update(Citizen citizen) {
		// TODO 自動生成されたメソッド・スタブ
		jdbcTemplate.update("UPDATE citizen  SET status=?, name=?, activity=?, field=? WHERE id = ?",                
                citizen.getStatus(),
                citizen.getName(),
                citizen.getActivity(),
                citizen.getField(),
                citizen.getId()
                );
	
	}

	//データベースの行の削除
	@Override
	public void delete(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		jdbcTemplate.update("DELETE FROM citizen WHERE id = ?", id);
	}

	//データベースの全権取得	
	@Override
	public List<Citizen> findAll() {
		// TODO 自動生成されたメソッド・スタブ
		List<Citizen> citizens = jdbcTemplate.query("SELECT* FROM citizen",
				new DataClassRowMapper<>(Citizen.class));
		return citizens;
	}
	
	//データベースの行検索
	@Override
	public Citizen findById(Integer id) {
		// TODO 自動生成されたメソッド・スタブ
		Citizen citizen = jdbcTemplate.queryForObject("SELECT* FROM citizen WHERE id=?",
				new DataClassRowMapper<>(Citizen.class),id);
		
		return citizen;
	}

}
