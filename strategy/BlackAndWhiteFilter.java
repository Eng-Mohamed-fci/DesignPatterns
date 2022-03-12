package com.mowithmosh.strategy;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply() {
        System.out.println("Filering using BlackAndWhiteFilter");
    }
}
