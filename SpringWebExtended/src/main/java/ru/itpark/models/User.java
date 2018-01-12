package ru.itpark.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class User {

  private Long id;
  private String name;
  private int age;
  private String citizen;
}
