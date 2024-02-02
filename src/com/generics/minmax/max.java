package com.generics.minmax;

public class max {
    Integer n1;
    Integer n2;
    Integer n3;
    public max(Integer n1,Integer n2,Integer n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public static void main(String[] args) {
        max tc1 = new max(50,45,30);
        findmaxi(50,45,30);
        max tc2 = new max(45,50,30);
        findmaxi(45,50,30);
        max tc3 = new max(30,45,50);
        findmaxi(30,45,50);

    }
    private static void findmaxi(int n1,int n2,int n3) {
        Integer temp = n1;
        if(temp.compareTo(n2)>0){
            temp = n1;
        }
        else if(temp.compareTo(n3)>0){
            temp = n2;
        }
        else{
            temp = n3;
        }
        System.out.println(temp);
    }
}
