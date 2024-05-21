/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IdentityProvider.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IdentityProvider extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "tenantName",
        "tenantId",
        "redirectUri",
        "signingCertificate",
        "protocol",
        "serviceProviderEntityId",
        "forceAuthentication",
        "authnContextClassRefs"
    })
    public IdentityProvider(
            String id,
            String name,
            String tenantName,
            String tenantId,
            String redirectUri,
            String signingCertificate,
            Protocol protocol,
            String serviceProviderEntityId,
            Boolean forceAuthentication,
            java.util.List<String> authnContextClassRefs) {
        super();
        this.id = id;
        this.name = name;
        this.tenantName = tenantName;
        this.tenantId = tenantId;
        this.redirectUri = redirectUri;
        this.signingCertificate = signingCertificate;
        this.protocol = protocol;
        this.serviceProviderEntityId = serviceProviderEntityId;
        this.forceAuthentication = forceAuthentication;
        this.authnContextClassRefs = authnContextClassRefs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The id of the provider.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The id of the provider.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the provider.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the provider.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The name of the tenant.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
        private String tenantName;

        /**
         * The name of the tenant.
         * @param tenantName the value to set
         * @return this builder
         **/
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            this.__explicitlySet__.add("tenantName");
            return this;
        }
        /**
         * The id of the tenant.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * The id of the tenant.
         * @param tenantId the value to set
         * @return this builder
         **/
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /**
         * The SAML endpoint where user will be redirected.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("redirectUri")
        private String redirectUri;

        /**
         * The SAML endpoint where user will be redirected.
         * @param redirectUri the value to set
         * @return this builder
         **/
        public Builder redirectUri(String redirectUri) {
            this.redirectUri = redirectUri;
            this.__explicitlySet__.add("redirectUri");
            return this;
        }
        /**
         * The signing certificate of the provider.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
        private String signingCertificate;

        /**
         * The signing certificate of the provider.
         * @param signingCertificate the value to set
         * @return this builder
         **/
        public Builder signingCertificate(String signingCertificate) {
            this.signingCertificate = signingCertificate;
            this.__explicitlySet__.add("signingCertificate");
            return this;
        }
        /**
         * The type of the provider.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private Protocol protocol;

        /**
         * The type of the provider.
         * @param protocol the value to set
         * @return this builder
         **/
        public Builder protocol(Protocol protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /**
         * The id of the service provider entity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceProviderEntityId")
        private String serviceProviderEntityId;

        /**
         * The id of the service provider entity.
         * @param serviceProviderEntityId the value to set
         * @return this builder
         **/
        public Builder serviceProviderEntityId(String serviceProviderEntityId) {
            this.serviceProviderEntityId = serviceProviderEntityId;
            this.__explicitlySet__.add("serviceProviderEntityId");
            return this;
        }
        /**
         * Whether to force authentication.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("forceAuthentication")
        private Boolean forceAuthentication;

        /**
         * Whether to force authentication.
         * @param forceAuthentication the value to set
         * @return this builder
         **/
        public Builder forceAuthentication(Boolean forceAuthentication) {
            this.forceAuthentication = forceAuthentication;
            this.__explicitlySet__.add("forceAuthentication");
            return this;
        }
        /**
         * Authentication context class refs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authnContextClassRefs")
        private java.util.List<String> authnContextClassRefs;

        /**
         * Authentication context class refs.
         * @param authnContextClassRefs the value to set
         * @return this builder
         **/
        public Builder authnContextClassRefs(java.util.List<String> authnContextClassRefs) {
            this.authnContextClassRefs = authnContextClassRefs;
            this.__explicitlySet__.add("authnContextClassRefs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentityProvider build() {
            IdentityProvider model =
                    new IdentityProvider(
                            this.id,
                            this.name,
                            this.tenantName,
                            this.tenantId,
                            this.redirectUri,
                            this.signingCertificate,
                            this.protocol,
                            this.serviceProviderEntityId,
                            this.forceAuthentication,
                            this.authnContextClassRefs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityProvider model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("tenantName")) {
                this.tenantName(model.getTenantName());
            }
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("redirectUri")) {
                this.redirectUri(model.getRedirectUri());
            }
            if (model.wasPropertyExplicitlySet("signingCertificate")) {
                this.signingCertificate(model.getSigningCertificate());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("serviceProviderEntityId")) {
                this.serviceProviderEntityId(model.getServiceProviderEntityId());
            }
            if (model.wasPropertyExplicitlySet("forceAuthentication")) {
                this.forceAuthentication(model.getForceAuthentication());
            }
            if (model.wasPropertyExplicitlySet("authnContextClassRefs")) {
                this.authnContextClassRefs(model.getAuthnContextClassRefs());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The id of the provider.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The id of the provider.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the provider.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the provider.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The name of the tenant.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
    private final String tenantName;

    /**
     * The name of the tenant.
     * @return the value
     **/
    public String getTenantName() {
        return tenantName;
    }

    /**
     * The id of the tenant.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * The id of the tenant.
     * @return the value
     **/
    public String getTenantId() {
        return tenantId;
    }

    /**
     * The SAML endpoint where user will be redirected.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("redirectUri")
    private final String redirectUri;

    /**
     * The SAML endpoint where user will be redirected.
     * @return the value
     **/
    public String getRedirectUri() {
        return redirectUri;
    }

    /**
     * The signing certificate of the provider.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingCertificate")
    private final String signingCertificate;

    /**
     * The signing certificate of the provider.
     * @return the value
     **/
    public String getSigningCertificate() {
        return signingCertificate;
    }

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
    private final Protocol protocol;

    /**
     * The type of the provider.
     * @return the value
     **/
    public Protocol getProtocol() {
        return protocol;
    }

    /**
     * The id of the service provider entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceProviderEntityId")
    private final String serviceProviderEntityId;

    /**
     * The id of the service provider entity.
     * @return the value
     **/
    public String getServiceProviderEntityId() {
        return serviceProviderEntityId;
    }

    /**
     * Whether to force authentication.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("forceAuthentication")
    private final Boolean forceAuthentication;

    /**
     * Whether to force authentication.
     * @return the value
     **/
    public Boolean getForceAuthentication() {
        return forceAuthentication;
    }

    /**
     * Authentication context class refs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authnContextClassRefs")
    private final java.util.List<String> authnContextClassRefs;

    /**
     * Authentication context class refs.
     * @return the value
     **/
    public java.util.List<String> getAuthnContextClassRefs() {
        return authnContextClassRefs;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IdentityProvider(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", tenantName=").append(String.valueOf(this.tenantName));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", redirectUri=").append(String.valueOf(this.redirectUri));
        sb.append(", signingCertificate=").append(String.valueOf(this.signingCertificate));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", serviceProviderEntityId=")
                .append(String.valueOf(this.serviceProviderEntityId));
        sb.append(", forceAuthentication=").append(String.valueOf(this.forceAuthentication));
        sb.append(", authnContextClassRefs=").append(String.valueOf(this.authnContextClassRefs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityProvider)) {
            return false;
        }

        IdentityProvider other = (IdentityProvider) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.tenantName, other.tenantName)
                && java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.redirectUri, other.redirectUri)
                && java.util.Objects.equals(this.signingCertificate, other.signingCertificate)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(
                        this.serviceProviderEntityId, other.serviceProviderEntityId)
                && java.util.Objects.equals(this.forceAuthentication, other.forceAuthentication)
                && java.util.Objects.equals(this.authnContextClassRefs, other.authnContextClassRefs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.tenantName == null ? 43 : this.tenantName.hashCode());
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result = (result * PRIME) + (this.redirectUri == null ? 43 : this.redirectUri.hashCode());
        result =
                (result * PRIME)
                        + (this.signingCertificate == null
                                ? 43
                                : this.signingCertificate.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceProviderEntityId == null
                                ? 43
                                : this.serviceProviderEntityId.hashCode());
        result =
                (result * PRIME)
                        + (this.forceAuthentication == null
                                ? 43
                                : this.forceAuthentication.hashCode());
        result =
                (result * PRIME)
                        + (this.authnContextClassRefs == null
                                ? 43
                                : this.authnContextClassRefs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
