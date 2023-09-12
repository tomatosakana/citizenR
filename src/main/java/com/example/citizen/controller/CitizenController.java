package com.example.citizen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.citizen.entity.Citizen;
import com.example.citizen.form.CitizenForm;
import com.example.citizen.service.CitizenService;

@Controller
@RequestMapping("/citizen")
public class CitizenController {
	// サービスの注入
	private final CitizenService citizenService;
	CitizenController(CitizenService citizenService){
		this.citizenService = citizenService;
	}
	
	

	
	@GetMapping
	public String showList(CitizenForm citizenForm, Model model) {
		//新規登録設定
		citizenForm.setNewCitizen(true);
		//データベースから全件取得
		Iterable<Citizen> list = citizenService.selectAll();
		
		//listとtitleをmodelに追加
		model.addAttribute("list", list);
		model.addAttribute("title","登録用フォーム");
		
		
		return "crud";
		
	}
	
	@PostMapping("/insert")
	public String insert(@Validated CitizenForm citizenForm, BindingResult bindingResult,
			Model model, RedirectAttributes redirectAttributes) {
		
		//formをentityに詰め替え
		Citizen citizen = new Citizen();
		citizen.setStatus(citizenForm.getStatus());
		citizen.setName(citizenForm.getName());
		citizen.setActivity(citizenForm.getActivity());
		citizen.setField(citizenForm.getField());
		
		//入力チェック
		if(!bindingResult.hasErrors()) {
			citizenService.insertCitizen(citizen);
			redirectAttributes.addFlashAttribute("complete", "登録完了");
			return "redirect:/citizen";
		}else {
			return showList(citizenForm, model);
		}
	}
	
	@GetMapping("/{id}")
	public String showUpdate(CitizenForm citizenForm, @PathVariable Integer id, Model model) {
		
		//受け取ったidをもとにentityを取得後、フォームに変換
		citizenForm = makeCitizenForm(citizenService.selectOneById(id));
		
		//更新用のmodelを作成
		makeUpdateModel(citizenForm,model);
		
		return "crud";
	}
	
	private void makeUpdateModel(CitizenForm citizenForm, Model model) {
		//更新用のmodelを作成
		model.addAttribute("id", citizenForm.getId());
		citizenForm.setNewCitizen(false);
		model.addAttribute("citizenForm", citizenForm);
		model.addAttribute("title", "更新用フォーム");		
		
	}
	
	//データの更新
	@PostMapping("/update")
	public String update(@Validated CitizenForm citizenForm, BindingResult result, Model model,
			RedirectAttributes redirectAttributes) {
		Citizen citizen = makeCitizen(citizenForm);
		if(!result.hasErrors()) {
			citizenService.updateCitizen(citizen);
			redirectAttributes.addFlashAttribute("complete", "更新完了");
			return "redirect:/citizen/" + citizen.getId();
		}else {
			makeUpdateModel(citizenForm, model);
			return "crud";
		}
	}
	
	//formをentityに変換
	private Citizen makeCitizen(CitizenForm citizenForm) {
		Citizen citizen = new Citizen();
		citizen.setId(citizenForm.getId());
		citizen.setStatus(citizenForm.getStatus());
		citizen.setName(citizenForm.getName());
		citizen.setActivity(citizenForm.getActivity());
		citizen.setField(citizenForm.getField());
		return citizen;
	}
	
	//entityをformに変換
	private CitizenForm makeCitizenForm(Citizen citizen) {
		CitizenForm form = new CitizenForm();
		form.setId(citizen.getId());
		form.setStatus(citizen.getStatus());
		form.setName(citizen.getName());
		form.setActivity(citizen.getActivity());
		form.setField(citizen.getField());
		return form;
	}
	
	//データの削除
	@PostMapping("/delete")
	public String delete(
			@RequestParam("id") String id,
			Model model,
			RedirectAttributes redirectAttributes) {
		citizenService.deleteCitizen(Integer.parseInt(id));
		redirectAttributes.addFlashAttribute("delcomplete", "削除完了");
		return "redirect:/citizen";
		
	}
	
}
