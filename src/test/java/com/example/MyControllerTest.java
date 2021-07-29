package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
class MyControllerTest {

    @Inject
    MyClient client;

    @Test
    void testSampleEndpoint(){
        String threadName = client.sample();
        System.out.println(threadName);
        Assertions.assertTrue(threadName.contains("request is present"));
    }
}
