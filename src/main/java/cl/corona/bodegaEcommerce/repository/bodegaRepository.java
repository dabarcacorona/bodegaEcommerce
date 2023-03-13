package cl.corona.bodegaEcommerce.repository;

import cl.corona.bodegaEcommerce.model.bodega;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.List;

public interface bodegaRepository extends CrudRepository<bodega, Serializable> {

    @Procedure
    List<bodega> findBodega48();


}
