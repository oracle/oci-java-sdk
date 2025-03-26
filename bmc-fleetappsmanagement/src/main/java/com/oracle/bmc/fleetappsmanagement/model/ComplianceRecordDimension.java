/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Aggregated summary information for ComplianceRecord
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComplianceRecordDimension.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComplianceRecordDimension
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"complianceState", "complianceLevel"})
    public ComplianceRecordDimension(
            ComplianceState complianceState, ComplianceLevel complianceLevel) {
        super();
        this.complianceState = complianceState;
        this.complianceLevel = complianceLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Last known compliance state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
        private ComplianceState complianceState;

        /**
         * Last known compliance state.
         * @param complianceState the value to set
         * @return this builder
         **/
        public Builder complianceState(ComplianceState complianceState) {
            this.complianceState = complianceState;
            this.__explicitlySet__.add("complianceState");
            return this;
        }
        /**
         * Level at which the compliance is calculated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("complianceLevel")
        private ComplianceLevel complianceLevel;

        /**
         * Level at which the compliance is calculated.
         * @param complianceLevel the value to set
         * @return this builder
         **/
        public Builder complianceLevel(ComplianceLevel complianceLevel) {
            this.complianceLevel = complianceLevel;
            this.__explicitlySet__.add("complianceLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComplianceRecordDimension build() {
            ComplianceRecordDimension model =
                    new ComplianceRecordDimension(this.complianceState, this.complianceLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComplianceRecordDimension model) {
            if (model.wasPropertyExplicitlySet("complianceState")) {
                this.complianceState(model.getComplianceState());
            }
            if (model.wasPropertyExplicitlySet("complianceLevel")) {
                this.complianceLevel(model.getComplianceLevel());
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
     * Last known compliance state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
    private final ComplianceState complianceState;

    /**
     * Last known compliance state.
     * @return the value
     **/
    public ComplianceState getComplianceState() {
        return complianceState;
    }

    /**
     * Level at which the compliance is calculated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("complianceLevel")
    private final ComplianceLevel complianceLevel;

    /**
     * Level at which the compliance is calculated.
     * @return the value
     **/
    public ComplianceLevel getComplianceLevel() {
        return complianceLevel;
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
        sb.append("ComplianceRecordDimension(");
        sb.append("super=").append(super.toString());
        sb.append("complianceState=").append(String.valueOf(this.complianceState));
        sb.append(", complianceLevel=").append(String.valueOf(this.complianceLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComplianceRecordDimension)) {
            return false;
        }

        ComplianceRecordDimension other = (ComplianceRecordDimension) o;
        return java.util.Objects.equals(this.complianceState, other.complianceState)
                && java.util.Objects.equals(this.complianceLevel, other.complianceLevel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.complianceState == null ? 43 : this.complianceState.hashCode());
        result =
                (result * PRIME)
                        + (this.complianceLevel == null ? 43 : this.complianceLevel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
