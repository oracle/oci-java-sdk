/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that configure OIDC token authentication in kube-apiserver.
 * For more information, see [Configuring the API Server](https://kubernetes.io/docs/reference/access-authn-authz/authentication/#using-flags).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OpenIdConnectTokenAuthenticationConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OpenIdConnectTokenAuthenticationConfig
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "issuerUrl",
        "clientId",
        "usernameClaim",
        "usernamePrefix",
        "groupsClaim",
        "groupsPrefix",
        "requiredClaims",
        "caCertificate",
        "signingAlgorithms",
        "isOpenIdConnectAuthEnabled",
        "configurationFile"
    })
    public OpenIdConnectTokenAuthenticationConfig(
            String issuerUrl,
            String clientId,
            String usernameClaim,
            String usernamePrefix,
            String groupsClaim,
            String groupsPrefix,
            java.util.List<KeyValue> requiredClaims,
            String caCertificate,
            java.util.List<String> signingAlgorithms,
            Boolean isOpenIdConnectAuthEnabled,
            String configurationFile) {
        super();
        this.issuerUrl = issuerUrl;
        this.clientId = clientId;
        this.usernameClaim = usernameClaim;
        this.usernamePrefix = usernamePrefix;
        this.groupsClaim = groupsClaim;
        this.groupsPrefix = groupsPrefix;
        this.requiredClaims = requiredClaims;
        this.caCertificate = caCertificate;
        this.signingAlgorithms = signingAlgorithms;
        this.isOpenIdConnectAuthEnabled = isOpenIdConnectAuthEnabled;
        this.configurationFile = configurationFile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * URL of the provider that allows the API server to discover public signing keys.
         * Only URLs that use the https:// scheme are accepted. This is typically the provider's discovery URL,
         * changed to have an empty path.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("issuerUrl")
        private String issuerUrl;

        /**
         * URL of the provider that allows the API server to discover public signing keys.
         * Only URLs that use the https:// scheme are accepted. This is typically the provider's discovery URL,
         * changed to have an empty path.
         *
         * @param issuerUrl the value to set
         * @return this builder
         **/
        public Builder issuerUrl(String issuerUrl) {
            this.issuerUrl = issuerUrl;
            this.__explicitlySet__.add("issuerUrl");
            return this;
        }
        /**
         * A client id that all tokens must be issued for.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * A client id that all tokens must be issued for.
         *
         * @param clientId the value to set
         * @return this builder
         **/
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /**
         * JWT claim to use as the user name. By default sub, which is expected to be a unique identifier of the end
         * user. Admins can choose other claims, such as email or name, depending on their provider. However, claims
         * other than email will be prefixed with the issuer URL to prevent naming clashes with other plugins.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usernameClaim")
        private String usernameClaim;

        /**
         * JWT claim to use as the user name. By default sub, which is expected to be a unique identifier of the end
         * user. Admins can choose other claims, such as email or name, depending on their provider. However, claims
         * other than email will be prefixed with the issuer URL to prevent naming clashes with other plugins.
         *
         * @param usernameClaim the value to set
         * @return this builder
         **/
        public Builder usernameClaim(String usernameClaim) {
            this.usernameClaim = usernameClaim;
            this.__explicitlySet__.add("usernameClaim");
            return this;
        }
        /**
         * Prefix prepended to username claims to prevent clashes with existing names (such as system:users).
         * For example, the value oidc: will create usernames like oidc:jane.doe. If this flag isn't provided and
         * --oidc-username-claim is a value other than email the prefix defaults to ( Issuer URL )# where
         * ( Issuer URL ) is the value of --oidc-issuer-url. The value - can be used to disable all prefixing.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usernamePrefix")
        private String usernamePrefix;

        /**
         * Prefix prepended to username claims to prevent clashes with existing names (such as system:users).
         * For example, the value oidc: will create usernames like oidc:jane.doe. If this flag isn't provided and
         * --oidc-username-claim is a value other than email the prefix defaults to ( Issuer URL )# where
         * ( Issuer URL ) is the value of --oidc-issuer-url. The value - can be used to disable all prefixing.
         *
         * @param usernamePrefix the value to set
         * @return this builder
         **/
        public Builder usernamePrefix(String usernamePrefix) {
            this.usernamePrefix = usernamePrefix;
            this.__explicitlySet__.add("usernamePrefix");
            return this;
        }
        /**
         * JWT claim to use as the user's group. If the claim is present it must be an array of strings.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupsClaim")
        private String groupsClaim;

        /**
         * JWT claim to use as the user's group. If the claim is present it must be an array of strings.
         *
         * @param groupsClaim the value to set
         * @return this builder
         **/
        public Builder groupsClaim(String groupsClaim) {
            this.groupsClaim = groupsClaim;
            this.__explicitlySet__.add("groupsClaim");
            return this;
        }
        /**
         * Prefix prepended to group claims to prevent clashes with existing names (such as system:groups).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupsPrefix")
        private String groupsPrefix;

        /**
         * Prefix prepended to group claims to prevent clashes with existing names (such as system:groups).
         *
         * @param groupsPrefix the value to set
         * @return this builder
         **/
        public Builder groupsPrefix(String groupsPrefix) {
            this.groupsPrefix = groupsPrefix;
            this.__explicitlySet__.add("groupsPrefix");
            return this;
        }
        /**
         * A key=value pair that describes a required claim in the ID Token. If set, the claim is verified to be present
         * in the ID Token with a matching value. Repeat this flag to specify multiple claims.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requiredClaims")
        private java.util.List<KeyValue> requiredClaims;

        /**
         * A key=value pair that describes a required claim in the ID Token. If set, the claim is verified to be present
         * in the ID Token with a matching value. Repeat this flag to specify multiple claims.
         *
         * @param requiredClaims the value to set
         * @return this builder
         **/
        public Builder requiredClaims(java.util.List<KeyValue> requiredClaims) {
            this.requiredClaims = requiredClaims;
            this.__explicitlySet__.add("requiredClaims");
            return this;
        }
        /**
         * A Base64 encoded public RSA or ECDSA certificates used to signed your identity provider's web certificate.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
        private String caCertificate;

        /**
         * A Base64 encoded public RSA or ECDSA certificates used to signed your identity provider's web certificate.
         *
         * @param caCertificate the value to set
         * @return this builder
         **/
        public Builder caCertificate(String caCertificate) {
            this.caCertificate = caCertificate;
            this.__explicitlySet__.add("caCertificate");
            return this;
        }
        /**
         * The signing algorithms accepted. Default is ["RS256"].
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithms")
        private java.util.List<String> signingAlgorithms;

        /**
         * The signing algorithms accepted. Default is ["RS256"].
         *
         * @param signingAlgorithms the value to set
         * @return this builder
         **/
        public Builder signingAlgorithms(java.util.List<String> signingAlgorithms) {
            this.signingAlgorithms = signingAlgorithms;
            this.__explicitlySet__.add("signingAlgorithms");
            return this;
        }
        /**
         * Whether the cluster has OIDC Auth Config enabled. Defaults to false.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOpenIdConnectAuthEnabled")
        private Boolean isOpenIdConnectAuthEnabled;

        /**
         * Whether the cluster has OIDC Auth Config enabled. Defaults to false.
         *
         * @param isOpenIdConnectAuthEnabled the value to set
         * @return this builder
         **/
        public Builder isOpenIdConnectAuthEnabled(Boolean isOpenIdConnectAuthEnabled) {
            this.isOpenIdConnectAuthEnabled = isOpenIdConnectAuthEnabled;
            this.__explicitlySet__.add("isOpenIdConnectAuthEnabled");
            return this;
        }
        /**
         * A Base64 encoded string of a Kubernetes OIDC Auth Config file. More info [here](https://kubernetes.io/docs/reference/access-authn-authz/authentication/#using-authentication-configuration)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configurationFile")
        private String configurationFile;

        /**
         * A Base64 encoded string of a Kubernetes OIDC Auth Config file. More info [here](https://kubernetes.io/docs/reference/access-authn-authz/authentication/#using-authentication-configuration)
         *
         * @param configurationFile the value to set
         * @return this builder
         **/
        public Builder configurationFile(String configurationFile) {
            this.configurationFile = configurationFile;
            this.__explicitlySet__.add("configurationFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpenIdConnectTokenAuthenticationConfig build() {
            OpenIdConnectTokenAuthenticationConfig model =
                    new OpenIdConnectTokenAuthenticationConfig(
                            this.issuerUrl,
                            this.clientId,
                            this.usernameClaim,
                            this.usernamePrefix,
                            this.groupsClaim,
                            this.groupsPrefix,
                            this.requiredClaims,
                            this.caCertificate,
                            this.signingAlgorithms,
                            this.isOpenIdConnectAuthEnabled,
                            this.configurationFile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpenIdConnectTokenAuthenticationConfig model) {
            if (model.wasPropertyExplicitlySet("issuerUrl")) {
                this.issuerUrl(model.getIssuerUrl());
            }
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("usernameClaim")) {
                this.usernameClaim(model.getUsernameClaim());
            }
            if (model.wasPropertyExplicitlySet("usernamePrefix")) {
                this.usernamePrefix(model.getUsernamePrefix());
            }
            if (model.wasPropertyExplicitlySet("groupsClaim")) {
                this.groupsClaim(model.getGroupsClaim());
            }
            if (model.wasPropertyExplicitlySet("groupsPrefix")) {
                this.groupsPrefix(model.getGroupsPrefix());
            }
            if (model.wasPropertyExplicitlySet("requiredClaims")) {
                this.requiredClaims(model.getRequiredClaims());
            }
            if (model.wasPropertyExplicitlySet("caCertificate")) {
                this.caCertificate(model.getCaCertificate());
            }
            if (model.wasPropertyExplicitlySet("signingAlgorithms")) {
                this.signingAlgorithms(model.getSigningAlgorithms());
            }
            if (model.wasPropertyExplicitlySet("isOpenIdConnectAuthEnabled")) {
                this.isOpenIdConnectAuthEnabled(model.getIsOpenIdConnectAuthEnabled());
            }
            if (model.wasPropertyExplicitlySet("configurationFile")) {
                this.configurationFile(model.getConfigurationFile());
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
     * URL of the provider that allows the API server to discover public signing keys.
     * Only URLs that use the https:// scheme are accepted. This is typically the provider's discovery URL,
     * changed to have an empty path.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issuerUrl")
    private final String issuerUrl;

    /**
     * URL of the provider that allows the API server to discover public signing keys.
     * Only URLs that use the https:// scheme are accepted. This is typically the provider's discovery URL,
     * changed to have an empty path.
     *
     * @return the value
     **/
    public String getIssuerUrl() {
        return issuerUrl;
    }

    /**
     * A client id that all tokens must be issued for.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * A client id that all tokens must be issued for.
     *
     * @return the value
     **/
    public String getClientId() {
        return clientId;
    }

    /**
     * JWT claim to use as the user name. By default sub, which is expected to be a unique identifier of the end
     * user. Admins can choose other claims, such as email or name, depending on their provider. However, claims
     * other than email will be prefixed with the issuer URL to prevent naming clashes with other plugins.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usernameClaim")
    private final String usernameClaim;

    /**
     * JWT claim to use as the user name. By default sub, which is expected to be a unique identifier of the end
     * user. Admins can choose other claims, such as email or name, depending on their provider. However, claims
     * other than email will be prefixed with the issuer URL to prevent naming clashes with other plugins.
     *
     * @return the value
     **/
    public String getUsernameClaim() {
        return usernameClaim;
    }

    /**
     * Prefix prepended to username claims to prevent clashes with existing names (such as system:users).
     * For example, the value oidc: will create usernames like oidc:jane.doe. If this flag isn't provided and
     * --oidc-username-claim is a value other than email the prefix defaults to ( Issuer URL )# where
     * ( Issuer URL ) is the value of --oidc-issuer-url. The value - can be used to disable all prefixing.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usernamePrefix")
    private final String usernamePrefix;

    /**
     * Prefix prepended to username claims to prevent clashes with existing names (such as system:users).
     * For example, the value oidc: will create usernames like oidc:jane.doe. If this flag isn't provided and
     * --oidc-username-claim is a value other than email the prefix defaults to ( Issuer URL )# where
     * ( Issuer URL ) is the value of --oidc-issuer-url. The value - can be used to disable all prefixing.
     *
     * @return the value
     **/
    public String getUsernamePrefix() {
        return usernamePrefix;
    }

    /**
     * JWT claim to use as the user's group. If the claim is present it must be an array of strings.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupsClaim")
    private final String groupsClaim;

    /**
     * JWT claim to use as the user's group. If the claim is present it must be an array of strings.
     *
     * @return the value
     **/
    public String getGroupsClaim() {
        return groupsClaim;
    }

    /**
     * Prefix prepended to group claims to prevent clashes with existing names (such as system:groups).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupsPrefix")
    private final String groupsPrefix;

    /**
     * Prefix prepended to group claims to prevent clashes with existing names (such as system:groups).
     *
     * @return the value
     **/
    public String getGroupsPrefix() {
        return groupsPrefix;
    }

    /**
     * A key=value pair that describes a required claim in the ID Token. If set, the claim is verified to be present
     * in the ID Token with a matching value. Repeat this flag to specify multiple claims.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requiredClaims")
    private final java.util.List<KeyValue> requiredClaims;

    /**
     * A key=value pair that describes a required claim in the ID Token. If set, the claim is verified to be present
     * in the ID Token with a matching value. Repeat this flag to specify multiple claims.
     *
     * @return the value
     **/
    public java.util.List<KeyValue> getRequiredClaims() {
        return requiredClaims;
    }

    /**
     * A Base64 encoded public RSA or ECDSA certificates used to signed your identity provider's web certificate.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
    private final String caCertificate;

    /**
     * A Base64 encoded public RSA or ECDSA certificates used to signed your identity provider's web certificate.
     *
     * @return the value
     **/
    public String getCaCertificate() {
        return caCertificate;
    }

    /**
     * The signing algorithms accepted. Default is ["RS256"].
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithms")
    private final java.util.List<String> signingAlgorithms;

    /**
     * The signing algorithms accepted. Default is ["RS256"].
     *
     * @return the value
     **/
    public java.util.List<String> getSigningAlgorithms() {
        return signingAlgorithms;
    }

    /**
     * Whether the cluster has OIDC Auth Config enabled. Defaults to false.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOpenIdConnectAuthEnabled")
    private final Boolean isOpenIdConnectAuthEnabled;

    /**
     * Whether the cluster has OIDC Auth Config enabled. Defaults to false.
     *
     * @return the value
     **/
    public Boolean getIsOpenIdConnectAuthEnabled() {
        return isOpenIdConnectAuthEnabled;
    }

    /**
     * A Base64 encoded string of a Kubernetes OIDC Auth Config file. More info [here](https://kubernetes.io/docs/reference/access-authn-authz/authentication/#using-authentication-configuration)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurationFile")
    private final String configurationFile;

    /**
     * A Base64 encoded string of a Kubernetes OIDC Auth Config file. More info [here](https://kubernetes.io/docs/reference/access-authn-authz/authentication/#using-authentication-configuration)
     *
     * @return the value
     **/
    public String getConfigurationFile() {
        return configurationFile;
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
        sb.append("OpenIdConnectTokenAuthenticationConfig(");
        sb.append("super=").append(super.toString());
        sb.append("issuerUrl=").append(String.valueOf(this.issuerUrl));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", usernameClaim=").append(String.valueOf(this.usernameClaim));
        sb.append(", usernamePrefix=").append(String.valueOf(this.usernamePrefix));
        sb.append(", groupsClaim=").append(String.valueOf(this.groupsClaim));
        sb.append(", groupsPrefix=").append(String.valueOf(this.groupsPrefix));
        sb.append(", requiredClaims=").append(String.valueOf(this.requiredClaims));
        sb.append(", caCertificate=").append(String.valueOf(this.caCertificate));
        sb.append(", signingAlgorithms=").append(String.valueOf(this.signingAlgorithms));
        sb.append(", isOpenIdConnectAuthEnabled=")
                .append(String.valueOf(this.isOpenIdConnectAuthEnabled));
        sb.append(", configurationFile=").append(String.valueOf(this.configurationFile));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpenIdConnectTokenAuthenticationConfig)) {
            return false;
        }

        OpenIdConnectTokenAuthenticationConfig other = (OpenIdConnectTokenAuthenticationConfig) o;
        return java.util.Objects.equals(this.issuerUrl, other.issuerUrl)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.usernameClaim, other.usernameClaim)
                && java.util.Objects.equals(this.usernamePrefix, other.usernamePrefix)
                && java.util.Objects.equals(this.groupsClaim, other.groupsClaim)
                && java.util.Objects.equals(this.groupsPrefix, other.groupsPrefix)
                && java.util.Objects.equals(this.requiredClaims, other.requiredClaims)
                && java.util.Objects.equals(this.caCertificate, other.caCertificate)
                && java.util.Objects.equals(this.signingAlgorithms, other.signingAlgorithms)
                && java.util.Objects.equals(
                        this.isOpenIdConnectAuthEnabled, other.isOpenIdConnectAuthEnabled)
                && java.util.Objects.equals(this.configurationFile, other.configurationFile)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.issuerUrl == null ? 43 : this.issuerUrl.hashCode());
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result =
                (result * PRIME)
                        + (this.usernameClaim == null ? 43 : this.usernameClaim.hashCode());
        result =
                (result * PRIME)
                        + (this.usernamePrefix == null ? 43 : this.usernamePrefix.hashCode());
        result = (result * PRIME) + (this.groupsClaim == null ? 43 : this.groupsClaim.hashCode());
        result = (result * PRIME) + (this.groupsPrefix == null ? 43 : this.groupsPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.requiredClaims == null ? 43 : this.requiredClaims.hashCode());
        result =
                (result * PRIME)
                        + (this.caCertificate == null ? 43 : this.caCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.signingAlgorithms == null ? 43 : this.signingAlgorithms.hashCode());
        result =
                (result * PRIME)
                        + (this.isOpenIdConnectAuthEnabled == null
                                ? 43
                                : this.isOpenIdConnectAuthEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationFile == null ? 43 : this.configurationFile.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
