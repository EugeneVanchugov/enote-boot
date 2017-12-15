package com.epam.enoteapp.repository;

import com.epam.enoteapp.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepositroy extends JpaRepository<Note, Long>{
}
