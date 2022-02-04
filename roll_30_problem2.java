class myemplyee{
    private String name;
    private int id;
    public myemplyee(){
      id = 45;
      name = "saima";
    }
    public String getname()
    {
        return name;
    }
    public void setsame(String n)
    {
        this.name = n;
    }
    public int getid()
    {
        return id;
    }
    public void setid(int b)
    {
        this.id = b;
    }

}
public class roll_30_problem2 {
   public static void main(String args[]){
       myemplyee test = new myemplyee();
       System.out.println(test.getname());
       System.out.println(test.getid());
   }
    
}
