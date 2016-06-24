package com.gxwtech.roundtrip2.RoundtripService.medtronic.PumpData.records;

import com.gxwtech.roundtrip2.RoundtripService.medtronic.PumpModel;

/**
 * Created by geoff on 6/5/16.
 */
public class ChangeSensorRateOfChangeAlertSetupPumpEvent extends TimeStampedRecord {
    public ChangeSensorRateOfChangeAlertSetupPumpEvent() {}

    @Override
    public int getLength() { return 12; }

    @Override
    public String getShortTypeName() {
        return "Ch Sensor ROC Alert";
    }

}
