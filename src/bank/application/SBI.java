package bank.application;

import java.util.UUID;

public class SBI implements Bank_interface{
    String name;
    String accountNo = UUID.randomUUID().toString();;
    String password;
    String balance;

    public SBI(String name, String password, String balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    @Override
    public String Checkbalance( String password) {
        if( this.password.equals(password)){
            return "Your available balance is : "+this.balance;
        }
        return "Incorrect password";
    }

    @Override
    public String addMoney(String password, int money) {
        if(this.password.equals(password)){
            balance = "" + (Integer.parseInt(balance) + money);
            return "Money added successfully!";
        }
        return "User Password invalid";
    }

    @Override
    public String withdrawMoney( String password, int money) {
        if(this.password.equals(password)){

            if(Integer.parseInt(this.balance) > money){
                balance =""+ (Integer.parseInt(this.balance) - money);
                return "Money Withdraw Successfully";
            }
            return "Insufficient Balance!";
        }
        return "Incorrect Details";
    }

    @Override
    public String changePassword(String oldpassword, String newPassword) {
        if(this.password.equals(oldpassword)){
            this.password = newPassword;
            return "Password changed Successfully";
        }
        return "Password Entered Incorrect";
    }
}
