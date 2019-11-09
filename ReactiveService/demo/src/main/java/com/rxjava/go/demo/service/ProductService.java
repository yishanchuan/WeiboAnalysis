package com.rxjava.go.demo.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.rxjava.go.demo.domain.Product;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService{

    private final Map<String,Product> products=new ConcurrentHashMap<>();

    private Flux<Product> getProducts(){
        return Flux.fromIterable(this.products.values());
    }

    public Flux<Product> getProductsById(final Flux<String> ids){
        return ids.flatMap(id->
            Mono.justOrEmpty(this.products.get(id)));
    }
}