//package com.happy.happyvalidation.chaeyeon.contraints.annotations;
//
//import com.happy.happyvalidation.chaeyeon.contraints.Phone010Validator;
//import jakarta.validation.Constraint;
//import jakarta.validation.Payload;
//
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
//@Target(ElementType.FIELD)
//@Retention(RetentionPolicy.RUNTIME)
//@Constraint(validatedBy = Phone010Validator.class)
//public @interface Phone010 {
//    // Annotation Element
//    String message() default "010으로 시작하지 않음";
//    Class<?>[] groups() default {};
//    Class<? extends Payload>[] payload() default {};
//}
