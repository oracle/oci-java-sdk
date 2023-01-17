/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Job properties that can be updated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateJobDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "scheduleCronExpression",
        "timeScheduleBegin",
        "timeScheduleEnd",
        "connectionKey"
    })
    public UpdateJobDetails(
            String displayName,
            String description,
            String scheduleCronExpression,
            java.util.Date timeScheduleBegin,
            java.util.Date timeScheduleEnd,
            String connectionKey) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.scheduleCronExpression = scheduleCronExpression;
        this.timeScheduleBegin = timeScheduleBegin;
        this.timeScheduleEnd = timeScheduleEnd;
        this.connectionKey = connectionKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
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
         * Detailed description of the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the job.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
         * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleCronExpression")
        private String scheduleCronExpression;

        /**
         * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
         * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
         *
         * @param scheduleCronExpression the value to set
         * @return this builder
         **/
        public Builder scheduleCronExpression(String scheduleCronExpression) {
            this.scheduleCronExpression = scheduleCronExpression;
            this.__explicitlySet__.add("scheduleCronExpression");
            return this;
        }
        /**
         * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleBegin")
        private java.util.Date timeScheduleBegin;

        /**
         * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeScheduleBegin the value to set
         * @return this builder
         **/
        public Builder timeScheduleBegin(java.util.Date timeScheduleBegin) {
            this.timeScheduleBegin = timeScheduleBegin;
            this.__explicitlySet__.add("timeScheduleBegin");
            return this;
        }
        /**
         * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleEnd")
        private java.util.Date timeScheduleEnd;

        /**
         * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeScheduleEnd the value to set
         * @return this builder
         **/
        public Builder timeScheduleEnd(java.util.Date timeScheduleEnd) {
            this.timeScheduleEnd = timeScheduleEnd;
            this.__explicitlySet__.add("timeScheduleEnd");
            return this;
        }
        /**
         * The key of the connection resource that is used for the harvest by this job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
        private String connectionKey;

        /**
         * The key of the connection resource that is used for the harvest by this job.
         * @param connectionKey the value to set
         * @return this builder
         **/
        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            this.__explicitlySet__.add("connectionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateJobDetails build() {
            UpdateJobDetails model =
                    new UpdateJobDetails(
                            this.displayName,
                            this.description,
                            this.scheduleCronExpression,
                            this.timeScheduleBegin,
                            this.timeScheduleEnd,
                            this.connectionKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateJobDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("scheduleCronExpression")) {
                this.scheduleCronExpression(model.getScheduleCronExpression());
            }
            if (model.wasPropertyExplicitlySet("timeScheduleBegin")) {
                this.timeScheduleBegin(model.getTimeScheduleBegin());
            }
            if (model.wasPropertyExplicitlySet("timeScheduleEnd")) {
                this.timeScheduleEnd(model.getTimeScheduleEnd());
            }
            if (model.wasPropertyExplicitlySet("connectionKey")) {
                this.connectionKey(model.getConnectionKey());
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
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Detailed description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the job.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
     * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleCronExpression")
    private final String scheduleCronExpression;

    /**
     * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
     * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
     *
     * @return the value
     **/
    public String getScheduleCronExpression() {
        return scheduleCronExpression;
    }

    /**
     * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleBegin")
    private final java.util.Date timeScheduleBegin;

    /**
     * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeScheduleBegin() {
        return timeScheduleBegin;
    }

    /**
     * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleEnd")
    private final java.util.Date timeScheduleEnd;

    /**
     * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeScheduleEnd() {
        return timeScheduleEnd;
    }

    /**
     * The key of the connection resource that is used for the harvest by this job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
    private final String connectionKey;

    /**
     * The key of the connection resource that is used for the harvest by this job.
     * @return the value
     **/
    public String getConnectionKey() {
        return connectionKey;
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
        sb.append("UpdateJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", scheduleCronExpression=").append(String.valueOf(this.scheduleCronExpression));
        sb.append(", timeScheduleBegin=").append(String.valueOf(this.timeScheduleBegin));
        sb.append(", timeScheduleEnd=").append(String.valueOf(this.timeScheduleEnd));
        sb.append(", connectionKey=").append(String.valueOf(this.connectionKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateJobDetails)) {
            return false;
        }

        UpdateJobDetails other = (UpdateJobDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.scheduleCronExpression, other.scheduleCronExpression)
                && java.util.Objects.equals(this.timeScheduleBegin, other.timeScheduleBegin)
                && java.util.Objects.equals(this.timeScheduleEnd, other.timeScheduleEnd)
                && java.util.Objects.equals(this.connectionKey, other.connectionKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleCronExpression == null
                                ? 43
                                : this.scheduleCronExpression.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduleBegin == null ? 43 : this.timeScheduleBegin.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduleEnd == null ? 43 : this.timeScheduleEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionKey == null ? 43 : this.connectionKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
