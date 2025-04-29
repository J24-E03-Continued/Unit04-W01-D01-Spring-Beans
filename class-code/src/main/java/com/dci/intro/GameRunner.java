package com.dci.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Component
public class GameRunner {

    Game game;
    Game game2;

    @Autowired
//    qualifier takes precedence over the primary
    public GameRunner( @Qualifier("pacman") Game game,@Qualifier("mario") Game game2){
        this.game = game;
        this.game2 = game2;
        System.out.println("Game runner initialized" + this);
    }


    public GameRunner(){

    }


    public void run(){
        game.up();
        game.down();
        game.right();
        game.left();


        game2.up();

    }

}
