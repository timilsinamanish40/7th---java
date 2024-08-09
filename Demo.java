// class Student 
//     {
//         private int roll;
//         private String name;
//         public void setStudentDetail(int roll, String name)
//         {
//             this.roll = roll;
//             this.name = name;
//         }
//         public void displayStudentDetail()
//         {
//             System.out.println("Roll : " + roll);
//             System.out.println("Name : " + name);
//         }
//     }
// class Demo
//     {
//         public static void main(String[] args) 
//         {
//             Student s = new Student();
//             s.setStudentDetail(5,"Ram");
//             s.displayStudentDetail();
//         }
//     }





// program to input length and breadth of rectangle and find its perimeter
import java.util.*;
class Rectangle
    {
        private double length, breadth;
        public void inputData()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length : ");
            length = sc.nextDouble();
            System.out.println("Enter breadth : ");
            breadth = sc.nextDouble();
        }
        public double getArea()
        {
            return (length * breadth);
        }

        public double getPerimeter()
        {
            return (2 * (length + breadth));
        }
    }
class Demo
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.inputData();
        double res_area = r.getArea();
        double res_peri = r.getPerimeter();
        System.out.println("Area : " + res_area);
        System.out.println("Perimeter : " + res_peri);
    }
}
    