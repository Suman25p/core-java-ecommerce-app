package com.ecommerce.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.ecommerce.exception.OutOfStockException;
import com.ecommerce.model.Products;

public class CartManagement {
	
	Products product;
	private HashMap<Products, Integer> cart = new HashMap<>();
	
	public void addToCart(Products product, int quantity)
            throws OutOfStockException {

        if (product == null)
            throw new IllegalArgumentException("Invalid product.");

        if (quantity <= 0)
            throw new IllegalArgumentException("Invalid quantity.");

        if (product.getStock() < quantity)
            throw new OutOfStockException("Stock not available.");

        int existingQty = cart.getOrDefault(product, 0);

        int totalRequested = existingQty + quantity;

        if (totalRequested > product.getStock()) {
            throw new OutOfStockException(
                    "Only " + product.getStock() +
                    " items available in stock. " +
                    "Already added: " + existingQty);
        }

        cart.put(product, totalRequested);
    }

	
	public void removeFromCart(Products product, int quantity) {

	    if (product == null) {
	        throw new IllegalArgumentException("Invalid product.");
	    }

	    if (quantity <= 0) {
	        throw new IllegalArgumentException("Quantity must be greater than zero.");
	    }

	    if (!cart.containsKey(product)) {
	        throw new IllegalArgumentException(product.getName() + " not in cart.");
	    }

	    int existingQty = cart.get(product);

	    if (quantity >= existingQty) {
	        cart.remove(product);
	        System.out.println("Product removed successfully from cart!");
	    } else {
	        cart.put(product, existingQty - quantity);
	        System.out.println("Product removed successfully from cart!");
	    }
	    
	}


	public void viewCart() {
		if (cart.isEmpty()) {
	        System.out.println("Your cart is empty!");

	    } else {
	    	cart.forEach((product, qty) -> {
	    	double subTotal = product.getPrice() * qty;
			
	    	System.out.println(product.getName() + " | Qty: " + qty + " | SubTotal: Rs. " + subTotal);
	    	});
		
	    }
	}
	
	public double calculateTotal() {
		double totalPrice = 0;
		
		Iterator<Map.Entry<Products, Integer>> iterator =
				cart.entrySet().iterator();
		
		while (iterator.hasNext()) {
	        Map.Entry<Products, Integer> entry = iterator.next();

	        Products product = entry.getKey();
	        int quantity = entry.getValue();

	        totalPrice += product.getPrice() * quantity;
	    }
		return totalPrice;
	}

	public void reduceStock() {
        cart.forEach((product, qty) ->
                product.setStock(product.getStock() - qty));
    }
	
	public void clearCart()
	{
		cart.clear();
	}
	
	public Map<Products, Integer> getCart(){
	    return new HashMap<>(cart);
	}
	
}
