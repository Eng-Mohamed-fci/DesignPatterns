package com.mowithmosh.decerator;

public class CompressedCloudStream implements Stream{
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressedData = compress(data);
        stream.write(compressedData);
    }

    private String compress(String data) {
        return data.substring(0,5);
    }
}
