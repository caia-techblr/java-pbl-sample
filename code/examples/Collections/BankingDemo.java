import java.util.*;

class NameComparator implements Comparator<Account> {  
  public int compare(Account  a1,Account a2){  
    //Account a1=(Account)o1;  
    //Account a2=(Account)o2;  
    return a1.accountName.compareTo(a2.accountName);  
  }  
}  

class Account implements Comparable<Account> {
  int accountId;
  String accountName;
  double accountBalance;
  
  public Account() {
    accountBalance=0;
  }
  public Account(int id,String name,double balance) {
    accountId=id;
    accountName=name;
    accountBalance=balance; 
  }
  public Account(Account ref) {
    accountId=ref.accountId;
    accountName=ref.accountName;
    accountBalance=ref.accountBalance;
  }
  public void credit(double amount) {
    accountBalance+=amount;
  }
  public void debit(double amount) {
    accountBalance+=amount;
  }
  public double balance() {
    return accountBalance;
  }
  public void display() {
    System.out.println("id="+accountId+",name="+accountName+",balance="+accountBalance);
  }  
  public boolean equals(Account ref) {
    return accountId==ref.accountId;
  }
  public int compareTo(Account ref) {
    return accountName.compareTo(ref.accountName);
  }
};
class Banking {
  List<Account> accounts;

  public Banking() {
    accounts=new ArrayList<Account>();
  }
  public void addAccount(int id,String name, double balance) {
    accounts.add(new Account(id,name,balance));
  }
  public void removeAccount(int id) {
    accounts.remove(new Account(id,"",0));
  }
  public void displayAll() {
    //for(Account ref:accounts)
    //   ref.display();
    Iterator iter=accounts.iterator();
    while(iter.hasNext()) {
      iter.next();
      Account ref=(Account)iter;      
      ref.display();      
    }
        
  }
  public void sortByName() {
    //Collections.sort(accounts);
    Collections.sort(accounts,new NameComparator());
  }
}
