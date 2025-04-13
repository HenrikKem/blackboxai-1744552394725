package com.studyplanner;

import java.util.ArrayList;
import java.util.List;

public class StudyPlanGenerator {
    public static List<String> generatePlan(List<Subject> subjects, int availableHoursPerDay) {
        List<String> plan = new ArrayList<>();
        
        // Calculate priority for each subject
        subjects.sort((s1, s2) -> {
            int priority1 = calculatePriority(s1, availableHoursPerDay);
            int priority2 = calculatePriority(s2, availableHoursPerDay);
            return Integer.compare(priority2, priority1); // Higher priority first
        });

        // Debug: Log calculated priorities
        for (Subject subject : subjects) {
            int priority = calculatePriority(subject, availableHoursPerDay);
            System.out.println("Subject: " + subject.getName() + ", Priority: " + priority);
        }
        
        // Generate study plan based on sorted subjects
        for (Subject subject : subjects) {
            plan.add("Fach: " + subject.getName() + " - Geplante Lernstunden: " + subject.getEstimatedStudyHours());
        }
        
        return plan;
    }

    private static int calculatePriority(Subject subject, int availableHoursPerDay) {
        int daysUntilExam = (int) (subject.getExamDate().toEpochDay() - java.time.LocalDate.now().toEpochDay());
        return (subject.getDifficulty() * 2 + subject.getEstimatedStudyHours() / availableHoursPerDay) / daysUntilExam;
    }
}
