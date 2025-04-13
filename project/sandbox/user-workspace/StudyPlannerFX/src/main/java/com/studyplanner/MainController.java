package com.studyplanner;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.List;

public class MainController {
    @FXML private TabPane mainTabPane;
    @FXML private Tab calendarTab;
    @FXML private Tab subjectsTab;
    @FXML private Tab progressTab;
    @FXML private MenuBar menuBar;
    @FXML private Label statusLabel;

    private List<Subject> subjects;
    private List<StudyPhase> studyPhases;

    public void initialize() {
        // Initialize with default study phases
        studyPhases = List.of(
            new StudyPhase("Lesen", 45),
            new StudyPhase("Karteikarten", 30),
            new StudyPhase("Aufgaben", 60),
            new StudyPhase("Wiederholung", 30)
        );
    }

    // Methods for handling user actions
    public void addNewSubject(Subject subject) {
        subjects.add(subject);
        updateStatus("Neues Fach hinzugefügt: " + subject.getName());
    }

    public void generateStudyPlan() {
        // TODO: Implement study plan generation
        updateStatus("Lernplan wird generiert...");
    }

    private void updateStatus(String message) {
        statusLabel.setText(message);
    }
}
