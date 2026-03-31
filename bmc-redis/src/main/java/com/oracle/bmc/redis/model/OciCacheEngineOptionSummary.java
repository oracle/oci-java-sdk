/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * Available engine options for creating a OCI Cache cluster
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OciCacheEngineOptionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OciCacheEngineOptionSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"engineVersions"})
    public OciCacheEngineOptionSummary(java.util.List<EngineVersion> engineVersions) {
        super();
        this.engineVersions = engineVersions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of available engine versions
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("engineVersions")
        private java.util.List<EngineVersion> engineVersions;

        /**
         * List of available engine versions
         * @param engineVersions the value to set
         * @return this builder
         **/
        public Builder engineVersions(java.util.List<EngineVersion> engineVersions) {
            this.engineVersions = engineVersions;
            this.__explicitlySet__.add("engineVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciCacheEngineOptionSummary build() {
            OciCacheEngineOptionSummary model =
                    new OciCacheEngineOptionSummary(this.engineVersions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciCacheEngineOptionSummary model) {
            if (model.wasPropertyExplicitlySet("engineVersions")) {
                this.engineVersions(model.getEngineVersions());
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
     * List of available engine versions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("engineVersions")
    private final java.util.List<EngineVersion> engineVersions;

    /**
     * List of available engine versions
     * @return the value
     **/
    public java.util.List<EngineVersion> getEngineVersions() {
        return engineVersions;
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
        sb.append("OciCacheEngineOptionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("engineVersions=").append(String.valueOf(this.engineVersions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciCacheEngineOptionSummary)) {
            return false;
        }

        OciCacheEngineOptionSummary other = (OciCacheEngineOptionSummary) o;
        return java.util.Objects.equals(this.engineVersions, other.engineVersions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.engineVersions == null ? 43 : this.engineVersions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
