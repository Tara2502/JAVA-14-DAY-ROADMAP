package Library.model;

public class Loan {
    private Book book;
    private Member member;
    private int loanDays;

    public Loan(Book book, Member member, int loanDays) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null");
        }
        if (member == null) {
            throw new IllegalArgumentException("member cannot be null");
        }
        if (loanDays <= 0) {
            throw new IllegalArgumentException("Loan days must be positive");
        }
        this.book = book;
        this.member = member;
        this.loanDays = loanDays;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public int getLoanDays() {
        return loanDays;
    }

    public void displayLoanInfo() {
            System.out.println(member.getName() + " borrowed \"" + book.getTitle() + "\" for " + loanDays + " days.");

        }
    }

