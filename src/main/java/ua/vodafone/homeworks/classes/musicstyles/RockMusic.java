package ua.vodafone.homeworks.classes.musicstyles;

public class RockMusic extends MusicStyles {

    public RockMusic(String name) {

        this.name = name;

    }

    @Override
    public void playMusic() {
        System.out.println(name + " plays Rock music.");
    }
}
