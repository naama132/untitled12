package ClassWorkShai;

public class Point {
    private int x;
    private int y;


    public void setPx(int x) {
        this.x=x;
    }
    public void setPy(int y){
        this.y=y;
    }
    public int getPx(){
        return this.x;
    }
    public int getPy(){
        return this.y;
    }
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
}



