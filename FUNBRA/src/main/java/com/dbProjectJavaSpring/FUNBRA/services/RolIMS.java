package com.dbProjectJavaSpring.FUNBRA.services;

import java.util.List;
import java.util.stream.Collectors;

import com.dbProjectJavaSpring.FUNBRA.dto.RolDto;
import com.dbProjectJavaSpring.FUNBRA.model.Rol;
import com.dbProjectJavaSpring.FUNBRA.model.RolRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolIMS implements RolInterface {

    @Autowired
    private RolRepository repoRol;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public RolDto save(RolDto Rol) {
        Rol rolEntity=modelMapper.map(Rol, Rol.class);
        repoRol.save(rolEntity);
        return modelMapper.map(rolEntity, RolDto.class);
    }

    //Listar
    @Override
    public List<RolDto> getAll() {
        List<Rol> listrolEntity=repoRol.findAll();
        List<RolDto> listrolDto=listrolEntity.stream()
                                             .map(role -> modelMapper
                                             .map(role, RolDto.class))
                                             .collect(Collectors.toList());
        return listrolDto;
    }

    @Override
    public RolDto get(Integer idRol) {
        Rol rolEntity=repoRol.getById(idRol);
        RolDto rolDto=modelMapper.map(rolEntity, RolDto.class);
        return rolDto;
    }

    @Override
    public void delete(Integer idRol) {
        repoRol.deleteById(idRol);
    }
}
