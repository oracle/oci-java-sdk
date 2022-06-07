/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VaultUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VaultUsage {
    @Deprecated
    @java.beans.ConstructorProperties({
        "keyCount",
        "keyVersionCount",
        "softwareKeyCount",
        "softwareKeyVersionCount"
    })
    public VaultUsage(
            Integer keyCount,
            Integer keyVersionCount,
            Integer softwareKeyCount,
            Integer softwareKeyVersionCount) {
        super();
        this.keyCount = keyCount;
        this.keyVersionCount = keyVersionCount;
        this.softwareKeyCount = softwareKeyCount;
        this.softwareKeyVersionCount = softwareKeyVersionCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The number of keys in this vault that persist on a hardware security module (HSM), across all compartments, excluding keys in a {@code DELETED} state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyCount")
    private final Integer keyCount;

    public Integer getKeyCount() {
        return keyCount;
    }

    /**
     * The number of key versions in this vault that persist on a hardware security module (HSM), across all compartments, excluding key versions in a {@code DELETED} state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersionCount")
    private final Integer keyVersionCount;

    public Integer getKeyVersionCount() {
        return keyVersionCount;
    }

    /**
     * The number of keys in this vault that persist on the server, across all compartments, excluding keys in a {@code DELETED} state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareKeyCount")
    private final Integer softwareKeyCount;

    public Integer getSoftwareKeyCount() {
        return softwareKeyCount;
    }

    /**
     * The number of key versions in this vault that persist on the server, across all compartments, excluding key versions in a {@code DELETED} state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareKeyVersionCount")
    private final Integer softwareKeyVersionCount;

    public Integer getSoftwareKeyVersionCount() {
        return softwareKeyVersionCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VaultUsage(");
        sb.append("keyCount=").append(String.valueOf(this.keyCount));
        sb.append(", keyVersionCount=").append(String.valueOf(this.keyVersionCount));
        sb.append(", softwareKeyCount=").append(String.valueOf(this.softwareKeyCount));
        sb.append(", softwareKeyVersionCount=")
                .append(String.valueOf(this.softwareKeyVersionCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VaultUsage)) {
            return false;
        }

        VaultUsage other = (VaultUsage) o;
        return java.util.Objects.equals(this.keyCount, other.keyCount)
                && java.util.Objects.equals(this.keyVersionCount, other.keyVersionCount)
                && java.util.Objects.equals(this.softwareKeyCount, other.softwareKeyCount)
                && java.util.Objects.equals(
                        this.softwareKeyVersionCount, other.softwareKeyVersionCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyCount == null ? 43 : this.keyCount.hashCode());
        result =
                (result * PRIME)
                        + (this.keyVersionCount == null ? 43 : this.keyVersionCount.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareKeyCount == null ? 43 : this.softwareKeyCount.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareKeyVersionCount == null
                                ? 43
                                : this.softwareKeyVersionCount.hashCode());
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
