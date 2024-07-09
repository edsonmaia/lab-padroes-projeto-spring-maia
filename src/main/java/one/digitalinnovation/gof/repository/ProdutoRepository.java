package one.digitalinnovation.gof.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovation.gof.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findAll();

    Optional<Produto> findById(Long id);

    @SuppressWarnings("unchecked")
    Produto save(Produto produto);

    void deleteById(Long id);
}
