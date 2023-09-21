#pragma once
#include <vector>
#include <graphics.h>
#include "Block.h"
using namespace std;

class Tetris
{
private:
	int delay;
	bool update;
	int rows;
	int cols;
	int left;
	int top;
	int blockSize;
	vector<vector<int>> map;
	IMAGE imgBg;

	Block* curBlock;
	Block* nextBlock;
	Block bakBlock;
	int score;
	int level;
	int lineCount; //当前消除了多少行
	int highestScore;
	bool gameOver;

	IMAGE imgOver;
	IMAGE imgWin;

public:
	Tetris(int rows, int cols, int left, int top, int blockSize);
	void init();
	void play();

private:
	void keyEvent();
	int getDelay();
	void updateWindow();
	void drop();
	void clearLine();

	void moveLeftRight(int offset);
	void rotate();
	void drawScore();
	void checkOver();
	void saveScore();
	void displayOver();
};

