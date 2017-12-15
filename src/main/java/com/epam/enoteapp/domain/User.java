package com.epam.enoteapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Notebook> notebooks;

    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }
}
