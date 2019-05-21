/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import com.google.common.base.Optional;
import com.oracle.bmc.InternalSdk;
import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.internal.AuthUtils;
import com.oracle.bmc.auth.internal.X509FederationClient;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;

/**
 * Abstract builder base class for authentication details provider extending
 * {@link AbstractRequestingAuthenticationDetailsProvider}
 * @param <B> builder class
 * @param <P> provider class
 */
@InternalSdk
@Slf4j
public abstract class AbstractFederationClientAuthenticationDetailsProviderBuilder<
                B extends AbstractFederationClientAuthenticationDetailsProviderBuilder<B, P>,
                P extends AbstractAuthenticationDetailsProvider>
        extends AbstractRequestingAuthenticationDetailsProvider.Builder<B> {

    /**
     * Service instance for auth.
     */
    protected static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("AUTH")
                    .serviceEndpointPrefix("auth")
                    .build();

    /**
     * Base url of metadata service.
     */
    protected static final String METADATA_SERVICE_BASE_URL = "http://169.254.169.254/opc/v1/";

    /**
     * The federation endpoint url.
     */
    @Getter protected String federationEndpoint;

    /**
     * The leaf certificate, or null if detecting from instance metadata.
     */
    @Getter protected X509CertificateSupplier leafCertificateSupplier;

    /**
     * Tenancy OCI, or null if detecting from instance metadata.
     */
    @Getter protected String tenancyId;

    private String purpose = null;

    /**
     * Detected region.
     */
    protected Region region = null;

    /**
     * Configures the custom federationEndpoint to use.
     */
    public B federationEndpoint(String federationEndpoint) {
        this.federationEndpoint = federationEndpoint;
        return (B) this;
    }

    /**
     * Configures the custom leafCertificateSupplier to use.
     */
    public B leafCertificateSupplier(X509CertificateSupplier leafCertificateSupplier) {
        this.leafCertificateSupplier = leafCertificateSupplier;
        return (B) this;
    }

    public B tenancyId(String tenancyId) {
        this.tenancyId = tenancyId;
        return (B) this;
    }

    protected B purpose(String purpose) {
        this.purpose = purpose;
        return (B) this;
    }

    /**
     * Build a new AuthenticationDetailsProvider that uses the FederationCLient.
     *
     * @return A new provider instance.
     */
    public P build() {
        SessionKeySupplier sessionKeySupplierToUse =
                sessionKeySupplier != null
                        ? sessionKeySupplier
                        : new AbstractRequestingAuthenticationDetailsProvider
                                .SessionKeySupplierImpl();

        if (purpose != null) {
            this.federationClient =
                    new X509FederationClient(
                            federationEndpoint,
                            tenancyId,
                            leafCertificateSupplier,
                            sessionKeySupplierToUse,
                            intermediateCertificateSuppliers,
                            federationClientConfigurator,
                            additionalFederationClientConfigurators,
                            purpose);
        } else {
            this.federationClient =
                    new X509FederationClient(
                            federationEndpoint,
                            tenancyId,
                            leafCertificateSupplier,
                            sessionKeySupplierToUse,
                            intermediateCertificateSuppliers,
                            federationClientConfigurator,
                            additionalFederationClientConfigurators);
        }

        return buildProvider(sessionKeySupplierToUse);
    }

    /**
     * Auto-detect endpoint and certificate information using Instance metadata.
     */
    protected void autoDetectUsingMetadataUrl() {
        autoDetectEndpointUsingMetadataUrl();
        autoDetectCertificatesUsingMetadataUrl();
    }

    /**
     * Auto detects the endpoint that should be used when talking to OCI Auth, if no endpoint
     * has been configured already.
     * @return The auto-detected, or currently set, auth endpoint.
     */
    protected String autoDetectEndpointUsingMetadataUrl() {
        if (federationEndpoint == null) {
            Client client = ClientBuilder.newClient();
            WebTarget base = client.target(METADATA_SERVICE_BASE_URL + "instance/");
            String regionStr = base.path("region").request(MediaType.TEXT_PLAIN).get(String.class);
            LOG.info("Looking up region for {}", regionStr);

            try {
                // TODO: we should start using 'canonicalRegionName' instead of 'region' and call
                // Region.fromRegionId, and fall back to 'region' only for backwards compat.
                region = Region.fromRegionCodeOrId(regionStr);
                LOG.info("Using region {}", region.getRegionId());
            } catch (IllegalArgumentException e) {
                LOG.warn(
                        "Region not supported by this version of the SDK, registering region '{}' under OC1",
                        regionStr,
                        e);
                // Proceed by assuming the region id belongs to the OC1 realm.
                region = Region.register(regionStr, Realm.OC1);
            }

            Optional<String> endpoint = region.getEndpoint(SERVICE);

            if (!endpoint.isPresent()) {
                throw new IllegalArgumentException(
                        "Endpoint for " + SERVICE + " is not known in region " + region);
            } else {
                federationEndpoint = endpoint.get();
            }
        }
        return federationEndpoint;
    }

    /**
     * Auto detects and configures the certificates needed using Instance metadata.
     *
     */
    protected void autoDetectCertificatesUsingMetadataUrl() {
        try {
            if (leafCertificateSupplier == null) {
                leafCertificateSupplier =
                        new URLBasedX509CertificateSupplier(
                                new URL(METADATA_SERVICE_BASE_URL + "identity/cert.pem"),
                                new URL(METADATA_SERVICE_BASE_URL + "identity/key.pem"),
                                (char[]) null);
            }

            if (tenancyId == null) {
                tenancyId =
                        AuthUtils.getTenantIdFromCertificate(
                                leafCertificateSupplier
                                        .getCertificateAndKeyPair()
                                        .getCertificate());
            }

            if (intermediateCertificateSuppliers == null) {
                intermediateCertificateSuppliers = new HashSet<>();

                intermediateCertificateSuppliers.add(
                        new URLBasedX509CertificateSupplier(
                                new URL(METADATA_SERVICE_BASE_URL + "identity/intermediate.pem"),
                                null,
                                (char[]) null));
            }
        } catch (MalformedURLException ex) {
            throw new IllegalArgumentException("The metadata service url is invalid.", ex);
        }
    }

    /**
     * Build the actual provider.
     * @param sessionKeySupplierToUse
     * @return authentication details provider
     */
    protected abstract P buildProvider(SessionKeySupplier sessionKeySupplierToUse);
}
