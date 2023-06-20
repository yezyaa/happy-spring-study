package com.happy.happyhttp.yezy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class HeaderController {
    // `header-one`으로 들어온 HTTP 요청에 대하여
    // 헤더 중 `x-likelion` 이라는 헤더의 값을 인자로 전달받고 싶을 때
    @PostMapping("/header-one")
    public String getHeader(
            @RequestHeader(
                    "x-likelion"
            ) String header
    ) {
        log.info("POST /header-one header: " + header);
        return "index";
    }

    // `header-optional`으로 들어온 HTTP 요청에 대하여
    // 헤더 중 `x-likelion` 이 있으면 할당, 없으면 null로 받고 싶을 때
    @PostMapping("/header-optional")
    public String getHeaderOptional(
            @RequestHeader(
                    value = "x-likelion",
                    required = true
                    // false: 있어도 되고 없어도 된다. 라는 뜻
                    // true: 없으면 400 error
            ) String header  // Optional<String>
    ) {
        log.info("POST /header-optional header: " + header);
        return "index";
    }

    // `header-type`으로 들어온 HTTP 요청에 대하여
    // 헤더 중 `x-likelion-int`가 있으면 Integer에 할당
    @PostMapping("/header-type")
    public String getHeaderInteger(
            @RequestHeader(value = "x-likelion-int")
            Integer header
    ) {
        log.info("POST /header-type header: " + header);
        return "index";
    }

    // `header-all`로 들어온 HTTP 요청의
    // 모든 헤더를 확인하고 싶을 때
    @PostMapping("/header-all")
    public String getHeaderAll(
            // 모든 헤더를 다 가져올 때
            @RequestHeader
            HttpHeaders headers,
            @RequestHeader
            Map<String, String> headerMap, // 첫번째 값만 할당받을 수 있음
            @RequestHeader
            MultiValueMap<String, String> headerMvMap // 복수개일 경우 List로 할당
    ) {
        headers.forEach((key, value) -> log.warn(String.format("%s: %s, %s", key, value, value.getClass())));
        headerMap.forEach((key, value) -> log.warn(String.format("%s: %s, %s", key, value, value.getClass())));
        headerMvMap.forEach((key, value) -> log.warn(String.format("%s: %s, %s", key, value, value.getClass())));
        log.info("POST /header-all");
        return "index";
    }
}
