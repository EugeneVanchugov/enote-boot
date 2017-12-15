package com.epam.enoteapp.service.impl;

import com.epam.enoteapp.domain.Notebook;
import com.epam.enoteapp.repository.NotebookRepository;
import com.epam.enoteapp.service.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotebookServiceImpl implements NotebookService {

    private final NotebookRepository notebookRepository;

    @Autowired
    public NotebookServiceImpl(NotebookRepository notebookRepository) {
        this.notebookRepository = notebookRepository;
    }

    @Override
    public Notebook addNotebook(Notebook notebook) {
        return notebookRepository.save(notebook);
    }

    @Override
    public Notebook getNotebook(Long id) {
        return notebookRepository.findOne(id);
    }

    @Override
    public boolean updateNotebook(Notebook notebook) {
        if (notebook != null  && notebookRepository.exists(notebook.getId())) {
            notebookRepository.save(notebook);
            return true;
        }
        return false;
    }

    @Override
    public void deleteNotebookById(Long id) {
        notebookRepository.delete(id);
    }
}
