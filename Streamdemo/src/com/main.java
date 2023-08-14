package com;
import java.util.*;
import java.util.stream.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<customer> list=new ArrayList();
list.add(new customer("peter","mysuru","Jio",1,300));
list.add(new customer("Ray","mysuru","Vodafone",3,700));

list.add(new customer("sam","bengaluru","Airtel",5,1000));

list.add(new customer("Erric","Hassan","BSNL",1,200));

list.add(new customer("Mathew","Mumbai","Airtel",7,600));
Stream<customer> stream=list.stream();

//stream.filter((e)->e.getPlanrange()>3).forEach(System.out::println);
//stream.filter((e)->e.getAmount()>500).forEach(System.out::println);
//stream.filter((e) -> e.getLocation().equals("Mumbai")).forEach(System.out::println);
//stream.filter((e) -> e.getLocation().equals("Mumbai")).map(e->e.getAmount()*20/100).forEach(System.out::println);
//System.out.println(stream.allMatch(e->e.getPlanrange()>300));
//System.out.println(stream.anyMatch(e->e.getPlanrange()>600));

	}}
	


