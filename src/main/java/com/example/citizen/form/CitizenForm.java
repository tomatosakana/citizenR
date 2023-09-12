package com.example.citizen.form;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//入力フォーム
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CitizenForm {
	//ID
	@Id
	private Integer id;
	// 法人格
	@NotBlank
	private String status;
	// 団体名
	@NotBlank
	private String name;
	// 活動内容
	@NotBlank
	private String activity;
	// 活動分野 
	@NotBlank
	private String field;
	// 登録・変更判別用
	private Boolean newCitizen;
}
