/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the storage usage information of a tenancy in Logan Analytics application
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StorageUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StorageUsage {
    @Deprecated
    @java.beans.ConstructorProperties({
        "activeDataSizeInBytes",
        "archivedDataSizeInBytes",
        "recalledArchivedDataSizeInBytes"
    })
    public StorageUsage(
            Long activeDataSizeInBytes,
            Long archivedDataSizeInBytes,
            Long recalledArchivedDataSizeInBytes) {
        super();
        this.activeDataSizeInBytes = activeDataSizeInBytes;
        this.archivedDataSizeInBytes = archivedDataSizeInBytes;
        this.recalledArchivedDataSizeInBytes = recalledArchivedDataSizeInBytes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This is the number of bytes of active data (non-archived)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("activeDataSizeInBytes")
        private Long activeDataSizeInBytes;

        /**
         * This is the number of bytes of active data (non-archived)
         * @param activeDataSizeInBytes the value to set
         * @return this builder
         **/
        public Builder activeDataSizeInBytes(Long activeDataSizeInBytes) {
            this.activeDataSizeInBytes = activeDataSizeInBytes;
            this.__explicitlySet__.add("activeDataSizeInBytes");
            return this;
        }
        /**
         * This is the number of bytes of archived data in object storage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("archivedDataSizeInBytes")
        private Long archivedDataSizeInBytes;

        /**
         * This is the number of bytes of archived data in object storage
         * @param archivedDataSizeInBytes the value to set
         * @return this builder
         **/
        public Builder archivedDataSizeInBytes(Long archivedDataSizeInBytes) {
            this.archivedDataSizeInBytes = archivedDataSizeInBytes;
            this.__explicitlySet__.add("archivedDataSizeInBytes");
            return this;
        }
        /**
         * This is the number of bytes of recalled data from archived in object store
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recalledArchivedDataSizeInBytes")
        private Long recalledArchivedDataSizeInBytes;

        /**
         * This is the number of bytes of recalled data from archived in object store
         * @param recalledArchivedDataSizeInBytes the value to set
         * @return this builder
         **/
        public Builder recalledArchivedDataSizeInBytes(Long recalledArchivedDataSizeInBytes) {
            this.recalledArchivedDataSizeInBytes = recalledArchivedDataSizeInBytes;
            this.__explicitlySet__.add("recalledArchivedDataSizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StorageUsage build() {
            StorageUsage __instance__ =
                    new StorageUsage(
                            activeDataSizeInBytes,
                            archivedDataSizeInBytes,
                            recalledArchivedDataSizeInBytes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StorageUsage o) {
            Builder copiedBuilder =
                    activeDataSizeInBytes(o.getActiveDataSizeInBytes())
                            .archivedDataSizeInBytes(o.getArchivedDataSizeInBytes())
                            .recalledArchivedDataSizeInBytes(
                                    o.getRecalledArchivedDataSizeInBytes());

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
     * This is the number of bytes of active data (non-archived)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeDataSizeInBytes")
    private final Long activeDataSizeInBytes;

    /**
     * This is the number of bytes of active data (non-archived)
     * @return the value
     **/
    public Long getActiveDataSizeInBytes() {
        return activeDataSizeInBytes;
    }

    /**
     * This is the number of bytes of archived data in object storage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archivedDataSizeInBytes")
    private final Long archivedDataSizeInBytes;

    /**
     * This is the number of bytes of archived data in object storage
     * @return the value
     **/
    public Long getArchivedDataSizeInBytes() {
        return archivedDataSizeInBytes;
    }

    /**
     * This is the number of bytes of recalled data from archived in object store
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recalledArchivedDataSizeInBytes")
    private final Long recalledArchivedDataSizeInBytes;

    /**
     * This is the number of bytes of recalled data from archived in object store
     * @return the value
     **/
    public Long getRecalledArchivedDataSizeInBytes() {
        return recalledArchivedDataSizeInBytes;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StorageUsage(");
        sb.append("activeDataSizeInBytes=").append(String.valueOf(this.activeDataSizeInBytes));
        sb.append(", archivedDataSizeInBytes=")
                .append(String.valueOf(this.archivedDataSizeInBytes));
        sb.append(", recalledArchivedDataSizeInBytes=")
                .append(String.valueOf(this.recalledArchivedDataSizeInBytes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StorageUsage)) {
            return false;
        }

        StorageUsage other = (StorageUsage) o;
        return java.util.Objects.equals(this.activeDataSizeInBytes, other.activeDataSizeInBytes)
                && java.util.Objects.equals(
                        this.archivedDataSizeInBytes, other.archivedDataSizeInBytes)
                && java.util.Objects.equals(
                        this.recalledArchivedDataSizeInBytes, other.recalledArchivedDataSizeInBytes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.activeDataSizeInBytes == null
                                ? 43
                                : this.activeDataSizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.archivedDataSizeInBytes == null
                                ? 43
                                : this.archivedDataSizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.recalledArchivedDataSizeInBytes == null
                                ? 43
                                : this.recalledArchivedDataSizeInBytes.hashCode());
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
