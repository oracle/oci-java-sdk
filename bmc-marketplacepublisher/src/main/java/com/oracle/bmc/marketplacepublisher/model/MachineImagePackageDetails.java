/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Replicated Machine Image package information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MachineImagePackageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MachineImagePackageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "computeImageId",
        "computeAppCatalogId",
        "computePackageVersion"
    })
    public MachineImagePackageDetails(
            String computeImageId, String computeAppCatalogId, String computePackageVersion) {
        super();
        this.computeImageId = computeImageId;
        this.computeAppCatalogId = computeAppCatalogId;
        this.computePackageVersion = computePackageVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Replicated Image OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeImageId")
        private String computeImageId;

        /**
         * Replicated Image OCID.
         *
         * @param computeImageId the value to set
         * @return this builder
         */
        public Builder computeImageId(String computeImageId) {
            this.computeImageId = computeImageId;
            this.__explicitlySet__.add("computeImageId");
            return this;
        }
        /** Replicated Images App Catalog Listing OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeAppCatalogId")
        private String computeAppCatalogId;

        /**
         * Replicated Images App Catalog Listing OCID.
         *
         * @param computeAppCatalogId the value to set
         * @return this builder
         */
        public Builder computeAppCatalogId(String computeAppCatalogId) {
            this.computeAppCatalogId = computeAppCatalogId;
            this.__explicitlySet__.add("computeAppCatalogId");
            return this;
        }
        /** Replicated Images Package version. */
        @com.fasterxml.jackson.annotation.JsonProperty("computePackageVersion")
        private String computePackageVersion;

        /**
         * Replicated Images Package version.
         *
         * @param computePackageVersion the value to set
         * @return this builder
         */
        public Builder computePackageVersion(String computePackageVersion) {
            this.computePackageVersion = computePackageVersion;
            this.__explicitlySet__.add("computePackageVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MachineImagePackageDetails build() {
            MachineImagePackageDetails model =
                    new MachineImagePackageDetails(
                            this.computeImageId,
                            this.computeAppCatalogId,
                            this.computePackageVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MachineImagePackageDetails model) {
            if (model.wasPropertyExplicitlySet("computeImageId")) {
                this.computeImageId(model.getComputeImageId());
            }
            if (model.wasPropertyExplicitlySet("computeAppCatalogId")) {
                this.computeAppCatalogId(model.getComputeAppCatalogId());
            }
            if (model.wasPropertyExplicitlySet("computePackageVersion")) {
                this.computePackageVersion(model.getComputePackageVersion());
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

    /** Replicated Image OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeImageId")
    private final String computeImageId;

    /**
     * Replicated Image OCID.
     *
     * @return the value
     */
    public String getComputeImageId() {
        return computeImageId;
    }

    /** Replicated Images App Catalog Listing OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeAppCatalogId")
    private final String computeAppCatalogId;

    /**
     * Replicated Images App Catalog Listing OCID.
     *
     * @return the value
     */
    public String getComputeAppCatalogId() {
        return computeAppCatalogId;
    }

    /** Replicated Images Package version. */
    @com.fasterxml.jackson.annotation.JsonProperty("computePackageVersion")
    private final String computePackageVersion;

    /**
     * Replicated Images Package version.
     *
     * @return the value
     */
    public String getComputePackageVersion() {
        return computePackageVersion;
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
        sb.append("MachineImagePackageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("computeImageId=").append(String.valueOf(this.computeImageId));
        sb.append(", computeAppCatalogId=").append(String.valueOf(this.computeAppCatalogId));
        sb.append(", computePackageVersion=").append(String.valueOf(this.computePackageVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MachineImagePackageDetails)) {
            return false;
        }

        MachineImagePackageDetails other = (MachineImagePackageDetails) o;
        return java.util.Objects.equals(this.computeImageId, other.computeImageId)
                && java.util.Objects.equals(this.computeAppCatalogId, other.computeAppCatalogId)
                && java.util.Objects.equals(this.computePackageVersion, other.computePackageVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.computeImageId == null ? 43 : this.computeImageId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeAppCatalogId == null
                                ? 43
                                : this.computeAppCatalogId.hashCode());
        result =
                (result * PRIME)
                        + (this.computePackageVersion == null
                                ? 43
                                : this.computePackageVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
