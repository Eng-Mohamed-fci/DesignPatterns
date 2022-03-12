package com.mowithmosh.visitor;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("heightlight heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("heightlight anchor");
    }
}
