public class Author {
    private String authorName;
    private String address;
    private  Book[] books;

    public Author(){
        this.books=new Book[10];
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String authorBooksInfo(){
        String bookInfo=" ";
        for (Book bk:books) {
            if(bk!=null){
                bookInfo +="_"+ bk.toString()+"\n";
            }
        }
        return bookInfo ;


    }
    @Override
    public String toString() {

        return String.format("authorName: %s,authorAddress: %s,");

    }
}
