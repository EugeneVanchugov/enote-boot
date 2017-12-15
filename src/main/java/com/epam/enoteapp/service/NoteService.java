package com.epam.enoteapp.service;

import com.epam.enoteapp.domain.Note;

public interface NoteService {

    Note addNotebook(Note note);

    Note getNotebook(Long id);

    boolean updateNotebook(Note note);

    void deleteNotebookById(Long id);
}
