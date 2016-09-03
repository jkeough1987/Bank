import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);
    public Atm  atm = new Atm();
    public Accounts account = new Accounts();
    public HashMap<String, Integer> members = new HashMap<>();
    public String name;
    public int balance;


    public void main(String[] args) {
        account.user();
        atm.chooseOption();
    }
}
