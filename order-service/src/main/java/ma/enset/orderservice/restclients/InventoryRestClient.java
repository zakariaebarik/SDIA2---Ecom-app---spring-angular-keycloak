package ma.enset.orderservice.restclients;

import ma.enset.orderservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(url = "http://localhost:8087", name = "inventory-service")
public interface InventoryRestClient {
    @GetMapping("/api/products")
    public List<Product> getAllProducts();
    @GetMapping("/api/products/{productId}")
    public Product findProductById(@PathVariable String productId);
}
