/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dts;

import com.oracle.bmc.dts.requests.*;
import com.oracle.bmc.dts.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.014")
public interface TransferApplianceEntitlementAsync extends AutoCloseable {

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
     * Create the Entitlement to use a Transfer Appliance. It requires some offline process of review and signatures before request is granted.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTransferApplianceEntitlementResponse>
            createTransferApplianceEntitlement(
                    CreateTransferApplianceEntitlementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateTransferApplianceEntitlementRequest,
                                    CreateTransferApplianceEntitlementResponse>
                            handler);

    /**
     * Describes the Transfer Appliance Entitlement in detail
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTransferApplianceEntitlementResponse>
            getTransferApplianceEntitlement(
                    GetTransferApplianceEntitlementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetTransferApplianceEntitlementRequest,
                                    GetTransferApplianceEntitlementResponse>
                            handler);

    /**
     * Lists Transfer Transfer Appliance Entitlement
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTransferApplianceEntitlementResponse>
            listTransferApplianceEntitlement(
                    ListTransferApplianceEntitlementRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListTransferApplianceEntitlementRequest,
                                    ListTransferApplianceEntitlementResponse>
                            handler);
}
