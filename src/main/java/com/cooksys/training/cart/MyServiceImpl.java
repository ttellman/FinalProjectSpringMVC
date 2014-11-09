package com.cooksys.training.cart;
public class MyServiceImpl implements MyService {
    private ShoppingCart shoppingCart;

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
    
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    
    public void addItem() {
        shoppingCart.addItem();
    }
}