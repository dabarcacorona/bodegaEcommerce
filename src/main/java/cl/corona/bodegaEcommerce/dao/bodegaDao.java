package cl.corona.bodegaEcommerce.dao;

import cl.corona.bodegaEcommerce.model.bodega;
import cl.corona.bodegaEcommerce.model.bodegaSmall;
import cl.corona.bodegaEcommerce.util.utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Repository
public class bodegaDao {

    private static final Logger logger = LoggerFactory.getLogger(bodegaDao.class);

    @Autowired
    private EntityManager em;

    public List<bodega> getReport() {

        StoredProcedureQuery spq = em.createNamedStoredProcedureQuery("BOD_ECOMMERCE");
        if (spq == null) {
            logger.debug("Problems in the DB with the Stored Procedure");
            return Collections.emptyList();
        }

        List<Object[]> rows = spq.getResultList();

        List<bodega> result = new ArrayList<>(rows.size());

        for (Object[] row : rows) {
            result.add(
                    new bodega(0,utility.convertToInt(row[0]), utility.convertToInt(row[1]), utility.convertToInt(row[2]), utility.convertToInt(row[3]), (String) row[4],
                            utility.convertToInt(row[5]), utility.convertToInt(row[6]), utility.convertToInt(row[7]), utility.convertToInt(row[8]), utility.convertToInt(row[9]),
                            utility.convertToInt(row[10]), utility.convertToInt(row[11]), utility.convertToInt(row[12]), utility.convertToInt(row[13]), utility.convertToInt(row[14]),
                            utility.convertToInt(row[15]), utility.convertToInt(row[16]),  utility.convertToInt(row[17]), (Date) row[18], (Date) row[19], (Date) row[20],
                            (Date) row[21], (String) row[22], (Date) row[23], (Date) row[24], (Date) row[25], utility.convertToInt(row[26]), utility.convertToInt(row[27])));
        }
        return result;

    }

    public List<bodegaSmall> getReportSecond() {

        StoredProcedureQuery spq = em.createNamedStoredProcedureQuery("BOD_48");
        if (spq == null) {
            logger.debug("Problems in the DB with the Stored Procedure");
            return Collections.emptyList();
        }

        List<Object[]> rows = spq.getResultList();

        List<bodegaSmall> result = new ArrayList<>(rows.size());

        for (Object[] row : rows) {
            result.add(
                    new bodegaSmall(0, utility.convertToInt(row[0]), utility.convertToInt(row[1]), utility.convertToInt(row[2]),
                            utility.convertToInt(row[3]), (String) row[4], utility.convertToInt(row[5]), utility.convertToInt(row[6]), utility.convertToInt(row[7]),
                            utility.convertToInt(row[8])));
        }

        return result;

    }

}
