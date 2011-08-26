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
    System.out.println("[ " + loc + "] " + money + "ø¯ ¿‘±›»ƒ [ √—æ◊: " + total + "]");
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
  static Account shop = new Account("¿Œ≈Õ≥› ºÓ«Œ");  
  public static void main(String[] args) {  
    CustomerThread[] at = new CustomerThread[5];

    at[0] = new CustomerThread(shop, "∞≠≥≤∞Ì∞¥");
    at[0].start();
    at[1] = new CustomerThread(shop, "∏∂∆˜∞Ì∞¥");
    at[1].start();
    at[2] = new CustomerThread(shop, "¡¶¡÷∞Ì∞¥");
    at[2].start();
    at[3] = new CustomerThread(shop, "¿Œ√µ∞Ì∞¥");
    at[3].start();
    at[4] = new CustomerThread(shop, "±∏∑Œ∞Ì∞¥");
    at[4].start();
  }     
}