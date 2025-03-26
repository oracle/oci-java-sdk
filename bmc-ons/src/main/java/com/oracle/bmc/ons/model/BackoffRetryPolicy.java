/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons.model;

/**
 * The backoff retry portion of the subscription delivery policy. For information about retry durations for subscriptions, see
 * [How Notifications Works](https://docs.oracle.com/iaas/Content/Notification/Concepts/notificationoverview.htm#how).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BackoffRetryPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BackoffRetryPolicy extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"maxRetryDuration", "policyType"})
    public BackoffRetryPolicy(Integer maxRetryDuration, PolicyType policyType) {
        super();
        this.maxRetryDuration = maxRetryDuration;
        this.policyType = policyType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The maximum retry duration in milliseconds. Default value is {@code 7200000} (2 hours).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxRetryDuration")
        private Integer maxRetryDuration;

        /**
         * The maximum retry duration in milliseconds. Default value is {@code 7200000} (2 hours).
         * @param maxRetryDuration the value to set
         * @return this builder
         **/
        public Builder maxRetryDuration(Integer maxRetryDuration) {
            this.maxRetryDuration = maxRetryDuration;
            this.__explicitlySet__.add("maxRetryDuration");
            return this;
        }
        /**
         * The type of delivery policy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policyType")
        private PolicyType policyType;

        /**
         * The type of delivery policy.
         *
         * @param policyType the value to set
         * @return this builder
         **/
        public Builder policyType(PolicyType policyType) {
            this.policyType = policyType;
            this.__explicitlySet__.add("policyType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackoffRetryPolicy build() {
            BackoffRetryPolicy model =
                    new BackoffRetryPolicy(this.maxRetryDuration, this.policyType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackoffRetryPolicy model) {
            if (model.wasPropertyExplicitlySet("maxRetryDuration")) {
                this.maxRetryDuration(model.getMaxRetryDuration());
            }
            if (model.wasPropertyExplicitlySet("policyType")) {
                this.policyType(model.getPolicyType());
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
     * The maximum retry duration in milliseconds. Default value is {@code 7200000} (2 hours).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxRetryDuration")
    private final Integer maxRetryDuration;

    /**
     * The maximum retry duration in milliseconds. Default value is {@code 7200000} (2 hours).
     * @return the value
     **/
    public Integer getMaxRetryDuration() {
        return maxRetryDuration;
    }

    /**
     * The type of delivery policy.
     *
     **/
    public enum PolicyType {
        Exponential("EXPONENTIAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PolicyType.class);

        private final String value;
        private static java.util.Map<String, PolicyType> map;

        static {
            map = new java.util.HashMap<>();
            for (PolicyType v : PolicyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PolicyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PolicyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PolicyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of delivery policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyType")
    private final PolicyType policyType;

    /**
     * The type of delivery policy.
     *
     * @return the value
     **/
    public PolicyType getPolicyType() {
        return policyType;
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
        sb.append("BackoffRetryPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("maxRetryDuration=").append(String.valueOf(this.maxRetryDuration));
        sb.append(", policyType=").append(String.valueOf(this.policyType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackoffRetryPolicy)) {
            return false;
        }

        BackoffRetryPolicy other = (BackoffRetryPolicy) o;
        return java.util.Objects.equals(this.maxRetryDuration, other.maxRetryDuration)
                && java.util.Objects.equals(this.policyType, other.policyType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maxRetryDuration == null ? 43 : this.maxRetryDuration.hashCode());
        result = (result * PRIME) + (this.policyType == null ? 43 : this.policyType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
