package com.dbProjectJavaSpring.FUNBRA.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*Con la ayuda de lombok ya no sera necesario escribir
  muchas veces los constructores o los getters and setters sino que 
  con las siguientes anotaciones sera solucionado */

//Metodo Constructor Vacio
@NoArgsConstructor
//Metodo Constructor
@AllArgsConstructor
//Getters and Setters
@Getter @Setter
public class TipoUsuarioDto {

    //Atributos
    private int idTipoUsuario;
    private String nombreTipoUsuario;

    // //Metodo Constructor Vacio
    // public TipoUsuarioDto() {
    // }

    // //Metodo Constructor
    // public TipoUsuarioDto(int idTipoUsuario, String nombreTipoUsuario) {
    //     this.idTipoUsuario = idTipoUsuario;
    //     this.nombreTipoUsuario = nombreTipoUsuario;
    // }

    // //Getters and Setters
    // public int getIdTipoUsuario() {
    //     return idTipoUsuario;
    // }
    // public void setIdTipoUsuario(int idTipoUsuario) {
    //     this.idTipoUsuario = idTipoUsuario;
    // }
    // public String getNombreTipoUsuario() {
    //     return nombreTipoUsuario;
    // }
    // public void setNombreTipoUsuario(String nombreTipoUsuario) {
    //     this.nombreTipoUsuario = nombreTipoUsuario;
    // }  
}
