package imaf6971.findFigure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Dot> dotList = new ArrayList<>();
        List<Line> lineList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("Введите координаты точки " + i);
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            dotList.add(i, new Dot(x, y));
            System.out.println();
        }


        for (int i = 0; i < 4; i++) {
            lineList.add(i, new Line(dotList.get(i), dotList.get(i + 1)));
            System.out.println(lineList.get(i));
        }

        for (int i = 0; i < 2; i++) {
            lineList.add(i + 4, new Line(dotList.get(i), dotList.get(i + 3)));
        }

        System.out.println("Hello again");
    }
}