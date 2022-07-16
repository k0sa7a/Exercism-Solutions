public class BankAccount{
  public int balance;
  public boolean accountOpened = false;

  public BankAccount(){

  }

  public void open() {
      this.accountOpened = true;
      balance = 0;
  }

  public void close() {
      this.accountOpened = false;
  }

  public int getBalance() throws BankAccountActionInvalidException{
      if(this.accountOpened == false){
          throw new BankAccountActionInvalidException("Account closed");
      }
      return this.balance;
  }

  public synchronized void deposit(int amount) throws BankAccountActionInvalidException{
      if(amount < 0){
          throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
      } else if (accountOpened == false){
          throw new BankAccountActionInvalidException("Account closed");
      }
      balance += amount;
  }

  public synchronized void withdraw(int amount) throws BankAccountActionInvalidException{
      if(balance == 0){
          throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
      } else if (amount < 0){
          throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
      } else if (amount > balance) {
          throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
      } else if (accountOpened == false){
          throw new BankAccountActionInvalidException("Account closed");
      }
          balance -= amount;
  }



}
