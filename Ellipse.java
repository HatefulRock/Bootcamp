public class Ellipse {
    private Point centre;
    private int rayon1;
    private int rayon2;

    public Ellipse(Point p, int r1,int r2){
        this.centre=p;
        this.rayon1=r1;
        this.rayon2=r2;
    }
    public double perimetre(){
        return 2*Math.PI*this.rayon2;
    }
    public String toString(){
        return "je suis un cercle de centre"+this.centre+" et de rayon"+ this.rayon1;
    }
    public void deplacer(int dx,int dy){
        this.centre.x+=dx;
        this.centre.y+=dy;
    }
}

