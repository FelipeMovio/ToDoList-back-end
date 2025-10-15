package com.felipemovio.toDoList_backEnd.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Formulario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Forms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Enumerated(EnumType.STRING) //indica que o enum será salvo como texto no banco de dados, e não como número.
    private Categoria Categoria;

    private Integer tempo;

    private boolean isCompleted = false;
}
