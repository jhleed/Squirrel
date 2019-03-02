package com.devtycoon.webservice;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution(new DBRepo());
        solution.doSomething();
    }
}
