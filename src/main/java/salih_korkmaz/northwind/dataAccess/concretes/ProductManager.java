package salih_korkmaz.northwind.dataAccess.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import salih_korkmaz.northwind.business.abstracts.ProductService;
import salih_korkmaz.northwind.dataAccess.abstracts.ProductDao;
import salih_korkmaz.northwind.entities.concretes.Product;

import java.util.List;
@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
