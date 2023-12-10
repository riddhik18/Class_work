//Q41-Create a program in java to implement multilevel inheritance and hierarchical inheritance.Take classes like: Doctor, Surgeon and Nurse

class Doctor
{	
	public void doctors()
	{
	System.out.println("I am Doctor, I Cure Patient");
	}
}
class Surgeon extends Doctor
{	
	public void doctors()
	{
	super.doctors();
	System.out.println("I am Surgeon, I perform Surgeries");
	}
}
class Nurse extends Doctor
{	
	public void doctors()
	{
	System.out.println("I am Nurse, I take care of Patients");
	}
}
class Hospital
{
	public static void main(String[]args)
	{
		Surgeon sg=new Surgeon();
		sg.doctors();
		Nurse n=new Nurse();
		n.doctors();
	}
}