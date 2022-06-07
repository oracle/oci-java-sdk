/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EntityStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EntityStatus {
    @Deprecated
    @java.beans.ConstructorProperties({"status", "inactiveBitMask"})
    public EntityStatus(String status, Long inactiveBitMask) {
        super();
        this.status = status;
        this.inactiveBitMask = inactiveBitMask;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inactiveBitMask")
        private Long inactiveBitMask;

        public Builder inactiveBitMask(Long inactiveBitMask) {
            this.inactiveBitMask = inactiveBitMask;
            this.__explicitlySet__.add("inactiveBitMask");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EntityStatus build() {
            EntityStatus __instance__ = new EntityStatus(status, inactiveBitMask);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntityStatus o) {
            Builder copiedBuilder = status(o.getStatus()).inactiveBitMask(o.getInactiveBitMask());

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
     * The entity status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    public String getStatus() {
        return status;
    }

    /**
     * A bit mask showing the reason why the entity is inactive:
     * - bit 0: ACTIVE
     * - bit 1: SUSPENDED
     * - bit 2: DISABLED
     * - bit 3: BLOCKED
     * - bit 4: LOCKED
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inactiveBitMask")
    private final Long inactiveBitMask;

    public Long getInactiveBitMask() {
        return inactiveBitMask;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EntityStatus(");
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", inactiveBitMask=").append(String.valueOf(this.inactiveBitMask));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntityStatus)) {
            return false;
        }

        EntityStatus other = (EntityStatus) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.inactiveBitMask, other.inactiveBitMask)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.inactiveBitMask == null ? 43 : this.inactiveBitMask.hashCode());
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
