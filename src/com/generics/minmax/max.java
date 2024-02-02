package com.generics.minmax;

public class max {

    public static void main(String[] args) {
        findmaxi(50,45,30);
        findmaxi(45,50,30);
        findmaxi(30,45,50);
        findmaxf(50.2f,45.6f,30.9f);
        findmaxf(45.6f,50.2f,30.9f);
        findmaxf(45.6f,30.9f,50.2f);
    }
    private static void findmaxi(int n1,int n2,int n3) {
        Integer temp = n1;
        if(temp.compareTo(n2)<0){
            temp = n2;
        }
        if(temp.compareTo(n3)<0){
            temp = n3;
        }
        System.out.println(temp);
    }

    private static void findmaxf(Float n1, Float n2,Float n3){
        Float temp = n1;
        if(temp.compareTo(n2)<0){
            temp = n2;
        }
        if(temp.compareTo(n3)<0){
            temp = n3;
        }

        System.out.println(temp);
    }
}
