/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Metadata required for accessing External Key manager <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalKeyManagerMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalKeyManagerMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "oauthMetadata",
        "externalVaultEndpointUrl",
        "privateEndpointId"
    })
    public ExternalKeyManagerMetadata(
            OauthMetadata oauthMetadata,
            String externalVaultEndpointUrl,
            String privateEndpointId) {
        super();
        this.oauthMetadata = oauthMetadata;
        this.externalVaultEndpointUrl = externalVaultEndpointUrl;
        this.privateEndpointId = privateEndpointId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("oauthMetadata")
        private OauthMetadata oauthMetadata;

        public Builder oauthMetadata(OauthMetadata oauthMetadata) {
            this.oauthMetadata = oauthMetadata;
            this.__explicitlySet__.add("oauthMetadata");
            return this;
        }
        /** URI of the vault on external key manager. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalVaultEndpointUrl")
        private String externalVaultEndpointUrl;

        /**
         * URI of the vault on external key manager.
         *
         * @param externalVaultEndpointUrl the value to set
         * @return this builder
         */
        public Builder externalVaultEndpointUrl(String externalVaultEndpointUrl) {
            this.externalVaultEndpointUrl = externalVaultEndpointUrl;
            this.__explicitlySet__.add("externalVaultEndpointUrl");
            return this;
        }
        /** OCID of private endpoint created by customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
        private String privateEndpointId;

        /**
         * OCID of private endpoint created by customer.
         *
         * @param privateEndpointId the value to set
         * @return this builder
         */
        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = privateEndpointId;
            this.__explicitlySet__.add("privateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalKeyManagerMetadata build() {
            ExternalKeyManagerMetadata model =
                    new ExternalKeyManagerMetadata(
                            this.oauthMetadata,
                            this.externalVaultEndpointUrl,
                            this.privateEndpointId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalKeyManagerMetadata model) {
            if (model.wasPropertyExplicitlySet("oauthMetadata")) {
                this.oauthMetadata(model.getOauthMetadata());
            }
            if (model.wasPropertyExplicitlySet("externalVaultEndpointUrl")) {
                this.externalVaultEndpointUrl(model.getExternalVaultEndpointUrl());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointId")) {
                this.privateEndpointId(model.getPrivateEndpointId());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("oauthMetadata")
    private final OauthMetadata oauthMetadata;

    public OauthMetadata getOauthMetadata() {
        return oauthMetadata;
    }

    /** URI of the vault on external key manager. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalVaultEndpointUrl")
    private final String externalVaultEndpointUrl;

    /**
     * URI of the vault on external key manager.
     *
     * @return the value
     */
    public String getExternalVaultEndpointUrl() {
        return externalVaultEndpointUrl;
    }

    /** OCID of private endpoint created by customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
    private final String privateEndpointId;

    /**
     * OCID of private endpoint created by customer.
     *
     * @return the value
     */
    public String getPrivateEndpointId() {
        return privateEndpointId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExternalKeyManagerMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("oauthMetadata=").append(String.valueOf(this.oauthMetadata));
        sb.append(", externalVaultEndpointUrl=")
                .append(String.valueOf(this.externalVaultEndpointUrl));
        sb.append(", privateEndpointId=").append(String.valueOf(this.privateEndpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalKeyManagerMetadata)) {
            return false;
        }

        ExternalKeyManagerMetadata other = (ExternalKeyManagerMetadata) o;
        return java.util.Objects.equals(this.oauthMetadata, other.oauthMetadata)
                && java.util.Objects.equals(
                        this.externalVaultEndpointUrl, other.externalVaultEndpointUrl)
                && java.util.Objects.equals(this.privateEndpointId, other.privateEndpointId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.oauthMetadata == null ? 43 : this.oauthMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.externalVaultEndpointUrl == null
                                ? 43
                                : this.externalVaultEndpointUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointId == null ? 43 : this.privateEndpointId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
