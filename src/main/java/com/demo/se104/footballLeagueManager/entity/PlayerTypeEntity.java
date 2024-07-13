package com.demo.se104.footballLeagueManager.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="player_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerTypeEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
	
	@Column(name="name")
    private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "playerType")
	List<PlayerEntity> player;
}
