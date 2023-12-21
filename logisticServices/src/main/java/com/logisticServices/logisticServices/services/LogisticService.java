package com.logisticServices.logisticServices.services;

import java.util.List;

import com.logisticServices.logisticServices.entities.Logistic;

public interface LogisticService {
	
	public List<Logistic> getLogisticLoads();
	
	public List<Logistic> getLogisticLoadByShipperId(String shipperId);
	
	public Logistic getLogisticLoadByLoadId(long loadId);
	
	public Logistic addLogisticLoad(Logistic logistic);
	
	public Logistic updateLogisticLoad(long loadId, Logistic logistic);
	
	public void deleteLogisticLoad(long loadId);
	
}
