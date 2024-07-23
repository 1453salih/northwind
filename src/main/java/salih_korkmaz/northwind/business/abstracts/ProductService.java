package salih_korkmaz.northwind.business.abstracts;

import salih_korkmaz.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
