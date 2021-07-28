package com.example;

import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client(value = "/")
public interface MyClient {
    @Post("sample")
    String sample();
}