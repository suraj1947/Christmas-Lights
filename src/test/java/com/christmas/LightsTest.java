package com.christmas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@MicronautTest
class LightsTest {


  @Test
  void should_turn_on_grid_of_lights() {
    Lights lights = new Lights();
    lights.turnOnLights(0,0,15,15);
    assertEquals(225,lights.getNoOfTurnedOnLights());
  }
}
