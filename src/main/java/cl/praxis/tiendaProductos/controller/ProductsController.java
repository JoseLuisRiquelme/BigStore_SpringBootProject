package cl.praxis.tiendaProductos.controller;

import cl.praxis.tiendaProductos.model.dto.Producto;
import cl.praxis.tiendaProductos.model.service.ProductService;
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

    private final ProductService service;

    public ProductsController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public String products(Model model){

        model.addAttribute("products",service.getAll());

        return "productos";
    }

    @GetMapping("/{id}")
    public String getOne(@PathVariable("id")int id,Model model){
       // Producto p = new Producto(5,"Teeth Brush","Hygiene","Most durable in the market");
        model.addAttribute("product",service.getOne(id));
        return "productDetails";
    }
}
