#pragma once
#include <graphics.h>
#include <vector>

using namespace std;

struct Point {
	int row;
	int col;
};

class Block
{
private:
	int blockType;
	Point smallBlocks[4];
	IMAGE* img;

	static IMAGE* imgs[7];
	static int size;

public:
	Block();
	void drop();
	void moveLeftRight(int offset);
	void rotate();
	void draw(int leftMargin, int topMargin);
	static IMAGE** getImages();
	Block& operator=(const Block& other);
	bool blockInMap(const vector<vector<int>>&map); //判断方块位置是否合法
	void solidfy(vector<vector<int>>& map); //方块固化
	int getBlockType(); //获取方块类型
};