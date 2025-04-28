/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * A {@code CustomerSecretKey} is an Oracle-provided key for using the Object Storage Service's
 * [Amazon S3 compatible
 * API](https://docs.oracle.com/iaas/Content/Object/Tasks/s3compatibleapi.htm). The key consists of
 * a secret key/access key pair. A user can have up to two secret keys at a time.
 *
 * <p>*Note:** The secret key is always an Oracle-generated string; you can't change it to a string
 * of your choice.
 *
 * <p>For more information, see [Managing User
 * Credentials](https://docs.oracle.com/iaas/Content/Identity/access/managing-user-credentials.htm).
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CustomerSecretKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomerSecretKey
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "id",
        "userId",
        "displayName",
        "timeCreated",
        "timeExpires",
        "lifecycleState",
        "inactiveStatus"
    })
    public CustomerSecretKey(
            String key,
            String id,
            String userId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeExpires,
            LifecycleState lifecycleState,
            Long inactiveStatus) {
        super();
        this.key = key;
        this.id = id;
        this.userId = userId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeExpires = timeExpires;
        this.lifecycleState = lifecycleState;
        this.inactiveStatus = inactiveStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The secret key. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The secret key.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The access key portion of the key pair. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The access key portion of the key pair.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the user the password belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The OCID of the user the password belongs to.
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
         * The display name you assign to the secret key. Does not have to be unique, and it's
         * changeable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name you assign to the secret key. Does not have to be unique, and it's
         * changeable.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Date and time the {@code CustomerSecretKey} object was created, in the format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the {@code CustomerSecretKey} object was created, in the format defined by
         * RFC3339.
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
         * Date and time when this password will expire, in the format defined by RFC3339. Null if
         * it never expires.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * Date and time when this password will expire, in the format defined by RFC3339. Null if
         * it never expires.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeExpires the value to set
         * @return this builder
         */
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }
        /**
         * The secret key's current state. After creating a secret key, make sure its {@code
         * lifecycleState} changes from CREATING to ACTIVE before using it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The secret key's current state. After creating a secret key, make sure its {@code
         * lifecycleState} changes from CREATING to ACTIVE before using it.
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

        public CustomerSecretKey build() {
            CustomerSecretKey model =
                    new CustomerSecretKey(
                            this.key,
                            this.id,
                            this.userId,
                            this.displayName,
                            this.timeCreated,
                            this.timeExpires,
                            this.lifecycleState,
                            this.inactiveStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomerSecretKey model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
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

    /** The secret key. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The secret key.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The access key portion of the key pair. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The access key portion of the key pair.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the user the password belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The OCID of the user the password belongs to.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /**
     * The display name you assign to the secret key. Does not have to be unique, and it's
     * changeable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name you assign to the secret key. Does not have to be unique, and it's
     * changeable.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Date and time the {@code CustomerSecretKey} object was created, in the format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the {@code CustomerSecretKey} object was created, in the format defined by
     * RFC3339.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Date and time when this password will expire, in the format defined by RFC3339. Null if it
     * never expires.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * Date and time when this password will expire, in the format defined by RFC3339. Null if it
     * never expires.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeExpires() {
        return timeExpires;
    }

    /**
     * The secret key's current state. After creating a secret key, make sure its {@code
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
     * The secret key's current state. After creating a secret key, make sure its {@code
     * lifecycleState} changes from CREATING to ACTIVE before using it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The secret key's current state. After creating a secret key, make sure its {@code
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
        sb.append("CustomerSecretKey(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
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
        if (!(o instanceof CustomerSecretKey)) {
            return false;
        }

        CustomerSecretKey other = (CustomerSecretKey) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.inactiveStatus, other.inactiveStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
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
