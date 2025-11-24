package com.example.mavenproject1.genericsandfunctionalinterfaces;

import java.util.function.Predicate;

//import javax.annotation.processing.SupportedSourceVersion;

//generics interface that is now predicates using predicates

interface Test<T, T1> {
    public T1 f1(T x);
}

public class Demo5 {
    public static void main(String[] args) {
        Test<String, Integer> ob = (x) -> (x.length());
        System.out.println(ob.f1("santosh"));

        Predicate<Integer> ob1 = (x) -> (x % 2 == 0);
        if (ob1.test(3)) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }


}
