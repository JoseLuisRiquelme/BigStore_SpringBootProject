package cl.praxis.tiendaProductos.controller;

import cl.praxis.tiendaProductos.model.dto.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class InitController {
    @GetMapping
public String init(Model model ){
        
    return "index";
}
}
