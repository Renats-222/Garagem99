package br.gm.renato.garagem99.service;

import br.gm.renato.garagem99.entities.Veiculo;
import br.gm.renato.garagem99.repositories.VeiculoRepository;
import java.util.List;
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

    public List<Veiculo> findAll() {
        List<Veiculo> result = veiculoRepository.findAll();
        return result;
    }
}
