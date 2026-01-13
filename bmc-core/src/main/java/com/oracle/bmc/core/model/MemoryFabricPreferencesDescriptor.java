/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The preference object specified by customer. Contains customerDesiredFirmwareBundleId,
 * fabricRecycleLevel. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MemoryFabricPreferencesDescriptor.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MemoryFabricPreferencesDescriptor
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"customerDesiredFirmwareBundleId", "fabricRecycleLevel"})
    public MemoryFabricPreferencesDescriptor(
            String customerDesiredFirmwareBundleId, FabricRecycleLevel fabricRecycleLevel) {
        super();
        this.customerDesiredFirmwareBundleId = customerDesiredFirmwareBundleId;
        this.fabricRecycleLevel = fabricRecycleLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The desired firmware bundle id on the GPU memory fabric. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerDesiredFirmwareBundleId")
        private String customerDesiredFirmwareBundleId;

        /**
         * The desired firmware bundle id on the GPU memory fabric.
         *
         * @param customerDesiredFirmwareBundleId the value to set
         * @return this builder
         */
        public Builder customerDesiredFirmwareBundleId(String customerDesiredFirmwareBundleId) {
            this.customerDesiredFirmwareBundleId = customerDesiredFirmwareBundleId;
            this.__explicitlySet__.add("customerDesiredFirmwareBundleId");
            return this;
        }
        /** The recycle level of GPU memory fabric. */
        @com.fasterxml.jackson.annotation.JsonProperty("fabricRecycleLevel")
        private FabricRecycleLevel fabricRecycleLevel;

        /**
         * The recycle level of GPU memory fabric.
         *
         * @param fabricRecycleLevel the value to set
         * @return this builder
         */
        public Builder fabricRecycleLevel(FabricRecycleLevel fabricRecycleLevel) {
            this.fabricRecycleLevel = fabricRecycleLevel;
            this.__explicitlySet__.add("fabricRecycleLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MemoryFabricPreferencesDescriptor build() {
            MemoryFabricPreferencesDescriptor model =
                    new MemoryFabricPreferencesDescriptor(
                            this.customerDesiredFirmwareBundleId, this.fabricRecycleLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MemoryFabricPreferencesDescriptor model) {
            if (model.wasPropertyExplicitlySet("customerDesiredFirmwareBundleId")) {
                this.customerDesiredFirmwareBundleId(model.getCustomerDesiredFirmwareBundleId());
            }
            if (model.wasPropertyExplicitlySet("fabricRecycleLevel")) {
                this.fabricRecycleLevel(model.getFabricRecycleLevel());
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

    /** The desired firmware bundle id on the GPU memory fabric. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerDesiredFirmwareBundleId")
    private final String customerDesiredFirmwareBundleId;

    /**
     * The desired firmware bundle id on the GPU memory fabric.
     *
     * @return the value
     */
    public String getCustomerDesiredFirmwareBundleId() {
        return customerDesiredFirmwareBundleId;
    }

    /** The recycle level of GPU memory fabric. */
    public enum FabricRecycleLevel implements com.oracle.bmc.http.internal.BmcEnum {
        FullRecycle("FULL_RECYCLE"),
        SkipRecycle("SKIP_RECYCLE"),
        OpportunisticFullRecycle("OPPORTUNISTIC_FULL_RECYCLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FabricRecycleLevel.class);

        private final String value;
        private static java.util.Map<String, FabricRecycleLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (FabricRecycleLevel v : FabricRecycleLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FabricRecycleLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FabricRecycleLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FabricRecycleLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The recycle level of GPU memory fabric. */
    @com.fasterxml.jackson.annotation.JsonProperty("fabricRecycleLevel")
    private final FabricRecycleLevel fabricRecycleLevel;

    /**
     * The recycle level of GPU memory fabric.
     *
     * @return the value
     */
    public FabricRecycleLevel getFabricRecycleLevel() {
        return fabricRecycleLevel;
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
        sb.append("MemoryFabricPreferencesDescriptor(");
        sb.append("super=").append(super.toString());
        sb.append("customerDesiredFirmwareBundleId=")
                .append(String.valueOf(this.customerDesiredFirmwareBundleId));
        sb.append(", fabricRecycleLevel=").append(String.valueOf(this.fabricRecycleLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MemoryFabricPreferencesDescriptor)) {
            return false;
        }

        MemoryFabricPreferencesDescriptor other = (MemoryFabricPreferencesDescriptor) o;
        return java.util.Objects.equals(
                        this.customerDesiredFirmwareBundleId, other.customerDesiredFirmwareBundleId)
                && java.util.Objects.equals(this.fabricRecycleLevel, other.fabricRecycleLevel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.customerDesiredFirmwareBundleId == null
                                ? 43
                                : this.customerDesiredFirmwareBundleId.hashCode());
        result =
                (result * PRIME)
                        + (this.fabricRecycleLevel == null
                                ? 43
                                : this.fabricRecycleLevel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
