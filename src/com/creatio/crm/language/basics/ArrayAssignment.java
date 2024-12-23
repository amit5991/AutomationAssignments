package com.creatio.crm.language.basics;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][][] supmar = new String[2][4][5];
		
		supmar[0][0]= new String []{"Cola","Orange Juice","Lemonade","Green Tea","Black Coffee"};
		supmar[0][1]= new String []{"Popcorn","Trail Mix","Beef Jerky","Salted Nuts","Rice Cakes"};
		supmar[0][2]= new String []{"Cottage Cheese","Heavy Cream","Ice Cream","Parmesan Cheese","Eggnog"};
		supmar[0][3]= new String []{"Apples","Bananas", "Carrots","Potatoes","Onions"};
		
		supmar[1][0]= new String []{"Cola","Orange Juice","Lemonade","Green Tea","Black Coffee"};
		supmar[1][1]= new String []{"Popcorn","Trail Mix","Beef Jerky","Salted Nuts","Rice Cakes"};
		supmar[1][2]= new String []{"Cottage Cheese","Heavy Cream","Ice Cream","Parmesan Cheese","Eggnog"};
		supmar[1][3]= new String []{"Apples","Bananas", "Carrots","Potatoes","Onions"};
		
		
		
		
		System.out.println("Groceries - Fruits, Third Product: " + supmar[0][0][0]); 
		System.out.println("Electronics -: " + supmar[1][1][1]);
		
		

		String[][][] supmarket = new String[2][4][5];
		
		supmarket[0][0][0]= "Cola";
		supmarket[0][0][1]="Orange Juice";
		supmarket[0][0][2]="Lemonade";
		supmarket[0][0][3]="Green Tea";
		supmarket[0][0][4]="Black Coffee";
		
		supmarket[0][1][0]= "Popcorn";
		supmarket[0][1][1]="Trail Mix";
		supmarket[0][1][2]="Beef Jerky";
		supmarket[0][1][3]="Salted Nuts";
		supmarket[0][1][4]="Rice Cakes";
		
		
		supmarket[0][2][0]= "Cottage Cheese";
		supmarket[0][2][1]="Heavy Cream";
		supmarket[0][2][2]="Ice Cream";
		supmarket[0][2][3]="Parmesan Cheese";
		supmarket[0][2][4]="Eggnog";
		
		
		supmarket[0][3][0]= "Apples";
		supmarket[0][3][1]="Bananas";
		supmarket[0][3][2]="Carrots";
		supmarket[0][3][3]="Potatoes";
		supmarket[0][3][4]="Onions";
		
		System.out.println("Groceries - Fruits, Third Product: " + supmarket[0][0][0]); // "Orange"
		
		
		
				
	}

}
