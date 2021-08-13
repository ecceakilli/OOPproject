package com.eceakilli.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //classtaki propertyleri cagırdık.Constructor kullanımı
        User myUser=new User("ECE","AKILLI");
        System.out.println(myUser.name);

        //Encapsulation
        Musician musician=new Musician("Ece","guitar",25);
        musician.setAge(60);
        System.out.println(musician.getAge());

        //Inheritance
        SuperMusician ece=new SuperMusician("ece","guitar",25);
        System.out.println(ece.getInstrument());
        System.out.println(ece.sing());

        //Polymorphism
            //Static Polymorphism
        Math math=new Math();
        System.out.println(math.sum());
        System.out.println(math.sum(5,9));
            //Dinamic Polymorphism
        Animal myAnimal=new Animal();
        myAnimal.sing();

        Dog barley=new Dog();
        barley.test();
        barley.sing();

        //Abstract --diğer sınıflar extend edebilsin diye var
        Piano myPiano=new Piano();
        myPiano.brand="yamaha";
        myPiano.digital=true;
        myPiano.info();



    }
}