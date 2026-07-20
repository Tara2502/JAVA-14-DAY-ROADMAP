package Library.service;

import Library.model.Book;
import Library.model.Loan;
import Library.model.Member;

public class LibraryDemo {
    public static void main(String[] args) {
        Book book=new Book("Atomic Habits","James Clear",200.00,"ISBN101");
        Member member=new Member(1,"Tara","Gold");
        book.displayBookInfo();
        member.sendNotification();

        Loan loan= new Loan(book,member,7);
        loan.displayLoanInfo();

    }
}
