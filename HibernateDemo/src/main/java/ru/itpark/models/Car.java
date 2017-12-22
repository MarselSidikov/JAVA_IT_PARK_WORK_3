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
  private Long id;
  private String number;
  private String color;
  private String model;
  private User owner;
}
