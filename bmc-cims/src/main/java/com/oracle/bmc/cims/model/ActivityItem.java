/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details of Activity Item
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ActivityItem.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ActivityItem extends Item {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("itemKey")
        private String itemKey;

        public Builder itemKey(String itemKey) {
            this.itemKey = itemKey;
            this.__explicitlySet__.add("itemKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private Category category;

        public Builder category(Category category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subCategory")
        private SubCategory subCategory;

        public Builder subCategory(SubCategory subCategory) {
            this.subCategory = subCategory;
            this.__explicitlySet__.add("subCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("issueType")
        private IssueType issueType;

        public Builder issueType(IssueType issueType) {
            this.issueType = issueType;
            this.__explicitlySet__.add("issueType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("comments")
        private String comments;

        public Builder comments(String comments) {
            this.comments = comments;
            this.__explicitlySet__.add("comments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private Integer timeCreated;

        public Builder timeCreated(Integer timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private Integer timeUpdated;

        public Builder timeUpdated(Integer timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("activityType")
        private ActivityType activityType;

        public Builder activityType(ActivityType activityType) {
            this.activityType = activityType;
            this.__explicitlySet__.add("activityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("activityAuthor")
        private ActivityAuthor activityAuthor;

        public Builder activityAuthor(ActivityAuthor activityAuthor) {
            this.activityAuthor = activityAuthor;
            this.__explicitlySet__.add("activityAuthor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivityItem build() {
            ActivityItem __instance__ =
                    new ActivityItem(
                            itemKey,
                            name,
                            category,
                            subCategory,
                            issueType,
                            comments,
                            timeCreated,
                            timeUpdated,
                            activityType,
                            activityAuthor);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivityItem o) {
            Builder copiedBuilder =
                    itemKey(o.getItemKey())
                            .name(o.getName())
                            .category(o.getCategory())
                            .subCategory(o.getSubCategory())
                            .issueType(o.getIssueType())
                            .comments(o.getComments())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .activityType(o.getActivityType())
                            .activityAuthor(o.getActivityAuthor());

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

    @Deprecated
    public ActivityItem(
            String itemKey,
            String name,
            Category category,
            SubCategory subCategory,
            IssueType issueType,
            String comments,
            Integer timeCreated,
            Integer timeUpdated,
            ActivityType activityType,
            ActivityAuthor activityAuthor) {
        super(itemKey, name, category, subCategory, issueType);
        this.comments = comments;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.activityType = activityType;
        this.activityAuthor = activityAuthor;
    }

    /**
     * Comments to update as part of Activity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("comments")
    String comments;

    /**
     * Epoch time when activity was created
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    Integer timeCreated;

    /**
     * Epoch time when activity was updated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    Integer timeUpdated;
    /**
     * Type of activity. eg: NOTES, UPDATE
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ActivityType {
        Notes("NOTES"),
        ProblemDescription("PROBLEM_DESCRIPTION"),
        Update("UPDATE"),
        Close("CLOSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ActivityType> map;

        static {
            map = new java.util.HashMap<>();
            for (ActivityType v : ActivityType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ActivityType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ActivityType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ActivityType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of activity. eg: NOTES, UPDATE
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activityType")
    ActivityType activityType;
    /**
     * Person who updates the activity
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ActivityAuthor {
        Customer("CUSTOMER"),
        Oracle("ORACLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ActivityAuthor> map;

        static {
            map = new java.util.HashMap<>();
            for (ActivityAuthor v : ActivityAuthor.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ActivityAuthor(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ActivityAuthor create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ActivityAuthor', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Person who updates the activity
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("activityAuthor")
    ActivityAuthor activityAuthor;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
