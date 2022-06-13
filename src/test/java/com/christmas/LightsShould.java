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
  @CsvSource({"0,0,5,5,25", "1,1,4,4,9"})
  void turn_on_grid_of_lights(int x1, int y1, int x2, int y2, long total) {
    Lights lights = new Lights();
    lights.turnOnLights(x1, y1, x2, y2);
    assertEquals(total, lights.getNoOfTurnedOnLights());
  }


  @Test
  void turn_off_grid_of_lights() {
    Lights lights = new Lights();
    lights.turnOnLights(0,0,5,5);
    lights.turnOffLights(1,1,4,4);
    assertEquals(16, lights.getNoOfTurnedOnLights());
  }

  @ParameterizedTest
  @CsvSource({"0,0,5,5,25,75", "1,1,4,4,9,27"})
  void toggle_the_particular_light(int x1, int y1, int x2, int y2, int total,int toggled) {
    Lights lights = new Lights();
    lights.turnOnLights(x1, y1, x2, y2);
    assertEquals(total, lights.getNoOfTurnedOnLights());
    lights.toggle(x1, y1, x2, y2);
    assertEquals(toggled, lights.getNoOfTurnedOnLights());
  }
}