package com.dbProjectJavaSpring.FUNBRA.controllers;

import java.util.HashMap;
import java.util.List;

import com.dbProjectJavaSpring.FUNBRA.dto.RolDto;
import com.dbProjectJavaSpring.FUNBRA.dto.TipoUsuarioDto;
import com.dbProjectJavaSpring.FUNBRA.forms.RolForm;
import com.dbProjectJavaSpring.FUNBRA.services.RolIMS;
import com.dbProjectJavaSpring.FUNBRA.services.TipoUsuarioIMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/rol")
public class RolController {
    
    @Autowired
    TipoUsuarioIMS tuservice;
    @Autowired
    RolIMS rolservice;

    //Mostrar los datos de una clase
    @GetMapping("/show")
    //Enviar datos a la vista (ModelandView)
    public ModelAndView showRol(){
        //Traer todos los datos consutaldos al servicio para cada una de las tablas 
        List<RolDto> roles=rolservice.getAll();
        List<TipoUsuarioDto> tipous=tuservice.getAll();
        //Crear mapeo para mostrar y guardar los datos en la vista
        var params=new HashMap<String, Object>();
        //Datos para mostrar en la vista
        params.put("listTu", tipous);
        params.put("listRol", roles);
        //Enviar a una vista y verla con el ModelandView 
        return new ModelAndView("Rol", params);
    }

    //Registrar Nuevos
    @GetMapping("/new")
    public ModelAndView newRol(){
        RolForm form=new RolForm();   
        form.setRol(new RolDto());
        form.setLtusuario(tuservice.getAll());
        var params=new HashMap<String, Object>();
        params.put("form", form);
        return new ModelAndView("rolFormRegister", params);
    }

    @PostMapping("/save")
    public ModelAndView save(RolForm form){
        rolservice.save(form.getRol());
        return new ModelAndView("redirect:/rol/show");
    }

    @GetMapping("/edit/{idRol}")
    public ModelAndView editRol(@ModelAttribute("idRol") Integer idRol){
        RolForm form=new RolForm();
        form.setRol(rolservice.get(idRol));
        form.setLtusuario(tuservice.getAll());

        var params=new HashMap<String, Object>();
        params.put("form", form);
        return new ModelAndView("rolFormRegister", params);
    }
    
    @GetMapping("/delete/{idRol}")
    public ModelAndView deleteRol(@ModelAttribute("idRol") Integer idRol) {
        rolservice.delete(idRol);
        return new ModelAndView("redirect:/rol/show");
    } 
}
