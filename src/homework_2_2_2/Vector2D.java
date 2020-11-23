package homework_2_2_2;

import java.util.Locale;

public class Vector2D {
    double vX;
    double vY;
    static int count = 0;

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D() {
        count++;
        this.vX = 1.00;
        this.vY = 1.00;
    }

    public Vector2D(Vector2D a) {
        count++;
        this.vX = a.vX;
        this.vY = a.vY;
    }

    public void print() {
        System.out.println("(" + String.format(Locale.US, "%.2f", vX) + ", " + String.format(Locale.US, "%.2f", vY) + ")");
    }

    public double length() {
        return Math.sqrt(Math.pow(vX, 2) + Math.pow(vY, 2));
    }

    public void add(Vector2D v) {
        this.vY += v.vY;
        this.vX += v.vX;
    }

    public void sub(Vector2D v) {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }

    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }

    public void normalized() {
        double len = length();
        vX /= len;
        vY /= len;
    }

    public double dotProduct(Vector2D v) {
        return vX * v.vX + vY * v.vY;
    }
}
