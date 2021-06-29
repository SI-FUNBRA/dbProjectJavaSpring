// package com.dbProjectJavaSpring.FUNBRA;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import com.dbProjectJavaSpring.FUNBRA.model.Rol;
// import com.dbProjectJavaSpring.FUNBRA.model.RolRepository;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
// import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
// import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

// @DataJpaTest
// @AutoConfigureTestDatabase(replace=Replace.NONE)
// public class RolRepositoryTest {

//     @Autowired
//     RolRepository repoRol;

//     @Test
//     public void RolTest(){
//         Rol r1=new Rol("Adoptante");
//         Rol r2=new Rol("Donante");

//         repoRol.save(r1);
//         repoRol.save(r2);

//         repoRol.flush();

//         assertEquals(2, repoRol.findAll().size());
//     }
// }
