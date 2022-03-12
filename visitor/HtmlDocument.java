package com.mowithmosh.visitor;

import java.util.List;
import java.util.ArrayList;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    public void execute(Operation operation) {
        for (var node : nodes)
            node.execute(operation);
    }
}
