package imaf6971.findFigure;

public class Dot {
    private double X, Y;

    public Dot(double x, double y) {
        X = x;
        Y = y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    @Override
    public String toString() {
        return "Dot{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}
