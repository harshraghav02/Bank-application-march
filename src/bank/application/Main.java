package bank.application;

public class Main {
    public static void main(String[] args) {
        SBI account1 = new SBI("Harsh","1234","20000");
        String message = account1.addMoney("123",7999);
        System.out.println(message);
        System.out.println(account1.Checkbalance("1234"));
        String message1 = account1.addMoney("1234",7999);
        System.out.println(message1);
        System.out.println(account1.Checkbalance("1234"));
    }
}
