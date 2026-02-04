class Area {
    void area(double side) {
        System.out.println("Area of Square = " + (side * side));
    }
    void area(double length, double breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
    void area(int radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Area obj = new Area();
        obj.area(5.0);          
        obj.area(5.9, 7.0); 
        obj.area(9);         
    }
}