package com.re.common_api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
