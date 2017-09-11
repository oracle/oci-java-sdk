/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceConsoleConnection.Builder.class
)
public class InstanceConsoleConnection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private String connectionString;

        @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
        private String fingerprint;

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public InstanceConsoleConnection build() {
            return new InstanceConsoleConnection(
                    compartmentId, connectionString, fingerprint, id, instanceId, lifecycleState);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConsoleConnection o) {
            return compartmentId(o.getCompartmentId())
                    .connectionString(o.getConnectionString())
                    .fingerprint(o.getFingerprint())
                    .id(o.getId())
                    .instanceId(o.getInstanceId())
                    .lifecycleState(o.getLifecycleState());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment to contain the ConsoleConnection
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * The ssh connection string to the instance console
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    String connectionString;

    /**
     * The fingerprint of the ssh publicKey.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
    String fingerprint;

    /**
     * The OCID of the instance console connection
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The host instance OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    String instanceId;
    /**
     * The current state of the instance console connection.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleted("DELETED"),
        Deleting("DELETING"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the instance console connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;
}
