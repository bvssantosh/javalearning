package com.example.mavenproject1.genericsandfunctionalinterfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
//@FunctionalInterface
//interface Test2<T, T1> {
//    public T1 f1(T x);
//}
import java.util.function.Supplier;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Consumer<Integer> ob1 = (x) -> System.out.println("the value is"+x);//it prints
		  ob1.accept(3);
		  Supplier<Integer> ob2 = () -> 42;//it returns
		System.out.println(ob2.get());

		 BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		        System.out.println("Sum: " + sum.apply(10, 20));

		  }
	       
	}




