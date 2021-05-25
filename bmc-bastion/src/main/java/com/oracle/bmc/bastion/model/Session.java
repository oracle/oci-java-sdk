/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.model;

/**
 * A bastion session resource. A bastion session lets authorized users connect to a target resource using a Secure Shell (SSH) for a predetermined amount of time.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Session.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Session {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bastionId")
        private String bastionId;

        public Builder bastionId(String bastionId) {
            this.bastionId = bastionId;
            this.__explicitlySet__.add("bastionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bastionName")
        private String bastionName;

        public Builder bastionName(String bastionName) {
            this.bastionName = bastionName;
            this.__explicitlySet__.add("bastionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bastionUserName")
        private String bastionUserName;

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

        @com.fasterxml.jackson.annotation.JsonProperty("sshMetadata")
        private java.util.Map<String, String> sshMetadata;

        public Builder sshMetadata(java.util.Map<String, String> sshMetadata) {
            this.sshMetadata = sshMetadata;
            this.__explicitlySet__.add("sshMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyType")
        private KeyType keyType;

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

        @com.fasterxml.jackson.annotation.JsonProperty("bastionPublicHostKeyInfo")
        private String bastionPublicHostKeyInfo;

        public Builder bastionPublicHostKeyInfo(String bastionPublicHostKeyInfo) {
            this.bastionPublicHostKeyInfo = bastionPublicHostKeyInfo;
            this.__explicitlySet__.add("bastionPublicHostKeyInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SessionLifecycleState lifecycleState;

        public Builder lifecycleState(SessionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionTtlInSeconds")
        private Integer sessionTtlInSeconds;

        public Builder sessionTtlInSeconds(Integer sessionTtlInSeconds) {
            this.sessionTtlInSeconds = sessionTtlInSeconds;
            this.__explicitlySet__.add("sessionTtlInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Session build() {
            Session __instance__ =
                    new Session(
                            id,
                            displayName,
                            bastionId,
                            bastionName,
                            bastionUserName,
                            targetResourceDetails,
                            sshMetadata,
                            keyType,
                            keyDetails,
                            bastionPublicHostKeyInfo,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            sessionTtlInSeconds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Session o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .bastionId(o.getBastionId())
                            .bastionName(o.getBastionName())
                            .bastionUserName(o.getBastionUserName())
                            .targetResourceDetails(o.getTargetResourceDetails())
                            .sshMetadata(o.getSshMetadata())
                            .keyType(o.getKeyType())
                            .keyDetails(o.getKeyDetails())
                            .bastionPublicHostKeyInfo(o.getBastionPublicHostKeyInfo())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .sessionTtlInSeconds(o.getSessionTtlInSeconds());

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

    /**
     * The unique identifier (OCID) of the session, which can't be changed after creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The name of the session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The unique identifier (OCID) of the bastion that is hosting this session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bastionId")
    String bastionId;

    /**
     * The name of the bastion that is hosting this session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bastionName")
    String bastionName;

    /**
     * The username that the session uses to connect to the target resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bastionUserName")
    String bastionUserName;

    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceDetails")
    TargetResourceDetails targetResourceDetails;

    /**
     * The connection message for the session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshMetadata")
    java.util.Map<String, String> sshMetadata;
    /**
     * The type of the key used to connect to the session. PUB is a standard public key in OpenSSH format.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum KeyType {
        Pub("PUB"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The type of the key used to connect to the session. PUB is a standard public key in OpenSSH format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyType")
    KeyType keyType;

    @com.fasterxml.jackson.annotation.JsonProperty("keyDetails")
    PublicKeyDetails keyDetails;

    /**
     * The public key of the bastion host. You can use this to verify that you're connecting to the correct bastion.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bastionPublicHostKeyInfo")
    String bastionPublicHostKeyInfo;

    /**
     * The time the session was created. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: `2020-01-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the session was updated. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: `2020-01-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The current state of the session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    SessionLifecycleState lifecycleState;

    /**
     * A message describing the current session state in more detail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The amount of time the session can remain active.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionTtlInSeconds")
    Integer sessionTtlInSeconds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
