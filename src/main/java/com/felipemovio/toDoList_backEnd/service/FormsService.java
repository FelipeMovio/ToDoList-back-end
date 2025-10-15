package com.felipemovio.toDoList_backEnd.service;


import com.felipemovio.toDoList_backEnd.dto.FormsRequestDTO;
import com.felipemovio.toDoList_backEnd.dto.FormsResponseDTO;
import com.felipemovio.toDoList_backEnd.model.Forms;
import com.felipemovio.toDoList_backEnd.repository.FormsRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FormsService {

    @Autowired
    private FormsRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public List<FormsResponseDTO> listarTodos() {
        return repository.findAll()
                .stream()
                .map(f -> modelMapper.map(f, FormsResponseDTO.class))
                .collect(Collectors.toList());
    }

//    formsRepository.findAll(): retorna uma lista de entidades Forms (normalmente do banco de dados).
//            .stream(): transforma a lista em um Stream, que permite trabalhar com operações funcionais (como map, filter, etc.).
//            .map(f -> modelMapper.map(f, FormsResponseDTO.class)): para cada objeto Forms, mapeia para um DTO (FormsResponseDTO) usando o ModelMapper.
//            .collect(Collectors.toList()): coleta todos os objetos transformados (DTOs) em uma nova lista e retorna.

    public FormsResponseDTO criar(FormsRequestDTO dto) {
        Forms form = modelMapper.map(dto, Forms.class);
        return modelMapper.map(repository.save(form), FormsResponseDTO.class);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }



}
