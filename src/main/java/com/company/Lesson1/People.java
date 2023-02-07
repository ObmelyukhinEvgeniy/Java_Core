package com.company.Lesson1;

public class People implements Going {
    protected String name;
    protected int swimDistance;
    protected double jumpDistance;
    protected boolean active;

    @Override
    public boolean isOnDistance() {
        return active;
    }

    public People(String name, int swimDistance, double jumpDistance) {
        this.name = name;
        this.swimDistance = swimDistance;
        this.jumpDistance = jumpDistance;
        this.active = true;
    }

    @Override
    public void swimming(int length) {
        if (length <= swimDistance) {
            System.out.println(name + " проплыл дистанцию.");
        } else {
            System.out.println(name + " не проплыл дистанцию.");
            active = false;
        }
    }

    @Override
    public void jumping(double height) {
        if (height <= jumpDistance) {
            System.out.println(name + " перепрыгнул препядствие.");
        } else {
            System.out.println(name + " не перепрыгнул препядствие.");
            active = false;
        }
    }

    @Override
    public void result() {
        System.out.println(name + ": " + active);
    }
}
