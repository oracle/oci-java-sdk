/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Information about the boot volume replica in the destination availability domain.
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
    builder = BootVolumeReplicaInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BootVolumeReplicaInfo {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "bootVolumeReplicaId", "availabilityDomain"})
    public BootVolumeReplicaInfo(
            String displayName, String bootVolumeReplicaId, String availabilityDomain) {
        super();
        this.displayName = displayName;
        this.bootVolumeReplicaId = bootVolumeReplicaId;
        this.availabilityDomain = availabilityDomain;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The boot volume replica's Oracle ID (OCID).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeReplicaId")
        private String bootVolumeReplicaId;

        /**
         * The boot volume replica's Oracle ID (OCID).
         * @param bootVolumeReplicaId the value to set
         * @return this builder
         **/
        public Builder bootVolumeReplicaId(String bootVolumeReplicaId) {
            this.bootVolumeReplicaId = bootVolumeReplicaId;
            this.__explicitlySet__.add("bootVolumeReplicaId");
            return this;
        }
        /**
         * The availability domain of the boot volume replica.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the boot volume replica.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BootVolumeReplicaInfo build() {
            BootVolumeReplicaInfo __instance__ =
                    new BootVolumeReplicaInfo(displayName, bootVolumeReplicaId, availabilityDomain);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BootVolumeReplicaInfo o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .bootVolumeReplicaId(o.getBootVolumeReplicaId())
                            .availabilityDomain(o.getAvailabilityDomain());

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
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The boot volume replica's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeReplicaId")
    private final String bootVolumeReplicaId;

    /**
     * The boot volume replica's Oracle ID (OCID).
     * @return the value
     **/
    public String getBootVolumeReplicaId() {
        return bootVolumeReplicaId;
    }

    /**
     * The availability domain of the boot volume replica.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the boot volume replica.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BootVolumeReplicaInfo(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", bootVolumeReplicaId=").append(String.valueOf(this.bootVolumeReplicaId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BootVolumeReplicaInfo)) {
            return false;
        }

        BootVolumeReplicaInfo other = (BootVolumeReplicaInfo) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.bootVolumeReplicaId, other.bootVolumeReplicaId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.bootVolumeReplicaId == null
                                ? 43
                                : this.bootVolumeReplicaId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
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
