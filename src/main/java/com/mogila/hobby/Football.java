package com.mogila.hobby;

public class Football extends Hobby{
    private String best_player;

    public Football(String name, int count_of_hours, char group, String best_player) {
        super(name, count_of_hours, group);            //вызов метода базового класса
        this.best_player = best_player;
    }

    public String getBest_player() {
        return best_player;
    }

    public void setBest_player(String best_player) {
        this.best_player = best_player;
    }

    @Override
    public String toString() {
        return "Football{" + super.toString() +
                "best_player='" + best_player + '\'' +
                '}';
    }

    @Override
    public void tellAboutHobby(){
        this.toString();
        System.out.println("My favorite hobby is football");
    }
}
