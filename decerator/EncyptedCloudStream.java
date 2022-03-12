package com.mowithmosh.decerator;

public class EncyptedCloudStream implements Stream{
    private Stream stream;

    public EncyptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data) {
        return "#@%#%#^@$^%$#@";
    }
}
