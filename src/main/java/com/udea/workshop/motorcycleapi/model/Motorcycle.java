package com.udea.workshop.motorcycleapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "motorcycle")
public class Motorcycle implements Serializable {

    private static final long serialVersionUID = -8108784097235286223L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "reference")
    private String reference;

    @Column(name = "mileage")
    private String mileage;

    @Column(name = "subcategory")
    private String subcategory;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "description")
    private String description;
}
