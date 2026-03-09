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
    public ResponseEntity<List<VeiculoDTO>> findAll() {

        List<VeiculoDTO> result = veiculosService.findAll();

        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(result);
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
    public ResponseEntity<List<VeiculoDTO>> findByCor(@PathVariable String cor) {

        List<VeiculoDTO> result = veiculosService.findByCor(cor);

        if (result.isEmpty()) {
            return ResponseEntity.notFound().build(); // 404
        }

        return ResponseEntity.ok(result);
    }

    @GetMapping("/year/{ano}")
    public ResponseEntity<List<VeiculoDTO>> findByAno(@PathVariable Integer ano) {

        List<VeiculoDTO> result = veiculosService.findByAno(ano);

        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(result);
    }
}
