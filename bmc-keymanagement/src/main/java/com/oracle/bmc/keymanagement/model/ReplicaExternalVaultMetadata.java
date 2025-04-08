/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Metadata of the replica region External Vault <br>
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
        builder = ReplicaExternalVaultMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "vaultType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReplicaExternalVaultMetadata extends ReplicaVaultMetadata {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the EKMS private endpoint in the replica region and must be in ACTIVE state */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
        private String privateEndpointId;

        /**
         * OCID of the EKMS private endpoint in the replica region and must be in ACTIVE state
         *
         * @param privateEndpointId the value to set
         * @return this builder
         */
        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = privateEndpointId;
            this.__explicitlySet__.add("privateEndpointId");
            return this;
        }
        /** Replica region URL of the IDCS domain */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAccountNameUrl")
        private String idcsAccountNameUrl;

        /**
         * Replica region URL of the IDCS domain
         *
         * @param idcsAccountNameUrl the value to set
         * @return this builder
         */
        public Builder idcsAccountNameUrl(String idcsAccountNameUrl) {
            this.idcsAccountNameUrl = idcsAccountNameUrl;
            this.__explicitlySet__.add("idcsAccountNameUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicaExternalVaultMetadata build() {
            ReplicaExternalVaultMetadata model =
                    new ReplicaExternalVaultMetadata(
                            this.privateEndpointId, this.idcsAccountNameUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicaExternalVaultMetadata model) {
            if (model.wasPropertyExplicitlySet("privateEndpointId")) {
                this.privateEndpointId(model.getPrivateEndpointId());
            }
            if (model.wasPropertyExplicitlySet("idcsAccountNameUrl")) {
                this.idcsAccountNameUrl(model.getIdcsAccountNameUrl());
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

    @Deprecated
    public ReplicaExternalVaultMetadata(String privateEndpointId, String idcsAccountNameUrl) {
        super();
        this.privateEndpointId = privateEndpointId;
        this.idcsAccountNameUrl = idcsAccountNameUrl;
    }

    /** OCID of the EKMS private endpoint in the replica region and must be in ACTIVE state */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
    private final String privateEndpointId;

    /**
     * OCID of the EKMS private endpoint in the replica region and must be in ACTIVE state
     *
     * @return the value
     */
    public String getPrivateEndpointId() {
        return privateEndpointId;
    }

    /** Replica region URL of the IDCS domain */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAccountNameUrl")
    private final String idcsAccountNameUrl;

    /**
     * Replica region URL of the IDCS domain
     *
     * @return the value
     */
    public String getIdcsAccountNameUrl() {
        return idcsAccountNameUrl;
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
        sb.append("ReplicaExternalVaultMetadata(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", privateEndpointId=").append(String.valueOf(this.privateEndpointId));
        sb.append(", idcsAccountNameUrl=").append(String.valueOf(this.idcsAccountNameUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicaExternalVaultMetadata)) {
            return false;
        }

        ReplicaExternalVaultMetadata other = (ReplicaExternalVaultMetadata) o;
        return java.util.Objects.equals(this.privateEndpointId, other.privateEndpointId)
                && java.util.Objects.equals(this.idcsAccountNameUrl, other.idcsAccountNameUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.privateEndpointId == null ? 43 : this.privateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAccountNameUrl == null
                                ? 43
                                : this.idcsAccountNameUrl.hashCode());
        return result;
    }
}
