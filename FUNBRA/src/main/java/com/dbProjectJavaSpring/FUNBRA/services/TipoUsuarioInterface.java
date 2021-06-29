package com.dbProjectJavaSpring.FUNBRA.services;

import java.util.List;

import com.dbProjectJavaSpring.FUNBRA.dto.TipoUsuarioDto;

public interface TipoUsuarioInterface {
   
    //Entity a la que se va a hacer referenciar para realizar las operaciones CRUD y en este caso no es la entity TipoUsuario sino a la Dto -> Elemento para sacar diplicados de las clases y sobre las cuales se trabajaran con las interfaces para la CRUD (acceder datos)

    public TipoUsuarioDto save(TipoUsuarioDto tipousuario); // Registrar y Actualizar
    public List<TipoUsuarioDto> getAll(); //Consulta General
    public TipoUsuarioDto get(Integer idTipoUsuario); //Consulta registro por Id a la Entity->Dto
    public void delete(Integer idTipoUsuario); //Eliminacion de un registro
}
