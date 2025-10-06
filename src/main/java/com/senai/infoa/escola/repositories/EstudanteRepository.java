package com.senai.infoa.escola.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.infoa.escola.models.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Integer>{

    
}
