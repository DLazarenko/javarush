package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 06.05.17.
 */
public class Hippodrome {

    private static List<Horse> horses;
    static Hippodrome game;


    public List<Horse> getHorses(){
        return horses;
    }

    public Hippodrome(List<Horse> horses){
        this.horses = horses;
    }

        public void run() throws InterruptedException {

            for(int i = 0; i < 100; i++){
                move();
                print();
                Thread.sleep(200);
            }
        }

        public void move(){
            for(int k = 0; k < getHorses().size(); k++){
                horses.get(k).move();
            }
        }
        public void print(){
            for(int k = 0; k < getHorses().size(); k++){
                horses.get(k).print();
            }
            for(int k = 0; k < 10; k++){
                System.out.println();
            }

        }
        public Horse getWinner(){
            double distanse = 0;
            Horse winner = null;
                for (Horse horse : getHorses()){
                    if (horse.getDistance() > distanse){
                        distanse = horse.getDistance();
                        winner = horse;
                    }
                }

            return winner;
        }
        public void printWinner(){
            System.out.println("Winner is " + getWinner().getName() + "!");
        }
    public static void main (String[] args) throws InterruptedException {

        game = new Hippodrome(new ArrayList<Horse>());


        game.getHorses().add(new Horse("Stella", 3, 0));
        game.getHorses().add(new Horse("Molnia", 3, 0));
        game.getHorses().add(new Horse("Viktory",3, 0));

        game.run();
        game.printWinner();
    }
}
