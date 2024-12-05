package plan.ahorro.futuro.infraestructure.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "MoneyOut")

public class MoneyOutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private BigDecimal amount;

    private LocalDateTime date;
    
    @Transient
    private String formattedFecha;
    
    public MoneyOutEntity() {
    }

    public MoneyOutEntity(Integer id, BigDecimal amount, LocalDateTime date, String formattedFecha) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.formattedFecha = formattedFecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getFormattedFecha() {
        return formattedFecha;
    }

    public void setFormattedFecha(String formattedFecha) {
        this.formattedFecha = formattedFecha;
    }

    
}