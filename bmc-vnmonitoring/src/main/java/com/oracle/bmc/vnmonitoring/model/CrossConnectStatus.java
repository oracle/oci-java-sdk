/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * The status of the cross-connect. <br>
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
        builder = CrossConnectStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CrossConnectStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cross-connect.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectId")
        private String crossConnectId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cross-connect.
         *
         * @param crossConnectId the value to set
         * @return this builder
         */
        public Builder crossConnectId(String crossConnectId) {
            this.crossConnectId = crossConnectId;
            this.__explicitlySet__.add("crossConnectId");
            return this;
        }
        /** Indicates whether Oracle's side of the interface is up or down. */
        @com.fasterxml.jackson.annotation.JsonProperty("interfaceState")
        private InterfaceState interfaceState;

        /**
         * Indicates whether Oracle's side of the interface is up or down.
         *
         * @param interfaceState the value to set
         * @return this builder
         */
        public Builder interfaceState(InterfaceState interfaceState) {
            this.interfaceState = interfaceState;
            this.__explicitlySet__.add("interfaceState");
            return this;
        }
        /**
         * The light level of the cross-connect (in dBm).
         *
         * <p>Example: {@code 14.0}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lightLevelIndBm")
        private Float lightLevelIndBm;

        /**
         * The light level of the cross-connect (in dBm).
         *
         * <p>Example: {@code 14.0}
         *
         * @param lightLevelIndBm the value to set
         * @return this builder
         */
        public Builder lightLevelIndBm(Float lightLevelIndBm) {
            this.lightLevelIndBm = lightLevelIndBm;
            this.__explicitlySet__.add("lightLevelIndBm");
            return this;
        }
        /**
         * Status indicator corresponding to the light level.
         *
         * <p>**NO_LIGHT:** No measurable light * **LOW_WARN:** There's measurable light but it's
         * too low * **HIGH_WARN:** Light level is too high * **BAD:** There's measurable light but
         * the signal-to-noise ratio is bad * **GOOD:** Good light level
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lightLevelIndicator")
        private LightLevelIndicator lightLevelIndicator;

        /**
         * Status indicator corresponding to the light level.
         *
         * <p>**NO_LIGHT:** No measurable light * **LOW_WARN:** There's measurable light but it's
         * too low * **HIGH_WARN:** Light level is too high * **BAD:** There's measurable light but
         * the signal-to-noise ratio is bad * **GOOD:** Good light level
         *
         * @param lightLevelIndicator the value to set
         * @return this builder
         */
        public Builder lightLevelIndicator(LightLevelIndicator lightLevelIndicator) {
            this.lightLevelIndicator = lightLevelIndicator;
            this.__explicitlySet__.add("lightLevelIndicator");
            return this;
        }
        /**
         * Encryption status of this cross connect.
         *
         * <p>Possible values: * **UP:** Traffic is encrypted over this cross-connect * **DOWN:**
         * Traffic is not encrypted over this cross-connect * **CIPHER_MISMATCH:** The MACsec
         * encryption cipher doesn't match the cipher on the CPE * **CKN_MISMATCH:** The MACsec
         * Connectivity association Key Name (CKN) doesn't match the CKN on the CPE *
         * **CAK_MISMATCH:** The MACsec Connectivity Association Key (CAK) doesn't match the CAK on
         * the CPE
         */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionStatus")
        private EncryptionStatus encryptionStatus;

        /**
         * Encryption status of this cross connect.
         *
         * <p>Possible values: * **UP:** Traffic is encrypted over this cross-connect * **DOWN:**
         * Traffic is not encrypted over this cross-connect * **CIPHER_MISMATCH:** The MACsec
         * encryption cipher doesn't match the cipher on the CPE * **CKN_MISMATCH:** The MACsec
         * Connectivity association Key Name (CKN) doesn't match the CKN on the CPE *
         * **CAK_MISMATCH:** The MACsec Connectivity Association Key (CAK) doesn't match the CAK on
         * the CPE
         *
         * @param encryptionStatus the value to set
         * @return this builder
         */
        public Builder encryptionStatus(EncryptionStatus encryptionStatus) {
            this.encryptionStatus = encryptionStatus;
            this.__explicitlySet__.add("encryptionStatus");
            return this;
        }
        /**
         * The light levels of the cross-connect (in dBm).
         *
         * <p>Example: {@code [14.0, -14.0, 2.1, -10.1]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lightLevelsInDBm")
        private java.util.List<Float> lightLevelsInDBm;

        /**
         * The light levels of the cross-connect (in dBm).
         *
         * <p>Example: {@code [14.0, -14.0, 2.1, -10.1]}
         *
         * @param lightLevelsInDBm the value to set
         * @return this builder
         */
        public Builder lightLevelsInDBm(java.util.List<Float> lightLevelsInDBm) {
            this.lightLevelsInDBm = lightLevelsInDBm;
            this.__explicitlySet__.add("lightLevelsInDBm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrossConnectStatus build() {
            CrossConnectStatus model =
                    new CrossConnectStatus(
                            this.crossConnectId,
                            this.interfaceState,
                            this.lightLevelIndBm,
                            this.lightLevelIndicator,
                            this.encryptionStatus,
                            this.lightLevelsInDBm);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossConnectStatus model) {
            if (model.wasPropertyExplicitlySet("crossConnectId")) {
                this.crossConnectId(model.getCrossConnectId());
            }
            if (model.wasPropertyExplicitlySet("interfaceState")) {
                this.interfaceState(model.getInterfaceState());
            }
            if (model.wasPropertyExplicitlySet("lightLevelIndBm")) {
                this.lightLevelIndBm(model.getLightLevelIndBm());
            }
            if (model.wasPropertyExplicitlySet("lightLevelIndicator")) {
                this.lightLevelIndicator(model.getLightLevelIndicator());
            }
            if (model.wasPropertyExplicitlySet("encryptionStatus")) {
                this.encryptionStatus(model.getEncryptionStatus());
            }
            if (model.wasPropertyExplicitlySet("lightLevelsInDBm")) {
                this.lightLevelsInDBm(model.getLightLevelsInDBm());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cross-connect.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectId")
    private final String crossConnectId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cross-connect.
     *
     * @return the value
     */
    public String getCrossConnectId() {
        return crossConnectId;
    }

    /** Indicates whether Oracle's side of the interface is up or down. */
    public enum InterfaceState implements com.oracle.bmc.http.internal.BmcEnum {
        Up("UP"),
        Down("DOWN"),
        ;

        private final String value;
        private static java.util.Map<String, InterfaceState> map;

        static {
            map = new java.util.HashMap<>();
            for (InterfaceState v : InterfaceState.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid InterfaceState: " + key);
        }
    };
    /** Indicates whether Oracle's side of the interface is up or down. */
    @com.fasterxml.jackson.annotation.JsonProperty("interfaceState")
    private final InterfaceState interfaceState;

    /**
     * Indicates whether Oracle's side of the interface is up or down.
     *
     * @return the value
     */
    public InterfaceState getInterfaceState() {
        return interfaceState;
    }

    /**
     * The light level of the cross-connect (in dBm).
     *
     * <p>Example: {@code 14.0}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lightLevelIndBm")
    private final Float lightLevelIndBm;

    /**
     * The light level of the cross-connect (in dBm).
     *
     * <p>Example: {@code 14.0}
     *
     * @return the value
     */
    public Float getLightLevelIndBm() {
        return lightLevelIndBm;
    }

    /**
     * Status indicator corresponding to the light level.
     *
     * <p>**NO_LIGHT:** No measurable light * **LOW_WARN:** There's measurable light but it's too
     * low * **HIGH_WARN:** Light level is too high * **BAD:** There's measurable light but the
     * signal-to-noise ratio is bad * **GOOD:** Good light level
     */
    public enum LightLevelIndicator implements com.oracle.bmc.http.internal.BmcEnum {
        NoLight("NO_LIGHT"),
        LowWarn("LOW_WARN"),
        HighWarn("HIGH_WARN"),
        Bad("BAD"),
        Good("GOOD"),
        ;

        private final String value;
        private static java.util.Map<String, LightLevelIndicator> map;

        static {
            map = new java.util.HashMap<>();
            for (LightLevelIndicator v : LightLevelIndicator.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid LightLevelIndicator: " + key);
        }
    };
    /**
     * Status indicator corresponding to the light level.
     *
     * <p>**NO_LIGHT:** No measurable light * **LOW_WARN:** There's measurable light but it's too
     * low * **HIGH_WARN:** Light level is too high * **BAD:** There's measurable light but the
     * signal-to-noise ratio is bad * **GOOD:** Good light level
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lightLevelIndicator")
    private final LightLevelIndicator lightLevelIndicator;

    /**
     * Status indicator corresponding to the light level.
     *
     * <p>**NO_LIGHT:** No measurable light * **LOW_WARN:** There's measurable light but it's too
     * low * **HIGH_WARN:** Light level is too high * **BAD:** There's measurable light but the
     * signal-to-noise ratio is bad * **GOOD:** Good light level
     *
     * @return the value
     */
    public LightLevelIndicator getLightLevelIndicator() {
        return lightLevelIndicator;
    }

    /**
     * Encryption status of this cross connect.
     *
     * <p>Possible values: * **UP:** Traffic is encrypted over this cross-connect * **DOWN:**
     * Traffic is not encrypted over this cross-connect * **CIPHER_MISMATCH:** The MACsec encryption
     * cipher doesn't match the cipher on the CPE * **CKN_MISMATCH:** The MACsec Connectivity
     * association Key Name (CKN) doesn't match the CKN on the CPE * **CAK_MISMATCH:** The MACsec
     * Connectivity Association Key (CAK) doesn't match the CAK on the CPE
     */
    public enum EncryptionStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Up("UP"),
        Down("DOWN"),
        CipherMismatch("CIPHER_MISMATCH"),
        CknMismatch("CKN_MISMATCH"),
        CakMismatch("CAK_MISMATCH"),
        ;

        private final String value;
        private static java.util.Map<String, EncryptionStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (EncryptionStatus v : EncryptionStatus.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid EncryptionStatus: " + key);
        }
    };
    /**
     * Encryption status of this cross connect.
     *
     * <p>Possible values: * **UP:** Traffic is encrypted over this cross-connect * **DOWN:**
     * Traffic is not encrypted over this cross-connect * **CIPHER_MISMATCH:** The MACsec encryption
     * cipher doesn't match the cipher on the CPE * **CKN_MISMATCH:** The MACsec Connectivity
     * association Key Name (CKN) doesn't match the CKN on the CPE * **CAK_MISMATCH:** The MACsec
     * Connectivity Association Key (CAK) doesn't match the CAK on the CPE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionStatus")
    private final EncryptionStatus encryptionStatus;

    /**
     * Encryption status of this cross connect.
     *
     * <p>Possible values: * **UP:** Traffic is encrypted over this cross-connect * **DOWN:**
     * Traffic is not encrypted over this cross-connect * **CIPHER_MISMATCH:** The MACsec encryption
     * cipher doesn't match the cipher on the CPE * **CKN_MISMATCH:** The MACsec Connectivity
     * association Key Name (CKN) doesn't match the CKN on the CPE * **CAK_MISMATCH:** The MACsec
     * Connectivity Association Key (CAK) doesn't match the CAK on the CPE
     *
     * @return the value
     */
    public EncryptionStatus getEncryptionStatus() {
        return encryptionStatus;
    }

    /**
     * The light levels of the cross-connect (in dBm).
     *
     * <p>Example: {@code [14.0, -14.0, 2.1, -10.1]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lightLevelsInDBm")
    private final java.util.List<Float> lightLevelsInDBm;

    /**
     * The light levels of the cross-connect (in dBm).
     *
     * <p>Example: {@code [14.0, -14.0, 2.1, -10.1]}
     *
     * @return the value
     */
    public java.util.List<Float> getLightLevelsInDBm() {
        return lightLevelsInDBm;
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
        sb.append("CrossConnectStatus(");
        sb.append("super=").append(super.toString());
        sb.append("crossConnectId=").append(String.valueOf(this.crossConnectId));
        sb.append(", interfaceState=").append(String.valueOf(this.interfaceState));
        sb.append(", lightLevelIndBm=").append(String.valueOf(this.lightLevelIndBm));
        sb.append(", lightLevelIndicator=").append(String.valueOf(this.lightLevelIndicator));
        sb.append(", encryptionStatus=").append(String.valueOf(this.encryptionStatus));
        sb.append(", lightLevelsInDBm=").append(String.valueOf(this.lightLevelsInDBm));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
