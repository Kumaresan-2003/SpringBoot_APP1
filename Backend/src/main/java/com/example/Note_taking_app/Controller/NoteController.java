package com.example.Note_taking_app.Controller;

import com.example.Note_taking_app.Model.Note;
import com.example.Note_taking_app.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin(origins = "*")
public class NoteController {
    @Autowired
    private NoteRepository noteRepo;

    @GetMapping
    public List<Note> getAllNotes() {
        return noteRepo.findAll();
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteRepo.save(note);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id) {
        noteRepo.deleteById(id);
    }
}
