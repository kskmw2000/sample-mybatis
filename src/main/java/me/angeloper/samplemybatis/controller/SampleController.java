package me.angeloper.samplemybatis.controller;

import lombok.AllArgsConstructor;
import me.angeloper.samplemybatis.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("retrieve")
    public String retrieve() {
        sampleService.retrieve();
        return "OK";
    }
}
