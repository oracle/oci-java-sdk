/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * An {@code AuthToken} is an Oracle-generated token string that you can use to authenticate with third-party APIs
 * that do not support Oracle Cloud Infrastructure's signature-based authentication. For example, use an {@code AuthToken}
 * to authenticate with a Swift client with the Object Storage Service.
 * <p>
 * The auth token is associated with the user's Console login. Auth tokens never expire. A user can have up to two
 * auth tokens at a time.
 * <p>
 **Note:** The token is always an Oracle-generated string; you can't change it to a string of your choice.
 * <p>
 * For more information, see [Managing User Credentials](https://docs.cloud.oracle.com/Content/Identity/access/managing-user-credentials.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AuthToken.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuthToken {
    @Deprecated
    @java.beans.ConstructorProperties({
        "token",
        "id",
        "userId",
        "description",
        "timeCreated",
        "timeExpires",
        "lifecycleState",
        "inactiveStatus"
    })
    public AuthToken(
            String token,
            String id,
            String userId,
            String description,
            java.util.Date timeCreated,
            java.util.Date timeExpires,
            LifecycleState lifecycleState,
            Long inactiveStatus) {
        super();
        this.token = token;
        this.id = id;
        this.userId = userId;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeExpires = timeExpires;
        this.lifecycleState = lifecycleState;
        this.inactiveStatus = inactiveStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The auth token. The value is available only in the response for {@code CreateAuthToken}, and not
         * for {@code ListAuthTokens} or {@code UpdateAuthToken}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("token")
        private String token;

        /**
         * The auth token. The value is available only in the response for {@code CreateAuthToken}, and not
         * for {@code ListAuthTokens} or {@code UpdateAuthToken}.
         *
         * @param token the value to set
         * @return this builder
         **/
        public Builder token(String token) {
            this.token = token;
            this.__explicitlySet__.add("token");
            return this;
        }
        /**
         * The OCID of the auth token.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the auth token.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the user the auth token belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The OCID of the user the auth token belongs to.
         * @param userId the value to set
         * @return this builder
         **/
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /**
         * The description you assign to the auth token. Does not have to be unique, and it's changeable.
         * <p>
         * (For tenancies that support identity domains) You can have an empty description.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description you assign to the auth token. Does not have to be unique, and it's changeable.
         * <p>
         * (For tenancies that support identity domains) You can have an empty description.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Date and time the {@code AuthToken} object was created, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the {@code AuthToken} object was created, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Date and time when this auth token will expire, in the format defined by RFC3339.
         * Null if it never expires.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * Date and time when this auth token will expire, in the format defined by RFC3339.
         * Null if it never expires.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeExpires the value to set
         * @return this builder
         **/
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }
        /**
         * The token's current state. After creating an auth token, make sure its {@code lifecycleState} changes from
         * CREATING to ACTIVE before using it.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The token's current state. After creating an auth token, make sure its {@code lifecycleState} changes from
         * CREATING to ACTIVE before using it.
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The detailed status of INACTIVE lifecycleState.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        /**
         * The detailed status of INACTIVE lifecycleState.
         * @param inactiveStatus the value to set
         * @return this builder
         **/
        public Builder inactiveStatus(Long inactiveStatus) {
            this.inactiveStatus = inactiveStatus;
            this.__explicitlySet__.add("inactiveStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthToken build() {
            AuthToken __instance__ =
                    new AuthToken(
                            token,
                            id,
                            userId,
                            description,
                            timeCreated,
                            timeExpires,
                            lifecycleState,
                            inactiveStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthToken o) {
            Builder copiedBuilder =
                    token(o.getToken())
                            .id(o.getId())
                            .userId(o.getUserId())
                            .description(o.getDescription())
                            .timeCreated(o.getTimeCreated())
                            .timeExpires(o.getTimeExpires())
                            .lifecycleState(o.getLifecycleState())
                            .inactiveStatus(o.getInactiveStatus());

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
     * The auth token. The value is available only in the response for {@code CreateAuthToken}, and not
     * for {@code ListAuthTokens} or {@code UpdateAuthToken}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("token")
    private final String token;

    /**
     * The auth token. The value is available only in the response for {@code CreateAuthToken}, and not
     * for {@code ListAuthTokens} or {@code UpdateAuthToken}.
     *
     * @return the value
     **/
    public String getToken() {
        return token;
    }

    /**
     * The OCID of the auth token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the auth token.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the user the auth token belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The OCID of the user the auth token belongs to.
     * @return the value
     **/
    public String getUserId() {
        return userId;
    }

    /**
     * The description you assign to the auth token. Does not have to be unique, and it's changeable.
     * <p>
     * (For tenancies that support identity domains) You can have an empty description.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description you assign to the auth token. Does not have to be unique, and it's changeable.
     * <p>
     * (For tenancies that support identity domains) You can have an empty description.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Date and time the {@code AuthToken} object was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the {@code AuthToken} object was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Date and time when this auth token will expire, in the format defined by RFC3339.
     * Null if it never expires.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * Date and time when this auth token will expire, in the format defined by RFC3339.
     * Null if it never expires.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeExpires() {
        return timeExpires;
    }

    /**
     * The token's current state. After creating an auth token, make sure its {@code lifecycleState} changes from
     * CREATING to ACTIVE before using it.
     *
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * The token's current state. After creating an auth token, make sure its {@code lifecycleState} changes from
     * CREATING to ACTIVE before using it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The token's current state. After creating an auth token, make sure its {@code lifecycleState} changes from
     * CREATING to ACTIVE before using it.
     *
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The detailed status of INACTIVE lifecycleState.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
    private final Long inactiveStatus;

    /**
     * The detailed status of INACTIVE lifecycleState.
     * @return the value
     **/
    public Long getInactiveStatus() {
        return inactiveStatus;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AuthToken(");
        sb.append("token=").append(String.valueOf(this.token));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", inactiveStatus=").append(String.valueOf(this.inactiveStatus));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthToken)) {
            return false;
        }

        AuthToken other = (AuthToken) o;
        return java.util.Objects.equals(this.token, other.token)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.inactiveStatus, other.inactiveStatus)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.token == null ? 43 : this.token.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.inactiveStatus == null ? 43 : this.inactiveStatus.hashCode());
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
