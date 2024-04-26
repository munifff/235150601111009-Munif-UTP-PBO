import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static boolean isLoggedIn = false;
    static String currentUser = "";
    static double userBalance = 0.0;

    public static void main(String[] args) {
        while (true) {
            showMainMenu();
            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    public static void showMainMenu() {
        System.out.println("-----------------------------------------------");
        System.out.println("UTP A Cinema");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Pick your choice : ");
    }

    public static void register() {
        System.out.println("--------------------------------------------------");
        System.out.println("Register to your system");
        System.out.print("Fullname: ");
        String fullname = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = input.nextDouble();
        input.nextLine(); 
        System.out.println("Successfully registered User!");
    }

    public static void login() {
        System.out.println("----------------------------------------------------");
        System.out.println("Login to our system");
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

       
        if (email.equals("user@example.com") && password.equals("password123")) {
            isLoggedIn = true;
            currentUser = email;
            userBalance = 100.0; 
            System.out.println("Login Success");
            Dashboard();
        } else {
            System.out.println("Login gagal. Email atau password salah.");
        }
    }

    public static void Dashboard() {
        while (isLoggedIn) {
            System.out.println("Welcome Aleksius Aurelia to UTP A Cinema!");
            System.out.println("1. Pesan tiket");
            System.out.println("2. Tampilkan tiket");
            System.out.println("3. Lihat studio");
            System.out.println("4. Lihat detail studio");
            System.out.println("5. Top up saldo");
            System.out.println("6. Logout");
            System.out.print("pick your choice ");
            int menuDashboard = input.nextInt();
            input.nextLine(); 

            switch (menuDashboard) {
                case 1:
                    pesanTiket();
                    break;
                case 2:
                    tampilkanTiket();
                    break;
                case 3:
                    lihatStudio();
                    break;
                case 4:
                    lihatDetailStudio();
                    break;
                case 5:
                    topUp();
                    break;
                case 6:
                    isLoggedIn = false;
                    currentUser = "";
                    userBalance = 0.0;
                    System.out.println("Logout berhasil.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    public static void pesanTiket() {
        
    }

    public static void tampilkanTiket() {
        System.out.println("List tiket yang sudah dipesan");
        System.out.println("Studio Number : ");
        System.out.println("Movie Name    : ");
    }

    public static void lihatStudio() {
        
    }

    public static void lihatDetailStudio() {
        
    }

    public static void topUp() {
        System.out.println("\n== Top Up Saldo ==");
        System.out.print("Masukkan jumlah saldo yang ingin ditambahkan: ");
        double amount = input.nextDouble();
        input.nextLine(); 
        userBalance += amount;
        System.out.println("Saldo berhasil ditambahkan. Saldo sekarang: " + userBalance);
    }
}
