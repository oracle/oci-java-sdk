/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Summary of Operator
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OperatorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OperatorSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "displayName",
        "datatype",
        "managedListtype",
        "filterType",
        "operators",
        "multiListTypes"
    })
    public OperatorSummary(
            String name,
            String displayName,
            String datatype,
            String managedListtype,
            ConditionFilterType filterType,
            java.util.List<ConditionOperator> operators,
            java.util.List<String> multiListTypes) {
        super();
        this.name = name;
        this.displayName = displayName;
        this.datatype = datatype;
        this.managedListtype = managedListtype;
        this.filterType = filterType;
        this.operators = operators;
        this.multiListTypes = multiListTypes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * name of the operand
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * name of the operand
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * display name of the operand
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * display name of the operand
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * data type of operand
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("datatype")
        private String datatype;

        /**
         * data type of operand
         * @param datatype the value to set
         * @return this builder
         **/
        public Builder datatype(String datatype) {
            this.datatype = datatype;
            this.__explicitlySet__.add("datatype");
            return this;
        }
        /**
         * operand list type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedListtype")
        private String managedListtype;

        /**
         * operand list type
         * @param managedListtype the value to set
         * @return this builder
         **/
        public Builder managedListtype(String managedListtype) {
            this.managedListtype = managedListtype;
            this.__explicitlySet__.add("managedListtype");
            return this;
        }
        /**
         * Filter type can be config filter or condition filter
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filterType")
        private ConditionFilterType filterType;

        /**
         * Filter type can be config filter or condition filter
         * @param filterType the value to set
         * @return this builder
         **/
        public Builder filterType(ConditionFilterType filterType) {
            this.filterType = filterType;
            this.__explicitlySet__.add("filterType");
            return this;
        }
        /**
         * List of parameters
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operators")
        private java.util.List<ConditionOperator> operators;

        /**
         * List of parameters
         * @param operators the value to set
         * @return this builder
         **/
        public Builder operators(java.util.List<ConditionOperator> operators) {
            this.operators = operators;
            this.__explicitlySet__.add("operators");
            return this;
        }
        /**
         * configuration value type list for multilist data type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("multiListTypes")
        private java.util.List<String> multiListTypes;

        /**
         * configuration value type list for multilist data type
         * @param multiListTypes the value to set
         * @return this builder
         **/
        public Builder multiListTypes(java.util.List<String> multiListTypes) {
            this.multiListTypes = multiListTypes;
            this.__explicitlySet__.add("multiListTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperatorSummary build() {
            OperatorSummary __instance__ =
                    new OperatorSummary(
                            name,
                            displayName,
                            datatype,
                            managedListtype,
                            filterType,
                            operators,
                            multiListTypes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperatorSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .displayName(o.getDisplayName())
                            .datatype(o.getDatatype())
                            .managedListtype(o.getManagedListtype())
                            .filterType(o.getFilterType())
                            .operators(o.getOperators())
                            .multiListTypes(o.getMultiListTypes());

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
     * name of the operand
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * name of the operand
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * display name of the operand
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * display name of the operand
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * data type of operand
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datatype")
    private final String datatype;

    /**
     * data type of operand
     * @return the value
     **/
    public String getDatatype() {
        return datatype;
    }

    /**
     * operand list type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedListtype")
    private final String managedListtype;

    /**
     * operand list type
     * @return the value
     **/
    public String getManagedListtype() {
        return managedListtype;
    }

    /**
     * Filter type can be config filter or condition filter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterType")
    private final ConditionFilterType filterType;

    /**
     * Filter type can be config filter or condition filter
     * @return the value
     **/
    public ConditionFilterType getFilterType() {
        return filterType;
    }

    /**
     * List of parameters
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operators")
    private final java.util.List<ConditionOperator> operators;

    /**
     * List of parameters
     * @return the value
     **/
    public java.util.List<ConditionOperator> getOperators() {
        return operators;
    }

    /**
     * configuration value type list for multilist data type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multiListTypes")
    private final java.util.List<String> multiListTypes;

    /**
     * configuration value type list for multilist data type
     * @return the value
     **/
    public java.util.List<String> getMultiListTypes() {
        return multiListTypes;
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
        sb.append("OperatorSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", datatype=").append(String.valueOf(this.datatype));
        sb.append(", managedListtype=").append(String.valueOf(this.managedListtype));
        sb.append(", filterType=").append(String.valueOf(this.filterType));
        sb.append(", operators=").append(String.valueOf(this.operators));
        sb.append(", multiListTypes=").append(String.valueOf(this.multiListTypes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperatorSummary)) {
            return false;
        }

        OperatorSummary other = (OperatorSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.datatype, other.datatype)
                && java.util.Objects.equals(this.managedListtype, other.managedListtype)
                && java.util.Objects.equals(this.filterType, other.filterType)
                && java.util.Objects.equals(this.operators, other.operators)
                && java.util.Objects.equals(this.multiListTypes, other.multiListTypes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.datatype == null ? 43 : this.datatype.hashCode());
        result =
                (result * PRIME)
                        + (this.managedListtype == null ? 43 : this.managedListtype.hashCode());
        result = (result * PRIME) + (this.filterType == null ? 43 : this.filterType.hashCode());
        result = (result * PRIME) + (this.operators == null ? 43 : this.operators.hashCode());
        result =
                (result * PRIME)
                        + (this.multiListTypes == null ? 43 : this.multiListTypes.hashCode());
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
