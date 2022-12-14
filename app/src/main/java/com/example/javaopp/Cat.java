package com.example.javaopp;

import android.util.Log;

public class Cat {
    int age;
    String name;
    String breed;


    public Cat(){

    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public void talk(){
        Log.i("talk()", "Meow! My name is " + name + ", and I'm " + age + " years old.");
    }

}
