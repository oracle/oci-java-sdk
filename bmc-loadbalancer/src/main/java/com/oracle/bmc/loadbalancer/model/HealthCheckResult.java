/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * Information about a single backend server health check result reported by a load balancer.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HealthCheckResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HealthCheckResult {
    @Deprecated
    @java.beans.ConstructorProperties({
        "subnetId",
        "sourceIpAddress",
        "timestamp",
        "healthCheckStatus"
    })
    public HealthCheckResult(
            String subnetId,
            String sourceIpAddress,
            java.util.Date timestamp,
            HealthCheckStatus healthCheckStatus) {
        super();
        this.subnetId = subnetId;
        this.sourceIpAddress = sourceIpAddress;
        this.timestamp = timestamp;
        this.healthCheckStatus = healthCheckStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet hosting the load balancer that reported this health check status.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet hosting the load balancer that reported this health check status.
         *
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The IP address of the health check status report provider. This identifier helps you differentiate same-subnet
         * load balancers that report health check status.
         * <p>
         * Example: {@code 10.0.0.7}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceIpAddress")
        private String sourceIpAddress;

        /**
         * The IP address of the health check status report provider. This identifier helps you differentiate same-subnet
         * load balancers that report health check status.
         * <p>
         * Example: {@code 10.0.0.7}
         *
         * @param sourceIpAddress the value to set
         * @return this builder
         **/
        public Builder sourceIpAddress(String sourceIpAddress) {
            this.sourceIpAddress = sourceIpAddress;
            this.__explicitlySet__.add("sourceIpAddress");
            return this;
        }
        /**
         * The date and time the data was retrieved, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2017-06-02T18:28:11+00:00}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The date and time the data was retrieved, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2017-06-02T18:28:11+00:00}
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
            HealthCheckResult __instance__ =
                    new HealthCheckResult(subnetId, sourceIpAddress, timestamp, healthCheckStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthCheckResult o) {
            Builder copiedBuilder =
                    subnetId(o.getSubnetId())
                            .sourceIpAddress(o.getSourceIpAddress())
                            .timestamp(o.getTimestamp())
                            .healthCheckStatus(o.getHealthCheckStatus());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet hosting the load balancer that reported this health check status.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet hosting the load balancer that reported this health check status.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The IP address of the health check status report provider. This identifier helps you differentiate same-subnet
     * load balancers that report health check status.
     * <p>
     * Example: {@code 10.0.0.7}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceIpAddress")
    private final String sourceIpAddress;

    /**
     * The IP address of the health check status report provider. This identifier helps you differentiate same-subnet
     * load balancers that report health check status.
     * <p>
     * Example: {@code 10.0.0.7}
     *
     * @return the value
     **/
    public String getSourceIpAddress() {
        return sourceIpAddress;
    }

    /**
     * The date and time the data was retrieved, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2017-06-02T18:28:11+00:00}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The date and time the data was retrieved, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2017-06-02T18:28:11+00:00}
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
        RegexMismatch("REGEX_MISMATCH"),
        ConnectFailed("CONNECT_FAILED"),
        IoError("IO_ERROR"),
        Offline("OFFLINE"),
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
        sb.append("subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", sourceIpAddress=").append(String.valueOf(this.sourceIpAddress));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", healthCheckStatus=").append(String.valueOf(this.healthCheckStatus));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
        return java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.sourceIpAddress, other.sourceIpAddress)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.healthCheckStatus, other.healthCheckStatus)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceIpAddress == null ? 43 : this.sourceIpAddress.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.healthCheckStatus == null ? 43 : this.healthCheckStatus.hashCode());
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
