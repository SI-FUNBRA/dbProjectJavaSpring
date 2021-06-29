// package com.dbProjectJavaSpring.FUNBRA;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import com.dbProjectJavaSpring.FUNBRA.model.TipoUsuario;
// import com.dbProjectJavaSpring.FUNBRA.model.TipoUsuarioRepository;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
// import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
// import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

// //Marca la clase como una CLASE DE TESTEO "orientada a la (Data)"
// @DataJpaTest
// //Permite que no sean remplazados los datos que se van a ser testeados sobre la base de datos ya que esto es solo un test para saber si esta todo correcto
// @AutoConfigureTestDatabase(replace=Replace.NONE)
// public class TipoUsuarioRepositoryTest {
    
//     //Permite relacion de la clase con el repo trabajado 
//     @Autowired
//     //Repositorio especifico sobre el cual se van a realizar las pruebas
//     TipoUsuarioRepository repoTipoU;

//     //Anotacion que indica el inicio para la prueba del testeo
//     @Test
//     //Un testeo para verificar si se pueden insertar datos
//     public void TipoUTest(){
//         //Insertar datos sobre la entity
//         TipoUsuario tipoU1=new TipoUsuario("Gerente");
//         TipoUsuario tipoU2=new TipoUsuario("Administrador");
//         TipoUsuario tipoU3=new TipoUsuario("Participante");

//         //Uso metodos, para guardar los datos hacia el testeo
//         repoTipoU.save(tipoU1);
//         repoTipoU.save(tipoU2);
//         repoTipoU.save(tipoU3);

//         //Metodo Flush -> Generar elementos "temporales" para las pruebas
//         repoTipoU.flush();

//         //Metodo para realizar las pruebas, dados por la libreria de Junit
//         assertEquals(3, repoTipoU.findAll().size());
//     }
// }
