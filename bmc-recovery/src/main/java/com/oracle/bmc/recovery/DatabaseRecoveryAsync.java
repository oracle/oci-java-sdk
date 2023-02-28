/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery;

import com.oracle.bmc.recovery.requests.*;
import com.oracle.bmc.recovery.responses.*;

/** Use Oracle Database Autonomous Recovery Service API to manage Protected Databases. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
public interface DatabaseRecoveryAsync extends AutoCloseable {

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
     * Moves a protected database resource from the existing compartment to the specified
     * compartment. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeProtectedDatabaseCompartmentResponse>
            changeProtectedDatabaseCompartment(
                    ChangeProtectedDatabaseCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeProtectedDatabaseCompartmentRequest,
                                    ChangeProtectedDatabaseCompartmentResponse>
                            handler);

    /**
     * Moves a protection policy resource from the existing compartment to the specified
     * compartment. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeProtectionPolicyCompartmentResponse>
            changeProtectionPolicyCompartment(
                    ChangeProtectionPolicyCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeProtectionPolicyCompartmentRequest,
                                    ChangeProtectionPolicyCompartmentResponse>
                            handler);

    /**
     * Moves a recovery service subnet resource from the existing compartment to the specified
     * compartment. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeRecoveryServiceSubnetCompartmentResponse>
            changeRecoveryServiceSubnetCompartment(
                    ChangeRecoveryServiceSubnetCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeRecoveryServiceSubnetCompartmentRequest,
                                    ChangeRecoveryServiceSubnetCompartmentResponse>
                            handler);

    /**
     * Creates a new Protected Database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateProtectedDatabaseResponse> createProtectedDatabase(
            CreateProtectedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateProtectedDatabaseRequest, CreateProtectedDatabaseResponse>
                    handler);

    /**
     * Creates a new Protection Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateProtectionPolicyResponse> createProtectionPolicy(
            CreateProtectionPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateProtectionPolicyRequest, CreateProtectionPolicyResponse>
                    handler);

    /**
     * Creates a new Recovery Service Subnet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateRecoveryServiceSubnetResponse> createRecoveryServiceSubnet(
            CreateRecoveryServiceSubnetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateRecoveryServiceSubnetRequest, CreateRecoveryServiceSubnetResponse>
                    handler);

    /**
     * Deletes a protected database based on the specified protected database ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteProtectedDatabaseResponse> deleteProtectedDatabase(
            DeleteProtectedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteProtectedDatabaseRequest, DeleteProtectedDatabaseResponse>
                    handler);

    /**
     * Deletes a specified protection policy. You can delete custom policies only. Deleting a Oracle
     * predefined policies will result in status code 405 Method Not Allowed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteProtectionPolicyResponse> deleteProtectionPolicy(
            DeleteProtectionPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteProtectionPolicyRequest, DeleteProtectionPolicyResponse>
                    handler);

    /**
     * Deletes a specified recovery service subnet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRecoveryServiceSubnetResponse> deleteRecoveryServiceSubnet(
            DeleteRecoveryServiceSubnetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteRecoveryServiceSubnetRequest, DeleteRecoveryServiceSubnetResponse>
                    handler);

    /**
     * Downloads the network service configuration file 'tnsnames.ora' for a specified protected
     * database. Applies to user-defined recovery systems only.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<FetchProtectedDatabaseConfigurationResponse>
            fetchProtectedDatabaseConfiguration(
                    FetchProtectedDatabaseConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    FetchProtectedDatabaseConfigurationRequest,
                                    FetchProtectedDatabaseConfigurationResponse>
                            handler);

    /**
     * Gets information about a specified protected database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetProtectedDatabaseResponse> getProtectedDatabase(
            GetProtectedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetProtectedDatabaseRequest, GetProtectedDatabaseResponse>
                    handler);

    /**
     * Gets information about a specified protection policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetProtectionPolicyResponse> getProtectionPolicy(
            GetProtectionPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetProtectionPolicyRequest, GetProtectionPolicyResponse>
                    handler);

    /**
     * Gets information about a specified recovery service subnet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRecoveryServiceSubnetResponse> getRecoveryServiceSubnet(
            GetRecoveryServiceSubnetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetRecoveryServiceSubnetRequest, GetRecoveryServiceSubnetResponse>
                    handler);

    /**
     * Gets the status of the work request based on the specified ID
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Lists the protected databases based on the specified parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProtectedDatabasesResponse> listProtectedDatabases(
            ListProtectedDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListProtectedDatabasesRequest, ListProtectedDatabasesResponse>
                    handler);

    /**
     * Gets a list of protection policies based on the specified parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProtectionPoliciesResponse> listProtectionPolicies(
            ListProtectionPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListProtectionPoliciesRequest, ListProtectionPoliciesResponse>
                    handler);

    /**
     * Returns a list of Recovery Service Subnets.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRecoveryServiceSubnetsResponse> listRecoveryServiceSubnets(
            ListRecoveryServiceSubnetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRecoveryServiceSubnetsRequest, ListRecoveryServiceSubnetsResponse>
                    handler);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Updates the Protected Database
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateProtectedDatabaseResponse> updateProtectedDatabase(
            UpdateProtectedDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateProtectedDatabaseRequest, UpdateProtectedDatabaseResponse>
                    handler);

    /**
     * Updates the specified protection policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateProtectionPolicyResponse> updateProtectionPolicy(
            UpdateProtectionPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateProtectionPolicyRequest, UpdateProtectionPolicyResponse>
                    handler);

    /**
     * Updates the specified recovery service subnet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRecoveryServiceSubnetResponse> updateRecoveryServiceSubnet(
            UpdateRecoveryServiceSubnetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateRecoveryServiceSubnetRequest, UpdateRecoveryServiceSubnetResponse>
                    handler);
}
