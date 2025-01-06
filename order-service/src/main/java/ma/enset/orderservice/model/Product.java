package ma.enset.orderservice.model;

import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @Builder @ToString
public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
}
