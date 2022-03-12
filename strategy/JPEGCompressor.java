package com.mowithmosh.strategy;

public class JPEGCompressor implements Compressor{
    @Override
    public void compress() {
        System.out.println("Compressing using JPEG");
    }
}
