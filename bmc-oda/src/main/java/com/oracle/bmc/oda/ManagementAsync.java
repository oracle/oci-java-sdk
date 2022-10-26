/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;

/** API to create and maintain Oracle Digital Assistant service instances. */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public interface ManagementAsync extends AutoCloseable {

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
     * This will store the provided parameters in the Digital Assistant instance and update any
     * Digital Assistants with matching parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ConfigureDigitalAssistantParametersResponse>
            configureDigitalAssistantParameters(
                    ConfigureDigitalAssistantParametersRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ConfigureDigitalAssistantParametersRequest,
                                    ConfigureDigitalAssistantParametersResponse>
                            handler);

    /**
     * Creates a new Authentication Provider
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateAuthenticationProviderResponse> createAuthenticationProvider(
            CreateAuthenticationProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAuthenticationProviderRequest,
                            CreateAuthenticationProviderResponse>
                    handler);

    /**
     * Creates a new Channel.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateChannelResponse> createChannel(
            CreateChannelRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateChannelRequest, CreateChannelResponse>
                    handler);

    /**
     * Creates a new Digital Assistant.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDigitalAssistantResponse> createDigitalAssistant(
            CreateDigitalAssistantRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDigitalAssistantRequest, CreateDigitalAssistantResponse>
                    handler);

    /**
     * Creates a new Skill from scratch.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSkillResponse> createSkill(
            CreateSkillRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateSkillRequest, CreateSkillResponse> handler);

    /**
     * Creates a new Skill Parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSkillParameterResponse> createSkillParameter(
            CreateSkillParameterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSkillParameterRequest, CreateSkillParameterResponse>
                    handler);

    /**
     * Creates a new Translator
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTranslatorResponse> createTranslator(
            CreateTranslatorRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTranslatorRequest, CreateTranslatorResponse>
                    handler);

    /**
     * Delete the specified Authentication Provider.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAuthenticationProviderResponse> deleteAuthenticationProvider(
            DeleteAuthenticationProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAuthenticationProviderRequest,
                            DeleteAuthenticationProviderResponse>
                    handler);

    /**
     * Delete the specified Channel.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteChannelResponse> deleteChannel(
            DeleteChannelRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteChannelRequest, DeleteChannelResponse>
                    handler);

    /**
     * Delete the specified Digital Assistant.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDigitalAssistantResponse> deleteDigitalAssistant(
            DeleteDigitalAssistantRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDigitalAssistantRequest, DeleteDigitalAssistantResponse>
                    handler);

    /**
     * Delete the specified Skill.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSkillResponse> deleteSkill(
            DeleteSkillRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteSkillRequest, DeleteSkillResponse> handler);

    /**
     * Delete the specified Skill Parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSkillParameterResponse> deleteSkillParameter(
            DeleteSkillParameterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSkillParameterRequest, DeleteSkillParameterResponse>
                    handler);

    /**
     * Delete the specified Translator.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTranslatorResponse> deleteTranslator(
            DeleteTranslatorRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTranslatorRequest, DeleteTranslatorResponse>
                    handler);

    /**
     * Exports the specified Digital Assistant as an archive to Object Storage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ExportDigitalAssistantResponse> exportDigitalAssistant(
            ExportDigitalAssistantRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExportDigitalAssistantRequest, ExportDigitalAssistantResponse>
                    handler);

    /**
     * Exports the specified Skill as an archive to Object Storage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ExportSkillResponse> exportSkill(
            ExportSkillRequest request,
            com.oracle.bmc.responses.AsyncHandler<ExportSkillRequest, ExportSkillResponse> handler);

    /**
     * Gets the specified Authentication Provider.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAuthenticationProviderResponse> getAuthenticationProvider(
            GetAuthenticationProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAuthenticationProviderRequest, GetAuthenticationProviderResponse>
                    handler);

    /**
     * Gets the specified Channel.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetChannelResponse> getChannel(
            GetChannelRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetChannelRequest, GetChannelResponse> handler);

    /**
     * Gets the specified Digital Assistant.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDigitalAssistantResponse> getDigitalAssistant(
            GetDigitalAssistantRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalAssistantRequest, GetDigitalAssistantResponse>
                    handler);

    /**
     * Gets the specified Digital Assistant Parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDigitalAssistantParameterResponse> getDigitalAssistantParameter(
            GetDigitalAssistantParameterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDigitalAssistantParameterRequest,
                            GetDigitalAssistantParameterResponse>
                    handler);

    /**
     * Gets the specified Skill.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSkillResponse> getSkill(
            GetSkillRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSkillRequest, GetSkillResponse> handler);

    /**
     * Gets the specified Skill Parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSkillParameterResponse> getSkillParameter(
            GetSkillParameterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSkillParameterRequest, GetSkillParameterResponse>
                    handler);

    /**
     * Gets the specified Translator.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTranslatorResponse> getTranslator(
            GetTranslatorRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTranslatorRequest, GetTranslatorResponse>
                    handler);

    /**
     * Import a Bot archive from Object Storage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ImportBotResponse> importBot(
            ImportBotRequest request,
            com.oracle.bmc.responses.AsyncHandler<ImportBotRequest, ImportBotResponse> handler);

    /**
     * Returns a page of Authentication Providers that belong to the specified Digital Assistant
     * instance.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAuthenticationProvidersResponse> listAuthenticationProviders(
            ListAuthenticationProvidersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAuthenticationProvidersRequest, ListAuthenticationProvidersResponse>
                    handler);

    /**
     * Returns a page of Channels that belong to the specified Digital Assistant instance.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListChannelsResponse> listChannels(
            ListChannelsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListChannelsRequest, ListChannelsResponse>
                    handler);

    /**
     * Returns a page of Parameters that belong to the specified Digital Assistant.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDigitalAssistantParametersResponse>
            listDigitalAssistantParameters(
                    ListDigitalAssistantParametersRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDigitalAssistantParametersRequest,
                                    ListDigitalAssistantParametersResponse>
                            handler);

    /**
     * Returns a page of Digital Assistants that belong to the specified Digital Assistant instance.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDigitalAssistantsResponse> listDigitalAssistants(
            ListDigitalAssistantsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDigitalAssistantsRequest, ListDigitalAssistantsResponse>
                    handler);

    /**
     * Returns a page of Skill Parameters that belong to the specified Skill.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSkillParametersResponse> listSkillParameters(
            ListSkillParametersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSkillParametersRequest, ListSkillParametersResponse>
                    handler);

    /**
     * Returns a page of Skills that belong to the specified Digital Assistant instance.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSkillsResponse> listSkills(
            ListSkillsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSkillsRequest, ListSkillsResponse> handler);

    /**
     * Returns a page of Translators that belong to the specified Digital Assistant instance.
     *
     * <p>If the `opc-next-page` header appears in the response, then there are more items to
     * retrieve. To get the next page in the subsequent GET request, include the header's value as
     * the `page` query parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTranslatorsResponse> listTranslators(
            ListTranslatorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTranslatorsRequest, ListTranslatorsResponse>
                    handler);

    /**
     * Publish a draft Digital Assistant. Once published the Digital Assistant cannot be modified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PublishDigitalAssistantResponse> publishDigitalAssistant(
            PublishDigitalAssistantRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PublishDigitalAssistantRequest, PublishDigitalAssistantResponse>
                    handler);

    /**
     * Publish a draft Skill. Once published it cannot be modified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PublishSkillResponse> publishSkill(
            PublishSkillRequest request,
            com.oracle.bmc.responses.AsyncHandler<PublishSkillRequest, PublishSkillResponse>
                    handler);

    /**
     * This will generate new keys for any generated keys in the Channel (eg. secretKey,
     * verifyToken). If a Channel has no generated keys then no changes will be made. Ensure that
     * you take note of the newly generated keys in the response as they will not be returned again.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RotateChannelKeysResponse> rotateChannelKeys(
            RotateChannelKeysRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RotateChannelKeysRequest, RotateChannelKeysResponse>
                    handler);

    /**
     * Starts a Channel so that it will begin accepting messages.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StartChannelResponse> startChannel(
            StartChannelRequest request,
            com.oracle.bmc.responses.AsyncHandler<StartChannelRequest, StartChannelResponse>
                    handler);

    /**
     * Stops a Channel so that it will no longer accept messages.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopChannelResponse> stopChannel(
            StopChannelRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopChannelRequest, StopChannelResponse> handler);

    /**
     * Updates the specified Authentication Provider with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAuthenticationProviderResponse> updateAuthenticationProvider(
            UpdateAuthenticationProviderRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAuthenticationProviderRequest,
                            UpdateAuthenticationProviderResponse>
                    handler);

    /**
     * Updates the specified Channel with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateChannelResponse> updateChannel(
            UpdateChannelRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateChannelRequest, UpdateChannelResponse>
                    handler);

    /**
     * Updates the specified Digital Assistant with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDigitalAssistantResponse> updateDigitalAssistant(
            UpdateDigitalAssistantRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDigitalAssistantRequest, UpdateDigitalAssistantResponse>
                    handler);

    /**
     * Updates the specified Digital Assistant Parameter with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDigitalAssistantParameterResponse>
            updateDigitalAssistantParameter(
                    UpdateDigitalAssistantParameterRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDigitalAssistantParameterRequest,
                                    UpdateDigitalAssistantParameterResponse>
                            handler);

    /**
     * Updates the specified Skill with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSkillResponse> updateSkill(
            UpdateSkillRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateSkillRequest, UpdateSkillResponse> handler);

    /**
     * Updates the specified Skill Parameter with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSkillParameterResponse> updateSkillParameter(
            UpdateSkillParameterRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSkillParameterRequest, UpdateSkillParameterResponse>
                    handler);

    /**
     * Updates the specified Translator with the information in the request body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTranslatorResponse> updateTranslator(
            UpdateTranslatorRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTranslatorRequest, UpdateTranslatorResponse>
                    handler);
}
