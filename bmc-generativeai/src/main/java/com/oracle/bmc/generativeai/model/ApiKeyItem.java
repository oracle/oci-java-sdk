/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The ApiKey item. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApiKeyItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApiKeyItem extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "keyName",
        "keyMask",
        "timeCreated",
        "timeExpiry",
        "timeActivated",
        "timeDeactivated",
        "timeRevoked",
        "timeLastUsed",
        "state"
    })
    public ApiKeyItem(
            String key,
            String keyName,
            String keyMask,
            java.util.Date timeCreated,
            java.util.Date timeExpiry,
            java.util.Date timeActivated,
            java.util.Date timeDeactivated,
            java.util.Date timeRevoked,
            java.util.Date timeLastUsed,
            State state) {
        super();
        this.key = key;
        this.keyName = keyName;
        this.keyMask = keyMask;
        this.timeCreated = timeCreated;
        this.timeExpiry = timeExpiry;
        this.timeActivated = timeActivated;
        this.timeDeactivated = timeDeactivated;
        this.timeRevoked = timeRevoked;
        this.timeLastUsed = timeLastUsed;
        this.state = state;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The key. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The key.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The key name. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyName")
        private String keyName;

        /**
         * The key name.
         *
         * @param keyName the value to set
         * @return this builder
         */
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            this.__explicitlySet__.add("keyName");
            return this;
        }
        /** The masked key. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyMask")
        private String keyMask;

        /**
         * The masked key.
         *
         * @param keyMask the value to set
         * @return this builder
         */
        public Builder keyMask(String keyMask) {
            this.keyMask = keyMask;
            this.__explicitlySet__.add("keyMask");
            return this;
        }
        /**
         * The date and time that the key was created in the format of an RFC3339 datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the key was created in the format of an RFC3339 datetime string.
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
         * The date and time when the key would be expired, if not provided it would be 90 days, in
         * the format defined by RFC 3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpiry")
        private java.util.Date timeExpiry;

        /**
         * The date and time when the key would be expired, if not provided it would be 90 days, in
         * the format defined by RFC 3339.
         *
         * @param timeExpiry the value to set
         * @return this builder
         */
        public Builder timeExpiry(java.util.Date timeExpiry) {
            this.timeExpiry = timeExpiry;
            this.__explicitlySet__.add("timeExpiry");
            return this;
        }
        /**
         * The date and time that the key is activated in the format of an RFC3339 datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeActivated")
        private java.util.Date timeActivated;

        /**
         * The date and time that the key is activated in the format of an RFC3339 datetime string.
         *
         * @param timeActivated the value to set
         * @return this builder
         */
        public Builder timeActivated(java.util.Date timeActivated) {
            this.timeActivated = timeActivated;
            this.__explicitlySet__.add("timeActivated");
            return this;
        }
        /**
         * The date and time that the key is deactivated in the format of an RFC3339 datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDeactivated")
        private java.util.Date timeDeactivated;

        /**
         * The date and time that the key is deactivated in the format of an RFC3339 datetime
         * string.
         *
         * @param timeDeactivated the value to set
         * @return this builder
         */
        public Builder timeDeactivated(java.util.Date timeDeactivated) {
            this.timeDeactivated = timeDeactivated;
            this.__explicitlySet__.add("timeDeactivated");
            return this;
        }
        /**
         * The date and time that the key is revoked in the format of an RFC3339 datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRevoked")
        private java.util.Date timeRevoked;

        /**
         * The date and time that the key is revoked in the format of an RFC3339 datetime string.
         *
         * @param timeRevoked the value to set
         * @return this builder
         */
        public Builder timeRevoked(java.util.Date timeRevoked) {
            this.timeRevoked = timeRevoked;
            this.__explicitlySet__.add("timeRevoked");
            return this;
        }
        /**
         * The date and time that the key is last used in the format of an RFC3339 datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastUsed")
        private java.util.Date timeLastUsed;

        /**
         * The date and time that the key is last used in the format of an RFC3339 datetime string.
         *
         * @param timeLastUsed the value to set
         * @return this builder
         */
        public Builder timeLastUsed(java.util.Date timeLastUsed) {
            this.timeLastUsed = timeLastUsed;
            this.__explicitlySet__.add("timeLastUsed");
            return this;
        }
        /** The current state of the API key item. */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        /**
         * The current state of the API key item.
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiKeyItem build() {
            ApiKeyItem model =
                    new ApiKeyItem(
                            this.key,
                            this.keyName,
                            this.keyMask,
                            this.timeCreated,
                            this.timeExpiry,
                            this.timeActivated,
                            this.timeDeactivated,
                            this.timeRevoked,
                            this.timeLastUsed,
                            this.state);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiKeyItem model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("keyName")) {
                this.keyName(model.getKeyName());
            }
            if (model.wasPropertyExplicitlySet("keyMask")) {
                this.keyMask(model.getKeyMask());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeExpiry")) {
                this.timeExpiry(model.getTimeExpiry());
            }
            if (model.wasPropertyExplicitlySet("timeActivated")) {
                this.timeActivated(model.getTimeActivated());
            }
            if (model.wasPropertyExplicitlySet("timeDeactivated")) {
                this.timeDeactivated(model.getTimeDeactivated());
            }
            if (model.wasPropertyExplicitlySet("timeRevoked")) {
                this.timeRevoked(model.getTimeRevoked());
            }
            if (model.wasPropertyExplicitlySet("timeLastUsed")) {
                this.timeLastUsed(model.getTimeLastUsed());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
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

    /** The key. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The key.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The key name. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyName")
    private final String keyName;

    /**
     * The key name.
     *
     * @return the value
     */
    public String getKeyName() {
        return keyName;
    }

    /** The masked key. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyMask")
    private final String keyMask;

    /**
     * The masked key.
     *
     * @return the value
     */
    public String getKeyMask() {
        return keyMask;
    }

    /** The date and time that the key was created in the format of an RFC3339 datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the key was created in the format of an RFC3339 datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time when the key would be expired, if not provided it would be 90 days, in the
     * format defined by RFC 3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpiry")
    private final java.util.Date timeExpiry;

    /**
     * The date and time when the key would be expired, if not provided it would be 90 days, in the
     * format defined by RFC 3339.
     *
     * @return the value
     */
    public java.util.Date getTimeExpiry() {
        return timeExpiry;
    }

    /** The date and time that the key is activated in the format of an RFC3339 datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeActivated")
    private final java.util.Date timeActivated;

    /**
     * The date and time that the key is activated in the format of an RFC3339 datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeActivated() {
        return timeActivated;
    }

    /**
     * The date and time that the key is deactivated in the format of an RFC3339 datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDeactivated")
    private final java.util.Date timeDeactivated;

    /**
     * The date and time that the key is deactivated in the format of an RFC3339 datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeDeactivated() {
        return timeDeactivated;
    }

    /** The date and time that the key is revoked in the format of an RFC3339 datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRevoked")
    private final java.util.Date timeRevoked;

    /**
     * The date and time that the key is revoked in the format of an RFC3339 datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeRevoked() {
        return timeRevoked;
    }

    /** The date and time that the key is last used in the format of an RFC3339 datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastUsed")
    private final java.util.Date timeLastUsed;

    /**
     * The date and time that the key is last used in the format of an RFC3339 datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeLastUsed() {
        return timeLastUsed;
    }

    /** The current state of the API key item. */
    public enum State implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Revoked("REVOKED"),
        Expired("EXPIRED"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(State.class);

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'State', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the API key item. */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    /**
     * The current state of the API key item.
     *
     * @return the value
     */
    public State getState() {
        return state;
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
        sb.append("ApiKeyItem(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", keyName=").append(String.valueOf(this.keyName));
        sb.append(", keyMask=").append(String.valueOf(this.keyMask));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeExpiry=").append(String.valueOf(this.timeExpiry));
        sb.append(", timeActivated=").append(String.valueOf(this.timeActivated));
        sb.append(", timeDeactivated=").append(String.valueOf(this.timeDeactivated));
        sb.append(", timeRevoked=").append(String.valueOf(this.timeRevoked));
        sb.append(", timeLastUsed=").append(String.valueOf(this.timeLastUsed));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiKeyItem)) {
            return false;
        }

        ApiKeyItem other = (ApiKeyItem) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.keyName, other.keyName)
                && java.util.Objects.equals(this.keyMask, other.keyMask)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeExpiry, other.timeExpiry)
                && java.util.Objects.equals(this.timeActivated, other.timeActivated)
                && java.util.Objects.equals(this.timeDeactivated, other.timeDeactivated)
                && java.util.Objects.equals(this.timeRevoked, other.timeRevoked)
                && java.util.Objects.equals(this.timeLastUsed, other.timeLastUsed)
                && java.util.Objects.equals(this.state, other.state)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.keyName == null ? 43 : this.keyName.hashCode());
        result = (result * PRIME) + (this.keyMask == null ? 43 : this.keyMask.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeExpiry == null ? 43 : this.timeExpiry.hashCode());
        result =
                (result * PRIME)
                        + (this.timeActivated == null ? 43 : this.timeActivated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDeactivated == null ? 43 : this.timeDeactivated.hashCode());
        result = (result * PRIME) + (this.timeRevoked == null ? 43 : this.timeRevoked.hashCode());
        result = (result * PRIME) + (this.timeLastUsed == null ? 43 : this.timeLastUsed.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
