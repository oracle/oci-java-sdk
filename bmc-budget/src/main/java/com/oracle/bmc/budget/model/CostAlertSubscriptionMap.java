/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.model;

/**
 * The mapping of cost monitor to alert subscription along with thresholds. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CostAlertSubscriptionMap.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CostAlertSubscriptionMap
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operator",
        "thresholdAbsoluteValue",
        "thresholdRelativePercent",
        "costAlertSubscriptionId"
    })
    public CostAlertSubscriptionMap(
            Operator operator,
            Integer thresholdAbsoluteValue,
            Integer thresholdRelativePercent,
            String costAlertSubscriptionId) {
        super();
        this.operator = operator;
        this.thresholdAbsoluteValue = thresholdAbsoluteValue;
        this.thresholdRelativePercent = thresholdRelativePercent;
        this.costAlertSubscriptionId = costAlertSubscriptionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The filter operator. Example: 'AND', 'OR'. */
        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private Operator operator;

        /**
         * The filter operator. Example: 'AND', 'OR'.
         *
         * @param operator the value to set
         * @return this builder
         */
        public Builder operator(Operator operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }
        /** The absolute threshold value. */
        @com.fasterxml.jackson.annotation.JsonProperty("thresholdAbsoluteValue")
        private Integer thresholdAbsoluteValue;

        /**
         * The absolute threshold value.
         *
         * @param thresholdAbsoluteValue the value to set
         * @return this builder
         */
        public Builder thresholdAbsoluteValue(Integer thresholdAbsoluteValue) {
            this.thresholdAbsoluteValue = thresholdAbsoluteValue;
            this.__explicitlySet__.add("thresholdAbsoluteValue");
            return this;
        }
        /** The relative percentage threshold value. */
        @com.fasterxml.jackson.annotation.JsonProperty("thresholdRelativePercent")
        private Integer thresholdRelativePercent;

        /**
         * The relative percentage threshold value.
         *
         * @param thresholdRelativePercent the value to set
         * @return this builder
         */
        public Builder thresholdRelativePercent(Integer thresholdRelativePercent) {
            this.thresholdRelativePercent = thresholdRelativePercent;
            this.__explicitlySet__.add("thresholdRelativePercent");
            return this;
        }
        /** The costAlertSubscription ocid which the cost monitor alert maps to. */
        @com.fasterxml.jackson.annotation.JsonProperty("costAlertSubscriptionId")
        private String costAlertSubscriptionId;

        /**
         * The costAlertSubscription ocid which the cost monitor alert maps to.
         *
         * @param costAlertSubscriptionId the value to set
         * @return this builder
         */
        public Builder costAlertSubscriptionId(String costAlertSubscriptionId) {
            this.costAlertSubscriptionId = costAlertSubscriptionId;
            this.__explicitlySet__.add("costAlertSubscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CostAlertSubscriptionMap build() {
            CostAlertSubscriptionMap model =
                    new CostAlertSubscriptionMap(
                            this.operator,
                            this.thresholdAbsoluteValue,
                            this.thresholdRelativePercent,
                            this.costAlertSubscriptionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CostAlertSubscriptionMap model) {
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
            }
            if (model.wasPropertyExplicitlySet("thresholdAbsoluteValue")) {
                this.thresholdAbsoluteValue(model.getThresholdAbsoluteValue());
            }
            if (model.wasPropertyExplicitlySet("thresholdRelativePercent")) {
                this.thresholdRelativePercent(model.getThresholdRelativePercent());
            }
            if (model.wasPropertyExplicitlySet("costAlertSubscriptionId")) {
                this.costAlertSubscriptionId(model.getCostAlertSubscriptionId());
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

    /** The filter operator. Example: 'AND', 'OR'. */
    public enum Operator implements com.oracle.bmc.http.internal.BmcEnum {
        And("AND"),
        Or("OR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Operator.class);

        private final String value;
        private static java.util.Map<String, Operator> map;

        static {
            map = new java.util.HashMap<>();
            for (Operator v : Operator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Operator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Operator', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The filter operator. Example: 'AND', 'OR'. */
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final Operator operator;

    /**
     * The filter operator. Example: 'AND', 'OR'.
     *
     * @return the value
     */
    public Operator getOperator() {
        return operator;
    }

    /** The absolute threshold value. */
    @com.fasterxml.jackson.annotation.JsonProperty("thresholdAbsoluteValue")
    private final Integer thresholdAbsoluteValue;

    /**
     * The absolute threshold value.
     *
     * @return the value
     */
    public Integer getThresholdAbsoluteValue() {
        return thresholdAbsoluteValue;
    }

    /** The relative percentage threshold value. */
    @com.fasterxml.jackson.annotation.JsonProperty("thresholdRelativePercent")
    private final Integer thresholdRelativePercent;

    /**
     * The relative percentage threshold value.
     *
     * @return the value
     */
    public Integer getThresholdRelativePercent() {
        return thresholdRelativePercent;
    }

    /** The costAlertSubscription ocid which the cost monitor alert maps to. */
    @com.fasterxml.jackson.annotation.JsonProperty("costAlertSubscriptionId")
    private final String costAlertSubscriptionId;

    /**
     * The costAlertSubscription ocid which the cost monitor alert maps to.
     *
     * @return the value
     */
    public String getCostAlertSubscriptionId() {
        return costAlertSubscriptionId;
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
        sb.append("CostAlertSubscriptionMap(");
        sb.append("super=").append(super.toString());
        sb.append("operator=").append(String.valueOf(this.operator));
        sb.append(", thresholdAbsoluteValue=").append(String.valueOf(this.thresholdAbsoluteValue));
        sb.append(", thresholdRelativePercent=")
                .append(String.valueOf(this.thresholdRelativePercent));
        sb.append(", costAlertSubscriptionId=")
                .append(String.valueOf(this.costAlertSubscriptionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CostAlertSubscriptionMap)) {
            return false;
        }

        CostAlertSubscriptionMap other = (CostAlertSubscriptionMap) o;
        return java.util.Objects.equals(this.operator, other.operator)
                && java.util.Objects.equals(
                        this.thresholdAbsoluteValue, other.thresholdAbsoluteValue)
                && java.util.Objects.equals(
                        this.thresholdRelativePercent, other.thresholdRelativePercent)
                && java.util.Objects.equals(
                        this.costAlertSubscriptionId, other.costAlertSubscriptionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result =
                (result * PRIME)
                        + (this.thresholdAbsoluteValue == null
                                ? 43
                                : this.thresholdAbsoluteValue.hashCode());
        result =
                (result * PRIME)
                        + (this.thresholdRelativePercent == null
                                ? 43
                                : this.thresholdRelativePercent.hashCode());
        result =
                (result * PRIME)
                        + (this.costAlertSubscriptionId == null
                                ? 43
                                : this.costAlertSubscriptionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
