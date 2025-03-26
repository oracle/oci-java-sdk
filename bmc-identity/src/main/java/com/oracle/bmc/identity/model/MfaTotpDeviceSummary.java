/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * As the name suggests, a {@code MfaTotpDeviceSummary} object contains information about a {@code MfaTotpDevice}.
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
    builder = MfaTotpDeviceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MfaTotpDeviceSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "userId",
        "timeCreated",
        "timeExpires",
        "lifecycleState",
        "inactiveStatus",
        "isActivated"
    })
    public MfaTotpDeviceSummary(
            String id,
            String userId,
            java.util.Date timeCreated,
            java.util.Date timeExpires,
            LifecycleState lifecycleState,
            Long inactiveStatus,
            Boolean isActivated) {
        super();
        this.id = id;
        this.userId = userId;
        this.timeCreated = timeCreated;
        this.timeExpires = timeExpires;
        this.lifecycleState = lifecycleState;
        this.inactiveStatus = inactiveStatus;
        this.isActivated = isActivated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the MFA TOTP Device.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the MFA TOTP Device.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the user the MFA TOTP device belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The OCID of the user the MFA TOTP device belongs to.
         * @param userId the value to set
         * @return this builder
         **/
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /**
         * Date and time the {@code MfaTotpDevice} object was created, in the format defined by RFC3339.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the {@code MfaTotpDevice} object was created, in the format defined by RFC3339.
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
         * Date and time when this MFA TOTP device will expire, in the format defined by RFC3339.
         * Null if it never expires.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * Date and time when this MFA TOTP device will expire, in the format defined by RFC3339.
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
         * The MFA TOTP device's current state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The MFA TOTP device's current state.
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
         * Allowed values are:
         *  - 1 - SUSPENDED
         *  - 2 - DISABLED
         *  - 4 - BLOCKED
         *  - 8 - LOCKED
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        /**
         * The detailed status of INACTIVE lifecycleState.
         * Allowed values are:
         *  - 1 - SUSPENDED
         *  - 2 - DISABLED
         *  - 4 - BLOCKED
         *  - 8 - LOCKED
         *
         * @param inactiveStatus the value to set
         * @return this builder
         **/
        public Builder inactiveStatus(Long inactiveStatus) {
            this.inactiveStatus = inactiveStatus;
            this.__explicitlySet__.add("inactiveStatus");
            return this;
        }
        /**
         * Flag to indicate if the MFA TOTP device has been activated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isActivated")
        private Boolean isActivated;

        /**
         * Flag to indicate if the MFA TOTP device has been activated
         * @param isActivated the value to set
         * @return this builder
         **/
        public Builder isActivated(Boolean isActivated) {
            this.isActivated = isActivated;
            this.__explicitlySet__.add("isActivated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MfaTotpDeviceSummary build() {
            MfaTotpDeviceSummary model =
                    new MfaTotpDeviceSummary(
                            this.id,
                            this.userId,
                            this.timeCreated,
                            this.timeExpires,
                            this.lifecycleState,
                            this.inactiveStatus,
                            this.isActivated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MfaTotpDeviceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
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
            if (model.wasPropertyExplicitlySet("isActivated")) {
                this.isActivated(model.getIsActivated());
            }
            return this;
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
     * The OCID of the MFA TOTP Device.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the MFA TOTP Device.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the user the MFA TOTP device belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The OCID of the user the MFA TOTP device belongs to.
     * @return the value
     **/
    public String getUserId() {
        return userId;
    }

    /**
     * Date and time the {@code MfaTotpDevice} object was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the {@code MfaTotpDevice} object was created, in the format defined by RFC3339.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Date and time when this MFA TOTP device will expire, in the format defined by RFC3339.
     * Null if it never expires.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * Date and time when this MFA TOTP device will expire, in the format defined by RFC3339.
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
     * The MFA TOTP device's current state.
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
     * The MFA TOTP device's current state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The MFA TOTP device's current state.
     *
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The detailed status of INACTIVE lifecycleState.
     * Allowed values are:
     *  - 1 - SUSPENDED
     *  - 2 - DISABLED
     *  - 4 - BLOCKED
     *  - 8 - LOCKED
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
    private final Long inactiveStatus;

    /**
     * The detailed status of INACTIVE lifecycleState.
     * Allowed values are:
     *  - 1 - SUSPENDED
     *  - 2 - DISABLED
     *  - 4 - BLOCKED
     *  - 8 - LOCKED
     *
     * @return the value
     **/
    public Long getInactiveStatus() {
        return inactiveStatus;
    }

    /**
     * Flag to indicate if the MFA TOTP device has been activated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isActivated")
    private final Boolean isActivated;

    /**
     * Flag to indicate if the MFA TOTP device has been activated
     * @return the value
     **/
    public Boolean getIsActivated() {
        return isActivated;
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
        sb.append("MfaTotpDeviceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", inactiveStatus=").append(String.valueOf(this.inactiveStatus));
        sb.append(", isActivated=").append(String.valueOf(this.isActivated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MfaTotpDeviceSummary)) {
            return false;
        }

        MfaTotpDeviceSummary other = (MfaTotpDeviceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.inactiveStatus, other.inactiveStatus)
                && java.util.Objects.equals(this.isActivated, other.isActivated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.inactiveStatus == null ? 43 : this.inactiveStatus.hashCode());
        result = (result * PRIME) + (this.isActivated == null ? 43 : this.isActivated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
