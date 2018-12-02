package com.organizer_project.DTO;

import java.util.Date;

public class NoteDTO {

    private int noteId;
    private String noteBody;
    private Date lastModify;

    //NoteId
    public int getNoteId() {
        return noteId;
    }
    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    //Notebody
    public String getNoteBody() {
        return noteBody;
    }
    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }

    //LastModify
    public Date getLastModify() {
        return lastModify;
    }
    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }
}
