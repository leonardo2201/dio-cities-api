package com.github.andrelugomes.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.github.leonardo2201.utils.StringLocationUtils;

class StringLocationUtilsTest {

  @Test
  public void shouldExtractGeoLocationsFormString() {
    String geoLocation = "(123, 321)";

    Double[] transform = StringLocationUtils.transform(geoLocation);

    Assertions.assertThat(transform[0]).isEqualTo(123.0);
    Assertions.assertThat(transform[1]).isEqualTo(321.0);
  }
}
