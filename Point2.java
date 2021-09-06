

public class Point2 {
    private int x, y;

    /*private static int compteur=0;*/

    public Point2(int a, int b){ 
        this.x=a;
        this.y=b; 
        /*Point2.compteur++;*/
        }
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    public void afficher(){
        System.out.println("x="+this.x+" et y="+this.y);
    }
    public void norme(){
        System.out.println("norme^2="+((this.x)*this.x+(this.y)*this.y));
    }
    public void addition(Point2 args,Point2 arg){
        System.out.println("somme des deux points: x="+(args.x+arg.x)+" et y="+(args.y+arg.y));
    }
    public double norme2(){
        return( Math.sqrt(this.x*this.x+this.y*this.y));
    }
    public Point2 somme(Point2 i, Point2 a){
        this.x=i.x+a.x;
        this.y=i.y+a.y;
        return(this);
    }
    public static int fois2(int a){
        return a+a;
    }

}
