//Implementa la intefaz que se creo (TipoUsuarioInterface)
package com.dbProjectJavaSpring.FUNBRA.services;

import java.util.List;
import java.util.stream.Collectors;

import com.dbProjectJavaSpring.FUNBRA.dto.TipoUsuarioDto;
import com.dbProjectJavaSpring.FUNBRA.model.TipoUsuario;
import com.dbProjectJavaSpring.FUNBRA.model.TipoUsuarioRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoUsuarioIMS implements TipoUsuarioInterface {

    //Para acceder/usar al repositorio 
    @Autowired
    private TipoUsuarioRepository repoTipoU;
    //ModelMapper permite acceder a todos los elementos que hay en la entity y hacer de la copia (Dto) una copia funcional. 

    //Para acceder/usar el ModelMapper en el metodo Listar.
     @Autowired
     private ModelMapper modelMapper;
    

    @Override
    public TipoUsuarioDto save(TipoUsuarioDto tipousuario) {
        //                  = Mapear y almacenar todo el contenido en un mapa  
        //                                   -> Como se va a refereciar ese dato
        //                                   Se le asigna | Lo que se va a mapear
        //                                   un nombre    | En una clase ya creada
        TipoUsuario tuEntity=modelMapper.map(tipousuario, TipoUsuario.class);
        repoTipoU.save(tuEntity);
        // Rederigira los datos que tiene la entity a el Dto
        //     enviar la entity a el Dto para que los contenga                         
        return modelMapper.map(tuEntity, TipoUsuarioDto.class);
    }

    @Override
    public List<TipoUsuarioDto> getAll() {
        //                            = Se usa el repo para acceder a la operacion de consulta y ///                              traer los datos
        List<TipoUsuario> listTuEntity=repoTipoU.findAll();
        //Realizar el mapeo ahora no sobre la entity sino sobre el Dto -> Tabla de copia
        //                            = Guardar la copia de todos los resultados de la Entity
        //                              Teniendo en cuenta que las listas trabajan con colecciones osea los "collect", llevando a una estructora similar a la siguiente: 
        //Lista -> se mapea y luego -> se colecciona
        List<TipoUsuarioDto> listTuDto=listTuEntity.stream()
                                                    .map(role -> modelMapper
                                                    .map(role, TipoUsuarioDto.class))
                                                    .collect(Collectors.toList()); 
        return listTuDto;
    }

    @Override
    public TipoUsuarioDto get(Integer idTipoUsuario) {
        //Realizar proceso consulta
        TipoUsuario tuEntity=repoTipoU.getById(idTipoUsuario);
        //Enviando los resultados de la consulta hecha con el metodo Jpa getById del repositorio guardado temporalmente en una entidad pero mapeada hacia la entidad TipoUsuarioDto para evitar el uso de la capa de persistencia
        TipoUsuarioDto tUto=modelMapper.map(tuEntity, TipoUsuarioDto.class);
        return tUto;
    }

    @Override
    public void delete(Integer idTipoUsuario) {
        repoTipoU.deleteById(idTipoUsuario);
    }   
}
