/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * A rule that defines a specific autoscale action to take and the metric that triggers that action.
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AutoScalePolicyRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutoScalePolicyRule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "metric"})
    public AutoScalePolicyRule(Action action, AutoScalePolicyMetricRule metric) {
        super();
        this.action = action;
        this.metric = metric;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The valid value are CHANGE_SHAPE_SCALE_UP or CHANGE_SHAPE_SCALE_DOWN. */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The valid value are CHANGE_SHAPE_SCALE_UP or CHANGE_SHAPE_SCALE_DOWN.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metric")
        private AutoScalePolicyMetricRule metric;

        public Builder metric(AutoScalePolicyMetricRule metric) {
            this.metric = metric;
            this.__explicitlySet__.add("metric");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutoScalePolicyRule build() {
            AutoScalePolicyRule model = new AutoScalePolicyRule(this.action, this.metric);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutoScalePolicyRule model) {
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("metric")) {
                this.metric(model.getMetric());
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

    /** The valid value are CHANGE_SHAPE_SCALE_UP or CHANGE_SHAPE_SCALE_DOWN. */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        ChangeShapeScaleUp("CHANGE_SHAPE_SCALE_UP"),
        ChangeShapeScaleDown("CHANGE_SHAPE_SCALE_DOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The valid value are CHANGE_SHAPE_SCALE_UP or CHANGE_SHAPE_SCALE_DOWN. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The valid value are CHANGE_SHAPE_SCALE_UP or CHANGE_SHAPE_SCALE_DOWN.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metric")
    private final AutoScalePolicyMetricRule metric;

    public AutoScalePolicyMetricRule getMetric() {
        return metric;
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
        sb.append("AutoScalePolicyRule(");
        sb.append("super=").append(super.toString());
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", metric=").append(String.valueOf(this.metric));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoScalePolicyRule)) {
            return false;
        }

        AutoScalePolicyRule other = (AutoScalePolicyRule) o;
        return java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.metric, other.metric)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.metric == null ? 43 : this.metric.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
