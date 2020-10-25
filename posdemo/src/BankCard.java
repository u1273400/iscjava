import java.util.Date;

public class BankCard {
    String pin="";
    String cardid="";
    Date expiry;

    public void setPin(String p){
        this.pin=p;
    }
    public String getPin() {
        return pin;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }
}
