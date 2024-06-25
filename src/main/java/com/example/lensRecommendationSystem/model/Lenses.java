package com.example.lensRecommendationSystem.model;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Lenses {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String lensName;
    private String lensLink;
    private Double lensPrice;
    private Double lensRating;

    private Double minFocalLength;
    private Double maxFocalLength;
    private Double maxAperture;
    private String imageStabilization;
    private String lensBrand;
    private String lensMount;
    private String lensType;
    private String photographyType;
    private String releaseDate;


    public Lenses(String lensName, String lensLink, Double lensPrice, Double lensRating,
                  Double minFocalLength, Double maxFocalLength, Double maxAperture,
                  String imageStabilization, String lensBrand, String lensMount,
                  String lensType, String photographyType, String releaseDate) {
        this.lensName = lensName;
        this.lensLink = lensLink;
        this.lensPrice = lensPrice;
        this.lensRating = lensRating;
        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;
        this.maxAperture = maxAperture;
        this.imageStabilization = imageStabilization;
        this.lensBrand = lensBrand;
        this.lensMount = lensMount;
        this.lensType = lensType;
        this.photographyType = photographyType;
        this.releaseDate = releaseDate;
    }

}
