package com.g14.librefixtvandroid;

import java.io.Serializable;

public class Episode implements Serializable {
    private static final long serialVersionUID = 727566175075960653L;
    private String title;
    private int duration;  // Duration in minutes
    private String description;
    private String videoUrl;

    public Episode() {
    }

    public Episode(String title, int duration, String description, String videoUrl) {
        this.title = title;
        this.duration = duration;
        this.description = description;
        this.videoUrl = videoUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    // Método toString para exibir as informações do episódio
    @Override
    public String toString() {
        return "Episode{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                '}';
    }
}

