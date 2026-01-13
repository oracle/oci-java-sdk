/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * Details for the source that the source secret has. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SourceRegionInformation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SourceRegionInformation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceKeyId", "sourceRegion", "sourceVaultId"})
    public SourceRegionInformation(String sourceKeyId, String sourceRegion, String sourceVaultId) {
        super();
        this.sourceKeyId = sourceKeyId;
        this.sourceRegion = sourceRegion;
        this.sourceVaultId = sourceVaultId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the source region KMS key. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceKeyId")
        private String sourceKeyId;

        /**
         * The OCID of the source region KMS key.
         *
         * @param sourceKeyId the value to set
         * @return this builder
         */
        public Builder sourceKeyId(String sourceKeyId) {
            this.sourceKeyId = sourceKeyId;
            this.__explicitlySet__.add("sourceKeyId");
            return this;
        }
        /** The name of the source's region. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceRegion")
        private String sourceRegion;

        /**
         * The name of the source's region.
         *
         * @param sourceRegion the value to set
         * @return this builder
         */
        public Builder sourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            this.__explicitlySet__.add("sourceRegion");
            return this;
        }
        /** The OCID of the source region's Vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceVaultId")
        private String sourceVaultId;

        /**
         * The OCID of the source region's Vault.
         *
         * @param sourceVaultId the value to set
         * @return this builder
         */
        public Builder sourceVaultId(String sourceVaultId) {
            this.sourceVaultId = sourceVaultId;
            this.__explicitlySet__.add("sourceVaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SourceRegionInformation build() {
            SourceRegionInformation model =
                    new SourceRegionInformation(
                            this.sourceKeyId, this.sourceRegion, this.sourceVaultId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SourceRegionInformation model) {
            if (model.wasPropertyExplicitlySet("sourceKeyId")) {
                this.sourceKeyId(model.getSourceKeyId());
            }
            if (model.wasPropertyExplicitlySet("sourceRegion")) {
                this.sourceRegion(model.getSourceRegion());
            }
            if (model.wasPropertyExplicitlySet("sourceVaultId")) {
                this.sourceVaultId(model.getSourceVaultId());
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

    /** The OCID of the source region KMS key. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceKeyId")
    private final String sourceKeyId;

    /**
     * The OCID of the source region KMS key.
     *
     * @return the value
     */
    public String getSourceKeyId() {
        return sourceKeyId;
    }

    /** The name of the source's region. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRegion")
    private final String sourceRegion;

    /**
     * The name of the source's region.
     *
     * @return the value
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    /** The OCID of the source region's Vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceVaultId")
    private final String sourceVaultId;

    /**
     * The OCID of the source region's Vault.
     *
     * @return the value
     */
    public String getSourceVaultId() {
        return sourceVaultId;
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
        sb.append("SourceRegionInformation(");
        sb.append("super=").append(super.toString());
        sb.append("sourceKeyId=").append(String.valueOf(this.sourceKeyId));
        sb.append(", sourceRegion=").append(String.valueOf(this.sourceRegion));
        sb.append(", sourceVaultId=").append(String.valueOf(this.sourceVaultId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SourceRegionInformation)) {
            return false;
        }

        SourceRegionInformation other = (SourceRegionInformation) o;
        return java.util.Objects.equals(this.sourceKeyId, other.sourceKeyId)
                && java.util.Objects.equals(this.sourceRegion, other.sourceRegion)
                && java.util.Objects.equals(this.sourceVaultId, other.sourceVaultId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceKeyId == null ? 43 : this.sourceKeyId.hashCode());
        result = (result * PRIME) + (this.sourceRegion == null ? 43 : this.sourceRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceVaultId == null ? 43 : this.sourceVaultId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
