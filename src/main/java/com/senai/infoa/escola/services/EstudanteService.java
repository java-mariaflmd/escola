package com.senai.infoa.escola.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.escola.models.Estudante;
import com.senai.infoa.escola.repositories.EstudanteRepository;

@Service
public class EstudanteService {
    
    @Autowired //injeção de dependência
    private EstudanteRepository estudanteRepository;
    public Long contador(){
        return estudanteRepository.count();
    }

    public void deletar(Integer id){
        estudanteRepository.deleteById(id);
    }

    public Estudante salvar(Estudante estudante){
        return estudanteRepository.save(estudante);
    }

    public boolean delete(Integer id){
        Estudante estudante = estudanteRepository.findById(id).get();
        if(estudante != null) {
            estudanteRepository.deleteById(id);
            return true;
        }
        return false;
    }


}
