//WAP to accept Character from user and make a decision whether is vowel or consonent

import java.util.Scanner;

public class Vowels
{
public static void main(String[]args)
{
char vowels;
Scanner sc = new Scanner(System.in);

System.out.println("Enter the vowels");
vowels = sc.next().charAt(0);

if (vowels == 'a' || vowels == 'A' ||
vowels == 'e' || vowels == 'E' ||
vowels == 'i' || vowels == 'I' ||
vowels == 'o' || vowels == 'O' ||
vowels == 'u' || vowels == 'U' )
{
System.out.println(vowels + " is vowel ");
}
else
{
System.out.println(vowels + " is Consonant");
}
}
}