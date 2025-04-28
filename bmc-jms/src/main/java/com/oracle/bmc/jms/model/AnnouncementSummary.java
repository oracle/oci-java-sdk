/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * An summary of a announcement on Console Overview page <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AnnouncementSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AnnouncementSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "summary", "url", "timeReleased"})
    public AnnouncementSummary(
            Integer key, String summary, String url, java.util.Date timeReleased) {
        super();
        this.key = key;
        this.summary = summary;
        this.url = url;
        this.timeReleased = timeReleased;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique id of the announcement */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private Integer key;

        /**
         * Unique id of the announcement
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(Integer key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** Summary text of the announcement */
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        /**
         * Summary text of the announcement
         *
         * @param summary the value to set
         * @return this builder
         */
        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }
        /** URL to the announcement web page */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * URL to the announcement web page
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /** Date time on which the announcement was released */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * Date time on which the announcement was released
         *
         * @param timeReleased the value to set
         * @return this builder
         */
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnnouncementSummary build() {
            AnnouncementSummary model =
                    new AnnouncementSummary(this.key, this.summary, this.url, this.timeReleased);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnnouncementSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
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

    /** Unique id of the announcement */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final Integer key;

    /**
     * Unique id of the announcement
     *
     * @return the value
     */
    public Integer getKey() {
        return key;
    }

    /** Summary text of the announcement */
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final String summary;

    /**
     * Summary text of the announcement
     *
     * @return the value
     */
    public String getSummary() {
        return summary;
    }

    /** URL to the announcement web page */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * URL to the announcement web page
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /** Date time on which the announcement was released */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * Date time on which the announcement was released
     *
     * @return the value
     */
    public java.util.Date getTimeReleased() {
        return timeReleased;
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
        sb.append("AnnouncementSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnnouncementSummary)) {
            return false;
        }

        AnnouncementSummary other = (AnnouncementSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
