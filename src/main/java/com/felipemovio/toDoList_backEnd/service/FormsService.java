package com.felipemovio.toDoList_backEnd.service;


import com.felipemovio.toDoList_backEnd.model.Forms;
import com.felipemovio.toDoList_backEnd.repository.FormsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FormsService {

    @Autowired
    private FormsRepository repository;

    public List<Forms> listarTodos(){
        return repository.findAll();
    }

    public void Criar(Forms forms){
         repository.save(forms);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }



}
