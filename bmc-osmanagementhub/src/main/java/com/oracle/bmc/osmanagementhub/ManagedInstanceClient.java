/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ManagedInstanceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ManagedInstance {
    /** Service instance for ManagedInstance. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MANAGEDINSTANCE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://osmh.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ManagedInstanceClient.class);

    private final ManagedInstancePaginators paginators;

    ManagedInstanceClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new ManagedInstancePaginators(this);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ManagedInstanceClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "osmanagementhub";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public ManagedInstanceClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ManagedInstanceClient(this, authenticationDetailsProvider);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public AssociateManagedInstancesWithManagementStationResponse
            associateManagedInstancesWithManagementStation(
                    AssociateManagedInstancesWithManagementStationRequest request) {

        Validate.notBlank(
                request.getManagementStationId(), "managementStationId must not be blank");
        Objects.requireNonNull(
                request.getAssociateManagedInstancesWithManagementStationDetails(),
                "associateManagedInstancesWithManagementStationDetails is required");

        return clientCall(request, AssociateManagedInstancesWithManagementStationResponse::builder)
                .logger(LOG, "associateManagedInstancesWithManagementStation")
                .serviceDetails(
                        "ManagedInstance",
                        "AssociateManagedInstancesWithManagementStation",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/AssociateManagedInstancesWithManagementStation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AssociateManagedInstancesWithManagementStationRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managementStations")
                .appendPathParam(request.getManagementStationId())
                .appendPathParam("actions")
                .appendPathParam("associateManagedInstances")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AssociateManagedInstancesWithManagementStationResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AssociateManagedInstancesWithManagementStationResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public AttachProfileToManagedInstanceResponse attachProfileToManagedInstance(
            AttachProfileToManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getAttachProfileToManagedInstanceDetails(),
                "attachProfileToManagedInstanceDetails is required");

        return clientCall(request, AttachProfileToManagedInstanceResponse::builder)
                .logger(LOG, "attachProfileToManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "AttachProfileToManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/AttachProfileToManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachProfileToManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("attachProfile")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachProfileToManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AttachSoftwareSourcesToManagedInstanceResponse attachSoftwareSourcesToManagedInstance(
            AttachSoftwareSourcesToManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getAttachSoftwareSourcesToManagedInstanceDetails(),
                "attachSoftwareSourcesToManagedInstanceDetails is required");

        return clientCall(request, AttachSoftwareSourcesToManagedInstanceResponse::builder)
                .logger(LOG, "attachSoftwareSourcesToManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "AttachSoftwareSourcesToManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/AttachSoftwareSourcesToManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachSoftwareSourcesToManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("attachSoftwareSources")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AttachSoftwareSourcesToManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachSoftwareSourcesToManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteManagedInstanceResponse deleteManagedInstance(
            DeleteManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, DeleteManagedInstanceResponse::builder)
                .logger(LOG, "deleteManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "DeleteManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/DeleteManagedInstance")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DetachProfileFromManagedInstanceResponse detachProfileFromManagedInstance(
            DetachProfileFromManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, DetachProfileFromManagedInstanceResponse::builder)
                .logger(LOG, "detachProfileFromManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "DetachProfileFromManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/DetachProfileFromManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachProfileFromManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("detachProfile")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachProfileFromManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DetachSoftwareSourcesFromManagedInstanceResponse
            detachSoftwareSourcesFromManagedInstance(
                    DetachSoftwareSourcesFromManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getDetachSoftwareSourcesFromManagedInstanceDetails(),
                "detachSoftwareSourcesFromManagedInstanceDetails is required");

        return clientCall(request, DetachSoftwareSourcesFromManagedInstanceResponse::builder)
                .logger(LOG, "detachSoftwareSourcesFromManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "DetachSoftwareSourcesFromManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/DetachSoftwareSourcesFromManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachSoftwareSourcesFromManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("detachSoftwareSources")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DetachSoftwareSourcesFromManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachSoftwareSourcesFromManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DisableModuleStreamOnManagedInstanceResponse disableModuleStreamOnManagedInstance(
            DisableModuleStreamOnManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getDisableModuleStreamOnManagedInstanceDetails(),
                "disableModuleStreamOnManagedInstanceDetails is required");

        return clientCall(request, DisableModuleStreamOnManagedInstanceResponse::builder)
                .logger(LOG, "disableModuleStreamOnManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "DisableModuleStreamOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/DisableModuleStreamOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableModuleStreamOnManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("disableModuleStreams")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableModuleStreamOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableModuleStreamOnManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EnableModuleStreamOnManagedInstanceResponse enableModuleStreamOnManagedInstance(
            EnableModuleStreamOnManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getEnableModuleStreamOnManagedInstanceDetails(),
                "enableModuleStreamOnManagedInstanceDetails is required");

        return clientCall(request, EnableModuleStreamOnManagedInstanceResponse::builder)
                .logger(LOG, "enableModuleStreamOnManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "EnableModuleStreamOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/EnableModuleStreamOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableModuleStreamOnManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("enableModuleStreams")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableModuleStreamOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableModuleStreamOnManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetManagedInstanceResponse getManagedInstance(GetManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, GetManagedInstanceResponse::builder)
                .logger(LOG, "getManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "GetManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/GetManagedInstance")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagedInstance.class,
                        GetManagedInstanceResponse.Builder::managedInstance)
                .handleResponseHeaderString("etag", GetManagedInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetManagedInstanceResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetManagedInstanceResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public GetWindowsUpdateResponse getWindowsUpdate(GetWindowsUpdateRequest request) {

        Validate.notBlank(request.getWindowsUpdateId(), "windowsUpdateId must not be blank");

        return clientCall(request, GetWindowsUpdateResponse::builder)
                .logger(LOG, "getWindowsUpdate")
                .serviceDetails(
                        "ManagedInstance",
                        "GetWindowsUpdate",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/WindowsUpdate/GetWindowsUpdate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWindowsUpdateRequest::builder)
                .basePath("/20220901")
                .appendPathParam("windowsUpdates")
                .appendPathParam(request.getWindowsUpdateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.WindowsUpdate.class,
                        GetWindowsUpdateResponse.Builder::windowsUpdate)
                .handleResponseHeaderString(
                        "opc-request-id", GetWindowsUpdateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse
            installAllWindowsUpdatesOnManagedInstancesInCompartment(
                    InstallAllWindowsUpdatesOnManagedInstancesInCompartmentRequest request) {
        Objects.requireNonNull(
                request.getInstallAllWindowsUpdatesOnManagedInstancesInCompartmentDetails(),
                "installAllWindowsUpdatesOnManagedInstancesInCompartmentDetails is required");

        return clientCall(
                        request,
                        InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse::builder)
                .logger(LOG, "installAllWindowsUpdatesOnManagedInstancesInCompartment")
                .serviceDetails(
                        "ManagedInstance",
                        "InstallAllWindowsUpdatesOnManagedInstancesInCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/InstallAllWindowsUpdatesOnManagedInstancesInCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        InstallAllWindowsUpdatesOnManagedInstancesInCompartmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam("actions")
                .appendPathParam("installWindowsUpdates")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public InstallModuleStreamProfileOnManagedInstanceResponse
            installModuleStreamProfileOnManagedInstance(
                    InstallModuleStreamProfileOnManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getInstallModuleStreamProfileOnManagedInstanceDetails(),
                "installModuleStreamProfileOnManagedInstanceDetails is required");

        return clientCall(request, InstallModuleStreamProfileOnManagedInstanceResponse::builder)
                .logger(LOG, "installModuleStreamProfileOnManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "InstallModuleStreamProfileOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/InstallModuleStreamProfileOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallModuleStreamProfileOnManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("installStreamProfiles")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallModuleStreamProfileOnManagedInstanceResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallModuleStreamProfileOnManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public InstallPackagesOnManagedInstanceResponse installPackagesOnManagedInstance(
            InstallPackagesOnManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getInstallPackagesOnManagedInstanceDetails(),
                "installPackagesOnManagedInstanceDetails is required");

        return clientCall(request, InstallPackagesOnManagedInstanceResponse::builder)
                .logger(LOG, "installPackagesOnManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "InstallPackagesOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/InstallPackagesOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallPackagesOnManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("installPackages")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallPackagesOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallPackagesOnManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public InstallWindowsUpdatesOnManagedInstanceResponse installWindowsUpdatesOnManagedInstance(
            InstallWindowsUpdatesOnManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getInstallWindowsUpdatesOnManagedInstanceDetails(),
                "installWindowsUpdatesOnManagedInstanceDetails is required");

        return clientCall(request, InstallWindowsUpdatesOnManagedInstanceResponse::builder)
                .logger(LOG, "installWindowsUpdatesOnManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "InstallWindowsUpdatesOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/InstallWindowsUpdatesOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InstallWindowsUpdatesOnManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("installWindowsUpdates")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        InstallWindowsUpdatesOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        InstallWindowsUpdatesOnManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListManagedInstanceAvailablePackagesResponse listManagedInstanceAvailablePackages(
            ListManagedInstanceAvailablePackagesRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListManagedInstanceAvailablePackagesResponse::builder)
                .logger(LOG, "listManagedInstanceAvailablePackages")
                .serviceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceAvailablePackages",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceAvailablePackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceAvailablePackagesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("availablePackages")
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.AvailablePackageCollection.class,
                        ListManagedInstanceAvailablePackagesResponse.Builder
                                ::availablePackageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstanceAvailablePackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstanceAvailablePackagesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagedInstanceAvailableSoftwareSourcesResponse
            listManagedInstanceAvailableSoftwareSources(
                    ListManagedInstanceAvailableSoftwareSourcesRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListManagedInstanceAvailableSoftwareSourcesResponse::builder)
                .logger(LOG, "listManagedInstanceAvailableSoftwareSources")
                .serviceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceAvailableSoftwareSources",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceAvailableSoftwareSources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceAvailableSoftwareSourcesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("availableSoftwareSources")
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.AvailableSoftwareSourceCollection
                                .class,
                        ListManagedInstanceAvailableSoftwareSourcesResponse.Builder
                                ::availableSoftwareSourceCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstanceAvailableSoftwareSourcesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstanceAvailableSoftwareSourcesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagedInstanceAvailableWindowsUpdatesResponse
            listManagedInstanceAvailableWindowsUpdates(
                    ListManagedInstanceAvailableWindowsUpdatesRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListManagedInstanceAvailableWindowsUpdatesResponse::builder)
                .logger(LOG, "listManagedInstanceAvailableWindowsUpdates")
                .serviceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceAvailableWindowsUpdates",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceAvailableWindowsUpdates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceAvailableWindowsUpdatesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("availableWindowsUpdates")
                .appendListQueryParam(
                        "classificationType",
                        request.getClassificationType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendEnumQueryParam("isInstallable", request.getIsInstallable())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.AvailableWindowsUpdateCollection.class,
                        ListManagedInstanceAvailableWindowsUpdatesResponse.Builder
                                ::availableWindowsUpdateCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstanceAvailableWindowsUpdatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstanceAvailableWindowsUpdatesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagedInstanceErrataResponse listManagedInstanceErrata(
            ListManagedInstanceErrataRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListManagedInstanceErrataResponse::builder)
                .logger(LOG, "listManagedInstanceErrata")
                .serviceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceErrata",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceErrata")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceErrataRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("errata")
                .appendListQueryParam(
                        "classificationType",
                        request.getClassificationType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("nameContains", request.getNameContains())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagedInstanceErratumSummaryCollection
                                .class,
                        ListManagedInstanceErrataResponse.Builder
                                ::managedInstanceErratumSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedInstanceErrataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedInstanceErrataResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagedInstanceInstalledPackagesResponse listManagedInstanceInstalledPackages(
            ListManagedInstanceInstalledPackagesRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListManagedInstanceInstalledPackagesResponse::builder)
                .logger(LOG, "listManagedInstanceInstalledPackages")
                .serviceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceInstalledPackages",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceInstalledPackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceInstalledPackagesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("installedPackages")
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("timeInstallDateStart", request.getTimeInstallDateStart())
                .appendQueryParam("timeInstallDateEnd", request.getTimeInstallDateEnd())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.InstalledPackageCollection.class,
                        ListManagedInstanceInstalledPackagesResponse.Builder
                                ::installedPackageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstanceInstalledPackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstanceInstalledPackagesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagedInstanceInstalledWindowsUpdatesResponse
            listManagedInstanceInstalledWindowsUpdates(
                    ListManagedInstanceInstalledWindowsUpdatesRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListManagedInstanceInstalledWindowsUpdatesResponse::builder)
                .logger(LOG, "listManagedInstanceInstalledWindowsUpdates")
                .serviceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceInstalledWindowsUpdates",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceInstalledWindowsUpdates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceInstalledWindowsUpdatesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("installedWindowsUpdates")
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.InstalledWindowsUpdateCollection.class,
                        ListManagedInstanceInstalledWindowsUpdatesResponse.Builder
                                ::installedWindowsUpdateCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstanceInstalledWindowsUpdatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstanceInstalledWindowsUpdatesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagedInstanceModulesResponse listManagedInstanceModules(
            ListManagedInstanceModulesRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListManagedInstanceModulesResponse::builder)
                .logger(LOG, "listManagedInstanceModules")
                .serviceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceModules",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceModules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceModulesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("modules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("nameContains", request.getNameContains())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagedInstanceModuleCollection.class,
                        ListManagedInstanceModulesResponse.Builder::managedInstanceModuleCollection)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ListManagedInstanceModulesResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedInstanceModulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedInstanceModulesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagedInstanceUpdatablePackagesResponse listManagedInstanceUpdatablePackages(
            ListManagedInstanceUpdatablePackagesRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, ListManagedInstanceUpdatablePackagesResponse::builder)
                .logger(LOG, "listManagedInstanceUpdatablePackages")
                .serviceDetails(
                        "ManagedInstance",
                        "ListManagedInstanceUpdatablePackages",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstanceUpdatablePackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstanceUpdatablePackagesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("updatablePackages")
                .appendListQueryParam(
                        "classificationType",
                        request.getClassificationType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendListQueryParam(
                        "advisoryName",
                        request.getAdvisoryName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.UpdatablePackageCollection.class,
                        ListManagedInstanceUpdatablePackagesResponse.Builder
                                ::updatablePackageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListManagedInstanceUpdatablePackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListManagedInstanceUpdatablePackagesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListManagedInstancesResponse listManagedInstances(ListManagedInstancesRequest request) {

        return clientCall(request, ListManagedInstancesResponse::builder)
                .logger(LOG, "listManagedInstances")
                .serviceDetails(
                        "ManagedInstance",
                        "ListManagedInstances",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ListManagedInstances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListManagedInstancesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "displayName",
                        request.getDisplayName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("managedInstanceId", request.getManagedInstanceId())
                .appendListQueryParam(
                        "status",
                        request.getStatus(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "archType",
                        request.getArchType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "osFamily",
                        request.getOsFamily(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isManagementStation", request.getIsManagementStation())
                .appendQueryParam("group", request.getGroup())
                .appendQueryParam("groupNotEqualTo", request.getGroupNotEqualTo())
                .appendQueryParam("lifecycleStage", request.getLifecycleStage())
                .appendQueryParam("lifecycleStageNotEqualTo", request.getLifecycleStageNotEqualTo())
                .appendQueryParam(
                        "isAttachedToGroupOrLifecycleStage",
                        request.getIsAttachedToGroupOrLifecycleStage())
                .appendQueryParam("softwareSourceId", request.getSoftwareSourceId())
                .appendListQueryParam(
                        "advisoryName",
                        request.getAdvisoryName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("lifecycleEnvironment", request.getLifecycleEnvironment())
                .appendQueryParam(
                        "lifecycleEnvironmentNotEqualTo",
                        request.getLifecycleEnvironmentNotEqualTo())
                .appendListQueryParam(
                        "location",
                        request.getLocation(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "locationNotEqualTo",
                        request.getLocationNotEqualTo(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "profile",
                        request.getProfile(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "profileNotEqualTo",
                        request.getProfileNotEqualTo(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isProfileAttached", request.getIsProfileAttached())
                .appendQueryParam(
                        "isManagedByAutonomousLinux", request.getIsManagedByAutonomousLinux())
                .appendQueryParam("agentVersion", request.getAgentVersion())
                .appendListQueryParam(
                        "managementStation",
                        request.getManagementStation(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "managementStationNotEqualTo",
                        request.getManagementStationNotEqualTo(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isRebootRequired", request.getIsRebootRequired())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagedInstanceCollection.class,
                        ListManagedInstancesResponse.Builder::managedInstanceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListManagedInstancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListManagedInstancesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListManagedInstancesResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public ListWindowsUpdatesResponse listWindowsUpdates(ListWindowsUpdatesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWindowsUpdatesResponse::builder)
                .logger(LOG, "listWindowsUpdates")
                .serviceDetails(
                        "ManagedInstance",
                        "ListWindowsUpdates",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/WindowsUpdateCollection/ListWindowsUpdates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWindowsUpdatesRequest::builder)
                .basePath("/20220901")
                .appendPathParam("windowsUpdates")
                .appendListQueryParam(
                        "classificationType",
                        request.getClassificationType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("displayNameContains", request.getDisplayNameContains())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.WindowsUpdateCollection.class,
                        ListWindowsUpdatesResponse.Builder::windowsUpdateCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWindowsUpdatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWindowsUpdatesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ManageModuleStreamsOnManagedInstanceResponse manageModuleStreamsOnManagedInstance(
            ManageModuleStreamsOnManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getManageModuleStreamsOnManagedInstanceDetails(),
                "manageModuleStreamsOnManagedInstanceDetails is required");

        return clientCall(request, ManageModuleStreamsOnManagedInstanceResponse::builder)
                .logger(LOG, "manageModuleStreamsOnManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "ManageModuleStreamsOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/ManageModuleStreamsOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ManageModuleStreamsOnManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("manageModuleStreams")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ManageModuleStreamsOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ManageModuleStreamsOnManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RebootManagedInstanceResponse rebootManagedInstance(
            RebootManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getRebootManagedInstanceDetails(),
                "rebootManagedInstanceDetails is required");

        return clientCall(request, RebootManagedInstanceResponse::builder)
                .logger(LOG, "rebootManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "RebootManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/RebootManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RebootManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("reboot")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RebootManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RebootManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RefreshSoftwareOnManagedInstanceResponse refreshSoftwareOnManagedInstance(
            RefreshSoftwareOnManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");

        return clientCall(request, RefreshSoftwareOnManagedInstanceResponse::builder)
                .logger(LOG, "refreshSoftwareOnManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "RefreshSoftwareOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/RefreshSoftwareOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshSoftwareOnManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("refreshSoftware")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshSoftwareOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RefreshSoftwareOnManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoveModuleStreamProfileFromManagedInstanceResponse
            removeModuleStreamProfileFromManagedInstance(
                    RemoveModuleStreamProfileFromManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getRemoveModuleStreamProfileFromManagedInstanceDetails(),
                "removeModuleStreamProfileFromManagedInstanceDetails is required");

        return clientCall(request, RemoveModuleStreamProfileFromManagedInstanceResponse::builder)
                .logger(LOG, "removeModuleStreamProfileFromManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "RemoveModuleStreamProfileFromManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/RemoveModuleStreamProfileFromManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveModuleStreamProfileFromManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("removeStreamProfiles")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveModuleStreamProfileFromManagedInstanceResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveModuleStreamProfileFromManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemovePackagesFromManagedInstanceResponse removePackagesFromManagedInstance(
            RemovePackagesFromManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getRemovePackagesFromManagedInstanceDetails(),
                "removePackagesFromManagedInstanceDetails is required");

        return clientCall(request, RemovePackagesFromManagedInstanceResponse::builder)
                .logger(LOG, "removePackagesFromManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "RemovePackagesFromManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/RemovePackagesFromManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemovePackagesFromManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("removePackages")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemovePackagesFromManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemovePackagesFromManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SwitchModuleStreamOnManagedInstanceResponse switchModuleStreamOnManagedInstance(
            SwitchModuleStreamOnManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getSwitchModuleStreamOnManagedInstanceDetails(),
                "switchModuleStreamOnManagedInstanceDetails is required");

        return clientCall(request, SwitchModuleStreamOnManagedInstanceResponse::builder)
                .logger(LOG, "switchModuleStreamOnManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "SwitchModuleStreamOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/SwitchModuleStreamOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SwitchModuleStreamOnManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("switchModuleStreams")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SwitchModuleStreamOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SwitchModuleStreamOnManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateAllPackagesOnManagedInstancesInCompartmentResponse
            updateAllPackagesOnManagedInstancesInCompartment(
                    UpdateAllPackagesOnManagedInstancesInCompartmentRequest request) {
        Objects.requireNonNull(
                request.getUpdateAllPackagesOnManagedInstancesInCompartmentDetails(),
                "updateAllPackagesOnManagedInstancesInCompartmentDetails is required");

        return clientCall(
                        request, UpdateAllPackagesOnManagedInstancesInCompartmentResponse::builder)
                .logger(LOG, "updateAllPackagesOnManagedInstancesInCompartment")
                .serviceDetails(
                        "ManagedInstance",
                        "UpdateAllPackagesOnManagedInstancesInCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/UpdateAllPackagesOnManagedInstancesInCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdateAllPackagesOnManagedInstancesInCompartmentRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam("actions")
                .appendPathParam("updatePackages")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAllPackagesOnManagedInstancesInCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAllPackagesOnManagedInstancesInCompartmentResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateManagedInstanceResponse updateManagedInstance(
            UpdateManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdateManagedInstanceDetails(),
                "updateManagedInstanceDetails is required");

        return clientCall(request, UpdateManagedInstanceResponse::builder)
                .logger(LOG, "updateManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "UpdateManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/UpdateManagedInstance")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.osmanagementhub.model.ManagedInstance.class,
                        UpdateManagedInstanceResponse.Builder::managedInstance)
                .handleResponseHeaderString("etag", UpdateManagedInstanceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePackagesOnManagedInstanceResponse updatePackagesOnManagedInstance(
            UpdatePackagesOnManagedInstanceRequest request) {

        Validate.notBlank(request.getManagedInstanceId(), "managedInstanceId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePackagesOnManagedInstanceDetails(),
                "updatePackagesOnManagedInstanceDetails is required");

        return clientCall(request, UpdatePackagesOnManagedInstanceResponse::builder)
                .logger(LOG, "updatePackagesOnManagedInstance")
                .serviceDetails(
                        "ManagedInstance",
                        "UpdatePackagesOnManagedInstance",
                        "https://docs.oracle.com/iaas/api/#/en/osmh/20220901/ManagedInstance/UpdatePackagesOnManagedInstance")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpdatePackagesOnManagedInstanceRequest::builder)
                .basePath("/20220901")
                .appendPathParam("managedInstances")
                .appendPathParam(request.getManagedInstanceId())
                .appendPathParam("actions")
                .appendPathParam("updatePackages")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePackagesOnManagedInstanceResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdatePackagesOnManagedInstanceResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ManagedInstancePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagedInstanceClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagedInstanceClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagedInstanceClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagedInstanceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagedInstanceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagedInstanceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ManagedInstanceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider);
    }
}
