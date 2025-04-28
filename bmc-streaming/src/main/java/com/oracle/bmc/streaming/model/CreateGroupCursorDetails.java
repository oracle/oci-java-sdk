/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * Object used to create a group cursor. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateGroupCursorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateGroupCursorDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "type",
        "time",
        "groupName",
        "instanceName",
        "timeoutInMs",
        "commitOnGet"
    })
    public CreateGroupCursorDetails(
            Type type,
            java.util.Date time,
            String groupName,
            String instanceName,
            Integer timeoutInMs,
            Boolean commitOnGet) {
        super();
        this.type = type;
        this.time = time;
        this.groupName = groupName;
        this.instanceName = instanceName;
        this.timeoutInMs = timeoutInMs;
        this.commitOnGet = commitOnGet;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of the cursor. This value is only used when the group is created. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of the cursor. This value is only used when the group is created.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The time to consume from if type is AT_TIME. */
        @com.fasterxml.jackson.annotation.JsonProperty("time")
        private java.util.Date time;

        /**
         * The time to consume from if type is AT_TIME.
         *
         * @param time the value to set
         * @return this builder
         */
        public Builder time(java.util.Date time) {
            this.time = time;
            this.__explicitlySet__.add("time");
            return this;
        }
        /** Name of the consumer group. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupName")
        private String groupName;

        /**
         * Name of the consumer group.
         *
         * @param groupName the value to set
         * @return this builder
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            this.__explicitlySet__.add("groupName");
            return this;
        }
        /**
         * A unique identifier for the instance joining the consumer group. If an instanceName is
         * not provided, a UUID will be generated and used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
        private String instanceName;

        /**
         * A unique identifier for the instance joining the consumer group. If an instanceName is
         * not provided, a UUID will be generated and used.
         *
         * @param instanceName the value to set
         * @return this builder
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            this.__explicitlySet__.add("instanceName");
            return this;
        }
        /**
         * The amount of a consumer instance inactivity time, before partition reservations are
         * released.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMs")
        private Integer timeoutInMs;

        /**
         * The amount of a consumer instance inactivity time, before partition reservations are
         * released.
         *
         * @param timeoutInMs the value to set
         * @return this builder
         */
        public Builder timeoutInMs(Integer timeoutInMs) {
            this.timeoutInMs = timeoutInMs;
            this.__explicitlySet__.add("timeoutInMs");
            return this;
        }
        /**
         * When using consumer-groups, the default commit-on-get behaviour can be overriden by
         * setting this value to false. If disabled, a consumer must manually commit their cursors.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("commitOnGet")
        private Boolean commitOnGet;

        /**
         * When using consumer-groups, the default commit-on-get behaviour can be overriden by
         * setting this value to false. If disabled, a consumer must manually commit their cursors.
         *
         * @param commitOnGet the value to set
         * @return this builder
         */
        public Builder commitOnGet(Boolean commitOnGet) {
            this.commitOnGet = commitOnGet;
            this.__explicitlySet__.add("commitOnGet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateGroupCursorDetails build() {
            CreateGroupCursorDetails model =
                    new CreateGroupCursorDetails(
                            this.type,
                            this.time,
                            this.groupName,
                            this.instanceName,
                            this.timeoutInMs,
                            this.commitOnGet);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGroupCursorDetails model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("time")) {
                this.time(model.getTime());
            }
            if (model.wasPropertyExplicitlySet("groupName")) {
                this.groupName(model.getGroupName());
            }
            if (model.wasPropertyExplicitlySet("instanceName")) {
                this.instanceName(model.getInstanceName());
            }
            if (model.wasPropertyExplicitlySet("timeoutInMs")) {
                this.timeoutInMs(model.getTimeoutInMs());
            }
            if (model.wasPropertyExplicitlySet("commitOnGet")) {
                this.commitOnGet(model.getCommitOnGet());
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

    /** The type of the cursor. This value is only used when the group is created. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
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
    /** The type of the cursor. This value is only used when the group is created. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of the cursor. This value is only used when the group is created.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** The time to consume from if type is AT_TIME. */
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    private final java.util.Date time;

    /**
     * The time to consume from if type is AT_TIME.
     *
     * @return the value
     */
    public java.util.Date getTime() {
        return time;
    }

    /** Name of the consumer group. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    private final String groupName;

    /**
     * Name of the consumer group.
     *
     * @return the value
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * A unique identifier for the instance joining the consumer group. If an instanceName is not
     * provided, a UUID will be generated and used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    private final String instanceName;

    /**
     * A unique identifier for the instance joining the consumer group. If an instanceName is not
     * provided, a UUID will be generated and used.
     *
     * @return the value
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * The amount of a consumer instance inactivity time, before partition reservations are
     * released.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMs")
    private final Integer timeoutInMs;

    /**
     * The amount of a consumer instance inactivity time, before partition reservations are
     * released.
     *
     * @return the value
     */
    public Integer getTimeoutInMs() {
        return timeoutInMs;
    }

    /**
     * When using consumer-groups, the default commit-on-get behaviour can be overriden by setting
     * this value to false. If disabled, a consumer must manually commit their cursors.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commitOnGet")
    private final Boolean commitOnGet;

    /**
     * When using consumer-groups, the default commit-on-get behaviour can be overriden by setting
     * this value to false. If disabled, a consumer must manually commit their cursors.
     *
     * @return the value
     */
    public Boolean getCommitOnGet() {
        return commitOnGet;
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
        sb.append("CreateGroupCursorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", time=").append(String.valueOf(this.time));
        sb.append(", groupName=").append(String.valueOf(this.groupName));
        sb.append(", instanceName=").append(String.valueOf(this.instanceName));
        sb.append(", timeoutInMs=").append(String.valueOf(this.timeoutInMs));
        sb.append(", commitOnGet=").append(String.valueOf(this.commitOnGet));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateGroupCursorDetails)) {
            return false;
        }

        CreateGroupCursorDetails other = (CreateGroupCursorDetails) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.time, other.time)
                && java.util.Objects.equals(this.groupName, other.groupName)
                && java.util.Objects.equals(this.instanceName, other.instanceName)
                && java.util.Objects.equals(this.timeoutInMs, other.timeoutInMs)
                && java.util.Objects.equals(this.commitOnGet, other.commitOnGet)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.time == null ? 43 : this.time.hashCode());
        result = (result * PRIME) + (this.groupName == null ? 43 : this.groupName.hashCode());
        result = (result * PRIME) + (this.instanceName == null ? 43 : this.instanceName.hashCode());
        result = (result * PRIME) + (this.timeoutInMs == null ? 43 : this.timeoutInMs.hashCode());
        result = (result * PRIME) + (this.commitOnGet == null ? 43 : this.commitOnGet.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
