package com.MutualAuth.MtlsPracticeService2.Controller;


import com.MutualAuth.MtlsPracticeService2.External.NTMSController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/client")
public class MyController {


    @Autowired
    WebClient webClient;

    @Autowired
    NTMSController ntmsController;


    @GetMapping("/just-data")
    public String justData()
    {
        return "Hii from client!!!";
    }


    @GetMapping("/data")
    public Mono<?> gatherDataFromServer() {

        System.out.println("Sending reqest to server");
        return webClient.get().uri("https://localhost:8000/server/data").retrieve()
                .bodyToMono(String.class);
    }

    @GetMapping("/data-by-feign")
    public String getServerData()
    {
        return ntmsController.getData();
    }
}
