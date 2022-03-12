package com.mowithmosh.factory.sharp;

import com.mowithmosh.factory.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngin implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "view rendered by sharp";
    }
}
