package projectjobscheduling.domain.equipment;

import common.domain.AbstractPersistable;

/**
 * 设备的可用性
 */
public class EquipmentAvailable extends AbstractPersistable {
    private Equipment equipment;
    private long availableDate;
    private long capacity;

    public EquipmentAvailable(Long id, Equipment equipment, long availableDate, long capacity) {
        super(id);
        this.equipment = equipment;
        this.availableDate = availableDate;
        this.capacity = capacity;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public long getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(long availableDate) {
        this.availableDate = availableDate;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }
}
