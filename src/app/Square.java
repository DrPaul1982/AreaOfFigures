package src.app;

class Square implements Area {

    double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

}
