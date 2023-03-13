package cl.corona.bodegaEcommerce.util;

import cl.corona.bodegaEcommerce.model.bodega;
import cl.corona.bodegaEcommerce.model.bodegaSmall;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class utility {

    private static final Logger LOG = LoggerFactory.getLogger(utility.class);

    private static final String dmySlashFormat = "dd/MM/yyyy";


    private utility() {
        throw new IllegalStateException("This is an Utility class. Is not meant to be instantiated");
    }

    public static Integer convertToInt(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).intValue();
        } else if (obj instanceof String) {
            return Integer.valueOf((String) obj);
        }
        return 0;
    }

    public static Float convertToFloat(Object obj) {

        //DecimalFormat toTheFormat = new DecimalFormat("#######.#######");
        //float value = Float.valueOf(toTheFormat.format(obj));

        if (obj == null) {
            return Float.valueOf(0);
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).floatValue();
        } else if (obj instanceof String) {
            return Float.valueOf((String) obj);
        }
        return Float.valueOf(0);
    }

    public static void writeInFileFull(List<bodega> reportes, String path) {

        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        String monthReport = df.format(new Date());

        try {
            FileWriter fileWriter1 = new FileWriter(path + "BODEGA_ECOMMERCE_" + monthReport + ".csv");
            fileWriter1.write("AUDIT_NUMBER;ORG_LVL_CHILD;PRD_LVL_CHILD;ORG_LVL_NUMBER;PRD_LVL_NUMBER;INV_TYPE_CODE;ON_HAND_QTY;ON_HAND_RETL;ON_HAND_COST;PO_ORD_QTY;PO_ORD_RETL;PO_ORD_COST;TO_ORD_QTY;TO_ORD_RETL;TO_ORD_COST;TO_INTRN_QTY;TO_INTRN_RETL;TO_INTRN_COST;DATE_CREATED;DOWNLOAD_DATE_1;DOWNLOAD_DATE_2;CALDAT;NOMBRE_ARCHIVO;FECHA_STAGE;FECHA_PERMANENTE;FECHA_BACKUP;ON_HAND_QTY_ORI;ON_HAND_COST_ORI\n");
            for (bodega report : reportes) {
                fileWriter1.write(
                        report.getAudit_number() + ";" + report.getOrg_lvl_child() + ";" + report.getPrd_lvl_child() + ";" + report.getOrg_lvl_number() + ";" + report.getPrd_lvl_number() + ";" + report.getInv_type_code() + ";" + report.getOn_hand_qty() + ";" +
                        report.getOn_hand_retl() + ";" + report.getOn_hand_cost() + ";" + report.getPo_ord_qty() + ";" + report.getPo_ord_retl() + ";" + report.getPo_ord_cost() + ";" + report.getTo_ord_qty() + ";" + report.getTo_ord_retl() + ";" +
                        report.getTo_ord_cost() + ";" + report.getTo_intrn_qty() + ";" + report.getTo_intrn_retl() + ";" + report.getTo_intrn_cost() + ";" + report.getDate_created() + ";" + report.getDownload_date_1() + ";" + report.getDownload_date_2() + ";" +
                        report.getCaldat() + ";" + report.getNombre_archivo() + ";" + report.getFecha_stage() + ";" + report.getFecha_permanente() + ";" + report.getFecha_backup() + ";" + report.getOn_hand_qty_ori() + ";" + report.getOn_hand_cost_ori() + "\n");
            }
            fileWriter1.close();

        } catch (IOException e) {
            LOG.error("Problems when writing full file. " + e.getMessage());
        }
    }

    public static void writeInFile(List<bodegaSmall> reportes, String path) {

        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        String monthReport = df.format(new Date());

        try {
            FileWriter fileWriter1 = new FileWriter(path + "BODEGA_ECOMMERCE_" + monthReport + ".csv");
            fileWriter1.write("AUDIT_NUMBER;ORG_LVL_CHILD;PRD_LVL_CHILD;ORG_LVL_NUMBER;PRD_LVL_NUMBER;INV_TYPE_CODE;ON_HAND_QTY\n");
            for (bodegaSmall report1 : reportes) {
                fileWriter1.write(
                        report1.getAudit_number() + ";" + report1.getOrg_lvl_child() + ";" + report1.getPrd_lvl_child() + ";" + report1.getOrg_lvl_number() + ";" +
                                report1.getPrd_lvl_number() + ";" + report1.getInv_type_code() + ";" + report1.getOn_hand_qty() + ";" + report1.getOn_hand_cost() + ";" + report1.getOn_hand_cost_ori()
                                + "\n");
            }
            fileWriter1.close();

        } catch (IOException e) {
            LOG.error("Problems when writing full file. " + e.getMessage());
        }
    }
}
