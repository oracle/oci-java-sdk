/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.monitoring.MonitoringClient;
import com.oracle.bmc.monitoring.model.ListMetricsDetails;
import com.oracle.bmc.monitoring.requests.ListMetricsRequest;
import com.oracle.bmc.monitoring.responses.ListMetricsResponse;

import java.io.IOException;

/**
 * This class demonstrates how to use the Monitoring api in the Java SDK. This will cover:
 *
 * <ul>
 *   <li>Listing metrics</li>
 * </ul>
 *
 * This class makes the following assumptions:
 * <ul>
 *   <li>
 *      The configuration file used by service clients will be sourced from the default
 *      location (~/.oci/config) and the DEFAULT profile will be used
 *   </li>
 *   <li>Region where the example will be run is: us-phoenix-1</li>
 *   <li>
 *      The user has the appropriate permissions to post/list/get metrics in the compartment specified.
 *   </li>
 * <ul>
 */
public class MonitoringMetricListExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE_DEFAULT = "DEFAULT";

    private static void printUsageAndThrowException(String message) {
        throw new IllegalArgumentException(
                message
                        + "Usage:\n"
                        + "MonitoringMetricListExample <compartment> [<namespace> [<metricName>]]");
    }

    /**
     * The entry point for the example.
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            printUsageAndThrowException("Insufficient args\n");
        }

        final String compartment = args[0];
        final String namespace = args.length > 1 ? args[1] : null;
        final String metricName = args.length > 2 ? args[2] : null;

        try (MonitoringClient monitoringClient = getMonitoringClient(CONFIG_PROFILE_DEFAULT)) {
            final ListMetricsRequest request =
                    ListMetricsRequest.builder()
                            .compartmentId(compartment)
                            .listMetricsDetails(
                                    ListMetricsDetails.builder()
                                            .namespace(namespace)
                                            .name(metricName)
                                            .build())
                            .build();

            System.out.printf("Request constructed:\n%s\n\n", request.getListMetricsDetails());

            System.out.println("Sending...");
            ListMetricsResponse response = monitoringClient.listMetrics(request);

            System.out.printf(
                    "\n\nReceived response [opc-request-id: %s]\n", response.getOpcRequestId());
            System.out.printf("%s\n\n", response.getItems());
        }
    }

    private static MonitoringClient getMonitoringClient(String profile) throws IOException {
        final ConfigFile configFile = ConfigFileReader.parse(CONFIG_LOCATION, profile);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final MonitoringClient monitoringClient = new MonitoringClient(provider);
        monitoringClient.setRegion(Region.US_PHOENIX_1);
        return monitoringClient;
    }
}
