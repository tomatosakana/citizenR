package com.example.citizen.entity;



import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//citizenテーブル用のEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Citizen {
	//ID（主キー）
	@Id
	private Integer id;
	// 法人格 
	private String status;
	// 団体名 
	private String name;
	// 活動内容 
	private String activity;
	// 活動分野 
	private String field;
}
