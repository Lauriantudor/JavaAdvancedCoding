package ro.sda.advanced._4_arrayList;

public class Main {
    public static void main(String[] args) {

        Bank ing = new Bank("ING Bank");
        ing.addBranch("Piata Victoriei");
        ing.addBranch("Piata Unirii");
        ing.addBranch("Piata Unirii");

        ing.addCustomer("Piata Victoriei","Catalin",10.2);
        ing.addCustomer("Piata Victoriei","Catalin",50000.2);
        ing.addCustomer("Piata Victoriei","Mihai",20.1);
        ing.addCustomer("Piata Unirii","Andrei",100);
        ing.addCustomer("Piata Unirii","Ana",50);
        ing.addCustomer("Piata Unirii","Andrei",50);

        ing.addCustomerTransaction("Piata Victoriei","Mihai",34);
        ing.addCustomerTransaction("Piata Unirii","Mihai",200);
        ing.addCustomerTransaction("Piata Unirii","Andrei",40);
        ing.addCustomerTransaction("Piata Unirii","Ana",40);

        System.out.println("-----------------------------------");

        ing.listAllCustomers("Piata Unirii", true);
        ing.listAllCustomers("Piata Victoriei", true);


    }
}
