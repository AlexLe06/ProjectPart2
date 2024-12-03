package org.example;

//Created class CreditCard
public class CreditCard {
    //Initialized all data fields
    private Person owner;
    private Money creditLimit;
    private Money balance;

    //Created the CreditCard constructor
    public CreditCard(Person newCardHolder, Money limit){
        this.balance = new Money(0);
        this.creditLimit = limit;
        this.owner = newCardHolder;
    }

    //Created getter method that returns balance
    public Money getBalance(){
        return balance = new Money(balance);
    }

    //Created getter method that returns CreditLimit
    public Money getCreditLimit(){
        return creditLimit = new Money(creditLimit);
    }

    //Created getter method that returns personal info
    public String getPersonals(){
        return owner.toString();
    }

    //Created method that adds charges to the credit balance
    public void charge(Money amount){
        if (creditLimit.compareTo(balance.add(amount)) < 0)
            System.out.println("Exceed credit limit");
        else
            balance = (balance.add(amount));
    }

    //Created method that subtracts money from the credit balance
    public void payment(Money amount){
        balance.subtract(amount);
    }
}
