package com.mowithmosh.factory.matcha;

import java.util.Map;

public class MatchViewEngine implements ViewEngine {

    public String render(String viewName, Map<String, Object> context) {
        return viewName + " * View rendered by Matcha";
    }
}
