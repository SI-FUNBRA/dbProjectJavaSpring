package com.dbProjectJavaSpring.FUNBRA.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonacionEconomicaRepository extends JpaRepository<DonacionEconomica, Integer> {
    
}
