package com.builder.product;
import com.builder.product.Maze;


public class PlainMaze implements Maze {
	private char[][] maze;
	
	public PlainMaze(char[][] maze) {
		this.maze = maze;
	}
	
	@Override
	public void paint() {
                for(char[] row : this.maze) {
                    for(char ele : row) {
                        System.out.print(ele);
                    }
                    System.out.println();
                }
	}
         
}