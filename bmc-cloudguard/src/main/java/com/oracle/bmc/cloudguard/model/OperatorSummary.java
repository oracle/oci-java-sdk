/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OperatorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OperatorSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("datatype")
        private String datatype;

        public Builder datatype(String datatype) {
            this.datatype = datatype;
            this.__explicitlySet__.add("datatype");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedListtype")
        private String managedListtype;

        public Builder managedListtype(String managedListtype) {
            this.managedListtype = managedListtype;
            this.__explicitlySet__.add("managedListtype");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filterType")
        private ConditionFilterType filterType;

        public Builder filterType(ConditionFilterType filterType) {
            this.filterType = filterType;
            this.__explicitlySet__.add("filterType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operators")
        private java.util.List<ConditionOperator> operators;

        public Builder operators(java.util.List<ConditionOperator> operators) {
            this.operators = operators;
            this.__explicitlySet__.add("operators");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("multiListTypes")
        private java.util.List<String> multiListTypes;

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

    /**
     * name of the operand
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * display name of the operand
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * data type of operand
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datatype")
    String datatype;

    /**
     * operand list type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedListtype")
    String managedListtype;

    /**
     * Filter type can be config filter or condition filter
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterType")
    ConditionFilterType filterType;

    /**
     * List of parameters
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operators")
    java.util.List<ConditionOperator> operators;

    /**
     * configuration value type list for multilist data type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multiListTypes")
    java.util.List<String> multiListTypes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
