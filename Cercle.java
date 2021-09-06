public class Cercle extends FigureCentree{
    //private Point centre;
    private int rayon;

    public Cercle(Point p, int r){
        super(p);
        this.rayon=r;
    }
    public double perimetre(){
        return 2*Math.PI*this.rayon;
    }
    public String toString(){
        return "je suis un cercle de centre"+super.toString()+" et de rayon"+this.rayon;
    }
}
