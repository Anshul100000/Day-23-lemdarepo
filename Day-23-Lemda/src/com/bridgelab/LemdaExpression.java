package com.bridgelab;

import java.util.Objects;

public class LemdaExpression {
    interface HelloService {
        String hello(String firstname, String lastname);
    }

    public static void main(String[] args) {

        HelloService helloService=(String firstname, String lastname) ->
        { String hello="Hello " + firstname + " " + lastname; return hello; };
        System.out.println(helloService.hello(args[0], args[1]));


    }


}
