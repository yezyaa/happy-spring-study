package com.happy.happytest.yezy.exceptions;

public class UsernameExistException extends Status400Exception {
    public UsernameExistException() {
        super("username not unique");
    }
}
