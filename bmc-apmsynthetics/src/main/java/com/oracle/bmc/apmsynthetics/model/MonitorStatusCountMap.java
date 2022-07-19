/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the monitor count per state.
 * Example: {@code { "total" : 5, "enabled" : 3 , "disabled" : 2, "invalid" : 0 }}
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonitorStatusCountMap.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MonitorStatusCountMap {
    @Deprecated
    @java.beans.ConstructorProperties({"total", "enabled", "disabled", "invalid"})
    public MonitorStatusCountMap(
            Integer total, Integer enabled, Integer disabled, Integer invalid) {
        super();
        this.total = total;
        this.enabled = enabled;
        this.disabled = disabled;
        this.invalid = invalid;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Total number of monitors using the script.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("total")
        private Integer total;

        /**
         * Total number of monitors using the script.
         * @param total the value to set
         * @return this builder
         **/
        public Builder total(Integer total) {
            this.total = total;
            this.__explicitlySet__.add("total");
            return this;
        }
        /**
         * Number of enabled monitors using the script.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enabled")
        private Integer enabled;

        /**
         * Number of enabled monitors using the script.
         * @param enabled the value to set
         * @return this builder
         **/
        public Builder enabled(Integer enabled) {
            this.enabled = enabled;
            this.__explicitlySet__.add("enabled");
            return this;
        }
        /**
         * Number of disabled monitors using the script.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("disabled")
        private Integer disabled;

        /**
         * Number of disabled monitors using the script.
         * @param disabled the value to set
         * @return this builder
         **/
        public Builder disabled(Integer disabled) {
            this.disabled = disabled;
            this.__explicitlySet__.add("disabled");
            return this;
        }
        /**
         * Number of invalid monitors using the script.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("invalid")
        private Integer invalid;

        /**
         * Number of invalid monitors using the script.
         * @param invalid the value to set
         * @return this builder
         **/
        public Builder invalid(Integer invalid) {
            this.invalid = invalid;
            this.__explicitlySet__.add("invalid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitorStatusCountMap build() {
            MonitorStatusCountMap __instance__ =
                    new MonitorStatusCountMap(total, enabled, disabled, invalid);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitorStatusCountMap o) {
            Builder copiedBuilder =
                    total(o.getTotal())
                            .enabled(o.getEnabled())
                            .disabled(o.getDisabled())
                            .invalid(o.getInvalid());

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
     * Total number of monitors using the script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("total")
    private final Integer total;

    /**
     * Total number of monitors using the script.
     * @return the value
     **/
    public Integer getTotal() {
        return total;
    }

    /**
     * Number of enabled monitors using the script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    private final Integer enabled;

    /**
     * Number of enabled monitors using the script.
     * @return the value
     **/
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * Number of disabled monitors using the script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("disabled")
    private final Integer disabled;

    /**
     * Number of disabled monitors using the script.
     * @return the value
     **/
    public Integer getDisabled() {
        return disabled;
    }

    /**
     * Number of invalid monitors using the script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invalid")
    private final Integer invalid;

    /**
     * Number of invalid monitors using the script.
     * @return the value
     **/
    public Integer getInvalid() {
        return invalid;
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
        sb.append("MonitorStatusCountMap(");
        sb.append("total=").append(String.valueOf(this.total));
        sb.append(", enabled=").append(String.valueOf(this.enabled));
        sb.append(", disabled=").append(String.valueOf(this.disabled));
        sb.append(", invalid=").append(String.valueOf(this.invalid));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitorStatusCountMap)) {
            return false;
        }

        MonitorStatusCountMap other = (MonitorStatusCountMap) o;
        return java.util.Objects.equals(this.total, other.total)
                && java.util.Objects.equals(this.enabled, other.enabled)
                && java.util.Objects.equals(this.disabled, other.disabled)
                && java.util.Objects.equals(this.invalid, other.invalid)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.total == null ? 43 : this.total.hashCode());
        result = (result * PRIME) + (this.enabled == null ? 43 : this.enabled.hashCode());
        result = (result * PRIME) + (this.disabled == null ? 43 : this.disabled.hashCode());
        result = (result * PRIME) + (this.invalid == null ? 43 : this.invalid.hashCode());
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
