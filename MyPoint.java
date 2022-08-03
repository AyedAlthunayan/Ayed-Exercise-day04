public class MyPoint {
//    Exercise07
    int x =0;
    int y=0;
    public MyPoint(){

    }
    public MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int arr []={x,y};
        return arr;
    }
    public void setXY (int x, int y){
        this.x=x;
        this.y=y;
    }
    public String toString (){
        return "("+x+","+y+")";
    }
    public double distance (int x, int y){
//        id do not what it is mean

    }
    public double distance (MyPoint another) {
//        id do not what it is mean

    }
    public double distance (){
//        id do not what it is mean

    }
}
