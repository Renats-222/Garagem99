package br.gm.renato.garagem99.service;

import br.gm.renato.garagem99.DTO.VeiculoDTO;
import br.gm.renato.garagem99.entities.Veiculo;
import br.gm.renato.garagem99.repositories.VeiculoRepository;
import java.util.List;
import java.util.Optional;
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

    public Veiculo findById(Long id) {
    Optional<Veiculo> result = veiculoRepository.findById(id);
    return result.orElse(null);
}
    public List<VeiculoDTO> findByCor(String cor) {

    List<Veiculo> result = veiculoRepository.findByCorIgnoreCase(cor);

    return result.stream()
            .map(x -> new VeiculoDTO(x))
            .toList();
}
    public List<VeiculoDTO> findByAno(Integer ano) {

    List<Veiculo> result = veiculoRepository.findByAno(ano);

    return result.stream()
            .map(x -> new VeiculoDTO(x))
            .toList();
}
}
