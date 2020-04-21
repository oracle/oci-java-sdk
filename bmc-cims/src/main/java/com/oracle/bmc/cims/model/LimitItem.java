/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details of Limit Item
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LimitItem.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class LimitItem extends Item {
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

        @com.fasterxml.jackson.annotation.JsonProperty("currentLimit")
        private Integer currentLimit;

        public Builder currentLimit(Integer currentLimit) {
            this.currentLimit = currentLimit;
            this.__explicitlySet__.add("currentLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentUsage")
        private Integer currentUsage;

        public Builder currentUsage(Integer currentUsage) {
            this.currentUsage = currentUsage;
            this.__explicitlySet__.add("currentUsage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestedLimit")
        private Integer requestedLimit;

        public Builder requestedLimit(Integer requestedLimit) {
            this.requestedLimit = requestedLimit;
            this.__explicitlySet__.add("requestedLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("limitStatus")
        private LimitStatus limitStatus;

        public Builder limitStatus(LimitStatus limitStatus) {
            this.limitStatus = limitStatus;
            this.__explicitlySet__.add("limitStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LimitItem build() {
            LimitItem __instance__ =
                    new LimitItem(
                            itemKey,
                            name,
                            category,
                            subCategory,
                            issueType,
                            currentLimit,
                            currentUsage,
                            requestedLimit,
                            limitStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LimitItem o) {
            Builder copiedBuilder =
                    itemKey(o.getItemKey())
                            .name(o.getName())
                            .category(o.getCategory())
                            .subCategory(o.getSubCategory())
                            .issueType(o.getIssueType())
                            .currentLimit(o.getCurrentLimit())
                            .currentUsage(o.getCurrentUsage())
                            .requestedLimit(o.getRequestedLimit())
                            .limitStatus(o.getLimitStatus());

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
    public LimitItem(
            String itemKey,
            String name,
            Category category,
            SubCategory subCategory,
            IssueType issueType,
            Integer currentLimit,
            Integer currentUsage,
            Integer requestedLimit,
            LimitStatus limitStatus) {
        super(itemKey, name, category, subCategory, issueType);
        this.currentLimit = currentLimit;
        this.currentUsage = currentUsage;
        this.requestedLimit = requestedLimit;
        this.limitStatus = limitStatus;
    }

    /**
     * Current available limit of the resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentLimit")
    Integer currentLimit;

    /**
     * Current used limit of the resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentUsage")
    Integer currentUsage;

    /**
     * Requested limit for the resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestedLimit")
    Integer requestedLimit;
    /**
     * Status of the Limit
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LimitStatus {
        Approved("APPROVED"),
        PartiallyApproved("PARTIALLY_APPROVED"),
        NotApproved("NOT_APPROVED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LimitStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (LimitStatus v : LimitStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LimitStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LimitStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LimitStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the Limit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limitStatus")
    LimitStatus limitStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
