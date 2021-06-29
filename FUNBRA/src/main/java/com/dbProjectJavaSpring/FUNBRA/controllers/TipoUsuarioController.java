package com.dbProjectJavaSpring.FUNBRA.controllers;

import java.util.HashMap;

import com.dbProjectJavaSpring.FUNBRA.dto.TipoUsuarioDto;
import com.dbProjectJavaSpring.FUNBRA.forms.TipoUsuarioForm;
import com.dbProjectJavaSpring.FUNBRA.services.TipoUsuarioIMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//Ruta que va a tener cada una de las vistas 
@RequestMapping("/tipousuario")
public class TipoUsuarioController {
    
    //Incorporar los servicios en los que se estan trabajando
    //Traer la implementacion (Service)
    @Autowired
    TipoUsuarioIMS tuservice;
    //***** REDIRECCIONAR A LA LISTA DONDE SE MOSTRARA EL CONTENIDO EN UNA TABLA *****/
    //SELECT * FROM TABLE;
    //Una subruta con un enlace adicional que va va a provenir del metodo GET
    @GetMapping("/show")
    //Desarrollar un metodo -> ModelandView que permite acceder a las vistas de un servicio hacia los controlladores 
    public ModelAndView show(){
        //Elemento Lonbook es una depedencia (conjunto de clases) que sirven para manipular los elementos sin evitar tanta repeticion de codigo.
        //var -> por que se maneja con array List
        var params=new HashMap<String, Object>();
        //Agregar elementos a la vista
        params.put("ListTu", tuservice.getAll());
        return new ModelAndView("tipousuario", params);
    }
    /***** REDIRECCIONAR AL FORMULARIO PARA CREAR UN NUEVO TIPO USUARIO *****/
    //INSERT INTO TABLE VALUES()
    @GetMapping("/new")
    public ModelAndView newTipoUsuario(){
        var params=new HashMap<String, Object>();
        TipoUsuarioForm form=new TipoUsuarioForm();
        form.setTusuario(new TipoUsuarioDto());
        params.put("form", form);
        return new ModelAndView("tipousuarioFormRegister", params);
    }

    /***** GUARDA LOS CAMBIOS Y LUEGO LISTARLOS EN LA TABLA - (INDEPENDIENTEMENTE QUE SEA CREAR O ACTUALIZAR) ******/
    //
    //Sirve para enviarle a un objeto en caso de registrar un elemento en la base de datos
    @PostMapping("/save")
    public ModelAndView save(TipoUsuarioForm form){
        tuservice.save(form.getTusuario());
        //Luego del registro, se redirecciona al usuario a un lugar en especifico en este caso "a el apartado de listar"
        return new ModelAndView("redirect:/tipousuario/show");
    }

    /***** ACTUALIZAR LOS DATOS YA REGISTRADOS *****/
    //Mas que todo es para la edicion del dato
    //ALTER TABLE
    @GetMapping("/edit/{idTipoUsuario}")
    //                       Esta anotacion lo que hace es indicar cual es el campo (El atributo del modelo)                  que va a estar siendo definido para que se realice la consulta 
    public ModelAndView edit(@ModelAttribute("idTipoUsuario") Integer idTipoUsuario){
        var params=new HashMap<String, Object>();
        TipoUsuarioForm form= new TipoUsuarioForm();
        //Realizar la carga del proceso
        form.setTusuario(tuservice.get(idTipoUsuario));
        params.put("form", form);
        return new ModelAndView("tipousuarioFormRegister", params);
    } 

    /***** BORRAR REGISTRO ******/
    //DELETE FROM
    @GetMapping("/delete/{idTipoUsuario}")
    public ModelAndView delete(@ModelAttribute("idTipoUsuario") Integer idTipoUsuario){
        tuservice.delete(idTipoUsuario);
        return new ModelAndView("redirect:/tipousuario/show");
    } 
}
