package com.dci.intro;

import org.springframework.stereotype.Component;

@Component
public interface Game {
    void up();
    void down();
    void left();
    void right();
}
