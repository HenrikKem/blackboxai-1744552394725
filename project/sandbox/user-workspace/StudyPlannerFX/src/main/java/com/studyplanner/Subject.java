package com.studyplanner;

import java.time.LocalDate;

public class Subject {
    private String name;
    private LocalDate examDate;
    private int difficulty; // 1-5 scale
    private int estimatedStudyHours;

    public Subject(String name, LocalDate examDate, int difficulty, int estimatedStudyHours) {
        this.name = name;
        this.examDate = examDate;
        this.difficulty = difficulty;
        this.estimatedStudyHours = estimatedStudyHours;
    }

    // Getters and setters
    public String getName() { return name; }
    public LocalDate getExamDate() { return examDate; }
    public int getDifficulty() { return difficulty; }
    public int getEstimatedStudyHours() { return estimatedStudyHours; }

    public void setName(String name) { this.name = name; }
    public void setExamDate(LocalDate examDate) { this.examDate = examDate; }
    public void setDifficulty(int difficulty) { this.difficulty = difficulty; }
    public void setEstimatedStudyHours(int estimatedStudyHours) { this.estimatedStudyHours = estimatedStudyHours; }
}
