package pong;

import java.awt.*;

public class Ball {
    private double x, y;
    private double dx, dy;
    private int radius;

    public Ball(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;

        dx = 10;
        dy = 10;
    }

    public void update() {
        x += dx;
        y += dy;

        if (x < radius) {
            dx = -dx;
            x += radius - x;
        }
        if (x > Board.WIDTH - radius) {
            dx = -dx;
            x -= 2 * (x - Board.WIDTH + radius);
        }
        if (y < radius) {
            dy = -dy;
            y += radius - y;
        }
        if (y > Board.HEIGHT - radius) {
            dy = -dy;
            y -= 2 * (y - Board.HEIGHT + radius);
        }
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.white);
        graphics.drawArc((int)x - radius, (int)y - radius, radius * 2, radius * 2, 0, 360);
    }
}
