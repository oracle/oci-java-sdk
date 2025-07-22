/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Additional filters for the product <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AdditionalFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AdditionalFilter
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "code",
        "usageInstructions",
        "isMultiSelect",
        "isMandatory",
        "properties"
    })
    public AdditionalFilter(
            String name,
            String code,
            String usageInstructions,
            Boolean isMultiSelect,
            Boolean isMandatory,
            java.util.List<FilterProperty> properties) {
        super();
        this.name = name;
        this.code = code;
        this.usageInstructions = usageInstructions;
        this.isMultiSelect = isMultiSelect;
        this.isMandatory = isMandatory;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Filter name */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Filter name
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Filter code */
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

        /**
         * Filter code
         *
         * @param code the value to set
         * @return this builder
         */
        public Builder code(String code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /** Usage instructions for the properties */
        @com.fasterxml.jackson.annotation.JsonProperty("usageInstructions")
        private String usageInstructions;

        /**
         * Usage instructions for the properties
         *
         * @param usageInstructions the value to set
         * @return this builder
         */
        public Builder usageInstructions(String usageInstructions) {
            this.usageInstructions = usageInstructions;
            this.__explicitlySet__.add("usageInstructions");
            return this;
        }
        /** Is multiselect available for product code or not */
        @com.fasterxml.jackson.annotation.JsonProperty("isMultiSelect")
        private Boolean isMultiSelect;

        /**
         * Is multiselect available for product code or not
         *
         * @param isMultiSelect the value to set
         * @return this builder
         */
        public Builder isMultiSelect(Boolean isMultiSelect) {
            this.isMultiSelect = isMultiSelect;
            this.__explicitlySet__.add("isMultiSelect");
            return this;
        }
        /** Is the product code mandatory or not */
        @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
        private Boolean isMandatory;

        /**
         * Is the product code mandatory or not
         *
         * @param isMandatory the value to set
         * @return this builder
         */
        public Builder isMandatory(Boolean isMandatory) {
            this.isMandatory = isMandatory;
            this.__explicitlySet__.add("isMandatory");
            return this;
        }
        /** Additional filters attached to custom filter */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.List<FilterProperty> properties;

        /**
         * Additional filters attached to custom filter
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.List<FilterProperty> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdditionalFilter build() {
            AdditionalFilter model =
                    new AdditionalFilter(
                            this.name,
                            this.code,
                            this.usageInstructions,
                            this.isMultiSelect,
                            this.isMandatory,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdditionalFilter model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("usageInstructions")) {
                this.usageInstructions(model.getUsageInstructions());
            }
            if (model.wasPropertyExplicitlySet("isMultiSelect")) {
                this.isMultiSelect(model.getIsMultiSelect());
            }
            if (model.wasPropertyExplicitlySet("isMandatory")) {
                this.isMandatory(model.getIsMandatory());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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

    /** Filter name */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Filter name
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Filter code */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    /**
     * Filter code
     *
     * @return the value
     */
    public String getCode() {
        return code;
    }

    /** Usage instructions for the properties */
    @com.fasterxml.jackson.annotation.JsonProperty("usageInstructions")
    private final String usageInstructions;

    /**
     * Usage instructions for the properties
     *
     * @return the value
     */
    public String getUsageInstructions() {
        return usageInstructions;
    }

    /** Is multiselect available for product code or not */
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiSelect")
    private final Boolean isMultiSelect;

    /**
     * Is multiselect available for product code or not
     *
     * @return the value
     */
    public Boolean getIsMultiSelect() {
        return isMultiSelect;
    }

    /** Is the product code mandatory or not */
    @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
    private final Boolean isMandatory;

    /**
     * Is the product code mandatory or not
     *
     * @return the value
     */
    public Boolean getIsMandatory() {
        return isMandatory;
    }

    /** Additional filters attached to custom filter */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.List<FilterProperty> properties;

    /**
     * Additional filters attached to custom filter
     *
     * @return the value
     */
    public java.util.List<FilterProperty> getProperties() {
        return properties;
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
        sb.append("AdditionalFilter(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", code=").append(String.valueOf(this.code));
        sb.append(", usageInstructions=").append(String.valueOf(this.usageInstructions));
        sb.append(", isMultiSelect=").append(String.valueOf(this.isMultiSelect));
        sb.append(", isMandatory=").append(String.valueOf(this.isMandatory));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdditionalFilter)) {
            return false;
        }

        AdditionalFilter other = (AdditionalFilter) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.usageInstructions, other.usageInstructions)
                && java.util.Objects.equals(this.isMultiSelect, other.isMultiSelect)
                && java.util.Objects.equals(this.isMandatory, other.isMandatory)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result =
                (result * PRIME)
                        + (this.usageInstructions == null ? 43 : this.usageInstructions.hashCode());
        result =
                (result * PRIME)
                        + (this.isMultiSelect == null ? 43 : this.isMultiSelect.hashCode());
        result = (result * PRIME) + (this.isMandatory == null ? 43 : this.isMandatory.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
