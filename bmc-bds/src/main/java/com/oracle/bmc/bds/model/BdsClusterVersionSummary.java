/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Cluster version details including bds and odh version information.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BdsClusterVersionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BdsClusterVersionSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"bdsVersion", "odhVersion"})
    public BdsClusterVersionSummary(String bdsVersion, String odhVersion) {
        super();
        this.bdsVersion = bdsVersion;
        this.odhVersion = odhVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * BDS version to be used for cluster creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bdsVersion")
        private String bdsVersion;

        /**
         * BDS version to be used for cluster creation
         * @param bdsVersion the value to set
         * @return this builder
         **/
        public Builder bdsVersion(String bdsVersion) {
            this.bdsVersion = bdsVersion;
            this.__explicitlySet__.add("bdsVersion");
            return this;
        }
        /**
         * ODH version to be used for cluster creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("odhVersion")
        private String odhVersion;

        /**
         * ODH version to be used for cluster creation
         * @param odhVersion the value to set
         * @return this builder
         **/
        public Builder odhVersion(String odhVersion) {
            this.odhVersion = odhVersion;
            this.__explicitlySet__.add("odhVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BdsClusterVersionSummary build() {
            BdsClusterVersionSummary model =
                    new BdsClusterVersionSummary(this.bdsVersion, this.odhVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BdsClusterVersionSummary model) {
            if (model.wasPropertyExplicitlySet("bdsVersion")) {
                this.bdsVersion(model.getBdsVersion());
            }
            if (model.wasPropertyExplicitlySet("odhVersion")) {
                this.odhVersion(model.getOdhVersion());
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
     * BDS version to be used for cluster creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsVersion")
    private final String bdsVersion;

    /**
     * BDS version to be used for cluster creation
     * @return the value
     **/
    public String getBdsVersion() {
        return bdsVersion;
    }

    /**
     * ODH version to be used for cluster creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("odhVersion")
    private final String odhVersion;

    /**
     * ODH version to be used for cluster creation
     * @return the value
     **/
    public String getOdhVersion() {
        return odhVersion;
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
        sb.append("BdsClusterVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("bdsVersion=").append(String.valueOf(this.bdsVersion));
        sb.append(", odhVersion=").append(String.valueOf(this.odhVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BdsClusterVersionSummary)) {
            return false;
        }

        BdsClusterVersionSummary other = (BdsClusterVersionSummary) o;
        return java.util.Objects.equals(this.bdsVersion, other.bdsVersion)
                && java.util.Objects.equals(this.odhVersion, other.odhVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bdsVersion == null ? 43 : this.bdsVersion.hashCode());
        result = (result * PRIME) + (this.odhVersion == null ? 43 : this.odhVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
