public class Textbook extends Book
{
    private int edition;

    public Textbook(String title, double price, int edition)
    {
        super(title, price);
        this.edition = edition;
    }

    
}