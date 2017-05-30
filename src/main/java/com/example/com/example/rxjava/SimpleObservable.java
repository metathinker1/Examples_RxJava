package com.example.com.example.rxjava;


import io.reactivex.Observable;

/**
 * Created by robertwood on 5/29/17.
 */
public class SimpleObservable {
    String message;     // Must declare at class level to avoid lambda expression error: "message must be final or effectively final"

    public String getMessage() {
        message = "";
        Observable<String> observer = Observable.just("Hello");
        observer.subscribe(s -> message = s);
        return message;
    }


    public static void main(String[] args) {
        SimpleObservable tester = new SimpleObservable();

        String message = tester.getMessage();
        System.out.println("Message: " + message);
    }
}
