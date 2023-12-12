package com.company.base.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigInteger;
import java.util.Random;

public class GeneratePrimeController {
    @GetMapping("/new-prime")
    public BigInteger generatePrime(){
        BigInteger prime = BigInteger.probablePrime(10000,new Random());
        return prime;
    }
}
