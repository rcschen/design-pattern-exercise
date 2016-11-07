package com.builder.product;
import com.builder.product.Maze;


class PainMaze implements Maze {
	private char[][] maze;
	
	PainMaze(char[][] maze) {
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