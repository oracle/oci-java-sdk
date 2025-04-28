/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.resourcemanager.ResourceManagerClient;
import com.oracle.bmc.resourcemanager.model.CreateApplyJobOperationDetails;
import com.oracle.bmc.resourcemanager.model.CreateDestroyJobOperationDetails;
import com.oracle.bmc.resourcemanager.model.CreateImportTfStateJobOperationDetails;
import com.oracle.bmc.resourcemanager.model.CreatePlanJobOperationDetails;
import com.oracle.bmc.resourcemanager.model.CreateJobDetails;
import com.oracle.bmc.resourcemanager.model.CreateJobOperationDetails;
import com.oracle.bmc.resourcemanager.model.CreateStackDetails;
import com.oracle.bmc.resourcemanager.model.CreateZipUploadConfigSourceDetails;
import com.oracle.bmc.resourcemanager.model.ApplyJobOperationDetails;
import com.oracle.bmc.resourcemanager.model.DestroyJobOperationDetails;
import com.oracle.bmc.resourcemanager.model.Job.LifecycleState;
import com.oracle.bmc.resourcemanager.requests.CreateJobRequest;
import com.oracle.bmc.resourcemanager.requests.CreateStackRequest;
import com.oracle.bmc.resourcemanager.requests.DeleteStackRequest;
import com.oracle.bmc.resourcemanager.requests.GetJobLogsRequest;
import com.oracle.bmc.resourcemanager.requests.GetJobRequest;
import com.oracle.bmc.resourcemanager.requests.GetJobTfStateRequest;
import com.oracle.bmc.resourcemanager.responses.CreateJobResponse;
import com.oracle.bmc.resourcemanager.responses.CreateStackResponse;
import com.oracle.bmc.resourcemanager.responses.DeleteStackResponse;
import com.oracle.bmc.resourcemanager.responses.GetJobLogsResponse;
import com.oracle.bmc.resourcemanager.responses.GetJobResponse;
import com.oracle.bmc.resourcemanager.responses.GetJobTfStateResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.Base64;
import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.RetryPolicy;
import net.jodah.failsafe.function.Predicate;

public class ResourceManagerExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    private static String compartmentId;
    private static String zipFilePath;

    static final RetryPolicy JOB_NOT_COMPLETED_RETRY_POLICY =
            new RetryPolicy()
                    .retryIf(
                            new Predicate<GetJobResponse>() {
                                @Override
                                public boolean test(GetJobResponse response) {
                                    return response.getJob().getLifecycleState()
                                                    != LifecycleState.Failed
                                            && response.getJob().getLifecycleState()
                                                    != LifecycleState.Succeeded;
                                }
                            })
                    .withDelay(5, TimeUnit.SECONDS)
                    .withMaxDuration(24, TimeUnit.HOURS);

    static final RetryPolicy STACK_LOCKED_RETRY_POLICY =
            new RetryPolicy()
                    .retryOn(
                            new Predicate<Throwable>() {
                                @Override
                                public boolean test(Throwable e) {
                                    if (!(e instanceof BmcException)) {
                                        return false;
                                    }
                                    BmcException bmcException = (BmcException) e;
                                    return bmcException.getStatusCode() == 409
                                            && bmcException
                                                    .getServiceCode()
                                                    .equals("IncorrectState");
                                }
                            })
                    .withDelay(5, TimeUnit.SECONDS)
                    .withMaxDuration(5, TimeUnit.MINUTES);

    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            System.out.println(args.length);
            throw new Exception(
                    "This example expects 2 arguments: a compartment OCID and a zip file path");
        }

        compartmentId = args[0];
        zipFilePath = args[1];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final ResourceManagerClient resourceManagerClient =
                ResourceManagerClient.builder().build(provider);

        // Create Stack
        CreateZipUploadConfigSourceDetails createZipUploadConfigSourceDetails =
                CreateZipUploadConfigSourceDetails.builder()
                        .zipFileBase64Encoded(GetBase64EncodingForAFile(zipFilePath))
                        .build();

        CreateStackDetails createStackDetails =
                CreateStackDetails.builder()
                        .compartmentId(compartmentId)
                        .configSource(createZipUploadConfigSourceDetails)
                        .build();
        CreateStackRequest createStackRequest =
                CreateStackRequest.builder().createStackDetails(createStackDetails).build();
        CreateStackResponse createStackResponse =
                resourceManagerClient.createStack(createStackRequest);
        System.out.println("Created Stack : " + createStackResponse.getStack());
        final String stackId = createStackResponse.getStack().getId();

        // Provide initial state file
        CreateJobResponse createImportStateJobResponse =
                createImportStateJob(resourceManagerClient, stackId);
        final String importStateJobId = createImportStateJobResponse.getJob().getId();
        waitForJobToComplete(resourceManagerClient, importStateJobId);

        // Create Plan Job
        CreateJobResponse createPlanJobResponse = createPlanJob(resourceManagerClient, stackId);
        final String planJobId = createPlanJobResponse.getJob().getId();
        waitForJobToComplete(resourceManagerClient, planJobId);

        // Get Job logs
        GetJobLogsRequest getJobLogsRequest = GetJobLogsRequest.builder().jobId(planJobId).build();
        GetJobLogsResponse getJobLogsResponse = resourceManagerClient.getJobLogs(getJobLogsRequest);

        // Create Apply Job
        CreateJobResponse createApplyJobResponse =
                Failsafe.with(STACK_LOCKED_RETRY_POLICY)
                        .get(
                                new Callable<CreateJobResponse>() {
                                    @Override
                                    public CreateJobResponse call() throws Exception {
                                        return createApplyJob(
                                                resourceManagerClient, stackId, planJobId);
                                    }
                                });
        String applyJobId = createApplyJobResponse.getJob().getId();
        waitForJobToComplete(resourceManagerClient, applyJobId);

        // Get Job Terraform state
        GetJobTfStateRequest getJobTfStateRequest =
                GetJobTfStateRequest.builder().jobId(applyJobId).build();
        GetJobTfStateResponse getJobTfStateResponse =
                resourceManagerClient.getJobTfState(getJobTfStateRequest);

        // Create Destroy Job
        CreateJobResponse createDestroyJobResponse =
                Failsafe.with(STACK_LOCKED_RETRY_POLICY)
                        .get(
                                new Callable<CreateJobResponse>() {
                                    @Override
                                    public CreateJobResponse call() throws Exception {
                                        return createDestroyJob(resourceManagerClient, stackId);
                                    }
                                });
        waitForJobToComplete(resourceManagerClient, createDestroyJobResponse.getJob().getId());

        // Delete Stack
        final DeleteStackRequest deleteStackRequest =
                DeleteStackRequest.builder().stackId(stackId).build();
        DeleteStackResponse deleteStackResponse =
                Failsafe.with(STACK_LOCKED_RETRY_POLICY)
                        .get(
                                new Callable<DeleteStackResponse>() {
                                    @Override
                                    public DeleteStackResponse call() throws Exception {
                                        return resourceManagerClient.deleteStack(
                                                deleteStackRequest);
                                    }
                                });
        System.out.println("Deleted Stack : " + createStackResponse.getStack().getId());
    }

    private static String GetBase64EncodingForAFile(String filePath) throws IOException {
        byte[] fileData = Files.readAllBytes(Paths.get(filePath));
        byte[] fileDataBase64Encoded = Base64.getEncoder().encode(fileData);
        return new String(fileDataBase64Encoded, StandardCharsets.UTF_8);
    }

    private static void waitForJobToComplete(
            final ResourceManagerClient resourceManagerClient, final String jobId) {
        final GetJobRequest getJobRequest = GetJobRequest.builder().jobId(jobId).build();
        Failsafe.with(JOB_NOT_COMPLETED_RETRY_POLICY)
                .get(
                        new Callable<GetJobResponse>() {
                            @Override
                            public GetJobResponse call() throws Exception {
                                return resourceManagerClient.getJob(getJobRequest);
                            }
                        });
    }

    private static CreateJobResponse createImportStateJob(
            ResourceManagerClient resourceManagerClient, String stackId) {
        CreateJobOperationDetails operationDetails =
                CreateImportTfStateJobOperationDetails.builder()
                        .tfStateBase64Encoded(new byte[] {})
                        .build();
        CreateJobDetails createImportStateJobDetails =
                CreateJobDetails.builder()
                        .stackId(stackId)
                        .jobOperationDetails(operationDetails)
                        .build();
        CreateJobRequest createImportStateJobRequest =
                CreateJobRequest.builder().createJobDetails(createImportStateJobDetails).build();
        return resourceManagerClient.createJob(createImportStateJobRequest);
    }

    private static CreateJobResponse createPlanJob(
            ResourceManagerClient resourceManagerClient, String stackId) {
        CreateJobOperationDetails operationDetails =
                CreatePlanJobOperationDetails.builder().build();
        CreateJobDetails createPlanJobDetails =
                CreateJobDetails.builder()
                        .stackId(stackId)
                        .jobOperationDetails(operationDetails)
                        .build();
        CreateJobRequest createPlanJobRequest =
                CreateJobRequest.builder().createJobDetails(createPlanJobDetails).build();
        return resourceManagerClient.createJob(createPlanJobRequest);
    }

    private static CreateJobResponse createApplyJob(
            ResourceManagerClient resourceManagerClient, String stackId, String planJobId) {
        CreateJobOperationDetails operationDetails =
                CreateApplyJobOperationDetails.builder()
                        .executionPlanStrategy(
                                ApplyJobOperationDetails.ExecutionPlanStrategy.FromPlanJobId)
                        .executionPlanJobId(planJobId)
                        .build();
        CreateJobDetails createApplyJobDetails =
                CreateJobDetails.builder()
                        .stackId(stackId)
                        .jobOperationDetails(operationDetails)
                        .build();
        CreateJobRequest createApplyJobRequest =
                CreateJobRequest.builder().createJobDetails(createApplyJobDetails).build();
        return resourceManagerClient.createJob(createApplyJobRequest);
    }

    private static CreateJobResponse createDestroyJob(
            ResourceManagerClient resourceManagerClient, String stackId) {
        CreateJobOperationDetails operationDetails =
                CreateDestroyJobOperationDetails.builder()
                        .executionPlanStrategy(
                                DestroyJobOperationDetails.ExecutionPlanStrategy.AutoApproved)
                        .build();
        CreateJobDetails createDestroyJobDetails =
                CreateJobDetails.builder()
                        .stackId(stackId)
                        .jobOperationDetails(operationDetails)
                        .build();
        CreateJobRequest createPlanJobRequest =
                CreateJobRequest.builder().createJobDetails(createDestroyJobDetails).build();
        return resourceManagerClient.createJob(createPlanJobRequest);
    }
}
