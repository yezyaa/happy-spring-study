package com.happy.happyvalidation.yezy.constraints.annotations;

import com.happy.happyvalidation.yezy.constraints.EmailWhitelistValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
//@Documented
@Constraint(validatedBy = EmailWhitelistValidator.class)
public @interface EmailWhitelist {
    String message() default "Email not in whitelist";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
