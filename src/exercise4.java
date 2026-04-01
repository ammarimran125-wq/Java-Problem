public class exercise4 {
   static class Library{
       String[] books;
       int no_of_books = 0;
       Library(){
           this.books = new String[100];
           this.no_of_books = 0;

       }
       void addBooks(String book){
           this.books[no_of_books] = book;
           no_of_books++;
           System.out.println(book + " has been added!");
       }
       void showAvailableBooks(){
           System.out.println("Available books are:");
           for(String book : this.books){
               if (book==null){
                   continue;
               }
               System.out.println("* " + book);
           }
       }
       void issueBook(String book){
           for (int i =0; i<this.books.length; i++){
               if (this.books[i].equals(book)){
                   System.out.println("The book has been Issued!!!");
                   this.books[i] = null;
                   return;
           }
               System.out.println("* " + book);
           }
           System.out.println("This book does not exist");
       }
   }












    public static void main(String[] args) {
        //you have to implement a library using java class library
        //Methods: addBook, issueBook, returnBook, showAvailableBooks
        //Properties: Array to store the available books,array to store the issued books
        Library centralLibrary = new Library();
        centralLibrary.addBooks("Think ang grow Rich");
        centralLibrary.addBooks("Algorithms");
        centralLibrary.addBooks("C++");
        centralLibrary.showAvailableBooks();
        centralLibrary.issueBook("Algorithm");
    }
}
