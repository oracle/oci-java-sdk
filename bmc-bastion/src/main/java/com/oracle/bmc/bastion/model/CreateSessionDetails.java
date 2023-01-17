/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.model;

/**
 * The configuration details for a new bastion session. A session lets authorized users connect to a target resource for a predetermined amount of time. The Bastion service recognizes two types of sessions, managed SSH sessions and SSH port forwarding sessions. Managed SSH sessions require that the target resource has an OpenSSH server and the Oracle Cloud Agent both running.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSessionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSessionDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "bastionId",
        "targetResourceDetails",
        "keyType",
        "keyDetails",
        "sessionTtlInSeconds"
    })
    public CreateSessionDetails(
            String displayName,
            String bastionId,
            CreateSessionTargetResourceDetails targetResourceDetails,
            KeyType keyType,
            PublicKeyDetails keyDetails,
            Integer sessionTtlInSeconds) {
        super();
        this.displayName = displayName;
        this.bastionId = bastionId;
        this.targetResourceDetails = targetResourceDetails;
        this.keyType = keyType;
        this.keyDetails = keyDetails;
        this.sessionTtlInSeconds = sessionTtlInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the session.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the session.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The unique identifier (OCID) of the bastion on which to create this session.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bastionId")
        private String bastionId;

        /**
         * The unique identifier (OCID) of the bastion on which to create this session.
         * @param bastionId the value to set
         * @return this builder
         **/
        public Builder bastionId(String bastionId) {
            this.bastionId = bastionId;
            this.__explicitlySet__.add("bastionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceDetails")
        private CreateSessionTargetResourceDetails targetResourceDetails;

        public Builder targetResourceDetails(
                CreateSessionTargetResourceDetails targetResourceDetails) {
            this.targetResourceDetails = targetResourceDetails;
            this.__explicitlySet__.add("targetResourceDetails");
            return this;
        }
        /**
         * The type of the key used to connect to the session. PUB is a standard public key in OpenSSH format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyType")
        private KeyType keyType;

        /**
         * The type of the key used to connect to the session. PUB is a standard public key in OpenSSH format.
         * @param keyType the value to set
         * @return this builder
         **/
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
         * The amount of time the session can remain active.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sessionTtlInSeconds")
        private Integer sessionTtlInSeconds;

        /**
         * The amount of time the session can remain active.
         * @param sessionTtlInSeconds the value to set
         * @return this builder
         **/
        public Builder sessionTtlInSeconds(Integer sessionTtlInSeconds) {
            this.sessionTtlInSeconds = sessionTtlInSeconds;
            this.__explicitlySet__.add("sessionTtlInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSessionDetails build() {
            CreateSessionDetails model =
                    new CreateSessionDetails(
                            this.displayName,
                            this.bastionId,
                            this.targetResourceDetails,
                            this.keyType,
                            this.keyDetails,
                            this.sessionTtlInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSessionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("bastionId")) {
                this.bastionId(model.getBastionId());
            }
            if (model.wasPropertyExplicitlySet("targetResourceDetails")) {
                this.targetResourceDetails(model.getTargetResourceDetails());
            }
            if (model.wasPropertyExplicitlySet("keyType")) {
                this.keyType(model.getKeyType());
            }
            if (model.wasPropertyExplicitlySet("keyDetails")) {
                this.keyDetails(model.getKeyDetails());
            }
            if (model.wasPropertyExplicitlySet("sessionTtlInSeconds")) {
                this.sessionTtlInSeconds(model.getSessionTtlInSeconds());
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
     * The name of the session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the session.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The unique identifier (OCID) of the bastion on which to create this session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bastionId")
    private final String bastionId;

    /**
     * The unique identifier (OCID) of the bastion on which to create this session.
     * @return the value
     **/
    public String getBastionId() {
        return bastionId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceDetails")
    private final CreateSessionTargetResourceDetails targetResourceDetails;

    public CreateSessionTargetResourceDetails getTargetResourceDetails() {
        return targetResourceDetails;
    }

    /**
     * The type of the key used to connect to the session. PUB is a standard public key in OpenSSH format.
     **/
    public enum KeyType {
        Pub("PUB"),
        ;

        private final String value;
        private static java.util.Map<String, KeyType> map;

        static {
            map = new java.util.HashMap<>();
            for (KeyType v : KeyType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid KeyType: " + key);
        }
    };
    /**
     * The type of the key used to connect to the session. PUB is a standard public key in OpenSSH format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyType")
    private final KeyType keyType;

    /**
     * The type of the key used to connect to the session. PUB is a standard public key in OpenSSH format.
     * @return the value
     **/
    public KeyType getKeyType() {
        return keyType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("keyDetails")
    private final PublicKeyDetails keyDetails;

    public PublicKeyDetails getKeyDetails() {
        return keyDetails;
    }

    /**
     * The amount of time the session can remain active.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionTtlInSeconds")
    private final Integer sessionTtlInSeconds;

    /**
     * The amount of time the session can remain active.
     * @return the value
     **/
    public Integer getSessionTtlInSeconds() {
        return sessionTtlInSeconds;
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
        sb.append("CreateSessionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", bastionId=").append(String.valueOf(this.bastionId));
        sb.append(", targetResourceDetails=").append(String.valueOf(this.targetResourceDetails));
        sb.append(", keyType=").append(String.valueOf(this.keyType));
        sb.append(", keyDetails=").append(String.valueOf(this.keyDetails));
        sb.append(", sessionTtlInSeconds=").append(String.valueOf(this.sessionTtlInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSessionDetails)) {
            return false;
        }

        CreateSessionDetails other = (CreateSessionDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.bastionId, other.bastionId)
                && java.util.Objects.equals(this.targetResourceDetails, other.targetResourceDetails)
                && java.util.Objects.equals(this.keyType, other.keyType)
                && java.util.Objects.equals(this.keyDetails, other.keyDetails)
                && java.util.Objects.equals(this.sessionTtlInSeconds, other.sessionTtlInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.bastionId == null ? 43 : this.bastionId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceDetails == null
                                ? 43
                                : this.targetResourceDetails.hashCode());
        result = (result * PRIME) + (this.keyType == null ? 43 : this.keyType.hashCode());
        result = (result * PRIME) + (this.keyDetails == null ? 43 : this.keyDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionTtlInSeconds == null
                                ? 43
                                : this.sessionTtlInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
