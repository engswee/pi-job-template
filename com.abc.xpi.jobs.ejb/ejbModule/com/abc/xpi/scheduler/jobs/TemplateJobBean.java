package com.abc.xpi.scheduler.jobs;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;

import com.sap.scheduler.runtime.JobContext;
import com.sap.scheduler.runtime.mdb.MDBJobImplementation;

/**
 * Message-Driven Bean implementation class for: TemplateJob
 *
 */
@MessageDriven(activationConfig = { 
				@ActivationConfigProperty( propertyName = "messageSelector", 
										   propertyValue = "JobDefinition='TemplateJob'"), 
				@ActivationConfigProperty( propertyName = "destinationType", 
										   propertyValue = "javax.jms.Queue") 		
})

public class TemplateJobBean extends MDBJobImplementation {
	private static final long serialVersionUID = 3471245523103395886L;

	@Override
	public void onJob(JobContext ctx) throws Exception {
		Logger log = ctx.getLogger();
        log.info("Sample Logging Test");
	}
}
