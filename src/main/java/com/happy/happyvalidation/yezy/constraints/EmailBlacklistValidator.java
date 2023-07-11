package com.happy.happyvalidation.yezy.constraints;

import com.happy.happyvalidation.yezy.constraints.annotations.EmailBlacklist;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.HashSet;
import java.util.Set;

public class EmailBlacklistValidator implements ConstraintValidator<EmailBlacklist, String> {
    private Set<String> blacklist;

    @Override
    public void initialize(EmailBlacklist constraintAnnotation) {
        blacklist = new HashSet<>();
        for (String target: constraintAnnotation.blacklist()) {
            blacklist.add(target);
        }
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // this.blacklist 안에 value가 있으면 실패
        return !this.blacklist.contains(value);
    }
}
