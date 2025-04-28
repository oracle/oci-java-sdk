/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates;

import com.oracle.bmc.certificates.requests.*;
import com.oracle.bmc.certificates.responses.*;

/** API for retrieving certificates. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public interface CertificatesAsync extends AutoCloseable {

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
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Gets a ca-bundle bundle.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCaBundleResponse> getCaBundle(
            GetCaBundleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCaBundleRequest, GetCaBundleResponse> handler);

    /**
     * Gets a certificate authority bundle that matches either the specified `stage`, `name`, or
     * `versionNumber` parameter. If none of these parameters are provided, the bundle for the
     * certificate authority version marked as `CURRENT` will be returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCertificateAuthorityBundleResponse>
            getCertificateAuthorityBundle(
                    GetCertificateAuthorityBundleRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetCertificateAuthorityBundleRequest,
                                    GetCertificateAuthorityBundleResponse>
                            handler);

    /**
     * Gets a certificate bundle that matches either the specified `stage`, `versionName`, or
     * `versionNumber` parameter. If none of these parameters are provided, the bundle for the
     * certificate version marked as `CURRENT` will be returned.
     *
     * <p>By default, the private key is not included in the query result, and a
     * CertificateBundlePublicOnly is returned. If the private key is needed, use the
     * CertificateBundleTypeQueryParam parameter to get a CertificateBundleWithPrivateKey response.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCertificateBundleResponse> getCertificateBundle(
            GetCertificateBundleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCertificateBundleRequest, GetCertificateBundleResponse>
                    handler);

    /**
     * Lists all certificate authority bundle versions for the specified certificate authority.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCertificateAuthorityBundleVersionsResponse>
            listCertificateAuthorityBundleVersions(
                    ListCertificateAuthorityBundleVersionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListCertificateAuthorityBundleVersionsRequest,
                                    ListCertificateAuthorityBundleVersionsResponse>
                            handler);

    /**
     * Lists all certificate bundle versions for the specified certificate.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCertificateBundleVersionsResponse>
            listCertificateBundleVersions(
                    ListCertificateBundleVersionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListCertificateBundleVersionsRequest,
                                    ListCertificateBundleVersionsResponse>
                            handler);
}
