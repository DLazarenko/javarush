package com.javarush.task.task25.task2502;

import java.util.*;

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            wheels = new ArrayList<>();
            String[] allWheels = loadWheelNamesFromDB();
            for (int i = 0; i < 4; i++) {
                Wheel wheel = Wheel.valueOf(allWheels[i]);
                wheels.add(wheel);
            }

            if (allWheels.length != 3) {

            }
        }

        protected String[] loadWheelNamesFromDB() {

            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
    }
}
