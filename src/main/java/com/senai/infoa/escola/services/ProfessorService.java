package com.senai.infoa.escola.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.infoa.escola.models.Professor;
import com.senai.infoa.escola.repositories.ProfessorRepository;

@Service
public class ProfessorService {
    
    @Autowired //injeção de dependência
    private ProfessorRepository professorRepository;
    public Long contador(){
        return professorRepository.count();
    }

    public void deletar(Integer id){
        professorRepository.deleteById(id);
    }

    public Professor salvarProfessor(Professor professor){
        return professorRepository.save(professor);
    }

    public boolean delete(Integer id){
        Professor professor = professorRepository.findById(id).get();
        if(professor != null) {
            professorRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Professor salvar(Professor professor){
        return professorRepository.save(professor);
    }

    public Professor buscarPorId(Integer id){
        return professorRepository.findById(id).get();
    }

    public List<Professor> listarTodos(){
        return professorRepository.findAll();
    }

    //primeira opção incomum
    public Professor atualizar(Professor professor, Integer id){
        //Trazer o método de cima 'buscarPorId' ára substituir uma linha
        Professor e = buscarPorId(id);
        if (e != null){
            //deleta o antigo e salva o novo
            professor.setId(id); // mantém o id antigo
            return professorRepository.save(professor);
        }
        return null;
    }
}
