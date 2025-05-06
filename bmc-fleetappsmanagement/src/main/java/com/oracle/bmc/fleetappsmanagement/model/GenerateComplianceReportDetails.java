/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Request to generate compliance report for the fleet. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GenerateComplianceReportDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenerateComplianceReportDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"areDetailsRequired"})
    public GenerateComplianceReportDetails(String areDetailsRequired) {
        super();
        this.areDetailsRequired = areDetailsRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A value that specifies if compliance details are required at the target level also?
         * Allowed values are N and Y.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("areDetailsRequired")
        private String areDetailsRequired;

        /**
         * A value that specifies if compliance details are required at the target level also?
         * Allowed values are N and Y.
         *
         * @param areDetailsRequired the value to set
         * @return this builder
         */
        public Builder areDetailsRequired(String areDetailsRequired) {
            this.areDetailsRequired = areDetailsRequired;
            this.__explicitlySet__.add("areDetailsRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateComplianceReportDetails build() {
            GenerateComplianceReportDetails model =
                    new GenerateComplianceReportDetails(this.areDetailsRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateComplianceReportDetails model) {
            if (model.wasPropertyExplicitlySet("areDetailsRequired")) {
                this.areDetailsRequired(model.getAreDetailsRequired());
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

    /**
     * A value that specifies if compliance details are required at the target level also? Allowed
     * values are N and Y.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("areDetailsRequired")
    private final String areDetailsRequired;

    /**
     * A value that specifies if compliance details are required at the target level also? Allowed
     * values are N and Y.
     *
     * @return the value
     */
    public String getAreDetailsRequired() {
        return areDetailsRequired;
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
        sb.append("GenerateComplianceReportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("areDetailsRequired=").append(String.valueOf(this.areDetailsRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateComplianceReportDetails)) {
            return false;
        }

        GenerateComplianceReportDetails other = (GenerateComplianceReportDetails) o;
        return java.util.Objects.equals(this.areDetailsRequired, other.areDetailsRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.areDetailsRequired == null
                                ? 43
                                : this.areDetailsRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
