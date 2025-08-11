package com.wipro.oops;

public class Restaurant {
	    String name;
	    String menu;
	    int orderNum;
	    double price;

	    
	    public Restaurant() {}

	   
	    public Restaurant(String name, String menu, int orderNum, double price) {
	        this.name = name;
	        this.menu = menu;
	        this.orderNum = orderNum;
	        this.price = price;
	    }

	    // Getters and Setters


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getMenu() {
			return menu;
		}


		public void setMenu(String menu) {
			this.menu = menu;
		}


		public int getOrderNum() {
			return orderNum;
		}


		public void setOrderNum(int orderNum) {
			this.orderNum = orderNum;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}
		public String toString() {
	        return "Restaurant [Name=" + name + ", Menu=" + menu + ", Ordernum=" + orderNum + ", Price=" + price + "]";
	    }
	}


