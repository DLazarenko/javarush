package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y) {
       sections = new ArrayList<SnakeSection>();
        SnakeSection s = new SnakeSection(x, y);
        sections.add(s);
        isAlive = true;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public List getSections() {
        return sections;
    }

    public boolean isAlive() {
        return true;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public void move() {
    }
}
