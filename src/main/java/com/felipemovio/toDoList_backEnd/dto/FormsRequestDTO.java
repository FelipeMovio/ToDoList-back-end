package com.felipemovio.toDoList_backEnd.dto;

import com.felipemovio.toDoList_backEnd.model.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
// essa anotação gera getters setters toString equals e hashcode automaticamente
public class FormsRequestDTO {
    @NotBlank
    //Essa anotação indica que a propriedade (campo) não pode ser nula, vazia, nem conter apenas espaços em branco.
    private String titulo;

    @NotNull
    //Indica que o campo não pode ser null, ou seja, é obrigatório enviar algum valor.
    private Categoria categoria;

    @NotNull
    private Integer tempo;

    private boolean completed;
}

