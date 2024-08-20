/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.model;

/**
 * Service instance capacity metadata (e.g.: OLPU count, number of users, ...etc...). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Capacity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Capacity extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"capacityType", "capacityValue"})
    public Capacity(CapacityType capacityType, Integer capacityValue) {
        super();
        this.capacityType = capacityType;
        this.capacityValue = capacityValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The capacity model to use. Accepted values are: OLPU_COUNT, USER_COUNT */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityType")
        private CapacityType capacityType;

        /**
         * The capacity model to use. Accepted values are: OLPU_COUNT, USER_COUNT
         *
         * @param capacityType the value to set
         * @return this builder
         */
        public Builder capacityType(CapacityType capacityType) {
            this.capacityType = capacityType;
            this.__explicitlySet__.add("capacityType");
            return this;
        }
        /**
         * The capacity value selected, either the number of OCPUs (OLPU_COUNT) or the number of
         * users (USER_COUNT). This parameter affects the number of OCPUs, amount of memory, and
         * other resources allocated to the instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityValue")
        private Integer capacityValue;

        /**
         * The capacity value selected, either the number of OCPUs (OLPU_COUNT) or the number of
         * users (USER_COUNT). This parameter affects the number of OCPUs, amount of memory, and
         * other resources allocated to the instance.
         *
         * @param capacityValue the value to set
         * @return this builder
         */
        public Builder capacityValue(Integer capacityValue) {
            this.capacityValue = capacityValue;
            this.__explicitlySet__.add("capacityValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Capacity build() {
            Capacity model = new Capacity(this.capacityType, this.capacityValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Capacity model) {
            if (model.wasPropertyExplicitlySet("capacityType")) {
                this.capacityType(model.getCapacityType());
            }
            if (model.wasPropertyExplicitlySet("capacityValue")) {
                this.capacityValue(model.getCapacityValue());
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

    /** The capacity model to use. Accepted values are: OLPU_COUNT, USER_COUNT */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityType")
    private final CapacityType capacityType;

    /**
     * The capacity model to use. Accepted values are: OLPU_COUNT, USER_COUNT
     *
     * @return the value
     */
    public CapacityType getCapacityType() {
        return capacityType;
    }

    /**
     * The capacity value selected, either the number of OCPUs (OLPU_COUNT) or the number of users
     * (USER_COUNT). This parameter affects the number of OCPUs, amount of memory, and other
     * resources allocated to the instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityValue")
    private final Integer capacityValue;

    /**
     * The capacity value selected, either the number of OCPUs (OLPU_COUNT) or the number of users
     * (USER_COUNT). This parameter affects the number of OCPUs, amount of memory, and other
     * resources allocated to the instance.
     *
     * @return the value
     */
    public Integer getCapacityValue() {
        return capacityValue;
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
        sb.append("Capacity(");
        sb.append("super=").append(super.toString());
        sb.append("capacityType=").append(String.valueOf(this.capacityType));
        sb.append(", capacityValue=").append(String.valueOf(this.capacityValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Capacity)) {
            return false;
        }

        Capacity other = (Capacity) o;
        return java.util.Objects.equals(this.capacityType, other.capacityType)
                && java.util.Objects.equals(this.capacityValue, other.capacityValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.capacityType == null ? 43 : this.capacityType.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityValue == null ? 43 : this.capacityValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
