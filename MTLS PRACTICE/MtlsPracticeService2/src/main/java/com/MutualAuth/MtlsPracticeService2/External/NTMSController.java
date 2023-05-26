package com.MutualAuth.MtlsPracticeService2.External;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "server",url = "https://localhost:8000/server")
public interface NTMSController {

    @GetMapping("/data")
    public String getData();
}
