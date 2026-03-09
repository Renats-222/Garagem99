
package br.gm.renato.garagem99.repositories;

import br.gm.renato.garagem99.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author digma
 */
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
   List<Veiculo> findByCorIgnoreCase(String cor);
   List<Veiculo> findByAno(Integer ano);
}