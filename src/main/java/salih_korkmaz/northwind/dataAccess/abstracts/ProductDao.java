package salih_korkmaz.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import salih_korkmaz.northwind.entities.concretes.Product;

//! JpaRepository nedir ?
//Entity anatosyonuyla süslenmiş nesen için primary
// key alnının türü neyse verilince
// sorguyu ona göre hazırlar
public interface ProductDao extends JpaRepository<Product, Integer> {

}
