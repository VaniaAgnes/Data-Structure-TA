
 abstract class Shape{
    String color;

    abstract float getArea();

     public Shape (String color) {
        this.color = color;
    }


}

  class Rectangle extends Shape {
     float width;
     float height;
    public Rectangle (float width, float height, String color ) {
        super(color);
        this.width = width;
        this.height = height;
    }
        @Override
        public float getArea() {
            return this.width * this.height;
        }
    }





public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle (67,45,"purple");
        System.out.println("The area of the rectangle is " + rectangle.getArea()  );
    }
}
