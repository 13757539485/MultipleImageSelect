package com.darsh.multipleimageselect.models;

/**
 * Created by Darshan on 4/14/2015.
 */
public class Album {
    public long albumId;
    public String name;
    public String cover;

    public Album(long albumId, String name, String cover) {
        this.albumId = albumId;
        this.name = name;
        this.cover = cover;
    }
}
