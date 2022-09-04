/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilyass rezquellah
 */
public class Checkout {
    private int specialVoucher;
    private boolean specialTshirt;
    public Checkout(){
    
    }
    //The Checkout constructor receives a pricing_rules object
    public Checkout(Rules rules){
        specialVoucher = rules.getVoucherDiscount();
        specialTshirt = rules.getTshirtDiscount();
    }
    //Scan method
    public float scanItem(Item item){
        //If the item is voucher and the number of voucher items is not 0
        if(item.getCode().equals("Voucher") && specialVoucher!=0){
            specialVoucher--;
            return  item.getPrice();
        }else if (item.getCode().equals("Voucher")){
            return 0f;
        }else if(item.getCode().equals("Tshirt") &&specialTshirt){
            return 19.0f;
        }else{
            return  item.getPrice();
        }
    }
}
