package main;

import javax.swing.JFrame;


public class Game extends JFrame {

    private GameScreen gameScreen;

    public Game(){

        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        gameScreen = new GameScreen();
        add(gameScreen);
    }

    public static void main(String[] args) {

        Game game = new Game();

    }


}