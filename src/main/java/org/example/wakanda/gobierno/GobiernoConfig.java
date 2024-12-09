package org.example.wakanda.gobierno;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.*;

import java.util.concurrent.*;

@Configuration
@EnableDiscoveryClient
public class GobiernoConfig {

    @Bean
    public ExecutorService gobiernoExecutorService(){
        return Executors.newFixedThreadPool(5);
    }

}
