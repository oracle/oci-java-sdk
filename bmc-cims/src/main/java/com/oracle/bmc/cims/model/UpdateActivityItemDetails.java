/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details for udpating the support ticket activity.
 *
 * <p>*Caution:** Avoid using any confidential information when you supply string values using the
 * API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateActivityItemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateActivityItemDetails extends UpdateItemDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Comments updated at the time that the activity occurs. */
        @com.fasterxml.jackson.annotation.JsonProperty("comments")
        private String comments;

        /**
         * Comments updated at the time that the activity occurs.
         *
         * @param comments the value to set
         * @return this builder
         */
        public Builder comments(String comments) {
            this.comments = comments;
            this.__explicitlySet__.add("comments");
            return this;
        }
        /** The type of activity occurring. */
        @com.fasterxml.jackson.annotation.JsonProperty("activityType")
        private ActivityType activityType;

        /**
         * The type of activity occurring.
         *
         * @param activityType the value to set
         * @return this builder
         */
        public Builder activityType(ActivityType activityType) {
            this.activityType = activityType;
            this.__explicitlySet__.add("activityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateActivityItemDetails build() {
            UpdateActivityItemDetails model =
                    new UpdateActivityItemDetails(this.comments, this.activityType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateActivityItemDetails model) {
            if (model.wasPropertyExplicitlySet("comments")) {
                this.comments(model.getComments());
            }
            if (model.wasPropertyExplicitlySet("activityType")) {
                this.activityType(model.getActivityType());
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
    public UpdateActivityItemDetails(String comments, ActivityType activityType) {
        super();
        this.comments = comments;
        this.activityType = activityType;
    }

    /** Comments updated at the time that the activity occurs. */
    @com.fasterxml.jackson.annotation.JsonProperty("comments")
    private final String comments;

    /**
     * Comments updated at the time that the activity occurs.
     *
     * @return the value
     */
    public String getComments() {
        return comments;
    }

    /** The type of activity occurring. */
    public enum ActivityType implements com.oracle.bmc.http.internal.BmcEnum {
        Notes("NOTES"),
        ProblemDescription("PROBLEM_DESCRIPTION"),
        Update("UPDATE"),
        Close("CLOSE"),
        ;

        private final String value;
        private static java.util.Map<String, ActivityType> map;

        static {
            map = new java.util.HashMap<>();
            for (ActivityType v : ActivityType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ActivityType: " + key);
        }
    };
    /** The type of activity occurring. */
    @com.fasterxml.jackson.annotation.JsonProperty("activityType")
    private final ActivityType activityType;

    /**
     * The type of activity occurring.
     *
     * @return the value
     */
    public ActivityType getActivityType() {
        return activityType;
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
        sb.append("UpdateActivityItemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", comments=").append(String.valueOf(this.comments));
        sb.append(", activityType=").append(String.valueOf(this.activityType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateActivityItemDetails)) {
            return false;
        }

        UpdateActivityItemDetails other = (UpdateActivityItemDetails) o;
        return java.util.Objects.equals(this.comments, other.comments)
                && java.util.Objects.equals(this.activityType, other.activityType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.comments == null ? 43 : this.comments.hashCode());
        result = (result * PRIME) + (this.activityType == null ? 43 : this.activityType.hashCode());
        return result;
    }
}
