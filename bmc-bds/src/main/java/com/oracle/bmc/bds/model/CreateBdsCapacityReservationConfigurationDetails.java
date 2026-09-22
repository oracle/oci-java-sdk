/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details for associating a BDS capacity reservation with a BDS cluster.
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
    builder = CreateBdsCapacityReservationConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateBdsCapacityReservationConfigurationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "bdsCapacityReservationId"})
    public CreateBdsCapacityReservationConfigurationDetails(
            String displayName, String bdsCapacityReservationId) {
        super();
        this.displayName = displayName;
        this.bdsCapacityReservationId = bdsCapacityReservationId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name for the BDS capacity reservation configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the BDS capacity reservation configuration.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the BDS capacity reservation to associate with the BDS cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bdsCapacityReservationId")
        private String bdsCapacityReservationId;

        /**
         * The OCID of the BDS capacity reservation to associate with the BDS cluster.
         * @param bdsCapacityReservationId the value to set
         * @return this builder
         **/
        public Builder bdsCapacityReservationId(String bdsCapacityReservationId) {
            this.bdsCapacityReservationId = bdsCapacityReservationId;
            this.__explicitlySet__.add("bdsCapacityReservationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBdsCapacityReservationConfigurationDetails build() {
            CreateBdsCapacityReservationConfigurationDetails model =
                    new CreateBdsCapacityReservationConfigurationDetails(
                            this.displayName, this.bdsCapacityReservationId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBdsCapacityReservationConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("bdsCapacityReservationId")) {
                this.bdsCapacityReservationId(model.getBdsCapacityReservationId());
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
     * A user-friendly name for the BDS capacity reservation configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the BDS capacity reservation configuration.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the BDS capacity reservation to associate with the BDS cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsCapacityReservationId")
    private final String bdsCapacityReservationId;

    /**
     * The OCID of the BDS capacity reservation to associate with the BDS cluster.
     * @return the value
     **/
    public String getBdsCapacityReservationId() {
        return bdsCapacityReservationId;
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
        sb.append("CreateBdsCapacityReservationConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", bdsCapacityReservationId=")
                .append(String.valueOf(this.bdsCapacityReservationId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBdsCapacityReservationConfigurationDetails)) {
            return false;
        }

        CreateBdsCapacityReservationConfigurationDetails other =
                (CreateBdsCapacityReservationConfigurationDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.bdsCapacityReservationId, other.bdsCapacityReservationId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.bdsCapacityReservationId == null
                                ? 43
                                : this.bdsCapacityReservationId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
