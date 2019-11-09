package com.rxjava.go.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product{
    private String id;
    private String productCode;
    private String productName;
    private String description;
    private Float price;


}