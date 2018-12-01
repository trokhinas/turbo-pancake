package com.organizer_project.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Note {
    private int noteId;
    private String noteBody;
    private Date lastModify;

    @Id
    @Column(name = "note_id", nullable = false)
    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    @Basic
    @Column(name = "note_body", nullable = true, length = 500)
    public String getNoteBody() {
        return noteBody;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }

    @Basic
    @Column(name = "last_modify", nullable = false)
    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (noteId != note.noteId) return false;
        if (noteBody != null ? !noteBody.equals(note.noteBody) : note.noteBody != null) return false;
        if (lastModify != null ? !lastModify.equals(note.lastModify) : note.lastModify != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noteId;
        result = 31 * result + (noteBody != null ? noteBody.hashCode() : 0);
        result = 31 * result + (lastModify != null ? lastModify.hashCode() : 0);
        return result;
    }
}
