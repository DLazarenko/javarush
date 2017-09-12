package com.javarush.task.task24.task2408;

import java.util.Date;

public class Dog implements Pet {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Sayable toSayable(final int i) {
        class DogPet extends SuperDog implements Sayable {

            @Override
            public String say() {
                if (i < 1) {
                    return getName() + " спит.";
                } else {
                    StringBuffer countA = new StringBuffer();
                    for (int j = 0; j < i; j++)
                        countA.append("а");
                    return getName() + " лает г" + countA + "в! " + formatter.format(new Date());
                }
            }

            private String getName() {
                return getSuperQuotes() + Dog.this.name + getSuperQuotes();
            }
        }
        return new DogPet();
    }
}