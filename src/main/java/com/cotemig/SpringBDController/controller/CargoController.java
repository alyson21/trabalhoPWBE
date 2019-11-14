package com.cotemig.SpringBDController.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.SpringBDController.model.Cargo;
import com.cotemig.SpringBDController.service.CargoService;
import com.cotemig.SpringBDController.service.UsuarioService;
@Controller
public class CargoController {
	
	@Autowired
	private CargoService cargoService;
	

	@RequestMapping(value = "/cargo", method = RequestMethod.GET)
    public ModelAndView listar() {
		ModelAndView mav = new ModelAndView();
			return new ModelAndView("cargo", "Cargo", cargoService.getAll());	
    }
	
	@RequestMapping(value = "/insertcargo", method = RequestMethod.GET)
    public String insert() {
			return "insertCargo";		
    }
	
	
	@RequestMapping(value = "/insertcargo", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("Cargo")Cargo cargo, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		cargoService.insert(cargo);
        
        return "sucesso";
    }
	
	@RequestMapping(value = "/updatecargo", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
		return new ModelAndView("updateCargo", "Cargo", cargoService.getById(id).get());
		
    }
	
	
	@RequestMapping(value = "/updatecargo", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("Cargo")Cargo cargo, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		cargoService.update(cargo);
        
        return "sucesso";
    }
	
	
	@RequestMapping(value = "/deletecargo", method = RequestMethod.GET)
    public String delete() {
			return "deleteCargo";		
    }
	
	
	@RequestMapping(value = "/deletecargo", method = RequestMethod.POST)
    public String submitDelete(@Valid @ModelAttribute("Cargo")Cargo cargo, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		cargoService.deleteById(cargo.getId());
        
        return "sucesso";
    }
	
	

}
