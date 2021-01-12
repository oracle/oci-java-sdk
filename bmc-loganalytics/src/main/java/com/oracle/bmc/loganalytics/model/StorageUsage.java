/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StorageUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StorageUsage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("activeDataSizeInBytes")
        private Long activeDataSizeInBytes;

        public Builder activeDataSizeInBytes(Long activeDataSizeInBytes) {
            this.activeDataSizeInBytes = activeDataSizeInBytes;
            this.__explicitlySet__.add("activeDataSizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("archivedDataSizeInBytes")
        private Long archivedDataSizeInBytes;

        public Builder archivedDataSizeInBytes(Long archivedDataSizeInBytes) {
            this.archivedDataSizeInBytes = archivedDataSizeInBytes;
            this.__explicitlySet__.add("archivedDataSizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recalledArchivedDataSizeInBytes")
        private Long recalledArchivedDataSizeInBytes;

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

    /**
     * This is the number of bytes of active data (non-archived)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activeDataSizeInBytes")
    Long activeDataSizeInBytes;

    /**
     * This is the number of bytes of archived data in object storage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archivedDataSizeInBytes")
    Long archivedDataSizeInBytes;

    /**
     * This is the number of bytes of recalled data from archived in object store
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recalledArchivedDataSizeInBytes")
    Long recalledArchivedDataSizeInBytes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
