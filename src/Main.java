
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilyass rezquellah
 */
public class Main {
    //Coding Challenge
    public static void main(String[] args) {
        float totalPriceCart = 0;
        Item firstItem = new Item("Voucher","Gift Card",5.00f);
        Item secondItem = new Item("Tshirt","Summer T-Shirt",20.00f);
        Item thirdItem = new Item("Pants","Summer Pants",5.00f);
        
        //New list
        ArrayList<Item> listItems = new ArrayList<Item>();
        //We add the products to the list
        listItems.add(firstItem);
        listItems.add(secondItem);
        listItems.add(thirdItem);
        
        Checkout atm = new Checkout();
        //We scan each product and we add thr price of each one of them to the variable "totalPriceCart"
        for(Item name : listItems){
            totalPriceCart =  totalPriceCart + atm.scanItem(name);
        }
        //We print the total amount to be paid
        System.out.println(" - Total: " + totalPriceCart+"$");
        
    }
    
}
