package fi.tut.fast.smx;

import java.util.logging.Logger;


public class FunctionBlockExample implements IFbExample{

    private static final transient Logger logger = Logger.getLogger(FunctionBlockExample.class.getName());
	private String someProperty = "thing";
	
	public String getSomeProperty() {
		return someProperty;
	}


	public void setSomeProperty(String someProperty) {
		this.someProperty = someProperty;
	}


	@Override
	public String sayHello(Object whatever){
		  logger.info(">>>> " + someProperty + " " + whatever);
		  return "hello " + whatever;
	  }


	public void destroy() throws Exception {
    	logger.info("OSGi Bundle Stopping.");
	}

	public void init() throws Exception {
    	logger.info("OSGi Bundle Initialized.");
	}

}
