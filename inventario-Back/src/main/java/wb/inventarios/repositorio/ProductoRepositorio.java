package wb.inventarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import wb.inventarios.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
}
