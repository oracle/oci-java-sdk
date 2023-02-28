/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The asset's NVDIMM configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NvdimmController.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class NvdimmController
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"label", "busNumber"})
    public NvdimmController(String label, Integer busNumber) {
        super();
        this.label = label;
        this.busNumber = busNumber;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Provides a label and summary information for the device. */
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * Provides a label and summary information for the device.
         *
         * @param label the value to set
         * @return this builder
         */
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /** Bus number. */
        @com.fasterxml.jackson.annotation.JsonProperty("busNumber")
        private Integer busNumber;

        /**
         * Bus number.
         *
         * @param busNumber the value to set
         * @return this builder
         */
        public Builder busNumber(Integer busNumber) {
            this.busNumber = busNumber;
            this.__explicitlySet__.add("busNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NvdimmController build() {
            NvdimmController model = new NvdimmController(this.label, this.busNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NvdimmController model) {
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("busNumber")) {
                this.busNumber(model.getBusNumber());
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

    /** Provides a label and summary information for the device. */
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * Provides a label and summary information for the device.
     *
     * @return the value
     */
    public String getLabel() {
        return label;
    }

    /** Bus number. */
    @com.fasterxml.jackson.annotation.JsonProperty("busNumber")
    private final Integer busNumber;

    /**
     * Bus number.
     *
     * @return the value
     */
    public Integer getBusNumber() {
        return busNumber;
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
        sb.append("NvdimmController(");
        sb.append("super=").append(super.toString());
        sb.append("label=").append(String.valueOf(this.label));
        sb.append(", busNumber=").append(String.valueOf(this.busNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NvdimmController)) {
            return false;
        }

        NvdimmController other = (NvdimmController) o;
        return java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.busNumber, other.busNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.busNumber == null ? 43 : this.busNumber.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
