/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to change SQL plan baseline attributes. It takes either credentials or
 * databaseCredential. It's recommended to provide databaseCredential <br>
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
        builder = ChangeSqlPlanBaselinesAttributesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ChangeSqlPlanBaselinesAttributesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sqlHandle",
        "planName",
        "isEnabled",
        "isFixed",
        "isAutoPurged",
        "credentials",
        "databaseCredential"
    })
    public ChangeSqlPlanBaselinesAttributesDetails(
            String sqlHandle,
            String planName,
            Boolean isEnabled,
            Boolean isFixed,
            Boolean isAutoPurged,
            ManagedDatabaseCredential credentials,
            DatabaseCredentialDetails databaseCredential) {
        super();
        this.sqlHandle = sqlHandle;
        this.planName = planName;
        this.isEnabled = isEnabled;
        this.isFixed = isFixed;
        this.isAutoPurged = isAutoPurged;
        this.credentials = credentials;
        this.databaseCredential = databaseCredential;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The SQL statement handle. It identifies plans associated with a SQL statement for
         * attribute changes. If {@code null} then {@code planName} must be specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlHandle")
        private String sqlHandle;

        /**
         * The SQL statement handle. It identifies plans associated with a SQL statement for
         * attribute changes. If {@code null} then {@code planName} must be specified.
         *
         * @param sqlHandle the value to set
         * @return this builder
         */
        public Builder sqlHandle(String sqlHandle) {
            this.sqlHandle = sqlHandle;
            this.__explicitlySet__.add("sqlHandle");
            return this;
        }
        /**
         * Then plan name. It identifies a specific plan. If {@code null' then all plans associated
         * with a SQL statement identified by }sqlHandle' are considered for attribute changes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("planName")
        private String planName;

        /**
         * Then plan name. It identifies a specific plan. If {@code null' then all plans associated
         * with a SQL statement identified by }sqlHandle' are considered for attribute changes.
         *
         * @param planName the value to set
         * @return this builder
         */
        public Builder planName(String planName) {
            this.planName = planName;
            this.__explicitlySet__.add("planName");
            return this;
        }
        /** Indicates whether the plan is available for use by the optimizer. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Indicates whether the plan is available for use by the optimizer.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * Indicates whether the plan baseline is fixed. A fixed plan takes precedence over a
         * non-fixed plan.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isFixed")
        private Boolean isFixed;

        /**
         * Indicates whether the plan baseline is fixed. A fixed plan takes precedence over a
         * non-fixed plan.
         *
         * @param isFixed the value to set
         * @return this builder
         */
        public Builder isFixed(Boolean isFixed) {
            this.isFixed = isFixed;
            this.__explicitlySet__.add("isFixed");
            return this;
        }
        /** Indicates whether the plan is purged if it is not used for a time period. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoPurged")
        private Boolean isAutoPurged;

        /**
         * Indicates whether the plan is purged if it is not used for a time period.
         *
         * @param isAutoPurged the value to set
         * @return this builder
         */
        public Builder isAutoPurged(Boolean isAutoPurged) {
            this.isAutoPurged = isAutoPurged;
            this.__explicitlySet__.add("isAutoPurged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentials")
        private ManagedDatabaseCredential credentials;

        public Builder credentials(ManagedDatabaseCredential credentials) {
            this.credentials = credentials;
            this.__explicitlySet__.add("credentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
        private DatabaseCredentialDetails databaseCredential;

        public Builder databaseCredential(DatabaseCredentialDetails databaseCredential) {
            this.databaseCredential = databaseCredential;
            this.__explicitlySet__.add("databaseCredential");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeSqlPlanBaselinesAttributesDetails build() {
            ChangeSqlPlanBaselinesAttributesDetails model =
                    new ChangeSqlPlanBaselinesAttributesDetails(
                            this.sqlHandle,
                            this.planName,
                            this.isEnabled,
                            this.isFixed,
                            this.isAutoPurged,
                            this.credentials,
                            this.databaseCredential);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeSqlPlanBaselinesAttributesDetails model) {
            if (model.wasPropertyExplicitlySet("sqlHandle")) {
                this.sqlHandle(model.getSqlHandle());
            }
            if (model.wasPropertyExplicitlySet("planName")) {
                this.planName(model.getPlanName());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isFixed")) {
                this.isFixed(model.getIsFixed());
            }
            if (model.wasPropertyExplicitlySet("isAutoPurged")) {
                this.isAutoPurged(model.getIsAutoPurged());
            }
            if (model.wasPropertyExplicitlySet("credentials")) {
                this.credentials(model.getCredentials());
            }
            if (model.wasPropertyExplicitlySet("databaseCredential")) {
                this.databaseCredential(model.getDatabaseCredential());
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

    /**
     * The SQL statement handle. It identifies plans associated with a SQL statement for attribute
     * changes. If {@code null} then {@code planName} must be specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlHandle")
    private final String sqlHandle;

    /**
     * The SQL statement handle. It identifies plans associated with a SQL statement for attribute
     * changes. If {@code null} then {@code planName} must be specified.
     *
     * @return the value
     */
    public String getSqlHandle() {
        return sqlHandle;
    }

    /**
     * Then plan name. It identifies a specific plan. If {@code null' then all plans associated with
     * a SQL statement identified by }sqlHandle' are considered for attribute changes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("planName")
    private final String planName;

    /**
     * Then plan name. It identifies a specific plan. If {@code null' then all plans associated with
     * a SQL statement identified by }sqlHandle' are considered for attribute changes.
     *
     * @return the value
     */
    public String getPlanName() {
        return planName;
    }

    /** Indicates whether the plan is available for use by the optimizer. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Indicates whether the plan is available for use by the optimizer.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Indicates whether the plan baseline is fixed. A fixed plan takes precedence over a non-fixed
     * plan.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isFixed")
    private final Boolean isFixed;

    /**
     * Indicates whether the plan baseline is fixed. A fixed plan takes precedence over a non-fixed
     * plan.
     *
     * @return the value
     */
    public Boolean getIsFixed() {
        return isFixed;
    }

    /** Indicates whether the plan is purged if it is not used for a time period. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoPurged")
    private final Boolean isAutoPurged;

    /**
     * Indicates whether the plan is purged if it is not used for a time period.
     *
     * @return the value
     */
    public Boolean getIsAutoPurged() {
        return isAutoPurged;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final ManagedDatabaseCredential credentials;

    public ManagedDatabaseCredential getCredentials() {
        return credentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
    private final DatabaseCredentialDetails databaseCredential;

    public DatabaseCredentialDetails getDatabaseCredential() {
        return databaseCredential;
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
        sb.append("ChangeSqlPlanBaselinesAttributesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sqlHandle=").append(String.valueOf(this.sqlHandle));
        sb.append(", planName=").append(String.valueOf(this.planName));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", isFixed=").append(String.valueOf(this.isFixed));
        sb.append(", isAutoPurged=").append(String.valueOf(this.isAutoPurged));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(", databaseCredential=").append(String.valueOf(this.databaseCredential));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeSqlPlanBaselinesAttributesDetails)) {
            return false;
        }

        ChangeSqlPlanBaselinesAttributesDetails other = (ChangeSqlPlanBaselinesAttributesDetails) o;
        return java.util.Objects.equals(this.sqlHandle, other.sqlHandle)
                && java.util.Objects.equals(this.planName, other.planName)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.isFixed, other.isFixed)
                && java.util.Objects.equals(this.isAutoPurged, other.isAutoPurged)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.databaseCredential, other.databaseCredential)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sqlHandle == null ? 43 : this.sqlHandle.hashCode());
        result = (result * PRIME) + (this.planName == null ? 43 : this.planName.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.isFixed == null ? 43 : this.isFixed.hashCode());
        result = (result * PRIME) + (this.isAutoPurged == null ? 43 : this.isAutoPurged.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseCredential == null
                                ? 43
                                : this.databaseCredential.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
