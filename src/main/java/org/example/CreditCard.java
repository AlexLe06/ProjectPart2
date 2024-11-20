package org.example;

public class CreditCard {
    private Person owner;
    private Money creditLimit;
    private Money balance;

    public CreditCard(Person newCardHolder, Money limit){
        this.balance = new Money(0);
        this.creditLimit = limit;
        this.owner = newCardHolder;

    }
    public Money getBalance(){
        return balance = new Money(balance);
    }
    public Money getCreditLimit(){
        return creditLimit = new Money(creditLimit);
    }
    public String getPersonals(){
        return owner.toString();
    }
    public void charge(Money amount){
        if (creditLimit.compareTo(balance.add(amount)) < 0)
            System.out.println("Exceed credit limit");
        else
            balance = (balance.add(amount));
    }
    public void payment(Money amount){
        balance.subtract(amount);
    }
}
