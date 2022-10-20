package ru.vsu.cs.semenov_d_s;

import ru.vsu.cs.semenov_d_s.Point;
import ru.vsu.cs.semenov_d_s.Segment;
import ru.vsu.cs.semenov_d_s.Rectangle;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(2, 4);
        Point point2 = new Point(7, 1);

        System.out.println("Расстояние между точками: " + point1.distanceBetweenPoints(point2));

        Point pointForTest1 = new Point(5, 2);
        System.out.println("Начальная точка: ");
        pointForTest1.pointToString();

        System.out.println("Симметричное отображение точки по X: ");
        pointForTest1.makeSymmetricalXPoint();
        pointForTest1.pointToString();

        System.out.println("Симметричное отображение точки по Y: ");
        Point pointForTest2 = new Point(5, 2);
        pointForTest2.makeSymmetricalYPoint();
        pointForTest2.pointToString();

        System.out.println("Симметричное отображение точки по X и Y: ");
        Point pointForTest3 = new Point(5, 2);
        pointForTest3.makeSymmetricalXAndYPoint();
        pointForTest3.pointToString();

        Segment segment = new Segment(point1, point2);
        System.out.println("Длина отрезка: " + segment.calculateLengthOfSegment());

        System.out.print("Середина отрезка: ");
        segment.calculateMidpoint().pointToString();

        System.out.println("Посчитать расстояние от точки до прямой этого отрезка: " + segment.calcDistanceFromPointToLineOfSegment(pointForTest1));

        System.out.println("Принадлежит ли точка прямой данного отрезка: " + segment.isPointBelongToLineOfSegment(pointForTest1));

        Rectangle rectangle = new Rectangle(point1, point2);

        System.out.println("Найти длину прямоугольника: " + rectangle.getWeight());

        System.out.println("Найти ширину прямоугольника: " + rectangle.getHeight());

        System.out.println("Принадлежит ли точка прямоугольнику: " + rectangle.isPointBelongToRectangle(pointForTest1));

        System.out.print("Координаты середины прямоугольника: ");
        rectangle.findCoordinatesOfCenterOfRectangle().pointToString();

        System.out.println("Найти площадь прямоугольника: " + rectangle.calcAreaOfRectangle());

        System.out.println("Найти периметр прямоугольника: " + rectangle.calcPerimeterOfRectangle());
    }
}
