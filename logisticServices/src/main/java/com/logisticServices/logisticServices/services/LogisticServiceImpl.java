package com.logisticServices.logisticServices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.logisticServices.logisticServices.dao.LogisticDao;
import com.logisticServices.logisticServices.entities.Logistic;

@Service
public class LogisticServiceImpl implements LogisticService{

		@Autowired
		private LogisticDao logisticDao;
		
		// Constructor
		public LogisticServiceImpl() {}
		
		// get the list of all Logistic loads
		@Override
		public List<Logistic> getLogisticLoads() {
			return logisticDao.findAll();
		}
		
		// get load with 'loadId'
		@Override
		public Logistic getLogisticLoadByLoadId(long loadId) {
			return logisticDao.findById(loadId).get();
		}
		
		// get load with 'shipperId'
		@Override
		public List<Logistic> getLogisticLoadByShipperId(String shipperId) {
			return logisticDao.findByShipperId(shipperId);
		}
		
		// add the load
		@Override
		public Logistic addLogisticLoad(Logistic logistic) {
			return logisticDao.save(logistic);
		}

		// updates the load 
		@Override
		public Logistic updateLogisticLoad(long loadId, Logistic logistic) {
			deleteLogisticLoad(loadId);
			logistic.setLoadId(loadId);
			return logisticDao.save(logistic);
		}
		
		// delete the load with 'loadId'
		@Override
		public void deleteLogisticLoad(long loadId) {
			Logistic entity = logisticDao.findById(loadId).get();
			logisticDao.delete(entity);
		}

	
}
