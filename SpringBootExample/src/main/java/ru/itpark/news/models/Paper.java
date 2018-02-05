package ru.itpark.news.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Paper {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 1000)
  private String text;

  @ManyToMany
  @JoinTable(
      name="user_paper",
      joinColumns=@JoinColumn(name="author_id", referencedColumnName="id"),
      inverseJoinColumns=@JoinColumn(name="paper_id", referencedColumnName="id"))
  private List<User> authors;
}
