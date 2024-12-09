package org.example.wakanda.educacion;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.*;

import java.util.concurrent.*;

@Configuration
@EnableDiscoveryClient
public class EducationConfig {

    @Bean
    public ExecutorService educationExecutorService() {
        return Executors.newFixedThreadPool(5);
    }
}
