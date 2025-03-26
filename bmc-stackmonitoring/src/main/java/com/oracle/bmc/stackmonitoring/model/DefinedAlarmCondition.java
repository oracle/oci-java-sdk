/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Defined Alarm Condition.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DefinedAlarmCondition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DefinedAlarmCondition
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"metricName", "conditionType", "conditions"})
    public DefinedAlarmCondition(
            String metricName, ConditionType conditionType, java.util.List<Condition> conditions) {
        super();
        this.metricName = metricName;
        this.conditionType = conditionType;
        this.conditions = conditions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The metric name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        /**
         * The metric name.
         * @param metricName the value to set
         * @return this builder
         **/
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }
        /**
         * Type of defined monitoring template.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("conditionType")
        private ConditionType conditionType;

        /**
         * Type of defined monitoring template.
         * @param conditionType the value to set
         * @return this builder
         **/
        public Builder conditionType(ConditionType conditionType) {
            this.conditionType = conditionType;
            this.__explicitlySet__.add("conditionType");
            return this;
        }
        /**
         * Monitoring template conditions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("conditions")
        private java.util.List<Condition> conditions;

        /**
         * Monitoring template conditions.
         * @param conditions the value to set
         * @return this builder
         **/
        public Builder conditions(java.util.List<Condition> conditions) {
            this.conditions = conditions;
            this.__explicitlySet__.add("conditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DefinedAlarmCondition build() {
            DefinedAlarmCondition model =
                    new DefinedAlarmCondition(this.metricName, this.conditionType, this.conditions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefinedAlarmCondition model) {
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("conditionType")) {
                this.conditionType(model.getConditionType());
            }
            if (model.wasPropertyExplicitlySet("conditions")) {
                this.conditions(model.getConditions());
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
     * The metric name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

    /**
     * The metric name.
     * @return the value
     **/
    public String getMetricName() {
        return metricName;
    }

    /**
     * Type of defined monitoring template.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conditionType")
    private final ConditionType conditionType;

    /**
     * Type of defined monitoring template.
     * @return the value
     **/
    public ConditionType getConditionType() {
        return conditionType;
    }

    /**
     * Monitoring template conditions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    private final java.util.List<Condition> conditions;

    /**
     * Monitoring template conditions.
     * @return the value
     **/
    public java.util.List<Condition> getConditions() {
        return conditions;
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
        sb.append("DefinedAlarmCondition(");
        sb.append("super=").append(super.toString());
        sb.append("metricName=").append(String.valueOf(this.metricName));
        sb.append(", conditionType=").append(String.valueOf(this.conditionType));
        sb.append(", conditions=").append(String.valueOf(this.conditions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DefinedAlarmCondition)) {
            return false;
        }

        DefinedAlarmCondition other = (DefinedAlarmCondition) o;
        return java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.conditionType, other.conditionType)
                && java.util.Objects.equals(this.conditions, other.conditions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result =
                (result * PRIME)
                        + (this.conditionType == null ? 43 : this.conditionType.hashCode());
        result = (result * PRIME) + (this.conditions == null ? 43 : this.conditions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
