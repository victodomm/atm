package com.task.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets Ammmount
 */
public enum Ammmount {
  
  NUMBER_5(5),
  
  NUMBER_10(10),
  
  NUMBER_20(20),
  
  NUMBER_50(50);

  private Integer value;

  Ammmount(Integer value) {
    this.value = value;
  }

  @JsonValue
  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Ammmount fromValue(Integer value) {
    for (Ammmount b : Ammmount.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

