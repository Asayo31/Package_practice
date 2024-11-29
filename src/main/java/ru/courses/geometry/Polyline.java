package ru.courses.geometry;

import java.util.Arrays;

public class Polyline {
        private Point[] points;

        public Polyline(Point... points) {
            this.points = points;
        }

        public double length() {
            double sum = 0, len1, len2;
            for (int i = 0; i < points.length - 1; i++) {
                len1 = points[i + 1].getX() - points[i].getX(); // Используем getX()
                len2 = points[i + 1].getY() - points[i].getY(); // Используем getY()
                sum += Math.sqrt(len1 * len1 + len2 * len2);
            }
            return sum;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Polyline other = (Polyline) obj;
            return Arrays.equals(this.points, other.points);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(points);
        }

        @Override
        public String toString() {
            return "PolyLine{" +
                    "points=" + Arrays.toString(points) +
                    '}';
        }
    }
