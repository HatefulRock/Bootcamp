

public class PointColore extends Point{
    String c;

    public PointColore(Point p,String c){
        //this.x=p.x;
        //super(p.x);
        super(p);
        this.c=c;
    }

    public String toString(){
        return ""+ this.x;
    }
}
