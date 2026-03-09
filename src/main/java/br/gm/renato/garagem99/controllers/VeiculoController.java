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
        List<VeiculoDTO> result = veiculosService.findAll();
        return result;
    }

<<<<<<< HEAD
    @GetMapping("/marca/{marca}")
    public ResponseEntity<List<VeiculoDTO>> findByMarca(@PathVariable String marca) {

        List<VeiculoDTO> result = veiculosService.findByMarca(marca);

        if (result.isEmpty()) {
=======
    @GetMapping("/forsale/{id}")
    public ResponseEntity<Veiculo> findById(@PathVariable Long id) {

        Veiculo result = veiculosService.findById(id);

        if (result == null) {
>>>>>>> 8750683 (Término da Fase 3)
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(result);
    }

    @GetMapping("/color/{cor}")
    public List<VeiculoDTO> findByCor(@PathVariable String cor) {

        List<VeiculoDTO> result = veiculosService.findByCor(cor);

        return result;
    }
    @GetMapping("/year/{ano}")
    public List<VeiculoDTO> findByAno(@PathVariable Integer ano) {

    List<VeiculoDTO> result = veiculosService.findByAno(ano);

    return result;
}

}
