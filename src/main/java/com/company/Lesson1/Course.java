package com.company.Lesson1;

public class Course {
    protected Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Going g : team.getWalkers()) {
            for (Obstacle o : obstacles) {
                o.doIt(g);
                if (!g.isOnDistance()) break;
            }
        }
    }



}
