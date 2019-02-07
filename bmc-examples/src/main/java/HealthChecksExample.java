/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.healthchecks.HealthChecks;
import com.oracle.bmc.healthchecks.HealthChecksClient;
import com.oracle.bmc.healthchecks.model.CreateHttpMonitorDetails;
import com.oracle.bmc.healthchecks.model.CreatePingMonitorDetails;
import com.oracle.bmc.healthchecks.model.HealthChecksVantagePointSummary;
import com.oracle.bmc.healthchecks.model.HttpMonitor;
import com.oracle.bmc.healthchecks.model.HttpMonitorSummary;
import com.oracle.bmc.healthchecks.model.HttpProbeProtocol;
import com.oracle.bmc.healthchecks.model.HttpProbeResultSummary;
import com.oracle.bmc.healthchecks.model.PingMonitor;
import com.oracle.bmc.healthchecks.model.PingMonitorSummary;
import com.oracle.bmc.healthchecks.model.PingProbeProtocol;
import com.oracle.bmc.healthchecks.model.PingProbeResultSummary;
import com.oracle.bmc.healthchecks.model.UpdateHttpMonitorDetails;
import com.oracle.bmc.healthchecks.model.UpdatePingMonitorDetails;
import com.oracle.bmc.healthchecks.requests.CreateHttpMonitorRequest;
import com.oracle.bmc.healthchecks.requests.CreatePingMonitorRequest;
import com.oracle.bmc.healthchecks.requests.DeleteHttpMonitorRequest;
import com.oracle.bmc.healthchecks.requests.DeletePingMonitorRequest;
import com.oracle.bmc.healthchecks.requests.GetHttpMonitorRequest;
import com.oracle.bmc.healthchecks.requests.GetPingMonitorRequest;
import com.oracle.bmc.healthchecks.requests.ListHealthChecksVantagePointsRequest;
import com.oracle.bmc.healthchecks.requests.ListHttpMonitorsRequest;
import com.oracle.bmc.healthchecks.requests.ListHttpProbeResultsRequest;
import com.oracle.bmc.healthchecks.requests.ListPingMonitorsRequest;
import com.oracle.bmc.healthchecks.requests.ListPingProbeResultsRequest;
import com.oracle.bmc.healthchecks.requests.UpdateHttpMonitorRequest;
import com.oracle.bmc.healthchecks.requests.UpdatePingMonitorRequest;
import com.oracle.bmc.healthchecks.responses.CreateHttpMonitorResponse;
import com.oracle.bmc.healthchecks.responses.CreatePingMonitorResponse;
import com.oracle.bmc.healthchecks.responses.DeleteHttpMonitorResponse;
import com.oracle.bmc.healthchecks.responses.DeletePingMonitorResponse;
import com.oracle.bmc.healthchecks.responses.GetHttpMonitorResponse;
import com.oracle.bmc.healthchecks.responses.GetPingMonitorResponse;
import com.oracle.bmc.healthchecks.responses.UpdateHttpMonitorResponse;
import com.oracle.bmc.healthchecks.responses.UpdatePingMonitorResponse;

import java.util.Arrays;
import java.util.Iterator;

/*
   This class demonstrates creating/listing/updating/deleting HTTP and Ping monitors using the HealthChecks service
*/
public class HealthChecksExample {
    public static void main(String[] args) throws Exception {
        final String configurationFilePath = "~/.oci/config";
        final String profile = "DEFAULT";

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        final HealthChecks client = new HealthChecksClient(provider);

        // TODO: Pass in the compartment ID as an argument, or enter the value directly here (if known)
        final String compartmentId = args[0];

        System.out.println("--- Listing Vantage Points ---");
        // Example of getting all the vantage points using the paginator helper:

        final Iterator<HealthChecksVantagePointSummary> vantagePoints =
                client.getPaginators()
                        .listHealthChecksVantagePointsRecordIterator(
                                ListHealthChecksVantagePointsRequest.builder().build())
                        .iterator();

        while (vantagePoints.hasNext()) {
            HealthChecksVantagePointSummary vp = vantagePoints.next();
            System.out.println(
                    String.format(
                            "Vantage point: %s, Display name: %s",
                            vp.getName(),
                            vp.getDisplayName()));
        }

        HttpMonitorExamples(client, compartmentId);
        PingMonitorExamples(client, compartmentId);
    }

    private static void HttpMonitorExamples(HealthChecks client, String compartmentId) {
        // Get existing HTTP monitors:
        final ListHttpMonitorsRequest listMonitorRequest =
                ListHttpMonitorsRequest.builder().compartmentId(compartmentId).build();

        // We're going to use the Paginator helper
        // Take a look at the available methods
        // I showed the built in for with the vantage points
        // There's also the Spliterator
        final Iterator<HttpMonitorSummary> httpMonitors =
                client.getPaginators()
                        .listHttpMonitorsRecordIterator(listMonitorRequest)
                        .iterator();

        // Get the list of HTTP monitor summaries:
        System.out.println(
                String.format(
                        "Found existing HTTP monitors: %s",
                        httpMonitors.hasNext() ? "true" : "false"));

        //If we have at least one, grab all details for it:
        if (httpMonitors.hasNext()) {
            String getFirstMonitorId = httpMonitors.next().getId();

            GetHttpMonitorResponse singleMonitorResponse =
                    client.getHttpMonitor(
                            GetHttpMonitorRequest.builder().monitorId(getFirstMonitorId).build());

            HttpMonitor monitorDetails = singleMonitorResponse.getHttpMonitor();

            System.out.println(
                    String.format("First HTTP monitor toString(): %s", monitorDetails.toString()));
        }

        // If you wanted to keep iterating, just run through the next method until you run out:
        while (httpMonitors.hasNext()) {
            HttpMonitorSummary httpSummary = httpMonitors.next();
            System.out.println(
                    String.format("HTTP monitor toString(): %s", httpSummary.toString()));
        }

        // Create a new HttpMonitor:
        CreateHttpMonitorResponse createHttpResponse =
                client.createHttpMonitor(
                        CreateHttpMonitorRequest.builder()
                                .createHttpMonitorDetails(
                                        CreateHttpMonitorDetails.builder()
                                                .displayName("Example HTTP monitor")
                                                .targets(Arrays.asList("example.com"))
                                                .intervalInSeconds(30)
                                                .protocol(HttpProbeProtocol.Http)
                                                .isEnabled(true)
                                                .compartmentId(compartmentId)
                                                .build())
                                .build());

        // New HttpMonitor:
        HttpMonitor newHttpMonitor = createHttpResponse.getHttpMonitor();

        // Update that monitor:
        UpdateHttpMonitorResponse updateHttpMonitorResponse =
                client.updateHttpMonitor(
                        UpdateHttpMonitorRequest.builder()
                                .monitorId(newHttpMonitor.getId())
                                .updateHttpMonitorDetails(
                                        UpdateHttpMonitorDetails.builder()
                                                .isEnabled(false)
                                                .intervalInSeconds(60)
                                                .build())
                                .build());

        newHttpMonitor = updateHttpMonitorResponse.getHttpMonitor();

        // Check on any results, NOTE: This can take over a minute for results to start appearing.

        Iterator<HttpProbeResultSummary> results =
                client.getPaginators()
                        .listHttpProbeResultsRecordIterator(
                                ListHttpProbeResultsRequest.builder()
                                        .probeConfigurationId(newHttpMonitor.getId())
                                        .build())
                        .iterator();

        while (results.hasNext()) {
            HttpProbeResultSummary summary = results.next();
            System.out.println(
                    String.format(
                            "Request against %s from %s at %tc was: %s",
                            summary.getTarget(),
                            summary.getVantagePointName(),
                            summary.getStartTime(),
                            summary.getIsHealthy() ? "Healthy" : "Unhealthy"));
        }

        // Delete the example HttpMonitor:
        DeleteHttpMonitorResponse deleteResponse =
                client.deleteHttpMonitor(
                        DeleteHttpMonitorRequest.builder()
                                .monitorId(newHttpMonitor.getId())
                                .build());

        // Delete response *should* be blank if successful.
    }

    private static void PingMonitorExamples(HealthChecks client, String compartmentId) {
        // Get existing PING monitors:
        final ListPingMonitorsRequest listPingMonitorRequest =
                ListPingMonitorsRequest.builder().compartmentId(compartmentId).build();

        // We're going to use the Paginator helper
        // Take a look at the available methods
        // I showed the built in for with the vantage points
        // There's also the Spliterator
        final Iterator<PingMonitorSummary> pingMonitors =
                client.getPaginators()
                        .listPingMonitorsRecordIterator(listPingMonitorRequest)
                        .iterator();

        // Get the list of PING monitor summaries:
        System.out.println(
                String.format(
                        "Found existing PING monitors: %s",
                        pingMonitors.hasNext() ? "true" : "false"));

        //If we have at least one, grab all details for it:
        if (pingMonitors.hasNext()) {
            String getFirstMonitorId = pingMonitors.next().getId();

            GetPingMonitorResponse singleMonitorResponse =
                    client.getPingMonitor(
                            GetPingMonitorRequest.builder().monitorId(getFirstMonitorId).build());

            PingMonitor monitorDetails = singleMonitorResponse.getPingMonitor();

            System.out.println(
                    String.format("First PING monitor toString(): %s", monitorDetails.toString()));
        }

        // If you wanted to keep iterating, just run through the next method until you run out:
        while (pingMonitors.hasNext()) {
            PingMonitorSummary pingSummary = pingMonitors.next();
            System.out.println(
                    String.format("PING monitor toString(): %s", pingSummary.toString()));
        }

        // Create a new PingMonitor:
        CreatePingMonitorResponse createPingResponse =
                client.createPingMonitor(
                        CreatePingMonitorRequest.builder()
                                .createPingMonitorDetails(
                                        CreatePingMonitorDetails.builder()
                                                .displayName("Example PING monitor")
                                                .targets(Arrays.asList("example.com"))
                                                .intervalInSeconds(30)
                                                .protocol(PingProbeProtocol.Icmp)
                                                .isEnabled(true)
                                                .compartmentId(compartmentId)
                                                .build())
                                .build());

        // New PingMonitor:
        PingMonitor newPingMonitor = createPingResponse.getPingMonitor();

        // Update that monitor:
        UpdatePingMonitorResponse updatePingMonitorResponse =
                client.updatePingMonitor(
                        UpdatePingMonitorRequest.builder()
                                .monitorId(newPingMonitor.getId())
                                .updatePingMonitorDetails(
                                        UpdatePingMonitorDetails.builder()
                                                .isEnabled(false)
                                                .intervalInSeconds(60)
                                                .build())
                                .build());

        newPingMonitor = updatePingMonitorResponse.getPingMonitor();

        // Check on any results, NOTE: This can take over a minute for results to start appearing.
        Iterator<PingProbeResultSummary> results =
                client.getPaginators()
                        .listPingProbeResultsRecordIterator(
                                ListPingProbeResultsRequest.builder()
                                        .probeConfigurationId(newPingMonitor.getId())
                                        .build())
                        .iterator();

        while (results.hasNext()) {
            PingProbeResultSummary summary = results.next();
            System.out.println(
                    String.format(
                            "Request against %s from %s at %tc was: %s",
                            summary.getTarget(),
                            summary.getVantagePointName(),
                            summary.getStartTime(),
                            summary.getIsHealthy() ? "Healthy" : "Unhealthy"));
        }

        // Delete the example PingMonitor:
        DeletePingMonitorResponse deleteResponse =
                client.deletePingMonitor(
                        DeletePingMonitorRequest.builder()
                                .monitorId(newPingMonitor.getId())
                                .build());

        // Delete response *should* be blank if successful.
    }
}
