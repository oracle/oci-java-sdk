/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VaultUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class VaultUsage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("keyCount")
        private Integer keyCount;

        public Builder keyCount(Integer keyCount) {
            this.keyCount = keyCount;
            this.__explicitlySet__.add("keyCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyVersionCount")
        private Integer keyVersionCount;

        public Builder keyVersionCount(Integer keyVersionCount) {
            this.keyVersionCount = keyVersionCount;
            this.__explicitlySet__.add("keyVersionCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareKeyCount")
        private Integer softwareKeyCount;

        public Builder softwareKeyCount(Integer softwareKeyCount) {
            this.softwareKeyCount = softwareKeyCount;
            this.__explicitlySet__.add("softwareKeyCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareKeyVersionCount")
        private Integer softwareKeyVersionCount;

        public Builder softwareKeyVersionCount(Integer softwareKeyVersionCount) {
            this.softwareKeyVersionCount = softwareKeyVersionCount;
            this.__explicitlySet__.add("softwareKeyVersionCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VaultUsage build() {
            VaultUsage __instance__ =
                    new VaultUsage(
                            keyCount, keyVersionCount, softwareKeyCount, softwareKeyVersionCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VaultUsage o) {
            Builder copiedBuilder =
                    keyCount(o.getKeyCount())
                            .keyVersionCount(o.getKeyVersionCount())
                            .softwareKeyCount(o.getSoftwareKeyCount())
                            .softwareKeyVersionCount(o.getSoftwareKeyVersionCount());

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
     * The number of keys in this vault that persist on a hardware security module (HSM), across all compartments, excluding keys in a `DELETED` state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyCount")
    Integer keyCount;

    /**
     * The number of key versions in this vault that persist on a hardware security module (HSM), across all compartments, excluding key versions in a `DELETED` state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersionCount")
    Integer keyVersionCount;

    /**
     * The number of keys in this vault that persist on the server, across all compartments, excluding keys in a `DELETED` state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareKeyCount")
    Integer softwareKeyCount;

    /**
     * The number of key versions in this vault that persist on the server, across all compartments, excluding key versions in a `DELETED` state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareKeyVersionCount")
    Integer softwareKeyVersionCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
