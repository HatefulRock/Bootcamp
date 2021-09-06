public class FigureCentree {
    private Point centre;

    protected FigureCentree(Point centre){
        this.centre=centre;
    }

    public String toString(){
        return "je suis une figure centree de centre"+this.centre;
    }
    public void deplacer(int dx,int dy){
        this.centre.x+=dx;
        this.centre.y+=dy;
    }
}
