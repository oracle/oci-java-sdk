/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Information about the state of the service's encryption key management. The following properties
 * are read-only and ignored when this object is used in UpdateConfiguration: kmsKeyState,
 * timeCreated, timeUpdated. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KmsKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KmsKey extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "kmsVaultId",
        "kmsKeyState",
        "timeCreated",
        "timeUpdated"
    })
    public KmsKey(
            String id,
            String kmsVaultId,
            KmsKeyState kmsKeyState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.kmsVaultId = kmsVaultId;
        this.kmsKeyState = kmsKeyState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the KMS encryption key assigned to this Hosted Environment. If the Hosted
         * Environment is using an Oracle-managed Key, then the id will be a null string..
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the KMS encryption key assigned to this Hosted Environment. If the Hosted
         * Environment is using an Oracle-managed Key, then the id will be a null string..
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the vault containing the encryption key assigned to this Hosted Environment.
         * If the Hosted Environment is using an Oracle-managed Key, then the kmsVaultId will be a
         * null string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsVaultId")
        private String kmsVaultId;

        /**
         * The OCID of the vault containing the encryption key assigned to this Hosted Environment.
         * If the Hosted Environment is using an Oracle-managed Key, then the kmsVaultId will be a
         * null string.
         *
         * @param kmsVaultId the value to set
         * @return this builder
         */
        public Builder kmsVaultId(String kmsVaultId) {
            this.kmsVaultId = kmsVaultId;
            this.__explicitlySet__.add("kmsVaultId");
            return this;
        }
        /**
         * The current state of the encryption key assigned to this Hosted Environment.
         * Oracle-managed keys will always report an ACTIVE state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyState")
        private KmsKeyState kmsKeyState;

        /**
         * The current state of the encryption key assigned to this Hosted Environment.
         * Oracle-managed keys will always report an ACTIVE state.
         *
         * @param kmsKeyState the value to set
         * @return this builder
         */
        public Builder kmsKeyState(KmsKeyState kmsKeyState) {
            this.kmsKeyState = kmsKeyState;
            this.__explicitlySet__.add("kmsKeyState");
            return this;
        }
        /**
         * The timestamp when encryption key was first enabled for this Hosted Environment. RFC3339
         * formatted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The timestamp when encryption key was first enabled for this Hosted Environment. RFC3339
         * formatted.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The timestamp of the last update to the encryption key status. RFC3339 formatted. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The timestamp of the last update to the encryption key status. RFC3339 formatted.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KmsKey build() {
            KmsKey model =
                    new KmsKey(
                            this.id,
                            this.kmsVaultId,
                            this.kmsKeyState,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KmsKey model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("kmsVaultId")) {
                this.kmsVaultId(model.getKmsVaultId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyState")) {
                this.kmsKeyState(model.getKmsKeyState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The OCID of the KMS encryption key assigned to this Hosted Environment. If the Hosted
     * Environment is using an Oracle-managed Key, then the id will be a null string..
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the KMS encryption key assigned to this Hosted Environment. If the Hosted
     * Environment is using an Oracle-managed Key, then the id will be a null string..
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The OCID of the vault containing the encryption key assigned to this Hosted Environment. If
     * the Hosted Environment is using an Oracle-managed Key, then the kmsVaultId will be a null
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsVaultId")
    private final String kmsVaultId;

    /**
     * The OCID of the vault containing the encryption key assigned to this Hosted Environment. If
     * the Hosted Environment is using an Oracle-managed Key, then the kmsVaultId will be a null
     * string.
     *
     * @return the value
     */
    public String getKmsVaultId() {
        return kmsVaultId;
    }

    /**
     * The current state of the encryption key assigned to this Hosted Environment. Oracle-managed
     * keys will always report an ACTIVE state.
     */
    public enum KmsKeyState implements com.oracle.bmc.http.internal.BmcEnum {
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Reverting("REVERTING"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(KmsKeyState.class);

        private final String value;
        private static java.util.Map<String, KmsKeyState> map;

        static {
            map = new java.util.HashMap<>();
            for (KmsKeyState v : KmsKeyState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        KmsKeyState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static KmsKeyState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'KmsKeyState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the encryption key assigned to this Hosted Environment. Oracle-managed
     * keys will always report an ACTIVE state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyState")
    private final KmsKeyState kmsKeyState;

    /**
     * The current state of the encryption key assigned to this Hosted Environment. Oracle-managed
     * keys will always report an ACTIVE state.
     *
     * @return the value
     */
    public KmsKeyState getKmsKeyState() {
        return kmsKeyState;
    }

    /**
     * The timestamp when encryption key was first enabled for this Hosted Environment. RFC3339
     * formatted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The timestamp when encryption key was first enabled for this Hosted Environment. RFC3339
     * formatted.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The timestamp of the last update to the encryption key status. RFC3339 formatted. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The timestamp of the last update to the encryption key status. RFC3339 formatted.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("KmsKey(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", kmsVaultId=").append(String.valueOf(this.kmsVaultId));
        sb.append(", kmsKeyState=").append(String.valueOf(this.kmsKeyState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KmsKey)) {
            return false;
        }

        KmsKey other = (KmsKey) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.kmsVaultId, other.kmsVaultId)
                && java.util.Objects.equals(this.kmsKeyState, other.kmsKeyState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.kmsVaultId == null ? 43 : this.kmsVaultId.hashCode());
        result = (result * PRIME) + (this.kmsKeyState == null ? 43 : this.kmsKeyState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
