/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * The date and time at which upcoming maintenance needs to be set
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OverrideMaintenanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OverrideMaintenanceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dateTimeDetails"})
    public OverrideMaintenanceDetails(DateAndTime dateTimeDetails) {
        super();
        this.dateTimeDetails = dateTimeDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("dateTimeDetails")
        private DateAndTime dateTimeDetails;

        public Builder dateTimeDetails(DateAndTime dateTimeDetails) {
            this.dateTimeDetails = dateTimeDetails;
            this.__explicitlySet__.add("dateTimeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OverrideMaintenanceDetails build() {
            OverrideMaintenanceDetails model = new OverrideMaintenanceDetails(this.dateTimeDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OverrideMaintenanceDetails model) {
            if (model.wasPropertyExplicitlySet("dateTimeDetails")) {
                this.dateTimeDetails(model.getDateTimeDetails());
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

    @com.fasterxml.jackson.annotation.JsonProperty("dateTimeDetails")
    private final DateAndTime dateTimeDetails;

    public DateAndTime getDateTimeDetails() {
        return dateTimeDetails;
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
        sb.append("OverrideMaintenanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dateTimeDetails=").append(String.valueOf(this.dateTimeDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OverrideMaintenanceDetails)) {
            return false;
        }

        OverrideMaintenanceDetails other = (OverrideMaintenanceDetails) o;
        return java.util.Objects.equals(this.dateTimeDetails, other.dateTimeDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dateTimeDetails == null ? 43 : this.dateTimeDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
