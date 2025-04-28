/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Max duration of the ApprovalWorkflow must be acted at all levels.
 *
 * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
 * mutability: readWrite - required: true - returned: default - type: complex - uniqueness: none
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApprovalWorkflowMaxDuration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApprovalWorkflowMaxDuration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "unit"})
    public ApprovalWorkflowMaxDuration(Integer value, Unit unit) {
        super();
        this.value = value;
        this.unit = unit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The value of the max duration.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsMaxValue: 1488 -
         * idcsMinValue: 1 - idcsDefaultValue: 14 - multiValued: false - mutability: readWrite -
         * required: true - returned: default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Integer value;

        /**
         * The value of the max duration.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsMaxValue: 1488 -
         * idcsMinValue: 1 - idcsDefaultValue: 14 - multiValued: false - mutability: readWrite -
         * required: true - returned: default - type: integer - uniqueness: none
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(Integer value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The unit of the max duration.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsDefaultValue:
         * DAY - multiValued: false - mutability: readWrite - required: true - returned: default -
         * type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private Unit unit;

        /**
         * The unit of the max duration.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsDefaultValue:
         * DAY - multiValued: false - mutability: readWrite - required: true - returned: default -
         * type: string - uniqueness: none
         *
         * @param unit the value to set
         * @return this builder
         */
        public Builder unit(Unit unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApprovalWorkflowMaxDuration build() {
            ApprovalWorkflowMaxDuration model =
                    new ApprovalWorkflowMaxDuration(this.value, this.unit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApprovalWorkflowMaxDuration model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
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

    /**
     * The value of the max duration.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsMaxValue: 1488 -
     * idcsMinValue: 1 - idcsDefaultValue: 14 - multiValued: false - mutability: readWrite -
     * required: true - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Integer value;

    /**
     * The value of the max duration.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsMaxValue: 1488 -
     * idcsMinValue: 1 - idcsDefaultValue: 14 - multiValued: false - mutability: readWrite -
     * required: true - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * The unit of the max duration.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsDefaultValue: DAY -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * string - uniqueness: none
     */
    public enum Unit implements com.oracle.bmc.http.internal.BmcEnum {
        Month("MONTH"),
        Week("WEEK"),
        Day("DAY"),
        Hour("HOUR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Unit.class);

        private final String value;
        private static java.util.Map<String, Unit> map;

        static {
            map = new java.util.HashMap<>();
            for (Unit v : Unit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Unit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Unit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Unit', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The unit of the max duration.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsDefaultValue: DAY -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final Unit unit;

    /**
     * The unit of the max duration.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - idcsDefaultValue: DAY -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public Unit getUnit() {
        return unit;
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
        sb.append("ApprovalWorkflowMaxDuration(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApprovalWorkflowMaxDuration)) {
            return false;
        }

        ApprovalWorkflowMaxDuration other = (ApprovalWorkflowMaxDuration) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.unit, other.unit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
