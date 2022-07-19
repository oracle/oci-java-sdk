/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of the AWR change history data for a single database parameter.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrDbParameterSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwrDbParameterSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "instanceNumber",
        "beginValue",
        "endValue",
        "isChanged",
        "valueModified",
        "isDefault"
    })
    public AwrDbParameterSummary(
            String name,
            Integer instanceNumber,
            String beginValue,
            String endValue,
            Boolean isChanged,
            String valueModified,
            Boolean isDefault) {
        super();
        this.name = name;
        this.instanceNumber = instanceNumber;
        this.beginValue = beginValue;
        this.endValue = endValue;
        this.isChanged = isChanged;
        this.valueModified = valueModified;
        this.isDefault = isDefault;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the parameter.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The database instance number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
        private Integer instanceNumber;

        /**
         * The database instance number.
         * @param instanceNumber the value to set
         * @return this builder
         **/
        public Builder instanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            this.__explicitlySet__.add("instanceNumber");
            return this;
        }
        /**
         * The parameter value when the period began.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("beginValue")
        private String beginValue;

        /**
         * The parameter value when the period began.
         * @param beginValue the value to set
         * @return this builder
         **/
        public Builder beginValue(String beginValue) {
            this.beginValue = beginValue;
            this.__explicitlySet__.add("beginValue");
            return this;
        }
        /**
         * The parameter value when the period ended.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endValue")
        private String endValue;

        /**
         * The parameter value when the period ended.
         * @param endValue the value to set
         * @return this builder
         **/
        public Builder endValue(String endValue) {
            this.endValue = endValue;
            this.__explicitlySet__.add("endValue");
            return this;
        }
        /**
         * Indicates whether the parameter value changed within the period.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isChanged")
        private Boolean isChanged;

        /**
         * Indicates whether the parameter value changed within the period.
         * @param isChanged the value to set
         * @return this builder
         **/
        public Builder isChanged(Boolean isChanged) {
            this.isChanged = isChanged;
            this.__explicitlySet__.add("isChanged");
            return this;
        }
        /**
         * Indicates whether the parameter has been modified after instance startup:
         *  - MODIFIED - Parameter has been modified with ALTER SESSION
         *  - SYSTEM_MOD - Parameter has been modified with ALTER SYSTEM (which causes all the currently logged in sessions\u2019 values to be modified)
         *  - FALSE - Parameter has not been modified after instance startup
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("valueModified")
        private String valueModified;

        /**
         * Indicates whether the parameter has been modified after instance startup:
         *  - MODIFIED - Parameter has been modified with ALTER SESSION
         *  - SYSTEM_MOD - Parameter has been modified with ALTER SYSTEM (which causes all the currently logged in sessions\u2019 values to be modified)
         *  - FALSE - Parameter has not been modified after instance startup
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
         * Indicates whether the parameter value in the end snapshot is the default.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates whether the parameter value in the end snapshot is the default.
         * @param isDefault the value to set
         * @return this builder
         **/
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDbParameterSummary build() {
            AwrDbParameterSummary __instance__ =
                    new AwrDbParameterSummary(
                            name,
                            instanceNumber,
                            beginValue,
                            endValue,
                            isChanged,
                            valueModified,
                            isDefault);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDbParameterSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .instanceNumber(o.getInstanceNumber())
                            .beginValue(o.getBeginValue())
                            .endValue(o.getEndValue())
                            .isChanged(o.getIsChanged())
                            .valueModified(o.getValueModified())
                            .isDefault(o.getIsDefault());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The name of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the parameter.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The database instance number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
    private final Integer instanceNumber;

    /**
     * The database instance number.
     * @return the value
     **/
    public Integer getInstanceNumber() {
        return instanceNumber;
    }

    /**
     * The parameter value when the period began.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("beginValue")
    private final String beginValue;

    /**
     * The parameter value when the period began.
     * @return the value
     **/
    public String getBeginValue() {
        return beginValue;
    }

    /**
     * The parameter value when the period ended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endValue")
    private final String endValue;

    /**
     * The parameter value when the period ended.
     * @return the value
     **/
    public String getEndValue() {
        return endValue;
    }

    /**
     * Indicates whether the parameter value changed within the period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isChanged")
    private final Boolean isChanged;

    /**
     * Indicates whether the parameter value changed within the period.
     * @return the value
     **/
    public Boolean getIsChanged() {
        return isChanged;
    }

    /**
     * Indicates whether the parameter has been modified after instance startup:
     *  - MODIFIED - Parameter has been modified with ALTER SESSION
     *  - SYSTEM_MOD - Parameter has been modified with ALTER SYSTEM (which causes all the currently logged in sessions\u2019 values to be modified)
     *  - FALSE - Parameter has not been modified after instance startup
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valueModified")
    private final String valueModified;

    /**
     * Indicates whether the parameter has been modified after instance startup:
     *  - MODIFIED - Parameter has been modified with ALTER SESSION
     *  - SYSTEM_MOD - Parameter has been modified with ALTER SYSTEM (which causes all the currently logged in sessions\u2019 values to be modified)
     *  - FALSE - Parameter has not been modified after instance startup
     *
     * @return the value
     **/
    public String getValueModified() {
        return valueModified;
    }

    /**
     * Indicates whether the parameter value in the end snapshot is the default.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates whether the parameter value in the end snapshot is the default.
     * @return the value
     **/
    public Boolean getIsDefault() {
        return isDefault;
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
        sb.append("AwrDbParameterSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", instanceNumber=").append(String.valueOf(this.instanceNumber));
        sb.append(", beginValue=").append(String.valueOf(this.beginValue));
        sb.append(", endValue=").append(String.valueOf(this.endValue));
        sb.append(", isChanged=").append(String.valueOf(this.isChanged));
        sb.append(", valueModified=").append(String.valueOf(this.valueModified));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDbParameterSummary)) {
            return false;
        }

        AwrDbParameterSummary other = (AwrDbParameterSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.instanceNumber, other.instanceNumber)
                && java.util.Objects.equals(this.beginValue, other.beginValue)
                && java.util.Objects.equals(this.endValue, other.endValue)
                && java.util.Objects.equals(this.isChanged, other.isChanged)
                && java.util.Objects.equals(this.valueModified, other.valueModified)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceNumber == null ? 43 : this.instanceNumber.hashCode());
        result = (result * PRIME) + (this.beginValue == null ? 43 : this.beginValue.hashCode());
        result = (result * PRIME) + (this.endValue == null ? 43 : this.endValue.hashCode());
        result = (result * PRIME) + (this.isChanged == null ? 43 : this.isChanged.hashCode());
        result =
                (result * PRIME)
                        + (this.valueModified == null ? 43 : this.valueModified.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
