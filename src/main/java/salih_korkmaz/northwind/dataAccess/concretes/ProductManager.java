package salih_korkmaz.northwind.dataAccess.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import salih_korkmaz.northwind.business.abstracts.ProductService;
import salih_korkmaz.northwind.core.utilities.results.DataResult;
import salih_korkmaz.northwind.core.utilities.results.Result;
import salih_korkmaz.northwind.core.utilities.results.SuccessDataResult;
import salih_korkmaz.northwind.core.utilities.results.SuccessResult;
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
    public DataResult<List<Product>> getAll() {


        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi");

    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün eklendi");
    }
}
