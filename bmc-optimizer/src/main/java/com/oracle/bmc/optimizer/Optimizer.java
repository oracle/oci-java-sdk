/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer;

import com.oracle.bmc.optimizer.requests.*;
import com.oracle.bmc.optimizer.responses.*;

/**
 * APIs for managing Cloud Advisor. Cloud Advisor provides recommendations that help you maximize cost savings and improve the security posture of your tenancy.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
public interface Optimizer extends AutoCloseable {

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
     * Applies the specified recommendations to the resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    BulkApplyRecommendationsResponse bulkApplyRecommendations(
            BulkApplyRecommendationsRequest request);

    /**
     * Creates a new profile.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateProfileResponse createProfile(CreateProfileRequest request);

    /**
     * Deletes the specified profile. Uses the profile's OCID to determine which profile to delete.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteProfileResponse deleteProfile(DeleteProfileRequest request);

    /**
     * Gets the category that corresponds to the specified OCID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCategoryResponse getCategory(GetCategoryRequest request);

    /**
     * Gets the Cloud Advisor enrollment status.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetEnrollmentStatusResponse getEnrollmentStatus(GetEnrollmentStatusRequest request);

    /**
     * Gets the specified profile's information. Uses the profile's OCID to determine which profile to retrieve.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetProfileResponse getProfile(GetProfileRequest request);

    /**
     * Gets the recommendation for the specified OCID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetRecommendationResponse getRecommendation(GetRecommendationRequest request);

    /**
     * Gets the resource action that corresponds to the specified OCID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetResourceActionResponse getResourceAction(GetResourceActionRequest request);

    /**
     * Gets the status of the work request associated with the specified ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Lists the supported Cloud Advisor categories.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCategoriesResponse listCategories(ListCategoriesRequest request);

    /**
     * Lists the Cloud Advisor enrollment statuses.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListEnrollmentStatusesResponse listEnrollmentStatuses(ListEnrollmentStatusesRequest request);

    /**
     * Lists changes to the recommendations based on user activity.
     * For example, lists when recommendations have been implemented, dismissed, postponed, or reactivated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListHistoriesResponse listHistories(ListHistoriesRequest request);

    /**
     * Lists the existing profiles.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListProfilesResponse listProfiles(ListProfilesRequest request);

    /**
     * Lists the Cloud Advisor recommendations that are currently supported in the specified category.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListRecommendationsResponse listRecommendations(ListRecommendationsRequest request);

    /**
     * Lists the Cloud Advisor resource actions that are supported by the specified recommendation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListResourceActionsResponse listResourceActions(ListResourceActionsRequest request);

    /**
     * Lists errors associated with the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Lists the logs associated with the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in the tenancy. The tenancy is the root compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Updates the enrollment status of the tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateEnrollmentStatusResponse updateEnrollmentStatus(UpdateEnrollmentStatusRequest request);

    /**
     * Updates the specified profile. Uses the profile's OCID to determine which profile to update.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateProfileResponse updateProfile(UpdateProfileRequest request);

    /**
     * Updates the recommendation that corresponds to the specified OCID.
     * Use this operation to implement the following actions:
     * <p>
     * Postpone recommendation
     *   * Dismiss recommendation
     *   * Reactivate recommendation
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateRecommendationResponse updateRecommendation(UpdateRecommendationRequest request);

    /**
     * Updates the resource action that corresponds to the specified OCID.
     * Use this operation to implement the following actions:
     * <p>
     * Postpone resource action
     *   * Ignore resource action
     *   * Reactivate resource action
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateResourceActionResponse updateResourceAction(UpdateResourceActionRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    OptimizerWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    OptimizerPaginators getPaginators();
}
