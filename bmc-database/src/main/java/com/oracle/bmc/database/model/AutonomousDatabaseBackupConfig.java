/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Autonomous Database configuration details for storing [manual backups](https://docs.cloud.oracle.com/Content/Database/Tasks/adbbackingup.htm) in the [Object Storage](https://docs.cloud.oracle.com/Content/Object/Concepts/objectstorageoverview.htm) service.
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
    builder = AutonomousDatabaseBackupConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AutonomousDatabaseBackupConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("manualBackupBucketName")
        private String manualBackupBucketName;

        public Builder manualBackupBucketName(String manualBackupBucketName) {
            this.manualBackupBucketName = manualBackupBucketName;
            this.__explicitlySet__.add("manualBackupBucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("manualBackupType")
        private ManualBackupType manualBackupType;

        public Builder manualBackupType(ManualBackupType manualBackupType) {
            this.manualBackupType = manualBackupType;
            this.__explicitlySet__.add("manualBackupType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseBackupConfig build() {
            AutonomousDatabaseBackupConfig __instance__ =
                    new AutonomousDatabaseBackupConfig(manualBackupBucketName, manualBackupType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseBackupConfig o) {
            Builder copiedBuilder =
                    manualBackupBucketName(o.getManualBackupBucketName())
                            .manualBackupType(o.getManualBackupType());

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
     * Name of [Object Storage](https://docs.cloud.oracle.com/Content/Object/Concepts/objectstorageoverview.htm) bucket to use for storing manual backups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("manualBackupBucketName")
    String manualBackupBucketName;
    /**
     * The manual backup destination type.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ManualBackupType {
        None("NONE"),
        ObjectStore("OBJECT_STORE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ManualBackupType> map;

        static {
            map = new java.util.HashMap<>();
            for (ManualBackupType v : ManualBackupType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ManualBackupType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManualBackupType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ManualBackupType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The manual backup destination type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("manualBackupType")
    ManualBackupType manualBackupType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
