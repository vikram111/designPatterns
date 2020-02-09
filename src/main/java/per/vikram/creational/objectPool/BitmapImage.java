package per.vikram.creational.objectPool;

import javafx.geometry.Point2D;

public class BitmapImage implements Image {
    private Point2D location;
    private String name;

    public BitmapImage(String name){
        this.name = name;
    }
    @Override
    public void draw(int x, int y) {
        System.out.println("The location has been drawn at x "+x+" and y at "+y);
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void reset() {
        location = null;
        System.out.println("Location has been reset for the bitmap");
    }
}
