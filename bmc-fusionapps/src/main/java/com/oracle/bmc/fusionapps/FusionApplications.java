/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps;

import com.oracle.bmc.fusionapps.requests.*;
import com.oracle.bmc.fusionapps.responses.*;

/**
 * Use the Fusion Applications Environment Management API to manage the environments where your Fusion Applications run. For more information, see the [Fusion Applications Environment Management documentation](https://docs.oracle.com/iaas/Content/fusion-applications/home.htm).
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public interface FusionApplications extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Moves a FusionEnvironment into a different compartment. When provided, If-Match is checked against ETag
     * values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ChangeFusionEnvironmentCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeFusionEnvironmentCompartment API.
     */
    ChangeFusionEnvironmentCompartmentResponse changeFusionEnvironmentCompartment(
            ChangeFusionEnvironmentCompartmentRequest request);

    /**
     * Moves a FusionEnvironmentFamily into a different compartment. When provided, If-Match is checked against ETag
     * values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ChangeFusionEnvironmentFamilyCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeFusionEnvironmentFamilyCompartment API.
     */
    ChangeFusionEnvironmentFamilyCompartmentResponse changeFusionEnvironmentFamilyCompartment(
            ChangeFusionEnvironmentFamilyCompartmentRequest request);

    /**
     * Creates a new DataMaskingActivity.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/CreateDataMaskingActivityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDataMaskingActivity API.
     */
    CreateDataMaskingActivityResponse createDataMaskingActivity(
            CreateDataMaskingActivityRequest request);

    /**
     * Creates an email Subdomain for a brand
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/CreateEmailSubdomainExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateEmailSubdomain API.
     */
    CreateEmailSubdomainResponse createEmailSubdomain(CreateEmailSubdomainRequest request);

    /**
     * Creates a new FusionEnvironment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/CreateFusionEnvironmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateFusionEnvironment API.
     */
    CreateFusionEnvironmentResponse createFusionEnvironment(CreateFusionEnvironmentRequest request);

    /**
     * Create a FusionEnvironment admin user
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/CreateFusionEnvironmentAdminUserExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateFusionEnvironmentAdminUser API.
     */
    CreateFusionEnvironmentAdminUserResponse createFusionEnvironmentAdminUser(
            CreateFusionEnvironmentAdminUserRequest request);

    /**
     * Creates a new FusionEnvironmentFamily.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/CreateFusionEnvironmentFamilyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateFusionEnvironmentFamily API.
     */
    CreateFusionEnvironmentFamilyResponse createFusionEnvironmentFamily(
            CreateFusionEnvironmentFamilyRequest request);

    /**
     * Creates a marketing brand for fusion environment
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/CreateMarketingBrandExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateMarketingBrand API.
     */
    CreateMarketingBrandResponse createMarketingBrand(CreateMarketingBrandRequest request);

    /**
     * Creates a microsite for brand
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/CreateMicrositeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateMicrosite API.
     */
    CreateMicrositeResponse createMicrosite(CreateMicrositeRequest request);

    /**
     * Creates a new RefreshActivity.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/CreateRefreshActivityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateRefreshActivity API.
     */
    CreateRefreshActivityResponse createRefreshActivity(CreateRefreshActivityRequest request);

    /**
     * Attaches a service instance to the fusion pod.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/CreateServiceAttachmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateServiceAttachment API.
     */
    CreateServiceAttachmentResponse createServiceAttachment(CreateServiceAttachmentRequest request);

    /**
     * Create a VanityDomain
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/CreateVanityDomainExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVanityDomain API.
     */
    CreateVanityDomainResponse createVanityDomain(CreateVanityDomainRequest request);

    /**
     * Create a VanityDomainActivity
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/CreateVanityDomainActivityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVanityDomainActivity API.
     */
    CreateVanityDomainActivityResponse createVanityDomainActivity(
            CreateVanityDomainActivityRequest request);

    /**
     * Delete an email subdomain for a brand
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/DeleteEmailSubdomainExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteEmailSubdomain API.
     */
    DeleteEmailSubdomainResponse deleteEmailSubdomain(DeleteEmailSubdomainRequest request);

    /**
     * Deletes the Fusion environment identified by it's OCID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/DeleteFusionEnvironmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFusionEnvironment API.
     */
    DeleteFusionEnvironmentResponse deleteFusionEnvironment(DeleteFusionEnvironmentRequest request);

    /**
     * Deletes the FusionEnvironment administrator user identified by the username.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/DeleteFusionEnvironmentAdminUserExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFusionEnvironmentAdminUser API.
     */
    DeleteFusionEnvironmentAdminUserResponse deleteFusionEnvironmentAdminUser(
            DeleteFusionEnvironmentAdminUserRequest request);

    /**
     * Deletes a FusionEnvironmentFamily resource by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/DeleteFusionEnvironmentFamilyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFusionEnvironmentFamily API.
     */
    DeleteFusionEnvironmentFamilyResponse deleteFusionEnvironmentFamily(
            DeleteFusionEnvironmentFamilyRequest request);

    /**
     * Deletes a Marketing brand for fusion Environment
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/DeleteMarketingBrandExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMarketingBrand API.
     */
    DeleteMarketingBrandResponse deleteMarketingBrand(DeleteMarketingBrandRequest request);

    /**
     * Delete microsite for a brand
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/DeleteMicrositeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMicrosite API.
     */
    DeleteMicrositeResponse deleteMicrosite(DeleteMicrositeRequest request);

    /**
     * Deletes a scheduled RefreshActivity resource by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/DeleteRefreshActivityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteRefreshActivity API.
     */
    DeleteRefreshActivityResponse deleteRefreshActivity(DeleteRefreshActivityRequest request);

    /**
     * Delete a service attachment by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/DeleteServiceAttachmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteServiceAttachment API.
     */
    DeleteServiceAttachmentResponse deleteServiceAttachment(DeleteServiceAttachmentRequest request);

    /**
     * Deletes a VanityDomainActivity
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/DeleteVanityDomainActivityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVanityDomainActivity API.
     */
    DeleteVanityDomainActivityResponse deleteVanityDomainActivity(
            DeleteVanityDomainActivityRequest request);

    /**
     * Begin the process of showing the details about where to retrieve data extract for a Fusion environment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GenerateExtractDetailsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GenerateExtractDetails API.
     */
    GenerateExtractDetailsResponse generateExtractDetails(GenerateExtractDetailsRequest request);

    /**
     * Gets a DataMaskingActivity by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetDataMaskingActivityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataMaskingActivity API.
     */
    GetDataMaskingActivityResponse getDataMaskingActivity(GetDataMaskingActivityRequest request);

    /**
     * Gets an email subdomain for the brand
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetEmailSubdomainExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetEmailSubdomain API.
     */
    GetEmailSubdomainResponse getEmailSubdomain(GetEmailSubdomainRequest request);

    /**
     * Gets a CSR for email subdomain for a brand
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetEmailSubdomainCsrExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetEmailSubdomainCsr API.
     */
    GetEmailSubdomainCsrResponse getEmailSubdomainCsr(GetEmailSubdomainCsrRequest request);

    /**
     * Get all DNS records for emailSubdomain
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetEmailSubdomainDnsConfigExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetEmailSubdomainDnsConfig API.
     */
    GetEmailSubdomainDnsConfigResponse getEmailSubdomainDnsConfig(
            GetEmailSubdomainDnsConfigRequest request);

    /**
     * Gets a FusionEnvironment by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetFusionEnvironmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFusionEnvironment API.
     */
    GetFusionEnvironmentResponse getFusionEnvironment(GetFusionEnvironmentRequest request);

    /**
     * Retrieves a fusion environment family identified by its OCID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetFusionEnvironmentFamilyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFusionEnvironmentFamily API.
     */
    GetFusionEnvironmentFamilyResponse getFusionEnvironmentFamily(
            GetFusionEnvironmentFamilyRequest request);

    /**
     * Gets the number of environments (usage) of each type in the fusion environment family, as well as the limit that's allowed to be created based on the group's associated subscriptions.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetFusionEnvironmentFamilyLimitsAndUsageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFusionEnvironmentFamilyLimitsAndUsage API.
     */
    GetFusionEnvironmentFamilyLimitsAndUsageResponse getFusionEnvironmentFamilyLimitsAndUsage(
            GetFusionEnvironmentFamilyLimitsAndUsageRequest request);

    /**
     * Gets the subscription details of an fusion environment family.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetFusionEnvironmentFamilySubscriptionDetailExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFusionEnvironmentFamilySubscriptionDetail API.
     */
    GetFusionEnvironmentFamilySubscriptionDetailResponse
            getFusionEnvironmentFamilySubscriptionDetail(
                    GetFusionEnvironmentFamilySubscriptionDetailRequest request);

    /**
     * Gets the status of a Fusion environment identified by its OCID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetFusionEnvironmentStatusExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFusionEnvironmentStatus API.
     */
    GetFusionEnvironmentStatusResponse getFusionEnvironmentStatus(
            GetFusionEnvironmentStatusRequest request);

    /**
     * Gets a Marketing Brand by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetMarketingBrandExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMarketingBrand API.
     */
    GetMarketingBrandResponse getMarketingBrand(GetMarketingBrandRequest request);

    /**
     * Get the microsite for the brand
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetMicrositeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMicrosite API.
     */
    GetMicrositeResponse getMicrosite(GetMicrositeRequest request);

    /**
     * Get DNS records for microsite
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetMicrositeDnsConfigExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMicrositeDnsConfig API.
     */
    GetMicrositeDnsConfigResponse getMicrositeDnsConfig(GetMicrositeDnsConfigRequest request);

    /**
     * Gets a RefreshActivity by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetRefreshActivityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetRefreshActivity API.
     */
    GetRefreshActivityResponse getRefreshActivity(GetRefreshActivityRequest request);

    /**
     * Gets a ScheduledActivity by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetScheduledActivityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetScheduledActivity API.
     */
    GetScheduledActivityResponse getScheduledActivity(GetScheduledActivityRequest request);

    /**
     * Gets a Service Attachment by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetServiceAttachmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetServiceAttachment API.
     */
    GetServiceAttachmentResponse getServiceAttachment(GetServiceAttachmentRequest request);

    /**
     * Gets a VanityDomain
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetVanityDomainExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVanityDomain API.
     */
    GetVanityDomainResponse getVanityDomain(GetVanityDomainRequest request);

    /**
     * Gets a VanityDomainActivity
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetVanityDomainActivityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVanityDomainActivity API.
     */
    GetVanityDomainActivityResponse getVanityDomainActivity(GetVanityDomainActivityRequest request);

    /**
     * Gets the status of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Begin the process of generating the data extract for a Fusion environment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/InitiateExtractExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use InitiateExtract API.
     */
    InitiateExtractResponse initiateExtract(InitiateExtractRequest request);

    /**
     * List all FusionEnvironment admin users
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListAdminUsersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAdminUsers API.
     */
    ListAdminUsersResponse listAdminUsers(ListAdminUsersRequest request);

    /**
     * Returns a list of DataMaskingActivities.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListDataMaskingActivitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDataMaskingActivities API.
     */
    ListDataMaskingActivitiesResponse listDataMaskingActivities(
            ListDataMaskingActivitiesRequest request);

    /**
     * Returns a list of email subdomains for a brand
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListEmailSubdomainsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListEmailSubdomains API.
     */
    ListEmailSubdomainsResponse listEmailSubdomains(ListEmailSubdomainsRequest request);

    /**
     * Returns a list of FusionEnvironmentFamilies.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListFusionEnvironmentFamiliesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFusionEnvironmentFamilies API.
     */
    ListFusionEnvironmentFamiliesResponse listFusionEnvironmentFamilies(
            ListFusionEnvironmentFamiliesRequest request);

    /**
     * Returns a list of FusionEnvironments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListFusionEnvironmentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFusionEnvironments API.
     */
    ListFusionEnvironmentsResponse listFusionEnvironments(ListFusionEnvironmentsRequest request);

    /**
     * Returns a list of marketing brands
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListMarketingBrandsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMarketingBrands API.
     */
    ListMarketingBrandsResponse listMarketingBrands(ListMarketingBrandsRequest request);

    /**
     * Returns a list of microsites
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListMicrositesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMicrosites API.
     */
    ListMicrositesResponse listMicrosites(ListMicrositesRequest request);

    /**
     * Returns a list of RefreshActivities.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListRefreshActivitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRefreshActivities API.
     */
    ListRefreshActivitiesResponse listRefreshActivities(ListRefreshActivitiesRequest request);

    /**
     * Returns a list of ScheduledActivities.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListScheduledActivitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListScheduledActivities API.
     */
    ListScheduledActivitiesResponse listScheduledActivities(ListScheduledActivitiesRequest request);

    /**
     * Returns a list of service attachments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListServiceAttachmentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListServiceAttachments API.
     */
    ListServiceAttachmentsResponse listServiceAttachments(ListServiceAttachmentsRequest request);

    /**
     * Gets available refresh time for this fusion environment
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListTimeAvailableForRefreshesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTimeAvailableForRefreshes API.
     */
    ListTimeAvailableForRefreshesResponse listTimeAvailableForRefreshes(
            ListTimeAvailableForRefreshesRequest request);

    /**
     * Lists all VanityDomains.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListVanityDomainsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVanityDomains API.
     */
    ListVanityDomainsResponse listVanityDomains(ListVanityDomainsRequest request);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Request Email Subdomain CSR
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/RequestEmailSubdomainCsrExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RequestEmailSubdomainCsr API.
     */
    RequestEmailSubdomainCsrResponse requestEmailSubdomainCsr(
            RequestEmailSubdomainCsrRequest request);

    /**
     * Reset FusionEnvironment admin password. This API will be deprecated on Mon, 15 Jan 2024 01:00:00 GMT. Users can reset password themselves, FAaaS will no longer provide an API for this.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ResetFusionEnvironmentPasswordExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ResetFusionEnvironmentPassword API.
     */
    ResetFusionEnvironmentPasswordResponse resetFusionEnvironmentPassword(
            ResetFusionEnvironmentPasswordRequest request);

    /**
     * Submit Vanity Domain Validation
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/SubmitVanityDomainValidationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SubmitVanityDomainValidation API.
     */
    SubmitVanityDomainValidationResponse submitVanityDomainValidation(
            SubmitVanityDomainValidationRequest request);

    /**
     * Updates an email subdomain
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UpdateEmailSubdomainExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateEmailSubdomain API.
     */
    UpdateEmailSubdomainResponse updateEmailSubdomain(UpdateEmailSubdomainRequest request);

    /**
     * Updates the FusionEnvironment
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UpdateFusionEnvironmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateFusionEnvironment API.
     */
    UpdateFusionEnvironmentResponse updateFusionEnvironment(UpdateFusionEnvironmentRequest request);

    /**
     * Updates the FusionEnvironmentFamily
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UpdateFusionEnvironmentFamilyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateFusionEnvironmentFamily API.
     */
    UpdateFusionEnvironmentFamilyResponse updateFusionEnvironmentFamily(
            UpdateFusionEnvironmentFamilyRequest request);

    /**
     * Updates a Marketing Brand
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UpdateMarketingBrandExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateMarketingBrand API.
     */
    UpdateMarketingBrandResponse updateMarketingBrand(UpdateMarketingBrandRequest request);

    /**
     * Updates an microsite
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UpdateMicrositeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateMicrosite API.
     */
    UpdateMicrositeResponse updateMicrosite(UpdateMicrositeRequest request);

    /**
     * Updates a scheduled RefreshActivity.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UpdateRefreshActivityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateRefreshActivity API.
     */
    UpdateRefreshActivityResponse updateRefreshActivity(UpdateRefreshActivityRequest request);

    /**
     * Updates a VanityDomain
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UpdateVanityDomainExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVanityDomain API.
     */
    UpdateVanityDomainResponse updateVanityDomain(UpdateVanityDomainRequest request);

    /**
     * Updates a VanityDomainActivity
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UpdateVanityDomainActivityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVanityDomainActivity API.
     */
    UpdateVanityDomainActivityResponse updateVanityDomainActivity(
            UpdateVanityDomainActivityRequest request);

    /**
     * upload certificate for emailSubdomain
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UploadEmailSubdomainCertificateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UploadEmailSubdomainCertificate API.
     */
    UploadEmailSubdomainCertificateResponse uploadEmailSubdomainCertificate(
            UploadEmailSubdomainCertificateRequest request);

    /**
     * Upload Vanity Domain certificate
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/UploadVanityDomainCertificateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UploadVanityDomainCertificate API.
     */
    UploadVanityDomainCertificateResponse uploadVanityDomainCertificate(
            UploadVanityDomainCertificateRequest request);

    /**
     * Validate and configure certificate for emailSubdomain
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ValidateAndConfigureEmailSubdomainCertificateExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ValidateAndConfigureEmailSubdomainCertificate API.
     */
    ValidateAndConfigureEmailSubdomainCertificateResponse
            validateAndConfigureEmailSubdomainCertificate(
                    ValidateAndConfigureEmailSubdomainCertificateRequest request);

    /**
     * Validate and configure DNS records for emailSubdomain
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ValidateAndConfigureEmailSubdomainDnsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ValidateAndConfigureEmailSubdomainDns API.
     */
    ValidateAndConfigureEmailSubdomainDnsResponse validateAndConfigureEmailSubdomainDns(
            ValidateAndConfigureEmailSubdomainDnsRequest request);

    /**
     * Validate and configure DNS records for microsite
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/ValidateAndConfigureMicrositeDnsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ValidateAndConfigureMicrositeDns API.
     */
    ValidateAndConfigureMicrositeDnsResponse validateAndConfigureMicrositeDns(
            ValidateAndConfigureMicrositeDnsRequest request);

    /**
     * Verify whether a service instance can be attached to the fusion pod
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/VerifyServiceAttachmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use VerifyServiceAttachment API.
     */
    VerifyServiceAttachmentResponse verifyServiceAttachment(VerifyServiceAttachmentRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    FusionApplicationsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    FusionApplicationsPaginators getPaginators();
}
