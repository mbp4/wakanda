package org.example.wakanda.residuos;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.*;

import java.util.concurrent.*;

@Configuration
@EnableDiscoveryClient
public class WasteConfig {

    @Bean
    public ExecutorService wasteExecutorService() {
        return Executors.newFixedThreadPool(5);
    }
}
