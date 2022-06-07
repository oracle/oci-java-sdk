/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized,
 * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
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
    builder = ObjectLifecycleRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ObjectLifecycleRule {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "target",
        "action",
        "timeAmount",
        "timeUnit",
        "isEnabled",
        "objectNameFilter"
    })
    public ObjectLifecycleRule(
            String name,
            String target,
            String action,
            Long timeAmount,
            TimeUnit timeUnit,
            Boolean isEnabled,
            ObjectNameFilter objectNameFilter) {
        super();
        this.name = name;
        this.target = target;
        this.action = action;
        this.timeAmount = timeAmount;
        this.timeUnit = timeUnit;
        this.isEnabled = isEnabled;
        this.objectNameFilter = objectNameFilter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private String target;

        public Builder target(String target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAmount")
        private Long timeAmount;

        public Builder timeAmount(Long timeAmount) {
            this.timeAmount = timeAmount;
            this.__explicitlySet__.add("timeAmount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUnit")
        private TimeUnit timeUnit;

        public Builder timeUnit(TimeUnit timeUnit) {
            this.timeUnit = timeUnit;
            this.__explicitlySet__.add("timeUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectNameFilter")
        private ObjectNameFilter objectNameFilter;

        public Builder objectNameFilter(ObjectNameFilter objectNameFilter) {
            this.objectNameFilter = objectNameFilter;
            this.__explicitlySet__.add("objectNameFilter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectLifecycleRule build() {
            ObjectLifecycleRule __instance__ =
                    new ObjectLifecycleRule(
                            name,
                            target,
                            action,
                            timeAmount,
                            timeUnit,
                            isEnabled,
                            objectNameFilter);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectLifecycleRule o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .target(o.getTarget())
                            .action(o.getAction())
                            .timeAmount(o.getTimeAmount())
                            .timeUnit(o.getTimeUnit())
                            .isEnabled(o.getIsEnabled())
                            .objectNameFilter(o.getObjectNameFilter());

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
     * The name of the lifecycle rule to be applied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The target of the object lifecycle policy rule. The values of target can be either "objects",
     * "multipart-uploads" or "previous-object-versions".
     * This field when declared as "objects" is used to specify ARCHIVE, INFREQUENT_ACCESS
     * or DELETE rule for objects.
     * This field when declared as "previous-object-versions" is used to specify ARCHIVE,
     * INFREQUENT_ACCESS or DELETE rule for previous versions of existing objects.
     * This field when declared as "multipart-uploads" is used to specify the ABORT (only) rule for
     * uncommitted multipart-uploads.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final String target;

    public String getTarget() {
        return target;
    }

    /**
     * The action of the object lifecycle policy rule.
     * Rules using the action 'ARCHIVE' move objects from Standard and InfrequentAccess storage tiers
     * into the [Archive storage tier](https://docs.cloud.oracle.com/Content/Archive/Concepts/archivestorageoverview.htm).
     * Rules using the action 'INFREQUENT_ACCESS' move objects from Standard storage tier into the
     * Infrequent Access Storage tier. Objects that are already in InfrequentAccess tier or in Archive
     * tier are left untouched.
     * Rules using the action 'DELETE' permanently delete objects from buckets.
     * Rules using 'ABORT' abort the uncommitted multipart-uploads and permanently delete their parts from buckets.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    public String getAction() {
        return action;
    }

    /**
     * Specifies the age of objects to apply the rule to. The timeAmount is interpreted in units defined by the
     * timeUnit parameter, and is calculated in relation to each object's Last-Modified time.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAmount")
    private final Long timeAmount;

    public Long getTimeAmount() {
        return timeAmount;
    }

    /**
     * The unit that should be used to interpret timeAmount.  Days are defined as starting and ending at midnight UTC.
     * Years are defined as 365.2425 days long and likewise round up to the next midnight UTC.
     *
     **/
    public enum TimeUnit {
        Days("DAYS"),
        Years("YEARS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TimeUnit.class);

        private final String value;
        private static java.util.Map<String, TimeUnit> map;

        static {
            map = new java.util.HashMap<>();
            for (TimeUnit v : TimeUnit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TimeUnit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TimeUnit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TimeUnit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The unit that should be used to interpret timeAmount.  Days are defined as starting and ending at midnight UTC.
     * Years are defined as 365.2425 days long and likewise round up to the next midnight UTC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUnit")
    private final TimeUnit timeUnit;

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * A Boolean that determines whether this rule is currently enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("objectNameFilter")
    private final ObjectNameFilter objectNameFilter;

    public ObjectNameFilter getObjectNameFilter() {
        return objectNameFilter;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ObjectLifecycleRule(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", target=").append(String.valueOf(this.target));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", timeAmount=").append(String.valueOf(this.timeAmount));
        sb.append(", timeUnit=").append(String.valueOf(this.timeUnit));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", objectNameFilter=").append(String.valueOf(this.objectNameFilter));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectLifecycleRule)) {
            return false;
        }

        ObjectLifecycleRule other = (ObjectLifecycleRule) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.timeAmount, other.timeAmount)
                && java.util.Objects.equals(this.timeUnit, other.timeUnit)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.objectNameFilter, other.objectNameFilter)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.timeAmount == null ? 43 : this.timeAmount.hashCode());
        result = (result * PRIME) + (this.timeUnit == null ? 43 : this.timeUnit.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.objectNameFilter == null ? 43 : this.objectNameFilter.hashCode());
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
