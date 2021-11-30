/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a data file.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Datafile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Datafile {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("onlineStatus")
        private OnlineStatus onlineStatus;

        public Builder onlineStatus(OnlineStatus onlineStatus) {
            this.onlineStatus = onlineStatus;
            this.__explicitlySet__.add("onlineStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoExtensible")
        private Boolean isAutoExtensible;

        public Builder isAutoExtensible(Boolean isAutoExtensible) {
            this.isAutoExtensible = isAutoExtensible;
            this.__explicitlySet__.add("isAutoExtensible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lostWriteProtect")
        private LostWriteProtect lostWriteProtect;

        public Builder lostWriteProtect(LostWriteProtect lostWriteProtect) {
            this.lostWriteProtect = lostWriteProtect;
            this.__explicitlySet__.add("lostWriteProtect");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shared")
        private Shared shared;

        public Builder shared(Shared shared) {
            this.shared = shared;
            this.__explicitlySet__.add("shared");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private java.math.BigDecimal instanceId;

        public Builder instanceId(java.math.BigDecimal instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxSizeKB")
        private java.math.BigDecimal maxSizeKB;

        public Builder maxSizeKB(java.math.BigDecimal maxSizeKB) {
            this.maxSizeKB = maxSizeKB;
            this.__explicitlySet__.add("maxSizeKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allocatedSizeKB")
        private java.math.BigDecimal allocatedSizeKB;

        public Builder allocatedSizeKB(java.math.BigDecimal allocatedSizeKB) {
            this.allocatedSizeKB = allocatedSizeKB;
            this.__explicitlySet__.add("allocatedSizeKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userSizeKB")
        private java.math.BigDecimal userSizeKB;

        public Builder userSizeKB(java.math.BigDecimal userSizeKB) {
            this.userSizeKB = userSizeKB;
            this.__explicitlySet__.add("userSizeKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("incrementBy")
        private java.math.BigDecimal incrementBy;

        public Builder incrementBy(java.math.BigDecimal incrementBy) {
            this.incrementBy = incrementBy;
            this.__explicitlySet__.add("incrementBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeSpaceKB")
        private java.math.BigDecimal freeSpaceKB;

        public Builder freeSpaceKB(java.math.BigDecimal freeSpaceKB) {
            this.freeSpaceKB = freeSpaceKB;
            this.__explicitlySet__.add("freeSpaceKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usedSpaceKB")
        private java.math.BigDecimal usedSpaceKB;

        public Builder usedSpaceKB(java.math.BigDecimal usedSpaceKB) {
            this.usedSpaceKB = usedSpaceKB;
            this.__explicitlySet__.add("usedSpaceKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAvailable")
        private Double usedPercentAvailable;

        public Builder usedPercentAvailable(Double usedPercentAvailable) {
            this.usedPercentAvailable = usedPercentAvailable;
            this.__explicitlySet__.add("usedPercentAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAllocated")
        private Double usedPercentAllocated;

        public Builder usedPercentAllocated(Double usedPercentAllocated) {
            this.usedPercentAllocated = usedPercentAllocated;
            this.__explicitlySet__.add("usedPercentAllocated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Datafile build() {
            Datafile __instance__ =
                    new Datafile(
                            name,
                            status,
                            onlineStatus,
                            isAutoExtensible,
                            lostWriteProtect,
                            shared,
                            instanceId,
                            maxSizeKB,
                            allocatedSizeKB,
                            userSizeKB,
                            incrementBy,
                            freeSpaceKB,
                            usedSpaceKB,
                            usedPercentAvailable,
                            usedPercentAllocated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Datafile o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .status(o.getStatus())
                            .onlineStatus(o.getOnlineStatus())
                            .isAutoExtensible(o.getIsAutoExtensible())
                            .lostWriteProtect(o.getLostWriteProtect())
                            .shared(o.getShared())
                            .instanceId(o.getInstanceId())
                            .maxSizeKB(o.getMaxSizeKB())
                            .allocatedSizeKB(o.getAllocatedSizeKB())
                            .userSizeKB(o.getUserSizeKB())
                            .incrementBy(o.getIncrementBy())
                            .freeSpaceKB(o.getFreeSpaceKB())
                            .usedSpaceKB(o.getUsedSpaceKB())
                            .usedPercentAvailable(o.getUsedPercentAvailable())
                            .usedPercentAllocated(o.getUsedPercentAllocated());

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
     * The filename (including the path) of the data file or temp file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * The status of the file. INVALID status is used when the file number is not in use, for example, a file in a tablespace that was removed.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Available("AVAILABLE"),
        Invalid("INVALID"),
        Offline("OFFLINE"),
        Online("ONLINE"),
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
     * The status of the file. INVALID status is used when the file number is not in use, for example, a file in a tablespace that was removed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;
    /**
     * The online status of the file.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum OnlineStatus {
        Sysoff("SYSOFF"),
        System("SYSTEM"),
        Offline("OFFLINE"),
        Online("ONLINE"),
        Recover("RECOVER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, OnlineStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (OnlineStatus v : OnlineStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OnlineStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OnlineStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OnlineStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The online status of the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onlineStatus")
    OnlineStatus onlineStatus;

    /**
     * Indicates whether the data file is auto-extensible.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoExtensible")
    Boolean isAutoExtensible;
    /**
     * The lost write protection status of the file.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LostWriteProtect {
        Enabled("ENABLED"),
        ProtectOff("PROTECT_OFF"),
        Suspend("SUSPEND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LostWriteProtect> map;

        static {
            map = new java.util.HashMap<>();
            for (LostWriteProtect v : LostWriteProtect.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LostWriteProtect(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LostWriteProtect create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LostWriteProtect', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The lost write protection status of the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lostWriteProtect")
    LostWriteProtect lostWriteProtect;
    /**
     * Type of tablespace this file belongs to. If it's for a shared tablespace, for a local temporary tablespace for RIM (read-only) instances, or for local temporary tablespace for all instance types.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Shared {
        Shared("SHARED"),
        LocalForRim("LOCAL_FOR_RIM"),
        LocalForAll("LOCAL_FOR_ALL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Shared> map;

        static {
            map = new java.util.HashMap<>();
            for (Shared v : Shared.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Shared(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Shared create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Shared', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of tablespace this file belongs to. If it's for a shared tablespace, for a local temporary tablespace for RIM (read-only) instances, or for local temporary tablespace for all instance types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shared")
    Shared shared;

    /**
     * Instance ID of the instance to which the temp file belongs. This column has a NULL value for temp files that belong to shared tablespaces.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    java.math.BigDecimal instanceId;

    /**
     * The maximum file size in KB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxSizeKB")
    java.math.BigDecimal maxSizeKB;

    /**
     * The allocated file size in KB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedSizeKB")
    java.math.BigDecimal allocatedSizeKB;

    /**
     * The size of the file available for user data in KB. The actual size of the file minus the USER_BYTES value is used to store file-related metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userSizeKB")
    java.math.BigDecimal userSizeKB;

    /**
     * The number of blocks used as auto-extension increment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("incrementBy")
    java.math.BigDecimal incrementBy;

    /**
     * The free space available in the data file in KB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeSpaceKB")
    java.math.BigDecimal freeSpaceKB;

    /**
     * The total space used in the data file in KB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedSpaceKB")
    java.math.BigDecimal usedSpaceKB;

    /**
     * The percentage of used space out of the maximum available space in the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAvailable")
    Double usedPercentAvailable;

    /**
     * The percentage of used space out of the total allocated space in the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAllocated")
    Double usedPercentAllocated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
