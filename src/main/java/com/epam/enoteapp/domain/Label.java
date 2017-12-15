package com.epam.enoteapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Label implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "labels")
    private Set<Note> notes;

    public boolean addNote(Note note) {
        return notes.add(note);
    }
}
