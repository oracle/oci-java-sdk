/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Autonomous Database configuration details for storing [manual backups](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/backup-restore.html#GUID-9035DFB8-4702-4CEB-8281-C2A303820809) in the [Object Storage](https://docs.cloud.oracle.com/Content/Object/Concepts/objectstorageoverview.htm) service.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousDatabaseBackupConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousDatabaseBackupConfig {
    @Deprecated
    @java.beans.ConstructorProperties({"manualBackupBucketName", "manualBackupType"})
    public AutonomousDatabaseBackupConfig(
            String manualBackupBucketName, ManualBackupType manualBackupType) {
        super();
        this.manualBackupBucketName = manualBackupBucketName;
        this.manualBackupType = manualBackupType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Name of [Object Storage](https://docs.cloud.oracle.com/Content/Object/Concepts/objectstorageoverview.htm) bucket to use for storing manual backups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("manualBackupBucketName")
    private final String manualBackupBucketName;

    public String getManualBackupBucketName() {
        return manualBackupBucketName;
    }

    /**
     * The manual backup destination type.
     **/
    public enum ManualBackupType {
        None("NONE"),
        ObjectStore("OBJECT_STORE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ManualBackupType.class);

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
    private final ManualBackupType manualBackupType;

    public ManualBackupType getManualBackupType() {
        return manualBackupType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AutonomousDatabaseBackupConfig(");
        sb.append("manualBackupBucketName=").append(String.valueOf(this.manualBackupBucketName));
        sb.append(", manualBackupType=").append(String.valueOf(this.manualBackupType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabaseBackupConfig)) {
            return false;
        }

        AutonomousDatabaseBackupConfig other = (AutonomousDatabaseBackupConfig) o;
        return java.util.Objects.equals(this.manualBackupBucketName, other.manualBackupBucketName)
                && java.util.Objects.equals(this.manualBackupType, other.manualBackupType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.manualBackupBucketName == null
                                ? 43
                                : this.manualBackupBucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.manualBackupType == null ? 43 : this.manualBackupType.hashCode());
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
