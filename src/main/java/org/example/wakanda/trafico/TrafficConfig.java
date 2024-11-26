package org.example.wakanda.trafico;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.*;

import java.util.concurrent.*;

@Configuration
@EnableDiscoveryClient
public class TrafficConfig {

    @Bean
    public ExecutorService executorService() {
        return Executors.newFixedThreadPool(5);
    }
}
