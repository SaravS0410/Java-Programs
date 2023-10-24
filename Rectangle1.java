public class Rectangle1 {
    private double height;
    private double width;

    public Rectangle1(double height, double width){
        this.height = height;
        this.width = width;    
    }

    public double height(){
        return height;
    }

     public double width(){
        return width;
     }
     public void setWidthHeight(double width,double height){
        this.width = width;
        this.height = height;
     }

     public double getArea(){
        return width*height;
     }

     public double getPerimeter(){
        return 2*(height+width);
     }
 }


