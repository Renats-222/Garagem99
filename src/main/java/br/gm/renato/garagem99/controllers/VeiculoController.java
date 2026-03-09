package br.gm.renato.garagem99.controllers;

import br.gm.renato.garagem99.DTO.VeiculoDTO;
import br.gm.renato.garagem99.entities.Veiculo;
import br.gm.renato.garagem99.service.VeiculosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public List<VeiculoDTO> findAll() {
        return veiculosService.findAll();
    }

    @GetMapping("/forsale/{id}")
    public ResponseEntity<Veiculo> findById(@PathVariable Long id) {
        Veiculo result = veiculosService.findById(id);

        if (result == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(result);
    }

    @GetMapping("/color/{cor}")
    public List<VeiculoDTO> findByCor(@PathVariable String cor) {
        return veiculosService.findByCor(cor);
    }

    @GetMapping("/year/{ano}")
    public List<VeiculoDTO> findByAno(@PathVariable Integer ano) {
        return veiculosService.findByAno(ano);
    }
}