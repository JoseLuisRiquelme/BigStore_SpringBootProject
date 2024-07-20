package cl.praxis.tiendaProductos.controller;

import cl.praxis.tiendaProductos.model.dto.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductsController {

    @GetMapping
    public String products(Model model){
            List<Producto> products = new ArrayList<>();
        products.add(new Producto(1,"Hand Soap","Hygiene","Best hans soap quality"));
        products.add(new Producto(2,"Towel","Hygiene","Biggest in the market"));
        products.add(new Producto(3,"Wall clock","Home","Most precise in the market"));
        products.add(new Producto(4,"Kettle","Home","The fast to boil in the market"));
        model.addAttribute("products",products);

        return "productos";
    }

    @GetMapping("/{id}")
    public String getOne(@PathVariable("id")int id,Model model){
        Producto p = new Producto(5,"Teeth Brush","Hygiene","Most durable in the market");
        model.addAttribute("product",p);
        return "productDetails";
    }
}
