package com.company;

class Employee{

    public String name;
    public int age;

    Employee(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void totalSalary(){

    }

    public void print(){
        System.out.print(name + " " +age + " ");
    }
}

class Worker extends Employee{
    public int hoursWorked;
    public double salaryPerHour;

    Worker(String name,int age,int hoursWorked,int salaryPerHour){
        super(name,age);
        this.hoursWorked=hoursWorked;
        this.salaryPerHour=salaryPerHour;
    }

    public void totalSalary(){
        double total_salary=hoursWorked*salaryPerHour;
        System.out.println(total_salary);
    }

    public void print(){
        super.print();
//        System.out.println(hoursWorked*salaryPerHour + " ");
    }

}

class Manager extends Employee{
    String department;
    double salary;
    Manager(String name,int age, String department,double salary){
        super(name,age);
        this.department=department;
        this.salary=salary;
    }

    public void print(){
        super.print();
        System.out.println("Department " + department);
        System.out.println("Salary " + salary);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Worker e1=new Worker("Rahul",24,5,30);
        e1.print();
        e1.totalSalary();

        Employee e2=new Employee("Rohan",30);
        e2.print();

    }
}
