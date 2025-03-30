package com.k1ts.check.taskcheckservice.year_2024.course_3.cpp.practice_10;

import com.k1ts.check.taskcheckservice.DefaultTaskCheckServiceTests;
import com.k1ts.check.taskcheckservice.TaskCheckService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class Year2024Course3CppPractice10Task1CheckServiceTests extends DefaultTaskCheckServiceTests {
    @Autowired
    private ApplicationContext applicationContext;

    @PostConstruct
    public void init() {
        taskCheckService = applicationContext.getBean("year-2024-course-3-cpp-practice-10-task-1", TaskCheckService.class);

        addCorrectTestCase("""
                public class Program {
                   \s
                    public String getDayType(String day) {
                       \s
                        return switch (day) {
                            case "Saturday", "Sunday" -> "Weekend";
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
                            default -> "Invalid day";
                        };
                    }
                }
                """);

        addIncorrectTestCase("""
                public class Program {
                   \s
                    public String getDayType(String day) {
                       \s
                        return switch (day) {
                            case "Saturday", "Sunday" -> "Weekend";
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekend";
                            default -> "Invalid day";
                        };
                    }
                }
                """);

        addIncorrectTestCase("""
                public class Program {
                   \s
                    public String getDayType(String day) {
                       \s
                        return switch (day) {
                            case "Saturday", "Sunday" -> "Weekday";
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
                            default -> "Invalid day";
                        };
                    }
                }
                """);
    }
}
