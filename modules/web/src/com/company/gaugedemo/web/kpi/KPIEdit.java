package com.company.gaugedemo.web.kpi;

import com.haulmont.charts.gui.components.charts.AngularGaugeChart;
import com.haulmont.cuba.core.entity.KeyValueEntity;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.gaugedemo.entity.KPI;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;

public class KPIEdit extends AbstractEditor<KPI> {
    @Inject
    private CollectionDatasource<KeyValueEntity, Object> kpiGaugeDs;
    @Inject
    private AngularGaugeChart gaugeChart;
    @Override
    protected void postInit() {
        super.postInit();
        kpiGaugeDs.refresh();
        KeyValueEntity value = kpiGaugeDs.getItems().iterator().next();
        Integer startValue = (Integer)value.getValue("baseline");
        Integer endValue = (Integer)value.getValue("target");
        Integer actuals = (Integer)value.getValue("actuals");
        String bottomText = String.valueOf((Integer)value.getValue("actuals"));
        gaugeChart.getAxes().get(0).setStartValue(Double.valueOf(startValue));
        gaugeChart.getAxes().get(0).setEndValue(Double.valueOf(endValue));
        gaugeChart.getAxes().get(0).setBottomText(bottomText+"/"+endValue);
        gaugeChart.getArrows().get(0).setValue(Double.valueOf(actuals)>Double.valueOf(endValue)?Double.valueOf(endValue):Double.valueOf(actuals));
    }

}