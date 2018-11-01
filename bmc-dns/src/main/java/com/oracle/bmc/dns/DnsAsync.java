/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns;

import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public interface DnsAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
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
     * Creates a new zone in the specified compartment. The `compartmentId`
     * query parameter is required if the `Content-Type` header for the
     * request is `text/dns`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateZoneResponse> createZone(
            CreateZoneRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateZoneRequest, CreateZoneResponse> handler);

    /**
     * Deletes all records at the specified zone and domain.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDomainRecordsResponse> deleteDomainRecords(
            DeleteDomainRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDomainRecordsRequest, DeleteDomainRecordsResponse>
                    handler);

    /**
     * Deletes all records in the specified RRSet.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRRSetResponse> deleteRRSet(
            DeleteRRSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteRRSetRequest, DeleteRRSetResponse> handler);

    /**
     * Deletes the specified zone. A `204` response indicates that zone has been
     * successfully deleted.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteZoneResponse> deleteZone(
            DeleteZoneRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteZoneRequest, DeleteZoneResponse> handler);

    /**
     * Gets a list of all records at the specified zone and domain.
     * The results are sorted by `rtype` in alphabetical order by default. You
     * can optionally filter and/or sort the results using the listed parameters.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDomainRecordsResponse> getDomainRecords(
            GetDomainRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDomainRecordsRequest, GetDomainRecordsResponse>
                    handler);

    /**
     * Gets a list of all records in the specified RRSet. The results are
     * sorted by `recordHash` by default.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetRRSetResponse> getRRSet(
            GetRRSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRRSetRequest, GetRRSetResponse> handler);

    /**
     * Gets information about the specified zone, including its creation date,
     * zone type, and serial.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetZoneResponse> getZone(
            GetZoneRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetZoneRequest, GetZoneResponse> handler);

    /**
     * Gets all records in the specified zone. The results are
     * sorted by `domain` in alphabetical order by default. For more
     * information about records, please see [Resource Record (RR) TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetZoneRecordsResponse> getZoneRecords(
            GetZoneRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetZoneRecordsRequest, GetZoneRecordsResponse>
                    handler);

    /**
     * Gets a list of all zones in the specified compartment. The collection
     * can be filtered by name, time created, and zone type.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListZonesResponse> listZones(
            ListZonesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListZonesRequest, ListZonesResponse> handler);

    /**
     * Replaces records in the specified zone at a domain. You can update one record or all records for the specified zone depending on the changes provided in the request body. You can also add or remove records using this function.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PatchDomainRecordsResponse> patchDomainRecords(
            PatchDomainRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PatchDomainRecordsRequest, PatchDomainRecordsResponse>
                    handler);

    /**
     * Updates records in the specified RRSet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PatchRRSetResponse> patchRRSet(
            PatchRRSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<PatchRRSetRequest, PatchRRSetResponse> handler);

    /**
     * Updates a collection of records in the specified zone. You can update
     * one record or all records for the specified zone depending on the
     * changes provided in the request body. You can also add or remove records
     * using this function.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<PatchZoneRecordsResponse> patchZoneRecords(
            PatchZoneRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<PatchZoneRecordsRequest, PatchZoneRecordsResponse>
                    handler);

    /**
     * Replaces records in the specified zone at a domain with the records
     * specified in the request body. If a specified record does not exist,
     * it will be created. If the record exists, then it will be updated to
     * represent the record in the body of the request. If a record in the zone
     * does not exist in the request body, the record will be removed from the
     * zone.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDomainRecordsResponse> updateDomainRecords(
            UpdateDomainRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDomainRecordsRequest, UpdateDomainRecordsResponse>
                    handler);

    /**
     * Replaces records in the specified RRSet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRRSetResponse> updateRRSet(
            UpdateRRSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateRRSetRequest, UpdateRRSetResponse> handler);

    /**
     * Updates the specified secondary zone with your new external master
     * server information. For more information about secondary zone, see
     * [Manage DNS Service Zone](https://docs.us-phoenix-1.oraclecloud.com/Content/DNS/Tasks/managingdnszones.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateZoneResponse> updateZone(
            UpdateZoneRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateZoneRequest, UpdateZoneResponse> handler);

    /**
     * Replaces records in the specified zone with the records specified in the
     * request body. If a specified record does not exist, it will be created.
     * If the record exists, then it will be updated to represent the record in
     * the body of the request. If a record in the zone does not exist in the
     * request body, the record will be removed from the zone.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateZoneRecordsResponse> updateZoneRecords(
            UpdateZoneRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateZoneRecordsRequest, UpdateZoneRecordsResponse>
                    handler);
}
