package src.app;

class TotalAreaFigures
{
    static double getTotalArea(Area... areas) {
        double totalArea = 0;

        for (Area area : areas) {
            totalArea += area.getArea();
        }

        return totalArea;
    }

}
