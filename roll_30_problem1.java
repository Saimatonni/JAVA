import java.util.Scanner;
class myclass{
    int a;
    public void set_a(int b)
    {
        a=b;
    }
    public int set_a()
    {
        return a;
    }
}
public class roll_30_problem1{
    public static void main(String args[]){
        myclass saima = new myclass();
        saima.a = 12;
        System.out.println("the number is:");
        System.out.println(saima.a);
    }
}