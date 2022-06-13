package com.christmas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

@MicronautTest
class LightsTest {


  @Test
  void should_turn_on_grid_of_lights() {
    Lights lights = new Lights();
    lights.turnOnLights(0,0,15,15);
    lights.toggle(0,0,15,15);
    lights.turnOffLights(0,0,15,15);
    assertEquals(512,lights.getTotalBrightness());
  }
}
