/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSessionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateSessionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceDetails")
        private CreateSessionTargetResourceDetails targetResourceDetails;

        public Builder targetResourceDetails(
                CreateSessionTargetResourceDetails targetResourceDetails) {
            this.targetResourceDetails = targetResourceDetails;
            this.__explicitlySet__.add("targetResourceDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("sessionTtlInSeconds")
        private Integer sessionTtlInSeconds;

        public Builder sessionTtlInSeconds(Integer sessionTtlInSeconds) {
            this.sessionTtlInSeconds = sessionTtlInSeconds;
            this.__explicitlySet__.add("sessionTtlInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSessionDetails build() {
            CreateSessionDetails __instance__ =
                    new CreateSessionDetails(
                            displayName,
                            bastionId,
                            targetResourceDetails,
                            keyType,
                            keyDetails,
                            sessionTtlInSeconds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSessionDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .bastionId(o.getBastionId())
                            .targetResourceDetails(o.getTargetResourceDetails())
                            .keyType(o.getKeyType())
                            .keyDetails(o.getKeyDetails())
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
     * The name of the session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The unique identifier (OCID) of the bastion on which to create this session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bastionId")
    String bastionId;

    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceDetails")
    CreateSessionTargetResourceDetails targetResourceDetails;
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
    KeyType keyType;

    @com.fasterxml.jackson.annotation.JsonProperty("keyDetails")
    PublicKeyDetails keyDetails;

    /**
     * The amount of time the session can remain active.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionTtlInSeconds")
    Integer sessionTtlInSeconds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
