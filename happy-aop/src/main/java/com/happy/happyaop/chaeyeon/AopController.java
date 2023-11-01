//package com.happy.happyaop.chaeyeon;
//
//import com.happy.happyaop.chaeyeon.aspect.LogArguments;
//import com.happy.happyaop.chaeyeon.aspect.LogExecutionTime;
//import com.happy.happyaop.chaeyeon.dto.ResponseDto;
//import com.happy.happyaop.chaeyeon.dto.UserDto;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@Slf4j
//@RestController
//@RequiredArgsConstructor
//public class AopController {
//    @PostMapping("/users")
//    @LogArguments
//    @LogExecutionTime
//    public ResponseDto addUser(@RequestBody UserDto user) {
//        log.info("addUser 호출됨");
//        ResponseDto response = new ResponseDto();
//        response.setMessage("addUser");
//        return response;
//    }
//
//    @GetMapping("/users")
//    @LogExecutionTime
//    public ResponseDto getUsers() {
//        long start = System.currentTimeMillis();
//        try {
//            ResponseDto response = new ResponseDto();
//            response.setMessage("addUser");
//            return response;
//        } finally {
//            log.info("elapse: {}", System.currentTimeMillis() - start);
//        }
//    }
//}
