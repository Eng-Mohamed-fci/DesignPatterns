package com.mowithmosh.factory.sharp;

import com.mowithmosh.factory.matcha.Controller;
import com.mowithmosh.factory.matcha.ViewEngine;

public class SharpConroller extends Controller {
    @Override
    protected ViewEngine createEngin() {
        return new SharpViewEngin();
    }
}
