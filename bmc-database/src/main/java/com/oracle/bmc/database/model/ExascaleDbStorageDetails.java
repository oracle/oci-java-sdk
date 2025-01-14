/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Exadata Database Storage Details <br>
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
        builder = ExascaleDbStorageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExascaleDbStorageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"totalSizeInGbs", "availableSizeInGbs"})
    public ExascaleDbStorageDetails(Integer totalSizeInGbs, Integer availableSizeInGbs) {
        super();
        this.totalSizeInGbs = totalSizeInGbs;
        this.availableSizeInGbs = availableSizeInGbs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total Capacity */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSizeInGbs")
        private Integer totalSizeInGbs;

        /**
         * Total Capacity
         *
         * @param totalSizeInGbs the value to set
         * @return this builder
         */
        public Builder totalSizeInGbs(Integer totalSizeInGbs) {
            this.totalSizeInGbs = totalSizeInGbs;
            this.__explicitlySet__.add("totalSizeInGbs");
            return this;
        }
        /** Available Capacity */
        @com.fasterxml.jackson.annotation.JsonProperty("availableSizeInGbs")
        private Integer availableSizeInGbs;

        /**
         * Available Capacity
         *
         * @param availableSizeInGbs the value to set
         * @return this builder
         */
        public Builder availableSizeInGbs(Integer availableSizeInGbs) {
            this.availableSizeInGbs = availableSizeInGbs;
            this.__explicitlySet__.add("availableSizeInGbs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExascaleDbStorageDetails build() {
            ExascaleDbStorageDetails model =
                    new ExascaleDbStorageDetails(this.totalSizeInGbs, this.availableSizeInGbs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExascaleDbStorageDetails model) {
            if (model.wasPropertyExplicitlySet("totalSizeInGbs")) {
                this.totalSizeInGbs(model.getTotalSizeInGbs());
            }
            if (model.wasPropertyExplicitlySet("availableSizeInGbs")) {
                this.availableSizeInGbs(model.getAvailableSizeInGbs());
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

    /** Total Capacity */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSizeInGbs")
    private final Integer totalSizeInGbs;

    /**
     * Total Capacity
     *
     * @return the value
     */
    public Integer getTotalSizeInGbs() {
        return totalSizeInGbs;
    }

    /** Available Capacity */
    @com.fasterxml.jackson.annotation.JsonProperty("availableSizeInGbs")
    private final Integer availableSizeInGbs;

    /**
     * Available Capacity
     *
     * @return the value
     */
    public Integer getAvailableSizeInGbs() {
        return availableSizeInGbs;
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
        sb.append("ExascaleDbStorageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("totalSizeInGbs=").append(String.valueOf(this.totalSizeInGbs));
        sb.append(", availableSizeInGbs=").append(String.valueOf(this.availableSizeInGbs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExascaleDbStorageDetails)) {
            return false;
        }

        ExascaleDbStorageDetails other = (ExascaleDbStorageDetails) o;
        return java.util.Objects.equals(this.totalSizeInGbs, other.totalSizeInGbs)
                && java.util.Objects.equals(this.availableSizeInGbs, other.availableSizeInGbs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalSizeInGbs == null ? 43 : this.totalSizeInGbs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableSizeInGbs == null
                                ? 43
                                : this.availableSizeInGbs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
