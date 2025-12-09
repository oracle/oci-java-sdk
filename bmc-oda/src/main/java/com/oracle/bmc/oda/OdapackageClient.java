/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.oda.requests.*;
import com.oracle.bmc.oda.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class OdapackageClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Odapackage {
    /** Service instance for Odapackage. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OdapackageClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://digitalassistant-api.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OdapackageClient.class);

    private final OdapackagePaginators paginators;

    OdapackageClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new OdapackagePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OdapackageClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "oda";
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
        public OdapackageClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OdapackageClient(this, authenticationDetailsProvider);
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
    public CreateImportedPackageResponse createImportedPackage(
            CreateImportedPackageRequest request) {
        Objects.requireNonNull(
                request.getCreateImportedPackageDetails(),
                "createImportedPackageDetails is required");

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, CreateImportedPackageResponse::builder)
                .logger(LOG, "createImportedPackage")
                .serviceDetails("Odapackage", "CreateImportedPackage", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateImportedPackageRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("importedPackages")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.ImportedPackage.class,
                        CreateImportedPackageResponse.Builder::importedPackage)
                .handleResponseHeaderString(
                        "Location", CreateImportedPackageResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateImportedPackageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateImportedPackageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateImportedPackageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteImportedPackageResponse deleteImportedPackage(
            DeleteImportedPackageRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getPackageId(), "packageId must not be blank");

        return clientCall(request, DeleteImportedPackageResponse::builder)
                .logger(LOG, "deleteImportedPackage")
                .serviceDetails(
                        "Odapackage",
                        "DeleteImportedPackage",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/ImportedPackage/DeleteImportedPackage")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteImportedPackageRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("importedPackages")
                .appendPathParam(request.getPackageId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteImportedPackageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteImportedPackageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetImportedPackageResponse getImportedPackage(GetImportedPackageRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getPackageId(), "packageId must not be blank");

        return clientCall(request, GetImportedPackageResponse::builder)
                .logger(LOG, "getImportedPackage")
                .serviceDetails(
                        "Odapackage",
                        "GetImportedPackage",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/ImportedPackage/GetImportedPackage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetImportedPackageRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("importedPackages")
                .appendPathParam(request.getPackageId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.ImportedPackage.class,
                        GetImportedPackageResponse.Builder::importedPackage)
                .handleResponseHeaderString(
                        "opc-request-id", GetImportedPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetImportedPackageResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetPackageResponse getPackage(GetPackageRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getPackageId(), "packageId must not be blank");

        return clientCall(request, GetPackageResponse::builder)
                .logger(LOG, "getPackage")
                .serviceDetails(
                        "Odapackage",
                        "GetPackage",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/PackageItem/GetPackage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPackageRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("packages")
                .appendPathParam(request.getPackageId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.oda.model.PackageItem.class,
                        GetPackageResponse.Builder::packageItem)
                .handleResponseHeaderString(
                        "opc-request-id", GetPackageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListImportedPackagesResponse listImportedPackages(ListImportedPackagesRequest request) {

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        return clientCall(request, ListImportedPackagesResponse::builder)
                .logger(LOG, "listImportedPackages")
                .serviceDetails(
                        "Odapackage",
                        "ListImportedPackages",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/ImportedPackageSummary/ListImportedPackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListImportedPackagesRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("importedPackages")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.oda.model.ImportedPackageSummary.class,
                        ListImportedPackagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListImportedPackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListImportedPackagesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPackagesResponse listPackages(ListPackagesRequest request) {

        return clientCall(request, ListPackagesResponse::builder)
                .logger(LOG, "listPackages")
                .serviceDetails(
                        "Odapackage",
                        "ListPackages",
                        "https://docs.oracle.com/iaas/api/#/en/digital-assistant/20190506/PackageSummary/ListPackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPackagesRequest::builder)
                .basePath("/20190506")
                .appendPathParam("packages")
                .appendQueryParam("odaInstanceId", request.getOdaInstanceId())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("isLatestVersionOnly", request.getIsLatestVersionOnly())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.oda.model.PackageSummary.class,
                        ListPackagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPackagesResponse.Builder::opcNextPage)
                .handleResponseHeaderInteger(
                        "opc-total-items", ListPackagesResponse.Builder::opcTotalItems)
                .callSync();
    }

    @Override
    public UpdateImportedPackageResponse updateImportedPackage(
            UpdateImportedPackageRequest request) {
        Objects.requireNonNull(
                request.getUpdateImportedPackageDetails(),
                "updateImportedPackageDetails is required");

        Validate.notBlank(request.getOdaInstanceId(), "odaInstanceId must not be blank");

        Validate.notBlank(request.getPackageId(), "packageId must not be blank");

        return clientCall(request, UpdateImportedPackageResponse::builder)
                .logger(LOG, "updateImportedPackage")
                .serviceDetails("Odapackage", "UpdateImportedPackage", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateImportedPackageRequest::builder)
                .basePath("/20190506")
                .appendPathParam("odaInstances")
                .appendPathParam(request.getOdaInstanceId())
                .appendPathParam("importedPackages")
                .appendPathParam(request.getPackageId())
                .appendQueryParam("isReplaceSkills", request.getIsReplaceSkills())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.oda.model.ImportedPackage.class,
                        UpdateImportedPackageResponse.Builder::importedPackage)
                .handleResponseHeaderString(
                        "Location", UpdateImportedPackageResponse.Builder::location)
                .handleResponseHeaderString("etag", UpdateImportedPackageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateImportedPackageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateImportedPackageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public OdapackagePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OdapackageClient(
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
    public OdapackageClient(
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
    public OdapackageClient(
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
    public OdapackageClient(
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
    public OdapackageClient(
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
    public OdapackageClient(
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
    public OdapackageClient(
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
