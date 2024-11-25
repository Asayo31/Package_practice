package ru.courses.geometry;

import java.util.List;

public class FigureUtils {
    /**
     * Вычисляет общую площадь всех фигур в списке.
     *
     * @param figures список фигур.
     * @return общая площадь.
     */
    public static double sumAllAreas(List<Figure> figures) {
        return figures.stream().mapToDouble(Figure::getArea).sum();
    }
}
