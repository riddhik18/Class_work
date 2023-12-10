//Create a class father,Son and Baby .All three classes have a method move .write specific comment inside that like for father-I can walk with the help of stick.

class Father{
	public void move(){
		System.out.println("I can walk with the help of stick");
	}
}
class Son extends Father{
	@Override				//@Override is keyword for use of method overriding 
	public void move(){
		super.move();			//for call base class method
		System.out.println("I can run fast");	
	}
}
class Baby extends Son{
	public void move(){
	super.move();
	System.out.println("I can Nicely crawl");
}
}

class Baby1{
	public static void main(String[]args)
	{
		Baby bb=new Baby();			//create object of sub class
		bb.move();						//call the eat method from the sub class object
		
	}
}