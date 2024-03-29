package com.cotemig.SpringBDController.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.SpringBDController.model.Funcionario;
import com.cotemig.SpringBDController.model.Salario;
import com.cotemig.SpringBDController.service.SalarioService;
@Controller
public class SalarioController {
	@Autowired
	private SalarioService salarioService;
	

	@RequestMapping(value = "/salario", method = RequestMethod.GET)
    public ModelAndView listar() {
		List<Salario> salarios = salarioService.getAll();
		ModelAndView mav = new ModelAndView("salario");
		mav.addObject("salarios", salarios);
		return mav;	
    }
	
	@RequestMapping(value = "/insertsalario", method = RequestMethod.GET)
    public String insert() {
			return "insertsalario";		
    }
	
	
	@RequestMapping(value = "/insertsalario", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("Salario")Salario salario, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		salarioService.insert(salario);
        
        return "redirect:salario";
    }
	
	@RequestMapping(value = "/updatesalario", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
		return new ModelAndView("updateSalario", "Salario", salarioService.getById(id).get());
		
    }
	
	
	@RequestMapping(value = "/updatesalario", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("Salario")Salario salario, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		salarioService.update(salario);
        
        return "sucesso";
    }
	
	
	@RequestMapping(value = "/deletesalario", method = RequestMethod.GET)
    public String delete() {
			return "deleteSalario";		
    }
	
	
	@RequestMapping(value = "/deletesalario", method = RequestMethod.POST)
    public String submitDelete(@Valid @ModelAttribute("Salario")Salario salario, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		salarioService.deleteById(salario.getId());
        
        return "sucesso";
    }

}
