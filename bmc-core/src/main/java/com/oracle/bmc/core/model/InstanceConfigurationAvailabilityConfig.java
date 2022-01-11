/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Options for defining the availabiity of a VM instance after a maintenance event that impacts the underlying hardware.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceConfigurationAvailabilityConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InstanceConfigurationAvailabilityConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryAction")
        private RecoveryAction recoveryAction;

        public Builder recoveryAction(RecoveryAction recoveryAction) {
            this.recoveryAction = recoveryAction;
            this.__explicitlySet__.add("recoveryAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfigurationAvailabilityConfig build() {
            InstanceConfigurationAvailabilityConfig __instance__ =
                    new InstanceConfigurationAvailabilityConfig(recoveryAction);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationAvailabilityConfig o) {
            Builder copiedBuilder = recoveryAction(o.getRecoveryAction());

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
     * The lifecycle state for an instance when it is recovered after infrastructure maintenance.
     * * {@code RESTORE_INSTANCE} - The instance is restored to the lifecycle state it was in before the maintenance event.
     * If the instance was running, it is automatically rebooted. This is the default action when a value is not set.
     * * {@code STOP_INSTANCE} - The instance is recovered in the stopped state.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RecoveryAction {
        RestoreInstance("RESTORE_INSTANCE"),
        StopInstance("STOP_INSTANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, RecoveryAction> map;

        static {
            map = new java.util.HashMap<>();
            for (RecoveryAction v : RecoveryAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RecoveryAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RecoveryAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RecoveryAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The lifecycle state for an instance when it is recovered after infrastructure maintenance.
     * * {@code RESTORE_INSTANCE} - The instance is restored to the lifecycle state it was in before the maintenance event.
     * If the instance was running, it is automatically rebooted. This is the default action when a value is not set.
     * * {@code STOP_INSTANCE} - The instance is recovered in the stopped state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryAction")
    RecoveryAction recoveryAction;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
