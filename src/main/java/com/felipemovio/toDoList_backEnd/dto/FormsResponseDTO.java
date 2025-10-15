package com.felipemovio.toDoList_backEnd.dto;

import com.felipemovio.toDoList_backEnd.model.Categoria;
import lombok.Data;

@Data
public class FormsResponseDTO {
    private Long id;
    private String titulo;
    private Categoria categoria;
    private Integer tempo;
    private boolean isCompleted;
}
