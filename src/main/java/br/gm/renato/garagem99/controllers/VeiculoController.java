package br.gm.renato.garagem99.controllers;

import br.gm.renato.garagem99.entities.Veiculo;
import br.gm.renato.garagem99.service.VeiculosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digma
 */
@RestController
public class VeiculoController {
    
    
   @Autowired
    private VeiculosService veiculosService;

    @GetMapping("/forsale")
    public List<Veiculo> findAll() {
        List<Veiculo> result = veiculosService.findAll();
        return result;
    }
}