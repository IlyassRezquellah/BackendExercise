/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilyass rezquellah
 */
public class Item {
    private String code;
    private String name;
    private float price;
    
    public Item(String codeItem,String nameItem,float priceItem){
        code = codeItem;
        name = nameItem;
        price = priceItem;
    }
    
    // Getter
    public float getPrice() {
        return price;
    }
    // Getter
    public String getCode() {
        return code;
    }
}
