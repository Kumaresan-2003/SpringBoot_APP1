package com.example.Note_taking_app.Repository;

import com.example.Note_taking_app.Model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
