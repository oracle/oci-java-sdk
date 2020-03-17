/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming.model;

/**
 * Object used to create a group cursor.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateGroupCursorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateGroupCursorDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("time")
        private java.util.Date time;

        public Builder time(java.util.Date time) {
            this.time = time;
            this.__explicitlySet__.add("time");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupName")
        private String groupName;

        public Builder groupName(String groupName) {
            this.groupName = groupName;
            this.__explicitlySet__.add("groupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
        private String instanceName;

        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            this.__explicitlySet__.add("instanceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMs")
        private Integer timeoutInMs;

        public Builder timeoutInMs(Integer timeoutInMs) {
            this.timeoutInMs = timeoutInMs;
            this.__explicitlySet__.add("timeoutInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commitOnGet")
        private Boolean commitOnGet;

        public Builder commitOnGet(Boolean commitOnGet) {
            this.commitOnGet = commitOnGet;
            this.__explicitlySet__.add("commitOnGet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateGroupCursorDetails build() {
            CreateGroupCursorDetails __instance__ =
                    new CreateGroupCursorDetails(
                            type, time, groupName, instanceName, timeoutInMs, commitOnGet);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGroupCursorDetails o) {
            Builder copiedBuilder =
                    type(o.getType())
                            .time(o.getTime())
                            .groupName(o.getGroupName())
                            .instanceName(o.getInstanceName())
                            .timeoutInMs(o.getTimeoutInMs())
                            .commitOnGet(o.getCommitOnGet());

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
     * The type of the cursor. This value is only used when the group is created.
     **/
    public enum Type {
        AtTime("AT_TIME"),
        Latest("LATEST"),
        TrimHorizon("TRIM_HORIZON"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /**
     * The type of the cursor. This value is only used when the group is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    /**
     * The time to consume from if type is AT_TIME.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    java.util.Date time;

    /**
     * Name of the consumer group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    String groupName;

    /**
     * A unique identifier for the instance joining the consumer group. If an instanceName is not provided, a UUID will be generated and used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    String instanceName;

    /**
     * The amount of a consumer instance inactivity time, before partition reservations are released.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMs")
    Integer timeoutInMs;

    /**
     * When using consumer-groups, the default commit-on-get behaviour can be overriden by setting this value to false.
     * If disabled, a consumer must manually commit their cursors.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitOnGet")
    Boolean commitOnGet;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
