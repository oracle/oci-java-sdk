/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The Oracle Grid Infrastructure (GI) minor version.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GiMinorVersionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GiMinorVersionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"version", "gridImageId"})
    public GiMinorVersionSummary(String version, String gridImageId) {
        super();
        this.version = version;
        this.gridImageId = gridImageId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A valid Oracle Grid Infrastructure (GI) software version. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * A valid Oracle Grid Infrastructure (GI) software version.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** Grid Infrastructure Image Id */
        @com.fasterxml.jackson.annotation.JsonProperty("gridImageId")
        private String gridImageId;

        /**
         * Grid Infrastructure Image Id
         *
         * @param gridImageId the value to set
         * @return this builder
         */
        public Builder gridImageId(String gridImageId) {
            this.gridImageId = gridImageId;
            this.__explicitlySet__.add("gridImageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GiMinorVersionSummary build() {
            GiMinorVersionSummary model = new GiMinorVersionSummary(this.version, this.gridImageId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GiMinorVersionSummary model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("gridImageId")) {
                this.gridImageId(model.getGridImageId());
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

    /** A valid Oracle Grid Infrastructure (GI) software version. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * A valid Oracle Grid Infrastructure (GI) software version.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** Grid Infrastructure Image Id */
    @com.fasterxml.jackson.annotation.JsonProperty("gridImageId")
    private final String gridImageId;

    /**
     * Grid Infrastructure Image Id
     *
     * @return the value
     */
    public String getGridImageId() {
        return gridImageId;
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
        sb.append("GiMinorVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", gridImageId=").append(String.valueOf(this.gridImageId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GiMinorVersionSummary)) {
            return false;
        }

        GiMinorVersionSummary other = (GiMinorVersionSummary) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.gridImageId, other.gridImageId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.gridImageId == null ? 43 : this.gridImageId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
