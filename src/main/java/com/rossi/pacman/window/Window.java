package com.rossi.pacman.window;

import com.rossi.pacman.game.PlayPanel;

import javax.swing.*;

public class Window extends JFrame {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    private static final String TITLE = "Pac man";

    public Window(){

        setSize(WIDTH, HEIGHT);
        setTitle(TITLE);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new PlayPanel());
    }
}
