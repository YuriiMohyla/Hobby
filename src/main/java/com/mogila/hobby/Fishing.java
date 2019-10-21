package com.mogila.hobby;

public class Fishing extends Hobby {
    private String favorite_fish;

    public Fishing(String name, int count_of_hours, char group, String favorite_fish) {
        super(name, count_of_hours, group);
        this.favorite_fish = favorite_fish;
    }

    public String getFavorite_fish() {
        return favorite_fish;
    }

    public void setFavorite_fish(String favorite_fish) {
        this.favorite_fish = favorite_fish;
    }

    @Override
    public String toString() {
        return "Fishing{" + super.toString() +
                "favorite_fish='" + favorite_fish + '\'' +
                '}';
    }
    @Override
    public void tellAboutHobby() {
        System.out.println(this.toString());
        System.out.println("My favorite hobby is fishing");
    }
}
