public class Book {
    private String bookName;
    private int bookId;
    private int bookPrice;

    public Book(String bookName, int bookId, int bookPrice) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void editBookPrice(int bookPrice){
        setBookPrice(bookPrice);

    }
    @Override
    public String toString(){
      return String.format("bookName: %s,bookId: %d,bookPrice: %d",bookName,bookId,bookPrice)  ;
    }
}
