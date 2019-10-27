package com.mogila.hobby;

public class Fishing extends Hobby {
    private String favoriteFish;

    public Fishing(String name, int countOfHours, char group, String favoriteFish) {
        super(name, countOfHours, group);
        this.favoriteFish = favoriteFish;
    }

    public String getFavoriteFish() {
        return favoriteFish;
    }

    public void setFavoriteFish(String favoriteFish) {
        this.favoriteFish = favoriteFish;
    }

    @Override
    public String toString() {
        return "Fishing{" + super.toString()
                + "favorite_fish='" + favoriteFish + '\''
                + '}';
    }
    @Override
    public void tellAboutHobby(final int args) throws HobbyException {
        if (args < a) {
            throw new HobbyException();
        }

        System.out.println(this);
        System.out.println("My favorite hobby is fishing");
    }
}
