package models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "todo")
@Data
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private Boolean done;

    private Long categoryId;
}
