public class Program3 {
    public static void main(String[] args) {
        Rectangle1 rect1 = new Rectangle1(30.45, 45.55);
        Rectangle1 rect2 = new Rectangle1(25.45, 56.55);

       System.out.println("Area of rectangle-1 is" + rect1.getArea());
        System.out.println("Perimeter of rectangle-1 is" + rect1.getPerimeter());
        System.out.println("Area of rectangle is-2" + rect2.getArea());
        System.out.println("Perimeter of rectangle-2 is" + rect2.getPerimeter());

        rect1.setWidthHeight(25.55, 15.00);
        rect2.setWidthHeight(15.55, 20.00);
        System.out.println("Area of rectangle-1 is " + rect1.getArea());
        System.out.println("Perimeter of rectangle-1 is " + rect1.getPerimeter());
        System.out.println("Area of rectangle is-2 " + rect2.getArea());
        System.out.println("Perimeter of rectangle-2 is" + rect2.getPerimeter());
    }
}
