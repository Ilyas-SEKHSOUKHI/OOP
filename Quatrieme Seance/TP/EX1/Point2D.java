package EX1;
public class Point2D { // La class
    private double x; // attribue 1
    private double y; // attribue 2
    public Point2D(){ // Constructer By Default
        this(0,0);
    }
    public Point2D(double x,double y){ // Constructer
        this.x=x;
        this.y=y;
    }
    public Point2D(Point2D other){ // Constructer de copie
        this.x=other.x;
        this.y=other.y;
    }
    public double getX(){ // get x
        return x;
    }
    public void setX(double x){ // set x
        this.x = x;
    }
    public double getY(){ // get y
        return y;
    }
    public void setY(double y){ // set y
        this.y = y;
    }
    
    public void affichage(){
        System.out.println(x);
        System.out.println(y);
    }
    
    /*public void move(double dx,double dy){

    }
    public void distance(Poids2D p){

    }*/
}
