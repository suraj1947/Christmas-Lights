package com.christmas;


public class Lights {

  private boolean[][] lightGrid = new boolean[1000][1000];

  public boolean isLightOn(int x, int y) {
    return this.lightGrid[x][y];
  }

  public void setLightGrid(int x, int y) {
    this.lightGrid[x][y] = true;
  }

  public boolean[][] getLightGrid() {
    return lightGrid;
  }


  public void turnOnLights(int x1, int y1, int x2, int y2) {
    changeStateOfLights(x1, x2, y1, y2, true);
  }

  private void changeStateOfLights(int x1, int x2, int y1, int y2, boolean state) {
    for (int x = x1; x < x2; x++) {
      for (int y = y1; y < y2; y++) {
        this.lightGrid[x][y] = state;
      }
    }
  }

  public void turnOffLights(int x1, int y1, int x2, int y2) {
    changeStateOfLights(x1, x2, y1, y2, false);
  }

  public int getNoOfTurnedOnLights() {
    int count = 0;
    count = getCount(count,true);
    return count;
  }

  public int getNoOfTurnedOffLights() {
    int count = 0;
    count = getCount(count,false);
    return count;
  }

  private int getCount(int count,boolean state) {
    for (int x = 0; x < 1000; x++) {
      for (int y = 0; y < 1000; y++) {
        if (this.lightGrid[x][y] == state) {
          count++;
        }
      }
    }
    return count;
  }

  public void toggle(int x1, int y1, int x2, int y2) {
    for (int x = x1; x < x2; x++) {
      for (int y = y1; y < y2; y++) {
       lightGrid[x][y] = !lightGrid[x][y];
      }
    }
  }
}
