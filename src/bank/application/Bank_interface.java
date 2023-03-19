package bank.application;

public interface Bank_interface {
    public String Checkbalance(String password);
    public String addMoney(String password,int money);
    public String withdrawMoney(String password,int money);
    public  String changePassword(String oldpassword,String newPassword);

}
