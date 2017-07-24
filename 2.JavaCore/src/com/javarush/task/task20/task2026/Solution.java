package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0, },
                {1, 1, 0, 0, },
                {1, 1, 0, 0, },
                {1, 1, 0, 1, }
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        int startLine;
        int startColumn;

        for (int lineIndex = 0; lineIndex < a.length; lineIndex++) {
            for (int columnIndex = 0; columnIndex < a[lineIndex].length; columnIndex++) {
                if (a[lineIndex][columnIndex] == 1) {
                    count++;
                    startLine = lineIndex;
                    startColumn = columnIndex;

                    int endColumn = 0;
                    int endLine = 0;

                    for (int k = columnIndex; k < a[startLine].length; k++) {
                        if (a[startLine][k] == 0) {
                            endColumn = k;
                            break;
                        } else {
                            endColumn = a[startLine].length;
                        }
                    }

                    for (int k = lineIndex; k < a.length; k++) {
                        if (a[k][startColumn] == 0) {
                            endLine = k;
                            break;
                        } else {
                            endLine = a.length;
                        }
                    }

                    for (int l = startLine; l < endLine; l++) {
                        for (int c = startColumn; c < endColumn; c++) {
                            a[l][c] = 0;
                        }
                    }

                }
            }
        }
        return count;

    }
}
