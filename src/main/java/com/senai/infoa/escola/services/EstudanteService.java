package com.senai.infoa.escola.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.senai.infoa.escola.repositories.EstudanteRepository;

@Service
public class EstudanteService {
    
    @Autowired //injeção de dependência
    private EstudanteRepository estudanteRepository;
    public Long contador(){
        return estudanteRepository.count();
    }

}
