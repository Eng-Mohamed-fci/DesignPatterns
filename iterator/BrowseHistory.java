package com.mowithmosh.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        if (urls.size()==1)
            return urls.get(0);
        int lastIndex = urls.size()-1;
        return urls.get(lastIndex);
    }

    public List<String> getUrls() {
        return urls;
    }

    public Iterator createIterator() {
        return new listIterator(this);
    }

    private class listIterator implements Iterator{
        BrowseHistory history;
        int index = 0;
        public listIterator (BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
