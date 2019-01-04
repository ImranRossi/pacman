package com.rossi.pacman.world;

public class Tile {
    private int size;
    private TileType tileType;
    private int xposition;
    private int yposition;

    public Tile(int size, TileType tileType, int xposition, int yposition) {
        this.size = size;
        this.tileType = tileType;
        this.xposition = xposition;
        this.yposition = yposition;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public TileType getTileType() {
        return tileType;
    }

    public void setTileType(TileType tileType) {
        this.tileType = tileType;
    }

    public int getXposition() {
        return xposition;
    }

    public void setXposition(int xposition) {
        this.xposition = xposition;
    }

    public int getYposition() {
        return yposition;
    }

    public void setYposition(int yposition) {
        this.yposition = yposition;
    }
}
