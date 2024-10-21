// Java Program to remove the duplicate entries from 
// collection using HashSet 

import java.util.ArrayList; 
import java.util.HashSet; 

class lass{ 
	public static void main(String[] args) 
	{ 
		// making the collection object 
		ArrayList<String> collection = new ArrayList<>(); 

		// adding the elements to the collection 
		collection.add("Geeks"); 
		collection.add("For"); 
		collection.add("Geeks"); 
		collection.add("Internship"); 
		collection.add("Internship"); 
		collection.add("2021"); 
		collection.add("2021"); 

		// Displaying the collection elements 
		System.out.println( 
			"Displaying the initial collection\n"); 
		System.out.println(collection); 

		// HashSEt for deleting duplicate entries 
		// in the collection by passing collection 
		// in the constructor of the HashSet 
		HashSet<String> hashSet = new HashSet<>(collection); 

		// Displaying the HashSet 
		System.out.println("\nDisplaying the HashSet\n"); 
		System.out.println(hashSet); 

		// clearing all the elements of the collection 
		collection.clear(); 

		// adding all the elements back 
		// to the collection from HashSet 
		collection.addAll(hashSet); 

		// Displaying the collection 
		System.out.println( 
			"\nDisplaying the collection after deleting duplicates entries\n"); 
		System.out.println(collection); 
	} 
}
