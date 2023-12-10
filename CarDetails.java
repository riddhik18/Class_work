// WAP to get car details from the  user.Here properties to display are  brand,modelname,topspeed  and write corresponding getters and setters

class Car
  {
    private String name,brand;
    private int speed;
    
     public String getBrand()
        {
          return this.brand;
        }
       public void setBrand(String brand)
        {
          this.brand=brand;
        }


     public String getName()
        {
          return this.name;
        }
       public void setName(String name)
        {
          this.name=name;
        }


     public int getSpeed()
        {
          return this.speed;
        }
       public void setSpeed(int speed)
        {
          this.speed=speed;
        }
  }
 class CarDetails
      {
         public static void main (String args[])
          {
            Car c= new Car();
         
            c.setBrand("Mercedes");
            System.out.println(c.getBrand());
            c.setName("E-class");
            System.out.println(c.getName());
            c.setSpeed(200);
            System.out.println(c.getSpeed());
        
            c.setBrand("Audi");
            System.out.println(c.getBrand());
            c.setName("Q5");
            System.out.println(c.getName());
            c.setSpeed(300);
            System.out.println(c.getSpeed());
      }
}