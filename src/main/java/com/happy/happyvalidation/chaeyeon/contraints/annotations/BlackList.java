package com.happy.happyvalidation.chaeyeon.contraints.annotations;

import com.happy.happyvalidation.chaeyeon.contraints.EmailBlacklistValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailBlacklistValidator.class)
public @interface BlackList {
    String message() default "username in blacList";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    // 추가 Element를 작성
    String[] blacklist() default {};
}
