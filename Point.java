public class Point{
	public int x;
	
	public Point(){ 
	System.out.println("appel du constructeur Point");
	this.x=-1; 
	}

	public void publicDeplacer(){
	this.deplacer();
	}

	private void deplacer() {
	this.x=this.x+1;
	}
}
