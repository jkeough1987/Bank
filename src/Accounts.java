import java.util.HashMap;

/**
 * Created by joshuakeough on 9/3/16.
 */
public class Accounts {
    Main main = new Main();
    Atm atm = new Atm();

    int balance;
    String userName;


    public void newMember() {
        String memberName;
        System.out.println("Please enter your first name.");
        memberName = main.scanner.nextLine();
        System.out.println("Lets make a deposit! Please enter an amount.");
        balance = Integer.parseInt(main.scanner.nextLine());
        main.name = memberName;
        main.members.put(memberName, balance);
    }

    public void user() {
        System.out.println("Hello please enter your name.");
        userName = main.scanner.nextLine();
        boolean a = main.members.containsKey(userName);

        if(a) {
            System.out.println("Hello " + userName);
            main.name = userName;
            main.balance = main.members.get(main.name);

        } else {
            System.out.println("Ok it seems you do not have an account. Lets set one up!");
            newMember();

        }
    }


}
