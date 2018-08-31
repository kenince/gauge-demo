package com.company.gaugedemo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|indicator")
@Table(name = "GAUGEDEMO_KPI")
@Entity(name = "gaugedemo$KPI")
public class KPI extends StandardEntity {
    private static final long serialVersionUID = 8299249347900769405L;

    @Column(name = "INDICATOR_")
    protected String indicator;

    @Column(name = "BASELINE")
    protected Integer baseline;

    @Column(name = "TARGET")
    protected Integer target;

    @Column(name = "ACTUAL")
    protected Integer actual;

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setBaseline(Integer baseline) {
        this.baseline = baseline;
    }

    public Integer getBaseline() {
        return baseline;
    }

    public void setTarget(Integer target) {
        this.target = target;
    }

    public Integer getTarget() {
        return target;
    }

    public void setActual(Integer actual) {
        this.actual = actual;
    }

    public Integer getActual() {
        return actual;
    }


}