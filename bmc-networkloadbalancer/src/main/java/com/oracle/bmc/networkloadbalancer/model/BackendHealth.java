/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * The health status of the specified backend server. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BackendHealth.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BackendHealth extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"status", "healthCheckResults"})
    public BackendHealth(Status status, java.util.List<HealthCheckResult> healthCheckResults) {
        super();
        this.status = status;
        this.healthCheckResults = healthCheckResults;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The general health status of the specified backend server.
         *
         * <p>**OK:** All health check probes return {@code OK}
         *
         * <p>**WARNING:** At least one of the health check probes does not return {@code OK}
         *
         * <p>**CRITICAL:** None of the health check probes return {@code OK}. * * **UNKNOWN:** One
         * of the health checks probes return {@code UNKNOWN}, * or the system is unable to retrieve
         * metrics at this time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The general health status of the specified backend server.
         *
         * <p>**OK:** All health check probes return {@code OK}
         *
         * <p>**WARNING:** At least one of the health check probes does not return {@code OK}
         *
         * <p>**CRITICAL:** None of the health check probes return {@code OK}. * * **UNKNOWN:** One
         * of the health checks probes return {@code UNKNOWN}, * or the system is unable to retrieve
         * metrics at this time.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * A list of the most recent health check results returned for the specified backend server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("healthCheckResults")
        private java.util.List<HealthCheckResult> healthCheckResults;

        /**
         * A list of the most recent health check results returned for the specified backend server.
         *
         * @param healthCheckResults the value to set
         * @return this builder
         */
        public Builder healthCheckResults(java.util.List<HealthCheckResult> healthCheckResults) {
            this.healthCheckResults = healthCheckResults;
            this.__explicitlySet__.add("healthCheckResults");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackendHealth build() {
            BackendHealth model = new BackendHealth(this.status, this.healthCheckResults);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackendHealth model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("healthCheckResults")) {
                this.healthCheckResults(model.getHealthCheckResults());
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
     * The general health status of the specified backend server.
     *
     * <p>**OK:** All health check probes return {@code OK}
     *
     * <p>**WARNING:** At least one of the health check probes does not return {@code OK}
     *
     * <p>**CRITICAL:** None of the health check probes return {@code OK}. * * **UNKNOWN:** One of
     * the health checks probes return {@code UNKNOWN}, * or the system is unable to retrieve
     * metrics at this time.
     */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Ok("OK"),
        Warning("WARNING"),
        Critical("CRITICAL"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The general health status of the specified backend server.
     *
     * <p>**OK:** All health check probes return {@code OK}
     *
     * <p>**WARNING:** At least one of the health check probes does not return {@code OK}
     *
     * <p>**CRITICAL:** None of the health check probes return {@code OK}. * * **UNKNOWN:** One of
     * the health checks probes return {@code UNKNOWN}, * or the system is unable to retrieve
     * metrics at this time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The general health status of the specified backend server.
     *
     * <p>**OK:** All health check probes return {@code OK}
     *
     * <p>**WARNING:** At least one of the health check probes does not return {@code OK}
     *
     * <p>**CRITICAL:** None of the health check probes return {@code OK}. * * **UNKNOWN:** One of
     * the health checks probes return {@code UNKNOWN}, * or the system is unable to retrieve
     * metrics at this time.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** A list of the most recent health check results returned for the specified backend server. */
    @com.fasterxml.jackson.annotation.JsonProperty("healthCheckResults")
    private final java.util.List<HealthCheckResult> healthCheckResults;

    /**
     * A list of the most recent health check results returned for the specified backend server.
     *
     * @return the value
     */
    public java.util.List<HealthCheckResult> getHealthCheckResults() {
        return healthCheckResults;
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
        sb.append("BackendHealth(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", healthCheckResults=").append(String.valueOf(this.healthCheckResults));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackendHealth)) {
            return false;
        }

        BackendHealth other = (BackendHealth) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.healthCheckResults, other.healthCheckResults)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.healthCheckResults == null
                                ? 43
                                : this.healthCheckResults.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
