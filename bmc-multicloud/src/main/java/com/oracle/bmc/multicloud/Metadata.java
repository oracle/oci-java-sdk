/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud;

import com.oracle.bmc.multicloud.requests.*;
import com.oracle.bmc.multicloud.responses.*;

/**
 * Use the Oracle Multicloud API to retrieve resource anchors and network anchors, and the metadata
 * mappings related a Cloud Service Provider. For more information, see <link to docs>. This service
 * client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no
 * circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public interface Metadata extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
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
     * List externalLocationDetail metadata from OCI to Cloud Service Provider for regions,
     * Availability Zones, and Cluster Placement Group ID. examples: application-json: | [ {
     * \"externalLocation\": { \"cspRegion\": \"East US\", \"cspPhysicalAz\": \"az1-xyz\",
     * \"cspPhysicalAzDisplayName\": \"(US) East US 2\", \"cspLogicalAz\": \"az1\", \"serviceName\":
     * \"ORACLEDBATAZURE\", \"cspZoneKeyReferenceId\": { \"keyName\": \"AzureSubscriptionId or
     * AwsAccountId, GcpProjectName\", \"keyValue\": \"azure-subscriptionId-1 or aws-account-id-1,
     * gcp-project-id-1\" } }, \"ociPhysicalAd\": \"ad1-xyb\", \"ociLogicalAd\": \"ad2\",
     * \"ociRegion\": \"us-ashburn-1\", \"cpgId\": \"cpg-1\" }, { \"externalLocation\": {
     * \"cspRegion\": \"East US\", \"cspPhysicalAz\": \"az2-abc\", \"cspPhysicalAzDisplayName\":
     * \"(US) East US 2\", \"cspLogicalAz\": \"az2\", \"serviceName\": \"ORACLEDBATAZURE\",
     * \"cspZoneKeyReferenceId\": { \"keyName\": \"AzureSubscriptionId or AwsAccountId,
     * GcpProjectName\", \"keyValue\": \"azure-subscriptionId-2 or aws-account-id-2,
     * gcp-project-id-2\" } }, \"ociPhysicalAd\": \"ad2-xby\", \"ociLogicalAd\": \"ad1\",
     * \"ociRegion\": \"us-ashburn-1\", \"cpgId\": \"cpg-2\" }, { \"externalLocation\": {
     * \"cspRegion\": \"East US\", \"cspPhysicalAz\": \"az3-abz\", \"cspPhysicalAzDisplayName\":
     * \"(US) East US 2\", \"cspLogicalAz\": \"az3\", \"serviceName\": \"ORACLEDBATAZURE\",
     * \"cspZoneKeyReferenceId\": { \"keyName\": \"AzureSubscriptionId or AwsAccountId,
     * GcpProjectName\", \"keyValue\": \"azure-subscriptionId-3 or aws-account-id-3,
     * gcp-project-id-3\" } }, \"ociPhysicalAd\": \"ad3-cde\", \"ociLogicalAd\": \"ad3\",
     * \"ociRegion\": \"us-ashburn-1\", \"cpgId\": \"cpg-3\" }, { \"externalLocation\": {
     * \"cspRegion\": \"East US 2\", \"cspPhysicalAz\": \"az1-def\", \"cspPhysicalAzDisplayName\":
     * \"(US) East US 2\", \"cspLogicalAz\": \"az1\", \"serviceName\": \"ORACLEDBATAZURE\",
     * \"cspZoneKeyReferenceId\": { \"keyName\": \"AzureSubscriptionId or AwsAccountId,
     * GcpProjectName\", \"keyValue\": \"azure-subscriptionId-4 or aws-account-id-4,
     * gcp-project-id-4\" } }, \"ociPhysicalAd\": \"ad1-bce\", \"ociLogicalAd\": \"ad2\",
     * \"ociRegion\": \"us-ashburn-1\", \"cpgId\": \"cpg-4\" }, { \"externalLocation\": {
     * \"cspRegion\": \"East US 2\", \"cspPhysicalAz\": \"az2-uvw\", \"cspPhysicalAzDisplayName\":
     * \"(US) East US 2\", \"cspLogicalAz\": \"az2\", \"serviceName\": \"ORACLEDBATAZURE\",
     * \"cspZoneKeyReferenceId\": { \"keyName\": \"AzureSubscriptionId or AwsAccountId,
     * GcpProjectName\", \"keyValue\": \"azure-subscriptionId-3 or aws-account-id-3,
     * gcp-project-id-3\" } }, \"ociPhysicalAd\": \"ad2-ftc\", \"ociLogicalAd\": \"ad1\",
     * \"ociRegion\": \"us-ashburn-1\", \"cpgId\": \"cpg-5\" }, { \"externalLocation\": {
     * \"cspRegion\": \"East US 2\", \"cspPhysicalAz\": \"az3-uvw\", \"cspPhysicalAzDisplayName\":
     * \"(US) East US 2\", \"cspLogicalAz\": \"az3\", \"serviceName\": \"ORACLEDBATAZURE\",
     * \"cspZoneKeyReferenceId\": { \"keyName\": \"AzureSubscriptionId or AwsAccountId,
     * GcpProjectName\", \"keyValue\": \"azure-subscriptionId-3 or aws-account-id-3,
     * gcp-project-id-3\" } }, \"ociPhysicalAd\": \"ad3-stc\", \"ociLogicalAd\": \"ad3\",
     * \"ociRegion\": \"us-ashburn-1\", \"cpgId\": \"cpg-6\" } ]
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/multicloud/ListExternalLocationDetailsMetadataExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListExternalLocationDetailsMetadata API.
     */
    ListExternalLocationDetailsMetadataResponse listExternalLocationDetailsMetadata(
            ListExternalLocationDetailsMetadataRequest request);

    /**
     * List externalLocation metadata from OCI to the Cloud Service Provider for regions, Physical
     * Availability Zones. examples: application-json: | [ { \"externalLocation\": { \"cspRegion\":
     * \"eastus\", \"cspPhysicalAz\": \"eastus-az1\", \"cspPhysicalAzDisplayName\": \"(US) East US
     * 1\", \"serviceName\": \"ORACLEDBATAZURE\" }, \"ociPhysicalAd\": \"iad-ad-1\",
     * \"ociLogicalAd\": \"ad1\", \"ociRegion\": \"us-ashburn-1\" }, { \"externalLocation\": {
     * \"cspRegion\": \"eastus\", \"cspPhysicalAz\": \"eastus-az1\", \"cspPhysicalAzDisplayName\":
     * \"(US) East US 1\", \"serviceName\": \"ORACLEDBATAZURE\" }, \"ociPhysicalAd\": \"iad-ad-1\",
     * \"ociLogicalAd\": \"ad1\", \"ociRegion\": \"us-ashburn-1\" }, { \"externalLocation\": {
     * \"cspRegion\": \"eastus2\", \"cspPhysicalAz\": \"eastus2-az3\", \"cspPhysicalAzDisplayName\":
     * \"(US) East US 1\", \"serviceName\": \"ORACLEDBATAZURE\" }, \"ociPhysicalAd\": \"iad-ad-2\",
     * \"ociLogicalAd\": \"ad1\", \"ociRegion\": \"us-ashburn-1\" }, { \"externalLocation\": {
     * \"cspRegion\": \"eastus\", \"cspPhysicalAz\": \"eastus-az3\" \"cspPhysicalAzDisplayName\":
     * \"(US) East US 1\", \"serviceName\": \"ORACLEDBATAZURE\" }, \"ociPhysicalAd\":
     * \"iad-ad-333\", \"ociLogicalAd\": \"ad1\", \"ociRegion\": \"us-ashburn-1\" } ]
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/multicloud/ListExternalLocationMappingMetadataExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListExternalLocationMappingMetadata API.
     */
    ListExternalLocationMappingMetadataResponse listExternalLocationMappingMetadata(
            ListExternalLocationMappingMetadataRequest request);

    /**
     * List externalLocationSummary metadata from OCI Region to the Cloud Service Provider region
     * across all regions. examples: application-json: | [ { \"externalLocation\": { \"cspRegion\":
     * \"East US\" }, \"ociRegion\": \"us-ashburn-1\" }, { \"externalLocation\": { \"cspRegion\":
     * \"East US 2\" }, \"ociRegion\": \"us-ashburn-1\" }, { \"externalLocation\": { \"cspRegion\":
     * \"Germany West Central\" }, \"ociRegion\": \"eu-frankfurt-1\", } ]
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/multicloud/ListExternalLocationSummariesMetadataExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListExternalLocationSummariesMetadata API.
     */
    ListExternalLocationSummariesMetadataResponse listExternalLocationSummariesMetadata(
            ListExternalLocationSummariesMetadataRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    MetadataPaginators getPaginators();
}
