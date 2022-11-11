package com.javaunit3.springmvc.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Wedding Shoot Services")
public class MovieEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Photo_Id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "Pricing")
    private double Pricing;

    @Column(name = "genre")
    private String genre;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Photo_id")
    private List<VoteEntity> votes;

    public List<VoteEntity> getVotes()
    {
        return votes;
    }

    public void setVotes(List<VoteEntity> votes)
    {
        this.votes = votes;
    }

    public void addVote(String vote)
    {
        this.votes.add(vote);
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public double getPricing()
    {
        return Pricing;
    }


    public void setPricing(double pricing)
    {
        this.Pricing = Pricing;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }
}
