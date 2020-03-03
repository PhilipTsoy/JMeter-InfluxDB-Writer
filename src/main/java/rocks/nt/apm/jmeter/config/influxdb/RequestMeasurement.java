package rocks.nt.apm.jmeter.config.influxdb;

/**
 * Constants (Tag, Field, Measurement) names for the requests measurement.
 * 
 * @author Alexander Wert
 *
 */
public interface RequestMeasurement {

	/**
	 * Measurement name.
	 */
	String MEASUREMENT_NAME = "requestsRaw";

	/**
	 * Tags.
	 * 
	 * @author Alexander Wert
	 *
	 */
	public interface Tags {
		/**
		 * Request name tag.
		 */
		String REQUEST_NAME = "requestName";

        /** 
        * Influx DB tag for a unique identifier for each execution(aka 'run') of a load test.
        */  
        String RUN_ID = "runId";

        /** 
        * Test name field
        */  
        String TEST_NAME = "testName";
	}

	/**
	 * Fields.
	 * 
	 * @author Alexander Wert
	 *
	 */
	public interface Fields {
		/**
		 * Response time field.
		 */
		String RESPONSE_TIME = "responseTime";

		/**
		 * Error count field.
		 */
		String ERROR_COUNT = "errorCount";

		/**
		 * Thread name field
		 */
		String THREAD_NAME = "threadName";

		/**
		 * Node name field
		 */
		String NODE_NAME = "nodeName";
		
		/**
		 * Response code filed
		 */
		String RESPONSE_CODE = "responseCode";

		/**
		 * Response message filed
		 */
		String RESPONSE_MSG = "responseMsg";
		/**
		 * Sent bytes in request field
		 */
		String SENT_BYTES = "sentBytes";
		/**
		 * Received bytes in response filed
		 */
		String RECEIVED_BYTES = "receivedBytes";
		
		/**
		 * URL
		 */
		String URL = "url";
		/**
		 * URL field
		 */
		String IS_SUCCESSFUL = "success";
		/**
		 * HTTP method field
		 */
		String HTTP_METHOD = "httpMethod";
		/**
		 * Assertion fail message field
		 */
		String ASSERTION_FAIL_MSG = "assertionFailMsg";
	}
}
