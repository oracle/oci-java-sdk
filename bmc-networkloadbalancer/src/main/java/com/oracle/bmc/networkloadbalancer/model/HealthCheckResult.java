/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * Information about a single backend server health check result reported by a network load balancer.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HealthCheckResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HealthCheckResult extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timestamp", "healthCheckStatus"})
    public HealthCheckResult(java.util.Date timestamp, HealthCheckStatus healthCheckStatus) {
        super();
        this.timestamp = timestamp;
        this.healthCheckStatus = healthCheckStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The date and time the data was retrieved, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2020-05-01T18:28:11+00:00}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The date and time the data was retrieved, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2020-05-01T18:28:11+00:00}
         *
         * @param timestamp the value to set
         * @return this builder
         **/
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /**
         * The result of the most recent health check.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("healthCheckStatus")
        private HealthCheckStatus healthCheckStatus;

        /**
         * The result of the most recent health check.
         *
         * @param healthCheckStatus the value to set
         * @return this builder
         **/
        public Builder healthCheckStatus(HealthCheckStatus healthCheckStatus) {
            this.healthCheckStatus = healthCheckStatus;
            this.__explicitlySet__.add("healthCheckStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HealthCheckResult build() {
            HealthCheckResult model = new HealthCheckResult(this.timestamp, this.healthCheckStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthCheckResult model) {
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("healthCheckStatus")) {
                this.healthCheckStatus(model.getHealthCheckStatus());
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
     * The date and time the data was retrieved, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2020-05-01T18:28:11+00:00}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The date and time the data was retrieved, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2020-05-01T18:28:11+00:00}
     *
     * @return the value
     **/
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * The result of the most recent health check.
     *
     **/
    public enum HealthCheckStatus {
        Ok("OK"),
        InvalidStatusCode("INVALID_STATUS_CODE"),
        TimedOut("TIMED_OUT"),
        HealthPayloadMismatch("HEALTH_PAYLOAD_MISMATCH"),
        ConnectFailed("CONNECT_FAILED"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(HealthCheckStatus.class);

        private final String value;
        private static java.util.Map<String, HealthCheckStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (HealthCheckStatus v : HealthCheckStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HealthCheckStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HealthCheckStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HealthCheckStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The result of the most recent health check.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("healthCheckStatus")
    private final HealthCheckStatus healthCheckStatus;

    /**
     * The result of the most recent health check.
     *
     * @return the value
     **/
    public HealthCheckStatus getHealthCheckStatus() {
        return healthCheckStatus;
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
        sb.append("HealthCheckResult(");
        sb.append("super=").append(super.toString());
        sb.append("timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", healthCheckStatus=").append(String.valueOf(this.healthCheckStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HealthCheckResult)) {
            return false;
        }

        HealthCheckResult other = (HealthCheckResult) o;
        return java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.healthCheckStatus, other.healthCheckStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.healthCheckStatus == null ? 43 : this.healthCheckStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
