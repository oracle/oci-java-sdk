/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.datasafe.DataSafeClient;
import com.oracle.bmc.datasafe.model.AuditEventSummary;
import com.oracle.bmc.datasafe.requests.ListAuditEventsRequest;
import com.oracle.bmc.datasafe.responses.ListAuditEventsResponse;
import com.oracle.bmc.http.client.Serializer;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import com.oracle.bmc.objectstorage.transfer.UploadConfiguration;
import com.oracle.bmc.objectstorage.transfer.UploadManager;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class DataSafeRestAPIClientExample {
    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The first is the name of bucket where auditEvents from DataSafe will be copied
     *       <li>The second argument is the OCID of the compartment only auditEvents in specified
     *           compartment OCID and its subcompartments for which the user has INSPECT permissions
     *           directly or indirectly
     *     </ul>
     */
    String configurationFilePath = "~/.oci/config";

    String profile = "DEFAULT";

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Unexpected number of arguments received. Consult the script header comments for expected arguments");
        }
        String bucketName = args[0];
        String compartmentId = args[1];

        /**
         * Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
         * config file "~/.oci/config", and a profile in that config with the name "DEFAULT". Make
         * changes to the following line if needed and use ConfigFileReader.parse(CONFIG_LOCATION,
         * CONFIG_PROFILE);
         */
        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final ConfigFileAuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        ObjectStorage objStoreClient =
                ObjectStorageClient.builder().region(Region.EU_FRANKFURT_1).build(provider);
        System.out.println("Getting the namespace\n\n");
        com.oracle.bmc.objectstorage.responses.GetNamespaceResponse namespaceResponse =
                objStoreClient.getNamespace(GetNamespaceRequest.builder().build());
        String namespaceName = namespaceResponse.getValue();

        System.out.println("Namespace: " + namespaceName + "\n\n"); // its tenancy name
        /* Get the cursor object */

        GetObjectRequest gor =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName("cursor")
                        .build();
        System.out.println(
                "Getting content for object cursor " + " from bucket: " + bucketName + "\n\n");

        String result = "FAILED";

        try {
            GetObjectResponse response = objStoreClient.getObject(gor);
            result =
                    new BufferedReader(new InputStreamReader(response.getInputStream()))
                            .lines()
                            .collect(Collectors.joining("\n"));
        } catch (com.oracle.bmc.model.BmcException e) {
            System.out.println("ignore");
        }
        System.out.println(
                "Finished reading content for object cursor, last upload's last auditEvent record's timecollected "
                        + result
                        + "\n\n");

        DataSafeClient datasafeClient = DataSafeClient.builder().build(provider);

        ListAuditEventsResponse eventList = null;

        long count = 0;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        String endDate = dateFormat.format(Date.from(Instant.now()));
        String strDate = null;
        /*
         * when no prev data is uploaded we start pushing from 1 day before collected
         * data
         */
        if (result.equals("FAILED")) {

            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DATE, -1);
            Date OnedayBefore = cal.getTime();

            strDate = dateFormat.format(OnedayBefore);
            System.out.println(strDate);

            eventList =
                    datasafeClient.listAuditEvents(
                            ListAuditEventsRequest.builder()
                                    .compartmentId(compartmentId)
                                    .compartmentIdInSubtree(true)
                                    .accessLevel(ListAuditEventsRequest.AccessLevel.Accessible)
                                    .limit(10000)
                                    .scimQuery(
                                            "(timeCollected gt \""
                                                    + strDate
                                                    + "\") and (timeCollected le \""
                                                    + endDate
                                                    + "\")")
                                    .sortOrder(ListAuditEventsRequest.SortOrder.Asc)
                                    .sortBy(ListAuditEventsRequest.SortBy.TimeCollected)
                                    .build());

        } else {
            Date date = dateFormat.parse(result);
            strDate = dateFormat.format(date);
            eventList =
                    datasafeClient.listAuditEvents(
                            ListAuditEventsRequest.builder()
                                    .compartmentId(compartmentId)
                                    .compartmentIdInSubtree(true)
                                    .accessLevel(ListAuditEventsRequest.AccessLevel.Accessible)
                                    .limit(10000)
                                    .scimQuery(
                                            "(timeCollected gt \""
                                                    + strDate
                                                    + "\") and (timeCollected le \""
                                                    + endDate
                                                    + "\")")
                                    .build());
        }
        System.out.println(
                "Querying for auditEvents with timeCollected Start = "
                        + strDate
                        + ", End = "
                        + endDate
                        + "\n\n");

        System.out.println(
                "Count" + eventList.getAuditEventCollection().getItems().size() + "\n\n");
        if (eventList.getAuditEventCollection().getItems().size() > 0) {
            Serializer mapper = Serializer.getDefault();
            StringBuffer sb = new StringBuffer();
            AtomicBoolean isFirst = new AtomicBoolean(true);
            count = eventList.getAuditEventCollection().getItems().size();
            eventList
                    .getAuditEventCollection()
                    .getItems()
                    .forEach(
                            it -> {
                                try {
                                    if (isFirst.get()) {
                                        isFirst.set(false);
                                    } else {
                                        sb.append("\n");
                                    }
                                    sb.append(mapper.writeValueAsString(it));

                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            });
            if (count > 0)
                uploadtoOS(
                        "auditeventjson"
                                + Instant.now()
                                + " _noofrecords_ "
                                + count
                                + " Start ="
                                + strDate
                                + ", End="
                                + endDate,
                        sb.toString(),
                        bucketName,
                        namespaceName);
        }
        if (count >= 1) {
            AuditEventSummary lastrecord =
                    eventList.getAuditEventCollection().getItems().get((int) (count - 1));
            // upload the lastrecord's timecollected so that we start the next run's push to
            // after that
            uploadtoOS(
                    "cursor",
                    dateFormat.format(lastrecord.getTimeCollected()),
                    bucketName,
                    namespaceName);
        }
        objStoreClient.close();
        datasafeClient.close();
    }

    private static void uploadtoOS(
            String fileName, String value, String bucketName, String namespaceName)
            throws Exception {
        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final ConfigFileAuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        ObjectStorage client =
                ObjectStorageClient.builder().region(Region.EU_FRANKFURT_1).build(provider);

        byte[] byteVal = value.getBytes(StandardCharsets.UTF_8);

        UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder()
                        .allowMultipartUploads(false)
                        .allowParallelUploads(true)
                        .build();
        UploadManager uploadManager = new UploadManager(client, uploadConfiguration);

        Map<String, String> metaData = new HashMap<>();
        metaData.put("RequestId", "datasafeAuditEvents" + Instant.now());
        PutObjectRequest request =
                PutObjectRequest.builder()
                        .opcMeta(metaData)
                        .bucketName(bucketName)
                        .namespaceName(namespaceName)
                        .objectName(fileName)
                        .contentType("text/plain")
                        .contentLanguage("en")
                        .contentEncoding("utf-8")
                        .build();

        UploadManager.UploadRequest uploadDetails =
                UploadManager.UploadRequest.builder(
                                new ByteArrayInputStream(byteVal), byteVal.length)
                        .allowOverwrite(true)
                        .build(request);
        UploadManager.UploadResponse response = uploadManager.upload(uploadDetails);
        System.out.println(
                "Upload complete at  "
                        + new Date()
                        + " of "
                        + fileName
                        + "  OpcRequestId: "
                        + response.getOpcRequestId()
                        + "\n\n");
    }
}
