package com.cotemig.SpringBDController.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.SpringBDController.model.Perfil;
import com.cotemig.SpringBDController.service.PerfilService;

public class PerfilController {
	
	@Autowired
	private PerfilService perfilService;
	
	

	@RequestMapping(value = "/perfil", method = RequestMethod.GET)
    public ModelAndView listar() {
		ModelAndView mav = new ModelAndView();
			return new ModelAndView("perfil", "Perfil", perfilService.getAll());	
    }
	
	@RequestMapping(value = "/insertperfil", method = RequestMethod.GET)
    public String insert() {
			return "insertPerfil";		
    }
	
	
	@RequestMapping(value = "/insertperfil", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("Perfil")Perfil perfil, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		perfilService.insert(perfil);
        
        return "sucesso";
    }
	
	@RequestMapping(value = "/updateperfil", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
		return new ModelAndView("updatePerfil", "Perfil", perfilService.getById(id).get());
		
    }
	
	
	@RequestMapping(value = "/updateperfil", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("Perfil")Perfil perfil, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		perfilService.update(perfil);
        
        return "sucesso";
    }
	
	
	@RequestMapping(value = "/deleteperfil", method = RequestMethod.GET)
    public String delete() {
			return "deletePerfil";		
    }
	
	
	@RequestMapping(value = "/deleteperfil", method = RequestMethod.POST)
    public String submitDelete(@Valid @ModelAttribute("Perfil")Perfil perfil, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		perfilService.deleteById(perfil.getId());
        
        return "sucesso";
    }

}
