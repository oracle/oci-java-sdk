/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * The summary of a retention rule.
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
    builder = RetentionRuleSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RetentionRuleSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "duration",
        "etag",
        "timeRuleLocked",
        "timeCreated",
        "timeModified"
    })
    public RetentionRuleSummary(
            String id,
            String displayName,
            Duration duration,
            String etag,
            java.util.Date timeRuleLocked,
            java.util.Date timeCreated,
            java.util.Date timeModified) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.duration = duration;
        this.etag = etag;
        this.timeRuleLocked = timeRuleLocked;
        this.timeCreated = timeCreated;
        this.timeModified = timeModified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier for the retention rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for the retention rule.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * User specified name for the retention rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User specified name for the retention rule.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private Duration duration;

        public Builder duration(Duration duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }
        /**
         * The entity tag (ETag) for the retention rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        /**
         * The entity tag (ETag) for the retention rule.
         * @param etag the value to set
         * @return this builder
         **/
        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }
        /**
         * The date and time as per [RFC 3339](https://tools.ietf.org/html/rfc3339) after which this rule becomes locked.
         * and can only be deleted by deleting the bucket.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeRuleLocked")
        private java.util.Date timeRuleLocked;

        /**
         * The date and time as per [RFC 3339](https://tools.ietf.org/html/rfc3339) after which this rule becomes locked.
         * and can only be deleted by deleting the bucket.
         *
         * @param timeRuleLocked the value to set
         * @return this builder
         **/
        public Builder timeRuleLocked(java.util.Date timeRuleLocked) {
            this.timeRuleLocked = timeRuleLocked;
            this.__explicitlySet__.add("timeRuleLocked");
            return this;
        }
        /**
         * The date and time that the retention rule was created as per [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the retention rule was created as per [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time that the retention rule was modified as per [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
        private java.util.Date timeModified;

        /**
         * The date and time that the retention rule was modified as per [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeModified the value to set
         * @return this builder
         **/
        public Builder timeModified(java.util.Date timeModified) {
            this.timeModified = timeModified;
            this.__explicitlySet__.add("timeModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RetentionRuleSummary build() {
            RetentionRuleSummary model =
                    new RetentionRuleSummary(
                            this.id,
                            this.displayName,
                            this.duration,
                            this.etag,
                            this.timeRuleLocked,
                            this.timeCreated,
                            this.timeModified);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RetentionRuleSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("duration")) {
                this.duration(model.getDuration());
            }
            if (model.wasPropertyExplicitlySet("etag")) {
                this.etag(model.getEtag());
            }
            if (model.wasPropertyExplicitlySet("timeRuleLocked")) {
                this.timeRuleLocked(model.getTimeRuleLocked());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeModified")) {
                this.timeModified(model.getTimeModified());
            }
            return this;
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
     * Unique identifier for the retention rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for the retention rule.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * User specified name for the retention rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User specified name for the retention rule.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final Duration duration;

    public Duration getDuration() {
        return duration;
    }

    /**
     * The entity tag (ETag) for the retention rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    private final String etag;

    /**
     * The entity tag (ETag) for the retention rule.
     * @return the value
     **/
    public String getEtag() {
        return etag;
    }

    /**
     * The date and time as per [RFC 3339](https://tools.ietf.org/html/rfc3339) after which this rule becomes locked.
     * and can only be deleted by deleting the bucket.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRuleLocked")
    private final java.util.Date timeRuleLocked;

    /**
     * The date and time as per [RFC 3339](https://tools.ietf.org/html/rfc3339) after which this rule becomes locked.
     * and can only be deleted by deleting the bucket.
     *
     * @return the value
     **/
    public java.util.Date getTimeRuleLocked() {
        return timeRuleLocked;
    }

    /**
     * The date and time that the retention rule was created as per [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the retention rule was created as per [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time that the retention rule was modified as per [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeModified")
    private final java.util.Date timeModified;

    /**
     * The date and time that the retention rule was modified as per [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeModified() {
        return timeModified;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RetentionRuleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(", etag=").append(String.valueOf(this.etag));
        sb.append(", timeRuleLocked=").append(String.valueOf(this.timeRuleLocked));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeModified=").append(String.valueOf(this.timeModified));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RetentionRuleSummary)) {
            return false;
        }

        RetentionRuleSummary other = (RetentionRuleSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.duration, other.duration)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.timeRuleLocked, other.timeRuleLocked)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeModified, other.timeModified)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRuleLocked == null ? 43 : this.timeRuleLocked.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeModified == null ? 43 : this.timeModified.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
