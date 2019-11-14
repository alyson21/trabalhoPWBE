package com.cotemig.SpringBDController.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.SpringBDController.model.Usuario;
import com.cotemig.SpringBDController.service.PerfilService;
import com.cotemig.SpringBDController.service.UsuarioService;

public class UsuarioController {
	
	
	@Autowired
	private UsuarioService usuarioService;
	

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public ModelAndView listar() {
		ModelAndView mav = new ModelAndView();
			return new ModelAndView("usuario", "Usuario", usuarioService.getAll());	
    }
	
	@RequestMapping(value = "/insertusuario", method = RequestMethod.GET)
    public String insert() {
			return "insertUsuario";		
    }
	
	
	@RequestMapping(value = "/insertusuario", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("Usuario")Usuario usuario, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		usuarioService.insert(usuario);
        
        return "sucesso";
    }
	
	@RequestMapping(value = "/updateusuario", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
		return new ModelAndView("updateUsuario", "Usuario", usuarioService.getById(id).get());
		
    }
	
	
	@RequestMapping(value = "/updateusuario", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("Usuario")Usuario usuario, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		usuarioService.update(usuario);
        
        return "sucesso";
    }
	
	
	@RequestMapping(value = "/deleteusuario", method = RequestMethod.GET)
    public String delete() {
			return "deleteUsuario";		
    }
	
	
	@RequestMapping(value = "/deleteusuario", method = RequestMethod.POST)
    public String submitDelete(@Valid @ModelAttribute("Usuario")Usuario usuario, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		usuarioService.deleteById(usuario.getId());
        
        return "sucesso";
    }

}
