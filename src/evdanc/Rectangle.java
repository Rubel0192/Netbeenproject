
package evdanc;

public class Rectangle extends Shape {
    
//   public double getArea(int a, double b){
//   double area =a*a*b;
//       System.out.println(area);
//    return 0.0;
//    }
//    
//    public static void main(String[] args) {
//        Shape he=new Rectangle();
//        
//        he.getArea(6, 3.1415);
//    }
    
    
    public double x;
    public double y;
    
    
    public Rectangle(double x,double y){
    this.x=x;
    this.y=y;
    }
    
    @Override
    
     public double getArea(){
    
    return x*y;
    }
    
    
    
}
