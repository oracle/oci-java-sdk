/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.dataflow.DataFlowClient;
import com.oracle.bmc.dataflow.model.Application;
import com.oracle.bmc.dataflow.model.ApplicationLanguage;
import com.oracle.bmc.dataflow.model.CreateApplicationDetails;
import com.oracle.bmc.dataflow.model.CreateRunDetails;
import com.oracle.bmc.dataflow.model.ShapeConfig;
import com.oracle.bmc.dataflow.model.UpdateApplicationDetails;
import com.oracle.bmc.dataflow.model.UpdateRunDetails;
import com.oracle.bmc.dataflow.requests.CreateApplicationRequest;
import com.oracle.bmc.dataflow.requests.CreateRunRequest;
import com.oracle.bmc.dataflow.requests.DeleteApplicationRequest;
import com.oracle.bmc.dataflow.requests.DeleteRunRequest;
import com.oracle.bmc.dataflow.requests.GetApplicationRequest;
import com.oracle.bmc.dataflow.requests.GetRunRequest;
import com.oracle.bmc.dataflow.requests.ListApplicationsRequest;
import com.oracle.bmc.dataflow.requests.UpdateApplicationRequest;
import com.oracle.bmc.dataflow.requests.UpdateRunRequest;
import com.oracle.bmc.dataflow.responses.CreateApplicationResponse;
import com.oracle.bmc.dataflow.responses.CreateRunResponse;
import com.oracle.bmc.dataflow.responses.DeleteApplicationResponse;
import com.oracle.bmc.dataflow.responses.DeleteRunResponse;
import com.oracle.bmc.dataflow.responses.GetApplicationResponse;
import com.oracle.bmc.dataflow.responses.GetRunResponse;
import com.oracle.bmc.dataflow.responses.ListApplicationsResponse;
import com.oracle.bmc.dataflow.responses.UpdateApplicationResponse;
import com.oracle.bmc.dataflow.responses.UpdateRunResponse;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;

/**
 * This class provides an example of how to create Dataflow application service in the Java SDK.
 * This will cover:
 *
 * <ul>
 *   <li>Create the application
 *   <li>Update the application
 *   <li>Get the application
 *   <li/>
 *   <li>List all the application
 *   <li/>
 *   <li>Delete the application
 *   <li>Create the Run application
 *   <li>Update the Run application
 *   <li>Delete the Run application
 * </ul>
 *
 * This class makes the following assumptions:
 *
 * <ul>
 *   <li>The configuration file used by service clients will be sourced from the default location
 *       (~/.oci/config) and the DEFAULT profile will be used
 *   <li>Region where the example will be run is: us-phoenix-1
 *   <li>The user has the appropriate permissions to manage dataflow application and to run the
 *       application in the compartment specified.
 *   <li>It will be run in two parts, user can check the features in OCI console section. 1.
 *       Dataflow -> Applications 2. Dataflow -> Runs In the first run the user can create a
 *       dataflow application, update the application, list all application in the compartment
 *       specified, delete the application.
 *       <p>In the second run the user can comment the code run in first part and continue with
 *       running the second part of code. user can create run application, update run application,
 *       get the details of run application, delete run application.
 *       <p>user can comment the delete application part in both parts to track the status in OCI
 *       console and end to end execution of serverless spark as a service for more details refer
 *       below links. https://www.oracle.com/big-data/data-flow/
 *       https://docs.oracle.com/en-us/iaas/data-flow/using/dfs_run_applications.htm
 *       <ul>
 */
public class DataflowExample {
    public static void main(String[] args) throws Exception {
        final String CONFIG_PROFILE = "DEFAULT";
        String compartmentId = args[0]; // <your_compartmentId>

        /**
         * Below data types are required to create and run data flow service application. refer link
         * https://docs.oracle.com/en-us/iaas/api/#/en/data-flow/20200129/datatypes/CreateApplicationDetails
         * to add/modify data type
         */
        String className = args[1]; // executable jar main class
        String jarPath = args[2]; // oci://<bucket>@<object_storage_namespace>/*.jar
        String logPath = args[3]; // Ex: oci://<bucket>@<object_storage_namespace>/
        String sparkVersion = args[4]; // Ex: 2.4.4, 3.2.1 etc

        // Compute shapes reference link
        // https://docs.oracle.com/en-us/iaas/Content/Compute/References/computeshapes.htm
        String driverShape = args[5]; // Ex: VM.Standard2.1, VM.Standard3.Flex
        String executorShape = args[6]; // Ex: VM.Standard2.1, VM.Standard3.Flex

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFile configFile = ConfigFileReader.parseDefault(CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        DataFlowClient dataFlowClient =
                DataFlowClient.builder().configuration(null).build(provider);
        final DataflowExample dataflowExample = new DataflowExample();

        System.out.println(
                "===========================================================================================================================================================================================================================");
        System.out.println("First part starts here");
        System.out.println("Creating Dataflow application");
        String applicationName = "sample-application";
        CreateApplicationResponse createApplicationResponse =
                dataflowExample.createApplication(
                        dataFlowClient,
                        compartmentId,
                        applicationName,
                        className,
                        jarPath,
                        logPath,
                        sparkVersion,
                        driverShape,
                        executorShape);
        String applicationId = createApplicationResponse.getApplication().getId();
        System.out.println(
                "Application created successfully with application display name: "
                        + createApplicationResponse.getApplication().getDisplayName()
                        + " and id: "
                        + applicationId);
        System.out.println("Application :: " + createApplicationResponse.getApplication());

        System.out.println(
                "===========================================================================================================================================================================================================================");

        System.out.println("Updating Dataflow application");
        applicationName = "updated-sample-application";
        UpdateApplicationResponse updateApplicationResponse =
                dataflowExample.updateApplication(
                        dataFlowClient,
                        applicationId,
                        applicationName,
                        className,
                        jarPath,
                        logPath,
                        sparkVersion,
                        driverShape,
                        executorShape);
        System.out.println(
                "Application id: "
                        + applicationId
                        + " updated successfully with new application display name: "
                        + updateApplicationResponse.getApplication().getDisplayName());
        System.out.println("Application :: " + updateApplicationResponse.getApplication());

        System.out.println(
                "===========================================================================================================================================================================================================================");

        System.out.println("Get application details by id");
        GetApplicationResponse getApplicationResponse =
                dataflowExample.getApplication(dataFlowClient, applicationId);
        System.out.println("Application :: " + getApplicationResponse.getApplication());

        System.out.println(
                "===========================================================================================================================================================================================================================");

        System.out.println("Get list of application in the specified compartment");
        ListApplicationsResponse listApplicationsResponse =
                dataflowExample.getApplicationList(dataFlowClient, compartmentId);
        System.out.println("Application count: " + listApplicationsResponse.getItems().size());
        listApplicationsResponse.getItems().stream()
                .forEach(
                        applicationSummary -> {
                            System.out.println(applicationSummary.getId());
                        });

        System.out.println(
                "===========================================================================================================================================================================================================================");

        System.out.println("Delete application by id");
        DeleteApplicationResponse deleteApplicationResponse =
                dataflowExample.deleteApplication(dataFlowClient, applicationId);
        System.out.println(
                "Application id: "
                        + applicationId
                        + " deleted successfully and unique Opc request id: "
                        + deleteApplicationResponse.getOpcRequestId());

        System.out.println("First part ends here");
        System.out.println(
                "===========================================================================================================================================================================================================================");

        System.out.println("Second part starts here");
        System.out.println("Run application");
        String runApplicationName = "spark-application";
        CreateApplicationResponse createApplicationResponseToRun =
                dataflowExample.createApplication(
                        dataFlowClient,
                        compartmentId,
                        runApplicationName,
                        className,
                        jarPath,
                        logPath,
                        sparkVersion,
                        driverShape,
                        executorShape);
        String applicationIdToRun = createApplicationResponseToRun.getApplication().getId();
        CreateRunResponse createRunResponse =
                dataflowExample.createRun(dataFlowClient, applicationIdToRun);
        System.out.println(
                "Application id"
                        + applicationIdToRun
                        + " initiated to run successfully and run id: "
                        + createRunResponse.getRun().getId());

        System.out.println(
                "===========================================================================================================================================================================================================================");

        System.out.println("Get run application details for the specified run id");
        String runId = createRunResponse.getRun().getId();
        GetRunResponse getRunResponse = dataflowExample.getRun(dataFlowClient, runId);
        System.out.println("Run details: " + getRunResponse.getRun());
        System.out.println(getRunResponse.getRun().getFreeformTags());

        System.out.println(
                "===========================================================================================================================================================================================================================");

        System.out.println("Update run application details for the specified run id");
        UpdateRunResponse updateRunResponse =
                dataflowExample.updateRun(dataFlowClient, runId, "data-engineer");
        System.out.println(updateRunResponse.getRun().getFreeformTags());

        System.out.println(
                "===========================================================================================================================================================================================================================");

        System.out.println("Delete specified run application by id");
        DeleteRunResponse deleteRunResponse = dataflowExample.deleteRun(dataFlowClient, runId);
        System.out.println(
                "Run id"
                        + runId
                        + " initiated to delete successfully and unique Opc id: "
                        + deleteRunResponse.getOpcRequestId());

        System.out.println("Second part ends here");
        System.out.println(
                "===========================================================================================================================================================================================================================");
    }

    /**
     * Creates a new Application here.
     *
     * @param compartmentId compartment id where the Application should be created.
     * @param applicationName name of the application to be created.
     * @return The Application response that was created.
     */
    private CreateApplicationResponse createApplication(
            DataFlowClient dataFlowClient,
            String compartmentId,
            String applicationName,
            String className,
            String jarPath,
            String logPath,
            String sparkVersion,
            String driverShape,
            String executorShape) {
        /*
           Create application request and dependent objects based on your requirements
        */
        CreateApplicationRequest createApplicationRequest =
                CreateApplicationRequest.builder()
                        .createApplicationDetails(
                                CreateApplicationDetails.builder()
                                        .compartmentId(compartmentId)
                                        .displayName(applicationName)
                                        .className(className)
                                        .language(ApplicationLanguage.Scala)
                                        .fileUri(jarPath)
                                        .sparkVersion(sparkVersion)
                                        .driverShape(driverShape)
                                        .driverShapeConfig(
                                                ShapeConfig.builder()
                                                        .ocpus(BigDecimal.valueOf(1))
                                                        .memoryInGBs(BigDecimal.valueOf(15))
                                                        .build())
                                        .executorShape(executorShape)
                                        .executorShapeConfig(
                                                ShapeConfig.builder()
                                                        .ocpus(BigDecimal.valueOf(1))
                                                        .memoryInGBs(BigDecimal.valueOf(15))
                                                        .build())
                                        .numExecutors(1)
                                        .arguments(
                                                Arrays.asList(
                                                        "<DEPLOY_MODE>",
                                                        "<INPUT_PATH>",
                                                        "<OUTPUT_PATH>",
                                                        "etc.."))
                                        .logsBucketUri(logPath)
                                        .warehouseBucketUri(null)
                                        .build())
                        .build();

        /* Send request to the Dataflow Client */
        CreateApplicationResponse createApplicationResponse =
                dataFlowClient.createApplication(createApplicationRequest);
        return createApplicationResponse;
    }

    /**
     * Update existing Application display name.
     *
     * @param applicationId application id where the Application display name should be updated.
     * @param updateApplicationName new name of the application to be updated.
     * @return The Application updated response.
     */
    private UpdateApplicationResponse updateApplication(
            DataFlowClient dataFlowClient,
            String applicationId,
            String updateApplicationName,
            String className,
            String jarPath,
            String logPath,
            String sparkVersion,
            String driverShape,
            String executorShape) {

        UpdateApplicationDetails updateApplicationDetails =
                UpdateApplicationDetails.builder()
                        .displayName(updateApplicationName)
                        .className(className)
                        .language(ApplicationLanguage.Scala)
                        .fileUri(jarPath)
                        .sparkVersion(sparkVersion)
                        .driverShape(driverShape)
                        .driverShapeConfig(
                                ShapeConfig.builder()
                                        .ocpus(BigDecimal.valueOf(1))
                                        .memoryInGBs(BigDecimal.valueOf(15))
                                        .build())
                        .executorShape(executorShape)
                        .executorShapeConfig(
                                ShapeConfig.builder()
                                        .ocpus(BigDecimal.valueOf(1))
                                        .memoryInGBs(BigDecimal.valueOf(15))
                                        .build())
                        .numExecutors(1)
                        .arguments(
                                Arrays.asList(
                                        "<DEPLOY_MODE>", "<INPUT_PATH>", "<OUTPUT_PATH>", "etc.."))
                        .logsBucketUri(logPath)
                        .warehouseBucketUri(null)
                        .build();

        UpdateApplicationRequest updateApplicationRequest =
                UpdateApplicationRequest.builder()
                        .updateApplicationDetails(updateApplicationDetails)
                        .applicationId(applicationId)
                        .build();

        /* Send request to the Dataflow Client */
        UpdateApplicationResponse updateApplicationResponse =
                dataFlowClient.updateApplication(updateApplicationRequest);

        return updateApplicationResponse;
    }

    /**
     * Fetch the details of Application by id.
     *
     * @param applicationId application id of dataflow application.
     * @return The Application response.
     */
    private GetApplicationResponse getApplication(
            DataFlowClient dataFlowClient, String applicationId) {
        GetApplicationRequest getApplicationRequest =
                GetApplicationRequest.builder().applicationId(applicationId).build();

        /* Send request to the Dataflow Client */
        GetApplicationResponse getApplicationResponse =
                dataFlowClient.getApplication(getApplicationRequest);

        return getApplicationResponse;
    }

    /**
     * Get the list of Application in the specified compartment.
     *
     * @param compartmentId specified compartment id .
     * @return The list of application response.
     */
    private ListApplicationsResponse getApplicationList(
            DataFlowClient dataFlowClient, String compartmentId) {
        ListApplicationsRequest listApplicationsRequest =
                ListApplicationsRequest.builder()
                        .compartmentId(compartmentId)
                        .limit(92)
                        .sortBy(ListApplicationsRequest.SortBy.DisplayName)
                        .sortOrder(ListApplicationsRequest.SortOrder.Desc)
                        .build();

        /* Send request to the Dataflow Client */
        ListApplicationsResponse listApplicationsResponse =
                dataFlowClient.listApplications(listApplicationsRequest);

        return listApplicationsResponse;
    }

    /**
     * Deleted existing application by id.
     *
     * @param applicationId id of the application which is to be deleted.
     * @return The deleted application response.
     */
    private DeleteApplicationResponse deleteApplication(
            DataFlowClient dataFlowClient, String applicationId) {
        DeleteApplicationRequest deleteApplicationRequest =
                DeleteApplicationRequest.builder().applicationId(applicationId).build();

        /* Send request to the Dataflow Client */
        DeleteApplicationResponse deleteApplicationResponse =
                dataFlowClient.deleteApplication(deleteApplicationRequest);

        return deleteApplicationResponse;
    }

    /**
     * Creates new run application for the specified existing application.
     *
     * @param applicationId application id which is to be executed.
     * @return The created run application response.
     */
    private CreateRunResponse createRun(DataFlowClient dataFlowClient, String applicationId) {

        GetApplicationRequest getApplicationRequest =
                GetApplicationRequest.builder().applicationId(applicationId).build();

        GetApplicationResponse getApplicationResponse =
                dataFlowClient.getApplication(getApplicationRequest);

        Application application = getApplicationResponse.getApplication();

        CreateRunDetails createRunDetails =
                CreateRunDetails.builder()
                        .applicationId(application.getId())
                        .arguments(application.getArguments())
                        .configuration(application.getConfiguration())
                        .compartmentId(application.getCompartmentId())
                        .driverShape(application.getDriverShape())
                        .driverShapeConfig(application.getDriverShapeConfig())
                        .executorShape(application.getExecutorShape())
                        .executorShapeConfig(application.getExecutorShapeConfig())
                        .displayName(application.getDisplayName())
                        .logsBucketUri(application.getLogsBucketUri())
                        .numExecutors(application.getNumExecutors())
                        .parameters(application.getParameters())
                        .warehouseBucketUri(application.getWarehouseBucketUri())
                        .build();

        CreateRunRequest createRunRequest =
                CreateRunRequest.builder().createRunDetails(createRunDetails).build();

        /* Send request to the Dataflow Client */
        CreateRunResponse createRunResponse = dataFlowClient.createRun(createRunRequest);
        return createRunResponse;
    }

    /**
     * Get the run details by id.
     *
     * @param runId run id of the application.
     * @return The run application response.
     */
    private GetRunResponse getRun(DataFlowClient dataFlowClient, String runId) {
        GetRunRequest getRunRequest = GetRunRequest.builder().runId(runId).build();

        /* Send request to the Dataflow Client */
        GetRunResponse getRunResponse = dataFlowClient.getRun(getRunRequest);

        return getRunResponse;
    }

    /**
     * Update the free form tag attribute of run application id.
     *
     * @param runId run id of the application to be updated.
     * @param tagName tag name to be updated.
     * @return The updated run application response.
     */
    private UpdateRunResponse updateRun(
            DataFlowClient dataFlowClient, String runId, String tagName) {
        UpdateRunDetails updateRunDetails =
                UpdateRunDetails.builder()
                        .freeformTags(
                                new HashMap<String, String>() {
                                    {
                                        put("developer", tagName);
                                    }
                                })
                        .build();

        UpdateRunRequest updateRunRequest =
                UpdateRunRequest.builder().updateRunDetails(updateRunDetails).runId(runId).build();

        /* Send request to the Dataflow Client */
        UpdateRunResponse updateRunResponse = dataFlowClient.updateRun(updateRunRequest);

        return updateRunResponse;
    }

    /**
     * Delete specified run application by id.
     *
     * @param runId run id of the application to be deleted.
     * @return The deleted run application response.
     */
    private DeleteRunResponse deleteRun(DataFlowClient dataFlowClient, String runId) {
        DeleteRunRequest deleteRunRequest = DeleteRunRequest.builder().runId(runId).build();

        /* Send request to the Dataflow Client */
        DeleteRunResponse deleteRunResponse = dataFlowClient.deleteRun(deleteRunRequest);

        return deleteRunResponse;
    }
}
