/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the ActivityItem object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ActivityItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ActivityItem extends Item {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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
        /** Identifier of the activity on the support request. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Identifier of the activity on the support request.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Comments or file attachments added with the activity on the support request. */
        @com.fasterxml.jackson.annotation.JsonProperty("comments")
        private String comments;

        /**
         * Comments or file attachments added with the activity on the support request.
         *
         * @param comments the value to set
         * @return this builder
         */
        public Builder comments(String comments) {
            this.comments = comments;
            this.__explicitlySet__.add("comments");
            return this;
        }
        /** The time when the activity was created, in seconds since epoch time. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private Integer timeCreated;

        /**
         * The time when the activity was created, in seconds since epoch time.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(Integer timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time when the activity was updated, in seconds since epoch time. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private Integer timeUpdated;

        /**
         * The time when the activity was updated, in seconds since epoch time.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(Integer timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The type of activity occuring on the support request. */
        @com.fasterxml.jackson.annotation.JsonProperty("activityType")
        private ActivityType activityType;

        /**
         * The type of activity occuring on the support request.
         *
         * @param activityType the value to set
         * @return this builder
         */
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

        @com.fasterxml.jackson.annotation.JsonProperty("itemType")
        private ItemType itemType;

        public Builder itemType(ItemType itemType) {
            this.itemType = itemType;
            this.__explicitlySet__.add("itemType");
            return this;
        }
        /** Who updates the activity on the support request. */
        @com.fasterxml.jackson.annotation.JsonProperty("itemStatus")
        private ItemStatus itemStatus;

        /**
         * Who updates the activity on the support request.
         *
         * @param itemStatus the value to set
         * @return this builder
         */
        public Builder itemStatus(ItemStatus itemStatus) {
            this.itemStatus = itemStatus;
            this.__explicitlySet__.add("itemStatus");
            return this;
        }
        /** attachmentID for the ItemType Attachments only for Alloy realm. */
        @com.fasterxml.jackson.annotation.JsonProperty("attachmentID")
        private String attachmentID;

        /**
         * attachmentID for the ItemType Attachments only for Alloy realm.
         *
         * @param attachmentID the value to set
         * @return this builder
         */
        public Builder attachmentID(String attachmentID) {
            this.attachmentID = attachmentID;
            this.__explicitlySet__.add("attachmentID");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivityItem build() {
            ActivityItem model =
                    new ActivityItem(
                            this.itemKey,
                            this.name,
                            this.category,
                            this.subCategory,
                            this.issueType,
                            this.id,
                            this.comments,
                            this.timeCreated,
                            this.timeUpdated,
                            this.activityType,
                            this.activityAuthor,
                            this.itemType,
                            this.itemStatus,
                            this.attachmentID);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivityItem model) {
            if (model.wasPropertyExplicitlySet("itemKey")) {
                this.itemKey(model.getItemKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("subCategory")) {
                this.subCategory(model.getSubCategory());
            }
            if (model.wasPropertyExplicitlySet("issueType")) {
                this.issueType(model.getIssueType());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("comments")) {
                this.comments(model.getComments());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("activityType")) {
                this.activityType(model.getActivityType());
            }
            if (model.wasPropertyExplicitlySet("activityAuthor")) {
                this.activityAuthor(model.getActivityAuthor());
            }
            if (model.wasPropertyExplicitlySet("itemType")) {
                this.itemType(model.getItemType());
            }
            if (model.wasPropertyExplicitlySet("itemStatus")) {
                this.itemStatus(model.getItemStatus());
            }
            if (model.wasPropertyExplicitlySet("attachmentID")) {
                this.attachmentID(model.getAttachmentID());
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

    @Deprecated
    public ActivityItem(
            String itemKey,
            String name,
            Category category,
            SubCategory subCategory,
            IssueType issueType,
            String id,
            String comments,
            Integer timeCreated,
            Integer timeUpdated,
            ActivityType activityType,
            ActivityAuthor activityAuthor,
            ItemType itemType,
            ItemStatus itemStatus,
            String attachmentID) {
        super(itemKey, name, category, subCategory, issueType);
        this.id = id;
        this.comments = comments;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.activityType = activityType;
        this.activityAuthor = activityAuthor;
        this.itemType = itemType;
        this.itemStatus = itemStatus;
        this.attachmentID = attachmentID;
    }

    /** Identifier of the activity on the support request. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Identifier of the activity on the support request.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Comments or file attachments added with the activity on the support request. */
    @com.fasterxml.jackson.annotation.JsonProperty("comments")
    private final String comments;

    /**
     * Comments or file attachments added with the activity on the support request.
     *
     * @return the value
     */
    public String getComments() {
        return comments;
    }

    /** The time when the activity was created, in seconds since epoch time. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final Integer timeCreated;

    /**
     * The time when the activity was created, in seconds since epoch time.
     *
     * @return the value
     */
    public Integer getTimeCreated() {
        return timeCreated;
    }

    /** The time when the activity was updated, in seconds since epoch time. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final Integer timeUpdated;

    /**
     * The time when the activity was updated, in seconds since epoch time.
     *
     * @return the value
     */
    public Integer getTimeUpdated() {
        return timeUpdated;
    }

    /** The type of activity occuring on the support request. */
    public enum ActivityType implements com.oracle.bmc.http.internal.BmcEnum {
        Notes("NOTES"),
        ProblemDescription("PROBLEM_DESCRIPTION"),
        Update("UPDATE"),
        Close("CLOSE"),
        Reopen("REOPEN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ActivityType.class);

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
    /** The type of activity occuring on the support request. */
    @com.fasterxml.jackson.annotation.JsonProperty("activityType")
    private final ActivityType activityType;

    /**
     * The type of activity occuring on the support request.
     *
     * @return the value
     */
    public ActivityType getActivityType() {
        return activityType;
    }

    /** */
    public enum ActivityAuthor implements com.oracle.bmc.http.internal.BmcEnum {
        Customer("CUSTOMER"),
        Oracle("ORACLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ActivityAuthor.class);

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

    @com.fasterxml.jackson.annotation.JsonProperty("activityAuthor")
    private final ActivityAuthor activityAuthor;

    public ActivityAuthor getActivityAuthor() {
        return activityAuthor;
    }

    /** */
    public enum ItemType implements com.oracle.bmc.http.internal.BmcEnum {
        Attachments("ATTACHMENTS"),
        Comments("COMMENTS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ItemType.class);

        private final String value;
        private static java.util.Map<String, ItemType> map;

        static {
            map = new java.util.HashMap<>();
            for (ItemType v : ItemType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ItemType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ItemType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ItemType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("itemType")
    private final ItemType itemType;

    public ItemType getItemType() {
        return itemType;
    }

    /** Who updates the activity on the support request. */
    public enum ItemStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Processing("PROCESSING"),
        Attached("ATTACHED"),
        Removed("REMOVED"),
        Failed("FAILED"),
        Rejected("REJECTED"),
        Received("RECEIVED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ItemStatus.class);

        private final String value;
        private static java.util.Map<String, ItemStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ItemStatus v : ItemStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ItemStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ItemStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ItemStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Who updates the activity on the support request. */
    @com.fasterxml.jackson.annotation.JsonProperty("itemStatus")
    private final ItemStatus itemStatus;

    /**
     * Who updates the activity on the support request.
     *
     * @return the value
     */
    public ItemStatus getItemStatus() {
        return itemStatus;
    }

    /** attachmentID for the ItemType Attachments only for Alloy realm. */
    @com.fasterxml.jackson.annotation.JsonProperty("attachmentID")
    private final String attachmentID;

    /**
     * attachmentID for the ItemType Attachments only for Alloy realm.
     *
     * @return the value
     */
    public String getAttachmentID() {
        return attachmentID;
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
        sb.append("ActivityItem(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", comments=").append(String.valueOf(this.comments));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", activityType=").append(String.valueOf(this.activityType));
        sb.append(", activityAuthor=").append(String.valueOf(this.activityAuthor));
        sb.append(", itemType=").append(String.valueOf(this.itemType));
        sb.append(", itemStatus=").append(String.valueOf(this.itemStatus));
        sb.append(", attachmentID=").append(String.valueOf(this.attachmentID));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivityItem)) {
            return false;
        }

        ActivityItem other = (ActivityItem) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.comments, other.comments)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.activityType, other.activityType)
                && java.util.Objects.equals(this.activityAuthor, other.activityAuthor)
                && java.util.Objects.equals(this.itemType, other.itemType)
                && java.util.Objects.equals(this.itemStatus, other.itemStatus)
                && java.util.Objects.equals(this.attachmentID, other.attachmentID)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.comments == null ? 43 : this.comments.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.activityType == null ? 43 : this.activityType.hashCode());
        result =
                (result * PRIME)
                        + (this.activityAuthor == null ? 43 : this.activityAuthor.hashCode());
        result = (result * PRIME) + (this.itemType == null ? 43 : this.itemType.hashCode());
        result = (result * PRIME) + (this.itemStatus == null ? 43 : this.itemStatus.hashCode());
        result = (result * PRIME) + (this.attachmentID == null ? 43 : this.attachmentID.hashCode());
        return result;
    }
}
