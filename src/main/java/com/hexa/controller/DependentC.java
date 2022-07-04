package com.hexa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hexa.model.customer;
import com.hexa.model.dependent;
import com.hexa.repositories.CustomerR;
import com.hexa.repositories.DependentR;
import com.hexa.services.DependentS;

@Controller
public class DependentC {
	
	@Autowired 
	private DependentS service;
	
	@Autowired 
	private DependentR drepo;
	
	@Autowired
	private CustomerR crepo;
	
	@GetMapping("/dependent/new")
	public String AddNewDependent(Model model) {
		List<customer> liscustomers = crepo.findAll();
		model.addAttribute("dpndt", new dependent());
		model.addAttribute("liscustomers",liscustomers);
		return "FrmAddDependent";
	}
	
	@PostMapping("/dependent/save")
	public String SaveDependent(dependent dpndt) {
		drepo.save(dpndt);
	
		return "redirect:/dependent";
		
	}
	
	@GetMapping("/dependent")
	public String showDependentList(Model model) {
		List<dependent> dpndt= service.ListAllDependent();
		model.addAttribute("dpndt",dpndt);
		return "dependent";
	}
	
	@GetMapping("/dependent/edit/{dependentId}")
	public String updateDependent(@PathVariable("dependentId") Integer dependentId, Model model) {
		dependent dpndt= drepo.findById(dependentId).get();
		model.addAttribute("dpndt", dpndt);
		List<customer> liscustomers = crepo.findAll();
		model.addAttribute("liscustomers",liscustomers);
		
		
		return "FrmAddDependent";
	}

}
