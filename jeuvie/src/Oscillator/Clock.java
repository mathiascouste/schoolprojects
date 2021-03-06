package Oscillator;

import model.structure.Structure;

public class Clock implements Structure{

	@Override
	public int[][] getTable() {
		int [][] toRet = {
			{0,0,0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,1,1,0,0,0,0},
			{1,1,0,1,0,0,0,0,1,0,0,0},
			{1,1,0,1,1,0,0,0,1,0,0,0},
			{0,0,0,1,0,1,1,0,1,0,1,1},
			{0,0,0,1,0,0,0,0,1,0,1,1},
			{0,0,0,0,1,1,1,1,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,0,0,0}
		};
		return toRet;
	}
}
