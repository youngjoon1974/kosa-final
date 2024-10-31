package org.ttallangi.ttallangi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // primary key 자동생성
    @Column(name = "payment_id")
    private int paymentId;

    @Column(name = "rental_id")
    private int rentalId;

    @Column(name = "payment_amount")
    private int paymentAmount;

    @Column(name = "payment_data")
    private LocalDateTime paymentDate;
}
