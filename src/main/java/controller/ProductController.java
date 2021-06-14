package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.IProductService;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("Productspage")
    public ModelAndView products(){
        ModelAndView modelAndView = new ModelAndView("productspage");
        List<Product> productList = productService.findAll();
        modelAndView.addObject("list",productList);
        return modelAndView;
    }
}
