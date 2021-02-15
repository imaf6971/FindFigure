package imaf6971.findFigure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner init

        List<Dot> dotList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int j = i + 1;
            System.out.println("Input dot number " + j + " coordinate (x, y): ");

            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            Dot newDot = new Dot(x, y);
            dotList.add(i, newDot);
        }

        List<Line> lineList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            lineList.add(new Line(dotList.get(i), dotList.get(i + 1)));
        }
        lineList.add(new Line(dotList.get(3), dotList.get(0)));
        lineList.add(new Line(dotList.get(0), dotList.get(2)));
        lineList.add(new Line(dotList.get(1), dotList.get(3)));

        Figure newFigure = new Figure(lineList.get(0), lineList.get(1), lineList.get(2), lineList.get(3), lineList.get(4), lineList.get(5));
        System.out.println("Your figure type is: " + newFigure.getFigureType());

    }
}