package arrayObj;

public class BookTestDrive {
    public static void main(String[] args) {

//        new dog array
        Book[] myBook = new Book[3];

//        dog reference variables
        myBook[0] = new Book();
        myBook[1] = new Book();
        myBook[2] = new Book();

        myBook[0].title = "Title 1";
        myBook[1].title = "Title 2";
        myBook[2].title = "Title 3";

        myBook[0].author = "Author 1";
        myBook[1].author = "Author 2";
        myBook[2].author = "Author 3";

        int c = 0;
        while (c < myBook.length){
            System.out.println("Book " + myBook[c].title + " by " + myBook[c].author);
            c++;
        }
    }
}
