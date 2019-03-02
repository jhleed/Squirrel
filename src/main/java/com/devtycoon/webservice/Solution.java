package com.devtycoon.webservice;

public class Solution {

    Repo repo;

    public Solution(Repo repo) {
        this.repo = repo;
    }

    public void doSomething(){
        repo.saveToRepo();
    }
}
