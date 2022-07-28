public class Bank {
    private long money = 0;
    private int commision = 100;
    private boolean isOfficial = false; //является ли банк государственным

    public boolean isOfficial() {
        return isOfficial;
    }

    public void setOfficial(boolean official) {
        isOfficial = official;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long neMmoneyAmount) {
        long newMoneyAmount = 0;
        if(newMoneyAmount > 0){
            money = newMoneyAmount;
    }}
}
