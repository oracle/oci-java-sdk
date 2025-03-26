/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns;

import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

/**
 * API for the DNS service. Use this API to manage DNS zones, records, and other DNS resources.
 * For more information, see [Overview of the DNS Service](https://docs.oracle.com/iaas/Content/DNS/Concepts/dnszonemanagement.htm).
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public interface Dns extends AutoCloseable {

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
     * Moves a resolver into a different compartment along with its protected default view and any endpoints.
     * <p>
     * Zones in the default view are not moved. VCN-dedicated resolvers are initially created in the same compartment
     * as their corresponding VCN, but can then be moved to a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ChangeResolverCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeResolverCompartment API.
     */
    ChangeResolverCompartmentResponse changeResolverCompartment(
            ChangeResolverCompartmentRequest request);

    /**
     * Moves a steering policy into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ChangeSteeringPolicyCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeSteeringPolicyCompartment API.
     */
    ChangeSteeringPolicyCompartmentResponse changeSteeringPolicyCompartment(
            ChangeSteeringPolicyCompartmentRequest request);

    /**
     * Moves a TSIG key into a different compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ChangeTsigKeyCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeTsigKeyCompartment API.
     */
    ChangeTsigKeyCompartmentResponse changeTsigKeyCompartment(
            ChangeTsigKeyCompartmentRequest request);

    /**
     * Moves a view into a different compartment.
     * <p>
     * To change the compartment of a protected view, change the compartment of its corresponding resolver.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ChangeViewCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeViewCompartment API.
     */
    ChangeViewCompartmentResponse changeViewCompartment(ChangeViewCompartmentRequest request);

    /**
     * Moves a zone into a different compartment.
     * <p>
     * Protected zones cannot have their compartment changed. When the zone name is provided as a path
     * parameter and `PRIVATE` is used for the scope query parameter then the viewId query parameter is
     * required.
     * <p>
     **Note:** All SteeringPolicyAttachment objects associated with this zone will also be moved into
     * the provided compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ChangeZoneCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeZoneCompartment API.
     */
    ChangeZoneCompartmentResponse changeZoneCompartment(ChangeZoneCompartmentRequest request);

    /**
     * Creates a new resolver endpoint in the same compartment as the resolver.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateResolverEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateResolverEndpoint API.
     */
    CreateResolverEndpointResponse createResolverEndpoint(CreateResolverEndpointRequest request);

    /**
     * Creates a new steering policy in the specified compartment. For more information on
     * creating policies with templates, see [Traffic Management API Guide](https://docs.oracle.com/iaas/Content/TrafficManagement/Concepts/trafficmanagementapi.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateSteeringPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSteeringPolicy API.
     */
    CreateSteeringPolicyResponse createSteeringPolicy(CreateSteeringPolicyRequest request);

    /**
     * Creates a new attachment between a steering policy and a domain, giving the
     * policy permission to answer queries for the specified domain. A steering policy must
     * be attached to a domain for the policy to answer DNS queries for that domain.
     * <p>
     * For the purposes of access control, the attachment is automatically placed
     * into the same compartment as the domain's zone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateSteeringPolicyAttachmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSteeringPolicyAttachment API.
     */
    CreateSteeringPolicyAttachmentResponse createSteeringPolicyAttachment(
            CreateSteeringPolicyAttachmentRequest request);

    /**
     * Creates a new TSIG key in the specified compartment. There is no
     * `opc-retry-token` header since TSIG key names must be globally unique.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateTsigKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTsigKey API.
     */
    CreateTsigKeyResponse createTsigKey(CreateTsigKeyRequest request);

    /**
     * Creates a new view in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateViewExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateView API.
     */
    CreateViewResponse createView(CreateViewRequest request);

    /**
     * Creates a new zone in the specified compartment.
     * <p>
     * Private zones must have a zone type of `PRIMARY`. Creating a private zone at or under `oraclevcn.com`
     * within the default protected view of a VCN-dedicated resolver is not permitted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateZoneExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateZone API.
     */
    CreateZoneResponse createZone(CreateZoneRequest request);

    /**
     * Creates a new zone from a zone file in the specified compartment. Not supported for private zones.
     *
     *
     * Note: This operation consumes a stream.
     *
     * If the stream supports {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, when a retry is
     * necessary, the stream is reset so it starts at the beginning (or whatever the stream's position was at the time this
     * operation is called}.
     *
     * Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before, then the mark
     * will not be the same anymore after this operation, and a subsequent call to {@link java.io.InputStream#reset()} by
     * the caller will reset the stream not to the caller's mark, but to the position the stream was in when this operation
     * was called.
     *
     * If the stream is a {@link java.io.FileInputStream}, and the stream's {@link java.nio.channels.FileChannel} position
     * can be changed (like for a regular file), the stream will be wrapped in such a way that it does provide
     * support for {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same procedure as
     * above is followed. If the stream's {@link java.nio.channels.FileChannel} position cannot be changed (like for a
     * named pipe), then the stream's contents will be buffered in memory, as described below.
     *
     * If the stream does not support {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, then
     * the stream is wrapped in a {@link java.io.BufferedInputStream}, which means the entire contents may
     * be buffered in memory. Then the same procedure as above is followed.
     *
     * The contents of the stream, except when the stream is a {@link java.io.FileInputStream} whose
     * {@link java.nio.channels.FileChannel} position can be changed, should be less than 2 GiB in size if retries are used.
     * This is because streams 2 GiB in size or larger do no guarantee that mark-and-reset can be performed. If the stream
     * is larger, do not use built-in retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateZoneFromZoneFileExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateZoneFromZoneFile API.
     */
    CreateZoneFromZoneFileResponse createZoneFromZoneFile(CreateZoneFromZoneFileRequest request);

    /**
     * Deletes all records at the specified zone and domain.
     * <p>
     * When the zone name is provided as a path parameter and `PRIVATE` is used for the scope query parameter
     * then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteDomainRecordsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDomainRecords API.
     */
    DeleteDomainRecordsResponse deleteDomainRecords(DeleteDomainRecordsRequest request);

    /**
     * Deletes all records in the specified RRSet.
     * <p>
     * When the zone name is provided as a path parameter and `PRIVATE` is used for the scope
     * query parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteRRSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteRRSet API.
     */
    DeleteRRSetResponse deleteRRSet(DeleteRRSetRequest request);

    /**
     * Deletes the specified resolver endpoint.
     * <p>
     * Note that attempting to delete a resolver endpoint in the DELETED lifecycle state will result in
     * a `404` response to be consistent with other operations of the API. Resolver endpoints may not
     * be deleted if they are referenced by a resolver rule.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteResolverEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteResolverEndpoint API.
     */
    DeleteResolverEndpointResponse deleteResolverEndpoint(DeleteResolverEndpointRequest request);

    /**
     * Deletes the specified steering policy.
     * <p>
     * A `204` response indicates that the delete has been successful.
     * Deletion will fail if the policy is attached to any zones. To detach a
     * policy from a zone, see `DeleteSteeringPolicyAttachment`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteSteeringPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSteeringPolicy API.
     */
    DeleteSteeringPolicyResponse deleteSteeringPolicy(DeleteSteeringPolicyRequest request);

    /**
     * Deletes the specified steering policy attachment.
     * A `204` response indicates that the delete has been successful.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteSteeringPolicyAttachmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSteeringPolicyAttachment API.
     */
    DeleteSteeringPolicyAttachmentResponse deleteSteeringPolicyAttachment(
            DeleteSteeringPolicyAttachmentRequest request);

    /**
     * Deletes the specified TSIG key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteTsigKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTsigKey API.
     */
    DeleteTsigKeyResponse deleteTsigKey(DeleteTsigKeyRequest request);

    /**
     * Deletes the specified view.
     * <p>
     * Note that attempting to delete a view in the DELETED lifecycleState will result in a `404`
     * response to be consistent with other operations of the API. Views cannot be
     * deleted if they are referenced by non-deleted zones or resolvers.
     * Protected views cannot be deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteViewExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteView API.
     */
    DeleteViewResponse deleteView(DeleteViewRequest request);

    /**
     * Deletes the specified zone and all its steering policy attachments.
     * <p>
     * A `204` response indicates that the zone has been successfully deleted. Protected zones cannot be deleted.
     * When the zone name is provided as a path parameter and `PRIVATE` is used for the scope query parameter
     * then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteZoneExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteZone API.
     */
    DeleteZoneResponse deleteZone(DeleteZoneRequest request);

    /**
     * Gets a list of all records at the specified zone and domain.
     * <p>
     * The results are sorted by `rtype` in alphabetical order by default. You can optionally filter and/or sort
     * the results using the listed parameters. When the zone name is provided as a path parameter and `PRIVATE`
     * is used for the scope query parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetDomainRecordsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDomainRecords API.
     */
    GetDomainRecordsResponse getDomainRecords(GetDomainRecordsRequest request);

    /**
     * Gets a list of all records in the specified RRSet.
     * <p>
     * The results are sorted by `recordHash` by default. When the zone name is provided as a path parameter
     * and `PRIVATE` is used for the scope query parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetRRSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetRRSet API.
     */
    GetRRSetResponse getRRSet(GetRRSetRequest request);

    /**
     * Gets information about a specific resolver.
     * <p>
     * Note that attempting to get a resolver in the DELETED lifecycleState will result in a `404`
     * response to be consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetResolverExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetResolver API.
     */
    GetResolverResponse getResolver(GetResolverRequest request);

    /**
     * Gets information about a specific resolver endpoint.
     * <p>
     * Note that attempting to get a resolver endpoint in the DELETED lifecycle state will result
     * in a `404` response to be consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetResolverEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetResolverEndpoint API.
     */
    GetResolverEndpointResponse getResolverEndpoint(GetResolverEndpointRequest request);

    /**
     * Gets information about the specified steering policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetSteeringPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSteeringPolicy API.
     */
    GetSteeringPolicyResponse getSteeringPolicy(GetSteeringPolicyRequest request);

    /**
     * Gets information about the specified steering policy attachment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetSteeringPolicyAttachmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSteeringPolicyAttachment API.
     */
    GetSteeringPolicyAttachmentResponse getSteeringPolicyAttachment(
            GetSteeringPolicyAttachmentRequest request);

    /**
     * Gets information about the specified TSIG key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetTsigKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTsigKey API.
     */
    GetTsigKeyResponse getTsigKey(GetTsigKeyRequest request);

    /**
     * Gets information about a specific view.
     * <p>
     * Note that attempting to get a
     * view in the DELETED lifecycleState will result in a `404` response to be
     * consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetViewExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetView API.
     */
    GetViewResponse getView(GetViewRequest request);

    /**
     * Gets information about the specified zone, including its creation date, zone type, and serial.
     * <p>
     * When the zone name is provided as a path parameter and `PRIVATE` is used for the scope query
     * parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetZoneExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetZone API.
     */
    GetZoneResponse getZone(GetZoneRequest request);

    /**
     * Gets the requested zone's zone file.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetZoneContentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetZoneContent API.
     */
    GetZoneContentResponse getZoneContent(GetZoneContentRequest request);

    /**
     * Gets all records in the specified zone.
     * <p>
     * The results are sorted by `domain` in alphabetical order by default. For more information about records,
     * see [Resource Record (RR) TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
     * When the zone name is provided as a path parameter and `PRIVATE` is used for the scope query parameter
     * then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetZoneRecordsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetZoneRecords API.
     */
    GetZoneRecordsResponse getZoneRecords(GetZoneRecordsRequest request);

    /**
     * Gets a list of all endpoints within a resolver. The collection can be filtered by name or lifecycle state.
     * It can be sorted on creation time or name both in ASC or DESC order. Note that when no lifecycleState
     * query parameter is provided, the collection does not include resolver endpoints in the DELETED
     * lifecycle state to be consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListResolverEndpointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResolverEndpoints API.
     */
    ListResolverEndpointsResponse listResolverEndpoints(ListResolverEndpointsRequest request);

    /**
     * Gets a list of all resolvers within a compartment.
     * <p>
     * The collection can be filtered by display name, id, or lifecycle state. It can be sorted
     * on creation time or displayName both in ASC or DESC order. Note that when no lifecycleState
     * query parameter is provided, the collection does not include resolvers in the DELETED
     * lifecycleState to be consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListResolversExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListResolvers API.
     */
    ListResolversResponse listResolvers(ListResolversRequest request);

    /**
     * Gets a list of all steering policies in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListSteeringPoliciesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSteeringPolicies API.
     */
    ListSteeringPoliciesResponse listSteeringPolicies(ListSteeringPoliciesRequest request);

    /**
     * Lists the steering policy attachments in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListSteeringPolicyAttachmentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSteeringPolicyAttachments API.
     */
    ListSteeringPolicyAttachmentsResponse listSteeringPolicyAttachments(
            ListSteeringPolicyAttachmentsRequest request);

    /**
     * Gets a list of all TSIG keys in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListTsigKeysExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTsigKeys API.
     */
    ListTsigKeysResponse listTsigKeys(ListTsigKeysRequest request);

    /**
     * Gets a list of all views within a compartment.
     * <p>
     * The collection can be filtered by display name, id, or lifecycle state. It can be sorted
     * on creation time or displayName both in ASC or DESC order. Note that when no lifecycleState
     * query parameter is provided, the collection does not include views in the DELETED
     * lifecycleState to be consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListViewsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListViews API.
     */
    ListViewsResponse listViews(ListViewsRequest request);

    /**
     * Gets a list of IP addresses of OCI nameservers for inbound and outbound transfer of zones in the specified
     * compartment (which must be the root compartment of a tenancy) that transfer zone data with external master or
     * downstream nameservers.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListZoneTransferServersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListZoneTransferServers API.
     */
    ListZoneTransferServersResponse listZoneTransferServers(ListZoneTransferServersRequest request);

    /**
     * Gets a list of all zones in the specified compartment.
     * <p>
     * The collection can be filtered by name, time created, scope, associated view, and zone type.
     * Filtering by view is only supported for private zones.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListZonesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListZones API.
     */
    ListZonesResponse listZones(ListZonesRequest request);

    /**
     * Updates records in the specified zone at a domain.
     * <p>
     * You can update one record or all records for the specified zone depending on the changes provided in the
     * request body. You can also add or remove records using this function. When the zone name is provided as
     * a path parameter and `PRIVATE` is used for the scope query parameter then the viewId query parameter is
     * required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/PatchDomainRecordsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchDomainRecords API.
     */
    PatchDomainRecordsResponse patchDomainRecords(PatchDomainRecordsRequest request);

    /**
     * Updates records in the specified RRSet.
     * <p>
     * When the zone name is provided as a path parameter and `PRIVATE` is used for the scope query
     * parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/PatchRRSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchRRSet API.
     */
    PatchRRSetResponse patchRRSet(PatchRRSetRequest request);

    /**
     * Updates a collection of records in the specified zone.
     * <p>
     * You can update one record or all records for the specified zone depending on the changes provided in the
     * request body. You can also add or remove records using this function. When the zone name is provided as
     * a path parameter and `PRIVATE` is used for the scope query parameter then the viewId query parameter is
     * required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/PatchZoneRecordsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchZoneRecords API.
     */
    PatchZoneRecordsResponse patchZoneRecords(PatchZoneRecordsRequest request);

    /**
     * Promotes a specified `DnssecKeyVersion` on the zone.
     * <p>
     * If the `DnssecKeyVersion` identified in the request body is a key signing key (KSK) that is replacing
     * another `DnssecKeyVersion`, then the old `DnssecKeyVersion` is scheduled for removal from the zone.
     * <p>
     * For key signing keys (KSKs), you must create the DS record with the new key information **before** promoting
     * the new key to establish a chain of trust. To avoid a service disruption, remove the old DS record as soon
     * as its TTL (time to live) expires.
     * <p>
     * For more information, see [DNSSEC](https://docs.oracle.com/iaas/Content/DNS/Concepts/dnssec.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/PromoteZoneDnssecKeyVersionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PromoteZoneDnssecKeyVersion API.
     */
    PromoteZoneDnssecKeyVersionResponse promoteZoneDnssecKeyVersion(
            PromoteZoneDnssecKeyVersionRequest request);

    /**
     * Stages a new `DnssecKeyVersion` on the zone. Staging is a process that generates a new \"successor\" key version
     * that replaces an existing \"predecessor\" key version.
     * **Note:** A new key-signing key (KSK) version is inert until you update the parent zone DS records.
     * <p>
     * For more information, see the [DNSSEC](https://docs.oracle.com/iaas/Content/DNS/Concepts/dnssec.htm) documentation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/StageZoneDnssecKeyVersionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use StageZoneDnssecKeyVersion API.
     */
    StageZoneDnssecKeyVersionResponse stageZoneDnssecKeyVersion(
            StageZoneDnssecKeyVersionRequest request);

    /**
     * Replaces records in the specified zone at a domain with the records specified in the request body.
     * <p>
     * If a specified record does not exist, it will be created. If the record exists, then it will be updated to
     * represent the record in the body of the request. If a record in the zone does not exist in the request body,
     * the record will be removed from the zone. When the zone name is provided as a path parameter and `PRIVATE`
     * is used for the scope query parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateDomainRecordsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDomainRecords API.
     */
    UpdateDomainRecordsResponse updateDomainRecords(UpdateDomainRecordsRequest request);

    /**
     * Replaces records in the specified RRSet.
     * <p>
     * When the zone name is provided as a path parameter and `PRIVATE` is used for the scope
     * query parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateRRSetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateRRSet API.
     */
    UpdateRRSetResponse updateRRSet(UpdateRRSetRequest request);

    /**
     * Updates the specified resolver with your new information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateResolverExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateResolver API.
     */
    UpdateResolverResponse updateResolver(UpdateResolverRequest request);

    /**
     * Updates the specified resolver endpoint with your new information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateResolverEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateResolverEndpoint API.
     */
    UpdateResolverEndpointResponse updateResolverEndpoint(UpdateResolverEndpointRequest request);

    /**
     * Updates the configuration of the specified steering policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateSteeringPolicyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSteeringPolicy API.
     */
    UpdateSteeringPolicyResponse updateSteeringPolicy(UpdateSteeringPolicyRequest request);

    /**
     * Updates the specified steering policy attachment with your new information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateSteeringPolicyAttachmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSteeringPolicyAttachment API.
     */
    UpdateSteeringPolicyAttachmentResponse updateSteeringPolicyAttachment(
            UpdateSteeringPolicyAttachmentRequest request);

    /**
     * Updates the specified TSIG key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateTsigKeyExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTsigKey API.
     */
    UpdateTsigKeyResponse updateTsigKey(UpdateTsigKeyRequest request);

    /**
     * Updates the specified view with your new information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateViewExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateView API.
     */
    UpdateViewResponse updateView(UpdateViewRequest request);

    /**
     * Updates the zone with the specified information.
     * <p>
     * Global secondary zones may have their external masters updated. For more information about secondary
     * zones, see [Manage DNS Service Zone](https://docs.oracle.com/iaas/Content/DNS/Tasks/managingdnszones.htm). When the zone name
     * is provided as a path parameter and `PRIVATE` is used for the scope query parameter then the viewId
     * query parameter is required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateZoneExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateZone API.
     */
    UpdateZoneResponse updateZone(UpdateZoneRequest request);

    /**
     * Replaces records in the specified zone with the records specified in the request body.
     * <p>
     * If a specified record does not exist, it will be created. If the record exists, then it will be updated
     * to represent the record in the body of the request. If a record in the zone does not exist in the
     * request body, the record will be removed from the zone. When the zone name is provided as a path
     * parameter and `PRIVATE` is used for the scope query parameter then the viewId query parameter is
     * required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateZoneRecordsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateZoneRecords API.
     */
    UpdateZoneRecordsResponse updateZoneRecords(UpdateZoneRecordsRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     * @deprecated use {@link #newWaiters(WorkRequest)} instead.  Otherwise, a default one will be provided
     *   that does not support operations that rely on the {@code WorkRequestClient} for polling.  An
     *   {@code IllegalStateException} will be thrown for such operations.
     */
    @Deprecated
    DnsWaiters getWaiters();

    /**
     * Creates a new {@code DnsWaiters} for resources for this service.
     *
     * @param workRequestClient The work request service client used to query for work request status
     * @return The service waiters.
     */
    DnsWaiters newWaiters(com.oracle.bmc.workrequests.WorkRequest workRequestClient);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DnsPaginators getPaginators();
}
