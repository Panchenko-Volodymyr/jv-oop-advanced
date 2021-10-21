package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    public Figure getRandomFigure() {
        int indexShapeFigure = new Random().nextInt(ShapeFigure.values().length);
        Figure figure;
        switch (indexShapeFigure) {
            case 0:
                figure = new Square();
                break;
            case 1:
                figure = new Rectangle();
                break;
            case 2:
                figure = new RightTriangle();
                break;
            case 3:
                figure = new Circle();
                break;
            case 4:
                figure = new IsoscelesTrapezoid();
                break;
            case 5:
                figure = new Rhombus();
                break;
            default:
                figure = new Circle();
                break;
        }
        int indexColor = new Random().nextInt(Color.values().length);
        figure.randomAttributes();
        figure.setFigure(ShapeFigure.values()[indexShapeFigure]);
        figure.setColor(Color.values()[indexColor]);
        figure.countArea();
        return figure;
    }

    public Figure getDafaultFigure() {
        Circle circle = new Circle();
        circle.setFigure(ShapeFigure.circle);
        circle.setColor(Color.white);
        circle.setRadius(10);
        circle.countArea();
        return circle;
    }
}