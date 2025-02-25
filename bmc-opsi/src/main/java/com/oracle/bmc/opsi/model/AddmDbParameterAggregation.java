/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summarizes change history for specific database parameter
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddmDbParameterAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddmDbParameterAggregation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "instNum",
        "defaultValue",
        "beginValue",
        "endValue",
        "isChanged",
        "isDefault",
        "valueModified",
        "isHighImpact"
    })
    public AddmDbParameterAggregation(
            String id,
            String name,
            Integer instNum,
            String defaultValue,
            String beginValue,
            String endValue,
            Boolean isChanged,
            Boolean isDefault,
            String valueModified,
            Boolean isHighImpact) {
        super();
        this.id = id;
        this.name = name;
        this.instNum = instNum;
        this.defaultValue = defaultValue;
        this.beginValue = beginValue;
        this.endValue = endValue;
        this.isChanged = isChanged;
        this.isDefault = isDefault;
        this.valueModified = valueModified;
        this.isHighImpact = isHighImpact;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Name of  parameter
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of  parameter
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Number of database instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instNum")
        private Integer instNum;

        /**
         * Number of database instance
         * @param instNum the value to set
         * @return this builder
         **/
        public Builder instNum(Integer instNum) {
            this.instNum = instNum;
            this.__explicitlySet__.add("instNum");
            return this;
        }
        /**
         * Parameter default value
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * Parameter default value
         * @param defaultValue the value to set
         * @return this builder
         **/
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /**
         * Parameter value when time period began
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("beginValue")
        private String beginValue;

        /**
         * Parameter value when time period began
         * @param beginValue the value to set
         * @return this builder
         **/
        public Builder beginValue(String beginValue) {
            this.beginValue = beginValue;
            this.__explicitlySet__.add("beginValue");
            return this;
        }
        /**
         * Parameter value when time period ended
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endValue")
        private String endValue;

        /**
         * Parameter value when time period ended
         * @param endValue the value to set
         * @return this builder
         **/
        public Builder endValue(String endValue) {
            this.endValue = endValue;
            this.__explicitlySet__.add("endValue");
            return this;
        }
        /**
         * Indicates whether the parameter's value changed during the selected time range (TRUE) or
         * did not change during the selected time range (FALSE)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isChanged")
        private Boolean isChanged;

        /**
         * Indicates whether the parameter's value changed during the selected time range (TRUE) or
         * did not change during the selected time range (FALSE)
         *
         * @param isChanged the value to set
         * @return this builder
         **/
        public Builder isChanged(Boolean isChanged) {
            this.isChanged = isChanged;
            this.__explicitlySet__.add("isChanged");
            return this;
        }
        /**
         * Indicates whether the parameter's end value was set to the default value (TRUE) or was
         * specified in the parameter file (FALSE)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates whether the parameter's end value was set to the default value (TRUE) or was
         * specified in the parameter file (FALSE)
         *
         * @param isDefault the value to set
         * @return this builder
         **/
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /**
         * Indicates whether the parameter has been modified after instance starup
         * MODIFIED - Parameter has been modified with ALTER SESSION
         * SYSTEM_MOD - Parameter has been modified with ALTER SYSTEM
         * FALSE - Parameter has not been modified after instance starup
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("valueModified")
        private String valueModified;

        /**
         * Indicates whether the parameter has been modified after instance starup
         * MODIFIED - Parameter has been modified with ALTER SESSION
         * SYSTEM_MOD - Parameter has been modified with ALTER SYSTEM
         * FALSE - Parameter has not been modified after instance starup
         *
         * @param valueModified the value to set
         * @return this builder
         **/
        public Builder valueModified(String valueModified) {
            this.valueModified = valueModified;
            this.__explicitlySet__.add("valueModified");
            return this;
        }
        /**
         * Indicates whether the parameter is a high impact parameter (TRUE) or not (FALSE)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHighImpact")
        private Boolean isHighImpact;

        /**
         * Indicates whether the parameter is a high impact parameter (TRUE) or not (FALSE)
         *
         * @param isHighImpact the value to set
         * @return this builder
         **/
        public Builder isHighImpact(Boolean isHighImpact) {
            this.isHighImpact = isHighImpact;
            this.__explicitlySet__.add("isHighImpact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddmDbParameterAggregation build() {
            AddmDbParameterAggregation model =
                    new AddmDbParameterAggregation(
                            this.id,
                            this.name,
                            this.instNum,
                            this.defaultValue,
                            this.beginValue,
                            this.endValue,
                            this.isChanged,
                            this.isDefault,
                            this.valueModified,
                            this.isHighImpact);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddmDbParameterAggregation model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("instNum")) {
                this.instNum(model.getInstNum());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("beginValue")) {
                this.beginValue(model.getBeginValue());
            }
            if (model.wasPropertyExplicitlySet("endValue")) {
                this.endValue(model.getEndValue());
            }
            if (model.wasPropertyExplicitlySet("isChanged")) {
                this.isChanged(model.getIsChanged());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("valueModified")) {
                this.valueModified(model.getValueModified());
            }
            if (model.wasPropertyExplicitlySet("isHighImpact")) {
                this.isHighImpact(model.getIsHighImpact());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database insight.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Name of  parameter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of  parameter
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Number of database instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instNum")
    private final Integer instNum;

    /**
     * Number of database instance
     * @return the value
     **/
    public Integer getInstNum() {
        return instNum;
    }

    /**
     * Parameter default value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * Parameter default value
     * @return the value
     **/
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Parameter value when time period began
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("beginValue")
    private final String beginValue;

    /**
     * Parameter value when time period began
     * @return the value
     **/
    public String getBeginValue() {
        return beginValue;
    }

    /**
     * Parameter value when time period ended
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endValue")
    private final String endValue;

    /**
     * Parameter value when time period ended
     * @return the value
     **/
    public String getEndValue() {
        return endValue;
    }

    /**
     * Indicates whether the parameter's value changed during the selected time range (TRUE) or
     * did not change during the selected time range (FALSE)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isChanged")
    private final Boolean isChanged;

    /**
     * Indicates whether the parameter's value changed during the selected time range (TRUE) or
     * did not change during the selected time range (FALSE)
     *
     * @return the value
     **/
    public Boolean getIsChanged() {
        return isChanged;
    }

    /**
     * Indicates whether the parameter's end value was set to the default value (TRUE) or was
     * specified in the parameter file (FALSE)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates whether the parameter's end value was set to the default value (TRUE) or was
     * specified in the parameter file (FALSE)
     *
     * @return the value
     **/
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Indicates whether the parameter has been modified after instance starup
     * MODIFIED - Parameter has been modified with ALTER SESSION
     * SYSTEM_MOD - Parameter has been modified with ALTER SYSTEM
     * FALSE - Parameter has not been modified after instance starup
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valueModified")
    private final String valueModified;

    /**
     * Indicates whether the parameter has been modified after instance starup
     * MODIFIED - Parameter has been modified with ALTER SESSION
     * SYSTEM_MOD - Parameter has been modified with ALTER SYSTEM
     * FALSE - Parameter has not been modified after instance starup
     *
     * @return the value
     **/
    public String getValueModified() {
        return valueModified;
    }

    /**
     * Indicates whether the parameter is a high impact parameter (TRUE) or not (FALSE)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighImpact")
    private final Boolean isHighImpact;

    /**
     * Indicates whether the parameter is a high impact parameter (TRUE) or not (FALSE)
     *
     * @return the value
     **/
    public Boolean getIsHighImpact() {
        return isHighImpact;
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
        sb.append("AddmDbParameterAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", instNum=").append(String.valueOf(this.instNum));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", beginValue=").append(String.valueOf(this.beginValue));
        sb.append(", endValue=").append(String.valueOf(this.endValue));
        sb.append(", isChanged=").append(String.valueOf(this.isChanged));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", valueModified=").append(String.valueOf(this.valueModified));
        sb.append(", isHighImpact=").append(String.valueOf(this.isHighImpact));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddmDbParameterAggregation)) {
            return false;
        }

        AddmDbParameterAggregation other = (AddmDbParameterAggregation) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.instNum, other.instNum)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.beginValue, other.beginValue)
                && java.util.Objects.equals(this.endValue, other.endValue)
                && java.util.Objects.equals(this.isChanged, other.isChanged)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.valueModified, other.valueModified)
                && java.util.Objects.equals(this.isHighImpact, other.isHighImpact)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.instNum == null ? 43 : this.instNum.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.beginValue == null ? 43 : this.beginValue.hashCode());
        result = (result * PRIME) + (this.endValue == null ? 43 : this.endValue.hashCode());
        result = (result * PRIME) + (this.isChanged == null ? 43 : this.isChanged.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.valueModified == null ? 43 : this.valueModified.hashCode());
        result = (result * PRIME) + (this.isHighImpact == null ? 43 : this.isHighImpact.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
