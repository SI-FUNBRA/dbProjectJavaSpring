package com.dbProjectJavaSpring.FUNBRA.forms;

import java.util.List;

import com.dbProjectJavaSpring.FUNBRA.dto.RolDto;
import com.dbProjectJavaSpring.FUNBRA.dto.TipoUsuarioDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor 
@AllArgsConstructor
@Getter @Setter
public class RolForm {

    private RolDto rol;
    private TipoUsuarioDto tusuario;
    private List<TipoUsuarioDto> ltusuario;
}
