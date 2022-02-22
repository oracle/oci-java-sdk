/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The information about key range.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = KeyRangePartitionConfig.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class KeyRangePartitionConfig extends PartitionConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("partitionNumber")
        private Integer partitionNumber;

        public Builder partitionNumber(Integer partitionNumber) {
            this.partitionNumber = partitionNumber;
            this.__explicitlySet__.add("partitionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyRange")
        private KeyRange keyRange;

        public Builder keyRange(KeyRange keyRange) {
            this.keyRange = keyRange;
            this.__explicitlySet__.add("keyRange");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyRangePartitionConfig build() {
            KeyRangePartitionConfig __instance__ =
                    new KeyRangePartitionConfig(partitionNumber, keyRange);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyRangePartitionConfig o) {
            Builder copiedBuilder =
                    partitionNumber(o.getPartitionNumber()).keyRange(o.getKeyRange());

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

    @Deprecated
    public KeyRangePartitionConfig(Integer partitionNumber, KeyRange keyRange) {
        super();
        this.partitionNumber = partitionNumber;
        this.keyRange = keyRange;
    }

    /**
     * The partition number for the key range.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partitionNumber")
    Integer partitionNumber;

    @com.fasterxml.jackson.annotation.JsonProperty("keyRange")
    KeyRange keyRange;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
