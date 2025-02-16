package wasd_backend.Validators.MinYear;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;

public class MinYearValidator implements ConstraintValidator<MinYear, LocalDate> {
    private int minYear;

    @Override
    public void initialize(MinYear constraintAnnotation) {
        this.minYear = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(LocalDate birthdate, ConstraintValidatorContext context) {
        return birthdate == null || birthdate.getYear() >= minYear;
    }
}
