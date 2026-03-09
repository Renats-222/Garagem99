package br.gm.renato.garagem99.service;

import br.gm.renato.garagem99.DTO.VeiculoDTO;
import br.gm.renato.garagem99.entities.Veiculo;
import br.gm.renato.garagem99.repositories.VeiculoRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author digma
 */
@Service
public class VeiculosService {
     @Autowired
    private VeiculoRepository veiculoRepository;

     public List<VeiculoDTO> findAll() {
        List<Veiculo> result = veiculoRepository.findAll();
        return result.stream().map(VeiculoDTO::new).collect(Collectors.toList());
    }
     public List<VeiculoDTO> findByMarca(String marca) {
    List<Veiculo> result = veiculoRepository.findByMarcaIgnoreCase(marca);
    return result.stream().map(VeiculoDTO::new).toList();
}
}
