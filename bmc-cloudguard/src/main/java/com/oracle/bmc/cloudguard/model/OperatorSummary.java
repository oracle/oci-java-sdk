/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Summary information on available operators.
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
public final class OperatorSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
         * Name of the operand
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the operand
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Display name of the operand
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the operand
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Data type of the operand
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("datatype")
        private String datatype;

        /**
         * Data type of the operand
         * @param datatype the value to set
         * @return this builder
         **/
        public Builder datatype(String datatype) {
            this.datatype = datatype;
            this.__explicitlySet__.add("datatype");
            return this;
        }
        /**
         * Operand list type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedListtype")
        private String managedListtype;

        /**
         * Operand list type
         * @param managedListtype the value to set
         * @return this builder
         **/
        public Builder managedListtype(String managedListtype) {
            this.managedListtype = managedListtype;
            this.__explicitlySet__.add("managedListtype");
            return this;
        }
        /**
         * Type of filter
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filterType")
        private ConditionFilterType filterType;

        /**
         * Type of filter
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
         * Configuration value type list for multi-list data type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("multiListTypes")
        private java.util.List<String> multiListTypes;

        /**
         * Configuration value type list for multi-list data type
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
            OperatorSummary model =
                    new OperatorSummary(
                            this.name,
                            this.displayName,
                            this.datatype,
                            this.managedListtype,
                            this.filterType,
                            this.operators,
                            this.multiListTypes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperatorSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("datatype")) {
                this.datatype(model.getDatatype());
            }
            if (model.wasPropertyExplicitlySet("managedListtype")) {
                this.managedListtype(model.getManagedListtype());
            }
            if (model.wasPropertyExplicitlySet("filterType")) {
                this.filterType(model.getFilterType());
            }
            if (model.wasPropertyExplicitlySet("operators")) {
                this.operators(model.getOperators());
            }
            if (model.wasPropertyExplicitlySet("multiListTypes")) {
                this.multiListTypes(model.getMultiListTypes());
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
     * Name of the operand
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the operand
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Display name of the operand
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the operand
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Data type of the operand
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datatype")
    private final String datatype;

    /**
     * Data type of the operand
     * @return the value
     **/
    public String getDatatype() {
        return datatype;
    }

    /**
     * Operand list type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedListtype")
    private final String managedListtype;

    /**
     * Operand list type
     * @return the value
     **/
    public String getManagedListtype() {
        return managedListtype;
    }

    /**
     * Type of filter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterType")
    private final ConditionFilterType filterType;

    /**
     * Type of filter
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
     * Configuration value type list for multi-list data type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multiListTypes")
    private final java.util.List<String> multiListTypes;

    /**
     * Configuration value type list for multi-list data type
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
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", datatype=").append(String.valueOf(this.datatype));
        sb.append(", managedListtype=").append(String.valueOf(this.managedListtype));
        sb.append(", filterType=").append(String.valueOf(this.filterType));
        sb.append(", operators=").append(String.valueOf(this.operators));
        sb.append(", multiListTypes=").append(String.valueOf(this.multiListTypes));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
