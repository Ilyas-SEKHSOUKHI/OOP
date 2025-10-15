package EX1;
public class Point2D {
    public double x;
    public double y;
    public Point2D(double x,double y){ // Constructer
        this.x=x;
        this.y=y;
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
