/*

**********
*********
********
*******
******
*****
****
***
**
*

*/

class Pattern4
{
public static void main(String args[])
{
int i,j;   //i is taken to iterate over row and j is for column
for(i=10;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}