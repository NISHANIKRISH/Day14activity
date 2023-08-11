package com;

	import java.util.Comparator;
	import java.util.function.BinaryOperator;

	class Item {
		String itemName;
	    double price;

	    public Item(String itemName, double price) {
	        this.itemName = itemName;
	        this.price = price;
	    }

	    public double getPrice() {
	        return price;
	    }
	}

	public class bifuncex {
	    public static void main(String[] args) {
	        Item item1 = new Item("coffee", 100);
	        Item item2 = new Item("Tea", 150);
	        Item item3 = new Item("Alcohol", 120);

	        BinaryOperator<Item> maxPriceItem = BinaryOperator.maxBy(Comparator.comparingDouble(Item::getPrice));

	        Item itemWithMaxPrice = maxPriceItem.apply(item1, maxPriceItem.apply(item2, item3));
	        System.out.println("Item with maximum price: "+ itemWithMaxPrice.price +"\n"+"itemName:"+itemWithMaxPrice.itemName);
	    }
	}
