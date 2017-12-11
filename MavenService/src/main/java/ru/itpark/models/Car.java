package ru.itpark.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode(exclude = "owner")
@ToString
public class Car {
  private int id;
  private String number;
  private String color;
  private String model;
  private Human owner;
}
