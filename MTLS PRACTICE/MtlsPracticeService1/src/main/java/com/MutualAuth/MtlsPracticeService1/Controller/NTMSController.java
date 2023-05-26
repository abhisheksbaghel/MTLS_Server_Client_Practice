package com.MutualAuth.MtlsPracticeService1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
public class NTMSController {

    @GetMapping("/data")
    public String getData()
    {
        System.out.println("Returning data from Server data method");
        return "Hello from SERVER data method";
    }
}
