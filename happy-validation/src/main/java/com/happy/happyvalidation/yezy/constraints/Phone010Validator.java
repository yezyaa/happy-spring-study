package com.happy.happyvalidation.yezy.constraints;

import com.happy.happyvalidation.yezy.constraints.annotations.Phone010;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class Phone010Validator implements ConstraintValidator<Phone010, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context)
    {
        // 010-
        boolean withDash = value.startsWith("010-");
        // (010)
        boolean withPar = value.startsWith("(010)");
        return withDash || withPar;
    }
}