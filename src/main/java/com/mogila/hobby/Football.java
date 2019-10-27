package com.mogila.hobby;

public class Football extends Hobby {
    private String bestPlayer;

    public Football(String name, int count_of_hours, char group, String bestPlayer) {
        super(name, count_of_hours, group); //вызов метода базового класса
        this.bestPlayer = bestPlayer;
    }

    public String getBestPlayer() {
        return bestPlayer;
    }

    public void setBestPlayer(String bestPlayer) {
        this.bestPlayer = bestPlayer;
    }

    @Override
    public String toString() {
        return "Football{" + super.toString()
                + "best_player='" + bestPlayer + '\''
                + '}';
    }

    @Override
    public void tellAboutHobby(final int args) throws HobbyException {
        if (args < a) {
            throw new HobbyException();
        }

        System.out.println(this);
        System.out.println("My favorite hobby is football");
    }
}
