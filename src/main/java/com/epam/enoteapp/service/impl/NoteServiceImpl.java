package com.epam.enoteapp.service.impl;

import com.epam.enoteapp.domain.Note;
import com.epam.enoteapp.repository.NoteRepositroy;
import com.epam.enoteapp.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService {
    private final NoteRepositroy noteRepositroy;

    @Autowired
    public NoteServiceImpl(NoteRepositroy noteRepositroy) {
        this.noteRepositroy = noteRepositroy;
    }

    @Override
    public Note addNotebook(Note note) {
        return noteRepositroy.save(note);
    }

    @Override
    public Note getNotebook(Long id) {
        return noteRepositroy.findOne(id);
    }

    @Override
    public boolean updateNotebook(Note note) {
        if (note != null  && noteRepositroy.exists(note.getId())) {
            noteRepositroy.save(note);
            return true;
        }
        return false;

    }

    @Override
    public void deleteNotebookById(Long id) {
        noteRepositroy.delete(id);
    }
}
