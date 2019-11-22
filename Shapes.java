import java.util.Scanner;
import java.util.Scanner.*;

public class Shapes {
    public static void main(String[] args)
    {
//        polygon cesar = new polygon(10);
//        System.out.println(cesar);
//     //   System.out.println("hola jeje");
        polygon obj = new polygon(20);
        int object = obj.getSides();
        System.out.println(object);
    }
}

////Triangle class////
//    class triangle
//    {
//
//        //// fields or instance variables. -------could be set to private
//        double height;
//        double base;
//        double side1;
//        double side2;
//        double side3;
//
//        /// main constructor for triangle
//        public triangle()
//        {
//            this.height = 0;
//            this.base = 0;
//            this.side1 = 0;
//            this.side2 = 0;
//            this.side3 = 0;
//        }
//        /// other constructor with some parameters mainly the ones with double type
//        public triangle(double theBase, double theHeight)
//        {
//            this.height = theHeight;
//            this.base = theBase;
//        }
//        public triangle( double theSide1, double theSide2, double theSide3)
//        {
//            this.side1 = theSide1;
//            this.side2 = theSide2;
//            this.side3 = theSide3;
//        }
//        /// getter and setters for the triangle class
//        public void setBase(double newBase)
//        {
//            this.base = newBase;
//        }
//        public void setHeight(double newHeight)
//        {
//            this.height = newHeight;
//        }
//        public double getHeight() {
//            return height;
//        }
//        public double getBase() {
//            return base;
//        }
//        public double getSide1(){return side1;}
//
//        /// method to calculate the area
//        public double calculateArea()
//        {
//            double area = (base/2)*height;
//            return area;
//        }
//
//        ///method to calculate the perimeter
//        public double calculatePerimeter()
//        {
//
//            double perimeter = side1 + side2 + side3;
//            return perimeter;
//        }
//
//        @Override
//        public String toString() {
//            return super.toString();
//        }
//    }
//


    //// break for another class which is rectangle
//    class rectangle
//    {
//
//        //// fields or instance variables. -------could be set to private
//        double length;
//        double width;
//
//        ///main constructor
//        public rectangle()
//        {
//            this.length = length;
//            this.width = width;
//        }
//
//        ////constructor that takes in a few parameters
//        public rectangle(double theLength, double theWidth)
//        {
//            this.length = theLength;
//            this.width = theWidth;
//        }
//
//        //// setters and getters
//        public double getWidth()
//        {
//            return width;
//        }
//        public double getLength()
//        {
//            return length;
//        }
//        public void setWidth(double newWidth)
//        {
//            this.width = newWidth;
//        }
//        public void setLength(double newLength)
//        {
//            this.length = newLength;
//        }
//
//        //// method to calculate the area that takes in two parameters with double variable type
//        public double calculateArea(double length, double width)
//        {
//            double area = length * width;
//            return area;
//        }
//
//        /// method to calculate the perimeter that takes in two parameters with double variable type/
//        public double calculatePerimeter(double length, double width)
//        {
//            double perimeter = 2*length + 2*width;
//            return perimeter;
//        }
//    }

    //// break of class. Circle class starts.
    class circle
    {

        //// fields or instance variables. -------could be set to private
        final double pi = Math.PI;
        double radius;

        public circle()
        {
            this.radius = radius;
        }
        public circle(double theRadius)
        {
            this.radius = theRadius;
        }
        public double getRadius()
        {
            return radius;
        }
        public void setRadius(double newRadius)
        {
            this.radius = newRadius;
        }
        public double calculateArea()
        {
            double area = pi*Math.pow(radius,2);
            return area;
        }
        public double diameter()
        {
            double diameter = 2*radius;
            return diameter;
        }
        public double circumference()
        {
            double circumference = 2*pi*radius;
            return circumference;
        }
    }

//    class square
//    {
//        double side;
//
//        //    @Contract(pure = true)
//        public square()
//        {
//            this.side = side;
//        }
//        public square(double theSide)
//        {
//            this.side = theSide;
//        }
//        public double getSide()
//        {
//            return side;
//        }
//        public void setSide(double newSide)
//        {
//            this.side = newSide;
//        }
//
//        public double calculateArea(double side)
//        {
//            double area = Math.pow(side,2);
//            return area;
//        }
//
//        public double calculatePerimeter(double side)
//        {
//            double perimeter = side + side + side + side;
//            return perimeter;
//        }
//    }


    class polygon {
        int sides;
        double sideLength;
        double apotema;
        double side1;
        double side3;
        double side4;
        double side5;
        double side6;
        double height;

        public polygon() {
            this.sides = 0;
        }

        public polygon(int sideAmount) {
            if (sideAmount <= 2) {
                System.out.println("Please enter a valid number of sides or refer to another shape");
            }
            else if(sideAmount == 3)
            {
                System.out.println("Is a triangle");
                    this.sides = 3;
            }
            else if(sideAmount == 4)
            {
                System.out.println("Is a parallelogram");
                System.out.println("Is it a square or a rectangle? ");
                Scanner scan = new Scanner(System.in);
                String parallelogram = scan.next();
                if(parallelogram == "square")
                {
                    System.out.println("Is a square");
                    this.sides = 4;
                }

            }
            else if(sideAmount == 5)
            {
                System.out.println("Is a pentagon");
                this.sides = 5;
            }
            else if(sideAmount == 6)
            {
                System.out.println("Is a hexagon");
                this.sides = 6;
            }
            else if(sideAmount == 7)
            {
                System.out.println("Is a heptagon");
                this.sides = 7;
            }
            else if(sideAmount == 8)
            {
                System.out.println("Is a octagon");
                this.sides = 8;
            }
            else {
                System.out.println("Sorry we can only do polygons of up to 8 sides");
            }
        }
        public polygon()
        public int getSides() {
            return sides;
        }
        public double calculateArea()
        {
            double area = (sides * sideLength * apotema) / 2;;
            return area;
        }


    }


//        public polygon(int amountOfSides) {
//            if (amountOfSides <= 0) {
//                System.out.println("No polygon with less or zero sides.");
//            } else if (amountOfSides > 4) {
//                if (amountOfSides == 3) {
//                    System.out.println("Please refer to the triangle");
//                } else if (amountOfSides == 4) {
//                    System.out.println("Please refer to the parallelograms");
//                }}
//            else if (amountOfSides >= 4 ) {
//                Scanner scan = new Scanner(System.in);
//                System.out.println("Enter the amount of sides greater than 4");
//                int zides = scan.nextInt();
//
//                }
//            else if(amountOfSides == )
//            }
//        public polygon(int amountOfSides, double theLength, double apothem)
//        {
//            this.sides = amountOfSides;
//            this.sideLength = theLength;
//            this.apotema = apothem;
//        }
//
//         public double calculateArea ()
//         {
//            double area = (sides * sideLength * apotema) / 2;
//                return area;
//            }
//
//            public double calculatePerimeter ( int amountOfSides, int sideLength){
//                double perimeter = amountOfSides * sideLength;
//                return perimeter;
//            }
//
//        }

//        public polygon(int theSides)
//        {
//            this.amountOfSides = theSides;
//        }
//        public polygon(int theSides, double length, double theApothem)
//        {
//            this.amountOfSides = theSides;
//            this.sideLength = length;
//            this.apotema = theApothem;
//        }
//
//        public polygon(int sides)
//        {
//            if (sides >= 5) {
//                Scanner scan = new Scanner(System.in);
//                System.out.println("How many sides does your polygon have");
//                int amountOfSides = scan.nextInt();
//                if (amountOfSides == 4) {
//                    System.out.println("Please refer to the square");
//                } else if (amountOfSides <= 3) {
//                    if (amountOfSides == 3) {
//                        System.out.println("Please refer to the triangle");
//                    } else {
//                        System.out.println("No polygon with less than 3 sides");
//                    }
//                } else if (amountOfSides == 5) {
//                    System.out.println("Is a pentagon");
//
//                } else if (amountOfSides == 6) {
//                    System.out.println("is an hexagon");
//
//                } else if (amountOfSides == 7) {
//                    System.out.println("is a heptagon");
//                } else if (amountOfSides == 8) {
//                    System.out.println("is a octagon");
//                } else {
//                    System.out.println("We can only do polygons with up to eight sides, sorry");
//                }
//            }
//        }