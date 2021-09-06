

public class exoPoint{
	public static void main(String[] args){
		
		Point2 p= new Point2(8,9);
        p.afficher();
        p.norme();

        Point2 q= new Point2(2,-1);
        p.addition(p,q);

        double s=p.norme2();
        System.out.println(s);

        Point2 w=p.somme(p,q);
        System.out.println("nouveau point:"+w);

        System.out.println(Point2.fois2(6));

       
	}

}
