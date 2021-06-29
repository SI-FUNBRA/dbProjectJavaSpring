package com.dbProjectJavaSpring.FUNBRA.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class RolDto {
    
    //Atributos
    private int idRol;
    private String nombreRol;
    private int idTipoUsuarioFK;
    private TipoUsuarioDto tipoUsuario;
}
