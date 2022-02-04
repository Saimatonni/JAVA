class two_d_points{
    private int x;
    private int y;
    public int sum;
    public two_d_points(){
      x = 10;
      y = 20;
    }
    
    public void add(int n,int m, int sum)
    {
        this.x = n;
        this.y = m;
        this.sum = sum;
        //System.out.println(sum)

    }
    public int result()
    {
        //System.out.println(add.sum());

        return x+y;
    }
    
} 
public class problem4 {
    public static void main(String args[]){
        two_d_points sumo = new two_d_points();
        //sumo.result();
        System.out.println("sum is:");
        System.out.println(sumo.result());
    }
    
}
