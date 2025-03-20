public class Textbook extends Book
{
    private int edition;

    public Textbook(String title, double price, int edition)
    {
        super(title, price);
        this.edition = edition;
    }

    public int getEdition()
    {
        return edition;
    }

    public String getBookInfo()
    {
        return super.getBookInfo() + "-" + edition;
    }

    public boolean canSubstitudeFor(Textbook book)
    {
        if (this.edition >= book.edition && this.getTitle().equals(book.getTitle()))
        {
            return true;
        }
        return false;
    }
}