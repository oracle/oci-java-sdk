/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The asset's NVDIMM configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Nvdimm.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Nvdimm extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"label", "unitNumber", "controllerKey"})
    public Nvdimm(String label, Integer unitNumber, Integer controllerKey) {
        super();
        this.label = label;
        this.unitNumber = unitNumber;
        this.controllerKey = controllerKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Provides a label and summary information for the device.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * Provides a label and summary information for the device.
         * @param label the value to set
         * @return this builder
         **/
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /**
         * The unit number of NVDIMM.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unitNumber")
        private Integer unitNumber;

        /**
         * The unit number of NVDIMM.
         * @param unitNumber the value to set
         * @return this builder
         **/
        public Builder unitNumber(Integer unitNumber) {
            this.unitNumber = unitNumber;
            this.__explicitlySet__.add("unitNumber");
            return this;
        }
        /**
         * Controller key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("controllerKey")
        private Integer controllerKey;

        /**
         * Controller key.
         * @param controllerKey the value to set
         * @return this builder
         **/
        public Builder controllerKey(Integer controllerKey) {
            this.controllerKey = controllerKey;
            this.__explicitlySet__.add("controllerKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Nvdimm build() {
            Nvdimm model = new Nvdimm(this.label, this.unitNumber, this.controllerKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Nvdimm model) {
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("unitNumber")) {
                this.unitNumber(model.getUnitNumber());
            }
            if (model.wasPropertyExplicitlySet("controllerKey")) {
                this.controllerKey(model.getControllerKey());
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
     * Provides a label and summary information for the device.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * Provides a label and summary information for the device.
     * @return the value
     **/
    public String getLabel() {
        return label;
    }

    /**
     * The unit number of NVDIMM.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitNumber")
    private final Integer unitNumber;

    /**
     * The unit number of NVDIMM.
     * @return the value
     **/
    public Integer getUnitNumber() {
        return unitNumber;
    }

    /**
     * Controller key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("controllerKey")
    private final Integer controllerKey;

    /**
     * Controller key.
     * @return the value
     **/
    public Integer getControllerKey() {
        return controllerKey;
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
        sb.append("Nvdimm(");
        sb.append("super=").append(super.toString());
        sb.append("label=").append(String.valueOf(this.label));
        sb.append(", unitNumber=").append(String.valueOf(this.unitNumber));
        sb.append(", controllerKey=").append(String.valueOf(this.controllerKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Nvdimm)) {
            return false;
        }

        Nvdimm other = (Nvdimm) o;
        return java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.unitNumber, other.unitNumber)
                && java.util.Objects.equals(this.controllerKey, other.controllerKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.unitNumber == null ? 43 : this.unitNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.controllerKey == null ? 43 : this.controllerKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
