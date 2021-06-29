package com.dbProjectJavaSpring.FUNBRA;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Permite trabajar de foma externa de manera general
public class FunbraConfiguration {
    
    //Es un conjunto de objetos y elementos que permiten realizar el proceso de mapeo que se va a estar configurando 
    @Bean
    //(Donde el modelMapper define todo el mapeo entre la clase copia (Dto) y el entity)
    public ModelMapper modelMapper(){
        //Generar Mapas
        return new ModelMapper();
    }
}
