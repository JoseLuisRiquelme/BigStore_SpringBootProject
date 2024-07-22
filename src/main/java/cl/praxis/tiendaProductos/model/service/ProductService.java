package cl.praxis.tiendaProductos.model.service;

import cl.praxis.tiendaProductos.model.dto.Producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    /* private ProductRepository respository;
     public ProductService(ProductRepository respository) {
         this.respository = respository;
     }*/
    private List<Producto> products;

    public ProductService() {
        products = new ArrayList<Producto>();
        products.add(new Producto(1, "Hand Soap", "Hygiene", "Best hans soap quality"));
        products.add(new Producto(2, "Towel", "Hygiene", "Biggest in the market"));
        products.add(new Producto(3, "Wall clock", "Home", "Most precise in the market"));
        products.add(new Producto(4, "Kettle", "Home", "The fast to boil in the market"));
    }

    public ProductService(List<Producto> products) {
        this.products = products;
    }

    public List<Producto> getAll() {
        return products;
    }

    public Producto getOne(int id){

        return products
                .stream()
                .filter(p->p.getId()==id)
                .findFirst().orElse(null);
    }


}
