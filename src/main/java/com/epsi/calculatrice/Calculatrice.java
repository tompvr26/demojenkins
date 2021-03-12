package com.epsi.calculatrice;

public class Calculatrice {
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a, int b){
        return a - b;
    }
    public int mul(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int isPair(int a){
        return a % 2;
    }
    public boolean isPremier(int a){
        if(a<=1){
            return false;
        }

        int i = 2;
        while(i != a)
        {
            if (a % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
