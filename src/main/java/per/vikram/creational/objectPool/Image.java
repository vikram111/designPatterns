package per.vikram.creational.objectPool;

import javafx.geometry.Point2D;

public interface Image extends Poolable {
    void draw(int x, int y);
    void setLocation(Point2D location);
    Point2D getLocation();
}
