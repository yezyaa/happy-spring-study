//package com.happy.happyvalidation.chaeyeon.contraints.annotations;
//
//import com.happy.happyvalidation.chaeyeon.contraints.EmailWhitelistValidator;
//import jakarta.validation.Constraint;
//import jakarta.validation.Payload;
//
//import java.lang.annotation.*;
//
//public @interface EmailWhiteList {
//    @Target({ElementType.FIELD})
//    @Retention(RetentionPolicy.RUNTIME)
//    @Constraint(validatedBy = EmailWhitelistValidator.class)
//    public @interface EmailWhitelist {
//        String message() default "Email not in whitelist";
//        Class<?>[] groups() default {};
//        Class<? extends Payload>[] payload() default {};
//    }
//}
