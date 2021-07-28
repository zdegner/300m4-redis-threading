package com.example;

import io.micronaut.cache.annotation.Cacheable;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.context.ServerRequestContext;
import reactor.core.publisher.Mono;

@Controller
public class MyController {
    @Get("sample")
    public Mono<String> sample() {
        return getFromCache()
                .map((cachedValue) -> {
                    String requestPresence = ServerRequestContext.currentRequest().isPresent() ? "request is present" : "request is NOT present";

                    return requestPresence + ":" + Thread.currentThread().getName();
                });
    }

    @Cacheable("sample-cache")
    public Mono<String> getFromCache() {
        return Mono.just("sample");
    }
}
