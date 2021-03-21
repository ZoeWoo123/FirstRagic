package com.sded.zoetest.domain;

import java.util.Arrays;

public class Record {
    private int id;
    private Candidate candidate;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Candidate getCandidates() {
        return candidate;
    }
    public void setCandidates(Candidate candidate) {
        this.candidate = candidate;
    }

    @Override
    public String toString() {
        return "Record [id=" + id + ", candidates=" + candidate + "]";
    }
}
