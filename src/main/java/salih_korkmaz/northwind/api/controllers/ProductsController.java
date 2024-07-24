package salih_korkmaz.northwind.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import salih_korkmaz.northwind.business.abstracts.ProductService;
import salih_korkmaz.northwind.core.utilities.results.DataResult;
import salih_korkmaz.northwind.core.utilities.results.Result;
import salih_korkmaz.northwind.entities.concretes.Product;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService productService;

    @Autowired //Projeyi tarar
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }



    @GetMapping("/getall")
    public DataResult<List<Product>> getAll() {
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }
}

