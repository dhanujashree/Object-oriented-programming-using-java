import java.util.Scanner;
abstract class Shape{
int a,b;
abstract void printArea();
}
class Rectangle extends Shape{
Rectangle(int x,int y){
a=x;
b=y;}
void printArea(){
System.out.println("Area of Rectangle:"+(a*b));
}}
class Triangle extends Shape{
Triangle(int x,int y){
a=x;
b=y;
}
void printArea(){
System.out.println("Area of Triangle :"+(0.5*a*b));
}}
class circle extends Shape {
circle(int r){
a=r;
}
void printArea(){
System.out.println("Area of circle:"+(3.14159*a*a));                                                                                                                                                                                                                                                                                                                                       
}}
public class ShapeArea{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the length and breadth of rectangle:");
int l=sc.nextInt();
int b=sc.nextInt();
Shape rect=new Rectangle(l,b);
System.out.println("Enter the base and height of triangle:");
int base=sc.nextInt();
int h=sc.nextInt();
Shape tri =new Triangle(base,h);
System.out.println("Enter the Radius of circle:");
int r=sc.nextInt();
Shape cir=new circle(r);
rect.printArea();
tri.printArea();
cir.printArea();
sc.close();
}
}

