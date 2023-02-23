package com.example.Sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/message")
    public static String getMessage()
    {
        return "Hello Sri Krishna";
    }


}
