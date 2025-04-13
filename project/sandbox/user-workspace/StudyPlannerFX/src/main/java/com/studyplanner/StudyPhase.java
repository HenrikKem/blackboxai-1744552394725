package com.studyplanner;

public class StudyPhase {
    private String phaseName; // e.g., Reading, Flashcards, Exercises, Review
    private int duration; // Duration in minutes

    public StudyPhase(String phaseName, int duration) {
        this.phaseName = phaseName;
        this.duration = duration;
    }

    // Getters and setters
    public String getPhaseName() { return phaseName; }
    public int getDuration() { return duration; }

    public void setPhaseName(String phaseName) { this.phaseName = phaseName; }
    public void setDuration(int duration) { this.duration = duration; }
}
