/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * User can define Oauth clients in IAM, then use it to generate a token to grant access to app resources.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OAuth2ClientCredential.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OAuth2ClientCredential {
    @Deprecated
    @java.beans.ConstructorProperties({
        "scopes",
        "password",
        "userId",
        "expiresOn",
        "id",
        "compartmentId",
        "name",
        "description",
        "lifecycleState",
        "timeCreated"
    })
    public OAuth2ClientCredential(
            java.util.List<FullyQualifiedScope> scopes,
            String password,
            String userId,
            java.util.Date expiresOn,
            String id,
            String compartmentId,
            String name,
            String description,
            LifecycleState lifecycleState,
            java.util.Date timeCreated) {
        super();
        this.scopes = scopes;
        this.password = password;
        this.userId = userId;
        this.expiresOn = expiresOn;
        this.id = id;
        this.compartmentId = compartmentId;
        this.name = name;
        this.description = description;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Allowed scopes for the given oauth credential.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scopes")
        private java.util.List<FullyQualifiedScope> scopes;

        /**
         * Allowed scopes for the given oauth credential.
         * @param scopes the value to set
         * @return this builder
         **/
        public Builder scopes(java.util.List<FullyQualifiedScope> scopes) {
            this.scopes = scopes;
            this.__explicitlySet__.add("scopes");
            return this;
        }
        /**
         * Returned during create and update with password reset requests.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * Returned during create and update with password reset requests.
         * @param password the value to set
         * @return this builder
         **/
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /**
         * The OCID of the user the Oauth credential belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The OCID of the user the Oauth credential belongs to.
         * @param userId the value to set
         * @return this builder
         **/
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /**
         * Date and time when this credential will expire, in the format defined by RFC3339.
         * Null if it never expires.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expiresOn")
        private java.util.Date expiresOn;

        /**
         * Date and time when this credential will expire, in the format defined by RFC3339.
         * Null if it never expires.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param expiresOn the value to set
         * @return this builder
         **/
        public Builder expiresOn(java.util.Date expiresOn) {
            this.expiresOn = expiresOn;
            this.__explicitlySet__.add("expiresOn");
            return this;
        }
        /**
         * The OCID of the Oauth credential.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the Oauth credential.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment containing the Oauth credential.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the Oauth credential.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name of the Oauth credential.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Oauth credential.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The description of the Oauth credential.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the Oauth credential.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The credential's current state. After creating a Oauth credential, make sure its {@code lifecycleState} changes from
         * CREATING to ACTIVE before using it.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The credential's current state. After creating a Oauth credential, make sure its {@code lifecycleState} changes from
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
         * Date and time the {@code OAuth2ClientCredential} object was created, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the {@code OAuth2ClientCredential} object was created, in the format defined by RFC3339.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OAuth2ClientCredential build() {
            OAuth2ClientCredential __instance__ =
                    new OAuth2ClientCredential(
                            scopes,
                            password,
                            userId,
                            expiresOn,
                            id,
                            compartmentId,
                            name,
                            description,
                            lifecycleState,
                            timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OAuth2ClientCredential o) {
            Builder copiedBuilder =
                    scopes(o.getScopes())
                            .password(o.getPassword())
                            .userId(o.getUserId())
                            .expiresOn(o.getExpiresOn())
                            .id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated());

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
     * Allowed scopes for the given oauth credential.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    private final java.util.List<FullyQualifiedScope> scopes;

    /**
     * Allowed scopes for the given oauth credential.
     * @return the value
     **/
    public java.util.List<FullyQualifiedScope> getScopes() {
        return scopes;
    }

    /**
     * Returned during create and update with password reset requests.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * Returned during create and update with password reset requests.
     * @return the value
     **/
    public String getPassword() {
        return password;
    }

    /**
     * The OCID of the user the Oauth credential belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The OCID of the user the Oauth credential belongs to.
     * @return the value
     **/
    public String getUserId() {
        return userId;
    }

    /**
     * Date and time when this credential will expire, in the format defined by RFC3339.
     * Null if it never expires.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expiresOn")
    private final java.util.Date expiresOn;

    /**
     * Date and time when this credential will expire, in the format defined by RFC3339.
     * Null if it never expires.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getExpiresOn() {
        return expiresOn;
    }

    /**
     * The OCID of the Oauth credential.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the Oauth credential.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment containing the Oauth credential.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the Oauth credential.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the Oauth credential.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Oauth credential.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The description of the Oauth credential.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the Oauth credential.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The credential's current state. After creating a Oauth credential, make sure its {@code lifecycleState} changes from
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
     * The credential's current state. After creating a Oauth credential, make sure its {@code lifecycleState} changes from
     * CREATING to ACTIVE before using it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The credential's current state. After creating a Oauth credential, make sure its {@code lifecycleState} changes from
     * CREATING to ACTIVE before using it.
     *
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Date and time the {@code OAuth2ClientCredential} object was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the {@code OAuth2ClientCredential} object was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OAuth2ClientCredential(");
        sb.append("scopes=").append(String.valueOf(this.scopes));
        sb.append(", password=").append(String.valueOf(this.password));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", expiresOn=").append(String.valueOf(this.expiresOn));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OAuth2ClientCredential)) {
            return false;
        }

        OAuth2ClientCredential other = (OAuth2ClientCredential) o;
        return java.util.Objects.equals(this.scopes, other.scopes)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.expiresOn, other.expiresOn)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.scopes == null ? 43 : this.scopes.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.expiresOn == null ? 43 : this.expiresOn.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
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
