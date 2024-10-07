package ht1.point;

public class PointClass implements Movable {

    private int xPoint;
    private int yPoint;

    public int getxPoint() {
        return xPoint;
    }

    public void setxPoint(int xPoint) {
        this.xPoint = xPoint;
    }

    public int getyPoint() {
        return yPoint;
    }

    public void setyPoint(int yPoint) {
        this.yPoint = yPoint;
    }

    @Override
    public void moveUp() {
        System.out.println(yPoint++);
    }

    @Override
    public void moveDown() {
        System.out.println(yPoint--);
    }

    @Override
    public void moveLeft() {
        System.out.println(xPoint--);
    }

    @Override
    public void moveRight() {
        System.out.println(xPoint++);
    }
}
