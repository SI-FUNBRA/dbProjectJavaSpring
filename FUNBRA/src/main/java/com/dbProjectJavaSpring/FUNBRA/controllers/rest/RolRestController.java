package com.dbProjectJavaSpring.FUNBRA.controllers.rest;

import java.util.List;

import com.dbProjectJavaSpring.FUNBRA.dto.RolDto;
import com.dbProjectJavaSpring.FUNBRA.services.RolIMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Notacion que identifica esta clase
@RestController
//Estructurar la URI (Acceder a los recursos) y comenzar hacer uso de la api
@RequestMapping("/api/rol")
public class RolRestController {
    
    //Acceder al servicio
    @Autowired
    RolIMS rolservice;


    //METODOS GET
    //Listar
    @GetMapping("/all")
    public List<RolDto> getAll(){
        //Importar de la interfaz el metodo definido
        return rolservice.getAll();
    }

    //Consulta por un registro especifico
    @GetMapping("/{idRol}")
    //                  va a llegar una variable que se llama "idRol", para devolver el usuario que 
    //                  queremos mostrar
    public RolDto getRol(@PathVariable("idRol") Integer idRol){
        return rolservice.get(idRol);
    }

    //METODOS POST
    //Registrar
    @PostMapping("/new")
    //Obtener de riquest un objeto del tipo usuario
    public RolDto newRol(@RequestBody RolDto rol){
        return rolservice.save(rol);
    }

    //METODO PUT
    //Actualizar
    @PutMapping("/update")
    //Tomar todo lo que viene en el cuerpo de la peticion
    public RolDto updateRol(@RequestBody RolDto rol){
        //Se retorna un Save de actualizar
        return rolservice.save(rol);
    }

    //METODO DELETE
    //Eliminar
    @DeleteMapping("/delete/{idRol}")
    //Permita obtener ese parametro que llega en la ruta, ademas ese parametro esta asociado a la llave primaria de nuestro Registro Dto 
    public void deleteRol(@PathVariable("idRol") Integer idRol){
        rolservice.delete(idRol);
    }
}
