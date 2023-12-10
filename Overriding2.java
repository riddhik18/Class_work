/* WAP to get details  of vehicle i.e. Bike and Car.Override engine() method to describe both bike and car
create Vehicle as base class and BIke ,Car as derived class */

class Vehicle{
	void engine(){
		System.out.println("This is a engine for vehicles");
	}
}
class Bike extends Vehicle{
	@Override				//@Override is keyword for use of method overriding 
	void engine(){
		super.engine();			//for call base class method
		System.out.println("This is engine for Bike");	
	}
}
class Car extends Vehicle{
        @Override
        void engine()
        {
                 super.engine();
                 System.out.println("This is a engine for Car");
        }
}
	
public class Overriding2
{
           public static void main(String args[])
           {
                    Car c=new Car();
                    Bike b=new Bike();
                    b.engine();
                    c.engine();
           }
}
