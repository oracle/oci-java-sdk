/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.datalabelingservicedataplane.DataLabelingClient;
import com.oracle.bmc.datalabelingservicedataplane.model.CreateObjectStorageSourceDetails;
import com.oracle.bmc.datalabelingservicedataplane.model.CreateRecordDetails;
import com.oracle.bmc.datalabelingservicedataplane.model.UpdateRecordDetails;
import com.oracle.bmc.datalabelingservicedataplane.requests.CreateRecordRequest;
import com.oracle.bmc.datalabelingservicedataplane.requests.DeleteRecordRequest;
import com.oracle.bmc.datalabelingservicedataplane.requests.GetRecordRequest;
import com.oracle.bmc.datalabelingservicedataplane.requests.UpdateRecordRequest;
import com.oracle.bmc.datalabelingservicedataplane.responses.CreateRecordResponse;
import com.oracle.bmc.datalabelingservicedataplane.responses.GetRecordResponse;
import com.oracle.bmc.datalabelingservicedataplane.responses.UpdateRecordResponse;

/**
 * This class provides an example of how to use Data Labeling Service to create, get, update and
 * delete records in a Dataset.
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
 *       <li>The second argument is the OCID of the dataset.
 *     </ul>
 */
public class DataLabelingRecordExample {

    private static final String ENDPOINT = "https://dlstest-dp.ap-mumbai-1.oci.oraclecloud.com";
    private static final ObjectMapper objectMapper =
            new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    private static DataLabelingClient client;

    static {
        objectMapper.setFilterProvider(new SimpleFilterProvider().setFailOnUnknownId(false));
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "Unexpected number of arguments received. Consult the script header comments for expected arguments");
        }

        final String compartmentId = args[0];
        final String datasetId = args[1];

        getDataLabelingDPClient();

        System.out.println("Creating Record");
        String recordId = createRecord(compartmentId, datasetId);

        System.out.println("Getting Record with recordId: " + recordId);
        getRecord(recordId);

        System.out.println("Updating Record with recordId: " + recordId);
        updateRecord(recordId);

        System.out.println("Deleting Record with recordId: " + recordId);
        deleteRecord(recordId);
    }

    public static DataLabelingClient getDataLabelingDPClient() throws IOException {
        /*
         * Configuring the AuthenticationDetailsProvider. It's assuming there is a
         * default OCI config file "~/.oci/config", and a profile in that config with
         * the name "DEFAULT". Make changes to the following line if needed and use
         * ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
         */
        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        client = new DataLabelingClient(provider);
        client.setEndpoint(ENDPOINT);
        return client;
    }

    public static String createRecord(String compartmentId, String datasetId)
            throws JsonProcessingException {
        /*
         * Object storage source details to provide relative path of the Object for
         * Labeling.
         *
         * For example: If the object "sampleObject.jpeg" reside in bucket "test" and
         * inside folder "sample", then relativePath parameter should be
         * "sampleObject.jpg". The bucket and namespace details are picked from Dataset
         * details provided during dataset creation. Note: While creating dataset the
         * bucket name is specified as "test" and prefix is specified as "sample"
         *
         * Make sure the principal being used has object storage bucket and object
         * access.
         */
        CreateObjectStorageSourceDetails sourceDetails =
                CreateObjectStorageSourceDetails.builder()
                        .relativePath("sampleObject.jpeg")
                        .build();

        // freeform tags.
        Map<String, String> freeFormTags = new HashMap<>();
        freeFormTags.put("foo1", "bar1");
        freeFormTags.put("foo2", "bar2");

        /*
         * Use below code to build defined tags.
         *
         * Map<String, Map<String, String>> definedTags = new HashMap<>();
         *
         * Map<String, String> definedTags = new HashMap<>();
         * definedTags.put("definedTagKey", "definedTagValue");
         */

        CreateRecordDetails createRecordDetails =
                CreateRecordDetails.builder()
                        .compartmentId(compartmentId)
                        .name("sampleObject.jpeg")
                        .datasetId(datasetId)
                        .sourceDetails(sourceDetails)
                        .freeformTags(freeFormTags)
                        // Use below code line to set the defined tag
                        // .definedTags(definedTags)
                        .build();

        // Build Create record request
        CreateRecordRequest request =
                CreateRecordRequest.builder().createRecordDetails(createRecordDetails).build();

        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.setFilterProvider(new SimpleFilterProvider().setFailOnUnknownId(false));

        System.out.println(
                "Sending create record request \n"
                        + objectMapper.writeValueAsString(createRecordDetails));
        CreateRecordResponse response = client.createRecord(request);

        System.out.println(
                "Create Record Response : \n"
                        + objectMapper.writeValueAsString(response.getRecord()));
        return response.getRecord().getId();
    }

    public static void getRecord(String recordId) throws JsonProcessingException {
        GetRecordRequest getRecordRequest = GetRecordRequest.builder().recordId(recordId).build();
        GetRecordResponse getRecordResponse = client.getRecord(getRecordRequest);
        String responseStr = objectMapper.writeValueAsString(getRecordResponse.getRecord());
        System.out.println("Get record response : \n" + responseStr);
    }

    public static void updateRecord(String recordId) throws JsonProcessingException {
        // Freeform tags.
        Map<String, String> freeFormTags = new HashMap<>();
        freeFormTags.put("updatedFoo1", "updatedBar1");
        freeFormTags.put("updatedFoo2", "updatedBar2");

        /*
         * Use below code to build defined tags.
         *
         *
         * Map<String, Map<String, String>> definedTags = new HashMap<>(); Map<String,
         * String> definedTagNs1 = new HashMap<>(); definedTagNs1.put("definedTagKey",
         * "definedTagValue"); definedTags.put("namespace1", definedTagNs1);
         */

        UpdateRecordDetails updateRecordDetails =
                UpdateRecordDetails.builder()
                        .freeformTags(freeFormTags)
                        // Use below code line to update the defined tag
                        // .definedTags(null)
                        .build();
        UpdateRecordRequest updateRecordRequest =
                UpdateRecordRequest.builder()
                        .recordId(recordId)
                        .updateRecordDetails(updateRecordDetails)
                        .build();
        UpdateRecordResponse updateRecordResponse = client.updateRecord(updateRecordRequest);
        String responseStr = objectMapper.writeValueAsString(updateRecordResponse.getRecord());
        System.out.println("Update record response : \n" + responseStr);
    }

    public static void deleteRecord(String recordId) throws JsonProcessingException {
        DeleteRecordRequest deleteRecordRequest =
                DeleteRecordRequest.builder().recordId(recordId).build();
        client.deleteRecord(deleteRecordRequest);
        System.out.println("Record Deleted Successfully");
    }
}
