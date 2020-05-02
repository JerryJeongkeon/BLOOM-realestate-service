package com.bloom.fabric;

import java.util.List;

public interface IFabricCCService {

	public FabricRecord query(String num);

	public boolean registerBuildingInfo(FabricRecord fb);

	List<FabricRecord> getBuildingHistory(String Serial);

	public MaintenanceRecord queryMaintenance(String num);

	public boolean registerMaintenanceInfo(MaintenanceRecord mr);

//    boolean confirmItem(final long iid, final long uid);
//    List<FabricRecord> getFabricHistory(final long iid);

}