package org.example.wakanda.ocio;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.*;

import java.util.concurrent.*;

@Configuration
@EnableDiscoveryClient
public class OcioConfig {
    @Bean
    public ExecutorService ocioExecutorService() {
        return Executors.newFixedThreadPool(5);
    }
}
