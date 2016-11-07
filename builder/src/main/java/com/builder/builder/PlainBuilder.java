package com.builder.builder;

import com.builder.builder.MazeBuilder;
import com.builder.product.Maze;



class PlainBuilder implements MazeBuilder {
    private char[][] maze;
	

    public void buildRoad(int i, int j) {
        maze[i][j] = '　';
    }
    public void buildWall(int i, int j) {
        maze[i][j] = '□';
    }
    public void buildTreasure(int i, int j) {
        maze[i][j] = '★';
    }

    @Override
    public Maze getMaze() {
           return new Maze();
    }
}