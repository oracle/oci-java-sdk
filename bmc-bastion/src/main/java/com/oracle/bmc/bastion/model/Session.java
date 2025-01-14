/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.model;

/**
 * A bastion session resource. A bastion session lets authorized users connect to a target resource
 * using a Secure Shell (SSH) for a predetermined amount of time. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Session.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Session extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "bastionId",
        "bastionName",
        "bastionUserName",
        "targetResourceDetails",
        "sshMetadata",
        "keyType",
        "keyDetails",
        "bastionPublicHostKeyInfo",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "sessionTtlInSeconds"
    })
    public Session(
            String id,
            String displayName,
            String bastionId,
            String bastionName,
            String bastionUserName,
            TargetResourceDetails targetResourceDetails,
            java.util.Map<String, String> sshMetadata,
            KeyType keyType,
            PublicKeyDetails keyDetails,
            String bastionPublicHostKeyInfo,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            SessionLifecycleState lifecycleState,
            String lifecycleDetails,
            Integer sessionTtlInSeconds) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.bastionId = bastionId;
        this.bastionName = bastionName;
        this.bastionUserName = bastionUserName;
        this.targetResourceDetails = targetResourceDetails;
        this.sshMetadata = sshMetadata;
        this.keyType = keyType;
        this.keyDetails = keyDetails;
        this.bastionPublicHostKeyInfo = bastionPublicHostKeyInfo;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.sessionTtlInSeconds = sessionTtlInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique identifier (OCID) of the session, which can't be changed after creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier (OCID) of the session, which can't be changed after creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the session. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the session.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The unique identifier (OCID) of the bastion that is hosting this session. */
        @com.fasterxml.jackson.annotation.JsonProperty("bastionId")
        private String bastionId;

        /**
         * The unique identifier (OCID) of the bastion that is hosting this session.
         *
         * @param bastionId the value to set
         * @return this builder
         */
        public Builder bastionId(String bastionId) {
            this.bastionId = bastionId;
            this.__explicitlySet__.add("bastionId");
            return this;
        }
        /** The name of the bastion that is hosting this session. */
        @com.fasterxml.jackson.annotation.JsonProperty("bastionName")
        private String bastionName;

        /**
         * The name of the bastion that is hosting this session.
         *
         * @param bastionName the value to set
         * @return this builder
         */
        public Builder bastionName(String bastionName) {
            this.bastionName = bastionName;
            this.__explicitlySet__.add("bastionName");
            return this;
        }
        /** The username that the session uses to connect to the target resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("bastionUserName")
        private String bastionUserName;

        /**
         * The username that the session uses to connect to the target resource.
         *
         * @param bastionUserName the value to set
         * @return this builder
         */
        public Builder bastionUserName(String bastionUserName) {
            this.bastionUserName = bastionUserName;
            this.__explicitlySet__.add("bastionUserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceDetails")
        private TargetResourceDetails targetResourceDetails;

        public Builder targetResourceDetails(TargetResourceDetails targetResourceDetails) {
            this.targetResourceDetails = targetResourceDetails;
            this.__explicitlySet__.add("targetResourceDetails");
            return this;
        }
        /** The connection message for the session. */
        @com.fasterxml.jackson.annotation.JsonProperty("sshMetadata")
        private java.util.Map<String, String> sshMetadata;

        /**
         * The connection message for the session.
         *
         * @param sshMetadata the value to set
         * @return this builder
         */
        public Builder sshMetadata(java.util.Map<String, String> sshMetadata) {
            this.sshMetadata = sshMetadata;
            this.__explicitlySet__.add("sshMetadata");
            return this;
        }
        /**
         * The type of the key used to connect to the session. PUB is a standard public key in
         * OpenSSH format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyType")
        private KeyType keyType;

        /**
         * The type of the key used to connect to the session. PUB is a standard public key in
         * OpenSSH format.
         *
         * @param keyType the value to set
         * @return this builder
         */
        public Builder keyType(KeyType keyType) {
            this.keyType = keyType;
            this.__explicitlySet__.add("keyType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyDetails")
        private PublicKeyDetails keyDetails;

        public Builder keyDetails(PublicKeyDetails keyDetails) {
            this.keyDetails = keyDetails;
            this.__explicitlySet__.add("keyDetails");
            return this;
        }
        /**
         * The public key of the bastion host. You can use this to verify that you're connecting to
         * the correct bastion.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bastionPublicHostKeyInfo")
        private String bastionPublicHostKeyInfo;

        /**
         * The public key of the bastion host. You can use this to verify that you're connecting to
         * the correct bastion.
         *
         * @param bastionPublicHostKeyInfo the value to set
         * @return this builder
         */
        public Builder bastionPublicHostKeyInfo(String bastionPublicHostKeyInfo) {
            this.bastionPublicHostKeyInfo = bastionPublicHostKeyInfo;
            this.__explicitlySet__.add("bastionPublicHostKeyInfo");
            return this;
        }
        /**
         * The time the session was created. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the session was created. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
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
         * The time the session was updated. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the session was updated. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the session. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SessionLifecycleState lifecycleState;

        /**
         * The current state of the session.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(SessionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** A message describing the current session state in more detail. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current session state in more detail.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The amount of time the session can remain active. */
        @com.fasterxml.jackson.annotation.JsonProperty("sessionTtlInSeconds")
        private Integer sessionTtlInSeconds;

        /**
         * The amount of time the session can remain active.
         *
         * @param sessionTtlInSeconds the value to set
         * @return this builder
         */
        public Builder sessionTtlInSeconds(Integer sessionTtlInSeconds) {
            this.sessionTtlInSeconds = sessionTtlInSeconds;
            this.__explicitlySet__.add("sessionTtlInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Session build() {
            Session model =
                    new Session(
                            this.id,
                            this.displayName,
                            this.bastionId,
                            this.bastionName,
                            this.bastionUserName,
                            this.targetResourceDetails,
                            this.sshMetadata,
                            this.keyType,
                            this.keyDetails,
                            this.bastionPublicHostKeyInfo,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.sessionTtlInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Session model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("bastionId")) {
                this.bastionId(model.getBastionId());
            }
            if (model.wasPropertyExplicitlySet("bastionName")) {
                this.bastionName(model.getBastionName());
            }
            if (model.wasPropertyExplicitlySet("bastionUserName")) {
                this.bastionUserName(model.getBastionUserName());
            }
            if (model.wasPropertyExplicitlySet("targetResourceDetails")) {
                this.targetResourceDetails(model.getTargetResourceDetails());
            }
            if (model.wasPropertyExplicitlySet("sshMetadata")) {
                this.sshMetadata(model.getSshMetadata());
            }
            if (model.wasPropertyExplicitlySet("keyType")) {
                this.keyType(model.getKeyType());
            }
            if (model.wasPropertyExplicitlySet("keyDetails")) {
                this.keyDetails(model.getKeyDetails());
            }
            if (model.wasPropertyExplicitlySet("bastionPublicHostKeyInfo")) {
                this.bastionPublicHostKeyInfo(model.getBastionPublicHostKeyInfo());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("sessionTtlInSeconds")) {
                this.sessionTtlInSeconds(model.getSessionTtlInSeconds());
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

    /** The unique identifier (OCID) of the session, which can't be changed after creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier (OCID) of the session, which can't be changed after creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the session. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the session.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The unique identifier (OCID) of the bastion that is hosting this session. */
    @com.fasterxml.jackson.annotation.JsonProperty("bastionId")
    private final String bastionId;

    /**
     * The unique identifier (OCID) of the bastion that is hosting this session.
     *
     * @return the value
     */
    public String getBastionId() {
        return bastionId;
    }

    /** The name of the bastion that is hosting this session. */
    @com.fasterxml.jackson.annotation.JsonProperty("bastionName")
    private final String bastionName;

    /**
     * The name of the bastion that is hosting this session.
     *
     * @return the value
     */
    public String getBastionName() {
        return bastionName;
    }

    /** The username that the session uses to connect to the target resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("bastionUserName")
    private final String bastionUserName;

    /**
     * The username that the session uses to connect to the target resource.
     *
     * @return the value
     */
    public String getBastionUserName() {
        return bastionUserName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceDetails")
    private final TargetResourceDetails targetResourceDetails;

    public TargetResourceDetails getTargetResourceDetails() {
        return targetResourceDetails;
    }

    /** The connection message for the session. */
    @com.fasterxml.jackson.annotation.JsonProperty("sshMetadata")
    private final java.util.Map<String, String> sshMetadata;

    /**
     * The connection message for the session.
     *
     * @return the value
     */
    public java.util.Map<String, String> getSshMetadata() {
        return sshMetadata;
    }

    /**
     * The type of the key used to connect to the session. PUB is a standard public key in OpenSSH
     * format.
     */
    public enum KeyType implements com.oracle.bmc.http.internal.BmcEnum {
        Pub("PUB"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(KeyType.class);

        private final String value;
        private static java.util.Map<String, KeyType> map;

        static {
            map = new java.util.HashMap<>();
            for (KeyType v : KeyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        KeyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static KeyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'KeyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the key used to connect to the session. PUB is a standard public key in OpenSSH
     * format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyType")
    private final KeyType keyType;

    /**
     * The type of the key used to connect to the session. PUB is a standard public key in OpenSSH
     * format.
     *
     * @return the value
     */
    public KeyType getKeyType() {
        return keyType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("keyDetails")
    private final PublicKeyDetails keyDetails;

    public PublicKeyDetails getKeyDetails() {
        return keyDetails;
    }

    /**
     * The public key of the bastion host. You can use this to verify that you're connecting to the
     * correct bastion.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bastionPublicHostKeyInfo")
    private final String bastionPublicHostKeyInfo;

    /**
     * The public key of the bastion host. You can use this to verify that you're connecting to the
     * correct bastion.
     *
     * @return the value
     */
    public String getBastionPublicHostKeyInfo() {
        return bastionPublicHostKeyInfo;
    }

    /**
     * The time the session was created. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the session was created. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the session was updated. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the session was updated. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the session. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SessionLifecycleState lifecycleState;

    /**
     * The current state of the session.
     *
     * @return the value
     */
    public SessionLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** A message describing the current session state in more detail. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current session state in more detail.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The amount of time the session can remain active. */
    @com.fasterxml.jackson.annotation.JsonProperty("sessionTtlInSeconds")
    private final Integer sessionTtlInSeconds;

    /**
     * The amount of time the session can remain active.
     *
     * @return the value
     */
    public Integer getSessionTtlInSeconds() {
        return sessionTtlInSeconds;
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
        sb.append("Session(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", bastionId=").append(String.valueOf(this.bastionId));
        sb.append(", bastionName=").append(String.valueOf(this.bastionName));
        sb.append(", bastionUserName=").append(String.valueOf(this.bastionUserName));
        sb.append(", targetResourceDetails=").append(String.valueOf(this.targetResourceDetails));
        sb.append(", sshMetadata=").append(String.valueOf(this.sshMetadata));
        sb.append(", keyType=").append(String.valueOf(this.keyType));
        sb.append(", keyDetails=").append(String.valueOf(this.keyDetails));
        sb.append(", bastionPublicHostKeyInfo=")
                .append(String.valueOf(this.bastionPublicHostKeyInfo));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", sessionTtlInSeconds=").append(String.valueOf(this.sessionTtlInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Session)) {
            return false;
        }

        Session other = (Session) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.bastionId, other.bastionId)
                && java.util.Objects.equals(this.bastionName, other.bastionName)
                && java.util.Objects.equals(this.bastionUserName, other.bastionUserName)
                && java.util.Objects.equals(this.targetResourceDetails, other.targetResourceDetails)
                && java.util.Objects.equals(this.sshMetadata, other.sshMetadata)
                && java.util.Objects.equals(this.keyType, other.keyType)
                && java.util.Objects.equals(this.keyDetails, other.keyDetails)
                && java.util.Objects.equals(
                        this.bastionPublicHostKeyInfo, other.bastionPublicHostKeyInfo)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.sessionTtlInSeconds, other.sessionTtlInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.bastionId == null ? 43 : this.bastionId.hashCode());
        result = (result * PRIME) + (this.bastionName == null ? 43 : this.bastionName.hashCode());
        result =
                (result * PRIME)
                        + (this.bastionUserName == null ? 43 : this.bastionUserName.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceDetails == null
                                ? 43
                                : this.targetResourceDetails.hashCode());
        result = (result * PRIME) + (this.sshMetadata == null ? 43 : this.sshMetadata.hashCode());
        result = (result * PRIME) + (this.keyType == null ? 43 : this.keyType.hashCode());
        result = (result * PRIME) + (this.keyDetails == null ? 43 : this.keyDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.bastionPublicHostKeyInfo == null
                                ? 43
                                : this.bastionPublicHostKeyInfo.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionTtlInSeconds == null
                                ? 43
                                : this.sessionTtlInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
