package com.mowithmosh.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String,Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook) {
        ebooks.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String name) {
        if (!ebooks.containsKey(name))
            System.out.println("not found");
        else
            ebooks.get(name).show();
    }
}
