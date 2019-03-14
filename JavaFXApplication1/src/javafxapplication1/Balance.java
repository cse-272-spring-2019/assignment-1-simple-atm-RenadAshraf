
package javafxapplication1;


public class Balance {
    
    private double balance=0;
        choice ch;

		
		public int i=0;
		char type;
		String[] h= new String[20];
		int k=0;
        
		
	public double getCurrentBalance()
	{
		type='g';
		setHistory(balance, type);
                return balance;
	}

	public boolean checkNumber(String num) {
        String correct="1234";
        
        return (num.equals(correct));
        }
	

	public boolean Withdraw(double amount) {
		if (amount<balance)
		{
			balance=balance-amount;
			type='w';
                    if (amount !=0)
                    {
			setHistory(amount,type);
                    }
                      return true;
		}
		else 
                    return false;
		
	}

	public void Deposit(double amount) {
		balance=balance+amount;
		type='d';
                if (amount !=0)
                {setHistory(amount,type);}
	}
	
	public void setHistory(double number, char t) {
            if(i<5)
            {if (t=='d')
		{
			h[i]="Deposit: "+number;
		}
		
		else if (t=='w')
		{
			h[i]="Withdraw: "+number;
		}
		
		else if (t=='g')
		{
			h[i]="Balance Inquiry "+number;
		}
		
		i++;
		k=i;
	}
            else 
            {
                h[0]=h[1];
                h[1]=h[2];
                h[2]=h[3];
                h[3]=h[4];
                i--;
                k=i;
                setHistory(number,t);
                
            }
        }

	public String prev()
	{
		k--;
                if (k<0)
                    return ("No More in History");
                            else return h[k];
		
	}

	public String next()
	{
            k++;
            if (k>4)
                return("No Newer Transactions");
            else return h[k];

	}
    
}