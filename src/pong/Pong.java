package pong;

import javax.swing.*;
import java.awt.*;

public class Pong extends JFrame {
    public Pong() {
        init();
    }

    public void init() {

        add(new Board());

        setResizable(false);
        pack();

        setTitle("Pong");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                (new Pong()).setVisible(true);
            }
        });
    }
}
