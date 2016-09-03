/**
 * Created by joshuakeough on 9/3/16.
 */
public class Atm {
    Main main = new Main();

    String atmOption;

    public void balance() {
        System.out.println("Your Balance is $" + main.members.get(main.name));
        chooseOption();
    }
    public void delete() {
        main.members.remove(main.name);
    }

    public void withdraw() {
        boolean a = true;
        while (a) {
            System.out.println("How much would you like to withdraw?");
            int withdrawal;
            withdrawal = Integer.parseInt(main.scanner.nextLine());
            if (withdrawal <= main.members.get(main.name)) {
                main.balance = main.members.get(main.name) - withdrawal;
                System.out.println("Thanks please take your cash. Your remaining balance is $" + main.balance);
                a = false;
                main.members.put(main.name, main.balance);
                chooseOption();
            } else if (withdrawal > main.members.get(main.name)) {
                System.out.println("Sorry funds not available please try again.");
            }
        }

    }

        public void deposit() {
        System.out.println("How much would you like to deposit?");
        main.balance = Integer.parseInt(main.scanner.nextLine()) + main.members.get(main.name);
        System.out.println("Your money has been deposited!");
        main.members.put(main.name,main.balance);
        chooseOption();
    }

    public void chooseOption() {
        System.out.println("Please enter an option!\n1. Check my balance.\n2. Deposit\n3. Withdraw.\n4. Delete.\n5. Cancel ");
        atmOption = main.scanner.nextLine();
        switch(atmOption) {
            case "1":
                balance();
                break;
            case "2":
                deposit();
                break;
            case "3":
                withdraw();
                break;
            case "4":
                delete();
                main.account.user();
                break;
            case "5":
                System.out.println("Thank you and please come again!");
                main.account.user();

                break;
            default:
                System.out.println(atmOption + " is not an option.");
                chooseOption();
        }

    }
}