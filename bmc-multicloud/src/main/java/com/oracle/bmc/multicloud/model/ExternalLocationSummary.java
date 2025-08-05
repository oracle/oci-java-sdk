/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * External location for CSP Region <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalLocationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalLocationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"cspRegion", "cspRegionDisplayName"})
    public ExternalLocationSummary(String cspRegion, String cspRegionDisplayName) {
        super();
        this.cspRegion = cspRegion;
        this.cspRegionDisplayName = cspRegionDisplayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** CSP region corresponding to the given OCI region */
        @com.fasterxml.jackson.annotation.JsonProperty("cspRegion")
        private String cspRegion;

        /**
         * CSP region corresponding to the given OCI region
         *
         * @param cspRegion the value to set
         * @return this builder
         */
        public Builder cspRegion(String cspRegion) {
            this.cspRegion = cspRegion;
            this.__explicitlySet__.add("cspRegion");
            return this;
        }
        /** CSP region display Name corresponding to the given OCI region */
        @com.fasterxml.jackson.annotation.JsonProperty("cspRegionDisplayName")
        private String cspRegionDisplayName;

        /**
         * CSP region display Name corresponding to the given OCI region
         *
         * @param cspRegionDisplayName the value to set
         * @return this builder
         */
        public Builder cspRegionDisplayName(String cspRegionDisplayName) {
            this.cspRegionDisplayName = cspRegionDisplayName;
            this.__explicitlySet__.add("cspRegionDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalLocationSummary build() {
            ExternalLocationSummary model =
                    new ExternalLocationSummary(this.cspRegion, this.cspRegionDisplayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalLocationSummary model) {
            if (model.wasPropertyExplicitlySet("cspRegion")) {
                this.cspRegion(model.getCspRegion());
            }
            if (model.wasPropertyExplicitlySet("cspRegionDisplayName")) {
                this.cspRegionDisplayName(model.getCspRegionDisplayName());
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

    /** CSP region corresponding to the given OCI region */
    @com.fasterxml.jackson.annotation.JsonProperty("cspRegion")
    private final String cspRegion;

    /**
     * CSP region corresponding to the given OCI region
     *
     * @return the value
     */
    public String getCspRegion() {
        return cspRegion;
    }

    /** CSP region display Name corresponding to the given OCI region */
    @com.fasterxml.jackson.annotation.JsonProperty("cspRegionDisplayName")
    private final String cspRegionDisplayName;

    /**
     * CSP region display Name corresponding to the given OCI region
     *
     * @return the value
     */
    public String getCspRegionDisplayName() {
        return cspRegionDisplayName;
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
        sb.append("ExternalLocationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("cspRegion=").append(String.valueOf(this.cspRegion));
        sb.append(", cspRegionDisplayName=").append(String.valueOf(this.cspRegionDisplayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalLocationSummary)) {
            return false;
        }

        ExternalLocationSummary other = (ExternalLocationSummary) o;
        return java.util.Objects.equals(this.cspRegion, other.cspRegion)
                && java.util.Objects.equals(this.cspRegionDisplayName, other.cspRegionDisplayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cspRegion == null ? 43 : this.cspRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.cspRegionDisplayName == null
                                ? 43
                                : this.cspRegionDisplayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
