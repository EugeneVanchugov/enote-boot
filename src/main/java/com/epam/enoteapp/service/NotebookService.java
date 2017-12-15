package com.epam.enoteapp.service;

import com.epam.enoteapp.domain.Notebook;

public interface NotebookService {

    Notebook addNotebook(Notebook notebook);

    Notebook getNotebook(Long id);

    boolean updateNotebook(Notebook notebook);

    void deleteNotebookById(Long id);
}
