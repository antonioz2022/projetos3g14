package com.g14.librefixtvandroid;

import java.io.Serializable;
import java.util.List;

public class Season implements Serializable {
    private static final long serialVersionUID = 727566175075960653L;
    private int number;
    private List<Episode> episodes;

    public Season() {
    }

    public Season(int number, List<Episode> episodes) {
        this.number = number;
        this.episodes = episodes;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Season{" +
                "number=" + getNumber() +
                ", episodes=" + getEpisodes() +
                '}';
    }
}


