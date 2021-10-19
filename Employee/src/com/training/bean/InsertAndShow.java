package com.training.bean;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;



public class InsertAndShow {
private User emp;
static ArrayList arrayList=new ArrayList();
void addEmployee(){
Scanner scan=new Scanner(System.in);
System.out.println("Enter Id");
int id=scan.nextInt();
System.out.println("Enter Name");
String name=scan.next();
System.out.println("Enter Email");
   String email=scan.next();
   User emp=new User(id,name,email);
   arrayList.add(emp);

}
void display(){
System.out.println(arrayList);
}
public static void main(String args[]) {
Scanner scan=new Scanner(System.in);
InsertAndShow ref=new InsertAndShow();
int choice = 0;
   do {
System.out.println("Enter your choice");
System.out.println("Enter 1 to add");
System.out.println("Enter 2 to display");
System.out.println("Enter 0 to stop");
choice=scan.nextInt();
switch(choice) {
case 1:
ref.addEmployee();
break;

case 2:
ref.display();
break;

default :
System.out.println("Invalid Input");
break;

}
}while(choice !=0);
 }
}