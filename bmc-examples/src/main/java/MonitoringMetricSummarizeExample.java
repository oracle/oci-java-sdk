/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.monitoring.MonitoringClient;
import com.oracle.bmc.monitoring.model.SummarizeMetricsDataDetails;
import com.oracle.bmc.monitoring.requests.SummarizeMetricsDataRequest;
import com.oracle.bmc.monitoring.responses.SummarizeMetricsDataResponse;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * This class demonstrates how to use the Monitoring api in the Java SDK. This will cover:
 *
 * <ul>
 *   <li>Retrieving a summary of metric data
 * </ul>
 *
 * This class makes the following assumptions:
 *
 * <ul>
 *   <li>The configuration file used by service clients will be sourced from the default location
 *       (~/.oci/config) and the DEFAULT profile will be used
 *   <li>Region where the example will be run is: us-phoenix-1
 *   <li>The user has the appropriate permissions to summarizeMetricsData in the compartment
 *       specified.
 *       <ul>
 */
public class MonitoringMetricSummarizeExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE_DEFAULT = "DEFAULT";
    private static final Date NOW = new Date();
    private static final Date START = new Date(NOW.getTime() - TimeUnit.HOURS.toMillis(6));;
    private static final Date UNTIL = NOW;

    private static void printUsageAndThrowException(String message) {
        throw new IllegalArgumentException(
                message
                        + "Usage:\n"
                        + "MonitoringMetricSummarizeExample <compartment> <namespace> <query> [oci-profile-name]");
    }

    /** The entry point for the example. */
    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            printUsageAndThrowException("Insufficient args\n");
        }

        final String compartment = args[0];
        final String namespace = args[1];
        final String query = args[2];
        final String profile = args.length > 3 ? args[4] : CONFIG_PROFILE_DEFAULT;

        try (MonitoringClient monitoringClient = getMonitoringClient(profile)) {
            final SummarizeMetricsDataRequest request =
                    SummarizeMetricsDataRequest.builder()
                            .compartmentId(compartment)
                            .summarizeMetricsDataDetails(
                                    SummarizeMetricsDataDetails.builder()
                                            .namespace(namespace)
                                            .query(query)
                                            .startTime(START)
                                            .endTime(UNTIL)
                                            .build())
                            .build();

            System.out.printf(
                    "Request constructed:\n%s\n\n", request.getSummarizeMetricsDataDetails());

            System.out.println("Sending...");
            final SummarizeMetricsDataResponse response =
                    monitoringClient.summarizeMetricsData(request);

            System.out.printf(
                    "\n\nReceived response [opc-request-id: %s]\n", response.getOpcRequestId());
            System.out.printf("%s\n", response.getItems().toString());
        }
    }

    private static MonitoringClient getMonitoringClient(String profile) throws IOException {
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final MonitoringClient monitoringClient =
                MonitoringClient.builder().region(Region.US_PHOENIX_1).build(provider);
        return monitoringClient;
    }
}
