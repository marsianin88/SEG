package seg.java;

import javafx.scene.canvas.*;

public class ResizableCanvas extends Canvas {

    @Override
    public double minHeight(double width) { return 200; }

    @Override
    public double maxHeight(double width) { return 1000; }

    @Override
    public double prefHeight(double width) { return minHeight(width); }

    @Override
    public double minWidth(double height) { return 0; }

    @Override
    public double maxWidth(double height) { return 10000; }

    @Override
    public boolean isResizable() { return true; }

    @Override
    public void resize(double width, double height) {
        super.setWidth(width);
        super.setHeight(height);
        //paint();
    }

}