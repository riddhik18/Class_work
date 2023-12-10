/* WAP to create a class Person with Data members as ubique_id,name,age,city and gender also include methods study() sleep() and play() */


import java.util.Scanner;

public class Person {

    String name;
    String city,gender;
    int age,rollno,timespend,playtime;
    int unique_id,sleeptime;
    Scanner sc = new Scanner(System.in);
        
    public void accept()
    {
        System.out.println("Enter your name : ");
        name = sc.nextLine();
        System.out.println("Unique_id : ");
        unique_id = sc.nextInt();
        System.out.println("Enter your age : ");
        age = sc.nextInt();
        System.out.println("Enter your gender : ");
        gender = sc.nextInt();

        System.out.println("Name : "+name);
        System.out.println("Unique_id : "+unique_id);
        System.out.println("Age : "+age);
        System.out.println("Roll Number : "+rollno);
    }
        
    public void study()
    {
        System.out.println("Enter your Subject : ");
        subject = sc.nextLine();
        System.out.println("How much time you spend on studying : ");
        timespend = sc.nextInt();
    }
    
    public void play()
    {
        System.out.println("What is your fav game : ");
        game = sc.nextLine();
        System.out.println("how much time you spend playing : ");
        playtime = sc.nextInt();
    }

     public void sleep()
    {
        System.out.println("How much time does it takes for you to fall asleep : ");
        sleeptime = sc.nextLine();
        System.out.println("How many hours you sleep : ");
        hours = sc.nextInt();
    }

    
    public static void main(String[] args) {
       
        Person obj = new Person();
        
        obj.study();
     

    }
    
}
