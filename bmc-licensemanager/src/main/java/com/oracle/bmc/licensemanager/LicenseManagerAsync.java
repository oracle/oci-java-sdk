/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager;

import com.oracle.bmc.licensemanager.requests.*;
import com.oracle.bmc.licensemanager.responses.*;

/**
 * Use the License Manager API to manage product licenses and license records. For more information,
 * see [License Manager
 * Overview](https://docs.cloud.oracle.com/iaas/Content/LicenseManager/Concepts/licensemanageroverview.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
public interface LicenseManagerAsync extends AutoCloseable {

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
     * Bulk upload the product licenses and license records for a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUploadLicenseRecordsResponse> bulkUploadLicenseRecords(
            BulkUploadLicenseRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadLicenseRecordsRequest, BulkUploadLicenseRecordsResponse>
                    handler);

    /**
     * Creates a new license record for the given product license ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateLicenseRecordResponse> createLicenseRecord(
            CreateLicenseRecordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateLicenseRecordRequest, CreateLicenseRecordResponse>
                    handler);

    /**
     * Creates a new product license.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateProductLicenseResponse> createProductLicense(
            CreateProductLicenseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateProductLicenseRequest, CreateProductLicenseResponse>
                    handler);

    /**
     * Removes a license record.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLicenseRecordResponse> deleteLicenseRecord(
            DeleteLicenseRecordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteLicenseRecordRequest, DeleteLicenseRecordResponse>
                    handler);

    /**
     * Removes a product license.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteProductLicenseResponse> deleteProductLicense(
            DeleteProductLicenseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteProductLicenseRequest, DeleteProductLicenseResponse>
                    handler);

    /**
     * Provides the bulk upload file template.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBulkUploadTemplateResponse> getBulkUploadTemplate(
            GetBulkUploadTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBulkUploadTemplateRequest, GetBulkUploadTemplateResponse>
                    handler);

    /**
     * Retrieves configuration for a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetConfigurationResponse> getConfiguration(
            GetConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetConfigurationRequest, GetConfigurationResponse>
                    handler);

    /**
     * Retrieves the license metrics for a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetLicenseMetricResponse> getLicenseMetric(
            GetLicenseMetricRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetLicenseMetricRequest, GetLicenseMetricResponse>
                    handler);

    /**
     * Retrieves license record details by the license record ID in a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetLicenseRecordResponse> getLicenseRecord(
            GetLicenseRecordRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetLicenseRecordRequest, GetLicenseRecordResponse>
                    handler);

    /**
     * Retrieves product license details by product license ID in a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetProductLicenseResponse> getProductLicense(
            GetProductLicenseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetProductLicenseRequest, GetProductLicenseResponse>
                    handler);

    /**
     * Retrieves all license records for a given product license ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListLicenseRecordsResponse> listLicenseRecords(
            ListLicenseRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLicenseRecordsRequest, ListLicenseRecordsResponse>
                    handler);

    /**
     * Retrieves the product license consumers for a particular product license ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProductLicenseConsumersResponse> listProductLicenseConsumers(
            ListProductLicenseConsumersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListProductLicenseConsumersRequest, ListProductLicenseConsumersResponse>
                    handler);

    /**
     * Retrieves all the product licenses from a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProductLicensesResponse> listProductLicenses(
            ListProductLicensesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListProductLicensesRequest, ListProductLicensesResponse>
                    handler);

    /**
     * Retrieves the top utilized product licenses for a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTopUtilizedProductLicensesResponse>
            listTopUtilizedProductLicenses(
                    ListTopUtilizedProductLicensesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListTopUtilizedProductLicensesRequest,
                                    ListTopUtilizedProductLicensesResponse>
                            handler);

    /**
     * Retrieves the top utilized resources for a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTopUtilizedResourcesResponse> listTopUtilizedResources(
            ListTopUtilizedResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTopUtilizedResourcesRequest, ListTopUtilizedResourcesResponse>
                    handler);

    /**
     * Updates the configuration for the compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateConfigurationResponse> updateConfiguration(
            UpdateConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateConfigurationRequest, UpdateConfigurationResponse>
                    handler);

    /**
     * Updates license record entity details.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLicenseRecordResponse> updateLicenseRecord(
            UpdateLicenseRecordRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLicenseRecordRequest, UpdateLicenseRecordResponse>
                    handler);

    /**
     * Updates the list of images for a product license.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateProductLicenseResponse> updateProductLicense(
            UpdateProductLicenseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateProductLicenseRequest, UpdateProductLicenseResponse>
                    handler);
}
