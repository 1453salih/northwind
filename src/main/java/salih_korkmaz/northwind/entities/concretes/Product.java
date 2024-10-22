package salih_korkmaz.northwind.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity //Bir veri tabanı nesnesi olduğu vurgulanır.
@Table(name="products")//Veritabanında hangi tabloya karşılık geldiği
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id //
    @GeneratedValue(strategy = GenerationType.IDENTITY) //İd nasıl arttırılacak
    @Column(name="product_id")// Veritabanında hangi column'a karşılık geldiği belirtilir.
    private int id;

    @Column(name="category_id")
    private int  categoryId;

    @Column(name="product_name")
    private String productName;

    @Column(name="unit_price")
    private double unitPrice;

    @Column(name="units_in_stock")
    private short unitsInStock;

    @Column(name="quantity_per_unit")
    private String quantityPerUnit;
}
