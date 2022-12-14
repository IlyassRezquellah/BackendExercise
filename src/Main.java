
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
        Item thirdItem = new Item("Pants","Summer Pants",7.50f);
        
        //New list
        ArrayList<Item> listItems = new ArrayList<Item>();
        //We add the products to the list
        listItems.add(firstItem);
        listItems.add(secondItem);
        listItems.add(thirdItem);
        //The first item of the cart is random
        Collections.shuffle(listItems);
        //-------------------
        //Collections only works with List and not with arraylist
        List<Item> shoppingCart = new ArrayList<>(listItems);
        //With this for loop we add x number of each element in the list
        for (Item element : listItems) {
            int randomNumber = getRandomNumber(0,3);
            shoppingCart.addAll(Collections.nCopies(randomNumber, element));
        }
        System.out.print("Items: ");
        //We print the content of the random generated shopping cart
        for (Item element : shoppingCart) {
            System.out.print(element.getCode().toUpperCase()+", ");
        }
        //-------------------
        Rules pricing_rules =  new Rules();
        //We apply the rules
        pricing_rules.voucherDiscount(shoppingCart, "Voucher");
        pricing_rules.tshirtDiscount(shoppingCart, "Tshirt");
        
        Checkout atm = new Checkout(pricing_rules);
        
        
        //We scan each product and we add the price of each one of them
        //to the variable "totalPriceCart"
        for(Item name : shoppingCart){
            //The Checkout object has a scan method that receives
            //one item at a time
            totalPriceCart =  totalPriceCart + atm.scanItem(name);
        }
        //We print the total amount to be paid
        System.out.println(" - Total: " + totalPriceCart+"$");
        
    }
    //min is inclusive and max is exclusive
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    
}
