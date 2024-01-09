/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.datalabelingservice.DataLabelingManagement;
import com.oracle.bmc.datalabelingservice.DataLabelingManagementClient;
import com.oracle.bmc.datalabelingservice.model.AddDatasetLabelsDetails;
import com.oracle.bmc.datalabelingservice.model.CreateDatasetDetails;
import com.oracle.bmc.datalabelingservice.model.ImageDatasetFormatDetails;
import com.oracle.bmc.datalabelingservice.model.Label;
import com.oracle.bmc.datalabelingservice.model.LabelSet;
import com.oracle.bmc.datalabelingservice.model.ObjectStorageSourceDetails;
import com.oracle.bmc.datalabelingservice.model.OperationStatus;
import com.oracle.bmc.datalabelingservice.model.RemoveDatasetLabelsDetails;
import com.oracle.bmc.datalabelingservice.model.RenameDatasetLabelsDetails;
import com.oracle.bmc.datalabelingservice.model.WorkRequest;
import com.oracle.bmc.datalabelingservice.requests.AddDatasetLabelsRequest;
import com.oracle.bmc.datalabelingservice.requests.CreateDatasetRequest;
import com.oracle.bmc.datalabelingservice.requests.GetWorkRequestRequest;
import com.oracle.bmc.datalabelingservice.requests.RemoveDatasetLabelsRequest;
import com.oracle.bmc.datalabelingservice.requests.RenameDatasetLabelsRequest;
import com.oracle.bmc.datalabelingservice.responses.AddDatasetLabelsResponse;
import com.oracle.bmc.datalabelingservice.responses.CreateDatasetResponse;
import com.oracle.bmc.datalabelingservice.responses.RemoveDatasetLabelsResponse;
import com.oracle.bmc.datalabelingservice.responses.RenameDatasetLabelsResponse;

/**
 * This class provides an example of how to use Data Labeling Service to add, rename and remove
 * labels.
 *
 * <p>The Data Labeling service queried by this example will be assigned:
 *
 * <ul>
 *   <li>an endpoint url defined by constant ENDPOINT
 *   <li>The configuration file used by service clients will be sourced from the default location
 *       (~/.oci/config) and the DEFAULT profile will be used.
 * </ul>
 *
 * @param args Arguments to provide to the example. The following arguments are expected:
 *     <ul>
 *       <li>The first argument is the OCID of the compartment.
 *     </ul>
 */
public class DataLabelingLabelExample {

    private static final String ENDPOINT = "https://dlstest-cp.ap-mumbai-1.oci.oraclecloud.com";
    private static DataLabelingManagement client;
    private static ScheduledExecutorService executor;
    private static final ObjectMapper objectMapper;

    static {
        try {
            executor = Executors.newSingleThreadScheduledExecutor();
        } catch (Exception e) {
            System.err.println("Unable to obtain scheduled executor service");
        }
        objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.setFilterProvider(new SimpleFilterProvider().setFailOnUnknownId(false));
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Unexpected number of arguments received. Consult the script header comments for expected arguments");
        }

        final String compartmentId = args[0];
        DataLabelingManagement client = getDataLabelingCpClient();

        System.out.println("Creating datset");
        String datasetId = createDataset(client, compartmentId);

        System.out.println("Adding Labels to dataset with id " + datasetId);
        addLabels(client, datasetId);

        System.out.println("Renaming Labels of dataset with id " + datasetId);
        renameLabels(client, datasetId);

        System.out.println("Removing Labels of dataset with id " + datasetId);
        removeLabels(client, datasetId);

        executor.shutdown();
    }

    public static DataLabelingManagement getDataLabelingCpClient() throws IOException {
        /*
         * Configuring the AuthenticationDetailsProvider. It's assuming there is a
         * default OCI config file "~/.oci/config", and a profile in that config with
         * the name "DEFAULT". Make changes to the following line if needed and use
         * ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
         */
        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        client = new DataLabelingManagementClient(provider);
        client.setEndpoint(ENDPOINT);
        client.setRegion(Region.AP_MUMBAI_1);
        return client;
    }

    public static String createDataset(DataLabelingManagement client, String compartmentId)
            throws JsonProcessingException {
        /*
         * Object storage source details to provide bucket information where datasets (
         * images/text/document files) are present for labeling. Make sure the principal
         * being used has object storage bucket and object access.
         */
        ObjectStorageSourceDetails sourceDetails =
                ObjectStorageSourceDetails.builder()
                        .bucket("Sample Bucket Name")
                        .namespace("Sample Bucket Namespace")
                        // Provide prefix in case files are under specific prefix.
                        .prefix("/image")
                        .build();

        // Type of the format of dataset Image
        ImageDatasetFormatDetails formatDetails = ImageDatasetFormatDetails.builder().build();
        /*
         * For Text TextDatasetFormatDetails formatDetails =
         * TextDatasetFormatDetails.builder().build();
         *
         * For Document DocumentDatasetFormatDetails formatDetails =
         * DocumentDatasetFormatDetails.builder().build();
         */

        // Build label sets which will be used for labeling.
        Label label1 = Label.builder().name("label1").build();
        Label label2 = Label.builder().name("label2").build();
        List<Label> labelItems = Collections.unmodifiableList(Arrays.asList(label1, label2));
        LabelSet labelSet = LabelSet.builder().items(labelItems).build();

        // Freeform tags.
        Map<String, String> freeFormTags = new HashMap<>();
        freeFormTags.put("foo1", "bar1");
        freeFormTags.put("foo2", "bar2");

        /*
         * Use below code to build defined tags.
         *
         *
         * Map<String, Map<String, String>> definedTags = new HashMap<>(); Map<String,
         * String> definedTagNs1 = new HashMap<>(); definedTagNs1.put("definedTagKey",
         * "definedTagValue"); definedTags.put("namespace1", definedTagNs1);
         */

        CreateDatasetDetails createDatasetDetails =
                CreateDatasetDetails.builder()
                        .compartmentId(compartmentId)
                        .displayName("Dataset Creation Example")
                        .description("Dataset Creation Example Description")
                        .annotationFormat("SINGLE_LABEL")
                        .datasetFormatDetails(formatDetails)
                        .datasetSourceDetails(sourceDetails)
                        .labelSet(labelSet)
                        .freeformTags(freeFormTags)
                        // Use below code line to set the defined tag
                        // .definedTags(definedTags)
                        .build();

        // Build Create Dataset request
        CreateDatasetRequest request =
                CreateDatasetRequest.builder().createDatasetDetails(createDatasetDetails).build();

        System.out.println(
                "Sending create dataset request \n"
                        + objectMapper.writeValueAsString(request)
                        + "\n");
        CreateDatasetResponse response = client.createDataset(request);

        /*
         * Polling workrequest by providing workrequest id to check for dataset creation
         * request completion
         */
        WorkRequest workRequest = pollWorkRequestStatus(response.getOpcWorkRequestId(), client);
        if (workRequest.getStatus() == OperationStatus.Succeeded) {
            System.out.println(
                    "Created dataset with dataset Id : " + response.getDataset().getId());
        } else {
            System.out.println(
                    "Workrequest for creating dataset with datasetId: "
                            + response.getDataset().getId()
                            + " failed with status : "
                            + workRequest.getStatus());
        }
        return response.getDataset().getId();
    }

    public static void addLabels(DataLabelingManagement client, String datasetId) {

        /*
         * Adding 2 new labels to the datatset
         */
        List<Label> newItems = new ArrayList<>();
        newItems.add(Label.builder().name("New Label 1").build());
        newItems.add(Label.builder().name("New Label 2").build());

        LabelSet newLabels = LabelSet.builder().items(newItems).build();
        AddDatasetLabelsDetails addDatasetLabelsDetails =
                AddDatasetLabelsDetails.builder().labelSet(newLabels).build();
        AddDatasetLabelsRequest addLabelsRequest =
                AddDatasetLabelsRequest.builder()
                        .addDatasetLabelsDetails(addDatasetLabelsDetails)
                        .datasetId(datasetId)
                        .build();
        AddDatasetLabelsResponse addDatasetLabelsResponse =
                client.addDatasetLabels(addLabelsRequest);

        /*
         * Polling workrequest by providing workrequest id to check for add label
         * request completion
         */
        WorkRequest workRequest =
                pollWorkRequestStatus(addDatasetLabelsResponse.getOpcWorkRequestId(), client);
        if (workRequest.getStatus() == OperationStatus.Succeeded) {
            System.out.println(
                    "Successfully added Labels for dataset with dataset Id : " + datasetId);
        } else {
            System.out.println(
                    "Workrequest for adding labels with datasetId: "
                            + datasetId
                            + " failed with status : "
                            + workRequest.getStatus());
        }
    }

    public static void renameLabels(DataLabelingManagement client, String datasetId) {

        List<Label> oldLabelItems = new ArrayList<>();
        oldLabelItems.add(Label.builder().name("New Label 1").build());
        oldLabelItems.add(Label.builder().name("New Label 2").build());
        LabelSet existingLabels = LabelSet.builder().items(oldLabelItems).build();

        List<Label> newLabelItems = new ArrayList<>();
        newLabelItems.add(Label.builder().name("Rename Label 1").build());
        newLabelItems.add(Label.builder().name("Rename Label 2").build());
        LabelSet renamedLabels = LabelSet.builder().items(newLabelItems).build();

        /*
         * sourceLabelSet contains list of labels of the dataset that you want to rename
         *
         * targetLabelSet contains list of new label name for the sourceLabelSet labels
         */
        RenameDatasetLabelsDetails renameDatasetLabelsDetails =
                RenameDatasetLabelsDetails.builder()
                        .sourceLabelSet(existingLabels)
                        .targetLabelSet(renamedLabels)
                        .build();
        RenameDatasetLabelsRequest renameLabelsRequest =
                RenameDatasetLabelsRequest.builder()
                        .renameDatasetLabelsDetails(renameDatasetLabelsDetails)
                        .datasetId(datasetId)
                        .build();
        RenameDatasetLabelsResponse renameDatasetLabelsResponse =
                client.renameDatasetLabels(renameLabelsRequest);

        /*
         * Polling workrequest by providing workrequest id to check for renaming label
         * request completion
         */
        WorkRequest workRequest =
                pollWorkRequestStatus(renameDatasetLabelsResponse.getOpcWorkRequestId(), client);
        if (workRequest.getStatus() == OperationStatus.Succeeded) {
            System.out.println(
                    "Successfully renamed Labels for dataset with dataset Id : " + datasetId);
        } else {
            System.out.println(
                    "Workrequest for renaming labels with datasetId: "
                            + datasetId
                            + " failed with status : "
                            + workRequest.getStatus());
        }
    }

    public static void removeLabels(DataLabelingManagement client, String datasetId) {
        List<Label> labeltems = new ArrayList<>();
        labeltems.add(Label.builder().name("Rename Label 1").build());
        labeltems.add(Label.builder().name("Rename Label 2").build());
        LabelSet labelsToBeRemoved = LabelSet.builder().items(labeltems).build();

        RemoveDatasetLabelsDetails removeDatasetLabelsDetails =
                RemoveDatasetLabelsDetails.builder().labelSet(labelsToBeRemoved).build();
        RemoveDatasetLabelsRequest removeLabelRequest =
                RemoveDatasetLabelsRequest.builder()
                        .removeDatasetLabelsDetails(removeDatasetLabelsDetails)
                        .datasetId(datasetId)
                        .build();
        RemoveDatasetLabelsResponse removeDatasetLabelsResponse =
                client.removeDatasetLabels(removeLabelRequest);

        /*
         * Polling workrequest by providing workrequest id to check for renaming label
         * request completion
         */
        WorkRequest workRequest =
                pollWorkRequestStatus(removeDatasetLabelsResponse.getOpcWorkRequestId(), client);
        if (workRequest.getStatus() == OperationStatus.Succeeded) {
            System.out.println(
                    "Successfully removed Labels from dataset with dataset Id : " + datasetId);
        } else {
            System.out.println(
                    "Workrequest for removing labels with datasetId: "
                            + datasetId
                            + " failed with status : "
                            + workRequest.getStatus());
        }
    }

    public static WorkRequest pollWorkRequestStatus(
            String workRequestId, DataLabelingManagement client) {
        try {
            return pollForCompletion(workRequestId, client)
                    .thenApply(workRequest -> getWorkRequest(client, workRequestId))
                    .get();
        } catch (InterruptedException | ExecutionException | CancellationException e) {
            return null;
        }
    }

    public static WorkRequest getWorkRequest(
            DataLabelingManagement client, String opcWorkRequestId) {
        GetWorkRequestRequest getWorkRequestRequest =
                GetWorkRequestRequest.builder().workRequestId(opcWorkRequestId).build();
        return client.getWorkRequest(getWorkRequestRequest).getWorkRequest();
    }

    public static CompletableFuture<String> pollForCompletion(
            String workRequestId, DataLabelingManagement client) {
        CompletableFuture<String> completionFuture = new CompletableFuture<>();
        final ScheduledFuture<?> checkFuture =
                executor.scheduleAtFixedRate(
                        () -> {
                            OperationStatus operationStatus =
                                    getWorkRequest(client, workRequestId).getStatus();
                            System.out.println(
                                    "OperationStatus of workRequestId: "
                                            + workRequestId
                                            + " is "
                                            + operationStatus);
                            if (isTerminalOperationStatus(operationStatus)) {
                                completionFuture.complete(workRequestId);
                            }
                        },
                        0,
                        10,
                        TimeUnit.SECONDS);
        completionFuture.whenComplete(
                (result, thrown) -> {
                    checkFuture.cancel(true);
                });
        return completionFuture;
    }

    private static Boolean isTerminalOperationStatus(OperationStatus operationStatus) {
        return (operationStatus.equals(OperationStatus.Succeeded)
                || operationStatus.equals(OperationStatus.Failed));
    }
}
