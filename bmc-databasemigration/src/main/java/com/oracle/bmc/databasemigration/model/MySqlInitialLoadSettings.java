/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Optional dump settings
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MySqlInitialLoadSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MySqlInitialLoadSettings
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isConsistent",
        "isTzUtc",
        "compatibility",
        "primaryKeyCompatibility",
        "isIgnoreExistingObjects",
        "handleGrantErrors",
        "jobMode"
    })
    public MySqlInitialLoadSettings(
            Boolean isConsistent,
            Boolean isTzUtc,
            java.util.List<CompatibilityOption> compatibility,
            PrimaryKeyCompatibility primaryKeyCompatibility,
            Boolean isIgnoreExistingObjects,
            HandleGrantErrors handleGrantErrors,
            JobModeMySql jobMode) {
        super();
        this.isConsistent = isConsistent;
        this.isTzUtc = isTzUtc;
        this.compatibility = compatibility;
        this.primaryKeyCompatibility = primaryKeyCompatibility;
        this.isIgnoreExistingObjects = isIgnoreExistingObjects;
        this.handleGrantErrors = handleGrantErrors;
        this.jobMode = jobMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enable (true) or disable (false) consistent data dumps by locking the instance for backup during the dump.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isConsistent")
        private Boolean isConsistent;

        /**
         * Enable (true) or disable (false) consistent data dumps by locking the instance for backup during the dump.
         *
         * @param isConsistent the value to set
         * @return this builder
         **/
        public Builder isConsistent(Boolean isConsistent) {
            this.isConsistent = isConsistent;
            this.__explicitlySet__.add("isConsistent");
            return this;
        }
        /**
         * Include a statement at the start of the dump to set the time zone to UTC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isTzUtc")
        private Boolean isTzUtc;

        /**
         * Include a statement at the start of the dump to set the time zone to UTC.
         *
         * @param isTzUtc the value to set
         * @return this builder
         **/
        public Builder isTzUtc(Boolean isTzUtc) {
            this.isTzUtc = isTzUtc;
            this.__explicitlySet__.add("isTzUtc");
            return this;
        }
        /**
         * Apply the specified requirements for compatibility with MySQL Database Service for all tables in the dump
         * output, altering the dump files as necessary.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compatibility")
        private java.util.List<CompatibilityOption> compatibility;

        /**
         * Apply the specified requirements for compatibility with MySQL Database Service for all tables in the dump
         * output, altering the dump files as necessary.
         *
         * @param compatibility the value to set
         * @return this builder
         **/
        public Builder compatibility(java.util.List<CompatibilityOption> compatibility) {
            this.compatibility = compatibility;
            this.__explicitlySet__.add("compatibility");
            return this;
        }
        /**
         * Primary key compatibility option
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("primaryKeyCompatibility")
        private PrimaryKeyCompatibility primaryKeyCompatibility;

        /**
         * Primary key compatibility option
         * @param primaryKeyCompatibility the value to set
         * @return this builder
         **/
        public Builder primaryKeyCompatibility(PrimaryKeyCompatibility primaryKeyCompatibility) {
            this.primaryKeyCompatibility = primaryKeyCompatibility;
            this.__explicitlySet__.add("primaryKeyCompatibility");
            return this;
        }
        /**
         * Import the dump even if it contains objects that already exist in the target schema in the MySQL instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreExistingObjects")
        private Boolean isIgnoreExistingObjects;

        /**
         * Import the dump even if it contains objects that already exist in the target schema in the MySQL instance.
         *
         * @param isIgnoreExistingObjects the value to set
         * @return this builder
         **/
        public Builder isIgnoreExistingObjects(Boolean isIgnoreExistingObjects) {
            this.isIgnoreExistingObjects = isIgnoreExistingObjects;
            this.__explicitlySet__.add("isIgnoreExistingObjects");
            return this;
        }
        /**
         * The action taken in the event of errors related to GRANT or REVOKE errors.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("handleGrantErrors")
        private HandleGrantErrors handleGrantErrors;

        /**
         * The action taken in the event of errors related to GRANT or REVOKE errors.
         * @param handleGrantErrors the value to set
         * @return this builder
         **/
        public Builder handleGrantErrors(HandleGrantErrors handleGrantErrors) {
            this.handleGrantErrors = handleGrantErrors;
            this.__explicitlySet__.add("handleGrantErrors");
            return this;
        }
        /**
         * MySql Job Mode
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobMode")
        private JobModeMySql jobMode;

        /**
         * MySql Job Mode
         * @param jobMode the value to set
         * @return this builder
         **/
        public Builder jobMode(JobModeMySql jobMode) {
            this.jobMode = jobMode;
            this.__explicitlySet__.add("jobMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlInitialLoadSettings build() {
            MySqlInitialLoadSettings model =
                    new MySqlInitialLoadSettings(
                            this.isConsistent,
                            this.isTzUtc,
                            this.compatibility,
                            this.primaryKeyCompatibility,
                            this.isIgnoreExistingObjects,
                            this.handleGrantErrors,
                            this.jobMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlInitialLoadSettings model) {
            if (model.wasPropertyExplicitlySet("isConsistent")) {
                this.isConsistent(model.getIsConsistent());
            }
            if (model.wasPropertyExplicitlySet("isTzUtc")) {
                this.isTzUtc(model.getIsTzUtc());
            }
            if (model.wasPropertyExplicitlySet("compatibility")) {
                this.compatibility(model.getCompatibility());
            }
            if (model.wasPropertyExplicitlySet("primaryKeyCompatibility")) {
                this.primaryKeyCompatibility(model.getPrimaryKeyCompatibility());
            }
            if (model.wasPropertyExplicitlySet("isIgnoreExistingObjects")) {
                this.isIgnoreExistingObjects(model.getIsIgnoreExistingObjects());
            }
            if (model.wasPropertyExplicitlySet("handleGrantErrors")) {
                this.handleGrantErrors(model.getHandleGrantErrors());
            }
            if (model.wasPropertyExplicitlySet("jobMode")) {
                this.jobMode(model.getJobMode());
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
     * Enable (true) or disable (false) consistent data dumps by locking the instance for backup during the dump.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isConsistent")
    private final Boolean isConsistent;

    /**
     * Enable (true) or disable (false) consistent data dumps by locking the instance for backup during the dump.
     *
     * @return the value
     **/
    public Boolean getIsConsistent() {
        return isConsistent;
    }

    /**
     * Include a statement at the start of the dump to set the time zone to UTC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTzUtc")
    private final Boolean isTzUtc;

    /**
     * Include a statement at the start of the dump to set the time zone to UTC.
     *
     * @return the value
     **/
    public Boolean getIsTzUtc() {
        return isTzUtc;
    }

    /**
     * Apply the specified requirements for compatibility with MySQL Database Service for all tables in the dump
     * output, altering the dump files as necessary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compatibility")
    private final java.util.List<CompatibilityOption> compatibility;

    /**
     * Apply the specified requirements for compatibility with MySQL Database Service for all tables in the dump
     * output, altering the dump files as necessary.
     *
     * @return the value
     **/
    public java.util.List<CompatibilityOption> getCompatibility() {
        return compatibility;
    }

    /**
     * Primary key compatibility option
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryKeyCompatibility")
    private final PrimaryKeyCompatibility primaryKeyCompatibility;

    /**
     * Primary key compatibility option
     * @return the value
     **/
    public PrimaryKeyCompatibility getPrimaryKeyCompatibility() {
        return primaryKeyCompatibility;
    }

    /**
     * Import the dump even if it contains objects that already exist in the target schema in the MySQL instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreExistingObjects")
    private final Boolean isIgnoreExistingObjects;

    /**
     * Import the dump even if it contains objects that already exist in the target schema in the MySQL instance.
     *
     * @return the value
     **/
    public Boolean getIsIgnoreExistingObjects() {
        return isIgnoreExistingObjects;
    }

    /**
     * The action taken in the event of errors related to GRANT or REVOKE errors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("handleGrantErrors")
    private final HandleGrantErrors handleGrantErrors;

    /**
     * The action taken in the event of errors related to GRANT or REVOKE errors.
     * @return the value
     **/
    public HandleGrantErrors getHandleGrantErrors() {
        return handleGrantErrors;
    }

    /**
     * MySql Job Mode
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobMode")
    private final JobModeMySql jobMode;

    /**
     * MySql Job Mode
     * @return the value
     **/
    public JobModeMySql getJobMode() {
        return jobMode;
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
        sb.append("MySqlInitialLoadSettings(");
        sb.append("super=").append(super.toString());
        sb.append("isConsistent=").append(String.valueOf(this.isConsistent));
        sb.append(", isTzUtc=").append(String.valueOf(this.isTzUtc));
        sb.append(", compatibility=").append(String.valueOf(this.compatibility));
        sb.append(", primaryKeyCompatibility=")
                .append(String.valueOf(this.primaryKeyCompatibility));
        sb.append(", isIgnoreExistingObjects=")
                .append(String.valueOf(this.isIgnoreExistingObjects));
        sb.append(", handleGrantErrors=").append(String.valueOf(this.handleGrantErrors));
        sb.append(", jobMode=").append(String.valueOf(this.jobMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlInitialLoadSettings)) {
            return false;
        }

        MySqlInitialLoadSettings other = (MySqlInitialLoadSettings) o;
        return java.util.Objects.equals(this.isConsistent, other.isConsistent)
                && java.util.Objects.equals(this.isTzUtc, other.isTzUtc)
                && java.util.Objects.equals(this.compatibility, other.compatibility)
                && java.util.Objects.equals(
                        this.primaryKeyCompatibility, other.primaryKeyCompatibility)
                && java.util.Objects.equals(
                        this.isIgnoreExistingObjects, other.isIgnoreExistingObjects)
                && java.util.Objects.equals(this.handleGrantErrors, other.handleGrantErrors)
                && java.util.Objects.equals(this.jobMode, other.jobMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isConsistent == null ? 43 : this.isConsistent.hashCode());
        result = (result * PRIME) + (this.isTzUtc == null ? 43 : this.isTzUtc.hashCode());
        result =
                (result * PRIME)
                        + (this.compatibility == null ? 43 : this.compatibility.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryKeyCompatibility == null
                                ? 43
                                : this.primaryKeyCompatibility.hashCode());
        result =
                (result * PRIME)
                        + (this.isIgnoreExistingObjects == null
                                ? 43
                                : this.isIgnoreExistingObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.handleGrantErrors == null ? 43 : this.handleGrantErrors.hashCode());
        result = (result * PRIME) + (this.jobMode == null ? 43 : this.jobMode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
