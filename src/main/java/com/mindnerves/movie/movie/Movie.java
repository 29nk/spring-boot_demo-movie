package com.mindnerves.movie.movie;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    private String id;
    private String title;
    private String description;
    private Date releaseDate;

    public Movie(){
        
    }
    /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String return the descrption
     */
    public String getDescrption() {
        return description;
    }

    /**
     * @param descrption the descrption to set
     */
    public void setDescrption(String description) {
        this.description = description;
    }

    /**
     * @return Date return the releaseDate
     */
    public Date getDate() {
        return releaseDate;
    }

    /**
     * @param releaseDate the releaseDate to set
     */
    public void setDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

}

