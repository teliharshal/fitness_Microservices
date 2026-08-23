package com.fitness.ActivityService.config;

import org.springframework.cloud.client.loadbalancer.reactive.ReactorLoadBalancerExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient userServiceWebClient(
            ReactorLoadBalancerExchangeFilterFunction lbFunction) {

        return WebClient.builder()
                .baseUrl("http://USERSERVICE")
                .filter(lbFunction)
                .build();
    }
}