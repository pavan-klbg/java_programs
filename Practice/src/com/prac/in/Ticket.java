package com.prac.in;

import java.util.Scanner;

public class Ticket {

	int available=100;


	public int  bookTicket(int book){
		return available-book;

	}


	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter number of want to book");
			int book=s.nextInt();

			Ticket t=new Ticket();

			System.out.println("your ticket booked successfully*****,Available tickets are:"+t.bookTicket(book));


		}

	}
