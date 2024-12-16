package org.example.wakanda.vigilancia;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.*;

import java.util.concurrent.*;

@Configuration
@EnableDiscoveryClient
public class VigilanciaConfig {

    @Bean
    public ExecutorService vigilanciaExecutorService() {
        return Executors.newFixedThreadPool(5);
    }

}
