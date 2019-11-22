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
import com.cotemig.SpringBDController.service.FuncionarioService;
import com.cotemig.SpringBDController.service.SalarioService;


@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	@Autowired
	private SalarioService salarioService;
	
	@RequestMapping(value = "/funcionario", method = RequestMethod.GET)
    public ModelAndView listar() {		
		List<Funcionario> funcionarios = funcionarioService.getAll();
		ModelAndView mav = new ModelAndView("funcionario");
		mav.addObject("funcionarios", funcionarios);
		return mav;
			
    }
	
	@RequestMapping(value = "/insertfuncionario", method = RequestMethod.GET)
    public String insert() {
		return "insertfuncionario";	
    }
	
	@RequestMapping(value = "/insertfuncionario", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("funcionario")Funcionario funcionario, 
      BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
            return "error";
        }
        
		funcionarioService.insert(funcionario);
        
        return "redirect:funcionario";
    }
	
	@RequestMapping(value = "/updatefuncionario", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
		return new ModelAndView("updateFuncionario", "Funcionario", funcionarioService.getById(id).get());
		
    }
	
	
	@RequestMapping(value = "/updatefuncionario", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("Funcionario")Funcionario funcionario, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		funcionarioService.update(funcionario);
        
        return "sucesso";
    }
	
	
	@RequestMapping(value = "/deletefuncionario", method = RequestMethod.GET)
    public String delete() {
			return "deleteFuncionario";		
    }
	
	
	@RequestMapping(value = "/deletefuncionario", method = RequestMethod.POST)
    public String submitDelete(@Valid @ModelAttribute("Funcionario")Funcionario funcionario, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		funcionarioService.deleteById(funcionario.getId());
        
        return "sucesso";
    }
	

}
