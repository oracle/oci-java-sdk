/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement;

import com.oracle.bmc.fleetappsmanagement.requests.*;
import com.oracle.bmc.fleetappsmanagement.responses.*;

/**
 * Fleet Application Management provides a centralized platform to help you automate resource
 * management tasks, validate patch compliance, and enhance operational efficiency across an
 * enterprise.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public interface FleetAppsManagementAdminAsync extends AutoCloseable {

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
     * Moves a PlatformConfiguration into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangePlatformConfigurationCompartmentResponse>
            changePlatformConfigurationCompartment(
                    ChangePlatformConfigurationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangePlatformConfigurationCompartmentRequest,
                                    ChangePlatformConfigurationCompartmentResponse>
                            handler);

    /**
     * Moves a Property into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangePropertyCompartmentResponse> changePropertyCompartment(
            ChangePropertyCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangePropertyCompartmentRequest, ChangePropertyCompartmentResponse>
                    handler);

    /**
     * Creates a compliance policy rule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateCompliancePolicyRuleResponse> createCompliancePolicyRule(
            CreateCompliancePolicyRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCompliancePolicyRuleRequest, CreateCompliancePolicyRuleResponse>
                    handler);

    /**
     * Onboard a tenant to Fleet Application Management. The onboarding process lets Fleet
     * Application Management create a few required policies that you need to start using it and its
     * features.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOnboardingResponse> createOnboarding(
            CreateOnboardingRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateOnboardingRequest, CreateOnboardingResponse>
                    handler);

    /**
     * Creates a new PlatformConfiguration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePlatformConfigurationResponse> createPlatformConfiguration(
            CreatePlatformConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePlatformConfigurationRequest, CreatePlatformConfigurationResponse>
                    handler);

    /**
     * Create a business-specific metadata property in Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePropertyResponse> createProperty(
            CreatePropertyRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreatePropertyRequest, CreatePropertyResponse>
                    handler);

    /**
     * Deletes a compliance policy rule specified by an identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCompliancePolicyRuleResponse> deleteCompliancePolicyRule(
            DeleteCompliancePolicyRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCompliancePolicyRuleRequest, DeleteCompliancePolicyRuleResponse>
                    handler);

    /**
     * Deletes Fleet Application Management onboarding resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOnboardingResponse> deleteOnboarding(
            DeleteOnboardingRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteOnboardingRequest, DeleteOnboardingResponse>
                    handler);

    /**
     * Deletes a PlatformConfiguration resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePlatformConfigurationResponse> deletePlatformConfiguration(
            DeletePlatformConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePlatformConfigurationRequest, DeletePlatformConfigurationResponse>
                    handler);

    /**
     * Delete a property in Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePropertyResponse> deleteProperty(
            DeletePropertyRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeletePropertyRequest, DeletePropertyResponse>
                    handler);

    /**
     * Enable Policies for a newer version of Fleet Application Management
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableLatestPolicyResponse> enableLatestPolicy(
            EnableLatestPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableLatestPolicyRequest, EnableLatestPolicyResponse>
                    handler);

    /**
     * Gets information about a compliance policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCompliancePolicyResponse> getCompliancePolicy(
            GetCompliancePolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCompliancePolicyRequest, GetCompliancePolicyResponse>
                    handler);

    /**
     * Gets information about a compliance policy rule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCompliancePolicyRuleResponse> getCompliancePolicyRule(
            GetCompliancePolicyRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCompliancePolicyRuleRequest, GetCompliancePolicyRuleResponse>
                    handler);

    /**
     * Gets a Fleet Application Management Onboarding by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOnboardingResponse> getOnboarding(
            GetOnboardingRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetOnboardingRequest, GetOnboardingResponse>
                    handler);

    /**
     * Gets a PlatformConfiguration by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPlatformConfigurationResponse> getPlatformConfiguration(
            GetPlatformConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPlatformConfigurationRequest, GetPlatformConfigurationResponse>
                    handler);

    /**
     * Gets a Property by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPropertyResponse> getProperty(
            GetPropertyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPropertyRequest, GetPropertyResponse> handler);

    /**
     * Returns a list of all the Compliance Policies in the specified compartment. The query
     * parameter `compartmentId` is required unless the query parameter `id` is specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCompliancePoliciesResponse> listCompliancePolicies(
            ListCompliancePoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCompliancePoliciesRequest, ListCompliancePoliciesResponse>
                    handler);

    /**
     * Gets a list of Compliance policy rules in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCompliancePolicyRulesResponse> listCompliancePolicyRules(
            ListCompliancePolicyRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCompliancePolicyRulesRequest, ListCompliancePolicyRulesResponse>
                    handler);

    /**
     * Returns a list of onboarding policy information for Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOnboardingPoliciesResponse> listOnboardingPolicies(
            ListOnboardingPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOnboardingPoliciesRequest, ListOnboardingPoliciesResponse>
                    handler);

    /**
     * Returns a list of all the onboardings in the specified root compartment (tenancy). The query
     * parameter `compartmentId` is required unless the query parameter `id` is specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOnboardingsResponse> listOnboardings(
            ListOnboardingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListOnboardingsRequest, ListOnboardingsResponse>
                    handler);

    /**
     * Returns a list of all the Platform Configurations in the specified compartment. The query
     * parameter `compartmentId` is required unless the query parameter `id` is specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPlatformConfigurationsResponse> listPlatformConfigurations(
            ListPlatformConfigurationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPlatformConfigurationsRequest, ListPlatformConfigurationsResponse>
                    handler);

    /**
     * Returns a list of all the Properties in the specified compartment. The query parameter
     * `compartmentId` is required unless the query parameter `id` is specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPropertiesResponse> listProperties(
            ListPropertiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPropertiesRequest, ListPropertiesResponse>
                    handler);

    /**
     * Updates the Onboarding setting
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ManageSettingsResponse> manageSettings(
            ManageSettingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ManageSettingsRequest, ManageSettingsResponse>
                    handler);

    /**
     * Updates a compliance policy rule specified by an identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCompliancePolicyRuleResponse> updateCompliancePolicyRule(
            UpdateCompliancePolicyRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCompliancePolicyRuleRequest, UpdateCompliancePolicyRuleResponse>
                    handler);

    /**
     * Updates the Onboarding
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOnboardingResponse> updateOnboarding(
            UpdateOnboardingRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateOnboardingRequest, UpdateOnboardingResponse>
                    handler);

    /**
     * Updates the PlatformConfiguration
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePlatformConfigurationResponse> updatePlatformConfiguration(
            UpdatePlatformConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePlatformConfigurationRequest, UpdatePlatformConfigurationResponse>
                    handler);

    /**
     * Update a property in Fleet Application Management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePropertyResponse> updateProperty(
            UpdatePropertyRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdatePropertyRequest, UpdatePropertyResponse>
                    handler);
}
