package com.felipemovio.toDoList_backEnd.controller;


import com.felipemovio.toDoList_backEnd.dto.FormsRequestDTO;
import com.felipemovio.toDoList_backEnd.dto.FormsResponseDTO;
import com.felipemovio.toDoList_backEnd.service.FormsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/forms")
public class FormsController {

    @Autowired
    private FormsService formsService;

    @GetMapping
    public List<FormsResponseDTO> listarTodos() {
        return formsService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<FormsResponseDTO> criar(@RequestBody FormsRequestDTO dto) {
        return ResponseEntity.ok(formsService.criar(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FormsResponseDTO> atualizar(
            @PathVariable Long id,
            @RequestBody @Valid FormsRequestDTO dto) throws Exception {
        FormsResponseDTO atualizado = formsService.atualizar(id, dto);
        return ResponseEntity.ok(atualizado);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        formsService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
