package com.mowithmosh.factory.matcha;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String,Object> context) {
        var engine = createEngin();
        var html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected ViewEngine createEngin() {
        var engine = new MatchViewEngine();
        return engine;
    }


}
