/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Model that contains signed marketplace instance metadata and associated signature in JWT form
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MarketplaceExternalAttestedMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MarketplaceExternalAttestedMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"serializedJwt"})
    public MarketplaceExternalAttestedMetadata(String serializedJwt) {
        super();
        this.serializedJwt = serializedJwt;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The serialized JWT token, containing header, payload, signature */
        @com.fasterxml.jackson.annotation.JsonProperty("serializedJwt")
        private String serializedJwt;

        /**
         * The serialized JWT token, containing header, payload, signature
         *
         * @param serializedJwt the value to set
         * @return this builder
         */
        public Builder serializedJwt(String serializedJwt) {
            this.serializedJwt = serializedJwt;
            this.__explicitlySet__.add("serializedJwt");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MarketplaceExternalAttestedMetadata build() {
            MarketplaceExternalAttestedMetadata model =
                    new MarketplaceExternalAttestedMetadata(this.serializedJwt);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MarketplaceExternalAttestedMetadata model) {
            if (model.wasPropertyExplicitlySet("serializedJwt")) {
                this.serializedJwt(model.getSerializedJwt());
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

    /** The serialized JWT token, containing header, payload, signature */
    @com.fasterxml.jackson.annotation.JsonProperty("serializedJwt")
    private final String serializedJwt;

    /**
     * The serialized JWT token, containing header, payload, signature
     *
     * @return the value
     */
    public String getSerializedJwt() {
        return serializedJwt;
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
        sb.append("MarketplaceExternalAttestedMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("serializedJwt=").append(String.valueOf(this.serializedJwt));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MarketplaceExternalAttestedMetadata)) {
            return false;
        }

        MarketplaceExternalAttestedMetadata other = (MarketplaceExternalAttestedMetadata) o;
        return java.util.Objects.equals(this.serializedJwt, other.serializedJwt)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.serializedJwt == null ? 43 : this.serializedJwt.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
