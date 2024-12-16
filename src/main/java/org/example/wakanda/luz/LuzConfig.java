package org.example.wakanda.luz;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
@EnableDiscoveryClient
public class LuzConfig {

    @Bean
    public ExecutorService luzExecutorService() {
        return Executors.newFixedThreadPool(5);
    }
}
