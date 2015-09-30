package com.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class CollectionsTask {

	private static Scanner input;

	public static void main(String[] args) throws IOException
	{
		
		ArrayList <CollectionTask1> al = new ArrayList<CollectionTask1>();
		CollectionTask1 obj = null; //Creating object for CollectionTask1
		
		for (int i=0; i<args.length;i++)
		{
			obj = new CollectionTask1(i, args[i]);
			al.add(obj);
        }
		for (int j=0; j<args.length;j++)
		{
			
			System.out.println( al.get(j).id +" "+al.get(j).name);
        }
		
		System.out.println("Enter the index of the ArrayList you want to delete");
		
		input = new Scanner(System.in);
		String a = input.nextLine();
		
		int k = Integer.parseInt(a);
		
		if( k < al.size() )
		{
			al.remove(k-1);
		}
	      
		for (int j=0; j<args.length;j++)
		{
			System.out.println( al.get(j).id +" "+al.get(j).name);
        }
		 
		}
	}


