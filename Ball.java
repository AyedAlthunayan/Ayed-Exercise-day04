public class Ball {
//    Exercise04
    float x;
    float y;
    int radius;
    float xdelta;
    float ydelta;
    public Ball (float x,float y, int radius, float xdelta, float ydelta){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xdelta=xdelta;
        this.ydelta=ydelta;

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXdelta() {
        return xdelta;
    }

    public void setXdelta(float xdelta) {
        this.xdelta = xdelta;
    }

    public float getYdelta() {
        return ydelta;
    }

    public void setYdelta(float ydelta) {
        this.ydelta = ydelta;
    }
    public void move (){
        x=x+xdelta;
        y=y+ydelta;
    }
    public void reflectHorizontal (){
        xdelta = -xdelta;
    }
    public void  reflectVertical() {
        ydelta = -ydelta;
    }
    public String toString () {
        return "Ball [("+x+","+y+"),speed=("+xdelta+","+ydelta+")];";
    }

    public static void main(String[] args) {
        Ball car = new Ball(33,22,20,12,11);
        car.setX(3);
        System.out.println(car.toString());


    }
}
