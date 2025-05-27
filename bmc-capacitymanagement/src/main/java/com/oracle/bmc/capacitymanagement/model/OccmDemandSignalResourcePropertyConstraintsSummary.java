/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * A summary model for the Occm demand signal resource property constraints. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OccmDemandSignalResourcePropertyConstraintsSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OccmDemandSignalResourcePropertyConstraintsSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"constraintName", "constraintValue"})
    public OccmDemandSignalResourcePropertyConstraintsSummary(
            String constraintName, String constraintValue) {
        super();
        this.constraintName = constraintName;
        this.constraintValue = constraintValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of demand signal resource's property constraint. */
        @com.fasterxml.jackson.annotation.JsonProperty("constraintName")
        private String constraintName;

        /**
         * The name of demand signal resource's property constraint.
         *
         * @param constraintName the value to set
         * @return this builder
         */
        public Builder constraintName(String constraintName) {
            this.constraintName = constraintName;
            this.__explicitlySet__.add("constraintName");
            return this;
        }
        /** The value of demand signal resource's property constraint. */
        @com.fasterxml.jackson.annotation.JsonProperty("constraintValue")
        private String constraintValue;

        /**
         * The value of demand signal resource's property constraint.
         *
         * @param constraintValue the value to set
         * @return this builder
         */
        public Builder constraintValue(String constraintValue) {
            this.constraintValue = constraintValue;
            this.__explicitlySet__.add("constraintValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OccmDemandSignalResourcePropertyConstraintsSummary build() {
            OccmDemandSignalResourcePropertyConstraintsSummary model =
                    new OccmDemandSignalResourcePropertyConstraintsSummary(
                            this.constraintName, this.constraintValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OccmDemandSignalResourcePropertyConstraintsSummary model) {
            if (model.wasPropertyExplicitlySet("constraintName")) {
                this.constraintName(model.getConstraintName());
            }
            if (model.wasPropertyExplicitlySet("constraintValue")) {
                this.constraintValue(model.getConstraintValue());
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

    /** The name of demand signal resource's property constraint. */
    @com.fasterxml.jackson.annotation.JsonProperty("constraintName")
    private final String constraintName;

    /**
     * The name of demand signal resource's property constraint.
     *
     * @return the value
     */
    public String getConstraintName() {
        return constraintName;
    }

    /** The value of demand signal resource's property constraint. */
    @com.fasterxml.jackson.annotation.JsonProperty("constraintValue")
    private final String constraintValue;

    /**
     * The value of demand signal resource's property constraint.
     *
     * @return the value
     */
    public String getConstraintValue() {
        return constraintValue;
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
        sb.append("OccmDemandSignalResourcePropertyConstraintsSummary(");
        sb.append("super=").append(super.toString());
        sb.append("constraintName=").append(String.valueOf(this.constraintName));
        sb.append(", constraintValue=").append(String.valueOf(this.constraintValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OccmDemandSignalResourcePropertyConstraintsSummary)) {
            return false;
        }

        OccmDemandSignalResourcePropertyConstraintsSummary other =
                (OccmDemandSignalResourcePropertyConstraintsSummary) o;
        return java.util.Objects.equals(this.constraintName, other.constraintName)
                && java.util.Objects.equals(this.constraintValue, other.constraintValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.constraintName == null ? 43 : this.constraintName.hashCode());
        result =
                (result * PRIME)
                        + (this.constraintValue == null ? 43 : this.constraintValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
