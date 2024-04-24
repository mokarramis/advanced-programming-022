public class Wallet {
    private int credit=0;

    public Wallet (int credit){
        this.credit = credit ;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit ;
    }

    public String toString () {
        return String.valueOf(credit) ;
    }
    // public void deposit(){}

    // public void withdraw(){}
}
