
public class Point{
	protected int x;
	protected int y;
	
	public Point(Point p){
		this.x=p.x;
	}
	public Point(int a){ 
	System.out.println("appel du constructeur Point");
	this.x=a; 
	}

	public void publicDeplacer(){
	this.deplacer();
	}

	private void deplacer() {
	this.x=this.x+1;
	}
}
