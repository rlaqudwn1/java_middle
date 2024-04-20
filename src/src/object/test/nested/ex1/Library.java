package object.test.nested.ex1;

public class Library {
    private Book[] book;
    private int bookCount;

    public Library(int size) {
        book= new Book[size];
        bookCount=0;
    }

    public void addBook(String title, String author) {
        if (bookCount < book.length) {
            book[bookCount++] = new Book(title, author);
        } else System.out.println("도서관 저장 공간이 부족합니다");

    }

    public void showBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: "+book[i].title+", 저자: "+book[i].author);
        }
    }

    class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

}
