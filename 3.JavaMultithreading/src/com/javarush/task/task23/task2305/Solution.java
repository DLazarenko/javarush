package com.javarush.task.task23.task2305;

/**
 * Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
 * Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
 * Инициализация всех данных должна происходить только в методе getTwoSolutions.
 */
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] solutions = new Solution[2];
        Solution solutionFirst = new Solution();
        solutionFirst.innerClasses[0] = solutionFirst.new InnerClass();
        solutionFirst.innerClasses[1] = solutionFirst.new InnerClass();
        Solution solutionSecond = new Solution();
        solutionSecond.innerClasses[0] = solutionSecond.new InnerClass();
        solutionSecond.innerClasses[1] = solutionSecond.new InnerClass();
        solutions[0] = solutionFirst;
        solutions[1] = solutionSecond;
        return solutions;
    }

    public static void main(String[] args) {
    }
}
