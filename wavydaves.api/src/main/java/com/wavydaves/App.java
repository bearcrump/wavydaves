package com.wavydaves;

import io.javalin.javalin;

public class App {
    public static void main( String[] args ) {
        //System.out.println( "Hello World!" );

        var app = Javalin.create(/*config*/)
        .get("/", ctx -> ctx.result("Hello World"))
        .start(7070);

    }
}
