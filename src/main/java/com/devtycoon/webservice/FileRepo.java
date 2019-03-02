package com.devtycoon.webservice;

public class FileRepo implements Repo{
    @Override
    public void saveToRepo() {

        System.out.println("파일에 저장합니다.");
    }
}
