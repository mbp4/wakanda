package org.example.wakanda.wifi;

import org.springframework.stereotype.Service;

@Service
public class WifiService {

    public String getWifiStatus() {
        return "La WiFi pública está funcionando correctamente.";
    }
}
