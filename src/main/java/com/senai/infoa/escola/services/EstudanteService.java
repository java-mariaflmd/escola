package com.senai.infoa.escola.services;

import java.util.List;

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

    public Estudante salvarEstudante(Estudante estudante){
        return estudanteRepository.save(estudante);
    }

    public Estudante buscarPorId(Integer id){
        return estudanteRepository.findById(id).get();
    }

    public List<Estudante> listarTodos(){
        return estudanteRepository.findAll();
    }

    //primeira opção incomum
    public Estudante atualizar(Estudante estudante, Integer id){
        //Trazer o método de cima 'buscarPorId' ára substituir uma linha
        Estudante e = buscarPorId(id);
        if (e != null){
            //deleta o antigo e salva o novo
            estudante.setId(id); // mantém o id antigo
            return estudanteRepository.save(estudante);
        }
        return null;
    }
}
