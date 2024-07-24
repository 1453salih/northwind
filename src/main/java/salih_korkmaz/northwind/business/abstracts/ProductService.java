package salih_korkmaz.northwind.business.abstracts;

import salih_korkmaz.northwind.core.utilities.results.DataResult;
import salih_korkmaz.northwind.core.utilities.results.Result;
import salih_korkmaz.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
     DataResult<List<Product>> getAll();
     Result add(Product product);
 }
