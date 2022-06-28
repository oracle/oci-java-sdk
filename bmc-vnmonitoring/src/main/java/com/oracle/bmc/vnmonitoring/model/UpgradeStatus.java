/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * The upgrade status of a DRG.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpgradeStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpgradeStatus {
    @Deprecated
    @java.beans.ConstructorProperties({"drgId", "status", "upgradedConnections"})
    public UpgradeStatus(String drgId, Status status, String upgradedConnections) {
        super();
        this.drgId = drgId;
        this.status = status;
        this.upgradedConnections = upgradedConnections;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The {@code drgId} of the upgraded DRG.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("drgId")
        private String drgId;

        /**
         * The {@code drgId} of the upgraded DRG.
         *
         * @param drgId the value to set
         * @return this builder
         **/
        public Builder drgId(String drgId) {
            this.drgId = drgId;
            this.__explicitlySet__.add("drgId");
            return this;
        }
        /**
         * The current upgrade status of the DRG attachment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The current upgrade status of the DRG attachment.
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The number of upgraded connections.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("upgradedConnections")
        private String upgradedConnections;

        /**
         * The number of upgraded connections.
         *
         * @param upgradedConnections the value to set
         * @return this builder
         **/
        public Builder upgradedConnections(String upgradedConnections) {
            this.upgradedConnections = upgradedConnections;
            this.__explicitlySet__.add("upgradedConnections");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpgradeStatus build() {
            UpgradeStatus __instance__ = new UpgradeStatus(drgId, status, upgradedConnections);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpgradeStatus o) {
            Builder copiedBuilder =
                    drgId(o.getDrgId())
                            .status(o.getStatus())
                            .upgradedConnections(o.getUpgradedConnections());

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
     * The {@code drgId} of the upgraded DRG.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drgId")
    private final String drgId;

    /**
     * The {@code drgId} of the upgraded DRG.
     *
     * @return the value
     **/
    public String getDrgId() {
        return drgId;
    }

    /**
     * The current upgrade status of the DRG attachment.
     *
     **/
    public enum Status {
        NotUpgraded("NOT_UPGRADED"),
        InProgress("IN_PROGRESS"),
        Upgraded("UPGRADED"),
        ;

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };
    /**
     * The current upgrade status of the DRG attachment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current upgrade status of the DRG attachment.
     *
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * The number of upgraded connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upgradedConnections")
    private final String upgradedConnections;

    /**
     * The number of upgraded connections.
     *
     * @return the value
     **/
    public String getUpgradedConnections() {
        return upgradedConnections;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpgradeStatus(");
        sb.append("drgId=").append(String.valueOf(this.drgId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", upgradedConnections=").append(String.valueOf(this.upgradedConnections));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpgradeStatus)) {
            return false;
        }

        UpgradeStatus other = (UpgradeStatus) o;
        return java.util.Objects.equals(this.drgId, other.drgId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.upgradedConnections, other.upgradedConnections)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.drgId == null ? 43 : this.drgId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradedConnections == null
                                ? 43
                                : this.upgradedConnections.hashCode());
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
