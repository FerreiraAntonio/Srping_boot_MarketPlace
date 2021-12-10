package dev.codescreen.marketplace.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

@Data
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
   
    private Long id;
    
   

    @Column
    private Long storeId;

    @Column(nullable = false)
    private String name;

    @Column
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price.setScale(2, RoundingMode.CEILING);
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(storeId, other.storeId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, storeId);
	}
    
    
    
}
