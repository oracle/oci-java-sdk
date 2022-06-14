/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The status of the cross-connect.
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
    builder = CrossConnectStatus.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CrossConnectStatus {
    @Deprecated
    @java.beans.ConstructorProperties({
        "crossConnectId",
        "interfaceState",
        "lightLevelIndBm",
        "lightLevelIndicator",
        "encryptionStatus",
        "lightLevelsInDBm"
    })
    public CrossConnectStatus(
            String crossConnectId,
            InterfaceState interfaceState,
            Float lightLevelIndBm,
            LightLevelIndicator lightLevelIndicator,
            EncryptionStatus encryptionStatus,
            java.util.List<Float> lightLevelsInDBm) {
        super();
        this.crossConnectId = crossConnectId;
        this.interfaceState = interfaceState;
        this.lightLevelIndBm = lightLevelIndBm;
        this.lightLevelIndicator = lightLevelIndicator;
        this.encryptionStatus = encryptionStatus;
        this.lightLevelsInDBm = lightLevelsInDBm;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectId")
        private String crossConnectId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect.
         * @param crossConnectId the value to set
         * @return this builder
         **/
        public Builder crossConnectId(String crossConnectId) {
            this.crossConnectId = crossConnectId;
            this.__explicitlySet__.add("crossConnectId");
            return this;
        }
        /**
         * Indicates whether Oracle's side of the interface is up or down.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("interfaceState")
        private InterfaceState interfaceState;

        /**
         * Indicates whether Oracle's side of the interface is up or down.
         * @param interfaceState the value to set
         * @return this builder
         **/
        public Builder interfaceState(InterfaceState interfaceState) {
            this.interfaceState = interfaceState;
            this.__explicitlySet__.add("interfaceState");
            return this;
        }
        /**
         * The light level of the cross-connect (in dBm).
         * <p>
         * Example: {@code 14.0}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lightLevelIndBm")
        private Float lightLevelIndBm;

        /**
         * The light level of the cross-connect (in dBm).
         * <p>
         * Example: {@code 14.0}
         *
         * @param lightLevelIndBm the value to set
         * @return this builder
         **/
        public Builder lightLevelIndBm(Float lightLevelIndBm) {
            this.lightLevelIndBm = lightLevelIndBm;
            this.__explicitlySet__.add("lightLevelIndBm");
            return this;
        }
        /**
         * Status indicator corresponding to the light level.
         * <p>
         * **NO_LIGHT:** No measurable light
         *   * **LOW_WARN:** There's measurable light but it's too low
         *   * **HIGH_WARN:** Light level is too high
         *   * **BAD:** There's measurable light but the signal-to-noise ratio is bad
         *   * **GOOD:** Good light level
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lightLevelIndicator")
        private LightLevelIndicator lightLevelIndicator;

        /**
         * Status indicator corresponding to the light level.
         * <p>
         * **NO_LIGHT:** No measurable light
         *   * **LOW_WARN:** There's measurable light but it's too low
         *   * **HIGH_WARN:** Light level is too high
         *   * **BAD:** There's measurable light but the signal-to-noise ratio is bad
         *   * **GOOD:** Good light level
         *
         * @param lightLevelIndicator the value to set
         * @return this builder
         **/
        public Builder lightLevelIndicator(LightLevelIndicator lightLevelIndicator) {
            this.lightLevelIndicator = lightLevelIndicator;
            this.__explicitlySet__.add("lightLevelIndicator");
            return this;
        }
        /**
         * Encryption status of this cross connect.
         * <p>
         * Possible values:
         * * **UP:** Traffic is encrypted over this cross-connect
         * * **DOWN:** Traffic is not encrypted over this cross-connect
         * * **CIPHER_MISMATCH:** The MACsec encryption cipher doesn't match the cipher on the CPE
         * * **CKN_MISMATCH:** The MACsec Connectivity association Key Name (CKN) doesn't match the CKN on the CPE
         * * **CAK_MISMATCH:** The MACsec Connectivity Association Key (CAK) doesn't match the CAK on the CPE
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionStatus")
        private EncryptionStatus encryptionStatus;

        /**
         * Encryption status of this cross connect.
         * <p>
         * Possible values:
         * * **UP:** Traffic is encrypted over this cross-connect
         * * **DOWN:** Traffic is not encrypted over this cross-connect
         * * **CIPHER_MISMATCH:** The MACsec encryption cipher doesn't match the cipher on the CPE
         * * **CKN_MISMATCH:** The MACsec Connectivity association Key Name (CKN) doesn't match the CKN on the CPE
         * * **CAK_MISMATCH:** The MACsec Connectivity Association Key (CAK) doesn't match the CAK on the CPE
         *
         * @param encryptionStatus the value to set
         * @return this builder
         **/
        public Builder encryptionStatus(EncryptionStatus encryptionStatus) {
            this.encryptionStatus = encryptionStatus;
            this.__explicitlySet__.add("encryptionStatus");
            return this;
        }
        /**
         * The light levels of the cross-connect (in dBm).
         * <p>
         * Example: {@code [14.0, -14.0, 2.1, -10.1]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lightLevelsInDBm")
        private java.util.List<Float> lightLevelsInDBm;

        /**
         * The light levels of the cross-connect (in dBm).
         * <p>
         * Example: {@code [14.0, -14.0, 2.1, -10.1]}
         *
         * @param lightLevelsInDBm the value to set
         * @return this builder
         **/
        public Builder lightLevelsInDBm(java.util.List<Float> lightLevelsInDBm) {
            this.lightLevelsInDBm = lightLevelsInDBm;
            this.__explicitlySet__.add("lightLevelsInDBm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrossConnectStatus build() {
            CrossConnectStatus __instance__ =
                    new CrossConnectStatus(
                            crossConnectId,
                            interfaceState,
                            lightLevelIndBm,
                            lightLevelIndicator,
                            encryptionStatus,
                            lightLevelsInDBm);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossConnectStatus o) {
            Builder copiedBuilder =
                    crossConnectId(o.getCrossConnectId())
                            .interfaceState(o.getInterfaceState())
                            .lightLevelIndBm(o.getLightLevelIndBm())
                            .lightLevelIndicator(o.getLightLevelIndicator())
                            .encryptionStatus(o.getEncryptionStatus())
                            .lightLevelsInDBm(o.getLightLevelsInDBm());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectId")
    private final String crossConnectId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect.
     * @return the value
     **/
    public String getCrossConnectId() {
        return crossConnectId;
    }

    /**
     * Indicates whether Oracle's side of the interface is up or down.
     **/
    public enum InterfaceState {
        Up("UP"),
        Down("DOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InterfaceState.class);

        private final String value;
        private static java.util.Map<String, InterfaceState> map;

        static {
            map = new java.util.HashMap<>();
            for (InterfaceState v : InterfaceState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InterfaceState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InterfaceState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InterfaceState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether Oracle's side of the interface is up or down.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("interfaceState")
    private final InterfaceState interfaceState;

    /**
     * Indicates whether Oracle's side of the interface is up or down.
     * @return the value
     **/
    public InterfaceState getInterfaceState() {
        return interfaceState;
    }

    /**
     * The light level of the cross-connect (in dBm).
     * <p>
     * Example: {@code 14.0}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lightLevelIndBm")
    private final Float lightLevelIndBm;

    /**
     * The light level of the cross-connect (in dBm).
     * <p>
     * Example: {@code 14.0}
     *
     * @return the value
     **/
    public Float getLightLevelIndBm() {
        return lightLevelIndBm;
    }

    /**
     * Status indicator corresponding to the light level.
     * <p>
     * **NO_LIGHT:** No measurable light
     *   * **LOW_WARN:** There's measurable light but it's too low
     *   * **HIGH_WARN:** Light level is too high
     *   * **BAD:** There's measurable light but the signal-to-noise ratio is bad
     *   * **GOOD:** Good light level
     *
     **/
    public enum LightLevelIndicator {
        NoLight("NO_LIGHT"),
        LowWarn("LOW_WARN"),
        HighWarn("HIGH_WARN"),
        Bad("BAD"),
        Good("GOOD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LightLevelIndicator.class);

        private final String value;
        private static java.util.Map<String, LightLevelIndicator> map;

        static {
            map = new java.util.HashMap<>();
            for (LightLevelIndicator v : LightLevelIndicator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LightLevelIndicator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LightLevelIndicator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LightLevelIndicator', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status indicator corresponding to the light level.
     * <p>
     * **NO_LIGHT:** No measurable light
     *   * **LOW_WARN:** There's measurable light but it's too low
     *   * **HIGH_WARN:** Light level is too high
     *   * **BAD:** There's measurable light but the signal-to-noise ratio is bad
     *   * **GOOD:** Good light level
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lightLevelIndicator")
    private final LightLevelIndicator lightLevelIndicator;

    /**
     * Status indicator corresponding to the light level.
     * <p>
     * **NO_LIGHT:** No measurable light
     *   * **LOW_WARN:** There's measurable light but it's too low
     *   * **HIGH_WARN:** Light level is too high
     *   * **BAD:** There's measurable light but the signal-to-noise ratio is bad
     *   * **GOOD:** Good light level
     *
     * @return the value
     **/
    public LightLevelIndicator getLightLevelIndicator() {
        return lightLevelIndicator;
    }

    /**
     * Encryption status of this cross connect.
     * <p>
     * Possible values:
     * * **UP:** Traffic is encrypted over this cross-connect
     * * **DOWN:** Traffic is not encrypted over this cross-connect
     * * **CIPHER_MISMATCH:** The MACsec encryption cipher doesn't match the cipher on the CPE
     * * **CKN_MISMATCH:** The MACsec Connectivity association Key Name (CKN) doesn't match the CKN on the CPE
     * * **CAK_MISMATCH:** The MACsec Connectivity Association Key (CAK) doesn't match the CAK on the CPE
     *
     **/
    public enum EncryptionStatus {
        Up("UP"),
        Down("DOWN"),
        CipherMismatch("CIPHER_MISMATCH"),
        CknMismatch("CKN_MISMATCH"),
        CakMismatch("CAK_MISMATCH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EncryptionStatus.class);

        private final String value;
        private static java.util.Map<String, EncryptionStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (EncryptionStatus v : EncryptionStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EncryptionStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EncryptionStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EncryptionStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Encryption status of this cross connect.
     * <p>
     * Possible values:
     * * **UP:** Traffic is encrypted over this cross-connect
     * * **DOWN:** Traffic is not encrypted over this cross-connect
     * * **CIPHER_MISMATCH:** The MACsec encryption cipher doesn't match the cipher on the CPE
     * * **CKN_MISMATCH:** The MACsec Connectivity association Key Name (CKN) doesn't match the CKN on the CPE
     * * **CAK_MISMATCH:** The MACsec Connectivity Association Key (CAK) doesn't match the CAK on the CPE
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionStatus")
    private final EncryptionStatus encryptionStatus;

    /**
     * Encryption status of this cross connect.
     * <p>
     * Possible values:
     * * **UP:** Traffic is encrypted over this cross-connect
     * * **DOWN:** Traffic is not encrypted over this cross-connect
     * * **CIPHER_MISMATCH:** The MACsec encryption cipher doesn't match the cipher on the CPE
     * * **CKN_MISMATCH:** The MACsec Connectivity association Key Name (CKN) doesn't match the CKN on the CPE
     * * **CAK_MISMATCH:** The MACsec Connectivity Association Key (CAK) doesn't match the CAK on the CPE
     *
     * @return the value
     **/
    public EncryptionStatus getEncryptionStatus() {
        return encryptionStatus;
    }

    /**
     * The light levels of the cross-connect (in dBm).
     * <p>
     * Example: {@code [14.0, -14.0, 2.1, -10.1]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lightLevelsInDBm")
    private final java.util.List<Float> lightLevelsInDBm;

    /**
     * The light levels of the cross-connect (in dBm).
     * <p>
     * Example: {@code [14.0, -14.0, 2.1, -10.1]}
     *
     * @return the value
     **/
    public java.util.List<Float> getLightLevelsInDBm() {
        return lightLevelsInDBm;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CrossConnectStatus(");
        sb.append("crossConnectId=").append(String.valueOf(this.crossConnectId));
        sb.append(", interfaceState=").append(String.valueOf(this.interfaceState));
        sb.append(", lightLevelIndBm=").append(String.valueOf(this.lightLevelIndBm));
        sb.append(", lightLevelIndicator=").append(String.valueOf(this.lightLevelIndicator));
        sb.append(", encryptionStatus=").append(String.valueOf(this.encryptionStatus));
        sb.append(", lightLevelsInDBm=").append(String.valueOf(this.lightLevelsInDBm));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CrossConnectStatus)) {
            return false;
        }

        CrossConnectStatus other = (CrossConnectStatus) o;
        return java.util.Objects.equals(this.crossConnectId, other.crossConnectId)
                && java.util.Objects.equals(this.interfaceState, other.interfaceState)
                && java.util.Objects.equals(this.lightLevelIndBm, other.lightLevelIndBm)
                && java.util.Objects.equals(this.lightLevelIndicator, other.lightLevelIndicator)
                && java.util.Objects.equals(this.encryptionStatus, other.encryptionStatus)
                && java.util.Objects.equals(this.lightLevelsInDBm, other.lightLevelsInDBm)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.crossConnectId == null ? 43 : this.crossConnectId.hashCode());
        result =
                (result * PRIME)
                        + (this.interfaceState == null ? 43 : this.interfaceState.hashCode());
        result =
                (result * PRIME)
                        + (this.lightLevelIndBm == null ? 43 : this.lightLevelIndBm.hashCode());
        result =
                (result * PRIME)
                        + (this.lightLevelIndicator == null
                                ? 43
                                : this.lightLevelIndicator.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionStatus == null ? 43 : this.encryptionStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.lightLevelsInDBm == null ? 43 : this.lightLevelsInDBm.hashCode());
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
