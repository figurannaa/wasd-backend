package wasd_backend.Validators.MinYear;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MinYearValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MinYear {
    String message() default "Birthdate must be after 1910.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    int value();
}
