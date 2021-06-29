package com.dbProjectJavaSpring.FUNBRA.services;

import java.util.List;

import com.dbProjectJavaSpring.FUNBRA.dto.RolDto;

public interface RolInterface {

    public RolDto save(RolDto Rol); //Registrar y Actualizar
    public List<RolDto> getAll(); // Consulta General
    public RolDto get(Integer idRol); //Consulta registro por Id a la Entity->Dto
    public void delete(Integer idRol); //Eliminacion de un registro
}
