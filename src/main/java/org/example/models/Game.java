package org.example.models;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name="games")
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column( length = 32 )
    private String platform;

    private String description;
    private Integer year;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="image_url")
    private String imageUrl;

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", platform='" + platform + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", user=" + user.getEmail() +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}

/*

1 usuario -> n juegos
n juego -> 1 usuario



 */