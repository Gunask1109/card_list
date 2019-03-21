package com.example.listcard;

public class item {
    int background;
    String profileName;
    int profilePhoto;
    int nbFollowers;


    public item() {



    }

    public item(int background, String profileName, int profilephoto, int nbFollowers) {
        this.background = background;
        this.profileName = profileName;
        this.profilePhoto = profilephoto;
        this.nbFollowers = nbFollowers;
    }

    public int getBackground() {
        return background;
    }

    public String getProfileName() {
        return profileName;
    }

    public int getProfilephoto() {
        return profilePhoto;
    }

    public int getNbFollowers() {
        return nbFollowers;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public void setProfilephoto(int profilephoto) {
        this.profilePhoto = profilephoto;
    }

    public void setNbFollowers(int nbFollowers) {
        this.nbFollowers = nbFollowers;
    }
}
