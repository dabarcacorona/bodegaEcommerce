package cl.corona.bodegaEcommerce.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "BOD_48", procedureName = "FOTO_INVENTARIO_ECOMMERCE", parameters = {
                @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, name = "C1", type = Class.class)})})
public class bodegaSmall {

    @Id
    @JsonIgnore
    private int id;

    public int audit_number;

    private int org_lvl_child;

    private int prd_lvl_child;

    private int org_lvl_number;

    private String prd_lvl_number;

    private int inv_type_code;

    private int on_hand_qty;

    private int on_hand_cost;

    private int on_hand_cost_ori;

    public bodegaSmall() {
        super();
    }


    public bodegaSmall(int id, int audit_number, int org_lvl_child, int prd_lvl_child, int org_lvl_number, String prd_lvl_number, int inv_type_code, int on_hand_qty, int on_hand_cost, int on_hand_cost_ori) {
        this.id = id;
        this.audit_number = audit_number;
        this.org_lvl_child = org_lvl_child;
        this.prd_lvl_child = prd_lvl_child;
        this.org_lvl_number = org_lvl_number;
        this.prd_lvl_number = prd_lvl_number;
        this.inv_type_code = inv_type_code;
        this.on_hand_qty = on_hand_qty;
        this.on_hand_cost = on_hand_cost;
        this.on_hand_cost_ori = on_hand_cost_ori;
    }

    @Override
    public String toString() {
        return "bodegaSmall{" +
                "id=" + id +
                ", audit_number=" + audit_number +
                ", org_lvl_child=" + org_lvl_child +
                ", prd_lvl_child=" + prd_lvl_child +
                ", org_lvl_number=" + org_lvl_number +
                ", prd_lvl_number='" + prd_lvl_number + '\'' +
                ", inv_type_code=" + inv_type_code +
                ", on_hand_qty=" + on_hand_qty +
                ", on_hand_cost=" + on_hand_cost +
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

    public int getOn_hand_cost() {
        return on_hand_cost;
    }

    public void setOn_hand_cost(int on_hand_cost) {
        this.on_hand_cost = on_hand_cost;
    }

    public int getOn_hand_cost_ori() {
        return on_hand_cost_ori;
    }

    public void setOn_hand_cost_ori(int on_hand_cost_ori) {
        this.on_hand_cost_ori = on_hand_cost_ori;
    }
}
