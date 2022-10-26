/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Quota policy for a usage plan. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Quota.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Quota extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "unit", "resetPolicy", "operationOnBreach"})
    public Quota(
            Integer value,
            Unit unit,
            ResetPolicy resetPolicy,
            OperationOnBreach operationOnBreach) {
        super();
        this.value = value;
        this.unit = unit;
        this.resetPolicy = resetPolicy;
        this.operationOnBreach = operationOnBreach;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of requests that can be made per time period. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Integer value;

        /**
         * The number of requests that can be made per time period.
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
         * The unit of time over which quotas are calculated. Example: {@code MINUTE} or {@code
         * MONTH}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private Unit unit;

        /**
         * The unit of time over which quotas are calculated. Example: {@code MINUTE} or {@code
         * MONTH}
         *
         * @param unit the value to set
         * @return this builder
         */
        public Builder unit(Unit unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }
        /** The policy that controls when quotas will reset. Example: {@code CALENDAR} */
        @com.fasterxml.jackson.annotation.JsonProperty("resetPolicy")
        private ResetPolicy resetPolicy;

        /**
         * The policy that controls when quotas will reset. Example: {@code CALENDAR}
         *
         * @param resetPolicy the value to set
         * @return this builder
         */
        public Builder resetPolicy(ResetPolicy resetPolicy) {
            this.resetPolicy = resetPolicy;
            this.__explicitlySet__.add("resetPolicy");
            return this;
        }
        /**
         * What the usage plan will do when a quota is breached: {@code REJECT} will allow no
         * further requests {@code ALLOW} will continue to allow further requests
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operationOnBreach")
        private OperationOnBreach operationOnBreach;

        /**
         * What the usage plan will do when a quota is breached: {@code REJECT} will allow no
         * further requests {@code ALLOW} will continue to allow further requests
         *
         * @param operationOnBreach the value to set
         * @return this builder
         */
        public Builder operationOnBreach(OperationOnBreach operationOnBreach) {
            this.operationOnBreach = operationOnBreach;
            this.__explicitlySet__.add("operationOnBreach");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Quota build() {
            Quota model =
                    new Quota(this.value, this.unit, this.resetPolicy, this.operationOnBreach);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Quota model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
            }
            if (model.wasPropertyExplicitlySet("resetPolicy")) {
                this.resetPolicy(model.getResetPolicy());
            }
            if (model.wasPropertyExplicitlySet("operationOnBreach")) {
                this.operationOnBreach(model.getOperationOnBreach());
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

    /** The number of requests that can be made per time period. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Integer value;

    /**
     * The number of requests that can be made per time period.
     *
     * @return the value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * The unit of time over which quotas are calculated. Example: {@code MINUTE} or {@code MONTH}
     */
    public enum Unit implements com.oracle.bmc.http.internal.BmcEnum {
        Minute("MINUTE"),
        Hour("HOUR"),
        Day("DAY"),
        Week("WEEK"),
        Month("MONTH"),

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
     * The unit of time over which quotas are calculated. Example: {@code MINUTE} or {@code MONTH}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final Unit unit;

    /**
     * The unit of time over which quotas are calculated. Example: {@code MINUTE} or {@code MONTH}
     *
     * @return the value
     */
    public Unit getUnit() {
        return unit;
    }

    /** The policy that controls when quotas will reset. Example: {@code CALENDAR} */
    public enum ResetPolicy implements com.oracle.bmc.http.internal.BmcEnum {
        Calendar("CALENDAR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResetPolicy.class);

        private final String value;
        private static java.util.Map<String, ResetPolicy> map;

        static {
            map = new java.util.HashMap<>();
            for (ResetPolicy v : ResetPolicy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResetPolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResetPolicy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResetPolicy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The policy that controls when quotas will reset. Example: {@code CALENDAR} */
    @com.fasterxml.jackson.annotation.JsonProperty("resetPolicy")
    private final ResetPolicy resetPolicy;

    /**
     * The policy that controls when quotas will reset. Example: {@code CALENDAR}
     *
     * @return the value
     */
    public ResetPolicy getResetPolicy() {
        return resetPolicy;
    }

    /**
     * What the usage plan will do when a quota is breached: {@code REJECT} will allow no further
     * requests {@code ALLOW} will continue to allow further requests
     */
    public enum OperationOnBreach implements com.oracle.bmc.http.internal.BmcEnum {
        Reject("REJECT"),
        Allow("ALLOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OperationOnBreach.class);

        private final String value;
        private static java.util.Map<String, OperationOnBreach> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationOnBreach v : OperationOnBreach.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationOnBreach(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationOnBreach create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationOnBreach', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * What the usage plan will do when a quota is breached: {@code REJECT} will allow no further
     * requests {@code ALLOW} will continue to allow further requests
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operationOnBreach")
    private final OperationOnBreach operationOnBreach;

    /**
     * What the usage plan will do when a quota is breached: {@code REJECT} will allow no further
     * requests {@code ALLOW} will continue to allow further requests
     *
     * @return the value
     */
    public OperationOnBreach getOperationOnBreach() {
        return operationOnBreach;
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
        sb.append("Quota(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(", resetPolicy=").append(String.valueOf(this.resetPolicy));
        sb.append(", operationOnBreach=").append(String.valueOf(this.operationOnBreach));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Quota)) {
            return false;
        }

        Quota other = (Quota) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.resetPolicy, other.resetPolicy)
                && java.util.Objects.equals(this.operationOnBreach, other.operationOnBreach)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + (this.resetPolicy == null ? 43 : this.resetPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.operationOnBreach == null ? 43 : this.operationOnBreach.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
