package imaf6971.findFigure;

public class Line {
    private double length;

    public Line(Dot A, Dot B) {
        length = Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + getLength() +
                '}';
    }
}
