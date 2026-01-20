/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * A summary model for the Occm demand signal resource properties. <br>
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
        builder = OccmDemandSignalResourcePropertiesSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OccmDemandSignalResourcePropertiesSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "propertyName",
        "propertyValue",
        "propertyMinValue",
        "propertyMaxValue",
        "propertyOptions",
        "propertyUnit",
        "isEditable"
    })
    public OccmDemandSignalResourcePropertiesSummary(
            String propertyName,
            String propertyValue,
            Long propertyMinValue,
            Long propertyMaxValue,
            java.util.List<OccmDemandSignalResourcePropertyOptionSummary> propertyOptions,
            String propertyUnit,
            Boolean isEditable) {
        super();
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
        this.propertyMinValue = propertyMinValue;
        this.propertyMaxValue = propertyMaxValue;
        this.propertyOptions = propertyOptions;
        this.propertyUnit = propertyUnit;
        this.isEditable = isEditable;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of demand signal resource's property. */
        @com.fasterxml.jackson.annotation.JsonProperty("propertyName")
        private String propertyName;

        /**
         * The name of demand signal resource's property.
         *
         * @param propertyName the value to set
         * @return this builder
         */
        public Builder propertyName(String propertyName) {
            this.propertyName = propertyName;
            this.__explicitlySet__.add("propertyName");
            return this;
        }
        /** Default value of demand signal resource's property. */
        @com.fasterxml.jackson.annotation.JsonProperty("propertyValue")
        private String propertyValue;

        /**
         * Default value of demand signal resource's property.
         *
         * @param propertyValue the value to set
         * @return this builder
         */
        public Builder propertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            this.__explicitlySet__.add("propertyValue");
            return this;
        }
        /**
         * The minimum value of demand signal resource's property. This is an optional parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("propertyMinValue")
        private Long propertyMinValue;

        /**
         * The minimum value of demand signal resource's property. This is an optional parameter.
         *
         * @param propertyMinValue the value to set
         * @return this builder
         */
        public Builder propertyMinValue(Long propertyMinValue) {
            this.propertyMinValue = propertyMinValue;
            this.__explicitlySet__.add("propertyMinValue");
            return this;
        }
        /**
         * The maximum value of demand signal resource's property. This is an optional parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("propertyMaxValue")
        private Long propertyMaxValue;

        /**
         * The maximum value of demand signal resource's property. This is an optional parameter.
         *
         * @param propertyMaxValue the value to set
         * @return this builder
         */
        public Builder propertyMaxValue(Long propertyMaxValue) {
            this.propertyMaxValue = propertyMaxValue;
            this.__explicitlySet__.add("propertyMaxValue");
            return this;
        }
        /**
         * Predefined options for demand signal resource's property. This is an optional parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("propertyOptions")
        private java.util.List<OccmDemandSignalResourcePropertyOptionSummary> propertyOptions;

        /**
         * Predefined options for demand signal resource's property. This is an optional parameter.
         *
         * @param propertyOptions the value to set
         * @return this builder
         */
        public Builder propertyOptions(
                java.util.List<OccmDemandSignalResourcePropertyOptionSummary> propertyOptions) {
            this.propertyOptions = propertyOptions;
            this.__explicitlySet__.add("propertyOptions");
            return this;
        }
        /** Unit for demand signal resource's property. */
        @com.fasterxml.jackson.annotation.JsonProperty("propertyUnit")
        private String propertyUnit;

        /**
         * Unit for demand signal resource's property.
         *
         * @param propertyUnit the value to set
         * @return this builder
         */
        public Builder propertyUnit(String propertyUnit) {
            this.propertyUnit = propertyUnit;
            this.__explicitlySet__.add("propertyUnit");
            return this;
        }
        /** This will indicate if demand signal resource's property is editable. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEditable")
        private Boolean isEditable;

        /**
         * This will indicate if demand signal resource's property is editable.
         *
         * @param isEditable the value to set
         * @return this builder
         */
        public Builder isEditable(Boolean isEditable) {
            this.isEditable = isEditable;
            this.__explicitlySet__.add("isEditable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OccmDemandSignalResourcePropertiesSummary build() {
            OccmDemandSignalResourcePropertiesSummary model =
                    new OccmDemandSignalResourcePropertiesSummary(
                            this.propertyName,
                            this.propertyValue,
                            this.propertyMinValue,
                            this.propertyMaxValue,
                            this.propertyOptions,
                            this.propertyUnit,
                            this.isEditable);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OccmDemandSignalResourcePropertiesSummary model) {
            if (model.wasPropertyExplicitlySet("propertyName")) {
                this.propertyName(model.getPropertyName());
            }
            if (model.wasPropertyExplicitlySet("propertyValue")) {
                this.propertyValue(model.getPropertyValue());
            }
            if (model.wasPropertyExplicitlySet("propertyMinValue")) {
                this.propertyMinValue(model.getPropertyMinValue());
            }
            if (model.wasPropertyExplicitlySet("propertyMaxValue")) {
                this.propertyMaxValue(model.getPropertyMaxValue());
            }
            if (model.wasPropertyExplicitlySet("propertyOptions")) {
                this.propertyOptions(model.getPropertyOptions());
            }
            if (model.wasPropertyExplicitlySet("propertyUnit")) {
                this.propertyUnit(model.getPropertyUnit());
            }
            if (model.wasPropertyExplicitlySet("isEditable")) {
                this.isEditable(model.getIsEditable());
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

    /** The name of demand signal resource's property. */
    @com.fasterxml.jackson.annotation.JsonProperty("propertyName")
    private final String propertyName;

    /**
     * The name of demand signal resource's property.
     *
     * @return the value
     */
    public String getPropertyName() {
        return propertyName;
    }

    /** Default value of demand signal resource's property. */
    @com.fasterxml.jackson.annotation.JsonProperty("propertyValue")
    private final String propertyValue;

    /**
     * Default value of demand signal resource's property.
     *
     * @return the value
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    /** The minimum value of demand signal resource's property. This is an optional parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("propertyMinValue")
    private final Long propertyMinValue;

    /**
     * The minimum value of demand signal resource's property. This is an optional parameter.
     *
     * @return the value
     */
    public Long getPropertyMinValue() {
        return propertyMinValue;
    }

    /** The maximum value of demand signal resource's property. This is an optional parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("propertyMaxValue")
    private final Long propertyMaxValue;

    /**
     * The maximum value of demand signal resource's property. This is an optional parameter.
     *
     * @return the value
     */
    public Long getPropertyMaxValue() {
        return propertyMaxValue;
    }

    /** Predefined options for demand signal resource's property. This is an optional parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("propertyOptions")
    private final java.util.List<OccmDemandSignalResourcePropertyOptionSummary> propertyOptions;

    /**
     * Predefined options for demand signal resource's property. This is an optional parameter.
     *
     * @return the value
     */
    public java.util.List<OccmDemandSignalResourcePropertyOptionSummary> getPropertyOptions() {
        return propertyOptions;
    }

    /** Unit for demand signal resource's property. */
    @com.fasterxml.jackson.annotation.JsonProperty("propertyUnit")
    private final String propertyUnit;

    /**
     * Unit for demand signal resource's property.
     *
     * @return the value
     */
    public String getPropertyUnit() {
        return propertyUnit;
    }

    /** This will indicate if demand signal resource's property is editable. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEditable")
    private final Boolean isEditable;

    /**
     * This will indicate if demand signal resource's property is editable.
     *
     * @return the value
     */
    public Boolean getIsEditable() {
        return isEditable;
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
        sb.append("OccmDemandSignalResourcePropertiesSummary(");
        sb.append("super=").append(super.toString());
        sb.append("propertyName=").append(String.valueOf(this.propertyName));
        sb.append(", propertyValue=").append(String.valueOf(this.propertyValue));
        sb.append(", propertyMinValue=").append(String.valueOf(this.propertyMinValue));
        sb.append(", propertyMaxValue=").append(String.valueOf(this.propertyMaxValue));
        sb.append(", propertyOptions=").append(String.valueOf(this.propertyOptions));
        sb.append(", propertyUnit=").append(String.valueOf(this.propertyUnit));
        sb.append(", isEditable=").append(String.valueOf(this.isEditable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OccmDemandSignalResourcePropertiesSummary)) {
            return false;
        }

        OccmDemandSignalResourcePropertiesSummary other =
                (OccmDemandSignalResourcePropertiesSummary) o;
        return java.util.Objects.equals(this.propertyName, other.propertyName)
                && java.util.Objects.equals(this.propertyValue, other.propertyValue)
                && java.util.Objects.equals(this.propertyMinValue, other.propertyMinValue)
                && java.util.Objects.equals(this.propertyMaxValue, other.propertyMaxValue)
                && java.util.Objects.equals(this.propertyOptions, other.propertyOptions)
                && java.util.Objects.equals(this.propertyUnit, other.propertyUnit)
                && java.util.Objects.equals(this.isEditable, other.isEditable)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.propertyName == null ? 43 : this.propertyName.hashCode());
        result =
                (result * PRIME)
                        + (this.propertyValue == null ? 43 : this.propertyValue.hashCode());
        result =
                (result * PRIME)
                        + (this.propertyMinValue == null ? 43 : this.propertyMinValue.hashCode());
        result =
                (result * PRIME)
                        + (this.propertyMaxValue == null ? 43 : this.propertyMaxValue.hashCode());
        result =
                (result * PRIME)
                        + (this.propertyOptions == null ? 43 : this.propertyOptions.hashCode());
        result = (result * PRIME) + (this.propertyUnit == null ? 43 : this.propertyUnit.hashCode());
        result = (result * PRIME) + (this.isEditable == null ? 43 : this.isEditable.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
