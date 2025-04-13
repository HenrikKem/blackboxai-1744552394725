package com.studyplanner;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StudyPlanGeneratorTest {
    @Test
    void testGeneratePlan() {
        List<Subject> subjects = new ArrayList<>(List.of(
            new Subject("Mathematik", LocalDate.now().plusDays(14), 4, 20),
            new Subject("Programmierung", LocalDate.now().plusDays(7), 3, 15),
            new Subject("Datenbanken", LocalDate.now().plusDays(21), 2, 10)
        ));
        List<String> plan = StudyPlanGenerator.generatePlan(subjects, 2);
        
        assertNotNull(plan);
        assertFalse(plan.isEmpty(), "Generated plan should not be empty");
        assertEquals(3, plan.size(), "Plan should contain one entry per subject");
        // Either Mathematik or Programmierung should come first (both have priority 1)
        assertTrue(plan.get(0).contains("Programmierung") || plan.get(0).contains("Mathematik"));
    }
}
