package test;

public class Library {
    Book[] books;
    int bookCount;


    public Library(int size) {
        books = new Book[size];
        bookCount=0;
    }

    public void addBook(String title, String author) {
        if (bookCount >= books.length) {

            System.out.println("도서관 저장 공간이 부족합니다");
            return;
        }

        books[bookCount++]=new Book(title,author);
    }

    public void showBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println("도서 제목: " + books[i].title + " 저자: "+books[i].author);
        }
    }

    private class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
