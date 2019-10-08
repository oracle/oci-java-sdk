/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dts;

import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.011")
public interface TransferPackageAsync extends AutoCloseable {

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
     * Attaches Devices to a Transfer Package
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachDevicesToTransferPackageResponse>
            attachDevicesToTransferPackage(
                    AttachDevicesToTransferPackageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AttachDevicesToTransferPackageRequest,
                                    AttachDevicesToTransferPackageResponse>
                            handler);

    /**
     * Create a new Transfer Package
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTransferPackageResponse> createTransferPackage(
            CreateTransferPackageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateTransferPackageRequest, CreateTransferPackageResponse>
                    handler);

    /**
     * deletes a transfer Package
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTransferPackageResponse> deleteTransferPackage(
            DeleteTransferPackageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteTransferPackageRequest, DeleteTransferPackageResponse>
                    handler);

    /**
     * Detaches Devices from a Transfer Package
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachDevicesFromTransferPackageResponse>
            detachDevicesFromTransferPackage(
                    DetachDevicesFromTransferPackageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetachDevicesFromTransferPackageRequest,
                                    DetachDevicesFromTransferPackageResponse>
                            handler);

    /**
     * Describes a transfer package in detail
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTransferPackageResponse> getTransferPackage(
            GetTransferPackageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTransferPackageRequest, GetTransferPackageResponse>
                    handler);

    /**
     * Lists Transfer Packages associated with a transferJob
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTransferPackagesResponse> listTransferPackages(
            ListTransferPackagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTransferPackagesRequest, ListTransferPackagesResponse>
                    handler);

    /**
     * Updates a Transfer Package
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTransferPackageResponse> updateTransferPackage(
            UpdateTransferPackageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateTransferPackageRequest, UpdateTransferPackageResponse>
                    handler);
}
