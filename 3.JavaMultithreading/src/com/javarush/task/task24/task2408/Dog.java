package com.javarush.task.task24.task2408;

import javafx.scene.input.DataFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
1. В классе Dog должен быть реализован публичный метод toSayable с одним параметром типа int.
2. Метод toSayable должен возвращать объект типа Sayable.
3. Объект возвращаемый методом toSayable должен быть потомком класса SuperDog.
4. В случае, если параметр переданный в метод toSayable меньше 1, метод say должен вернуть строку с сообщением о том что собака спит (формат согласно javadoc).
5. В случае, если параметр переданный в метод toSayable больше либо равен 1, метод say должен вернуть строку с сообщением о том что собака лает и текущую дату (формат согласно javadoc).
6. Программа должна выводить данные на экран.
7. В методе getName класса DogPet должен быть вызван метод getSuperQuotes класса SuperDog.
 */
public class Dog implements Pet {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    /**
     * Внутри метода toSayable создайте class DogPet, который наследуется от SuperDog и реализует интерфейс Sayable
     * создайте метод private String getName(), который будет использовать логику двух классов - Dog и SuperDog.
     * Пусть этот метод возвращает имя собаки (класс Dog), которое с обеих сторон выделено getSuperQuotes (класс SuperDog)
     * Пример, " *** Барбос *** "
     * Логика метода say:
     * Если i < 1, то используя метод getName вывести на экран, что собака спит. Пример, " *** Шарик ***  спит."'
     * Иначе вывести фразу: "имя_собаки лает гааав! сегодняшняя_дата". Пример для i=3, " *** Тузик ***  лает гааав! 13-ноя-2013 Ср"
     * Для форматирования даты используйте formatter из класса SuperDog.
     * <p/>
     * <b>Пример вывода:</b>
     * *** Барбос ***  лает гааааав! 13-ноя-2013 Ср
     * *** Тузик ***  лает гаав! 13-ноя-2013 Ср
     * *** Бобик ***  лает гааав! 13-ноя-2013 Ср
     * Мыша пищит.
     * *** Шарик ***  спит.
     *
     * @param i количество букв 'а' в слове гав
     * @return экземпляр класса DogPet
     */
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