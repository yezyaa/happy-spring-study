package com.happy.happyvalidation.yezy.constraints;

import com.happy.happyvalidation.yezy.constraints.annotations.EmailWhitelist;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.HashSet;
import java.util.Set;

public class EmailWhitelistValidator implements ConstraintValidator<EmailWhitelist, String> {
    // 사용자 지정 유효성 검사를 위해 구현해야하는 인터페이스
    private final Set<String> whiteList;
    public EmailWhitelistValidator() {
        this.whiteList = new HashSet<>();
        this.whiteList.add("gmail.com");
        this.whiteList.add("naver.com");
        this.whiteList.add("kakao.com");
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // 유효한 값일 때 true 반환
        // 유효하지 않은 값일 때 false 반환
        String[] split = value.split("@");
        String domain = split[split.length - 1];
        // Set whiteList에 domain이 추가되어 있는지
        return whiteList.contains(domain);
    }
}