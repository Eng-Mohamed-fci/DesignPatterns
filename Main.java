package com.mowithmosh;

import com.mowithmosh.abstractFactory.ant.AntWidgetFactory;
import com.mowithmosh.abstractFactory.app.ContactForm;
import com.mowithmosh.abstractFactory.material.MaterialWidgetFactory;
import com.mowithmosh.builder.MovieBuilder;
import com.mowithmosh.builder.PdfDocumentBuilder;
import com.mowithmosh.builder.Presentation;
import com.mowithmosh.builder.Slide;
import com.mowithmosh.factory.ProductsController;
import com.mowithmosh.proxy.EbookProxy;
import com.mowithmosh.proxy.Library;
import com.mowithmosh.proxy.LoggingEbookProxy;
import com.mowithmosh.proxy.RealEbook;
import com.mowithmosh.singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        var builder = new MovieBuilder();
        presentation.export(builder);
        var movie = builder.getMovie();

    }

}
