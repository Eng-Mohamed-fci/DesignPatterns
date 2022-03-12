package com.mowithmosh.builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<Slide> slideList = new ArrayList<>();

    public void addSlide(Slide slide) {
        slideList.add(slide);
    }

    public void export(PresentationBuilder builder) {
        builder.addSlide(new Slide("Copyright"));
        for (var slide : slideList)
            builder.addSlide(slide);
    }
}
