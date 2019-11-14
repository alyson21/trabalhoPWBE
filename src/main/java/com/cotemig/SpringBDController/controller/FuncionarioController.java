package com.cotemig.SpringBDController.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ModelAndViewResolverMethodReturnValueHandler;

import com.cotemig.SpringBDController.model.Funcionario;
import com.cotemig.SpringBDController.service.FuncionarioService;



public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@RequestMapping(value = "/funcionario", method = RequestMethod.GET)
    public ModelAndView listar() {
		ModelAndView mav = new ModelAndView();
			return new ModelAndView("funcionario", "Funcionarios", funcionarioService.getAll());
			
    }
	
	@RequestMapping(value = "/insertfuncionario", method = RequestMethod.GET)
    public String insert() {
			return "insertFuncionario";		
    }
	
	
	@RequestMapping(value = "/insertfuncionario", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("Funcionario")Funcionario funcionario, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		funcionarioService.insert(funcionario);
        
        return "sucesso";
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
