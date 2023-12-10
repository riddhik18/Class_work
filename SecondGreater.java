//WAP to find Second largest number in an array

class SecondGreater

{
 public static void main(String[] args)
  {
    int [] arr= new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 values ");
      
    for (int i =0;i<5;i++)
        {
          for (int j= i+1;j<5;j++)
           {
            int  temp = 0;
             if(arr[i]>arr[j])
              {
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
         
         }
       System.out.println(arr[3]);
     }
 }