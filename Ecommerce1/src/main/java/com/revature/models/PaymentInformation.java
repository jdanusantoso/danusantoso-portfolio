package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="payment_information", schema="ecommerce")
@Component

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PaymentInformation {

    @Id //This will make this field the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //This makes our PK serial
    private int creditInfo_id;

    @Column (nullable = false,  unique = true)
    @NotEmpty
    @Size(min = 8, max = 16, message = "Length of input must be 16")
    private String card_number;

    @Column(nullable = false)
    @NotEmpty
    @Min(1)
    @Max(12)
    @Size(min = 2, max = 2, message = "Length of input must be 2")
    private String expiration_date_month;

    @Column(nullable = false)
    @NotEmpty
    @Min(23)
    @Max(27)
    @Size(min = 2, max = 2, message = "Length of input must be 2")
    private String expiration_date_year;

    @Column(nullable = false, name = "CSV")
    @NotEmpty
    @Size(min = 3, max = 4, message = "Length of input must between 3 and 4")
    private String cvvNumber;

    //FK relationship that shows many accounts to 1 user
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")

    private Users users;

    //Constructors


    public PaymentInformation(int creditInfo_id, String card_number, String expiration_date_month, String expiration_date_year, String csvNumber) {
        this.creditInfo_id = creditInfo_id;
        this.card_number = card_number;
        this.expiration_date_month = expiration_date_month;
        this.expiration_date_year = expiration_date_year;
        this.cvvNumber = csvNumber;
    }

    public PaymentInformation(String card_number, String expiration_date_month, String expiration_date_year, String csvNumber) {
        this.card_number = card_number;
        this.expiration_date_month = expiration_date_month;
        this.expiration_date_year = expiration_date_year;
        this.cvvNumber = csvNumber;
    }
}
