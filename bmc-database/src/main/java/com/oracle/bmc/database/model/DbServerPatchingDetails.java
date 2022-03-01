/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The scheduling details for the quarterly maintenance window. Patching and system updates take place during the maintenance window.
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
    builder = DbServerPatchingDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DbServerPatchingDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedPatchDuration")
        private Integer estimatedPatchDuration;

        public Builder estimatedPatchDuration(Integer estimatedPatchDuration) {
            this.estimatedPatchDuration = estimatedPatchDuration;
            this.__explicitlySet__.add("estimatedPatchDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchingStatus")
        private PatchingStatus patchingStatus;

        public Builder patchingStatus(PatchingStatus patchingStatus) {
            this.patchingStatus = patchingStatus;
            this.__explicitlySet__.add("patchingStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timePatchingStarted")
        private java.util.Date timePatchingStarted;

        public Builder timePatchingStarted(java.util.Date timePatchingStarted) {
            this.timePatchingStarted = timePatchingStarted;
            this.__explicitlySet__.add("timePatchingStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timePatchingEnded")
        private java.util.Date timePatchingEnded;

        public Builder timePatchingEnded(java.util.Date timePatchingEnded) {
            this.timePatchingEnded = timePatchingEnded;
            this.__explicitlySet__.add("timePatchingEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbServerPatchingDetails build() {
            DbServerPatchingDetails __instance__ =
                    new DbServerPatchingDetails(
                            estimatedPatchDuration,
                            patchingStatus,
                            timePatchingStarted,
                            timePatchingEnded);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbServerPatchingDetails o) {
            Builder copiedBuilder =
                    estimatedPatchDuration(o.getEstimatedPatchDuration())
                            .patchingStatus(o.getPatchingStatus())
                            .timePatchingStarted(o.getTimePatchingStarted())
                            .timePatchingEnded(o.getTimePatchingEnded());

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
     * Estimated time, in minutes, to patch one database server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedPatchDuration")
    Integer estimatedPatchDuration;
    /**
     * The status of the patching operation.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PatchingStatus {
        Scheduled("SCHEDULED"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),
        Failed("FAILED"),
        Complete("COMPLETE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PatchingStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchingStatus v : PatchingStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PatchingStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchingStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PatchingStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the patching operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchingStatus")
    PatchingStatus patchingStatus;

    /**
     * The time when the patching operation started.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePatchingStarted")
    java.util.Date timePatchingStarted;

    /**
     * The time when the patching operation ended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePatchingEnded")
    java.util.Date timePatchingEnded;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
