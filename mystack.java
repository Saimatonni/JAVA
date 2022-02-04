import java.util.Scanner;
class myStack {
    private int stack[] = new int[5];
    private int tos = 0;


    public void push(int num) {
        stack[tos++] = num;
    }

    public int pop() {
        return stack[--tos];
    }

    public void show() {
        System.out.println("Showing the stack...");
        for (int i = 0; i < tos; i++) {
            System.out.println(stack[i]);
        }
    }

}

public class mystack {
    public static void main(String[] args) {
        myStack ob = new myStack();
        /*ob.push(4);
        ob.show();
        ob.push(7);
        ob.show();*/
        int a[];
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        int i =0;
        int n = sc.nextInt();
        for(i=0;i<n;i++)
        {
           a[i] = sc.nextInt();
           ob.push(a[i]);
           //ob.pop();
        }
        //System.out.println("Popped: " + ob.pop());
        ob.show();
    }
}
