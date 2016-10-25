package com.fuse.RMI;

import org.springframework.remoting.rmi.RmiServiceExporter;

public class RMIServerConfig extends RmiServiceExporter{

	@Override
	public void setServiceName(String serviceName) {
		super.setServiceName("CalculationService");
	}

	@Override
	public void setReplaceExistingBinding(boolean replaceExistingBinding) {
		super.setReplaceExistingBinding(true);
	}

	@Override
	public void setRegistryPort(int registryPort) {
		super.setRegistryPort(5050);
	}
	
		
	

}
