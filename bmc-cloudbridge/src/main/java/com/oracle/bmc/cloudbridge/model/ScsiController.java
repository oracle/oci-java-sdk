/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The assets SCSI controller. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ScsiController.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ScsiController
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"label", "unitNumber", "sharedBus"})
    public ScsiController(String label, Integer unitNumber, String sharedBus) {
        super();
        this.label = label;
        this.unitNumber = unitNumber;
        this.sharedBus = sharedBus;
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
        /** The unit number of the SCSI controller. */
        @com.fasterxml.jackson.annotation.JsonProperty("unitNumber")
        private Integer unitNumber;

        /**
         * The unit number of the SCSI controller.
         *
         * @param unitNumber the value to set
         * @return this builder
         */
        public Builder unitNumber(Integer unitNumber) {
            this.unitNumber = unitNumber;
            this.__explicitlySet__.add("unitNumber");
            return this;
        }
        /** Shared bus. */
        @com.fasterxml.jackson.annotation.JsonProperty("sharedBus")
        private String sharedBus;

        /**
         * Shared bus.
         *
         * @param sharedBus the value to set
         * @return this builder
         */
        public Builder sharedBus(String sharedBus) {
            this.sharedBus = sharedBus;
            this.__explicitlySet__.add("sharedBus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScsiController build() {
            ScsiController model = new ScsiController(this.label, this.unitNumber, this.sharedBus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScsiController model) {
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("unitNumber")) {
                this.unitNumber(model.getUnitNumber());
            }
            if (model.wasPropertyExplicitlySet("sharedBus")) {
                this.sharedBus(model.getSharedBus());
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

    /** The unit number of the SCSI controller. */
    @com.fasterxml.jackson.annotation.JsonProperty("unitNumber")
    private final Integer unitNumber;

    /**
     * The unit number of the SCSI controller.
     *
     * @return the value
     */
    public Integer getUnitNumber() {
        return unitNumber;
    }

    /** Shared bus. */
    @com.fasterxml.jackson.annotation.JsonProperty("sharedBus")
    private final String sharedBus;

    /**
     * Shared bus.
     *
     * @return the value
     */
    public String getSharedBus() {
        return sharedBus;
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
        sb.append("ScsiController(");
        sb.append("super=").append(super.toString());
        sb.append("label=").append(String.valueOf(this.label));
        sb.append(", unitNumber=").append(String.valueOf(this.unitNumber));
        sb.append(", sharedBus=").append(String.valueOf(this.sharedBus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScsiController)) {
            return false;
        }

        ScsiController other = (ScsiController) o;
        return java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.unitNumber, other.unitNumber)
                && java.util.Objects.equals(this.sharedBus, other.sharedBus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.unitNumber == null ? 43 : this.unitNumber.hashCode());
        result = (result * PRIME) + (this.sharedBus == null ? 43 : this.sharedBus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
