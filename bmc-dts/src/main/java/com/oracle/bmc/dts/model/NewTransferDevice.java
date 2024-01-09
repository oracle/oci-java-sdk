/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NewTransferDevice.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NewTransferDevice
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "label",
        "serialNumber",
        "iscsiIQN",
        "lifecycleState",
        "encryptionPassphrase",
        "transferJobId",
        "creationTime"
    })
    public NewTransferDevice(
            String label,
            String serialNumber,
            String iscsiIQN,
            LifecycleState lifecycleState,
            String encryptionPassphrase,
            String transferJobId,
            java.util.Date creationTime) {
        super();
        this.label = label;
        this.serialNumber = serialNumber;
        this.iscsiIQN = iscsiIQN;
        this.lifecycleState = lifecycleState;
        this.encryptionPassphrase = encryptionPassphrase;
        this.transferJobId = transferJobId;
        this.creationTime = creationTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("iscsiIQN")
        private String iscsiIQN;

        public Builder iscsiIQN(String iscsiIQN) {
            this.iscsiIQN = iscsiIQN;
            this.__explicitlySet__.add("iscsiIQN");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionPassphrase")
        private String encryptionPassphrase;

        public Builder encryptionPassphrase(String encryptionPassphrase) {
            this.encryptionPassphrase = encryptionPassphrase;
            this.__explicitlySet__.add("encryptionPassphrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("transferJobId")
        private String transferJobId;

        public Builder transferJobId(String transferJobId) {
            this.transferJobId = transferJobId;
            this.__explicitlySet__.add("transferJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
        private java.util.Date creationTime;

        public Builder creationTime(java.util.Date creationTime) {
            this.creationTime = creationTime;
            this.__explicitlySet__.add("creationTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NewTransferDevice build() {
            NewTransferDevice model =
                    new NewTransferDevice(
                            this.label,
                            this.serialNumber,
                            this.iscsiIQN,
                            this.lifecycleState,
                            this.encryptionPassphrase,
                            this.transferJobId,
                            this.creationTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NewTransferDevice model) {
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("iscsiIQN")) {
                this.iscsiIQN(model.getIscsiIQN());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("encryptionPassphrase")) {
                this.encryptionPassphrase(model.getEncryptionPassphrase());
            }
            if (model.wasPropertyExplicitlySet("transferJobId")) {
                this.transferJobId(model.getTransferJobId());
            }
            if (model.wasPropertyExplicitlySet("creationTime")) {
                this.creationTime(model.getCreationTime());
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

    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    public String getLabel() {
        return label;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("iscsiIQN")
    private final String iscsiIQN;

    public String getIscsiIQN() {
        return iscsiIQN;
    }

    /** */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Preparing("PREPARING"),

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

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("encryptionPassphrase")
    private final String encryptionPassphrase;

    public String getEncryptionPassphrase() {
        return encryptionPassphrase;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("transferJobId")
    private final String transferJobId;

    public String getTransferJobId() {
        return transferJobId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
    private final java.util.Date creationTime;

    public java.util.Date getCreationTime() {
        return creationTime;
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
        sb.append("NewTransferDevice(");
        sb.append("super=").append(super.toString());
        sb.append("label=").append(String.valueOf(this.label));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", iscsiIQN=").append(String.valueOf(this.iscsiIQN));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", encryptionPassphrase=").append(String.valueOf(this.encryptionPassphrase));
        sb.append(", transferJobId=").append(String.valueOf(this.transferJobId));
        sb.append(", creationTime=").append(String.valueOf(this.creationTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewTransferDevice)) {
            return false;
        }

        NewTransferDevice other = (NewTransferDevice) o;
        return java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.iscsiIQN, other.iscsiIQN)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.encryptionPassphrase, other.encryptionPassphrase)
                && java.util.Objects.equals(this.transferJobId, other.transferJobId)
                && java.util.Objects.equals(this.creationTime, other.creationTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result = (result * PRIME) + (this.iscsiIQN == null ? 43 : this.iscsiIQN.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionPassphrase == null
                                ? 43
                                : this.encryptionPassphrase.hashCode());
        result =
                (result * PRIME)
                        + (this.transferJobId == null ? 43 : this.transferJobId.hashCode());
        result = (result * PRIME) + (this.creationTime == null ? 43 : this.creationTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
