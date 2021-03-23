package projectjobscheduling.domain.equipment;

import common.domain.AbstractPersistable;

/**
 * 设备
 */
public class Equipment extends AbstractPersistable {
    private String equipmentCode;

    public Equipment(long id, String equipmentCode) {
        super(id);
        this.equipmentCode = equipmentCode;
    }

    public String getEquipmentCode() {
        return equipmentCode;
    }

    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode;
    }
}
