import java.util.ArrayList;

public class User {
    private String email;
    private String password;
    private String fullName;
    private int balance;
    private ArrayList<Ticket> ticketList;
    private static final int MAX_TICKET = 20;

    public User(String email, String password, String fullName) {
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.balance = 0;
        this.ticketList = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public int getBalance() {
        return balance;
    }

    public boolean addTicket(Ticket ticket) {
        if (ticketList.size() >= MAX_TICKET) {
            System.out.println("Maksimal Limit Tiket");
            return false;
        }
        ticketList.add(ticket);
        System.out.println("Tiket Berhasil");
        return true;
    }

    public void displayTicket() {
        for (Ticket ticket : ticketList) {
            System.out.println("Movie: " + ticket.getMovie().getTitle() + ", Studio: " + ticket.getStudioNumber() + ", Price: " + ticket.getPrice());
        }
    }

    public boolean cekUser(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public boolean topUpBalance(int uang) {
        if (uang <= 0) {
            System.out.println("Top up gagal silahkan ulangi kembali");
            return false;
        }
        balance += uang;
        System.out.println("top up telah berhasi, total uang " + balance);
        return true;
    }
}
