/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Summary about metadata of external key manager to be returned to the customer as a response.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExternalKeyManagerMetadataSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExternalKeyManagerMetadataSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vendor",
        "externalVaultEndpointUrl",
        "privateEndpointId",
        "oauthMetadataSummary"
    })
    public ExternalKeyManagerMetadataSummary(
            String vendor,
            String externalVaultEndpointUrl,
            String privateEndpointId,
            OauthMetadataSummary oauthMetadataSummary) {
        super();
        this.vendor = vendor;
        this.externalVaultEndpointUrl = externalVaultEndpointUrl;
        this.privateEndpointId = privateEndpointId;
        this.oauthMetadataSummary = oauthMetadataSummary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Vendor of the external key manager.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vendor")
        private String vendor;

        /**
         * Vendor of the external key manager.
         * @param vendor the value to set
         * @return this builder
         **/
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            this.__explicitlySet__.add("vendor");
            return this;
        }
        /**
         * URL of the vault on external key manager.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalVaultEndpointUrl")
        private String externalVaultEndpointUrl;

        /**
         * URL of the vault on external key manager.
         * @param externalVaultEndpointUrl the value to set
         * @return this builder
         **/
        public Builder externalVaultEndpointUrl(String externalVaultEndpointUrl) {
            this.externalVaultEndpointUrl = externalVaultEndpointUrl;
            this.__explicitlySet__.add("externalVaultEndpointUrl");
            return this;
        }
        /**
         * OCID of the private endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
        private String privateEndpointId;

        /**
         * OCID of the private endpoint.
         * @param privateEndpointId the value to set
         * @return this builder
         **/
        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = privateEndpointId;
            this.__explicitlySet__.add("privateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oauthMetadataSummary")
        private OauthMetadataSummary oauthMetadataSummary;

        public Builder oauthMetadataSummary(OauthMetadataSummary oauthMetadataSummary) {
            this.oauthMetadataSummary = oauthMetadataSummary;
            this.__explicitlySet__.add("oauthMetadataSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalKeyManagerMetadataSummary build() {
            ExternalKeyManagerMetadataSummary model =
                    new ExternalKeyManagerMetadataSummary(
                            this.vendor,
                            this.externalVaultEndpointUrl,
                            this.privateEndpointId,
                            this.oauthMetadataSummary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalKeyManagerMetadataSummary model) {
            if (model.wasPropertyExplicitlySet("vendor")) {
                this.vendor(model.getVendor());
            }
            if (model.wasPropertyExplicitlySet("externalVaultEndpointUrl")) {
                this.externalVaultEndpointUrl(model.getExternalVaultEndpointUrl());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointId")) {
                this.privateEndpointId(model.getPrivateEndpointId());
            }
            if (model.wasPropertyExplicitlySet("oauthMetadataSummary")) {
                this.oauthMetadataSummary(model.getOauthMetadataSummary());
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
     * Vendor of the external key manager.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vendor")
    private final String vendor;

    /**
     * Vendor of the external key manager.
     * @return the value
     **/
    public String getVendor() {
        return vendor;
    }

    /**
     * URL of the vault on external key manager.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalVaultEndpointUrl")
    private final String externalVaultEndpointUrl;

    /**
     * URL of the vault on external key manager.
     * @return the value
     **/
    public String getExternalVaultEndpointUrl() {
        return externalVaultEndpointUrl;
    }

    /**
     * OCID of the private endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
    private final String privateEndpointId;

    /**
     * OCID of the private endpoint.
     * @return the value
     **/
    public String getPrivateEndpointId() {
        return privateEndpointId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("oauthMetadataSummary")
    private final OauthMetadataSummary oauthMetadataSummary;

    public OauthMetadataSummary getOauthMetadataSummary() {
        return oauthMetadataSummary;
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
        sb.append("ExternalKeyManagerMetadataSummary(");
        sb.append("super=").append(super.toString());
        sb.append("vendor=").append(String.valueOf(this.vendor));
        sb.append(", externalVaultEndpointUrl=")
                .append(String.valueOf(this.externalVaultEndpointUrl));
        sb.append(", privateEndpointId=").append(String.valueOf(this.privateEndpointId));
        sb.append(", oauthMetadataSummary=").append(String.valueOf(this.oauthMetadataSummary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalKeyManagerMetadataSummary)) {
            return false;
        }

        ExternalKeyManagerMetadataSummary other = (ExternalKeyManagerMetadataSummary) o;
        return java.util.Objects.equals(this.vendor, other.vendor)
                && java.util.Objects.equals(
                        this.externalVaultEndpointUrl, other.externalVaultEndpointUrl)
                && java.util.Objects.equals(this.privateEndpointId, other.privateEndpointId)
                && java.util.Objects.equals(this.oauthMetadataSummary, other.oauthMetadataSummary)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vendor == null ? 43 : this.vendor.hashCode());
        result =
                (result * PRIME)
                        + (this.externalVaultEndpointUrl == null
                                ? 43
                                : this.externalVaultEndpointUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointId == null ? 43 : this.privateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.oauthMetadataSummary == null
                                ? 43
                                : this.oauthMetadataSummary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
