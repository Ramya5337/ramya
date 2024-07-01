class BankAccount
{
int amt=10000;
BankAccount()
{
System.out.println("savings account");
}
BankAccount(int a)
{
System.out.println("cheking account");
}
void checkbalance()
{
System.out.println("balance in the account is "+amt);
}
void deposit(int n)
{
amt=amt+n;
System.out.println("balance in the account after deposit "+amt);
}

void withdraw(int m)
{
amt=amt-m;
System.out.println("balance in the account after withdrawng "+amt);
}
public static void main(String args[])
{
BankAccount b=new BankAccount();
b.checkbalance();
b.withdraw(2000);
b.deposit(3000);
BankAccount b1=new BankAccount();
}
}

