package com.devtycoon.webservice;

public class DBRepo implements Repo{
    @Override
    public void saveToRepo() {
        System.out.println("디비에 저장합니다.");
    }
}
