
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilyass
 */
public class Rules {
    //Discount class
    private int specialVoucher;
    private boolean specialTshirt;
    //2-for-1 special on VOUCHER items. 
    public int voucherDiscount(List<Item> shoppingCart,String item){
        int countVoucher=0;
        //We loop though the products in the cart and we count
        //the number of vouchers that are there
        for (Item element : shoppingCart) {
            if(element.getCode().equals(item)){
                countVoucher++;
            }
        }
        //If we have 5 voucher items ,we will count only 3 of them
        //If we have 4 voucher items, we count 2  
        //Even number of voucher items
        if(countVoucher % 2 == 0){
            specialVoucher = countVoucher/2;
            return specialVoucher;
        }else {//odd number
            specialVoucher = (countVoucher/2)+1;
            return specialVoucher;
        }
    }
    // Getter --> number od voucher items taht we count 
    //for the total price of the shopping cart
    public int getVoucherDiscount() {
        return specialVoucher;
    }
    //If you buy 3 or more TSHIRT items, the price per unit should be 19.0
    public boolean tshirtDiscount(List<Item> shoppingCart,String item){
        int countTshirt=0;
        //We loop though the products in the cart and we count
        //the number of tshirts that are there
        for (Item element : shoppingCart) {
            if(element.getCode().equals(item)){
                countTshirt++;
            }
        }
        if(countTshirt>=3){
            specialTshirt = true;
            return specialTshirt;
        }else{
            specialTshirt = false;
            return specialTshirt;
        }
        
    }
    // Getter --> true if we do discount and false if not
    public boolean getTshirtDiscount() {
        return specialTshirt;
    }
}
