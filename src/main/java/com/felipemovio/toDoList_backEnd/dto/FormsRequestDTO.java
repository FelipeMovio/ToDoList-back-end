package com.felipemovio.toDoList_backEnd.dto;

import com.felipemovio.toDoList_backEnd.model.Categoria;
import lombok.Data;

@Data
public class FormsRequestDTO {
    private String titulo;
    private Categoria categoria;
    private Integer tempo;
    private boolean isCompleted;
}
