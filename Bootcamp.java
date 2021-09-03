public class Bootcamp{
	public static void main(String[] args){
		System.out.println("Hello World");

		Point p= new Point();
		System.out.println("p.x="+p.x); 
		p.x=7;
		System.out.println("p.x="+p.x);
		
		System.out.println("p.x="+p.x);

		p.publicDeplacer();
	}
}
