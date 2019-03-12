/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns;

import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public interface Dns extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

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
     * Creates a new steering policy in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateSteeringPolicyResponse createSteeringPolicy(CreateSteeringPolicyRequest request);

    /**
     * Creates a new attachment between a steering policy and a domain.
     * For the purposes of access control, the attachment is automatically placed
     * into the same compartment as the containing zone of the domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateSteeringPolicyAttachmentResponse createSteeringPolicyAttachment(
            CreateSteeringPolicyAttachmentRequest request);

    /**
     * Creates a new zone in the specified compartment. The `compartmentId`
     * query parameter is required if the `Content-Type` header for the
     * request is `text/dns`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateZoneResponse createZone(CreateZoneRequest request);

    /**
     * Deletes all records at the specified zone and domain.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDomainRecordsResponse deleteDomainRecords(DeleteDomainRecordsRequest request);

    /**
     * Deletes all records in the specified RRSet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteRRSetResponse deleteRRSet(DeleteRRSetRequest request);

    /**
     * Deletes the specified steering policy.
     * A `204` response indicates that the delete has been successful.
     * Deletion will fail if the policy is attached to any zones.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteSteeringPolicyResponse deleteSteeringPolicy(DeleteSteeringPolicyRequest request);

    /**
     * Deletes the specified steering policy attachment.
     * A `204` response indicates that the delete has been successful.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteSteeringPolicyAttachmentResponse deleteSteeringPolicyAttachment(
            DeleteSteeringPolicyAttachmentRequest request);

    /**
     * Deletes the specified zone and all its steering policy attachments.
     * A `204` response indicates that zone has been successfully deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteZoneResponse deleteZone(DeleteZoneRequest request);

    /**
     * Gets a list of all records at the specified zone and domain.
     * The results are sorted by `rtype` in alphabetical order by default. You
     * can optionally filter and/or sort the results using the listed parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDomainRecordsResponse getDomainRecords(GetDomainRecordsRequest request);

    /**
     * Gets a list of all records in the specified RRSet. The results are
     * sorted by `recordHash` by default.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetRRSetResponse getRRSet(GetRRSetRequest request);

    /**
     * Gets information about the specified steering policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSteeringPolicyResponse getSteeringPolicy(GetSteeringPolicyRequest request);

    /**
     * Gets information about the specified steering policy attachment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSteeringPolicyAttachmentResponse getSteeringPolicyAttachment(
            GetSteeringPolicyAttachmentRequest request);

    /**
     * Gets information about the specified zone, including its creation date,
     * zone type, and serial.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetZoneResponse getZone(GetZoneRequest request);

    /**
     * Gets all records in the specified zone. The results are
     * sorted by `domain` in alphabetical order by default. For more
     * information about records, see [Resource Record (RR) TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetZoneRecordsResponse getZoneRecords(GetZoneRecordsRequest request);

    /**
     * Gets a list of all steering policies in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSteeringPoliciesResponse listSteeringPolicies(ListSteeringPoliciesRequest request);

    /**
     * Lists the steering policy attachments in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSteeringPolicyAttachmentsResponse listSteeringPolicyAttachments(
            ListSteeringPolicyAttachmentsRequest request);

    /**
     * Gets a list of all zones in the specified compartment. The collection
     * can be filtered by name, time created, and zone type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListZonesResponse listZones(ListZonesRequest request);

    /**
     * Updates records in the specified zone at a domain. You can update one record or all records for the specified zone depending on the changes provided in the request body. You can also add or remove records using this function.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    PatchDomainRecordsResponse patchDomainRecords(PatchDomainRecordsRequest request);

    /**
     * Updates records in the specified RRSet.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    PatchRRSetResponse patchRRSet(PatchRRSetRequest request);

    /**
     * Updates a collection of records in the specified zone. You can update
     * one record or all records for the specified zone depending on the
     * changes provided in the request body. You can also add or remove records
     * using this function.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    PatchZoneRecordsResponse patchZoneRecords(PatchZoneRecordsRequest request);

    /**
     * Replaces records in the specified zone at a domain with the records
     * specified in the request body. If a specified record does not exist,
     * it will be created. If the record exists, then it will be updated to
     * represent the record in the body of the request. If a record in the zone
     * does not exist in the request body, the record will be removed from the
     * zone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDomainRecordsResponse updateDomainRecords(UpdateDomainRecordsRequest request);

    /**
     * Replaces records in the specified RRSet.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateRRSetResponse updateRRSet(UpdateRRSetRequest request);

    /**
     * Updates the specified steering policy with your new information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateSteeringPolicyResponse updateSteeringPolicy(UpdateSteeringPolicyRequest request);

    /**
     * Updates the specified steering policy attachment with your new information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateSteeringPolicyAttachmentResponse updateSteeringPolicyAttachment(
            UpdateSteeringPolicyAttachmentRequest request);

    /**
     * Updates the specified secondary zone with your new external master
     * server information. For more information about secondary zone, see
     * [Manage DNS Service Zone](https://docs.cloud.oracle.com/iaas/Content/DNS/Tasks/managingdnszones.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateZoneResponse updateZone(UpdateZoneRequest request);

    /**
     * Replaces records in the specified zone with the records specified in the
     * request body. If a specified record does not exist, it will be created.
     * If the record exists, then it will be updated to represent the record in
     * the body of the request. If a record in the zone does not exist in the
     * request body, the record will be removed from the zone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateZoneRecordsResponse updateZoneRecords(UpdateZoneRecordsRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DnsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DnsPaginators getPaginators();
}
