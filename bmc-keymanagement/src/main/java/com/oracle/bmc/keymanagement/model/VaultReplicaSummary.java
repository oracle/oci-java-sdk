/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Summary of vault replicas
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VaultReplicaSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VaultReplicaSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"cryptoEndpoint", "managementEndpoint", "region", "status"})
    public VaultReplicaSummary(
            String cryptoEndpoint, String managementEndpoint, String region, Status status) {
        super();
        this.cryptoEndpoint = cryptoEndpoint;
        this.managementEndpoint = managementEndpoint;
        this.region = region;
        this.status = status;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cryptoEndpoint")
        private String cryptoEndpoint;

        public Builder cryptoEndpoint(String cryptoEndpoint) {
            this.cryptoEndpoint = cryptoEndpoint;
            this.__explicitlySet__.add("cryptoEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementEndpoint")
        private String managementEndpoint;

        public Builder managementEndpoint(String managementEndpoint) {
            this.managementEndpoint = managementEndpoint;
            this.__explicitlySet__.add("managementEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VaultReplicaSummary build() {
            VaultReplicaSummary __instance__ =
                    new VaultReplicaSummary(cryptoEndpoint, managementEndpoint, region, status);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VaultReplicaSummary o) {
            Builder copiedBuilder =
                    cryptoEndpoint(o.getCryptoEndpoint())
                            .managementEndpoint(o.getManagementEndpoint())
                            .region(o.getRegion())
                            .status(o.getStatus());

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
     * The vault replica's crypto endpoint
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cryptoEndpoint")
    private final String cryptoEndpoint;

    public String getCryptoEndpoint() {
        return cryptoEndpoint;
    }

    /**
     * The vault replica's management endpoint
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementEndpoint")
    private final String managementEndpoint;

    public String getManagementEndpoint() {
        return managementEndpoint;
    }

    /**
     * Region to which vault is replicated to
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    public String getRegion() {
        return region;
    }

    /**
     **/
    public enum Status {
        Creating("CREATING"),
        Created("CREATED"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VaultReplicaSummary(");
        sb.append("cryptoEndpoint=").append(String.valueOf(this.cryptoEndpoint));
        sb.append(", managementEndpoint=").append(String.valueOf(this.managementEndpoint));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VaultReplicaSummary)) {
            return false;
        }

        VaultReplicaSummary other = (VaultReplicaSummary) o;
        return java.util.Objects.equals(this.cryptoEndpoint, other.cryptoEndpoint)
                && java.util.Objects.equals(this.managementEndpoint, other.managementEndpoint)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.cryptoEndpoint == null ? 43 : this.cryptoEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.managementEndpoint == null
                                ? 43
                                : this.managementEndpoint.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
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
