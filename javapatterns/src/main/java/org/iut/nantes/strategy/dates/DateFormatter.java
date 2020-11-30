package org.iut.nantes.strategy.dates;

import java.util.Date;

public class DateFormatter {
    private DateFormatStrat formatStrat;

    public DateFormatter(DateFormatStrat formatStrat) {
        this.formatStrat = formatStrat;
    }

    public String format(Date date) {
        return formatStrat.formatStrat(date);
    }

    public DateFormatStrat getFormatStrat() {
        return formatStrat;
    }

    public void setFormatStrat(DateFormatStrat formatStrat) {
        this.formatStrat = formatStrat;
    }
}
