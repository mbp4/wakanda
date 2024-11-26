package org.example.wakanda.wifi;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.*;

import java.util.concurrent.*;

@Configuration
@EnableDiscoveryClient
public class WifiConfig {

    @Bean
    public ExecutorService wifiExecutorService() {
        return Executors.newFixedThreadPool(5);
    }
}
