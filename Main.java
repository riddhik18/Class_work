import java.util.Scanner;

public class OOPs {
    double num1, num2, ans;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
    }

    public void addNum() {
        ans = num1 + num2;
        System.out.println("The addition of 2 number is " + ans);
    }

    public void subNum() {
        ans = num1 - num2;
        System.out.println("The subtraction of 2 number is " + ans);
    }

    public void mulNum() {
        ans = num1 * num2;
        System.out.println("The multiplication of 2 number is " + ans);
    }

    public void divNum() {
        ans = num1 / num2;
        System.out.println("The div of 2 number is " + ans);
    }
    public static void main(String[] args)
    {
        OOPs obj=new OOPs();
        obj.input();
        obj.addNum();
        obj.subNum();
        obj.mulNum();
        obj.divNum();
    }
}