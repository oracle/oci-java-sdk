/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.cloudguard.CloudGuardClient;
import com.oracle.bmc.cloudguard.model.CloudGuardStatus;
import com.oracle.bmc.cloudguard.model.UpdateConfigurationDetails;
import com.oracle.bmc.cloudguard.model.CreateTargetDetails;
import com.oracle.bmc.cloudguard.model.CreateTargetDetectorRecipeDetails;
import com.oracle.bmc.cloudguard.model.CreateTargetResponderRecipeDetails;
import com.oracle.bmc.cloudguard.model.ResponderRecipeSummary;
import com.oracle.bmc.cloudguard.model.TargetResourceType;
import com.oracle.bmc.cloudguard.model.TargetSummary;
import com.oracle.bmc.cloudguard.requests.CreateTargetRequest;
import com.oracle.bmc.cloudguard.requests.GetConfigurationRequest;
import com.oracle.bmc.cloudguard.requests.ListDetectorRecipesRequest;
import com.oracle.bmc.cloudguard.requests.ListResponderRecipesRequest;
import com.oracle.bmc.cloudguard.requests.ListProblemsRequest;
import com.oracle.bmc.cloudguard.requests.ListTargetsRequest;
import com.oracle.bmc.cloudguard.requests.UpdateConfigurationRequest;
import com.oracle.bmc.cloudguard.responses.CreateTargetResponse;
import com.oracle.bmc.cloudguard.responses.GetConfigurationResponse;
import com.oracle.bmc.cloudguard.responses.ListDetectorRecipesResponse;
import com.oracle.bmc.cloudguard.responses.ListProblemsResponse;
import com.oracle.bmc.cloudguard.responses.ListTargetsResponse;
import com.oracle.bmc.cloudguard.responses.UpdateConfigurationResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * This class provides an example of how to use the Cloud Guard service in the Java SDK.
 *
 * <p>Accept the compartment id, display name of the target, Cloud Guard reporting region Check if
 * CG is enabled for this tenancy (using the values from the config) Enable CG if it is not already
 * enabled Create a target using the display name provided in the main args Fetch the list of
 * problems that belong to the compartment and its subtree with accessLevel=accessible
 */
public class CloudGuardExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    private static CloudGuardClient cloudGuardClient;

    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            throw new IllegalArgumentException(
                    "This example expects three arguments: the first argument is a compartment OCID, the second is the target display name to create, the third is Cloud Guard reporting region.");
        }

        final String compartmentId = args[0];
        final String targetDisplayName = args[1];
        final String region = args[2];

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(CONFIG_LOCATION, CONFIG_PROFILE);
        cloudGuardClient = new CloudGuardClient(provider);

        final String tenantId = provider.getTenantId();

        // Check if Cloud Guard is enabled or not
        // Enable Cloud Guard if it is not already enabled
        GetConfigurationRequest cloudGuardRequest =
                GetConfigurationRequest.builder().compartmentId(compartmentId).build();
        GetConfigurationResponse getCloudGuardResponse =
                cloudGuardClient.getConfiguration(cloudGuardRequest);

        CloudGuardStatus status = getCloudGuardResponse.getConfiguration().getStatus();

        if (CloudGuardStatus.Enabled != status) {
            UpdateConfigurationDetails cloudGuardDetails =
                    UpdateConfigurationDetails.builder()
                            .reportingRegion(region)
                            .status(CloudGuardStatus.Enabled)
                            .build();

            UpdateConfigurationRequest updateCloudGuardRequest =
                    UpdateConfigurationRequest.builder()
                            .compartmentId(tenantId)
                            .updateConfigurationDetails(cloudGuardDetails)
                            .build();

            UpdateConfigurationResponse updateCloudGuardResponse =
                    cloudGuardClient.updateConfiguration(updateCloudGuardRequest);

            status = updateCloudGuardResponse.getConfiguration().getStatus();
            if (CloudGuardStatus.Enabled != status) {
                System.out.println("Enable Cloud Guard fails!");
                return;
            }
        }

        // Create a target using the display name provided in the main args
        // First check if the Compartment is already attached.
        // If not attached, create a new target.
        List<TargetSummary> targetSummaryList = getTargetList(tenantId);
        boolean existTarget = false;
        for (TargetSummary targetSummary : targetSummaryList) {
            if (tenantId.equals(targetSummary.getTargetResourceId())) {
                existTarget = true;
                System.out.println(
                        "Already existing a target for this Compartment, will not create a new one.");
                break;
            }
        }

        if (existTarget == false) {
            CreateTargetResponse targetResponse =
                    createTarget(compartmentId, tenantId, targetDisplayName);
            if (targetResponse.getTarget().getId() != null) {
                System.out.println("Create a new Target!");
            }
        }

        // List Problems if there are existing problems
        ListProblemsRequest listProblemsRequest =
                ListProblemsRequest.builder()
                        .compartmentId(tenantId)
                        .compartmentIdInSubtree(true)
                        .accessLevel(ListProblemsRequest.AccessLevel.Accessible)
                        .build();
        ListProblemsResponse listProblemsResponse =
                cloudGuardClient.listProblems(listProblemsRequest);
        if (listProblemsResponse != null) {
            System.out.println(
                    "Total number of Problems: "
                            + listProblemsResponse.getProblemCollection().getItems().size());
        }

        System.out.println("Cloud Guard Demo Completed.");
    }

    public static List<TargetSummary> getTargetList(String tenantId) {
        ListTargetsRequest listTargetsRequest =
                ListTargetsRequest.builder()
                        .compartmentId(tenantId)
                        .opcRequestId(UUID.randomUUID().toString())
                        .build();

        ListTargetsResponse response = cloudGuardClient.listTargets(listTargetsRequest);
        return response.getTargetCollection().getItems();
    }

    public static CreateTargetResponse createTarget(
            String compartmentId, String tenantId, String targetDisplayName) {
        System.out.println("Starting create Target");

        List<CreateTargetDetectorRecipeDetails> detectorRecipes = new ArrayList<>();
        List<CreateTargetResponderRecipeDetails> responderRecipes = new ArrayList<>();

        // Get a detector recipe
        ListDetectorRecipesRequest detectorRecipeRequest =
                ListDetectorRecipesRequest.builder().compartmentId(tenantId).build();
        ListDetectorRecipesResponse detectorRecipesResponse =
                cloudGuardClient.listDetectorRecipes(detectorRecipeRequest);

        if (detectorRecipesResponse != null
                && !detectorRecipesResponse.getDetectorRecipeCollection().getItems().isEmpty()) {
            CreateTargetDetectorRecipeDetails createTargetDetectorRecipeDetails =
                    CreateTargetDetectorRecipeDetails.builder()
                            .detectorRecipeId(
                                    detectorRecipesResponse
                                            .getDetectorRecipeCollection()
                                            .getItems()
                                            .get(0)
                                            .getId())
                            .build();

            detectorRecipes.add(createTargetDetectorRecipeDetails);
        }

        // Get a responder recipe
        ListResponderRecipesRequest responderRecipeRequest =
                ListResponderRecipesRequest.builder().compartmentId(tenantId).build();
        List<ResponderRecipeSummary> responderRecipeSummaries =
                cloudGuardClient
                        .listResponderRecipes(responderRecipeRequest)
                        .getResponderRecipeCollection()
                        .getItems();

        if (responderRecipeSummaries != null && !responderRecipeSummaries.isEmpty()) {
            CreateTargetResponderRecipeDetails createTargetResponderRecipeDetails =
                    CreateTargetResponderRecipeDetails.builder()
                            .responderRecipeId(responderRecipeSummaries.get(0).getId())
                            .build();
            responderRecipes.add(createTargetResponderRecipeDetails);
        }

        CreateTargetDetails createTargetDetails =
                CreateTargetDetails.builder()
                        .compartmentId(tenantId)
                        .targetResourceType(TargetResourceType.Compartment)
                        .targetResourceId(tenantId)
                        .targetDetectorRecipes(detectorRecipes)
                        .targetResponderRecipes(responderRecipes)
                        .displayName(targetDisplayName)
                        .build();
        CreateTargetRequest createTargetRequest =
                CreateTargetRequest.builder().createTargetDetails(createTargetDetails).build();
        return cloudGuardClient.createTarget(createTargetRequest);
    }
}
