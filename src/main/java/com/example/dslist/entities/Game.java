package com.example.dslist.entities;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "game_year")
    private Integer year;
    private Double score;
    private String tittle;
    private String genre;
    private String plataform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game(){
    }

    public Game(Long id, String tittle, String genre, String imgUrl, String longDescription, String plataform,
                Double score, String shortDescription, Integer year) {
        this.genre = genre;
        this.id = id;
        this.imgUrl = imgUrl;
        this.longDescription = longDescription;
        this.score = score;
        this.plataform = plataform;
        this.shortDescription = shortDescription;
        this.tittle = tittle;
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getPlataform() {
        return plataform;
    }

    public void setPlataforms(String plataform) {
        this.plataform = plataform;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
