/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience;

import com.oracle.bmc.datascience.requests.*;
import com.oracle.bmc.datascience.responses.*;

/**
 * Use the Data Science API to organize your data science work, access data and computing resources,
 * and build, train, deploy and manage models and model deployments. For more information, see [Data
 * Science](https://docs.oracle.com/iaas/data-science/using/data-science.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public interface DataScienceAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Activates the model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ActivateModelResponse> activateModel(
            ActivateModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<ActivateModelRequest, ActivateModelResponse>
                    handler);

    /**
     * Activates the model deployment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ActivateModelDeploymentResponse> activateModelDeployment(
            ActivateModelDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ActivateModelDeploymentRequest, ActivateModelDeploymentResponse>
                    handler);

    /**
     * Activates the notebook session.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ActivateNotebookSessionResponse> activateNotebookSession(
            ActivateNotebookSessionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ActivateNotebookSessionRequest, ActivateNotebookSessionResponse>
                    handler);

    /**
     * Activate schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ActivateScheduleResponse> activateSchedule(
            ActivateScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<ActivateScheduleRequest, ActivateScheduleResponse>
                    handler);

    /**
     * Cancels an IN_PROGRESS job run.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelJobRunResponse> cancelJobRun(
            CancelJobRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<CancelJobRunRequest, CancelJobRunResponse>
                    handler);

    /**
     * Cancel a PipelineRun.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelPipelineRunResponse> cancelPipelineRun(
            CancelPipelineRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelPipelineRunRequest, CancelPipelineRunResponse>
                    handler);

    /**
     * Cancels a work request that has not started.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Moves a private endpoint into a different compartment. When provided, If-Match is checked
     * against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDataSciencePrivateEndpointCompartmentResponse>
            changeDataSciencePrivateEndpointCompartment(
                    ChangeDataSciencePrivateEndpointCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDataSciencePrivateEndpointCompartmentRequest,
                                    ChangeDataSciencePrivateEndpointCompartmentResponse>
                            handler);

    /**
     * Changes a job's compartment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeJobCompartmentResponse> changeJobCompartment(
            ChangeJobCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeJobCompartmentRequest, ChangeJobCompartmentResponse>
                    handler);

    /**
     * Changes a job run's compartment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeJobRunCompartmentResponse> changeJobRunCompartment(
            ChangeJobRunCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeJobRunCompartmentRequest, ChangeJobRunCompartmentResponse>
                    handler);

    /**
     * Moves a model resource into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeModelCompartmentResponse> changeModelCompartment(
            ChangeModelCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeModelCompartmentRequest, ChangeModelCompartmentResponse>
                    handler);

    /**
     * Moves a model deployment into a different compartment. When provided, If-Match is checked
     * against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeModelDeploymentCompartmentResponse>
            changeModelDeploymentCompartment(
                    ChangeModelDeploymentCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeModelDeploymentCompartmentRequest,
                                    ChangeModelDeploymentCompartmentResponse>
                            handler);

    /**
     * Moves a modelVersionSet resource into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeModelVersionSetCompartmentResponse>
            changeModelVersionSetCompartment(
                    ChangeModelVersionSetCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeModelVersionSetCompartmentRequest,
                                    ChangeModelVersionSetCompartmentResponse>
                            handler);

    /**
     * Moves a notebook session resource into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeNotebookSessionCompartmentResponse>
            changeNotebookSessionCompartment(
                    ChangeNotebookSessionCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNotebookSessionCompartmentRequest,
                                    ChangeNotebookSessionCompartmentResponse>
                            handler);

    /**
     * Moves a resource into a different compartment. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangePipelineCompartmentResponse> changePipelineCompartment(
            ChangePipelineCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangePipelineCompartmentRequest, ChangePipelineCompartmentResponse>
                    handler);

    /**
     * Moves a resource into a different compartment. When provided, If-Match is checked against
     * ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangePipelineRunCompartmentResponse> changePipelineRunCompartment(
            ChangePipelineRunCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangePipelineRunCompartmentRequest,
                            ChangePipelineRunCompartmentResponse>
                    handler);

    /**
     * Moves a project resource into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeProjectCompartmentResponse> changeProjectCompartment(
            ChangeProjectCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeProjectCompartmentRequest, ChangeProjectCompartmentResponse>
                    handler);

    /**
     * Moves a Schedule resource from one compartment identifier to another. When provided, If-Match
     * is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeScheduleCompartmentResponse> changeScheduleCompartment(
            ChangeScheduleCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeScheduleCompartmentRequest, ChangeScheduleCompartmentResponse>
                    handler);

    /**
     * Creates a Data Science private endpoint to be used by a Data Science resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDataSciencePrivateEndpointResponse>
            createDataSciencePrivateEndpoint(
                    CreateDataSciencePrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDataSciencePrivateEndpointRequest,
                                    CreateDataSciencePrivateEndpointResponse>
                            handler);

    /**
     * Creates a job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateJobResponse> createJob(
            CreateJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse> handler);

    /**
     * Uploads a job artifact.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateJobArtifactResponse> createJobArtifact(
            CreateJobArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateJobArtifactRequest, CreateJobArtifactResponse>
                    handler);

    /**
     * Creates a job run.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateJobRunResponse> createJobRun(
            CreateJobRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateJobRunRequest, CreateJobRunResponse>
                    handler);

    /**
     * Creates a new model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateModelResponse> createModel(
            CreateModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateModelRequest, CreateModelResponse> handler);

    /**
     * Creates model artifact for specified model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateModelArtifactResponse> createModelArtifact(
            CreateModelArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateModelArtifactRequest, CreateModelArtifactResponse>
                    handler);

    /**
     * Creates model custom metadata artifact for specified model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateModelCustomMetadatumArtifactResponse>
            createModelCustomMetadatumArtifact(
                    CreateModelCustomMetadatumArtifactRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateModelCustomMetadatumArtifactRequest,
                                    CreateModelCustomMetadatumArtifactResponse>
                            handler);

    /**
     * Creates model defined metadata artifact for specified model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateModelDefinedMetadatumArtifactResponse>
            createModelDefinedMetadatumArtifact(
                    CreateModelDefinedMetadatumArtifactRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateModelDefinedMetadatumArtifactRequest,
                                    CreateModelDefinedMetadatumArtifactResponse>
                            handler);

    /**
     * Creates a new model deployment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateModelDeploymentResponse> createModelDeployment(
            CreateModelDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateModelDeploymentRequest, CreateModelDeploymentResponse>
                    handler);

    /**
     * Creates provenance information for the specified model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateModelProvenanceResponse> createModelProvenance(
            CreateModelProvenanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateModelProvenanceRequest, CreateModelProvenanceResponse>
                    handler);

    /**
     * Creates a new modelVersionSet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateModelVersionSetResponse> createModelVersionSet(
            CreateModelVersionSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateModelVersionSetRequest, CreateModelVersionSetResponse>
                    handler);

    /**
     * Creates a new notebook session.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateNotebookSessionResponse> createNotebookSession(
            CreateNotebookSessionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateNotebookSessionRequest, CreateNotebookSessionResponse>
                    handler);

    /**
     * Creates a new Pipeline.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePipelineResponse> createPipeline(
            CreatePipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreatePipelineRequest, CreatePipelineResponse>
                    handler);

    /**
     * Creates a new PipelineRun.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePipelineRunResponse> createPipelineRun(
            CreatePipelineRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePipelineRunRequest, CreatePipelineRunResponse>
                    handler);

    /**
     * Creates a new project.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateProjectResponse> createProject(
            CreateProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateProjectRequest, CreateProjectResponse>
                    handler);

    /**
     * Creates a new Schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateScheduleResponse> createSchedule(
            CreateScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateScheduleRequest, CreateScheduleResponse>
                    handler);

    /**
     * Upload the artifact for a step in the pipeline.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateStepArtifactResponse> createStepArtifact(
            CreateStepArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateStepArtifactRequest, CreateStepArtifactResponse>
                    handler);

    /**
     * Deactivates the model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeactivateModelResponse> deactivateModel(
            DeactivateModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeactivateModelRequest, DeactivateModelResponse>
                    handler);

    /**
     * Deactivates the model deployment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeactivateModelDeploymentResponse> deactivateModelDeployment(
            DeactivateModelDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeactivateModelDeploymentRequest, DeactivateModelDeploymentResponse>
                    handler);

    /**
     * Deactivates the notebook session.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeactivateNotebookSessionResponse> deactivateNotebookSession(
            DeactivateNotebookSessionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeactivateNotebookSessionRequest, DeactivateNotebookSessionResponse>
                    handler);

    /**
     * Deactivate schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeactivateScheduleResponse> deactivateSchedule(
            DeactivateScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeactivateScheduleRequest, DeactivateScheduleResponse>
                    handler);

    /**
     * Deletes a private endpoint using `privateEndpointId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDataSciencePrivateEndpointResponse>
            deleteDataSciencePrivateEndpoint(
                    DeleteDataSciencePrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDataSciencePrivateEndpointRequest,
                                    DeleteDataSciencePrivateEndpointResponse>
                            handler);

    /**
     * Deletes a job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteJobResponse> deleteJob(
            DeleteJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse> handler);

    /**
     * Deletes a job run.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteJobRunResponse> deleteJobRun(
            DeleteJobRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteJobRunRequest, DeleteJobRunResponse>
                    handler);

    /**
     * Deletes the specified model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteModelResponse> deleteModel(
            DeleteModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteModelRequest, DeleteModelResponse> handler);

    /**
     * Deletes model custom metadata artifact for specified model metadata key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteModelCustomMetadatumArtifactResponse>
            deleteModelCustomMetadatumArtifact(
                    DeleteModelCustomMetadatumArtifactRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteModelCustomMetadatumArtifactRequest,
                                    DeleteModelCustomMetadatumArtifactResponse>
                            handler);

    /**
     * Deletes model defined metadata artifact for specified model metadata key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteModelDefinedMetadatumArtifactResponse>
            deleteModelDefinedMetadatumArtifact(
                    DeleteModelDefinedMetadatumArtifactRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteModelDefinedMetadatumArtifactRequest,
                                    DeleteModelDefinedMetadatumArtifactResponse>
                            handler);

    /**
     * Deletes the specified model deployment. Any unsaved work in this model deployment is lost.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteModelDeploymentResponse> deleteModelDeployment(
            DeleteModelDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteModelDeploymentRequest, DeleteModelDeploymentResponse>
                    handler);

    /**
     * Deletes the specified modelVersionSet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteModelVersionSetResponse> deleteModelVersionSet(
            DeleteModelVersionSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteModelVersionSetRequest, DeleteModelVersionSetResponse>
                    handler);

    /**
     * Deletes the specified notebook session. Any unsaved work in this notebook session are lost.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNotebookSessionResponse> deleteNotebookSession(
            DeleteNotebookSessionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteNotebookSessionRequest, DeleteNotebookSessionResponse>
                    handler);

    /**
     * Deletes a Pipeline resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePipelineResponse> deletePipeline(
            DeletePipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeletePipelineRequest, DeletePipelineResponse>
                    handler);

    /**
     * Deletes a PipelineRun resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePipelineRunResponse> deletePipelineRun(
            DeletePipelineRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePipelineRunRequest, DeletePipelineRunResponse>
                    handler);

    /**
     * Deletes the specified project. This operation fails unless all associated resources (notebook
     * sessions or models) are in a DELETED state. You must delete all associated resources before
     * deleting a project.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteProjectResponse> deleteProject(
            DeleteProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteProjectRequest, DeleteProjectResponse>
                    handler);

    /**
     * Deletes a Schedule resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteScheduleResponse> deleteSchedule(
            DeleteScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteScheduleRequest, DeleteScheduleResponse>
                    handler);

    /**
     * Export model artifact from source to the service bucket
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ExportModelArtifactResponse> exportModelArtifact(
            ExportModelArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExportModelArtifactRequest, ExportModelArtifactResponse>
                    handler);

    /**
     * Retrieves an private endpoint using a `privateEndpointId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDataSciencePrivateEndpointResponse>
            getDataSciencePrivateEndpoint(
                    GetDataSciencePrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDataSciencePrivateEndpointRequest,
                                    GetDataSciencePrivateEndpointResponse>
                            handler);

    /**
     * Gets a job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobResponse> getJob(
            GetJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handler);

    /**
     * Downloads job artifact content for specified job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobArtifactContentResponse> getJobArtifactContent(
            GetJobArtifactContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetJobArtifactContentRequest, GetJobArtifactContentResponse>
                    handler);

    /**
     * Gets a job run.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJobRunResponse> getJobRun(
            GetJobRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobRunRequest, GetJobRunResponse> handler);

    /**
     * Gets the specified model's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetModelResponse> getModel(
            GetModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetModelRequest, GetModelResponse> handler);

    /**
     * Downloads model artifact content for specified model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetModelArtifactContentResponse> getModelArtifactContent(
            GetModelArtifactContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetModelArtifactContentRequest, GetModelArtifactContentResponse>
                    handler);

    /**
     * Downloads model custom metadata artifact content for specified model metadata key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetModelCustomMetadatumArtifactContentResponse>
            getModelCustomMetadatumArtifactContent(
                    GetModelCustomMetadatumArtifactContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetModelCustomMetadatumArtifactContentRequest,
                                    GetModelCustomMetadatumArtifactContentResponse>
                            handler);

    /**
     * Downloads model defined metadata artifact content for specified model metadata key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetModelDefinedMetadatumArtifactContentResponse>
            getModelDefinedMetadatumArtifactContent(
                    GetModelDefinedMetadatumArtifactContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetModelDefinedMetadatumArtifactContentRequest,
                                    GetModelDefinedMetadatumArtifactContentResponse>
                            handler);

    /**
     * Retrieves the model deployment for the specified `modelDeploymentId`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetModelDeploymentResponse> getModelDeployment(
            GetModelDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetModelDeploymentRequest, GetModelDeploymentResponse>
                    handler);

    /**
     * Gets provenance information for specified model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetModelProvenanceResponse> getModelProvenance(
            GetModelProvenanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetModelProvenanceRequest, GetModelProvenanceResponse>
                    handler);

    /**
     * Gets the specified model version set information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetModelVersionSetResponse> getModelVersionSet(
            GetModelVersionSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetModelVersionSetRequest, GetModelVersionSetResponse>
                    handler);

    /**
     * Gets the specified notebook session's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetNotebookSessionResponse> getNotebookSession(
            GetNotebookSessionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetNotebookSessionRequest, GetNotebookSessionResponse>
                    handler);

    /**
     * Gets a Pipeline by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPipelineResponse> getPipeline(
            GetPipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPipelineRequest, GetPipelineResponse> handler);

    /**
     * Gets a PipelineRun by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPipelineRunResponse> getPipelineRun(
            GetPipelineRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPipelineRunRequest, GetPipelineRunResponse>
                    handler);

    /**
     * Gets the specified project's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetProjectResponse> getProject(
            GetProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetProjectRequest, GetProjectResponse> handler);

    /**
     * Gets a Schedule by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetScheduleResponse> getSchedule(
            GetScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetScheduleRequest, GetScheduleResponse> handler);

    /**
     * Download the artifact for a step in the pipeline.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetStepArtifactContentResponse> getStepArtifactContent(
            GetStepArtifactContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetStepArtifactContentRequest, GetStepArtifactContentResponse>
                    handler);

    /**
     * Gets the specified work request's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Gets job artifact metadata.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<HeadJobArtifactResponse> headJobArtifact(
            HeadJobArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<HeadJobArtifactRequest, HeadJobArtifactResponse>
                    handler);

    /**
     * Gets model artifact metadata for specified model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<HeadModelArtifactResponse> headModelArtifact(
            HeadModelArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            HeadModelArtifactRequest, HeadModelArtifactResponse>
                    handler);

    /**
     * Gets custom metadata artifact metadata for specified model metadata key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<HeadModelCustomMetadatumArtifactResponse>
            headModelCustomMetadatumArtifact(
                    HeadModelCustomMetadatumArtifactRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    HeadModelCustomMetadatumArtifactRequest,
                                    HeadModelCustomMetadatumArtifactResponse>
                            handler);

    /**
     * Gets defined metadata artifact metadata for specified model metadata key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<HeadModelDefinedMetadatumArtifactResponse>
            headModelDefinedMetadatumArtifact(
                    HeadModelDefinedMetadatumArtifactRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    HeadModelDefinedMetadatumArtifactRequest,
                                    HeadModelDefinedMetadatumArtifactResponse>
                            handler);

    /**
     * Get the artifact metadata for a step in the pipeline.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<HeadStepArtifactResponse> headStepArtifact(
            HeadStepArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<HeadStepArtifactRequest, HeadStepArtifactResponse>
                    handler);

    /**
     * Import model artifact from service bucket
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ImportModelArtifactResponse> importModelArtifact(
            ImportModelArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ImportModelArtifactRequest, ImportModelArtifactResponse>
                    handler);

    /**
     * List containers.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListContainersResponse> listContainers(
            ListContainersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListContainersRequest, ListContainersResponse>
                    handler);

    /**
     * Lists all Data Science private endpoints in the specified compartment. The query must include
     * compartmentId. The query can also include one other parameter. If the query doesn't include
     * compartmentId, or includes compartmentId with two or more other parameters, then an error is
     * returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDataSciencePrivateEndpointsResponse>
            listDataSciencePrivateEndpoints(
                    ListDataSciencePrivateEndpointsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDataSciencePrivateEndpointsRequest,
                                    ListDataSciencePrivateEndpointsResponse>
                            handler);

    /**
     * List fast launch capable job configs in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFastLaunchJobConfigsResponse> listFastLaunchJobConfigs(
            ListFastLaunchJobConfigsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListFastLaunchJobConfigsRequest, ListFastLaunchJobConfigsResponse>
                    handler);

    /**
     * List out job runs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJobRunsResponse> listJobRuns(
            ListJobRunsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJobRunsRequest, ListJobRunsResponse> handler);

    /**
     * List job shapes available in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJobShapesResponse> listJobShapes(
            ListJobShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJobShapesRequest, ListJobShapesResponse>
                    handler);

    /**
     * List jobs in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJobsResponse> listJobs(
            ListJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse> handler);

    /**
     * Lists the valid model deployment shapes.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListModelDeploymentShapesResponse> listModelDeploymentShapes(
            ListModelDeploymentShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListModelDeploymentShapesRequest, ListModelDeploymentShapesResponse>
                    handler);

    /**
     * Lists all model deployments in the specified compartment. Only one parameter other than
     * compartmentId may also be included in a query. The query must include compartmentId. If the
     * query does not include compartmentId, or includes compartmentId but two or more other
     * parameters an error is returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListModelDeploymentsResponse> listModelDeployments(
            ListModelDeploymentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListModelDeploymentsRequest, ListModelDeploymentsResponse>
                    handler);

    /**
     * Lists model version sets in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListModelVersionSetsResponse> listModelVersionSets(
            ListModelVersionSetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListModelVersionSetsRequest, ListModelVersionSetsResponse>
                    handler);

    /**
     * Lists models in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListModelsResponse> listModels(
            ListModelsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListModelsRequest, ListModelsResponse> handler);

    /**
     * Lists the valid notebook session shapes.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListNotebookSessionShapesResponse> listNotebookSessionShapes(
            ListNotebookSessionShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListNotebookSessionShapesRequest, ListNotebookSessionShapesResponse>
                    handler);

    /**
     * Lists the notebook sessions in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListNotebookSessionsResponse> listNotebookSessions(
            ListNotebookSessionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListNotebookSessionsRequest, ListNotebookSessionsResponse>
                    handler);

    /**
     * Returns a list of PipelineRuns.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPipelineRunsResponse> listPipelineRuns(
            ListPipelineRunsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPipelineRunsRequest, ListPipelineRunsResponse>
                    handler);

    /**
     * Returns a list of Pipelines.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPipelinesResponse> listPipelines(
            ListPipelinesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPipelinesRequest, ListPipelinesResponse>
                    handler);

    /**
     * Lists projects in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProjectsResponse> listProjects(
            ListProjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                    handler);

    /**
     * Returns a list of Schedules.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSchedulesResponse> listSchedules(
            ListSchedulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSchedulesRequest, ListSchedulesResponse>
                    handler);

    /**
     * Lists work request errors for the specified work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Lists work request logs for the specified work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists work requests in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Registers model artifact reference metadata
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RegisterModelArtifactReferenceResponse>
            registerModelArtifactReference(
                    RegisterModelArtifactReferenceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RegisterModelArtifactReferenceRequest,
                                    RegisterModelArtifactReferenceResponse>
                            handler);

    /**
     * Restore archived model artifact
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RestoreArchivedModelArtifactResponse> restoreArchivedModelArtifact(
            RestoreArchivedModelArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RestoreArchivedModelArtifactRequest,
                            RestoreArchivedModelArtifactResponse>
                    handler);

    /**
     * Updates a private endpoint using a `privateEndpointId`. If changes to a private endpoint
     * match a previously defined private endpoint, then a 409 status code is returned. This
     * indicates that a conflict has been detected.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDataSciencePrivateEndpointResponse>
            updateDataSciencePrivateEndpoint(
                    UpdateDataSciencePrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDataSciencePrivateEndpointRequest,
                                    UpdateDataSciencePrivateEndpointResponse>
                            handler);

    /**
     * Updates a job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateJobResponse> updateJob(
            UpdateJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse> handler);

    /**
     * Updates a job run.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateJobRunResponse> updateJobRun(
            UpdateJobRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateJobRunRequest, UpdateJobRunResponse>
                    handler);

    /**
     * Updates the properties of a model. You can update the `displayName`, `description`,
     * `freeformTags`, and `definedTags` properties.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateModelResponse> updateModel(
            UpdateModelRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateModelRequest, UpdateModelResponse> handler);

    /**
     * Updates model custom metadata artifact for specified model metadata key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateModelCustomMetadatumArtifactResponse>
            updateModelCustomMetadatumArtifact(
                    UpdateModelCustomMetadatumArtifactRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateModelCustomMetadatumArtifactRequest,
                                    UpdateModelCustomMetadatumArtifactResponse>
                            handler);

    /**
     * Updates model defined metadata artifact for specified model metadata key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateModelDefinedMetadatumArtifactResponse>
            updateModelDefinedMetadatumArtifact(
                    UpdateModelDefinedMetadatumArtifactRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateModelDefinedMetadatumArtifactRequest,
                                    UpdateModelDefinedMetadatumArtifactResponse>
                            handler);

    /**
     * Updates the properties of a model deployment. Some of the properties of
     * `modelDeploymentConfigurationDetails` or `CategoryLogDetails` can also be updated with zero
     * down time when the model deployment's lifecycle state is ACTIVE or NEEDS_ATTENTION i.e
     * `instanceShapeName`, `instanceCount` and `modelId`, separately `loadBalancerShape` or
     * `CategoryLogDetails` can also be updated independently. All of the fields can be updated when
     * the deployment is in the INACTIVE lifecycle state. Changes will take effect the next time the
     * model deployment is activated.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateModelDeploymentResponse> updateModelDeployment(
            UpdateModelDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateModelDeploymentRequest, UpdateModelDeploymentResponse>
                    handler);

    /**
     * Updates the provenance information for the specified model.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateModelProvenanceResponse> updateModelProvenance(
            UpdateModelProvenanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateModelProvenanceRequest, UpdateModelProvenanceResponse>
                    handler);

    /**
     * Updates the properties of a model version set. User can update the `description` property.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateModelVersionSetResponse> updateModelVersionSet(
            UpdateModelVersionSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateModelVersionSetRequest, UpdateModelVersionSetResponse>
                    handler);

    /**
     * Updates the properties of a notebook session. You can update the `displayName`,
     * `freeformTags`, and `definedTags` properties. When the notebook session is in the INACTIVE
     * lifecycle state, you can update `notebookSessionConfigurationDetails` and change `shape`,
     * `subnetId`, and `blockStorageSizeInGBs`. Changes to the `notebookSessionConfigurationDetails`
     * take effect the next time the `ActivateNotebookSession` action is invoked on the notebook
     * session resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNotebookSessionResponse> updateNotebookSession(
            UpdateNotebookSessionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateNotebookSessionRequest, UpdateNotebookSessionResponse>
                    handler);

    /**
     * Updates the Pipeline.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePipelineResponse> updatePipeline(
            UpdatePipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResponse>
                    handler);

    /**
     * Updates the PipelineRun.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePipelineRunResponse> updatePipelineRun(
            UpdatePipelineRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePipelineRunRequest, UpdatePipelineRunResponse>
                    handler);

    /**
     * Updates the properties of a project. You can update the `displayName`, `description`,
     * `freeformTags`, and `definedTags` properties.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateProjectResponse> updateProject(
            UpdateProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateProjectRequest, UpdateProjectResponse>
                    handler);

    /**
     * Updates the Schedule
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateScheduleResponse> updateSchedule(
            UpdateScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateScheduleRequest, UpdateScheduleResponse>
                    handler);
}
