package com.felipemovio.toDoList_backEnd.dto;

import com.felipemovio.toDoList_backEnd.model.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class FormsRequestDTO {
    @NotBlank
    private String titulo;

    @NotNull
    private Categoria categoria;

    @NotNull
    private Integer tempo;

    private boolean completed;
}

