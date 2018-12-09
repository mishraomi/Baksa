package com.firebolt.baksa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "card", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "card_number"
        })
})
public class Card {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank
    private Long card_number;
	
	@NotBlank
    @Size(max = 40)
    private String card_owner;
	
	@NotBlank
    @Size(min = 2, max = 2)
	private int card_exp_month;
	
	@NotBlank
	@Size(min = 2, max = 2)
	private int card_exp_year;
	
	@NotBlank
	@Size(min = 3, max = 3)
	private int card_cvv;
	
	@NotBlank
	@Size(max = 40)
	private String card_type;
	
	@NotBlank
	@Size(max = 60)
	private String card_issue_bank;
	
	@NotBlank
	@Size(min = 4, max = 4)
	private int card_pin;
	
	@Size(max = 20)
	private Long card_linked_account;
	
	
	
	

}
