/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.google.common.collect.ImmutableList;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.monitoring.MonitoringClient;
import com.oracle.bmc.monitoring.model.Alarm;
import com.oracle.bmc.monitoring.model.CreateAlarmDetails;
import com.oracle.bmc.monitoring.model.Suppression;
import com.oracle.bmc.monitoring.model.UpdateAlarmDetails;
import com.oracle.bmc.monitoring.requests.CreateAlarmRequest;
import com.oracle.bmc.monitoring.requests.DeleteAlarmRequest;
import com.oracle.bmc.monitoring.requests.GetAlarmHistoryRequest;
import com.oracle.bmc.monitoring.requests.GetAlarmRequest;
import com.oracle.bmc.monitoring.requests.ListAlarmsRequest;
import com.oracle.bmc.monitoring.requests.ListAlarmsStatusRequest;
import com.oracle.bmc.monitoring.requests.RemoveAlarmSuppressionRequest;
import com.oracle.bmc.monitoring.requests.UpdateAlarmRequest;
import com.oracle.bmc.monitoring.responses.CreateAlarmResponse;
import com.oracle.bmc.monitoring.responses.GetAlarmHistoryResponse;
import com.oracle.bmc.monitoring.responses.GetAlarmResponse;
import com.oracle.bmc.monitoring.responses.ListAlarmsResponse;
import com.oracle.bmc.monitoring.responses.ListAlarmsStatusResponse;
import com.oracle.bmc.monitoring.responses.RemoveAlarmSuppressionResponse;
import com.oracle.bmc.monitoring.responses.UpdateAlarmResponse;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * This class demonstrates how to use the Monitoring api in the Java SDK. This will cover:
 *
 * <ul>
 *   <li>Creating, updating, retrieving, listing and deleting alarms</li>
 *   <li>Retrieving alarm state history</li>
 *   <li>Listing status of alarms</li>
 * </ul>
 *
 * This class makes the following assumptions:
 * <ul>
 *   <li>
 *      The configuration file used by service clients will be sourced from the default
 *      location (~/.oci/config) and the DEFAULT profile will be used
 *   </li>
 *   <li>Resources will be created in us-phoenix-1</li>
 *   <li>
 *      Alarms will be created in the compartment specified by the user.
 *   </li>
 *   <li>
 *      The user has the appropriate permissions to create alarms in the compartment specified by user,
 *      read metrics in the metric compartment specified by user, and publish message in the destination
 *      specified by user.
 *   </li>
 * <ul>
 */
public class MonitoringAlarmExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE_DEFAULT = "DEFAULT";
    private static final String DISPLAY_NAME = "Alarm for Java SDK sample";
    private static final String NAME_SPACE = "oci_computeagent";
    private static final String METRIC_QUERY = "CpuUtilization[1m].max() > 75";
    private static final String RESOLUTION = "1m";
    private static final String PENDING_DURATION = "PT10M";
    private static final Alarm.Severity ALERT_SEVERITY = Alarm.Severity.Error;
    private static final String BODY = "notification body";
    private static final String REPEAT_DURATION = "PT4H";
    // Suppress from now.
    private static final Date SUPPRESS_FROM = new Date();
    // Suppress for one day.
    private static final Date SUPPRESS_UNTIL =
            new Date(SUPPRESS_FROM.getTime() + TimeUnit.MINUTES.toMillis(24));

    /**
     * The entry point for the example.
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            throw new IllegalArgumentException(
                    "Usage:\n"
                            + "MonitoringAlarmExample <AlarmCompartment> <MetricCompartment> <NotificationDestination> "
                            + "[<oci-profile-name>]");
        }

        final String compartmentId = args[0];
        final String metricCompartmentId = args[1];
        final String destination = args[2];
        final String profile_name = args.length > 3 ? args[3] : CONFIG_PROFILE_DEFAULT;

        final ConfigFile configFile = ConfigFileReader.parse(CONFIG_LOCATION, profile_name);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final MonitoringClient monitoringClient = new MonitoringClient(provider);
        monitoringClient.setRegion(Region.US_PHOENIX_1);

        String alarmId = null;
        try {
            // Create a new alarm.
            final CreateAlarmResponse createAlarmResponse =
                    monitoringClient.createAlarm(
                            CreateAlarmRequest.builder()
                                    .createAlarmDetails(
                                            CreateAlarmDetails.builder()
                                                    .displayName(DISPLAY_NAME)
                                                    .compartmentId(compartmentId)
                                                    .metricCompartmentId(metricCompartmentId)
                                                    .namespace(NAME_SPACE)
                                                    .query(METRIC_QUERY)
                                                    .resolution(RESOLUTION)
                                                    .pendingDuration(PENDING_DURATION)
                                                    .severity(ALERT_SEVERITY)
                                                    .body(BODY)
                                                    .destinations(ImmutableList.of(destination))
                                                    .repeatNotificationDuration(REPEAT_DURATION)
                                                    .isEnabled(true)
                                                    .build())
                                    .build());
            System.out.printf("Created alarm: %s.%n", createAlarmResponse.getAlarm());
            alarmId = createAlarmResponse.getAlarm().getId();

            // Update the new alarm.
            final UpdateAlarmResponse updateAlarmResponse =
                    monitoringClient.updateAlarm(
                            UpdateAlarmRequest.builder()
                                    .alarmId(alarmId)
                                    .updateAlarmDetails(
                                            UpdateAlarmDetails.builder()
                                                    .suppression(
                                                            Suppression.builder()
                                                                    .description(
                                                                            "suppress the alarm.")
                                                                    .timeSuppressFrom(SUPPRESS_FROM)
                                                                    .timeSuppressUntil(
                                                                            SUPPRESS_UNTIL)
                                                                    .build())
                                                    .build())
                                    .build());
            System.out.printf("Updated alarm: %s.%n", updateAlarmResponse.getAlarm());

            final RemoveAlarmSuppressionResponse removeSuppressionResponse =
                    monitoringClient.removeAlarmSuppression(
                            RemoveAlarmSuppressionRequest.builder().alarmId(alarmId).build());
            System.out.printf("Successfully removed suppression for alarm id %s.%n", alarmId);

            // Get the new alarm.
            final GetAlarmResponse getAlarmResponse =
                    monitoringClient.getAlarm(GetAlarmRequest.builder().alarmId(alarmId).build());
            System.out.printf(
                    "Retrieved alarm for id %s: %s.%n", alarmId, getAlarmResponse.getAlarm());

            // Get alarm history.
            final GetAlarmHistoryResponse getAlarmHistoryResponse =
                    monitoringClient.getAlarmHistory(
                            GetAlarmHistoryRequest.builder().alarmId(alarmId).build());
            System.out.printf(
                    "Alarm history for id %s: %s.%n",
                    alarmId,
                    getAlarmHistoryResponse.getAlarmHistoryCollection().getEntries());

            // List alarms.
            final ListAlarmsResponse listAlarmsResponse =
                    monitoringClient.listAlarms(
                            ListAlarmsRequest.builder()
                                    .compartmentId(compartmentId)
                                    .displayName(DISPLAY_NAME)
                                    .build());
            System.out.printf("Retrieved alarms: %s.%n", listAlarmsResponse.getItems());

            // List alarm status.
            final ListAlarmsStatusResponse listAlarmsStatusResponse =
                    monitoringClient.listAlarmsStatus(
                            ListAlarmsStatusRequest.builder()
                                    .displayName(DISPLAY_NAME)
                                    .compartmentId(compartmentId)
                                    .build());
            System.out.printf(
                    "Retrieved status of alarms: %s.%n", listAlarmsStatusResponse.getItems());
        } finally {
            if (alarmId != null) {
                monitoringClient.deleteAlarm(DeleteAlarmRequest.builder().alarmId(alarmId).build());
            }
            monitoringClient.close();
        }
    }
}
