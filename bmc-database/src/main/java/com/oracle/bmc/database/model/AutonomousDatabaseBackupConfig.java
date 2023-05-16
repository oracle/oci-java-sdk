/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Autonomous Database configuration details for storing [manual
 * backups](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/backup-restore.html#GUID-9035DFB8-4702-4CEB-8281-C2A303820809)
 * in the [Object
 * Storage](https://docs.cloud.oracle.com/Content/Object/Concepts/objectstorageoverview.htm)
 * service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AutonomousDatabaseBackupConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousDatabaseBackupConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /**
         * Name of [Object
         * Storage](https://docs.cloud.oracle.com/Content/Object/Concepts/objectstorageoverview.htm)
         * bucket to use for storing manual backups.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("manualBackupBucketName")
        private String manualBackupBucketName;

        /**
         * Name of [Object
         * Storage](https://docs.cloud.oracle.com/Content/Object/Concepts/objectstorageoverview.htm)
         * bucket to use for storing manual backups.
         *
         * @param manualBackupBucketName the value to set
         * @return this builder
         */
        public Builder manualBackupBucketName(String manualBackupBucketName) {
            this.manualBackupBucketName = manualBackupBucketName;
            this.__explicitlySet__.add("manualBackupBucketName");
            return this;
        }
        /** The manual backup destination type. */
        @com.fasterxml.jackson.annotation.JsonProperty("manualBackupType")
        private ManualBackupType manualBackupType;

        /**
         * The manual backup destination type.
         *
         * @param manualBackupType the value to set
         * @return this builder
         */
        public Builder manualBackupType(ManualBackupType manualBackupType) {
            this.manualBackupType = manualBackupType;
            this.__explicitlySet__.add("manualBackupType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseBackupConfig build() {
            AutonomousDatabaseBackupConfig model =
                    new AutonomousDatabaseBackupConfig(
                            this.manualBackupBucketName, this.manualBackupType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseBackupConfig model) {
            if (model.wasPropertyExplicitlySet("manualBackupBucketName")) {
                this.manualBackupBucketName(model.getManualBackupBucketName());
            }
            if (model.wasPropertyExplicitlySet("manualBackupType")) {
                this.manualBackupType(model.getManualBackupType());
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
     * Name of [Object
     * Storage](https://docs.cloud.oracle.com/Content/Object/Concepts/objectstorageoverview.htm)
     * bucket to use for storing manual backups.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manualBackupBucketName")
    private final String manualBackupBucketName;

    /**
     * Name of [Object
     * Storage](https://docs.cloud.oracle.com/Content/Object/Concepts/objectstorageoverview.htm)
     * bucket to use for storing manual backups.
     *
     * @return the value
     */
    public String getManualBackupBucketName() {
        return manualBackupBucketName;
    }

    /** The manual backup destination type. */
    public enum ManualBackupType implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        ObjectStore("OBJECT_STORE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The manual backup destination type. */
    @com.fasterxml.jackson.annotation.JsonProperty("manualBackupType")
    private final ManualBackupType manualBackupType;

    /**
     * The manual backup destination type.
     *
     * @return the value
     */
    public ManualBackupType getManualBackupType() {
        return manualBackupType;
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
        sb.append("AutonomousDatabaseBackupConfig(");
        sb.append("super=").append(super.toString());
        sb.append("manualBackupBucketName=").append(String.valueOf(this.manualBackupBucketName));
        sb.append(", manualBackupType=").append(String.valueOf(this.manualBackupType));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
