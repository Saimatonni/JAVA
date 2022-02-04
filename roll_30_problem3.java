class card{
    private String books_title;
    private String author;
    private int numberofcopy;
    public card(){
      books_title = "comedy";
      author = "saima";
      numberofcopy = 10;
    }
    
    public void set(String n,String m, int a)
    {
        this.books_title = n;
        this.author = m;
        this.numberofcopy = a;

    }
    public void show()
    {
        System.out.println(books_title);
        System.out.println(author);
        System.out.println(numberofcopy);
    }

} 
public class problem3 {
    public static void main(String args[]){
        card willshow = new card();
        willshow.show();
    }
    
}
