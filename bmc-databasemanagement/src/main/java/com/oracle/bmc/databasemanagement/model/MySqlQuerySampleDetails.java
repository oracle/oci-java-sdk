/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of a query sample including the query text, execution time and other details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MySqlQuerySampleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlQuerySampleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "querySampleText",
        "timeQuerySampleSeen",
        "executionTime",
        "threadId",
        "user",
        "host",
        "mysqlInstance"
    })
    public MySqlQuerySampleDetails(
            String querySampleText,
            java.util.Date timeQuerySampleSeen,
            Long executionTime,
            Integer threadId,
            String user,
            String host,
            String mysqlInstance) {
        super();
        this.querySampleText = querySampleText;
        this.timeQuerySampleSeen = timeQuerySampleSeen;
        this.executionTime = executionTime;
        this.threadId = threadId;
        this.user = user;
        this.host = host;
        this.mysqlInstance = mysqlInstance;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The query sample mapped by MySQL to a given normalized query. */
        @com.fasterxml.jackson.annotation.JsonProperty("querySampleText")
        private String querySampleText;

        /**
         * The query sample mapped by MySQL to a given normalized query.
         *
         * @param querySampleText the value to set
         * @return this builder
         */
        public Builder querySampleText(String querySampleText) {
            this.querySampleText = querySampleText;
            this.__explicitlySet__.add("querySampleText");
            return this;
        }
        /** The date and time the query sample was last seen. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeQuerySampleSeen")
        private java.util.Date timeQuerySampleSeen;

        /**
         * The date and time the query sample was last seen.
         *
         * @param timeQuerySampleSeen the value to set
         * @return this builder
         */
        public Builder timeQuerySampleSeen(java.util.Date timeQuerySampleSeen) {
            this.timeQuerySampleSeen = timeQuerySampleSeen;
            this.__explicitlySet__.add("timeQuerySampleSeen");
            return this;
        }
        /** The total amount of time that has been spent executing the query sample. */
        @com.fasterxml.jackson.annotation.JsonProperty("executionTime")
        private Long executionTime;

        /**
         * The total amount of time that has been spent executing the query sample.
         *
         * @param executionTime the value to set
         * @return this builder
         */
        public Builder executionTime(Long executionTime) {
            this.executionTime = executionTime;
            this.__explicitlySet__.add("executionTime");
            return this;
        }
        /** The thread id of the connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("threadId")
        private Integer threadId;

        /**
         * The thread id of the connection.
         *
         * @param threadId the value to set
         * @return this builder
         */
        public Builder threadId(Integer threadId) {
            this.threadId = threadId;
            this.__explicitlySet__.add("threadId");
            return this;
        }
        /** The user who ran the query sample. */
        @com.fasterxml.jackson.annotation.JsonProperty("user")
        private String user;

        /**
         * The user who ran the query sample.
         *
         * @param user the value to set
         * @return this builder
         */
        public Builder user(String user) {
            this.user = user;
            this.__explicitlySet__.add("user");
            return this;
        }
        /** The host from which the query sample was run. */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The host from which the query sample was run.
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** The MySQL instance against which the query sample was run. */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlInstance")
        private String mysqlInstance;

        /**
         * The MySQL instance against which the query sample was run.
         *
         * @param mysqlInstance the value to set
         * @return this builder
         */
        public Builder mysqlInstance(String mysqlInstance) {
            this.mysqlInstance = mysqlInstance;
            this.__explicitlySet__.add("mysqlInstance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlQuerySampleDetails build() {
            MySqlQuerySampleDetails model =
                    new MySqlQuerySampleDetails(
                            this.querySampleText,
                            this.timeQuerySampleSeen,
                            this.executionTime,
                            this.threadId,
                            this.user,
                            this.host,
                            this.mysqlInstance);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlQuerySampleDetails model) {
            if (model.wasPropertyExplicitlySet("querySampleText")) {
                this.querySampleText(model.getQuerySampleText());
            }
            if (model.wasPropertyExplicitlySet("timeQuerySampleSeen")) {
                this.timeQuerySampleSeen(model.getTimeQuerySampleSeen());
            }
            if (model.wasPropertyExplicitlySet("executionTime")) {
                this.executionTime(model.getExecutionTime());
            }
            if (model.wasPropertyExplicitlySet("threadId")) {
                this.threadId(model.getThreadId());
            }
            if (model.wasPropertyExplicitlySet("user")) {
                this.user(model.getUser());
            }
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("mysqlInstance")) {
                this.mysqlInstance(model.getMysqlInstance());
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

    /** The query sample mapped by MySQL to a given normalized query. */
    @com.fasterxml.jackson.annotation.JsonProperty("querySampleText")
    private final String querySampleText;

    /**
     * The query sample mapped by MySQL to a given normalized query.
     *
     * @return the value
     */
    public String getQuerySampleText() {
        return querySampleText;
    }

    /** The date and time the query sample was last seen. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeQuerySampleSeen")
    private final java.util.Date timeQuerySampleSeen;

    /**
     * The date and time the query sample was last seen.
     *
     * @return the value
     */
    public java.util.Date getTimeQuerySampleSeen() {
        return timeQuerySampleSeen;
    }

    /** The total amount of time that has been spent executing the query sample. */
    @com.fasterxml.jackson.annotation.JsonProperty("executionTime")
    private final Long executionTime;

    /**
     * The total amount of time that has been spent executing the query sample.
     *
     * @return the value
     */
    public Long getExecutionTime() {
        return executionTime;
    }

    /** The thread id of the connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("threadId")
    private final Integer threadId;

    /**
     * The thread id of the connection.
     *
     * @return the value
     */
    public Integer getThreadId() {
        return threadId;
    }

    /** The user who ran the query sample. */
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    private final String user;

    /**
     * The user who ran the query sample.
     *
     * @return the value
     */
    public String getUser() {
        return user;
    }

    /** The host from which the query sample was run. */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The host from which the query sample was run.
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** The MySQL instance against which the query sample was run. */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlInstance")
    private final String mysqlInstance;

    /**
     * The MySQL instance against which the query sample was run.
     *
     * @return the value
     */
    public String getMysqlInstance() {
        return mysqlInstance;
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
        sb.append("MySqlQuerySampleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("querySampleText=").append(String.valueOf(this.querySampleText));
        sb.append(", timeQuerySampleSeen=").append(String.valueOf(this.timeQuerySampleSeen));
        sb.append(", executionTime=").append(String.valueOf(this.executionTime));
        sb.append(", threadId=").append(String.valueOf(this.threadId));
        sb.append(", user=").append(String.valueOf(this.user));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", mysqlInstance=").append(String.valueOf(this.mysqlInstance));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlQuerySampleDetails)) {
            return false;
        }

        MySqlQuerySampleDetails other = (MySqlQuerySampleDetails) o;
        return java.util.Objects.equals(this.querySampleText, other.querySampleText)
                && java.util.Objects.equals(this.timeQuerySampleSeen, other.timeQuerySampleSeen)
                && java.util.Objects.equals(this.executionTime, other.executionTime)
                && java.util.Objects.equals(this.threadId, other.threadId)
                && java.util.Objects.equals(this.user, other.user)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.mysqlInstance, other.mysqlInstance)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.querySampleText == null ? 43 : this.querySampleText.hashCode());
        result =
                (result * PRIME)
                        + (this.timeQuerySampleSeen == null
                                ? 43
                                : this.timeQuerySampleSeen.hashCode());
        result =
                (result * PRIME)
                        + (this.executionTime == null ? 43 : this.executionTime.hashCode());
        result = (result * PRIME) + (this.threadId == null ? 43 : this.threadId.hashCode());
        result = (result * PRIME) + (this.user == null ? 43 : this.user.hashCode());
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlInstance == null ? 43 : this.mysqlInstance.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
