package cl.corona.bodegaEcommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "BOD_ECOMMERCE", procedureName = "PRC_INF_STOCK_PMM_048", parameters = {
                @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, name = "C1", type = Class.class)})})
public class bodega {

    @Id
    private int id;

    public int audit_number;

    private int org_lvl_child;

    private int prd_lvl_child;

    private int org_lvl_number;

    private String prd_lvl_number;

    private int inv_type_code;

    private int on_hand_qty;

    private int on_hand_retl;

    private int on_hand_cost;

    private int po_ord_qty;

    private int po_ord_retl;

    private int po_ord_cost;

    private int to_ord_qty;

    private int to_ord_retl;

    private int to_ord_cost;

    private int to_intrn_qty;

    private int to_intrn_retl;

    private int to_intrn_cost;

    private Date date_created;

    private Date download_date_1;

    private Date download_date_2;

    private Date caldat;

    private String nombre_archivo;

    private Date fecha_stage;

    private Date fecha_permanente;

    private Date fecha_backup;

    private int on_hand_qty_ori;

    private int on_hand_cost_ori;


    public bodega() {
        super();
    }

    public bodega(int id, int audit_number, int org_lvl_child, int prd_lvl_child, int org_lvl_number, String prd_lvl_number, int inv_type_code, int on_hand_qty, int on_hand_retl, int on_hand_cost, int po_ord_qty, int po_ord_retl, int po_ord_cost, int to_ord_qty, int to_ord_retl, int to_ord_cost, int to_intrn_qty, int to_intrn_retl, int to_intrn_cost, Date date_created, Date download_date_1, Date download_date_2, Date caldat, String nombre_archivo, Date fecha_stage, Date fecha_permanente, Date fecha_backup, int on_hand_qty_ori, int on_hand_cost_ori) {
        this.id = id;
        this.audit_number = audit_number;
        this.org_lvl_child = org_lvl_child;
        this.prd_lvl_child = prd_lvl_child;
        this.org_lvl_number = org_lvl_number;
        this.prd_lvl_number = prd_lvl_number;
        this.inv_type_code = inv_type_code;
        this.on_hand_qty = on_hand_qty;
        this.on_hand_retl = on_hand_retl;
        this.on_hand_cost = on_hand_cost;
        this.po_ord_qty = po_ord_qty;
        this.po_ord_retl = po_ord_retl;
        this.po_ord_cost = po_ord_cost;
        this.to_ord_qty = to_ord_qty;
        this.to_ord_retl = to_ord_retl;
        this.to_ord_cost = to_ord_cost;
        this.to_intrn_qty = to_intrn_qty;
        this.to_intrn_retl = to_intrn_retl;
        this.to_intrn_cost = to_intrn_cost;
        this.date_created = date_created;
        this.download_date_1 = download_date_1;
        this.download_date_2 = download_date_2;
        this.caldat = caldat;
        this.nombre_archivo = nombre_archivo;
        this.fecha_stage = fecha_stage;
        this.fecha_permanente = fecha_permanente;
        this.fecha_backup = fecha_backup;
        this.on_hand_qty_ori = on_hand_qty_ori;
        this.on_hand_cost_ori = on_hand_cost_ori;
    }

    @Override
    public String toString() {
        return "bodega{" +
                "id=" + id +
                ", audit_number=" + audit_number +
                ", org_lvl_child=" + org_lvl_child +
                ", prd_lvl_child=" + prd_lvl_child +
                ", org_lvl_number=" + org_lvl_number +
                ", prd_lvl_number='" + prd_lvl_number + '\'' +
                ", inv_type_code=" + inv_type_code +
                ", on_hand_qty=" + on_hand_qty +
                ", on_hand_retl=" + on_hand_retl +
                ", on_hand_cost=" + on_hand_cost +
                ", po_ord_qty=" + po_ord_qty +
                ", po_ord_retl=" + po_ord_retl +
                ", po_ord_cost=" + po_ord_cost +
                ", to_ord_qty=" + to_ord_qty +
                ", to_ord_retl=" + to_ord_retl +
                ", to_ord_cost=" + to_ord_cost +
                ", to_intrn_qty=" + to_intrn_qty +
                ", to_intrn_retl=" + to_intrn_retl +
                ", to_intrn_cost=" + to_intrn_cost +
                ", date_created=" + date_created +
                ", download_date_1=" + download_date_1 +
                ", download_date_2=" + download_date_2 +
                ", caldat=" + caldat +
                ", nombre_archivo='" + nombre_archivo + '\'' +
                ", fecha_stage=" + fecha_stage +
                ", fecha_permanente=" + fecha_permanente +
                ", fecha_backup=" + fecha_backup +
                ", on_hand_qty_ori=" + on_hand_qty_ori +
                ", on_hand_cost_ori=" + on_hand_cost_ori +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAudit_number() {
        return audit_number;
    }

    public void setAudit_number(int audit_number) {
        this.audit_number = audit_number;
    }

    public int getOrg_lvl_child() {
        return org_lvl_child;
    }

    public void setOrg_lvl_child(int org_lvl_child) {
        this.org_lvl_child = org_lvl_child;
    }

    public int getPrd_lvl_child() {
        return prd_lvl_child;
    }

    public void setPrd_lvl_child(int prd_lvl_child) {
        this.prd_lvl_child = prd_lvl_child;
    }

    public int getOrg_lvl_number() {
        return org_lvl_number;
    }

    public void setOrg_lvl_number(int org_lvl_number) {
        this.org_lvl_number = org_lvl_number;
    }

    public String getPrd_lvl_number() {
        return prd_lvl_number;
    }

    public void setPrd_lvl_number(String prd_lvl_number) {
        this.prd_lvl_number = prd_lvl_number;
    }

    public int getInv_type_code() {
        return inv_type_code;
    }

    public void setInv_type_code(int inv_type_code) {
        this.inv_type_code = inv_type_code;
    }

    public int getOn_hand_qty() {
        return on_hand_qty;
    }

    public void setOn_hand_qty(int on_hand_qty) {
        this.on_hand_qty = on_hand_qty;
    }

    public int getOn_hand_retl() {
        return on_hand_retl;
    }

    public void setOn_hand_retl(int on_hand_retl) {
        this.on_hand_retl = on_hand_retl;
    }

    public int getOn_hand_cost() {
        return on_hand_cost;
    }

    public void setOn_hand_cost(int on_hand_cost) {
        this.on_hand_cost = on_hand_cost;
    }

    public int getPo_ord_qty() {
        return po_ord_qty;
    }

    public void setPo_ord_qty(int po_ord_qty) {
        this.po_ord_qty = po_ord_qty;
    }

    public int getPo_ord_retl() {
        return po_ord_retl;
    }

    public void setPo_ord_retl(int po_ord_retl) {
        this.po_ord_retl = po_ord_retl;
    }

    public int getPo_ord_cost() {
        return po_ord_cost;
    }

    public void setPo_ord_cost(int po_ord_cost) {
        this.po_ord_cost = po_ord_cost;
    }

    public int getTo_ord_qty() {
        return to_ord_qty;
    }

    public void setTo_ord_qty(int to_ord_qty) {
        this.to_ord_qty = to_ord_qty;
    }

    public int getTo_ord_retl() {
        return to_ord_retl;
    }

    public void setTo_ord_retl(int to_ord_retl) {
        this.to_ord_retl = to_ord_retl;
    }

    public int getTo_ord_cost() {
        return to_ord_cost;
    }

    public void setTo_ord_cost(int to_ord_cost) {
        this.to_ord_cost = to_ord_cost;
    }

    public int getTo_intrn_qty() {
        return to_intrn_qty;
    }

    public void setTo_intrn_qty(int to_intrn_qty) {
        this.to_intrn_qty = to_intrn_qty;
    }

    public int getTo_intrn_retl() {
        return to_intrn_retl;
    }

    public void setTo_intrn_retl(int to_intrn_retl) {
        this.to_intrn_retl = to_intrn_retl;
    }

    public int getTo_intrn_cost() {
        return to_intrn_cost;
    }

    public void setTo_intrn_cost(int to_intrn_cost) {
        this.to_intrn_cost = to_intrn_cost;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getDownload_date_1() {
        return download_date_1;
    }

    public void setDownload_date_1(Date download_date_1) {
        this.download_date_1 = download_date_1;
    }

    public Date getDownload_date_2() {
        return download_date_2;
    }

    public void setDownload_date_2(Date download_date_2) {
        this.download_date_2 = download_date_2;
    }

    public Date getCaldat() {
        return caldat;
    }

    public void setCaldat(Date caldat) {
        this.caldat = caldat;
    }

    public String getNombre_archivo() {
        return nombre_archivo;
    }

    public void setNombre_archivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }

    public Date getFecha_stage() {
        return fecha_stage;
    }

    public void setFecha_stage(Date fecha_stage) {
        this.fecha_stage = fecha_stage;
    }

    public Date getFecha_permanente() {
        return fecha_permanente;
    }

    public void setFecha_permanente(Date fecha_permanente) {
        this.fecha_permanente = fecha_permanente;
    }

    public Date getFecha_backup() {
        return fecha_backup;
    }

    public void setFecha_backup(Date fecha_backup) {
        this.fecha_backup = fecha_backup;
    }

    public int getOn_hand_qty_ori() {
        return on_hand_qty_ori;
    }

    public void setOn_hand_qty_ori(int on_hand_qty_ori) {
        this.on_hand_qty_ori = on_hand_qty_ori;
    }

    public int getOn_hand_cost_ori() {
        return on_hand_cost_ori;
    }

    public void setOn_hand_cost_ori(int on_hand_cost_ori) {
        this.on_hand_cost_ori = on_hand_cost_ori;
    }
}
