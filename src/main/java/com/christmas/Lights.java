package com.christmas;


public class Lights {

  private final int[][] lightGrid = new int[1000][1000];

  public boolean isLightOn(int x, int y) {
    return this.lightGrid[x][y] >= 1;
  }

  public void setLightGrid(int x, int y) {
    this.lightGrid[x][y] += 1;
  }

  public int[][] getLightGrid() {
    return lightGrid;
  }


  public void turnOnLights(int x1, int y1, int x2, int y2) {
    changeStateOfLights(x1, x2, y1, y2, 1);
  }

  private void changeStateOfLights(int x1, int x2, int y1, int y2, int value) {
    for (int x = x1; x <= x2; x++) {
      for (int y = y1; y <= y2; y++) {
        this.lightGrid[x][y] += value;
      }
    }
  }

  public void turnOffLights(int x1, int y1, int x2, int y2) {
    for (int x = x1; x <= x2; x++) {
      for (int y = y1; y <= y2; y++) {
        if (this.lightGrid[x][y] >= 0) {
          this.lightGrid[x][y] -= 1;
        }
      }
    }
  }

  public long getTotalBrightness() {
    long brightness = 0;
    for (int x = 0; x <= 999; x++) {
      for (int y = 0; y <= 999; y++) {
        if (this.lightGrid[x][y] >= 1) {
          brightness += this.lightGrid[x][y];
        }
      }
    }
    return brightness;
  }



  public void toggle(int x1, int y1, int x2, int y2) {
    changeStateOfLights(x1,x2,y1,y2,2);
  }
}
