public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;    
    }

    public double height(){
        return height;
    }
    public void setHeight(double height){
        this.height  = height;
    }
     public double width(){
        return width;
     }
     public void setWidth(double width){
        this.width = width;
     }

     public double getArea(){
        return width*height;
     }

     public double getPerimeter(){
        return 2*(height+width);
     }
 }


