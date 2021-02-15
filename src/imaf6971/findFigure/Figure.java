package imaf6971.findFigure;

public class Figure {
    private FigureType figureType;

    public Figure(Line A, Line B, Line C, Line D, Line dig1, Line dig2) {
        if (A.getLength() == B.getLength() && B.getLength() == C.getLength() && C.getLength() == D.getLength() && D.getLength() == A.getLength() && dig1.getLength() == dig2.getLength()) {
            figureType = FigureType.SQUARE;
        } else if (A.getLength() == B.getLength() && B.getLength() == C.getLength() && C.getLength() == D.getLength() && D.getLength() == A.getLength()) {
            figureType = FigureType.RHOMBUS;
        } else if (A.getLength() == C.getLength() && B.getLength() == D.getLength() && dig1.getLength() == dig2.getLength()) {
            figureType = FigureType.RECTANGLE;
        } else if (A.getLength() == C.getLength() && B.getLength() == D.getLength()) {
            figureType = FigureType.PARALLELOGRAM;
        } else {
            figureType = FigureType.UNDEFINED;
        }
    }

    public FigureType getFigureType() {
        return figureType;
    }
}
