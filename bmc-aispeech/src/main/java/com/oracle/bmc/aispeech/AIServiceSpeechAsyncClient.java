/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.aispeech.requests.*;
import com.oracle.bmc.aispeech.responses.*;

import java.util.Objects;

/**
 * Async client implementation for AIServiceSpeech service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
public class AIServiceSpeechAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements AIServiceSpeechAsync {
    /** Service instance for AIServiceSpeech. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("AISERVICESPEECH")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://speech.aiservice.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AIServiceSpeechAsyncClient.class);

    AIServiceSpeechAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    AIServiceSpeechAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "AIServiceSpeechAsyncClient", "synthesizeSpeech"));
        }
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, AIServiceSpeechAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "aispeech";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public AIServiceSpeechAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AIServiceSpeechAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public java.util.concurrent.Future<CancelTranscriptionJobResponse> cancelTranscriptionJob(
            CancelTranscriptionJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelTranscriptionJobRequest, CancelTranscriptionJobResponse>
                    handler) {

        Validate.notBlank(request.getTranscriptionJobId(), "transcriptionJobId must not be blank");

        return clientCall(request, CancelTranscriptionJobResponse::builder)
                .logger(LOG, "cancelTranscriptionJob")
                .serviceDetails(
                        "AIServiceSpeech",
                        "CancelTranscriptionJob",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/TranscriptionJob/CancelTranscriptionJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelTranscriptionJobRequest::builder)
                .basePath("/20220101")
                .appendPathParam("transcriptionJobs")
                .appendPathParam(request.getTranscriptionJobId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", CancelTranscriptionJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelTranscriptionTaskResponse> cancelTranscriptionTask(
            CancelTranscriptionTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelTranscriptionTaskRequest, CancelTranscriptionTaskResponse>
                    handler) {

        Validate.notBlank(request.getTranscriptionJobId(), "transcriptionJobId must not be blank");

        Validate.notBlank(
                request.getTranscriptionTaskId(), "transcriptionTaskId must not be blank");

        return clientCall(request, CancelTranscriptionTaskResponse::builder)
                .logger(LOG, "cancelTranscriptionTask")
                .serviceDetails(
                        "AIServiceSpeech",
                        "CancelTranscriptionTask",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/TranscriptionTask/CancelTranscriptionTask")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelTranscriptionTaskRequest::builder)
                .basePath("/20220101")
                .appendPathParam("transcriptionJobs")
                .appendPathParam(request.getTranscriptionJobId())
                .appendPathParam("transcriptionTasks")
                .appendPathParam(request.getTranscriptionTaskId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", CancelTranscriptionTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeCustomizationCompartmentResponse>
            changeCustomizationCompartment(
                    ChangeCustomizationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCustomizationCompartmentRequest,
                                    ChangeCustomizationCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getCustomizationId(), "customizationId must not be blank");
        Objects.requireNonNull(
                request.getChangeCustomizationCompartmentDetails(),
                "changeCustomizationCompartmentDetails is required");

        return clientCall(request, ChangeCustomizationCompartmentResponse::builder)
                .logger(LOG, "changeCustomizationCompartment")
                .serviceDetails(
                        "AIServiceSpeech",
                        "ChangeCustomizationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/Customization/ChangeCustomizationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCustomizationCompartmentRequest::builder)
                .basePath("/20220101")
                .appendPathParam("customizations")
                .appendPathParam(request.getCustomizationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCustomizationCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeTranscriptionJobCompartmentResponse>
            changeTranscriptionJobCompartment(
                    ChangeTranscriptionJobCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeTranscriptionJobCompartmentRequest,
                                    ChangeTranscriptionJobCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getTranscriptionJobId(), "transcriptionJobId must not be blank");
        Objects.requireNonNull(
                request.getChangeTranscriptionJobCompartmentDetails(),
                "changeTranscriptionJobCompartmentDetails is required");

        return clientCall(request, ChangeTranscriptionJobCompartmentResponse::builder)
                .logger(LOG, "changeTranscriptionJobCompartment")
                .serviceDetails(
                        "AIServiceSpeech",
                        "ChangeTranscriptionJobCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/TranscriptionJob/ChangeTranscriptionJobCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeTranscriptionJobCompartmentRequest::builder)
                .basePath("/20220101")
                .appendPathParam("transcriptionJobs")
                .appendPathParam(request.getTranscriptionJobId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeTranscriptionJobCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateCustomizationResponse> createCustomization(
            CreateCustomizationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomizationRequest, CreateCustomizationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateCustomizationDetails(), "createCustomizationDetails is required");

        return clientCall(request, CreateCustomizationResponse::builder)
                .logger(LOG, "createCustomization")
                .serviceDetails(
                        "AIServiceSpeech",
                        "CreateCustomization",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/Customization/CreateCustomization")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCustomizationRequest::builder)
                .basePath("/20220101")
                .appendPathParam("customizations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aispeech.model.Customization.class,
                        CreateCustomizationResponse.Builder::customization)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCustomizationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCustomizationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRealtimeSessionTokenResponse>
            createRealtimeSessionToken(
                    CreateRealtimeSessionTokenRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateRealtimeSessionTokenRequest,
                                    CreateRealtimeSessionTokenResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateRealtimeSessionTokenDetails(),
                "createRealtimeSessionTokenDetails is required");

        return clientCall(request, CreateRealtimeSessionTokenResponse::builder)
                .logger(LOG, "createRealtimeSessionToken")
                .serviceDetails(
                        "AIServiceSpeech",
                        "CreateRealtimeSessionToken",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/RealtimeSessionToken/CreateRealtimeSessionToken")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRealtimeSessionTokenRequest::builder)
                .basePath("/20220101")
                .appendPathParam("actions")
                .appendPathParam("realtimeSessionToken")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aispeech.model.RealtimeSessionToken.class,
                        CreateRealtimeSessionTokenResponse.Builder::realtimeSessionToken)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRealtimeSessionTokenResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateRealtimeSessionTokenResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTranscriptionJobResponse> createTranscriptionJob(
            CreateTranscriptionJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTranscriptionJobRequest, CreateTranscriptionJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateTranscriptionJobDetails(),
                "createTranscriptionJobDetails is required");

        return clientCall(request, CreateTranscriptionJobResponse::builder)
                .logger(LOG, "createTranscriptionJob")
                .serviceDetails(
                        "AIServiceSpeech",
                        "CreateTranscriptionJob",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/TranscriptionJob/CreateTranscriptionJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTranscriptionJobRequest::builder)
                .basePath("/20220101")
                .appendPathParam("transcriptionJobs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aispeech.model.TranscriptionJob.class,
                        CreateTranscriptionJobResponse.Builder::transcriptionJob)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTranscriptionJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateTranscriptionJobResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCustomizationResponse> deleteCustomization(
            DeleteCustomizationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomizationRequest, DeleteCustomizationResponse>
                    handler) {

        Validate.notBlank(request.getCustomizationId(), "customizationId must not be blank");

        return clientCall(request, DeleteCustomizationResponse::builder)
                .logger(LOG, "deleteCustomization")
                .serviceDetails(
                        "AIServiceSpeech",
                        "DeleteCustomization",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/Customization/DeleteCustomization")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCustomizationRequest::builder)
                .basePath("/20220101")
                .appendPathParam("customizations")
                .appendPathParam(request.getCustomizationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCustomizationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTranscriptionJobResponse> deleteTranscriptionJob(
            DeleteTranscriptionJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTranscriptionJobRequest, DeleteTranscriptionJobResponse>
                    handler) {

        Validate.notBlank(request.getTranscriptionJobId(), "transcriptionJobId must not be blank");

        return clientCall(request, DeleteTranscriptionJobResponse::builder)
                .logger(LOG, "deleteTranscriptionJob")
                .serviceDetails(
                        "AIServiceSpeech",
                        "DeleteTranscriptionJob",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/TranscriptionJob/DeleteTranscriptionJob")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTranscriptionJobRequest::builder)
                .basePath("/20220101")
                .appendPathParam("transcriptionJobs")
                .appendPathParam(request.getTranscriptionJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTranscriptionJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCustomizationResponse> getCustomization(
            GetCustomizationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCustomizationRequest, GetCustomizationResponse>
                    handler) {

        Validate.notBlank(request.getCustomizationId(), "customizationId must not be blank");

        return clientCall(request, GetCustomizationResponse::builder)
                .logger(LOG, "getCustomization")
                .serviceDetails(
                        "AIServiceSpeech",
                        "GetCustomization",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/Customization/GetCustomization")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCustomizationRequest::builder)
                .basePath("/20220101")
                .appendPathParam("customizations")
                .appendPathParam(request.getCustomizationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aispeech.model.Customization.class,
                        GetCustomizationResponse.Builder::customization)
                .handleResponseHeaderString("etag", GetCustomizationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCustomizationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTranscriptionJobResponse> getTranscriptionJob(
            GetTranscriptionJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTranscriptionJobRequest, GetTranscriptionJobResponse>
                    handler) {

        Validate.notBlank(request.getTranscriptionJobId(), "transcriptionJobId must not be blank");

        return clientCall(request, GetTranscriptionJobResponse::builder)
                .logger(LOG, "getTranscriptionJob")
                .serviceDetails(
                        "AIServiceSpeech",
                        "GetTranscriptionJob",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/TranscriptionJob/GetTranscriptionJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTranscriptionJobRequest::builder)
                .basePath("/20220101")
                .appendPathParam("transcriptionJobs")
                .appendPathParam(request.getTranscriptionJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aispeech.model.TranscriptionJob.class,
                        GetTranscriptionJobResponse.Builder::transcriptionJob)
                .handleResponseHeaderString("etag", GetTranscriptionJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTranscriptionJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTranscriptionTaskResponse> getTranscriptionTask(
            GetTranscriptionTaskRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetTranscriptionTaskRequest, GetTranscriptionTaskResponse>
                    handler) {

        Validate.notBlank(request.getTranscriptionJobId(), "transcriptionJobId must not be blank");

        Validate.notBlank(
                request.getTranscriptionTaskId(), "transcriptionTaskId must not be blank");

        return clientCall(request, GetTranscriptionTaskResponse::builder)
                .logger(LOG, "getTranscriptionTask")
                .serviceDetails(
                        "AIServiceSpeech",
                        "GetTranscriptionTask",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/TranscriptionTask/GetTranscriptionTask")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTranscriptionTaskRequest::builder)
                .basePath("/20220101")
                .appendPathParam("transcriptionJobs")
                .appendPathParam(request.getTranscriptionJobId())
                .appendPathParam("transcriptionTasks")
                .appendPathParam(request.getTranscriptionTaskId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aispeech.model.TranscriptionTask.class,
                        GetTranscriptionTaskResponse.Builder::transcriptionTask)
                .handleResponseHeaderString("etag", GetTranscriptionTaskResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTranscriptionTaskResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCustomizationsResponse> listCustomizations(
            ListCustomizationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCustomizationsRequest, ListCustomizationsResponse>
                    handler) {

        return clientCall(request, ListCustomizationsResponse::builder)
                .logger(LOG, "listCustomizations")
                .serviceDetails(
                        "AIServiceSpeech",
                        "ListCustomizations",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/Customization/ListCustomizations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCustomizationsRequest::builder)
                .basePath("/20220101")
                .appendPathParam("customizations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aispeech.model.CustomizationCollection.class,
                        ListCustomizationsResponse.Builder::customizationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCustomizationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCustomizationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListCustomizationsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTranscriptionJobsResponse> listTranscriptionJobs(
            ListTranscriptionJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTranscriptionJobsRequest, ListTranscriptionJobsResponse>
                    handler) {

        return clientCall(request, ListTranscriptionJobsResponse::builder)
                .logger(LOG, "listTranscriptionJobs")
                .serviceDetails(
                        "AIServiceSpeech",
                        "ListTranscriptionJobs",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/TranscriptionJob/ListTranscriptionJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTranscriptionJobsRequest::builder)
                .basePath("/20220101")
                .appendPathParam("transcriptionJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aispeech.model.TranscriptionJobCollection.class,
                        ListTranscriptionJobsResponse.Builder::transcriptionJobCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTranscriptionJobsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTranscriptionJobsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListTranscriptionJobsResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTranscriptionTasksResponse> listTranscriptionTasks(
            ListTranscriptionTasksRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTranscriptionTasksRequest, ListTranscriptionTasksResponse>
                    handler) {

        Validate.notBlank(request.getTranscriptionJobId(), "transcriptionJobId must not be blank");

        return clientCall(request, ListTranscriptionTasksResponse::builder)
                .logger(LOG, "listTranscriptionTasks")
                .serviceDetails(
                        "AIServiceSpeech",
                        "ListTranscriptionTasks",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/TranscriptionTask/ListTranscriptionTasks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTranscriptionTasksRequest::builder)
                .basePath("/20220101")
                .appendPathParam("transcriptionJobs")
                .appendPathParam(request.getTranscriptionJobId())
                .appendPathParam("transcriptionTasks")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aispeech.model.TranscriptionTaskCollection.class,
                        ListTranscriptionTasksResponse.Builder::transcriptionTaskCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTranscriptionTasksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTranscriptionTasksResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListTranscriptionTasksResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListVoicesResponse> listVoices(
            ListVoicesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListVoicesRequest, ListVoicesResponse>
                    handler) {

        return clientCall(request, ListVoicesResponse::builder)
                .logger(LOG, "listVoices")
                .serviceDetails(
                        "AIServiceSpeech",
                        "ListVoices",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/Voice/ListVoices")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVoicesRequest::builder)
                .basePath("/20220101")
                .appendPathParam("voices")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("modelName", request.getModelName())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.aispeech.model.VoiceCollection.class,
                        ListVoicesResponse.Builder::voiceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListVoicesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SynthesizeSpeechResponse> synthesizeSpeech(
            SynthesizeSpeechRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SynthesizeSpeechRequest, SynthesizeSpeechResponse>
                    handler) {
        Objects.requireNonNull(
                request.getSynthesizeSpeechDetails(), "synthesizeSpeechDetails is required");

        return clientCall(request, SynthesizeSpeechResponse::builder)
                .logger(LOG, "synthesizeSpeech")
                .serviceDetails(
                        "AIServiceSpeech",
                        "SynthesizeSpeech",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/SynthesizeSpeech/SynthesizeSpeech")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SynthesizeSpeechRequest::builder)
                .basePath("/20220101")
                .appendPathParam("actions")
                .appendPathParam("synthesizeSpeech")
                .accept("audio/mpeg", "audio/ogg", "audio/pcm", "audio/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class, SynthesizeSpeechResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", SynthesizeSpeechResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCustomizationResponse> updateCustomization(
            UpdateCustomizationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCustomizationRequest, UpdateCustomizationResponse>
                    handler) {

        Validate.notBlank(request.getCustomizationId(), "customizationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCustomizationDetails(), "updateCustomizationDetails is required");

        return clientCall(request, UpdateCustomizationResponse::builder)
                .logger(LOG, "updateCustomization")
                .serviceDetails(
                        "AIServiceSpeech",
                        "UpdateCustomization",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/Customization/UpdateCustomization")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCustomizationRequest::builder)
                .basePath("/20220101")
                .appendPathParam("customizations")
                .appendPathParam(request.getCustomizationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aispeech.model.Customization.class,
                        UpdateCustomizationResponse.Builder::customization)
                .handleResponseHeaderString("etag", UpdateCustomizationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCustomizationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTranscriptionJobResponse> updateTranscriptionJob(
            UpdateTranscriptionJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTranscriptionJobRequest, UpdateTranscriptionJobResponse>
                    handler) {

        Validate.notBlank(request.getTranscriptionJobId(), "transcriptionJobId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTranscriptionJobDetails(),
                "updateTranscriptionJobDetails is required");

        return clientCall(request, UpdateTranscriptionJobResponse::builder)
                .logger(LOG, "updateTranscriptionJob")
                .serviceDetails(
                        "AIServiceSpeech",
                        "UpdateTranscriptionJob",
                        "https://docs.oracle.com/iaas/api/#/en/speech/20220101/TranscriptionJob/UpdateTranscriptionJob")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTranscriptionJobRequest::builder)
                .basePath("/20220101")
                .appendPathParam("transcriptionJobs")
                .appendPathParam(request.getTranscriptionJobId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.aispeech.model.TranscriptionJob.class,
                        UpdateTranscriptionJobResponse.Builder::transcriptionJob)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTranscriptionJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateTranscriptionJobResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AIServiceSpeechAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AIServiceSpeechAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AIServiceSpeechAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AIServiceSpeechAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AIServiceSpeechAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AIServiceSpeechAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AIServiceSpeechAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider);
    }
}
