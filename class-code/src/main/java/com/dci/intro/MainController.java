package com.dci.intro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @GetMapping("/home")
    public String homepage(){

        return """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Document</title>
                </head>
                <style>
                body{
                background-color:red;
                }
                </style>
                <body>
                <h1>Homepage</h1>
                </body>
                </html>
                """;
    }


    @GetMapping("/about")
    public String about(){
        return "About";
    }




}
