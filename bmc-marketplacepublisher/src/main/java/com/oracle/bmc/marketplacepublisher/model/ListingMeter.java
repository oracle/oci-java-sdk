/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * A listing meter information attached by marketplace admin. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ListingMeter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ListingMeter extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "rateAllocation", "extendedMetadata"})
    public ListingMeter(
            String name, Float rateAllocation, java.util.Map<String, String> extendedMetadata) {
        super();
        this.name = name;
        this.rateAllocation = rateAllocation;
        this.extendedMetadata = extendedMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The meter name, ex - MP_BOBO_AP. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The meter name, ex - MP_BOBO_AP.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * rate allocation, these are calculated based on rate information at parent part/sku and
         * listing revision.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rateAllocation")
        private Float rateAllocation;

        /**
         * rate allocation, these are calculated based on rate information at parent part/sku and
         * listing revision.
         *
         * @param rateAllocation the value to set
         * @return this builder
         */
        public Builder rateAllocation(Float rateAllocation) {
            this.rateAllocation = rateAllocation;
            this.__explicitlySet__.add("rateAllocation");
            return this;
        }
        /**
         * Additional metadata key/value pairs for the listing meter.
         *
         * <p>For example:
         *
         * <p>{@code {"pausedOnInstanceStop": "True","coreSuffixMeter": "_VMWARE",
         * "minimumBillingPeriodInHours": "755", "weight": "1.0" }}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, String> extendedMetadata;

        /**
         * Additional metadata key/value pairs for the listing meter.
         *
         * <p>For example:
         *
         * <p>{@code {"pausedOnInstanceStop": "True","coreSuffixMeter": "_VMWARE",
         * "minimumBillingPeriodInHours": "755", "weight": "1.0" }}
         *
         * @param extendedMetadata the value to set
         * @return this builder
         */
        public Builder extendedMetadata(java.util.Map<String, String> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListingMeter build() {
            ListingMeter model =
                    new ListingMeter(this.name, this.rateAllocation, this.extendedMetadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListingMeter model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("rateAllocation")) {
                this.rateAllocation(model.getRateAllocation());
            }
            if (model.wasPropertyExplicitlySet("extendedMetadata")) {
                this.extendedMetadata(model.getExtendedMetadata());
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

    /** The meter name, ex - MP_BOBO_AP. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The meter name, ex - MP_BOBO_AP.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * rate allocation, these are calculated based on rate information at parent part/sku and
     * listing revision.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rateAllocation")
    private final Float rateAllocation;

    /**
     * rate allocation, these are calculated based on rate information at parent part/sku and
     * listing revision.
     *
     * @return the value
     */
    public Float getRateAllocation() {
        return rateAllocation;
    }

    /**
     * Additional metadata key/value pairs for the listing meter.
     *
     * <p>For example:
     *
     * <p>{@code {"pausedOnInstanceStop": "True","coreSuffixMeter": "_VMWARE",
     * "minimumBillingPeriodInHours": "755", "weight": "1.0" }}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    private final java.util.Map<String, String> extendedMetadata;

    /**
     * Additional metadata key/value pairs for the listing meter.
     *
     * <p>For example:
     *
     * <p>{@code {"pausedOnInstanceStop": "True","coreSuffixMeter": "_VMWARE",
     * "minimumBillingPeriodInHours": "755", "weight": "1.0" }}
     *
     * @return the value
     */
    public java.util.Map<String, String> getExtendedMetadata() {
        return extendedMetadata;
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
        sb.append("ListingMeter(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", rateAllocation=").append(String.valueOf(this.rateAllocation));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListingMeter)) {
            return false;
        }

        ListingMeter other = (ListingMeter) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.rateAllocation, other.rateAllocation)
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.rateAllocation == null ? 43 : this.rateAllocation.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
