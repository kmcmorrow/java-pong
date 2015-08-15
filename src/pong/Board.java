package pong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    private static final int BALL_RADIUS = 20;
    private static final int DELAY = 15;

    private Ball ball;
    private Timer timer;

    public Board() {
        initBoard();
    }

    public void initBoard() {
        setBackground(Color.black);

        setDoubleBuffered(true);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        timer = new Timer(DELAY, this);
        timer.start();

        ball = new Ball(WIDTH / 2, HEIGHT / 2, BALL_RADIUS);
    }

    private void draw(Graphics graphics) {
        ball.draw(graphics);
    }

    private void update() {
        ball.update();

        repaint();
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        draw(graphics);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
    }
}
