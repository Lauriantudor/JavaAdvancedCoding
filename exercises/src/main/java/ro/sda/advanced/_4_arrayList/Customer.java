package ro.sda.advanced._4_arrayList;

import java.util.*;

public class Customer {
    private String name;
    private List<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public void addTransaction(Double transaction){
        this.transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public List<Double> getTransactions() {
        // return new ArrayList<>(transactions);
        return Collections.unmodifiableList(transactions);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}