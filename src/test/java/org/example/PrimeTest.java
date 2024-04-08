package org.example;

import org.junit.Assert;

import static org.junit.Assert.*;

public class PrimeTest {

    @org.junit.Test
    public void isPrime() {
        Assert.assertEquals(false, Prime.isPrime(12));
    }
}