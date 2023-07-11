package com.happy.happyvalidation.yezy.constraints.annotations;

import com.happy.happyvalidation.yezy.constraints.Phone010Validator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Phone010 가 붙은 필드는
// 유효성 검사 시
// (010) 또는 010- 으로 시작해야 한다
@Target(ElementType.FIELD) // 어노테이션을 어디에 적용할 것인지
@Retention(RetentionPolicy.RUNTIME) // 어노테이션이 언제까지 유지될 것인지
@Constraint(validatedBy = Phone010Validator.class)
public @interface Phone010 {
    String message() default "not started 010";
    Class<?>[] groups() default {}; //유효성 검사 그룹을 지정
    Class<? extends Payload>[] payload() default {};
}