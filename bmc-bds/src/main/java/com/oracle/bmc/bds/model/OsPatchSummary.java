/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Summary of an available os patch to a cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OsPatchSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OsPatchSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"osPatchVersion", "releaseDate"})
    public OsPatchSummary(String osPatchVersion, java.util.Date releaseDate) {
        super();
        this.osPatchVersion = osPatchVersion;
        this.releaseDate = releaseDate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Patch version of the os patch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osPatchVersion")
        private String osPatchVersion;

        /**
         * Patch version of the os patch.
         * @param osPatchVersion the value to set
         * @return this builder
         **/
        public Builder osPatchVersion(String osPatchVersion) {
            this.osPatchVersion = osPatchVersion;
            this.__explicitlySet__.add("osPatchVersion");
            return this;
        }
        /**
         * The time when the OS patch was released.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
        private java.util.Date releaseDate;

        /**
         * The time when the OS patch was released.
         * @param releaseDate the value to set
         * @return this builder
         **/
        public Builder releaseDate(java.util.Date releaseDate) {
            this.releaseDate = releaseDate;
            this.__explicitlySet__.add("releaseDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OsPatchSummary build() {
            OsPatchSummary model = new OsPatchSummary(this.osPatchVersion, this.releaseDate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OsPatchSummary model) {
            if (model.wasPropertyExplicitlySet("osPatchVersion")) {
                this.osPatchVersion(model.getOsPatchVersion());
            }
            if (model.wasPropertyExplicitlySet("releaseDate")) {
                this.releaseDate(model.getReleaseDate());
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
     * Patch version of the os patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osPatchVersion")
    private final String osPatchVersion;

    /**
     * Patch version of the os patch.
     * @return the value
     **/
    public String getOsPatchVersion() {
        return osPatchVersion;
    }

    /**
     * The time when the OS patch was released.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
    private final java.util.Date releaseDate;

    /**
     * The time when the OS patch was released.
     * @return the value
     **/
    public java.util.Date getReleaseDate() {
        return releaseDate;
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
        sb.append("OsPatchSummary(");
        sb.append("super=").append(super.toString());
        sb.append("osPatchVersion=").append(String.valueOf(this.osPatchVersion));
        sb.append(", releaseDate=").append(String.valueOf(this.releaseDate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OsPatchSummary)) {
            return false;
        }

        OsPatchSummary other = (OsPatchSummary) o;
        return java.util.Objects.equals(this.osPatchVersion, other.osPatchVersion)
                && java.util.Objects.equals(this.releaseDate, other.releaseDate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.osPatchVersion == null ? 43 : this.osPatchVersion.hashCode());
        result = (result * PRIME) + (this.releaseDate == null ? 43 : this.releaseDate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
