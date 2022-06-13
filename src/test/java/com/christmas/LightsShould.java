package com.christmas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LightsShould {

  @Test
  void turn_on_the_particular_lights() {
    Lights lights = new Lights();
    lights.setLightGrid(11, 11);
    assertTrue(lights.isLightOn(11, 11));
  }

  @ParameterizedTest
  @CsvSource({"0,0,999,999,1000000", "1,1,4,4,16","0,0,5,5,36"})
  void turn_on_grid_of_lights(int x1, int y1, int x2, int y2, long total) {
    Lights lights = new Lights();
    lights.turnOnLights(x1, y1, x2, y2);
    assertEquals(total, lights.getTotalBrightness());
  }


  @Test
  void turn_off_grid_of_lights() {
    Lights lights = new Lights();
    lights.turnOnLights(0,0,5,5);
    lights.turnOffLights(1,1,4,4);
    lights.turnOffLights(1,1,4,4);
    lights.turnOffLights(1,1,4,4);
    lights.turnOffLights(1,1,4,4);
    lights.turnOffLights(1,1,4,4);
    lights.turnOffLights(1,1,4,4);
    assertEquals(20, lights.getTotalBrightness());
  }

  @ParameterizedTest
  @CsvSource({"0,0,5,5,72", "1,1,4,4,32","0,0,999,999,2000000"})
  void toggle_the_particular_light(int x1, int y1, int x2, int y2,long toggled) {
    Lights lights = new Lights();
    lights.toggle(x1, y1, x2, y2);
    assertEquals(toggled, lights.getTotalBrightness());
  }
}