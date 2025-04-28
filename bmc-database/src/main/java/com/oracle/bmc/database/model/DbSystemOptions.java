/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The DB system options. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbSystemOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DbSystemOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"storageManagement"})
    public DbSystemOptions(StorageManagement storageManagement) {
        super();
        this.storageManagement = storageManagement;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The storage option used in DB system. ASM - Automatic storage management LVM - Logical
         * Volume management
         */
        @com.fasterxml.jackson.annotation.JsonProperty("storageManagement")
        private StorageManagement storageManagement;

        /**
         * The storage option used in DB system. ASM - Automatic storage management LVM - Logical
         * Volume management
         *
         * @param storageManagement the value to set
         * @return this builder
         */
        public Builder storageManagement(StorageManagement storageManagement) {
            this.storageManagement = storageManagement;
            this.__explicitlySet__.add("storageManagement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemOptions build() {
            DbSystemOptions model = new DbSystemOptions(this.storageManagement);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemOptions model) {
            if (model.wasPropertyExplicitlySet("storageManagement")) {
                this.storageManagement(model.getStorageManagement());
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
     * The storage option used in DB system. ASM - Automatic storage management LVM - Logical Volume
     * management
     */
    public enum StorageManagement implements com.oracle.bmc.http.internal.BmcEnum {
        Asm("ASM"),
        Lvm("LVM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(StorageManagement.class);

        private final String value;
        private static java.util.Map<String, StorageManagement> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageManagement v : StorageManagement.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StorageManagement(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageManagement create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StorageManagement', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The storage option used in DB system. ASM - Automatic storage management LVM - Logical Volume
     * management
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageManagement")
    private final StorageManagement storageManagement;

    /**
     * The storage option used in DB system. ASM - Automatic storage management LVM - Logical Volume
     * management
     *
     * @return the value
     */
    public StorageManagement getStorageManagement() {
        return storageManagement;
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
        sb.append("DbSystemOptions(");
        sb.append("super=").append(super.toString());
        sb.append("storageManagement=").append(String.valueOf(this.storageManagement));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystemOptions)) {
            return false;
        }

        DbSystemOptions other = (DbSystemOptions) o;
        return java.util.Objects.equals(this.storageManagement, other.storageManagement)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.storageManagement == null ? 43 : this.storageManagement.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
