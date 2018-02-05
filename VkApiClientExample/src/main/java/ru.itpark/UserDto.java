package ru.itpark;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

// DataTransferObject
@Data
public class UserDto {
  @JsonProperty("first_name")
  private String firstName;
  @JsonProperty("last_name")
  private String lastName;
  @JsonProperty("photo_200_orig")
  private String photo;
}
