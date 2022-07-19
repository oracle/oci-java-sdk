/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * A summary of what the OCI included search does.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogIncludedSearchSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogIncludedSearchSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "displayName", "timeCreated", "timeLastModified"})
    public LogIncludedSearchSummary(
            String id,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeLastModified) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeLastModified = timeLastModified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The user-friendly display name. This must be unique within the enclosing resource,
         * and it's changeable. Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly display name. This must be unique within the enclosing resource,
         * and it's changeable. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Time the resource was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time the resource was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Time the resource was last modified.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
        private java.util.Date timeLastModified;

        /**
         * Time the resource was last modified.
         * @param timeLastModified the value to set
         * @return this builder
         **/
        public Builder timeLastModified(java.util.Date timeLastModified) {
            this.timeLastModified = timeLastModified;
            this.__explicitlySet__.add("timeLastModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogIncludedSearchSummary build() {
            LogIncludedSearchSummary __instance__ =
                    new LogIncludedSearchSummary(id, displayName, timeCreated, timeLastModified);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogIncludedSearchSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .timeCreated(o.getTimeCreated())
                            .timeLastModified(o.getTimeLastModified());

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
     * The OCID of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The user-friendly display name. This must be unique within the enclosing resource,
     * and it's changeable. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly display name. This must be unique within the enclosing resource,
     * and it's changeable. Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Time the resource was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time the resource was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time the resource was last modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    private final java.util.Date timeLastModified;

    /**
     * Time the resource was last modified.
     * @return the value
     **/
    public java.util.Date getTimeLastModified() {
        return timeLastModified;
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
        sb.append("LogIncludedSearchSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastModified=").append(String.valueOf(this.timeLastModified));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogIncludedSearchSummary)) {
            return false;
        }

        LogIncludedSearchSummary other = (LogIncludedSearchSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastModified, other.timeLastModified)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastModified == null ? 43 : this.timeLastModified.hashCode());
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
