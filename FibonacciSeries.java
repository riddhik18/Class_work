//fibonacci series 0   1    1    2  3     5   8


class FibonacciSeries
{
public static void main(String args[])
{
int a=0;
int b=1;
int c;

System.out.println("a"+" "+b);

for(i=1;i<=5;i++)    //i=i+1
{
int c=a+b;
System.out.println(c+" ");
a=b;
b=c;
}
}
}