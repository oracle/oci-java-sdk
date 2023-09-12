/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary information of a SQL tuning set. <br>
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
        builder = SqlTuningSetSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlTuningSetSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "owner",
        "description",
        "statementCounts",
        "id",
        "timeCreated",
        "timeLastModified",
        "status",
        "scheduledJobName",
        "errorMessage"
    })
    public SqlTuningSetSummary(
            String name,
            String owner,
            String description,
            Integer statementCounts,
            Integer id,
            java.util.Date timeCreated,
            java.util.Date timeLastModified,
            SqlTuningSetStatusTypes status,
            String scheduledJobName,
            String errorMessage) {
        super();
        this.name = name;
        this.owner = owner;
        this.description = description;
        this.statementCounts = statementCounts;
        this.id = id;
        this.timeCreated = timeCreated;
        this.timeLastModified = timeLastModified;
        this.status = status;
        this.scheduledJobName = scheduledJobName;
        this.errorMessage = errorMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the SQL tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the SQL tuning set.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The owner of the SQL tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * The owner of the SQL tuning set.
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /** The description of the SQL tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the SQL tuning set.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The number of SQL statements in the SQL tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("statementCounts")
        private Integer statementCounts;

        /**
         * The number of SQL statements in the SQL tuning set.
         *
         * @param statementCounts the value to set
         * @return this builder
         */
        public Builder statementCounts(Integer statementCounts) {
            this.statementCounts = statementCounts;
            this.__explicitlySet__.add("statementCounts");
            return this;
        }
        /** The unique Sql tuning set identifier. This is not OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Integer id;

        /**
         * The unique Sql tuning set identifier. This is not OCID.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(Integer id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The created time of the Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The created time of the Sql tuning set.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Last modified time of the Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
        private java.util.Date timeLastModified;

        /**
         * Last modified time of the Sql tuning set.
         *
         * @param timeLastModified the value to set
         * @return this builder
         */
        public Builder timeLastModified(java.util.Date timeLastModified) {
            this.timeLastModified = timeLastModified;
            this.__explicitlySet__.add("timeLastModified");
            return this;
        }
        /** Current status of the Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private SqlTuningSetStatusTypes status;

        /**
         * Current status of the Sql tuning set.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(SqlTuningSetStatusTypes status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Name of the Sql tuning set scheduler job. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobName")
        private String scheduledJobName;

        /**
         * Name of the Sql tuning set scheduler job.
         *
         * @param scheduledJobName the value to set
         * @return this builder
         */
        public Builder scheduledJobName(String scheduledJobName) {
            this.scheduledJobName = scheduledJobName;
            this.__explicitlySet__.add("scheduledJobName");
            return this;
        }
        /** Latest execution error of the plsql that was submitted as a scheduler job. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * Latest execution error of the plsql that was submitted as a scheduler job.
         *
         * @param errorMessage the value to set
         * @return this builder
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningSetSummary build() {
            SqlTuningSetSummary model =
                    new SqlTuningSetSummary(
                            this.name,
                            this.owner,
                            this.description,
                            this.statementCounts,
                            this.id,
                            this.timeCreated,
                            this.timeLastModified,
                            this.status,
                            this.scheduledJobName,
                            this.errorMessage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningSetSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("statementCounts")) {
                this.statementCounts(model.getStatementCounts());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeLastModified")) {
                this.timeLastModified(model.getTimeLastModified());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("scheduledJobName")) {
                this.scheduledJobName(model.getScheduledJobName());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
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

    /** The name of the SQL tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the SQL tuning set.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The owner of the SQL tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * The owner of the SQL tuning set.
     *
     * @return the value
     */
    public String getOwner() {
        return owner;
    }

    /** The description of the SQL tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the SQL tuning set.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The number of SQL statements in the SQL tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("statementCounts")
    private final Integer statementCounts;

    /**
     * The number of SQL statements in the SQL tuning set.
     *
     * @return the value
     */
    public Integer getStatementCounts() {
        return statementCounts;
    }

    /** The unique Sql tuning set identifier. This is not OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final Integer id;

    /**
     * The unique Sql tuning set identifier. This is not OCID.
     *
     * @return the value
     */
    public Integer getId() {
        return id;
    }

    /** The created time of the Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The created time of the Sql tuning set.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Last modified time of the Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    private final java.util.Date timeLastModified;

    /**
     * Last modified time of the Sql tuning set.
     *
     * @return the value
     */
    public java.util.Date getTimeLastModified() {
        return timeLastModified;
    }

    /** Current status of the Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final SqlTuningSetStatusTypes status;

    /**
     * Current status of the Sql tuning set.
     *
     * @return the value
     */
    public SqlTuningSetStatusTypes getStatus() {
        return status;
    }

    /** Name of the Sql tuning set scheduler job. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobName")
    private final String scheduledJobName;

    /**
     * Name of the Sql tuning set scheduler job.
     *
     * @return the value
     */
    public String getScheduledJobName() {
        return scheduledJobName;
    }

    /** Latest execution error of the plsql that was submitted as a scheduler job. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * Latest execution error of the plsql that was submitted as a scheduler job.
     *
     * @return the value
     */
    public String getErrorMessage() {
        return errorMessage;
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
        sb.append("SqlTuningSetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", statementCounts=").append(String.valueOf(this.statementCounts));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastModified=").append(String.valueOf(this.timeLastModified));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", scheduledJobName=").append(String.valueOf(this.scheduledJobName));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningSetSummary)) {
            return false;
        }

        SqlTuningSetSummary other = (SqlTuningSetSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.statementCounts, other.statementCounts)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastModified, other.timeLastModified)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.scheduledJobName, other.scheduledJobName)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.statementCounts == null ? 43 : this.statementCounts.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastModified == null ? 43 : this.timeLastModified.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledJobName == null ? 43 : this.scheduledJobName.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
