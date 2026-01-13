/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.datalabelingservicedataplane.DataLabelingClient;
import com.oracle.bmc.datalabelingservicedataplane.model.BoundingPolygon;
import com.oracle.bmc.datalabelingservicedataplane.model.CreateAnnotationDetails;
import com.oracle.bmc.datalabelingservicedataplane.model.Entity;
import com.oracle.bmc.datalabelingservicedataplane.model.GenericEntity;
import com.oracle.bmc.datalabelingservicedataplane.model.ImageObjectSelectionEntity;
import com.oracle.bmc.datalabelingservicedataplane.model.Label;
import com.oracle.bmc.datalabelingservicedataplane.model.NormalizedVertex;
import com.oracle.bmc.datalabelingservicedataplane.model.TextSelectionEntity;
import com.oracle.bmc.datalabelingservicedataplane.model.TextSpan;
import com.oracle.bmc.datalabelingservicedataplane.model.UpdateAnnotationDetails;
import com.oracle.bmc.datalabelingservicedataplane.requests.CreateAnnotationRequest;
import com.oracle.bmc.datalabelingservicedataplane.requests.DeleteAnnotationRequest;
import com.oracle.bmc.datalabelingservicedataplane.requests.GetAnnotationRequest;
import com.oracle.bmc.datalabelingservicedataplane.requests.UpdateAnnotationRequest;
import com.oracle.bmc.datalabelingservicedataplane.responses.CreateAnnotationResponse;
import com.oracle.bmc.datalabelingservicedataplane.responses.GetAnnotationResponse;
import com.oracle.bmc.datalabelingservicedataplane.responses.UpdateAnnotationResponse;

/**
 * This class provides an example of how to use Data Labeling Service to create, get, update and
 * delete annotations for a record of Dataset.
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
 *       <li>The second argument is the OCID of the record.
 *     </ul>
 */
public class DataLabelingAnnotationExample {

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
        final String recordId = args[1];

        getDataLabelingDPClient();

        System.out.println("Creating Annotation for record: " + recordId);
        String annotationId = createAnnotation(compartmentId, recordId);

        System.out.println("Getting Annotation with annotationId: " + annotationId);
        getAnnotation(annotationId);

        System.out.println("Updating Annotation with annotationId: " + annotationId);
        updateAnnotation(annotationId);

        System.out.println("Deleting Annotation with annotationId: " + annotationId);
        deleteAnnotation(annotationId);
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

    public static String createAnnotation(String compartmentId, String recordId)
            throws JsonProcessingException {

        List<Entity> entities = buildImageSelectionObjectEntities();

        /*
         * Use below code to create annotation for Single Label Dataset
         * (image/text/document)
         *
         * List<Entity> entities = buildSingleLabelAnnotationEntities();
         */

        /*
         * Use below code to create annotation for Multi Label Dataset
         * (image/text/document)
         *
         * List<Entity> entities = buildMultiLabelAnnotationEntities();
         */

        /*
         * Use below code to create text entity extraction annotation
         *
         * List<Entity> entities = buildTextEntityExtractionEntities();
         */

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

        CreateAnnotationDetails createAnnotationDetails =
                CreateAnnotationDetails.builder()
                        .compartmentId(compartmentId)
                        .recordId(recordId)
                        .entities(entities)
                        .freeformTags(freeFormTags)
                        // Use below code line to set the defined tag
                        // .definedTags(definedTags)
                        .build();

        // Build Create Annotation request
        CreateAnnotationRequest request =
                CreateAnnotationRequest.builder()
                        .createAnnotationDetails(createAnnotationDetails)
                        .build();

        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.setFilterProvider(new SimpleFilterProvider().setFailOnUnknownId(false));

        System.out.println(
                "Sending create annotation request \n"
                        + objectMapper.writeValueAsString(createAnnotationDetails));
        CreateAnnotationResponse response = client.createAnnotation(request);

        System.out.println(
                "Create annotation Response : \n"
                        + objectMapper.writeValueAsString(response.getAnnotation()));
        return response.getAnnotation().getId();
    }

    /** Create Image object selection entity by providing vertices of the polygon. */
    private static List<Entity> buildImageSelectionObjectEntities() {

        List<NormalizedVertex> vertexList =
                Collections.unmodifiableList(
                        Arrays.asList(
                                NormalizedVertex.builder().x(0.030035F).y(0.13743F).build(),
                                NormalizedVertex.builder().x(0.030035F).y(0.396943F).build(),
                                NormalizedVertex.builder().x(0.282685F).y(0.396943F).build(),
                                NormalizedVertex.builder().x(0.2826855F).y(0.137438F).build()));

        BoundingPolygon boundingPolygon =
                BoundingPolygon.builder().normalizedVertices(vertexList).build();
        List<Label> annotationLabels =
                Collections.unmodifiableList(Arrays.asList(Label.builder().label("L1").build()));
        return Collections.unmodifiableList(
                Arrays.asList(
                        ImageObjectSelectionEntity.builder()
                                .boundingPolygon(boundingPolygon)
                                .labels(annotationLabels)
                                .build()));
    }

    /** Create Single Label Annotation for Image/Document/Text Records */
    private static List<Entity> buildSingleLabelAnnotationEntities() {
        List<Label> labelList =
                Collections.unmodifiableList(Arrays.asList(Label.builder().label("L1").build()));
        return Collections.unmodifiableList(
                Arrays.asList(GenericEntity.builder().labels(labelList).build()));
    }

    /** Create Multi Label Annotation for Image/Document/Text Records */
    private static List<Entity> buildMultiLabelAnnotationEntities() {
        List<Label> labelList =
                Collections.unmodifiableList(
                        Arrays.asList(
                                Label.builder().label("L1").build(),
                                Label.builder().label("L2").build()));
        return Collections.unmodifiableList(
                Arrays.asList(GenericEntity.builder().labels(labelList).build()));
    }

    /** Create Text entity extraction Annotation by providing length and offset of selected text */
    private static List<Entity> buildTextEntityExtractionEntities() {

        TextSpan textSpan1 =
                TextSpan.builder().length(new BigDecimal(10)).offset(new BigDecimal(1)).build();
        TextSpan textSpan2 =
                TextSpan.builder().length(new BigDecimal(2)).offset(new BigDecimal(10)).build();
        List<Label> annotationLabels1 =
                Collections.unmodifiableList(Arrays.asList(Label.builder().label("L1").build()));
        List<Label> annotationLabels2 =
                Collections.unmodifiableList(Arrays.asList(Label.builder().label("L2").build()));
        return Collections.unmodifiableList(
                Arrays.asList(
                        TextSelectionEntity.builder()
                                .textSpan(textSpan1)
                                .labels(annotationLabels1)
                                .build(),
                        TextSelectionEntity.builder()
                                .textSpan(textSpan2)
                                .labels(annotationLabels2)
                                .build()));
    }

    public static void getAnnotation(String annotationId) throws JsonProcessingException {
        GetAnnotationRequest getAnnotationRequest =
                GetAnnotationRequest.builder().annotationId(annotationId).build();
        GetAnnotationResponse getAnnotationResponse = client.getAnnotation(getAnnotationRequest);
        String responseStr = objectMapper.writeValueAsString(getAnnotationResponse.getAnnotation());
        System.out.println("Get annotation response : \n" + responseStr);
    }

    public static void updateAnnotation(String annotationId) throws JsonProcessingException {
        List<Entity> updatedEntities = buildImageSelectionObjectEntities();

        /*
         * Use below code to create annotation for Single Label Dataset
         * (image/text/document)
         *
         * List<Entity> entities = buildSingleLabelAnnotationEntities();
         */

        /*
         * Use below code to create annotation for Multi Label Dataset
         * (image/text/document)
         *
         * List<Entity> entities = buildMultiLabelAnnotationEntities();
         */

        /*
         * Use below code to create text entity extraction annotation
         *
         * List<Entity> entities = buildTextEntityExtractionEntities();
         */

        // freeform tags.
        Map<String, String> freeFormTags = new HashMap<>();
        freeFormTags.put("updatedFoo1", "updatedBar1");
        freeFormTags.put("updatedFoo2", "updatedBar2");

        /*
         * Use below code to build defined tags.
         *
         * Map<String, Map<String, String>> definedTags = new HashMap<>();
         *
         * Map<String, String> definedTags = new HashMap<>();
         * definedTags.put("definedTagKey", "definedTagValue");
         */
        UpdateAnnotationDetails updateAnnotationDetails =
                UpdateAnnotationDetails.builder()
                        .freeformTags(freeFormTags)
                        // Use below code line to set the defined tag
                        // .definedTags(definedTags)
                        .entities(updatedEntities)
                        .build();
        UpdateAnnotationRequest updateAnnotationRequest =
                UpdateAnnotationRequest.builder()
                        .annotationId(annotationId)
                        .updateAnnotationDetails(updateAnnotationDetails)
                        .build();
        UpdateAnnotationResponse updateAnnotationResponse =
                client.updateAnnotation(updateAnnotationRequest);
        String responseStr =
                objectMapper.writeValueAsString(updateAnnotationResponse.getAnnotation());
        System.out.println("Update annotation response : \n" + responseStr);
    }

    public static void deleteAnnotation(String annotationId) throws JsonProcessingException {
        DeleteAnnotationRequest deleteAnnotationRequest =
                DeleteAnnotationRequest.builder().annotationId(annotationId).build();
        client.deleteAnnotation(deleteAnnotationRequest);
        System.out.println("Successfully deleted annotation with id : \n" + annotationId);
    }
}
