/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.email.model;

/**
 * The full information representing an email suppression.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Suppression.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Suppression {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
        private String emailAddress;

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            this.__explicitlySet__.add("emailAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reason")
        private Reason reason;

        public Builder reason(Reason reason) {
            this.reason = reason;
            this.__explicitlySet__.add("reason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Suppression build() {
            Suppression __instance__ = new Suppression(emailAddress, id, reason, timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Suppression o) {
            Builder copiedBuilder =
                    emailAddress(o.getEmailAddress())
                            .id(o.getId())
                            .reason(o.getReason())
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

    /**
     * Email address of the suppression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
    String emailAddress;

    /**
     * The unique ID of the suppression.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The reason that the email address was suppressed. For more information on the types of bounces, see [Suppresion List](https://docs.us-phoenix-1.oraclecloud.com/Content/Email/Concepts/emaildeliveryoverview.htm#suppressionlist).
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Reason {
        Unknown("UNKNOWN"),
        Hardbounce("HARDBOUNCE"),
        Complaint("COMPLAINT"),
        Manual("MANUAL"),
        Softbounce("SOFTBOUNCE"),
        Unsubscribe("UNSUBSCRIBE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Reason> map;

        static {
            map = new java.util.HashMap<>();
            for (Reason v : Reason.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Reason(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Reason create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Reason', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The reason that the email address was suppressed. For more information on the types of bounces, see [Suppresion List](https://docs.us-phoenix-1.oraclecloud.com/Content/Email/Concepts/emaildeliveryoverview.htm#suppressionlist).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    Reason reason;

    /**
     * The date and time the approved sender was added in \"YYYY-MM-ddThh:mmZ\"
     * format with a Z offset, as defined by RFC 3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
