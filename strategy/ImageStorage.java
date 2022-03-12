package com.mowithmosh.strategy;

public class ImageStorage {

    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress();
        filter.apply();
    }
}
