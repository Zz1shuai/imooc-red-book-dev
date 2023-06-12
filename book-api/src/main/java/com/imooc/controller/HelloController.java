package com.imooc.controller;

import com.imooc.grace.result.GraceJSONResult;
import com.imooc.model.Stu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Create by 猪小帅
 * @date 2023/6/6 23:13
 * @mood happy
 */

@Slf4j
@RestController
public class HelloController {

    @GetMapping("hello")
    public Object hello() {

        Stu stu = new Stu("imooc", 18);
        log.info(stu.toString());
        return GraceJSONResult.ok(stu);
//        return GraceJSONResult.error();
//        return GraceJSONResult.ok("Hello SpringBoot~");
    }
}
