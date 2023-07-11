package com.happy.happyvalidation.yezy.dto;

import com.happy.happyvalidation.yezy.constraints.annotations.EmailBlacklist;
import com.happy.happyvalidation.yezy.constraints.annotations.EmailWhitelist;
import com.happy.happyvalidation.yezy.constraints.annotations.Phone010;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private Long id;

    @NotBlank   // 비어있지 않다
    @Size(min = 8, message = "최소 8글자 여야 합니다. (최댓값도 있는데 그거 다 채워넣으시진 못할거라 생각해요.")
    @EmailBlacklist(blacklist = {"malware.good", "trojan.jjang"})
    private String username;
    @Email  // 형식이 이메일이어야 함.
    // 이메일이 지정된 도메인 (gmail.com 등) 이도록
    @EmailWhitelist
    private String email;
    @NotNull    // null이 아니다.
    @Phone010   // 010으로 시작하는 번호 형식인지
    private String phone;

    @NotNull
    @Min(
            value = 14,
            message = "14세 미만은 부모님의 동의가 필요합니다."
    )
    private Integer age;

    @Future(message = "미래의 시간까지 유효해야 합니다") // 미래의 시간만
    private LocalDate validUntil;

    @NotNull    // notNullString이 null이 아닌지만 검증
    private String notNullString;
    @NotEmpty   // notEmptyString이 길이가 0이 아닌지만 검증
    private String notEmptyString;
    @NotBlank   // notBlankString이 공백 문자로만 이뤄지지 않았는지 검증
    private String notBlankString;
}
