package com.nik.formtagsvalidations.valdations;

import org.springframework.validation.annotation.Validated;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeContrraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
public @interface CourseCode{

    public String value() default "NIK";

    public String message() default "Course code has to start with NIK";

    public Class<? extends Payload>[] payload() default {};

    public Class<?>[] groups() default {};

}
