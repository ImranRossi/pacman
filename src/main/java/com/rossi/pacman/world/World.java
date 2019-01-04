package com.rossi.pacman.world;

public class World {
    private Tile[][] wereld;

    public World(){
        Tile tile1 = new Tile(5, TileType.LEFT_TOP_CORNER, 0, 0);
        Tile tile2 = new Tile(5, TileType.HORIZONTAL_WALL, 0, 0);
        Tile tile3 = new Tile(5, TileType.RIGHT_TOP_CORNER, 0, 0);
        Tile tile4 = new Tile(5, TileType.VERTICAL_WALL, 0, 0);
        Tile tile5 = new Tile(5, TileType.OPEN, 0, 0);
        Tile tile6 = new Tile(5, TileType.VERTICAL_WALL, 0, 0);
        Tile tile7 = new Tile(5, TileType.LEFT_BOTTOM_CORNER, 0, 0);
        Tile tile8 = new Tile(5, TileType.HORIZONTAL_WALL, 0, 0);
        Tile tile9 = new Tile(5, TileType.RIGHT_BOTTOM_CORNER, 0, 0);

        this.wereld = new Tile[][]{{tile1,tile2,tile3},{tile4,tile5,tile6},{tile7,tile8,tile9}};

    }
}
