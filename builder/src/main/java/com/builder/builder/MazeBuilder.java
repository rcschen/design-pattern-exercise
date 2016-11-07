package com.builder.builder;
import com.builder.product.Maze;

public interface MazeBuilder {
    void buildRoad(int i, int j);
    void buildWall(int i, int j);
    void buildTreasure(int i, int j);
    String getMaze();
}
