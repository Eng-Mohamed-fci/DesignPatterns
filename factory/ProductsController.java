package com.mowithmosh.factory;

import com.mowithmosh.factory.matcha.Controller;
import com.mowithmosh.factory.matcha.MatchViewEngine;
import com.mowithmosh.factory.sharp.SharpConroller;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpConroller {
    public void listProducts() {
        // Get products from a database
        Map<String, Object> context = new HashMap<>();
        // context.put(product)
        render("products.html",context);
    }
}
