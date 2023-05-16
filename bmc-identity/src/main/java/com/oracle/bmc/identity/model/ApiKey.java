/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * A PEM-format RSA credential for securing requests to the Oracle Cloud Infrastructure REST API.
 * Also known as an *API signing key*. Specifically, this is the public key from the key pair. The
 * private key remains with the user calling the API. For information about generating a key pair in
 * the required PEM format, see [Required Keys and
 * OCIDs](https://docs.cloud.oracle.com/Content/API/Concepts/apisigningkey.htm).
 *
 * <p>*Important:** This is **not** the SSH key for accessing compute instances.
 *
 * <p>Each user can have a maximum of three API signing keys.
 *
 * <p>For more information about user credentials, see [User
 * Credentials](https://docs.cloud.oracle.com/Content/Identity/Concepts/usercredentials.htm). <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApiKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApiKey extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "keyId",
        "keyValue",
        "fingerprint",
        "userId",
        "timeCreated",
        "lifecycleState",
        "inactiveStatus"
    })
    public ApiKey(
            String keyId,
            String keyValue,
            String fingerprint,
            String userId,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            Long inactiveStatus) {
        super();
        this.keyId = keyId;
        this.keyValue = keyValue;
        this.fingerprint = fingerprint;
        this.userId = userId;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.inactiveStatus = inactiveStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An Oracle-assigned identifier for the key, in this format:
         * TENANCY_OCID/USER_OCID/KEY_FINGERPRINT.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * An Oracle-assigned identifier for the key, in this format:
         * TENANCY_OCID/USER_OCID/KEY_FINGERPRINT.
         *
         * @param keyId the value to set
         * @return this builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /** The key's value. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyValue")
        private String keyValue;

        /**
         * The key's value.
         *
         * @param keyValue the value to set
         * @return this builder
         */
        public Builder keyValue(String keyValue) {
            this.keyValue = keyValue;
            this.__explicitlySet__.add("keyValue");
            return this;
        }
        /** The key's fingerprint (e.g., 12:34:56:78:90:ab:cd:ef:12:34:56:78:90:ab:cd:ef). */
        @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
        private String fingerprint;

        /**
         * The key's fingerprint (e.g., 12:34:56:78:90:ab:cd:ef:12:34:56:78:90:ab:cd:ef).
         *
         * @param fingerprint the value to set
         * @return this builder
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            this.__explicitlySet__.add("fingerprint");
            return this;
        }
        /** The OCID of the user the key belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The OCID of the user the key belongs to.
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /**
         * Date and time the {@code ApiKey} object was created, in the format defined by RFC3339.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the {@code ApiKey} object was created, in the format defined by RFC3339.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The API key's current state. After creating an {@code ApiKey} object, make sure its
         * {@code lifecycleState} changes from CREATING to ACTIVE before using it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The API key's current state. After creating an {@code ApiKey} object, make sure its
         * {@code lifecycleState} changes from CREATING to ACTIVE before using it.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The detailed status of INACTIVE lifecycleState. */
        @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        /**
         * The detailed status of INACTIVE lifecycleState.
         *
         * @param inactiveStatus the value to set
         * @return this builder
         */
        public Builder inactiveStatus(Long inactiveStatus) {
            this.inactiveStatus = inactiveStatus;
            this.__explicitlySet__.add("inactiveStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiKey build() {
            ApiKey model =
                    new ApiKey(
                            this.keyId,
                            this.keyValue,
                            this.fingerprint,
                            this.userId,
                            this.timeCreated,
                            this.lifecycleState,
                            this.inactiveStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiKey model) {
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("keyValue")) {
                this.keyValue(model.getKeyValue());
            }
            if (model.wasPropertyExplicitlySet("fingerprint")) {
                this.fingerprint(model.getFingerprint());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("inactiveStatus")) {
                this.inactiveStatus(model.getInactiveStatus());
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
     * An Oracle-assigned identifier for the key, in this format:
     * TENANCY_OCID/USER_OCID/KEY_FINGERPRINT.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * An Oracle-assigned identifier for the key, in this format:
     * TENANCY_OCID/USER_OCID/KEY_FINGERPRINT.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /** The key's value. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyValue")
    private final String keyValue;

    /**
     * The key's value.
     *
     * @return the value
     */
    public String getKeyValue() {
        return keyValue;
    }

    /** The key's fingerprint (e.g., 12:34:56:78:90:ab:cd:ef:12:34:56:78:90:ab:cd:ef). */
    @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
    private final String fingerprint;

    /**
     * The key's fingerprint (e.g., 12:34:56:78:90:ab:cd:ef:12:34:56:78:90:ab:cd:ef).
     *
     * @return the value
     */
    public String getFingerprint() {
        return fingerprint;
    }

    /** The OCID of the user the key belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The OCID of the user the key belongs to.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Date and time the {@code ApiKey} object was created, in the format defined by RFC3339.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the {@code ApiKey} object was created, in the format defined by RFC3339.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The API key's current state. After creating an {@code ApiKey} object, make sure its {@code
     * lifecycleState} changes from CREATING to ACTIVE before using it.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

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
    /**
     * The API key's current state. After creating an {@code ApiKey} object, make sure its {@code
     * lifecycleState} changes from CREATING to ACTIVE before using it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The API key's current state. After creating an {@code ApiKey} object, make sure its {@code
     * lifecycleState} changes from CREATING to ACTIVE before using it.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The detailed status of INACTIVE lifecycleState. */
    @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
    private final Long inactiveStatus;

    /**
     * The detailed status of INACTIVE lifecycleState.
     *
     * @return the value
     */
    public Long getInactiveStatus() {
        return inactiveStatus;
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
        sb.append("ApiKey(");
        sb.append("super=").append(super.toString());
        sb.append("keyId=").append(String.valueOf(this.keyId));
        sb.append(", keyValue=").append(String.valueOf(this.keyValue));
        sb.append(", fingerprint=").append(String.valueOf(this.fingerprint));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", inactiveStatus=").append(String.valueOf(this.inactiveStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiKey)) {
            return false;
        }

        ApiKey other = (ApiKey) o;
        return java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.keyValue, other.keyValue)
                && java.util.Objects.equals(this.fingerprint, other.fingerprint)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.inactiveStatus, other.inactiveStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.keyValue == null ? 43 : this.keyValue.hashCode());
        result = (result * PRIME) + (this.fingerprint == null ? 43 : this.fingerprint.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.inactiveStatus == null ? 43 : this.inactiveStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
