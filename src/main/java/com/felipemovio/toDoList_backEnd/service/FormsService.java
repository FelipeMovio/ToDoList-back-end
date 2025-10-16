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


    public FormsResponseDTO atualizar(Long id, FormsRequestDTO dto) throws Exception {
        Forms form = repository.findById(id)
                .orElseThrow(() -> new Exception("Formulário não encontrado com ID: " + id));

        // Mapeia apenas os campos necessários do DTO para a entidade (sem tocar no ID)
        form.setTitulo(dto.getTitulo());
        form.setCategoria(dto.getCategoria());
        form.setTempo(dto.getTempo());
        form.setCompleted(dto.isCompleted());

        Forms atualizado = repository.save(form);

        return modelMapper.map(atualizado, FormsResponseDTO.class);
    }


    public void deletar(Long id){
        repository.deleteById(id);
    }



}
