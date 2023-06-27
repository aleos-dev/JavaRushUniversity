package ua.javarush.task.jdk13.task38.task3802;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
public @interface Ticket {
    Priority priority() default Priority.MEDIUM;
    String[] tags();
    String createdBy() default "Amigo";
    enum Priority {
        LOW,
        MEDIUM,
        HIGH;
    }

}
