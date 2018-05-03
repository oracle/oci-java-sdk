/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The health status details for a backend set.
 * <p>
 * This object does not explicitly enumerate backend servers with a status of `OK`. However, they are included in the
 * `totalBackendCount` sum.
 *
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BackendSetHealth.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BackendSetHealth {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("criticalStateBackendNames")
        private java.util.List<String> criticalStateBackendNames;

        public Builder criticalStateBackendNames(java.util.List<String> criticalStateBackendNames) {
            this.criticalStateBackendNames = criticalStateBackendNames;
            this.__explicitlySet__.add("criticalStateBackendNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalBackendCount")
        private Integer totalBackendCount;

        public Builder totalBackendCount(Integer totalBackendCount) {
            this.totalBackendCount = totalBackendCount;
            this.__explicitlySet__.add("totalBackendCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unknownStateBackendNames")
        private java.util.List<String> unknownStateBackendNames;

        public Builder unknownStateBackendNames(java.util.List<String> unknownStateBackendNames) {
            this.unknownStateBackendNames = unknownStateBackendNames;
            this.__explicitlySet__.add("unknownStateBackendNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warningStateBackendNames")
        private java.util.List<String> warningStateBackendNames;

        public Builder warningStateBackendNames(java.util.List<String> warningStateBackendNames) {
            this.warningStateBackendNames = warningStateBackendNames;
            this.__explicitlySet__.add("warningStateBackendNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackendSetHealth build() {
            BackendSetHealth __instance__ =
                    new BackendSetHealth(
                            criticalStateBackendNames,
                            status,
                            totalBackendCount,
                            unknownStateBackendNames,
                            warningStateBackendNames);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackendSetHealth o) {
            Builder copiedBuilder =
                    criticalStateBackendNames(o.getCriticalStateBackendNames())
                            .status(o.getStatus())
                            .totalBackendCount(o.getTotalBackendCount())
                            .unknownStateBackendNames(o.getUnknownStateBackendNames())
                            .warningStateBackendNames(o.getWarningStateBackendNames());

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

    /**
     * A list of backend servers that are currently in the `CRITICAL` health state. The list identifies each backend server by
     * IP address and port.
     * <p>
     * Example: `10.0.0.4:8080`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("criticalStateBackendNames")
    java.util.List<String> criticalStateBackendNames;
    /**
     * Overall health status of the backend set.
     * <p>
     *  **OK:** All backend servers in the backend set return a status of `OK`.
     * <p>
     *  **WARNING:** Half or more of the backend set's backend servers return a status of `OK` and at least one backend
     * server returns a status of `WARNING`, `CRITICAL`, or `UNKNOWN`.
     * <p>
     *  **CRITICAL:** Fewer than half of the backend set's backend servers return a status of `OK`.
     * <p>
     *  **UNKNOWN:** More than half of the backend set's backend servers return a status of `UNKNOWN`, the system was
     * unable to retrieve metrics, or the backend set does not have a listener attached.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Ok("OK"),
        Warning("WARNING"),
        Critical("CRITICAL"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Overall health status of the backend set.
     * <p>
     *  **OK:** All backend servers in the backend set return a status of `OK`.
     * <p>
     *  **WARNING:** Half or more of the backend set's backend servers return a status of `OK` and at least one backend
     * server returns a status of `WARNING`, `CRITICAL`, or `UNKNOWN`.
     * <p>
     *  **CRITICAL:** Fewer than half of the backend set's backend servers return a status of `OK`.
     * <p>
     *  **UNKNOWN:** More than half of the backend set's backend servers return a status of `UNKNOWN`, the system was
     * unable to retrieve metrics, or the backend set does not have a listener attached.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * The total number of backend servers in this backend set.
     * <p>
     * Example: `7`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalBackendCount")
    Integer totalBackendCount;

    /**
     * A list of backend servers that are currently in the `UNKNOWN` health state. The list identifies each backend server by
     * IP address and port.
     * <p>
     * Example: `10.0.0.5:8080`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unknownStateBackendNames")
    java.util.List<String> unknownStateBackendNames;

    /**
     * A list of backend servers that are currently in the `WARNING` health state. The list identifies each backend server by
     * IP address and port.
     * <p>
     * Example: `10.0.0.3:8080`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warningStateBackendNames")
    java.util.List<String> warningStateBackendNames;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
