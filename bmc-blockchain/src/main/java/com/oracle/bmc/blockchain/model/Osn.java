/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * An Ordering Service Node details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Osn.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Osn extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"osnKey", "ad", "ocpuAllocationParam", "lifecycleState"})
    public Osn(
            String osnKey,
            AvailabilityDomain.Ads ad,
            OcpuAllocationNumberParam ocpuAllocationParam,
            LifecycleState lifecycleState) {
        super();
        this.osnKey = osnKey;
        this.ad = ad;
        this.ocpuAllocationParam = ocpuAllocationParam;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OSN identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("osnKey")
        private String osnKey;

        /**
         * OSN identifier
         *
         * @param osnKey the value to set
         * @return this builder
         */
        public Builder osnKey(String osnKey) {
            this.osnKey = osnKey;
            this.__explicitlySet__.add("osnKey");
            return this;
        }
        /** Availability Domain of OSN */
        @com.fasterxml.jackson.annotation.JsonProperty("ad")
        private AvailabilityDomain.Ads ad;

        /**
         * Availability Domain of OSN
         *
         * @param ad the value to set
         * @return this builder
         */
        public Builder ad(AvailabilityDomain.Ads ad) {
            this.ad = ad;
            this.__explicitlySet__.add("ad");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuAllocationParam")
        private OcpuAllocationNumberParam ocpuAllocationParam;

        public Builder ocpuAllocationParam(OcpuAllocationNumberParam ocpuAllocationParam) {
            this.ocpuAllocationParam = ocpuAllocationParam;
            this.__explicitlySet__.add("ocpuAllocationParam");
            return this;
        }
        /** The current state of the OSN. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the OSN.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Osn build() {
            Osn model =
                    new Osn(this.osnKey, this.ad, this.ocpuAllocationParam, this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Osn model) {
            if (model.wasPropertyExplicitlySet("osnKey")) {
                this.osnKey(model.getOsnKey());
            }
            if (model.wasPropertyExplicitlySet("ad")) {
                this.ad(model.getAd());
            }
            if (model.wasPropertyExplicitlySet("ocpuAllocationParam")) {
                this.ocpuAllocationParam(model.getOcpuAllocationParam());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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

    /** OSN identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("osnKey")
    private final String osnKey;

    /**
     * OSN identifier
     *
     * @return the value
     */
    public String getOsnKey() {
        return osnKey;
    }

    /** Availability Domain of OSN */
    @com.fasterxml.jackson.annotation.JsonProperty("ad")
    private final AvailabilityDomain.Ads ad;

    /**
     * Availability Domain of OSN
     *
     * @return the value
     */
    public AvailabilityDomain.Ads getAd() {
        return ad;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ocpuAllocationParam")
    private final OcpuAllocationNumberParam ocpuAllocationParam;

    public OcpuAllocationNumberParam getOcpuAllocationParam() {
        return ocpuAllocationParam;
    }

    /** The current state of the OSN. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Failed("FAILED"),

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
    /** The current state of the OSN. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the OSN.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("Osn(");
        sb.append("super=").append(super.toString());
        sb.append("osnKey=").append(String.valueOf(this.osnKey));
        sb.append(", ad=").append(String.valueOf(this.ad));
        sb.append(", ocpuAllocationParam=").append(String.valueOf(this.ocpuAllocationParam));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Osn)) {
            return false;
        }

        Osn other = (Osn) o;
        return java.util.Objects.equals(this.osnKey, other.osnKey)
                && java.util.Objects.equals(this.ad, other.ad)
                && java.util.Objects.equals(this.ocpuAllocationParam, other.ocpuAllocationParam)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.osnKey == null ? 43 : this.osnKey.hashCode());
        result = (result * PRIME) + (this.ad == null ? 43 : this.ad.hashCode());
        result =
                (result * PRIME)
                        + (this.ocpuAllocationParam == null
                                ? 43
                                : this.ocpuAllocationParam.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
