/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall;

import com.oracle.bmc.networkfirewall.requests.*;
import com.oracle.bmc.networkfirewall.responses.*;

/**
 * Use the Network Firewall API to create network firewalls and configure policies that regulates
 * network traffic in and across VCNs.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
public interface NetworkFirewallAsync extends AutoCloseable {

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
     * Applies the candidate version of the NetworkFirewallPolicy resource. When provided, If-Match
     * is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ApplyNetworkFirewallPolicyResponse> applyNetworkFirewallPolicy(
            ApplyNetworkFirewallPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ApplyNetworkFirewallPolicyRequest, ApplyNetworkFirewallPolicyResponse>
                    handler);

    /**
     * Creates a new Address Lists at bulk for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUploadAddressListsResponse> bulkUploadAddressLists(
            BulkUploadAddressListsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadAddressListsRequest, BulkUploadAddressListsResponse>
                    handler);

    /**
     * Creates a new Application Group at bulk for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUploadApplicationGroupsResponse> bulkUploadApplicationGroups(
            BulkUploadApplicationGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadApplicationGroupsRequest, BulkUploadApplicationGroupsResponse>
                    handler);

    /**
     * Creates new Applications at bulk for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUploadApplicationsResponse> bulkUploadApplications(
            BulkUploadApplicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadApplicationsRequest, BulkUploadApplicationsResponse>
                    handler);

    /**
     * Creates new Decryption Profiles at bulk for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUploadDecryptionProfilesResponse> bulkUploadDecryptionProfiles(
            BulkUploadDecryptionProfilesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadDecryptionProfilesRequest,
                            BulkUploadDecryptionProfilesResponse>
                    handler);

    /**
     * Creates Decryption Rules at bulk for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUploadDecryptionRulesResponse> bulkUploadDecryptionRules(
            BulkUploadDecryptionRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadDecryptionRulesRequest, BulkUploadDecryptionRulesResponse>
                    handler);

    /**
     * Creates new Mapped Secrets at bulk for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUploadMappedSecretsResponse> bulkUploadMappedSecrets(
            BulkUploadMappedSecretsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadMappedSecretsRequest, BulkUploadMappedSecretsResponse>
                    handler);

    /**
     * Creates a new NAT Rule at bulk for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUploadNatRulesResponse> bulkUploadNatRules(
            BulkUploadNatRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadNatRulesRequest, BulkUploadNatRulesResponse>
                    handler);

    /**
     * Creates a new Security Rule at bulk for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUploadSecurityRulesResponse> bulkUploadSecurityRules(
            BulkUploadSecurityRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadSecurityRulesRequest, BulkUploadSecurityRulesResponse>
                    handler);

    /**
     * Creates a new Service List at bulk for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUploadServiceListsResponse> bulkUploadServiceLists(
            BulkUploadServiceListsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadServiceListsRequest, BulkUploadServiceListsResponse>
                    handler);

    /**
     * Creates new Services at bulk for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUploadServicesResponse> bulkUploadServices(
            BulkUploadServicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadServicesRequest, BulkUploadServicesResponse>
                    handler);

    /**
     * Creates a new Tunnel Inspection Rule at bulk for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUploadTunnelInspectionRulesResponse>
            bulkUploadTunnelInspectionRules(
                    BulkUploadTunnelInspectionRulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    BulkUploadTunnelInspectionRulesRequest,
                                    BulkUploadTunnelInspectionRulesResponse>
                            handler);

    /**
     * Creates a new Url Lists at bulk for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<BulkUploadUrlListsResponse> bulkUploadUrlLists(
            BulkUploadUrlListsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            BulkUploadUrlListsRequest, BulkUploadUrlListsResponse>
                    handler);

    /**
     * Cancel work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Moves a NetworkFirewall resource from one compartment identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeNetworkFirewallCompartmentResponse>
            changeNetworkFirewallCompartment(
                    ChangeNetworkFirewallCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNetworkFirewallCompartmentRequest,
                                    ChangeNetworkFirewallCompartmentResponse>
                            handler);

    /**
     * Moves a NetworkFirewallPolicy resource from one compartment identifier to another. When
     * provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeNetworkFirewallPolicyCompartmentResponse>
            changeNetworkFirewallPolicyCompartment(
                    ChangeNetworkFirewallPolicyCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNetworkFirewallPolicyCompartmentRequest,
                                    ChangeNetworkFirewallPolicyCompartmentResponse>
                            handler);

    /**
     * Clones a NetworkFirewallPolicy resource from an existing Network Firewall Policy. When
     * provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CloneNetworkFirewallPolicyResponse> cloneNetworkFirewallPolicy(
            CloneNetworkFirewallPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CloneNetworkFirewallPolicyRequest, CloneNetworkFirewallPolicyResponse>
                    handler);

    /**
     * Creates a new Address List for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateAddressListResponse> createAddressList(
            CreateAddressListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAddressListRequest, CreateAddressListResponse>
                    handler);

    /**
     * Creates a new Application for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateApplicationResponse> createApplication(
            CreateApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateApplicationRequest, CreateApplicationResponse>
                    handler);

    /**
     * Creates a new ApplicationGroup for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateApplicationGroupResponse> createApplicationGroup(
            CreateApplicationGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateApplicationGroupRequest, CreateApplicationGroupResponse>
                    handler);

    /**
     * Creates a new Decryption Profile for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDecryptionProfileResponse> createDecryptionProfile(
            CreateDecryptionProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDecryptionProfileRequest, CreateDecryptionProfileResponse>
                    handler);

    /**
     * Creates a new Decryption Rule for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDecryptionRuleResponse> createDecryptionRule(
            CreateDecryptionRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDecryptionRuleRequest, CreateDecryptionRuleResponse>
                    handler);

    /**
     * Creates a new Mapped Secret for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMappedSecretResponse> createMappedSecret(
            CreateMappedSecretRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMappedSecretRequest, CreateMappedSecretResponse>
                    handler);

    /**
     * Creates a new NAT Rule for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateNatRuleResponse> createNatRule(
            CreateNatRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateNatRuleRequest, CreateNatRuleResponse>
                    handler);

    /**
     * Creates a new NetworkFirewall.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateNetworkFirewallResponse> createNetworkFirewall(
            CreateNetworkFirewallRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateNetworkFirewallRequest, CreateNetworkFirewallResponse>
                    handler);

    /**
     * Creates a new Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateNetworkFirewallPolicyResponse> createNetworkFirewallPolicy(
            CreateNetworkFirewallPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateNetworkFirewallPolicyRequest, CreateNetworkFirewallPolicyResponse>
                    handler);

    /**
     * Creates a new Security Rule for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSecurityRuleResponse> createSecurityRule(
            CreateSecurityRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityRuleRequest, CreateSecurityRuleResponse>
                    handler);

    /**
     * Creates a new Service for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateServiceResponse> createService(
            CreateServiceRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateServiceRequest, CreateServiceResponse>
                    handler);

    /**
     * Creates a new ServiceList for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateServiceListResponse> createServiceList(
            CreateServiceListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateServiceListRequest, CreateServiceListResponse>
                    handler);

    /**
     * Creates a new tunnel inspection rule for the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTunnelInspectionRuleResponse> createTunnelInspectionRule(
            CreateTunnelInspectionRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateTunnelInspectionRuleRequest, CreateTunnelInspectionRuleResponse>
                    handler);

    /**
     * Creates a new Url List for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateUrlListResponse> createUrlList(
            CreateUrlListRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateUrlListRequest, CreateUrlListResponse>
                    handler);

    /**
     * Deletes a Address List resource with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAddressListResponse> deleteAddressList(
            DeleteAddressListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAddressListRequest, DeleteAddressListResponse>
                    handler);

    /**
     * Deletes a Application resource with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteApplicationResponse> deleteApplication(
            DeleteApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteApplicationRequest, DeleteApplicationResponse>
                    handler);

    /**
     * Deletes a ApplicationGroup resource with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteApplicationGroupResponse> deleteApplicationGroup(
            DeleteApplicationGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteApplicationGroupRequest, DeleteApplicationGroupResponse>
                    handler);

    /**
     * Deletes a Decryption Profile resource with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDecryptionProfileResponse> deleteDecryptionProfile(
            DeleteDecryptionProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDecryptionProfileRequest, DeleteDecryptionProfileResponse>
                    handler);

    /**
     * Deletes a Decryption Rule resource with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDecryptionRuleResponse> deleteDecryptionRule(
            DeleteDecryptionRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDecryptionRuleRequest, DeleteDecryptionRuleResponse>
                    handler);

    /**
     * Deletes a Mapped Secret resource with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMappedSecretResponse> deleteMappedSecret(
            DeleteMappedSecretRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMappedSecretRequest, DeleteMappedSecretResponse>
                    handler);

    /**
     * Deletes a NAT Rule resource with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNatRuleResponse> deleteNatRule(
            DeleteNatRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteNatRuleRequest, DeleteNatRuleResponse>
                    handler);

    /**
     * Deletes a NetworkFirewall resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNetworkFirewallResponse> deleteNetworkFirewall(
            DeleteNetworkFirewallRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteNetworkFirewallRequest, DeleteNetworkFirewallResponse>
                    handler);

    /**
     * Deletes a NetworkFirewallPolicy resource with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNetworkFirewallPolicyResponse> deleteNetworkFirewallPolicy(
            DeleteNetworkFirewallPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteNetworkFirewallPolicyRequest, DeleteNetworkFirewallPolicyResponse>
                    handler);

    /**
     * Deletes a Security Rule resource with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSecurityRuleResponse> deleteSecurityRule(
            DeleteSecurityRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityRuleRequest, DeleteSecurityRuleResponse>
                    handler);

    /**
     * Deletes a Service resource with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteServiceResponse> deleteService(
            DeleteServiceRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteServiceRequest, DeleteServiceResponse>
                    handler);

    /**
     * Deletes a ServiceList resource with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteServiceListResponse> deleteServiceList(
            DeleteServiceListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteServiceListRequest, DeleteServiceListResponse>
                    handler);

    /**
     * Deletes a tunnel inspection rule resource with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTunnelInspectionRuleResponse> deleteTunnelInspectionRule(
            DeleteTunnelInspectionRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteTunnelInspectionRuleRequest, DeleteTunnelInspectionRuleResponse>
                    handler);

    /**
     * Deletes a Url List resource with the given identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteUrlListResponse> deleteUrlList(
            DeleteUrlListRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteUrlListRequest, DeleteUrlListResponse>
                    handler);

    /**
     * Get Address List by the given name in the context of network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAddressListResponse> getAddressList(
            GetAddressListRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAddressListRequest, GetAddressListResponse>
                    handler);

    /**
     * Get Application by the given name in the context of network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetApplicationResponse> getApplication(
            GetApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetApplicationRequest, GetApplicationResponse>
                    handler);

    /**
     * Get ApplicationGroup by the given name in the context of network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetApplicationGroupResponse> getApplicationGroup(
            GetApplicationGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetApplicationGroupRequest, GetApplicationGroupResponse>
                    handler);

    /**
     * Get Decryption Profile by the given name in the context of network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDecryptionProfileResponse> getDecryptionProfile(
            GetDecryptionProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDecryptionProfileRequest, GetDecryptionProfileResponse>
                    handler);

    /**
     * Get Decryption Rule by the given name in the context of network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDecryptionRuleResponse> getDecryptionRule(
            GetDecryptionRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDecryptionRuleRequest, GetDecryptionRuleResponse>
                    handler);

    /**
     * Get Mapped Secret by the given name in the context of network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMappedSecretResponse> getMappedSecret(
            GetMappedSecretRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMappedSecretRequest, GetMappedSecretResponse>
                    handler);

    /**
     * Get NAT Rule by the given name in the context of network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetNatRuleResponse> getNatRule(
            GetNatRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetNatRuleRequest, GetNatRuleResponse> handler);

    /**
     * Gets a NetworkFirewall by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetNetworkFirewallResponse> getNetworkFirewall(
            GetNetworkFirewallRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkFirewallRequest, GetNetworkFirewallResponse>
                    handler);

    /**
     * Gets a NetworkFirewallPolicy given the network firewall policy identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetNetworkFirewallPolicyResponse> getNetworkFirewallPolicy(
            GetNetworkFirewallPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkFirewallPolicyRequest, GetNetworkFirewallPolicyResponse>
                    handler);

    /**
     * Get Security Rule by the given name in the context of network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSecurityRuleResponse> getSecurityRule(
            GetSecurityRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSecurityRuleRequest, GetSecurityRuleResponse>
                    handler);

    /**
     * Get Service by the given name in the context of network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetServiceResponse> getService(
            GetServiceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetServiceRequest, GetServiceResponse> handler);

    /**
     * Get ServiceList by the given name in the context of network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetServiceListResponse> getServiceList(
            GetServiceListRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetServiceListRequest, GetServiceListResponse>
                    handler);

    /**
     * Get tunnel inspection rule by the given name in the context of network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTunnelInspectionRuleResponse> getTunnelInspectionRule(
            GetTunnelInspectionRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTunnelInspectionRuleRequest, GetTunnelInspectionRuleResponse>
                    handler);

    /**
     * Get Url List by the given name in the context of network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetUrlListResponse> getUrlList(
            GetUrlListRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetUrlListRequest, GetUrlListResponse> handler);

    /**
     * Gets the status of the work request with the given ID.
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
     * Returns a list of Network Firewall Policies.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAddressListsResponse> listAddressLists(
            ListAddressListsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAddressListsRequest, ListAddressListsResponse>
                    handler);

    /**
     * Returns a list of ApplicationGroups for the policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListApplicationGroupsResponse> listApplicationGroups(
            ListApplicationGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListApplicationGroupsRequest, ListApplicationGroupsResponse>
                    handler);

    /**
     * Returns a list of Applications for the policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListApplicationsResponse> listApplications(
            ListApplicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListApplicationsRequest, ListApplicationsResponse>
                    handler);

    /**
     * Returns a list of Decryption Profile for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDecryptionProfilesResponse> listDecryptionProfiles(
            ListDecryptionProfilesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDecryptionProfilesRequest, ListDecryptionProfilesResponse>
                    handler);

    /**
     * Returns a list of Decryption Rule for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDecryptionRulesResponse> listDecryptionRules(
            ListDecryptionRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDecryptionRulesRequest, ListDecryptionRulesResponse>
                    handler);

    /**
     * Returns a list of Mapped Secret for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMappedSecretsResponse> listMappedSecrets(
            ListMappedSecretsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMappedSecretsRequest, ListMappedSecretsResponse>
                    handler);

    /**
     * Returns a list of NAT Rules for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListNatRulesResponse> listNatRules(
            ListNatRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListNatRulesRequest, ListNatRulesResponse>
                    handler);

    /**
     * Returns a list of Network Firewall Policies.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListNetworkFirewallPoliciesResponse> listNetworkFirewallPolicies(
            ListNetworkFirewallPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListNetworkFirewallPoliciesRequest, ListNetworkFirewallPoliciesResponse>
                    handler);

    /**
     * Returns a list of NetworkFirewalls.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListNetworkFirewallsResponse> listNetworkFirewalls(
            ListNetworkFirewallsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListNetworkFirewallsRequest, ListNetworkFirewallsResponse>
                    handler);

    /**
     * Returns a list of Security Rule for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSecurityRulesResponse> listSecurityRules(
            ListSecurityRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityRulesRequest, ListSecurityRulesResponse>
                    handler);

    /**
     * Returns a list of ServiceLists for the policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListServiceListsResponse> listServiceLists(
            ListServiceListsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListServiceListsRequest, ListServiceListsResponse>
                    handler);

    /**
     * Returns a list of Services for the policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListServicesResponse> listServices(
            ListServicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListServicesRequest, ListServicesResponse>
                    handler);

    /**
     * Returns a list of tunnel inspection rules for the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTunnelInspectionRulesResponse> listTunnelInspectionRules(
            ListTunnelInspectionRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTunnelInspectionRulesRequest, ListTunnelInspectionRulesResponse>
                    handler);

    /**
     * Returns a list of URL lists for the Network Firewall Policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListUrlListsResponse> listUrlLists(
            ListUrlListsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListUrlListsRequest, ListUrlListsResponse>
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
     * Moves a NetworkFirewallPolicy resource from one version to latest version. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<MigrateNetworkFirewallPolicyResponse> migrateNetworkFirewallPolicy(
            MigrateNetworkFirewallPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            MigrateNetworkFirewallPolicyRequest,
                            MigrateNetworkFirewallPolicyResponse>
                    handler);

    /**
     * Updates the Address list with the given name in the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAddressListResponse> updateAddressList(
            UpdateAddressListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAddressListRequest, UpdateAddressListResponse>
                    handler);

    /**
     * Updates the Application with the given name in the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateApplicationResponse> updateApplication(
            UpdateApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateApplicationRequest, UpdateApplicationResponse>
                    handler);

    /**
     * Updates the ApplicationGroup with the given name in the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateApplicationGroupResponse> updateApplicationGroup(
            UpdateApplicationGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateApplicationGroupRequest, UpdateApplicationGroupResponse>
                    handler);

    /**
     * Updates the Decryption Profile with the given name in the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDecryptionProfileResponse> updateDecryptionProfile(
            UpdateDecryptionProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDecryptionProfileRequest, UpdateDecryptionProfileResponse>
                    handler);

    /**
     * Updates the Decryption Rule with the given name in the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDecryptionRuleResponse> updateDecryptionRule(
            UpdateDecryptionRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDecryptionRuleRequest, UpdateDecryptionRuleResponse>
                    handler);

    /**
     * Updates the Mapped Secret with the given name in the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMappedSecretResponse> updateMappedSecret(
            UpdateMappedSecretRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMappedSecretRequest, UpdateMappedSecretResponse>
                    handler);

    /**
     * Updates the NAT Rule with the given name in the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNatRuleResponse> updateNatRule(
            UpdateNatRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateNatRuleRequest, UpdateNatRuleResponse>
                    handler);

    /**
     * Updates the NetworkFirewall
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNetworkFirewallResponse> updateNetworkFirewall(
            UpdateNetworkFirewallRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateNetworkFirewallRequest, UpdateNetworkFirewallResponse>
                    handler);

    /**
     * Updates the NetworkFirewallPolicy
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNetworkFirewallPolicyResponse> updateNetworkFirewallPolicy(
            UpdateNetworkFirewallPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateNetworkFirewallPolicyRequest, UpdateNetworkFirewallPolicyResponse>
                    handler);

    /**
     * Updates the Security Rule with the given name in the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSecurityRuleResponse> updateSecurityRule(
            UpdateSecurityRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityRuleRequest, UpdateSecurityRuleResponse>
                    handler);

    /**
     * Updates the Service with the given name in the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateServiceResponse> updateService(
            UpdateServiceRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateServiceRequest, UpdateServiceResponse>
                    handler);

    /**
     * Updates the ServiceList with the given name in the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateServiceListResponse> updateServiceList(
            UpdateServiceListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateServiceListRequest, UpdateServiceListResponse>
                    handler);

    /**
     * Updates the tunnel inspection rule with the given name in the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTunnelInspectionRuleResponse> updateTunnelInspectionRule(
            UpdateTunnelInspectionRuleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateTunnelInspectionRuleRequest, UpdateTunnelInspectionRuleResponse>
                    handler);

    /**
     * Updates the Url list with the given name in the network firewall policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateUrlListResponse> updateUrlList(
            UpdateUrlListRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateUrlListRequest, UpdateUrlListResponse>
                    handler);
}
