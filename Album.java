package com.songs;

public class Album{
	private String name;
    private int duration; // duration in seconds

    public Album(String name, int duration) {
        this.name = name;
        this.duration = duration;

//        System.out.println("new song added: " + name + " / " + duration);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }



    @Override
    public String toString() {
        return this.name + ": " + this.duration;
    }

}
