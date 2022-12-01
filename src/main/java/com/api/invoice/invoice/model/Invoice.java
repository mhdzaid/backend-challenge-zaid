package com.api.invoice.invoice.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
public class Invoice implements Serializable {
    @Id
    private UUID id;
    private String code; // human readable invoice code/number
    private String title;
    private String description;
    private LocalDateTime issuedAt; // ISO date time
    private UUID customerId;
    private float totalAmount;
}
