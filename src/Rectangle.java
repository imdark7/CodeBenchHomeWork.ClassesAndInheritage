public class Rectangle {
    private int x = 0;
    private int y = 0;
    private int height;
    private int width;

    public int getHeigth() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setHeigth(int heigth) {
        this.height = heigth;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Rectangle(int x, int y, int width, int height) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeigth(height);
    }

    public void moveRectangle(int x, int y) {
        setX(x);
        setY(y);
    }

    public static Rectangle circumscribedRectangle(Rectangle rectangle1, Rectangle rectangle2) {
        int circumscribedRectangleX = Integer.min(rectangle1.getX(), rectangle2.getX());
        int circumscribedRectangleY = Integer.min(rectangle1.getY(), rectangle2.getY());
        int circumscribedRectangleHeight = Integer.max(rectangle1.getY() + rectangle1.getHeigth(), rectangle2.getY() + rectangle2.getHeigth()) - circumscribedRectangleX;
        int circumscribedRectangleWidth = Integer.max(rectangle1.getX() + rectangle1.getWidth(), rectangle2.getX() + rectangle2.getWidth()) - circumscribedRectangleX;
        Rectangle CircumscribedRectangle = new Rectangle(circumscribedRectangleX, circumscribedRectangleY, circumscribedRectangleWidth, circumscribedRectangleHeight);
        return CircumscribedRectangle;
    }
}
