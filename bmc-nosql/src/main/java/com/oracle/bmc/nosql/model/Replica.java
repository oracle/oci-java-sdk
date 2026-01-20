/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Information about a MR table replica <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Replica.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Replica extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "region",
        "tableId",
        "maxWriteUnits",
        "capacityMode",
        "lifecycleState",
        "lifecycleDetails"
    })
    public Replica(
            String region,
            String tableId,
            Integer maxWriteUnits,
            CapacityMode capacityMode,
            LifecycleState lifecycleState,
            String lifecycleDetails) {
        super();
        this.region = region;
        this.tableId = tableId;
        this.maxWriteUnits = maxWriteUnits;
        this.capacityMode = capacityMode;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A customer-facing region identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * A customer-facing region identifier
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** The OCID of the replica table */
        @com.fasterxml.jackson.annotation.JsonProperty("tableId")
        private String tableId;

        /**
         * The OCID of the replica table
         *
         * @param tableId the value to set
         * @return this builder
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            this.__explicitlySet__.add("tableId");
            return this;
        }
        /** Maximum sustained write throughput limit of the replica table. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxWriteUnits")
        private Integer maxWriteUnits;

        /**
         * Maximum sustained write throughput limit of the replica table.
         *
         * @param maxWriteUnits the value to set
         * @return this builder
         */
        public Builder maxWriteUnits(Integer maxWriteUnits) {
            this.maxWriteUnits = maxWriteUnits;
            this.__explicitlySet__.add("maxWriteUnits");
            return this;
        }
        /** The capacity mode of the replica. */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityMode")
        private CapacityMode capacityMode;

        /**
         * The capacity mode of the replica.
         *
         * @param capacityMode the value to set
         * @return this builder
         */
        public Builder capacityMode(CapacityMode capacityMode) {
            this.capacityMode = capacityMode;
            this.__explicitlySet__.add("capacityMode");
            return this;
        }
        /** The state of the replica. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The state of the replica.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** A message describing the current state in more detail. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Replica build() {
            Replica model =
                    new Replica(
                            this.region,
                            this.tableId,
                            this.maxWriteUnits,
                            this.capacityMode,
                            this.lifecycleState,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Replica model) {
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("tableId")) {
                this.tableId(model.getTableId());
            }
            if (model.wasPropertyExplicitlySet("maxWriteUnits")) {
                this.maxWriteUnits(model.getMaxWriteUnits());
            }
            if (model.wasPropertyExplicitlySet("capacityMode")) {
                this.capacityMode(model.getCapacityMode());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** A customer-facing region identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * A customer-facing region identifier
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** The OCID of the replica table */
    @com.fasterxml.jackson.annotation.JsonProperty("tableId")
    private final String tableId;

    /**
     * The OCID of the replica table
     *
     * @return the value
     */
    public String getTableId() {
        return tableId;
    }

    /** Maximum sustained write throughput limit of the replica table. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxWriteUnits")
    private final Integer maxWriteUnits;

    /**
     * Maximum sustained write throughput limit of the replica table.
     *
     * @return the value
     */
    public Integer getMaxWriteUnits() {
        return maxWriteUnits;
    }

    /** The capacity mode of the replica. */
    public enum CapacityMode implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioned("PROVISIONED"),
        OnDemand("ON_DEMAND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CapacityMode.class);

        private final String value;
        private static java.util.Map<String, CapacityMode> map;

        static {
            map = new java.util.HashMap<>();
            for (CapacityMode v : CapacityMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CapacityMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CapacityMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CapacityMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The capacity mode of the replica. */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityMode")
    private final CapacityMode capacityMode;

    /**
     * The capacity mode of the replica.
     *
     * @return the value
     */
    public CapacityMode getCapacityMode() {
        return capacityMode;
    }

    /** The state of the replica. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The state of the replica. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The state of the replica.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** A message describing the current state in more detail. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("Replica(");
        sb.append("super=").append(super.toString());
        sb.append("region=").append(String.valueOf(this.region));
        sb.append(", tableId=").append(String.valueOf(this.tableId));
        sb.append(", maxWriteUnits=").append(String.valueOf(this.maxWriteUnits));
        sb.append(", capacityMode=").append(String.valueOf(this.capacityMode));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Replica)) {
            return false;
        }

        Replica other = (Replica) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.tableId, other.tableId)
                && java.util.Objects.equals(this.maxWriteUnits, other.maxWriteUnits)
                && java.util.Objects.equals(this.capacityMode, other.capacityMode)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.tableId == null ? 43 : this.tableId.hashCode());
        result =
                (result * PRIME)
                        + (this.maxWriteUnits == null ? 43 : this.maxWriteUnits.hashCode());
        result = (result * PRIME) + (this.capacityMode == null ? 43 : this.capacityMode.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
