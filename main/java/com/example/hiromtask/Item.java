package com.example.hiromtask;

public class Item {

    private String thumbnailUrl;
    private String url;
    private String albumId;
    private String id;
    private String title;

    public Item(String thumbnailUrl, String url, String albumId, String id, String title) {

        this.thumbnailUrl = thumbnailUrl;
        this.url = url;
        this.albumId = albumId;
        this.id = id;
        this.title = title;
    }



    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

