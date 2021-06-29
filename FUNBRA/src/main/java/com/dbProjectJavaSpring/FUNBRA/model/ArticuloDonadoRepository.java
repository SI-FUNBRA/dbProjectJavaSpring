package com.dbProjectJavaSpring.FUNBRA.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloDonadoRepository extends JpaRepository<ArticuloDonado, Integer> {
    
}
