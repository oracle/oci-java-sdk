/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import com.google.common.base.Optional;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.internal.AuthUtils;
import com.oracle.bmc.auth.internal.X509FederationClient;
import lombok.Getter;

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
     * The leaf certificate.
     */
    @Getter protected X509CertificateSupplier leafCertificateSupplier;

    /**
     * Tenancy OCI, or null to detect from
     */
    @Getter protected String tenancyId;

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

        this.federationClient =
                new X509FederationClient(
                        federationEndpoint,
                        tenancyId,
                        leafCertificateSupplier,
                        sessionKeySupplierToUse,
                        intermediateCertificateSuppliers,
                        federationClientConfigurator,
                        additionalFederationClientConfigurators);

        return buildProvider(sessionKeySupplierToUse);
    }

    protected void autoDetectUsingMetadataUrl() {
        if (federationEndpoint == null) {
            Client client = ClientBuilder.newClient();
            WebTarget base = client.target(METADATA_SERVICE_BASE_URL + "instance/");
            String regionStr = base.path("region").request(MediaType.TEXT_PLAIN).get(String.class);

            // TODO: we should start using 'canonicalRegionName' instead of 'region' and call
            // Region.fromRegionId, and fall back to 'region' only for backwards compat.
            region = Region.fromRegionCodeOrId(regionStr);

            Optional<String> endpoint = region.getEndpoint(SERVICE);

            if (!endpoint.isPresent()) {
                throw new IllegalArgumentException(
                        "Endpoint for " + SERVICE + " is not known in region " + region);
            } else {
                federationEndpoint = endpoint.get();
            }
        }

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
