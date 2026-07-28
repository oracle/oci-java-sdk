/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * This field is used to define the retention period for backups. This is an optional field. If it
 * is not specified, it is set to null, no retention period will be applied to the backups. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RetentionDuration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RetentionDuration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"retentionTimeUnit", "retentionTimeAmount"})
    public RetentionDuration(RetentionTimeUnit retentionTimeUnit, Integer retentionTimeAmount) {
        super();
        this.retentionTimeUnit = retentionTimeUnit;
        this.retentionTimeAmount = retentionTimeAmount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The value you can assign to the Time Unit property for this Duration may be either
         * "YEARS" or "DAYS".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionTimeUnit")
        private RetentionTimeUnit retentionTimeUnit;

        /**
         * The value you can assign to the Time Unit property for this Duration may be either
         * "YEARS" or "DAYS".
         *
         * @param retentionTimeUnit the value to set
         * @return this builder
         */
        public Builder retentionTimeUnit(RetentionTimeUnit retentionTimeUnit) {
            this.retentionTimeUnit = retentionTimeUnit;
            this.__explicitlySet__.add("retentionTimeUnit");
            return this;
        }
        /**
         * The value to enter for the amount of retention time should be a numerical figure (such as
         * 1, 7, 30, etc.) that corresponds to the period specified in the retention time unit
         * property (such as YEARS, DAYS). The combination of these two properties determines the
         * total length of the retention period.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionTimeAmount")
        private Integer retentionTimeAmount;

        /**
         * The value to enter for the amount of retention time should be a numerical figure (such as
         * 1, 7, 30, etc.) that corresponds to the period specified in the retention time unit
         * property (such as YEARS, DAYS). The combination of these two properties determines the
         * total length of the retention period.
         *
         * @param retentionTimeAmount the value to set
         * @return this builder
         */
        public Builder retentionTimeAmount(Integer retentionTimeAmount) {
            this.retentionTimeAmount = retentionTimeAmount;
            this.__explicitlySet__.add("retentionTimeAmount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RetentionDuration build() {
            RetentionDuration model =
                    new RetentionDuration(this.retentionTimeUnit, this.retentionTimeAmount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RetentionDuration model) {
            if (model.wasPropertyExplicitlySet("retentionTimeUnit")) {
                this.retentionTimeUnit(model.getRetentionTimeUnit());
            }
            if (model.wasPropertyExplicitlySet("retentionTimeAmount")) {
                this.retentionTimeAmount(model.getRetentionTimeAmount());
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
     * The value you can assign to the Time Unit property for this Duration may be either "YEARS" or
     * "DAYS".
     */
    public enum RetentionTimeUnit implements com.oracle.bmc.http.internal.BmcEnum {
        Years("YEARS"),
        Days("DAYS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RetentionTimeUnit.class);

        private final String value;
        private static java.util.Map<String, RetentionTimeUnit> map;

        static {
            map = new java.util.HashMap<>();
            for (RetentionTimeUnit v : RetentionTimeUnit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RetentionTimeUnit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RetentionTimeUnit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RetentionTimeUnit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The value you can assign to the Time Unit property for this Duration may be either "YEARS" or
     * "DAYS".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionTimeUnit")
    private final RetentionTimeUnit retentionTimeUnit;

    /**
     * The value you can assign to the Time Unit property for this Duration may be either "YEARS" or
     * "DAYS".
     *
     * @return the value
     */
    public RetentionTimeUnit getRetentionTimeUnit() {
        return retentionTimeUnit;
    }

    /**
     * The value to enter for the amount of retention time should be a numerical figure (such as 1,
     * 7, 30, etc.) that corresponds to the period specified in the retention time unit property
     * (such as YEARS, DAYS). The combination of these two properties determines the total length of
     * the retention period.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionTimeAmount")
    private final Integer retentionTimeAmount;

    /**
     * The value to enter for the amount of retention time should be a numerical figure (such as 1,
     * 7, 30, etc.) that corresponds to the period specified in the retention time unit property
     * (such as YEARS, DAYS). The combination of these two properties determines the total length of
     * the retention period.
     *
     * @return the value
     */
    public Integer getRetentionTimeAmount() {
        return retentionTimeAmount;
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
        sb.append("RetentionDuration(");
        sb.append("super=").append(super.toString());
        sb.append("retentionTimeUnit=").append(String.valueOf(this.retentionTimeUnit));
        sb.append(", retentionTimeAmount=").append(String.valueOf(this.retentionTimeAmount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RetentionDuration)) {
            return false;
        }

        RetentionDuration other = (RetentionDuration) o;
        return java.util.Objects.equals(this.retentionTimeUnit, other.retentionTimeUnit)
                && java.util.Objects.equals(this.retentionTimeAmount, other.retentionTimeAmount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.retentionTimeUnit == null ? 43 : this.retentionTimeUnit.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionTimeAmount == null
                                ? 43
                                : this.retentionTimeAmount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
