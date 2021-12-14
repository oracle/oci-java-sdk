/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IdentityProvider.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class IdentityProvider {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
        private String tenantName;

        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            this.__explicitlySet__.add("tenantName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("redirectUri")
        private String redirectUri;

        public Builder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            this.__explicitlySet__.add("redirectUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
        private String signingCertificate;

        public Builder signingCertificate(String signingCertificate) {
            this.signingCertificate = signingCertificate;
            this.__explicitlySet__.add("signingCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceProviderEntityId")
        private String serviceProviderEntityId;

        public Builder serviceProviderEntityId(String serviceProviderEntityId) {
            this.serviceProviderEntityId = serviceProviderEntityId;
            this.__explicitlySet__.add("serviceProviderEntityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("forceAuthentication")
        private Boolean forceAuthentication;

        public Builder forceAuthentication(Boolean forceAuthentication) {
            this.forceAuthentication = forceAuthentication;
            this.__explicitlySet__.add("forceAuthentication");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authnContextClassRefs")
        private java.util.List<String> authnContextClassRefs;

        public Builder authnContextClassRefs(java.util.List<String> authnContextClassRefs) {
            this.authnContextClassRefs = authnContextClassRefs;
            this.__explicitlySet__.add("authnContextClassRefs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentityProvider build() {
            IdentityProvider __instance__ =
                    new IdentityProvider(
                            id,
                            name,
                            tenantName,
                            tenantId,
                            redirectUri,
                            signingCertificate,
                            protocol,
                            serviceProviderEntityId,
                            forceAuthentication,
                            authnContextClassRefs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityProvider o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .tenantName(o.getTenantName())
                            .tenantId(o.getTenantId())
                            .redirectUri(o.getRedirectUri())
                            .signingCertificate(o.getSigningCertificate())
                            .protocol(o.getProtocol())
                            .serviceProviderEntityId(o.getServiceProviderEntityId())
                            .forceAuthentication(o.getForceAuthentication())
                            .authnContextClassRefs(o.getAuthnContextClassRefs());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The id of the provider.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The name of the provider.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The name of the tenant.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
    String tenantName;

    /**
     * The id of the tenant.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    String tenantId;

    /**
     * The SAML endpoint where user will be redirected.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUri")
    String redirectUri;

    /**
     * The signing certificate of the provider.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
    String signingCertificate;
    /**
     * The type of the provider.
     **/
    public enum Protocol {
        Saml2("SAML2"),
        ;

        private final String value;
        private static java.util.Map<String, Protocol> map;

        static {
            map = new java.util.HashMap<>();
            for (Protocol v : Protocol.values()) {
                map.put(v.getValue(), v);
            }
        }

        Protocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Protocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Protocol: " + key);
        }
    };
    /**
     * The type of the provider.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    Protocol protocol;

    /**
     * The id of the service provider entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceProviderEntityId")
    String serviceProviderEntityId;

    /**
     * Whether to force authentication.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("forceAuthentication")
    Boolean forceAuthentication;

    /**
     * Authentication context class refs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authnContextClassRefs")
    java.util.List<String> authnContextClassRefs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
