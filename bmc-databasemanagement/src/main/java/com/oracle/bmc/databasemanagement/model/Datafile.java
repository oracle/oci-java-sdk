/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a data file. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Datafile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Datafile extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "status",
        "onlineStatus",
        "isAutoExtensible",
        "lostWriteProtect",
        "shared",
        "instanceId",
        "maxSizeKB",
        "allocatedSizeKB",
        "userSizeKB",
        "incrementBy",
        "freeSpaceKB",
        "usedSpaceKB",
        "usedPercentAvailable",
        "usedPercentAllocated"
    })
    public Datafile(
            String name,
            Status status,
            OnlineStatus onlineStatus,
            Boolean isAutoExtensible,
            LostWriteProtect lostWriteProtect,
            Shared shared,
            java.math.BigDecimal instanceId,
            java.math.BigDecimal maxSizeKB,
            java.math.BigDecimal allocatedSizeKB,
            java.math.BigDecimal userSizeKB,
            java.math.BigDecimal incrementBy,
            java.math.BigDecimal freeSpaceKB,
            java.math.BigDecimal usedSpaceKB,
            Double usedPercentAvailable,
            Double usedPercentAllocated) {
        super();
        this.name = name;
        this.status = status;
        this.onlineStatus = onlineStatus;
        this.isAutoExtensible = isAutoExtensible;
        this.lostWriteProtect = lostWriteProtect;
        this.shared = shared;
        this.instanceId = instanceId;
        this.maxSizeKB = maxSizeKB;
        this.allocatedSizeKB = allocatedSizeKB;
        this.userSizeKB = userSizeKB;
        this.incrementBy = incrementBy;
        this.freeSpaceKB = freeSpaceKB;
        this.usedSpaceKB = usedSpaceKB;
        this.usedPercentAvailable = usedPercentAvailable;
        this.usedPercentAllocated = usedPercentAllocated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The filename (including the path) of the data file or temp file. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The filename (including the path) of the data file or temp file.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The status of the file. INVALID status is used when the file number is not in use, for
         * example, a file in a tablespace that was removed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of the file. INVALID status is used when the file number is not in use, for
         * example, a file in a tablespace that was removed.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The online status of the file. */
        @com.fasterxml.jackson.annotation.JsonProperty("onlineStatus")
        private OnlineStatus onlineStatus;

        /**
         * The online status of the file.
         *
         * @param onlineStatus the value to set
         * @return this builder
         */
        public Builder onlineStatus(OnlineStatus onlineStatus) {
            this.onlineStatus = onlineStatus;
            this.__explicitlySet__.add("onlineStatus");
            return this;
        }
        /** Indicates whether the data file is auto-extensible. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoExtensible")
        private Boolean isAutoExtensible;

        /**
         * Indicates whether the data file is auto-extensible.
         *
         * @param isAutoExtensible the value to set
         * @return this builder
         */
        public Builder isAutoExtensible(Boolean isAutoExtensible) {
            this.isAutoExtensible = isAutoExtensible;
            this.__explicitlySet__.add("isAutoExtensible");
            return this;
        }
        /** The lost write protection status of the file. */
        @com.fasterxml.jackson.annotation.JsonProperty("lostWriteProtect")
        private LostWriteProtect lostWriteProtect;

        /**
         * The lost write protection status of the file.
         *
         * @param lostWriteProtect the value to set
         * @return this builder
         */
        public Builder lostWriteProtect(LostWriteProtect lostWriteProtect) {
            this.lostWriteProtect = lostWriteProtect;
            this.__explicitlySet__.add("lostWriteProtect");
            return this;
        }
        /**
         * Type of tablespace this file belongs to. If it's for a shared tablespace, for a local
         * temporary tablespace for RIM (read-only) instances, or for local temporary tablespace for
         * all instance types.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shared")
        private Shared shared;

        /**
         * Type of tablespace this file belongs to. If it's for a shared tablespace, for a local
         * temporary tablespace for RIM (read-only) instances, or for local temporary tablespace for
         * all instance types.
         *
         * @param shared the value to set
         * @return this builder
         */
        public Builder shared(Shared shared) {
            this.shared = shared;
            this.__explicitlySet__.add("shared");
            return this;
        }
        /**
         * Instance ID of the instance to which the temp file belongs. This column has a NULL value
         * for temp files that belong to shared tablespaces.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private java.math.BigDecimal instanceId;

        /**
         * Instance ID of the instance to which the temp file belongs. This column has a NULL value
         * for temp files that belong to shared tablespaces.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(java.math.BigDecimal instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** The maximum file size in KB. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxSizeKB")
        private java.math.BigDecimal maxSizeKB;

        /**
         * The maximum file size in KB.
         *
         * @param maxSizeKB the value to set
         * @return this builder
         */
        public Builder maxSizeKB(java.math.BigDecimal maxSizeKB) {
            this.maxSizeKB = maxSizeKB;
            this.__explicitlySet__.add("maxSizeKB");
            return this;
        }
        /** The allocated file size in KB. */
        @com.fasterxml.jackson.annotation.JsonProperty("allocatedSizeKB")
        private java.math.BigDecimal allocatedSizeKB;

        /**
         * The allocated file size in KB.
         *
         * @param allocatedSizeKB the value to set
         * @return this builder
         */
        public Builder allocatedSizeKB(java.math.BigDecimal allocatedSizeKB) {
            this.allocatedSizeKB = allocatedSizeKB;
            this.__explicitlySet__.add("allocatedSizeKB");
            return this;
        }
        /**
         * The size of the file available for user data in KB. The actual size of the file minus the
         * USER_BYTES value is used to store file-related metadata.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userSizeKB")
        private java.math.BigDecimal userSizeKB;

        /**
         * The size of the file available for user data in KB. The actual size of the file minus the
         * USER_BYTES value is used to store file-related metadata.
         *
         * @param userSizeKB the value to set
         * @return this builder
         */
        public Builder userSizeKB(java.math.BigDecimal userSizeKB) {
            this.userSizeKB = userSizeKB;
            this.__explicitlySet__.add("userSizeKB");
            return this;
        }
        /** The number of blocks used as auto-extension increment. */
        @com.fasterxml.jackson.annotation.JsonProperty("incrementBy")
        private java.math.BigDecimal incrementBy;

        /**
         * The number of blocks used as auto-extension increment.
         *
         * @param incrementBy the value to set
         * @return this builder
         */
        public Builder incrementBy(java.math.BigDecimal incrementBy) {
            this.incrementBy = incrementBy;
            this.__explicitlySet__.add("incrementBy");
            return this;
        }
        /** The free space available in the data file in KB. */
        @com.fasterxml.jackson.annotation.JsonProperty("freeSpaceKB")
        private java.math.BigDecimal freeSpaceKB;

        /**
         * The free space available in the data file in KB.
         *
         * @param freeSpaceKB the value to set
         * @return this builder
         */
        public Builder freeSpaceKB(java.math.BigDecimal freeSpaceKB) {
            this.freeSpaceKB = freeSpaceKB;
            this.__explicitlySet__.add("freeSpaceKB");
            return this;
        }
        /** The total space used in the data file in KB. */
        @com.fasterxml.jackson.annotation.JsonProperty("usedSpaceKB")
        private java.math.BigDecimal usedSpaceKB;

        /**
         * The total space used in the data file in KB.
         *
         * @param usedSpaceKB the value to set
         * @return this builder
         */
        public Builder usedSpaceKB(java.math.BigDecimal usedSpaceKB) {
            this.usedSpaceKB = usedSpaceKB;
            this.__explicitlySet__.add("usedSpaceKB");
            return this;
        }
        /** The percentage of used space out of the maximum available space in the file. */
        @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAvailable")
        private Double usedPercentAvailable;

        /**
         * The percentage of used space out of the maximum available space in the file.
         *
         * @param usedPercentAvailable the value to set
         * @return this builder
         */
        public Builder usedPercentAvailable(Double usedPercentAvailable) {
            this.usedPercentAvailable = usedPercentAvailable;
            this.__explicitlySet__.add("usedPercentAvailable");
            return this;
        }
        /** The percentage of used space out of the total allocated space in the file. */
        @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAllocated")
        private Double usedPercentAllocated;

        /**
         * The percentage of used space out of the total allocated space in the file.
         *
         * @param usedPercentAllocated the value to set
         * @return this builder
         */
        public Builder usedPercentAllocated(Double usedPercentAllocated) {
            this.usedPercentAllocated = usedPercentAllocated;
            this.__explicitlySet__.add("usedPercentAllocated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Datafile build() {
            Datafile model =
                    new Datafile(
                            this.name,
                            this.status,
                            this.onlineStatus,
                            this.isAutoExtensible,
                            this.lostWriteProtect,
                            this.shared,
                            this.instanceId,
                            this.maxSizeKB,
                            this.allocatedSizeKB,
                            this.userSizeKB,
                            this.incrementBy,
                            this.freeSpaceKB,
                            this.usedSpaceKB,
                            this.usedPercentAvailable,
                            this.usedPercentAllocated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Datafile model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("onlineStatus")) {
                this.onlineStatus(model.getOnlineStatus());
            }
            if (model.wasPropertyExplicitlySet("isAutoExtensible")) {
                this.isAutoExtensible(model.getIsAutoExtensible());
            }
            if (model.wasPropertyExplicitlySet("lostWriteProtect")) {
                this.lostWriteProtect(model.getLostWriteProtect());
            }
            if (model.wasPropertyExplicitlySet("shared")) {
                this.shared(model.getShared());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("maxSizeKB")) {
                this.maxSizeKB(model.getMaxSizeKB());
            }
            if (model.wasPropertyExplicitlySet("allocatedSizeKB")) {
                this.allocatedSizeKB(model.getAllocatedSizeKB());
            }
            if (model.wasPropertyExplicitlySet("userSizeKB")) {
                this.userSizeKB(model.getUserSizeKB());
            }
            if (model.wasPropertyExplicitlySet("incrementBy")) {
                this.incrementBy(model.getIncrementBy());
            }
            if (model.wasPropertyExplicitlySet("freeSpaceKB")) {
                this.freeSpaceKB(model.getFreeSpaceKB());
            }
            if (model.wasPropertyExplicitlySet("usedSpaceKB")) {
                this.usedSpaceKB(model.getUsedSpaceKB());
            }
            if (model.wasPropertyExplicitlySet("usedPercentAvailable")) {
                this.usedPercentAvailable(model.getUsedPercentAvailable());
            }
            if (model.wasPropertyExplicitlySet("usedPercentAllocated")) {
                this.usedPercentAllocated(model.getUsedPercentAllocated());
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

    /** The filename (including the path) of the data file or temp file. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The filename (including the path) of the data file or temp file.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The status of the file. INVALID status is used when the file number is not in use, for
     * example, a file in a tablespace that was removed.
     */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Available("AVAILABLE"),
        Invalid("INVALID"),
        Offline("OFFLINE"),
        Online("ONLINE"),
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
     * The status of the file. INVALID status is used when the file number is not in use, for
     * example, a file in a tablespace that was removed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of the file. INVALID status is used when the file number is not in use, for
     * example, a file in a tablespace that was removed.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** The online status of the file. */
    public enum OnlineStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Sysoff("SYSOFF"),
        System("SYSTEM"),
        Offline("OFFLINE"),
        Online("ONLINE"),
        Recover("RECOVER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OnlineStatus.class);

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
    /** The online status of the file. */
    @com.fasterxml.jackson.annotation.JsonProperty("onlineStatus")
    private final OnlineStatus onlineStatus;

    /**
     * The online status of the file.
     *
     * @return the value
     */
    public OnlineStatus getOnlineStatus() {
        return onlineStatus;
    }

    /** Indicates whether the data file is auto-extensible. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoExtensible")
    private final Boolean isAutoExtensible;

    /**
     * Indicates whether the data file is auto-extensible.
     *
     * @return the value
     */
    public Boolean getIsAutoExtensible() {
        return isAutoExtensible;
    }

    /** The lost write protection status of the file. */
    public enum LostWriteProtect implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        ProtectOff("PROTECT_OFF"),
        Suspend("SUSPEND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LostWriteProtect.class);

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
    /** The lost write protection status of the file. */
    @com.fasterxml.jackson.annotation.JsonProperty("lostWriteProtect")
    private final LostWriteProtect lostWriteProtect;

    /**
     * The lost write protection status of the file.
     *
     * @return the value
     */
    public LostWriteProtect getLostWriteProtect() {
        return lostWriteProtect;
    }

    /**
     * Type of tablespace this file belongs to. If it's for a shared tablespace, for a local
     * temporary tablespace for RIM (read-only) instances, or for local temporary tablespace for all
     * instance types.
     */
    public enum Shared implements com.oracle.bmc.http.internal.BmcEnum {
        Shared("SHARED"),
        LocalForRim("LOCAL_FOR_RIM"),
        LocalForAll("LOCAL_FOR_ALL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Shared.class);

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
     * Type of tablespace this file belongs to. If it's for a shared tablespace, for a local
     * temporary tablespace for RIM (read-only) instances, or for local temporary tablespace for all
     * instance types.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shared")
    private final Shared shared;

    /**
     * Type of tablespace this file belongs to. If it's for a shared tablespace, for a local
     * temporary tablespace for RIM (read-only) instances, or for local temporary tablespace for all
     * instance types.
     *
     * @return the value
     */
    public Shared getShared() {
        return shared;
    }

    /**
     * Instance ID of the instance to which the temp file belongs. This column has a NULL value for
     * temp files that belong to shared tablespaces.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final java.math.BigDecimal instanceId;

    /**
     * Instance ID of the instance to which the temp file belongs. This column has a NULL value for
     * temp files that belong to shared tablespaces.
     *
     * @return the value
     */
    public java.math.BigDecimal getInstanceId() {
        return instanceId;
    }

    /** The maximum file size in KB. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxSizeKB")
    private final java.math.BigDecimal maxSizeKB;

    /**
     * The maximum file size in KB.
     *
     * @return the value
     */
    public java.math.BigDecimal getMaxSizeKB() {
        return maxSizeKB;
    }

    /** The allocated file size in KB. */
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedSizeKB")
    private final java.math.BigDecimal allocatedSizeKB;

    /**
     * The allocated file size in KB.
     *
     * @return the value
     */
    public java.math.BigDecimal getAllocatedSizeKB() {
        return allocatedSizeKB;
    }

    /**
     * The size of the file available for user data in KB. The actual size of the file minus the
     * USER_BYTES value is used to store file-related metadata.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userSizeKB")
    private final java.math.BigDecimal userSizeKB;

    /**
     * The size of the file available for user data in KB. The actual size of the file minus the
     * USER_BYTES value is used to store file-related metadata.
     *
     * @return the value
     */
    public java.math.BigDecimal getUserSizeKB() {
        return userSizeKB;
    }

    /** The number of blocks used as auto-extension increment. */
    @com.fasterxml.jackson.annotation.JsonProperty("incrementBy")
    private final java.math.BigDecimal incrementBy;

    /**
     * The number of blocks used as auto-extension increment.
     *
     * @return the value
     */
    public java.math.BigDecimal getIncrementBy() {
        return incrementBy;
    }

    /** The free space available in the data file in KB. */
    @com.fasterxml.jackson.annotation.JsonProperty("freeSpaceKB")
    private final java.math.BigDecimal freeSpaceKB;

    /**
     * The free space available in the data file in KB.
     *
     * @return the value
     */
    public java.math.BigDecimal getFreeSpaceKB() {
        return freeSpaceKB;
    }

    /** The total space used in the data file in KB. */
    @com.fasterxml.jackson.annotation.JsonProperty("usedSpaceKB")
    private final java.math.BigDecimal usedSpaceKB;

    /**
     * The total space used in the data file in KB.
     *
     * @return the value
     */
    public java.math.BigDecimal getUsedSpaceKB() {
        return usedSpaceKB;
    }

    /** The percentage of used space out of the maximum available space in the file. */
    @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAvailable")
    private final Double usedPercentAvailable;

    /**
     * The percentage of used space out of the maximum available space in the file.
     *
     * @return the value
     */
    public Double getUsedPercentAvailable() {
        return usedPercentAvailable;
    }

    /** The percentage of used space out of the total allocated space in the file. */
    @com.fasterxml.jackson.annotation.JsonProperty("usedPercentAllocated")
    private final Double usedPercentAllocated;

    /**
     * The percentage of used space out of the total allocated space in the file.
     *
     * @return the value
     */
    public Double getUsedPercentAllocated() {
        return usedPercentAllocated;
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
        sb.append("Datafile(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", onlineStatus=").append(String.valueOf(this.onlineStatus));
        sb.append(", isAutoExtensible=").append(String.valueOf(this.isAutoExtensible));
        sb.append(", lostWriteProtect=").append(String.valueOf(this.lostWriteProtect));
        sb.append(", shared=").append(String.valueOf(this.shared));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", maxSizeKB=").append(String.valueOf(this.maxSizeKB));
        sb.append(", allocatedSizeKB=").append(String.valueOf(this.allocatedSizeKB));
        sb.append(", userSizeKB=").append(String.valueOf(this.userSizeKB));
        sb.append(", incrementBy=").append(String.valueOf(this.incrementBy));
        sb.append(", freeSpaceKB=").append(String.valueOf(this.freeSpaceKB));
        sb.append(", usedSpaceKB=").append(String.valueOf(this.usedSpaceKB));
        sb.append(", usedPercentAvailable=").append(String.valueOf(this.usedPercentAvailable));
        sb.append(", usedPercentAllocated=").append(String.valueOf(this.usedPercentAllocated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Datafile)) {
            return false;
        }

        Datafile other = (Datafile) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.onlineStatus, other.onlineStatus)
                && java.util.Objects.equals(this.isAutoExtensible, other.isAutoExtensible)
                && java.util.Objects.equals(this.lostWriteProtect, other.lostWriteProtect)
                && java.util.Objects.equals(this.shared, other.shared)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.maxSizeKB, other.maxSizeKB)
                && java.util.Objects.equals(this.allocatedSizeKB, other.allocatedSizeKB)
                && java.util.Objects.equals(this.userSizeKB, other.userSizeKB)
                && java.util.Objects.equals(this.incrementBy, other.incrementBy)
                && java.util.Objects.equals(this.freeSpaceKB, other.freeSpaceKB)
                && java.util.Objects.equals(this.usedSpaceKB, other.usedSpaceKB)
                && java.util.Objects.equals(this.usedPercentAvailable, other.usedPercentAvailable)
                && java.util.Objects.equals(this.usedPercentAllocated, other.usedPercentAllocated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.onlineStatus == null ? 43 : this.onlineStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoExtensible == null ? 43 : this.isAutoExtensible.hashCode());
        result =
                (result * PRIME)
                        + (this.lostWriteProtect == null ? 43 : this.lostWriteProtect.hashCode());
        result = (result * PRIME) + (this.shared == null ? 43 : this.shared.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.maxSizeKB == null ? 43 : this.maxSizeKB.hashCode());
        result =
                (result * PRIME)
                        + (this.allocatedSizeKB == null ? 43 : this.allocatedSizeKB.hashCode());
        result = (result * PRIME) + (this.userSizeKB == null ? 43 : this.userSizeKB.hashCode());
        result = (result * PRIME) + (this.incrementBy == null ? 43 : this.incrementBy.hashCode());
        result = (result * PRIME) + (this.freeSpaceKB == null ? 43 : this.freeSpaceKB.hashCode());
        result = (result * PRIME) + (this.usedSpaceKB == null ? 43 : this.usedSpaceKB.hashCode());
        result =
                (result * PRIME)
                        + (this.usedPercentAvailable == null
                                ? 43
                                : this.usedPercentAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.usedPercentAllocated == null
                                ? 43
                                : this.usedPercentAllocated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
