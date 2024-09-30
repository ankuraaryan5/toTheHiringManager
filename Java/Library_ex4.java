import java.util.Scanner;

class Library{
    String [] books;
    int no_of_books;
    Library(){
        this.books= new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been added");
    }
    void showBooks(){
        System.out.print("Availabe books are\n");
        for(String Book:this.books){
            if (Book==null) {
            // break; 
            continue; //     just skip this index don't stop the loop
            }
            System.out.print(Book +" ");
        }
        System.out.println();
    }
    void issueBook(String book){
        for(int i=0; i<this.books.length;i++){
            if (this.books[i].equals(book)) {
                System.out.println(book+" has been issued");
                this.books[i]=null;
                return ;
            }
        }
        System.out.println(book+" does not exist");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class Library_ex4 {
    public static void main(String[] args) {
        // addBook, removeBook, issueBook, returnBook
        // availableBook, issuedBook, 
        Scanner newBook = new Scanner(System.in);
        Library library = new Library();
        for(int i =0; i< 3; i++){
            System.out.println("add a book ");
            library.addBook(newBook.next());
        }
        library.showBooks();
        library.issueBook("error");
        library.showBooks();
    }   
}
