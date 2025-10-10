package com.senai.infoa.escola.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.senai.infoa.escola.models.Professor;
import com.senai.infoa.escola.services.ProfessorService;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class ProfessorController {
    
    @Autowired
    private ProfessorService professorService;

    @GetMapping("/count")
    public Long contador() {
        return professorService.contador();
    }

    @DeleteMapping("/delete/{id}")
    public String deletar(@PathVariable Integer id){
        boolean deletou = professorService.delete(id);
        if(deletou){
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover o usuário";
    }

    @PostMapping("/salvar")
    public Professor salvar(@RequestBody Professor professor) {
        return professorService.salvar(professor);
    }
    
    @GetMapping("/buscar/{id}")
    public Professor buscarPorId(@PathVariable Integer id) {
        return professorService.buscarPorId(id);
    }
    
    @PutMapping("/atualizar/{id}")
    public Professor atualizar(@PathVariable Integer id, @RequestBody Professor professor) {
        return professorService.atualizar(professor, id);
    }

    @GetMapping("/listar")
    public List<Professor> listarTodos() {
        return professorService.listarTodos();
    }
}
