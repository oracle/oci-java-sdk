/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Management service. <br>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ManagementAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ManagementAsync {
    /** Service instance for Management. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MANAGEMENT")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://digitalassistant-api.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ManagementAsyncClient.class);

    private ManagementAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ManagementAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public ManagementAsyncClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ManagementAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ConfigureDigitalAssistantParametersResponse>
            configureDigitalAssistantParameters(
                    ConfigureDigitalAssistantParametersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDigitalAssistantParametersRequest,
                                    ConfigureDigitalAssistantParametersResponse>
                            handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(
                request.getConfigureDigitalAssistantParametersDetails(),
                "configureDigitalAssistantParametersDetails is required");

        return clientCall(request, ConfigureDigitalAssistantParametersResponse::builder)
                .logger(LOG, "configureDigitalAssistantParameters")
                .serviceDetails(
                        "Management",
                        "ConfigureDigitalAssistantParameters",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistantParameter/ConfigureDigitalAssistantParameters")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureDigitalAssistantParametersRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("actions")
                .appendPathParam("configureDigitalAssistantParameters")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureDigitalAssistantParametersResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAuthenticationProviderResponse>
            createAuthenticationProvider(
                    CreateAuthenticationProviderRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateAuthenticationProviderRequest,
                                    CreateAuthenticationProviderResponse>
                            handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateAuthenticationProviderDetails(),
                "createAuthenticationProviderDetails is required");

        return clientCall(request, CreateAuthenticationProviderResponse::builder)
                .logger(LOG, "createAuthenticationProvider")
                .serviceDetails(
                        "Management",
                        "CreateAuthenticationProvider",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/CreateAuthenticationProvider")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAuthenticationProviderRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("authenticationProviders")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.AuthenticationProvider.class,
                        CreateAuthenticationProviderResponse.Builder::authenticationProvider)
                .handleResponseHeaderString(
                        "Location", CreateAuthenticationProviderResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag", CreateAuthenticationProviderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateAuthenticationProviderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateChannelResponse> createChannel(
            CreateChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateChannelRequest, CreateChannelResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateChannelDetails(), "createChannelDetails is required");

        return clientCall(request, CreateChannelResponse::builder)
                .logger(LOG, "createChannel")
                .serviceDetails(
                        "Management",
                        "CreateChannel",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/CreateChannel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateChannelRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.CreateChannelResult.class,
                        CreateChannelResponse.Builder::createChannelResult)
                .handleResponseHeaderString("Location", CreateChannelResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateChannelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDigitalAssistantResponse> createDigitalAssistant(
            CreateDigitalAssistantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDigitalAssistantRequest, CreateDigitalAssistantResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateDigitalAssistantDetails(),
                "createDigitalAssistantDetails is required");

        return clientCall(request, CreateDigitalAssistantResponse::builder)
                .logger(LOG, "createDigitalAssistant")
                .serviceDetails(
                        "Management",
                        "CreateDigitalAssistant",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/CreateDigitalAssistant")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDigitalAssistantRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDigitalAssistantResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDigitalAssistantResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSkillResponse> createSkill(
            CreateSkillRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateSkillRequest, CreateSkillResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(request.getCreateSkillDetails(), "createSkillDetails is required");

        return clientCall(request, CreateSkillResponse::builder)
                .logger(LOG, "createSkill")
                .serviceDetails(
                        "Management",
                        "CreateSkill",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/CreateSkill")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSkillRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateSkillResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSkillResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateSkillParameterResponse> createSkillParameter(
            CreateSkillParameterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateSkillParameterRequest, CreateSkillParameterResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");
        Objects.requireNonNull(
                request.getCreateSkillParameterDetails(),
                "createSkillParameterDetails is required");

        return clientCall(request, CreateSkillParameterResponse::builder)
                .logger(LOG, "createSkillParameter")
                .serviceDetails(
                        "Management",
                        "CreateSkillParameter",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/CreateSkillParameter")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateSkillParameterRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("parameters")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.SkillParameter.class,
                        CreateSkillParameterResponse.Builder::skillParameter)
                .handleResponseHeaderString(
                        "Location", CreateSkillParameterResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreateSkillParameterResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateSkillParameterResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTranslatorResponse> createTranslator(
            CreateTranslatorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateTranslatorRequest, CreateTranslatorResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(
                request.getCreateTranslatorDetails(), "createTranslatorDetails is required");

        return clientCall(request, CreateTranslatorResponse::builder)
                .logger(LOG, "createTranslator")
                .serviceDetails(
                        "Management",
                        "CreateTranslator",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/CreateTranslator")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTranslatorRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("translators")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.Translator.class,
                        CreateTranslatorResponse.Builder::translator)
                .handleResponseHeaderString("Location", CreateTranslatorResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateTranslatorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTranslatorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAuthenticationProviderResponse>
            deleteAuthenticationProvider(
                    DeleteAuthenticationProviderRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteAuthenticationProviderRequest,
                                    DeleteAuthenticationProviderResponse>
                            handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(
                request.getAuthenticationProviderId(),
                "authenticationProviderId must not be blank");

        return clientCall(request, DeleteAuthenticationProviderResponse::builder)
                .logger(LOG, "deleteAuthenticationProvider")
                .serviceDetails(
                        "Management",
                        "DeleteAuthenticationProvider",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/DeleteAuthenticationProvider")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAuthenticationProviderRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("authenticationProviders")
                .appendPathParam(request.getAuthenticationProviderId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteAuthenticationProviderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteChannelResponse> deleteChannel(
            DeleteChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteChannelRequest, DeleteChannelResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, DeleteChannelResponse::builder)
                .logger(LOG, "deleteChannel")
                .serviceDetails(
                        "Management",
                        "DeleteChannel",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/DeleteChannel")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteChannelRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteChannelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDigitalAssistantResponse> deleteDigitalAssistant(
            DeleteDigitalAssistantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDigitalAssistantRequest, DeleteDigitalAssistantResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");

        return clientCall(request, DeleteDigitalAssistantResponse::builder)
                .logger(LOG, "deleteDigitalAssistant")
                .serviceDetails(
                        "Management",
                        "DeleteDigitalAssistant",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/DeleteDigitalAssistant")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDigitalAssistantRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDigitalAssistantResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSkillResponse> deleteSkill(
            DeleteSkillRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteSkillRequest, DeleteSkillResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        return clientCall(request, DeleteSkillResponse::builder)
                .logger(LOG, "deleteSkill")
                .serviceDetails(
                        "Management",
                        "DeleteSkill",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/DeleteSkill")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSkillRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSkillResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteSkillParameterResponse> deleteSkillParameter(
            DeleteSkillParameterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteSkillParameterRequest, DeleteSkillParameterResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        Validate.notBlank(request.getParameterName(), "parameterName must not be blank");

        return clientCall(request, DeleteSkillParameterResponse::builder)
                .logger(LOG, "deleteSkillParameter")
                .serviceDetails(
                        "Management",
                        "DeleteSkillParameter",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/DeleteSkillParameter")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteSkillParameterRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("parameters")
                .appendPathParam(request.getParameterName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteSkillParameterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTranslatorResponse> deleteTranslator(
            DeleteTranslatorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteTranslatorRequest, DeleteTranslatorResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getTranslatorId(), "translatorId must not be blank");

        return clientCall(request, DeleteTranslatorResponse::builder)
                .logger(LOG, "deleteTranslator")
                .serviceDetails(
                        "Management",
                        "DeleteTranslator",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/DeleteTranslator")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTranslatorRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("translators")
                .appendPathParam(request.getTranslatorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTranslatorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExportDigitalAssistantResponse> exportDigitalAssistant(
            ExportDigitalAssistantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ExportDigitalAssistantRequest, ExportDigitalAssistantResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");
        Objects.requireNonNull(
                request.getExportDigitalAssistantDetails(),
                "exportDigitalAssistantDetails is required");

        return clientCall(request, ExportDigitalAssistantResponse::builder)
                .logger(LOG, "exportDigitalAssistant")
                .serviceDetails(
                        "Management",
                        "ExportDigitalAssistant",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/ExportDigitalAssistant")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportDigitalAssistantRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .appendPathParam("actions")
                .appendPathParam("export")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ExportDigitalAssistantResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ExportDigitalAssistantResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ExportSkillResponse> exportSkill(
            ExportSkillRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ExportSkillRequest, ExportSkillResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");
        Objects.requireNonNull(request.getExportSkillDetails(), "exportSkillDetails is required");

        return clientCall(request, ExportSkillResponse::builder)
                .logger(LOG, "exportSkill")
                .serviceDetails(
                        "Management",
                        "ExportSkill",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/ExportSkill")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportSkillRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("actions")
                .appendPathParam("export")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ExportSkillResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", ExportSkillResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAuthenticationProviderResponse> getAuthenticationProvider(
            GetAuthenticationProviderRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAuthenticationProviderRequest, GetAuthenticationProviderResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(
                request.getAuthenticationProviderId(),
                "authenticationProviderId must not be blank");

        return clientCall(request, GetAuthenticationProviderResponse::builder)
                .logger(LOG, "getAuthenticationProvider")
                .serviceDetails(
                        "Management",
                        "GetAuthenticationProvider",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/GetAuthenticationProvider")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAuthenticationProviderRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("authenticationProviders")
                .appendPathParam(request.getAuthenticationProviderId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.AuthenticationProvider.class,
                        GetAuthenticationProviderResponse.Builder::authenticationProvider)
                .handleResponseHeaderString("etag", GetAuthenticationProviderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAuthenticationProviderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetChannelResponse> getChannel(
            GetChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetChannelRequest, GetChannelResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, GetChannelResponse::builder)
                .logger(LOG, "getChannel")
                .serviceDetails(
                        "Management",
                        "GetChannel",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/GetChannel")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetChannelRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.Channel.class, GetChannelResponse.Builder::channel)
                .handleResponseHeaderString("etag", GetChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetChannelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDigitalAssistantResponse> getDigitalAssistant(
            GetDigitalAssistantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalAssistantRequest, GetDigitalAssistantResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");

        return clientCall(request, GetDigitalAssistantResponse::builder)
                .logger(LOG, "getDigitalAssistant")
                .serviceDetails(
                        "Management",
                        "GetDigitalAssistant",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/GetDigitalAssistant")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalAssistantRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistant.class,
                        GetDigitalAssistantResponse.Builder::digitalAssistant)
                .handleResponseHeaderString("etag", GetDigitalAssistantResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDigitalAssistantResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDigitalAssistantParameterResponse>
            getDigitalAssistantParameter(
                    GetDigitalAssistantParameterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetDigitalAssistantParameterRequest,
                                    GetDigitalAssistantParameterResponse>
                            handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");

        Validate.notBlank(request.getParameterName(), "parameterName must not be blank");

        return clientCall(request, GetDigitalAssistantParameterResponse::builder)
                .logger(LOG, "getDigitalAssistantParameter")
                .serviceDetails(
                        "Management",
                        "GetDigitalAssistantParameter",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistantParameter/GetDigitalAssistantParameter")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDigitalAssistantParameterRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .appendPathParam("parameters")
                .appendPathParam(request.getParameterName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistantParameter.class,
                        GetDigitalAssistantParameterResponse.Builder::digitalAssistantParameter)
                .handleResponseHeaderString(
                        "etag", GetDigitalAssistantParameterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDigitalAssistantParameterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSkillResponse> getSkill(
            GetSkillRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetSkillRequest, GetSkillResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        return clientCall(request, GetSkillResponse::builder)
                .logger(LOG, "getSkill")
                .serviceDetails(
                        "Management",
                        "GetSkill",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/GetSkill")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSkillRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(com.oracle.bmc.oda.model.Skill.class, GetSkillResponse.Builder::skill)
                .handleResponseHeaderString("etag", GetSkillResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSkillResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetSkillParameterResponse> getSkillParameter(
            GetSkillParameterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetSkillParameterRequest, GetSkillParameterResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        Validate.notBlank(request.getParameterName(), "parameterName must not be blank");

        return clientCall(request, GetSkillParameterResponse::builder)
                .logger(LOG, "getSkillParameter")
                .serviceDetails(
                        "Management",
                        "GetSkillParameter",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/GetSkillParameter")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetSkillParameterRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("parameters")
                .appendPathParam(request.getParameterName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.SkillParameter.class,
                        GetSkillParameterResponse.Builder::skillParameter)
                .handleResponseHeaderString("etag", GetSkillParameterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetSkillParameterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTranslatorResponse> getTranslator(
            GetTranslatorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTranslatorRequest, GetTranslatorResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getTranslatorId(), "translatorId must not be blank");

        return clientCall(request, GetTranslatorResponse::builder)
                .logger(LOG, "getTranslator")
                .serviceDetails(
                        "Management",
                        "GetTranslator",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/GetTranslator")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTranslatorRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("translators")
                .appendPathParam(request.getTranslatorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.Translator.class,
                        GetTranslatorResponse.Builder::translator)
                .handleResponseHeaderString("etag", GetTranslatorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTranslatorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ImportBotResponse> importBot(
            ImportBotRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ImportBotRequest, ImportBotResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");
        Objects.requireNonNull(request.getImportBotDetails(), "importBotDetails is required");

        return clientCall(request, ImportBotResponse::builder)
                .logger(LOG, "importBot")
                .serviceDetails(
                        "Management",
                        "ImportBot",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Bot/ImportBot")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportBotRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("actions")
                .appendPathParam("importBot")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ImportBotResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ImportBotResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuthenticationProvidersResponse>
            listAuthenticationProviders(
                    ListAuthenticationProvidersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAuthenticationProvidersRequest,
                                    ListAuthenticationProvidersResponse>
                            handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, ListAuthenticationProvidersResponse::builder)
                .logger(LOG, "listAuthenticationProviders")
                .serviceDetails(
                        "Management",
                        "ListAuthenticationProviders",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/ListAuthenticationProviders")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuthenticationProvidersRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("authenticationProviders")
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("identityProvider", request.getIdentityProvider())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.AuthenticationProviderCollection.class,
                        ListAuthenticationProvidersResponse.Builder
                                ::authenticationProviderCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuthenticationProvidersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuthenticationProvidersResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListAuthenticationProvidersResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResponse> listChannels(
            ListChannelsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListChannelsRequest, ListChannelsResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, ListChannelsResponse::builder)
                .logger(LOG, "listChannels")
                .serviceDetails(
                        "Management",
                        "ListChannels",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/ListChannels")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListChannelsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("category", request.getCategory())
                .appendEnumQueryParam("type", request.getType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.ChannelCollection.class,
                        ListChannelsResponse.Builder::channelCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListChannelsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListChannelsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListChannelsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDigitalAssistantParametersResponse>
            listDigitalAssistantParameters(
                    ListDigitalAssistantParametersRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListDigitalAssistantParametersRequest,
                                    ListDigitalAssistantParametersResponse>
                            handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");

        return clientCall(request, ListDigitalAssistantParametersResponse::builder)
                .logger(LOG, "listDigitalAssistantParameters")
                .serviceDetails(
                        "Management",
                        "ListDigitalAssistantParameters",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistantParameter/ListDigitalAssistantParameters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDigitalAssistantParametersRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .appendPathParam("parameters")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistantParameterCollection.class,
                        ListDigitalAssistantParametersResponse.Builder
                                ::digitalAssistantParameterCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDigitalAssistantParametersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDigitalAssistantParametersResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items",
                        ListDigitalAssistantParametersResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDigitalAssistantsResponse> listDigitalAssistants(
            ListDigitalAssistantsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDigitalAssistantsRequest, ListDigitalAssistantsResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, ListDigitalAssistantsResponse::builder)
                .logger(LOG, "listDigitalAssistants")
                .serviceDetails(
                        "Management",
                        "ListDigitalAssistants",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/ListDigitalAssistants")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDigitalAssistantsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendQueryParam("digitalAssistantId", request.getDigitalAssistantId())
                .appendQueryParam("category", request.getCategory())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("version", request.getVersion())
                .appendQueryParam("namespace", request.getNamespace())
                .appendQueryParam("platformVersion", request.getPlatformVersion())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("lifecycleDetails", request.getLifecycleDetails())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistantCollection.class,
                        ListDigitalAssistantsResponse.Builder::digitalAssistantCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDigitalAssistantsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDigitalAssistantsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListDigitalAssistantsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSkillParametersResponse> listSkillParameters(
            ListSkillParametersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListSkillParametersRequest, ListSkillParametersResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        return clientCall(request, ListSkillParametersResponse::builder)
                .logger(LOG, "listSkillParameters")
                .serviceDetails(
                        "Management",
                        "ListSkillParameters",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/ListSkillParameters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSkillParametersRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("parameters")
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.SkillParameterCollection.class,
                        ListSkillParametersResponse.Builder::skillParameterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSkillParametersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSkillParametersResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListSkillParametersResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListSkillsResponse> listSkills(
            ListSkillsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListSkillsRequest, ListSkillsResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, ListSkillsResponse::builder)
                .logger(LOG, "listSkills")
                .serviceDetails(
                        "Management",
                        "ListSkills",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/ListSkills")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListSkillsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendQueryParam("skillId", request.getSkillId())
                .appendQueryParam("category", request.getCategory())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("version", request.getVersion())
                .appendQueryParam("namespace", request.getNamespace())
                .appendQueryParam("platformVersion", request.getPlatformVersion())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("lifecycleDetails", request.getLifecycleDetails())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.SkillCollection.class,
                        ListSkillsResponse.Builder::skillCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListSkillsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListSkillsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListSkillsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTranslatorsResponse> listTranslators(
            ListTranslatorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListTranslatorsRequest, ListTranslatorsResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, ListTranslatorsResponse::builder)
                .logger(LOG, "listTranslators")
                .serviceDetails(
                        "Management",
                        "ListTranslators",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/ListTranslators")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTranslatorsRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("translators")
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("type", request.getType())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.TranslatorCollection.class,
                        ListTranslatorsResponse.Builder::translatorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTranslatorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTranslatorsResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListTranslatorsResponse.Builder::opcTotalItems)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PublishDigitalAssistantResponse> publishDigitalAssistant(
            PublishDigitalAssistantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PublishDigitalAssistantRequest, PublishDigitalAssistantResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");

        return clientCall(request, PublishDigitalAssistantResponse::builder)
                .logger(LOG, "publishDigitalAssistant")
                .serviceDetails(
                        "Management",
                        "PublishDigitalAssistant",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/PublishDigitalAssistant")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PublishDigitalAssistantRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .appendPathParam("actions")
                .appendPathParam("publish")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistant.class,
                        PublishDigitalAssistantResponse.Builder::digitalAssistant)
                .handleResponseHeaderString("etag", PublishDigitalAssistantResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", PublishDigitalAssistantResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PublishSkillResponse> publishSkill(
            PublishSkillRequest request,
            final com.oracle.bmc.responses.AsyncHandler<PublishSkillRequest, PublishSkillResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        return clientCall(request, PublishSkillResponse::builder)
                .logger(LOG, "publishSkill")
                .serviceDetails(
                        "Management",
                        "PublishSkill",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/PublishSkill")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(PublishSkillRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("actions")
                .appendPathParam("publish")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.oda.model.Skill.class, PublishSkillResponse.Builder::skill)
                .handleResponseHeaderString("etag", PublishSkillResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", PublishSkillResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RotateChannelKeysResponse> rotateChannelKeys(
            RotateChannelKeysRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RotateChannelKeysRequest, RotateChannelKeysResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, RotateChannelKeysResponse::builder)
                .logger(LOG, "rotateChannelKeys")
                .serviceDetails(
                        "Management",
                        "RotateChannelKeys",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/RotateChannelKeys")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateChannelKeysRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .appendPathParam("actions")
                .appendPathParam("rotateKeys")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.oda.model.CreateChannelResult.class,
                        RotateChannelKeysResponse.Builder::createChannelResult)
                .handleResponseHeaderString("etag", RotateChannelKeysResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RotateChannelKeysResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StartChannelResponse> startChannel(
            StartChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StartChannelRequest, StartChannelResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, StartChannelResponse::builder)
                .logger(LOG, "startChannel")
                .serviceDetails(
                        "Management",
                        "StartChannel",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/StartChannel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartChannelRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.oda.model.Channel.class,
                        StartChannelResponse.Builder::channel)
                .handleResponseHeaderString("etag", StartChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StartChannelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<StopChannelResponse> stopChannel(
            StopChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<StopChannelRequest, StopChannelResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");

        return clientCall(request, StopChannelResponse::builder)
                .logger(LOG, "stopChannel")
                .serviceDetails(
                        "Management",
                        "StopChannel",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/StopChannel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopChannelRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.oda.model.Channel.class,
                        StopChannelResponse.Builder::channel)
                .handleResponseHeaderString("etag", StopChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StopChannelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAuthenticationProviderResponse>
            updateAuthenticationProvider(
                    UpdateAuthenticationProviderRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAuthenticationProviderRequest,
                                    UpdateAuthenticationProviderResponse>
                            handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(
                request.getAuthenticationProviderId(),
                "authenticationProviderId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAuthenticationProviderDetails(),
                "updateAuthenticationProviderDetails is required");

        return clientCall(request, UpdateAuthenticationProviderResponse::builder)
                .logger(LOG, "updateAuthenticationProvider")
                .serviceDetails(
                        "Management",
                        "UpdateAuthenticationProvider",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/AuthenticationProvider/UpdateAuthenticationProvider")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAuthenticationProviderRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("authenticationProviders")
                .appendPathParam(request.getAuthenticationProviderId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.AuthenticationProvider.class,
                        UpdateAuthenticationProviderResponse.Builder::authenticationProvider)
                .handleResponseHeaderString(
                        "etag", UpdateAuthenticationProviderResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAuthenticationProviderResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateChannelResponse> updateChannel(
            UpdateChannelRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateChannelRequest, UpdateChannelResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getChannelId(), "channelId must not be blank");
        Objects.requireNonNull(
                request.getUpdateChannelDetails(), "updateChannelDetails is required");

        return clientCall(request, UpdateChannelResponse::builder)
                .logger(LOG, "updateChannel")
                .serviceDetails(
                        "Management",
                        "UpdateChannel",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Channel/UpdateChannel")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateChannelRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("channels")
                .appendPathParam(request.getChannelId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.Channel.class,
                        UpdateChannelResponse.Builder::channel)
                .handleResponseHeaderString("etag", UpdateChannelResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateChannelResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDigitalAssistantResponse> updateDigitalAssistant(
            UpdateDigitalAssistantRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDigitalAssistantRequest, UpdateDigitalAssistantResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDigitalAssistantDetails(),
                "updateDigitalAssistantDetails is required");

        return clientCall(request, UpdateDigitalAssistantResponse::builder)
                .logger(LOG, "updateDigitalAssistant")
                .serviceDetails(
                        "Management",
                        "UpdateDigitalAssistant",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistant/UpdateDigitalAssistant")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDigitalAssistantRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistant.class,
                        UpdateDigitalAssistantResponse.Builder::digitalAssistant)
                .handleResponseHeaderString("etag", UpdateDigitalAssistantResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDigitalAssistantResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDigitalAssistantParameterResponse>
            updateDigitalAssistantParameter(
                    UpdateDigitalAssistantParameterRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDigitalAssistantParameterRequest,
                                    UpdateDigitalAssistantParameterResponse>
                            handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getDigitalAssistantId(), "digitalAssistantId must not be blank");

        Validate.notBlank(request.getParameterName(), "parameterName must not be blank");
        Objects.requireNonNull(
                request.getUpdateDigitalAssistantParameterDetails(),
                "updateDigitalAssistantParameterDetails is required");

        return clientCall(request, UpdateDigitalAssistantParameterResponse::builder)
                .logger(LOG, "updateDigitalAssistantParameter")
                .serviceDetails(
                        "Management",
                        "UpdateDigitalAssistantParameter",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/DigitalAssistantParameter/UpdateDigitalAssistantParameter")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDigitalAssistantParameterRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("digitalAssistants")
                .appendPathParam(request.getDigitalAssistantId())
                .appendPathParam("parameters")
                .appendPathParam(request.getParameterName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.DigitalAssistantParameter.class,
                        UpdateDigitalAssistantParameterResponse.Builder::digitalAssistantParameter)
                .handleResponseHeaderString(
                        "etag", UpdateDigitalAssistantParameterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateDigitalAssistantParameterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSkillResponse> updateSkill(
            UpdateSkillRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateSkillRequest, UpdateSkillResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");
        Objects.requireNonNull(request.getUpdateSkillDetails(), "updateSkillDetails is required");

        return clientCall(request, UpdateSkillResponse::builder)
                .logger(LOG, "updateSkill")
                .serviceDetails(
                        "Management",
                        "UpdateSkill",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Skill/UpdateSkill")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSkillRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.Skill.class, UpdateSkillResponse.Builder::skill)
                .handleResponseHeaderString("etag", UpdateSkillResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSkillResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateSkillParameterResponse> updateSkillParameter(
            UpdateSkillParameterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateSkillParameterRequest, UpdateSkillParameterResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getSkillId(), "skillId must not be blank");

        Validate.notBlank(request.getParameterName(), "parameterName must not be blank");
        Objects.requireNonNull(
                request.getUpdateSkillParameterDetails(),
                "updateSkillParameterDetails is required");

        return clientCall(request, UpdateSkillParameterResponse::builder)
                .logger(LOG, "updateSkillParameter")
                .serviceDetails(
                        "Management",
                        "UpdateSkillParameter",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/SkillParameter/UpdateSkillParameter")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateSkillParameterRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("skills")
                .appendPathParam(request.getSkillId())
                .appendPathParam("parameters")
                .appendPathParam(request.getParameterName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.SkillParameter.class,
                        UpdateSkillParameterResponse.Builder::skillParameter)
                .handleResponseHeaderString("etag", UpdateSkillParameterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateSkillParameterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTranslatorResponse> updateTranslator(
            UpdateTranslatorRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateTranslatorRequest, UpdateTranslatorResponse>
                    handler) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getTranslatorId(), "translatorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTranslatorDetails(), "updateTranslatorDetails is required");

        return clientCall(request, UpdateTranslatorResponse::builder)
                .logger(LOG, "updateTranslator")
                .serviceDetails(
                        "Management",
                        "UpdateTranslator",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/Translator/UpdateTranslator")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTranslatorRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("translators")
                .appendPathParam(request.getTranslatorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.Translator.class,
                        UpdateTranslatorResponse.Builder::translator)
                .handleResponseHeaderString("etag", UpdateTranslatorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTranslatorResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagementAsyncClient(
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
    public ManagementAsyncClient(
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
    public ManagementAsyncClient(
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
    public ManagementAsyncClient(
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
    public ManagementAsyncClient(
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
    public ManagementAsyncClient(
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
    public ManagementAsyncClient(
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
