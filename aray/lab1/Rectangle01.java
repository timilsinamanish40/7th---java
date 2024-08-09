class Rectangle01 {
    double length;
    double width;

    Rectangle01(double length, double width) {
        this.length = length;
        this.width = width;
    }


    double calculateArea() {
        return length * width;
    }

   
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        
        Rectangle01 rect = new Rectangle01(10, 4);

        double area = rect.calculateArea();
        System.out.println("Area: " + area);

        double perimeter = rect.calculatePerimeter();
        System.out.println("Perimeter: " + perimeter);
    }
}