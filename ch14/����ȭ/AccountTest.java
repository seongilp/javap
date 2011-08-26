class Account {
  String name; 
  int total; 
	
  public Account(String s) {
    this.name = s;
  }
  public /*synchronized */void deposit(int money, String loc) {
    total += money;
    try{
    	Thread.sleep(1000);
    } catch(InterruptedException e){}
    System.out.println("[ " + loc + "] " + money + "�� �Ա��� [ �Ѿ�: " + total + "]");
  }
  public int getTotal(){
  	 return this.total;
  }
}

class CustomerThread extends Thread {        
  Account ac;
  public CustomerThread(Account ac, String s) {
   	super(s);
   	this.ac = ac;
  }
  public void run() {
    int ammount = (int)(Math.random()*1000);
   	ac.deposit(ammount, this.getName());         	
  }                    
}

class AccountTest {        
  static Account shop = new Account("���ͳ� ����");  
  public static void main(String[] args) {  
    CustomerThread[] at = new CustomerThread[5];

    at[0] = new CustomerThread(shop, "������");
    at[0].start();
    at[1] = new CustomerThread(shop, "������");
    at[1].start();
    at[2] = new CustomerThread(shop, "���ְ�");
    at[2].start();
    at[3] = new CustomerThread(shop, "��õ��");
    at[3].start();
    at[4] = new CustomerThread(shop, "���ΰ�");
    at[4].start();
  }     
}