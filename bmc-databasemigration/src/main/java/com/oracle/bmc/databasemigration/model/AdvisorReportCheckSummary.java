/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Pre-Migration extended advisor report check item.
 *
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
    builder = AdvisorReportCheckSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdvisorReportCheckSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "resultType",
        "isReviewed",
        "issue",
        "impact",
        "action",
        "fixupScriptLocation",
        "isExclusionAllowed",
        "metadata",
        "columns",
        "objectCount"
    })
    public AdvisorReportCheckSummary(
            String key,
            String displayName,
            AdvisorResults resultType,
            Boolean isReviewed,
            String issue,
            String impact,
            String action,
            String fixupScriptLocation,
            Boolean isExclusionAllowed,
            ObjectMetadata metadata,
            java.util.List<AdvisorReportCheckColumn> columns,
            Integer objectCount) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.resultType = resultType;
        this.isReviewed = isReviewed;
        this.issue = issue;
        this.impact = impact;
        this.action = action;
        this.fixupScriptLocation = fixupScriptLocation;
        this.isExclusionAllowed = isExclusionAllowed;
        this.metadata = metadata;
        this.columns = columns;
        this.objectCount = objectCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Pre-Migration \u0441heck id.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Pre-Migration \u0441heck id.
         *
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Pre-Migration \u0441heck display name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Pre-Migration \u0441heck display name.
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
         * Pre-Migration advisor result.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resultType")
        private AdvisorResults resultType;

        /**
         * Pre-Migration advisor result.
         *
         * @param resultType the value to set
         * @return this builder
         **/
        public Builder resultType(AdvisorResults resultType) {
            this.resultType = resultType;
            this.__explicitlySet__.add("resultType");
            return this;
        }
        /**
         * User flag for advisor report check.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isReviewed")
        private Boolean isReviewed;

        /**
         * User flag for advisor report check.
         *
         * @param isReviewed the value to set
         * @return this builder
         **/
        public Builder isReviewed(Boolean isReviewed) {
            this.isReviewed = isReviewed;
            this.__explicitlySet__.add("isReviewed");
            return this;
        }
        /**
         * Description of the issue.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("issue")
        private String issue;

        /**
         * Description of the issue.
         *
         * @param issue the value to set
         * @return this builder
         **/
        public Builder issue(String issue) {
            this.issue = issue;
            this.__explicitlySet__.add("issue");
            return this;
        }
        /**
         * Impact of the issue on data migration.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("impact")
        private String impact;

        /**
         * Impact of the issue on data migration.
         *
         * @param impact the value to set
         * @return this builder
         **/
        public Builder impact(String impact) {
            this.impact = impact;
            this.__explicitlySet__.add("impact");
            return this;
        }
        /**
         * Fixing the issue.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        /**
         * Fixing the issue.
         *
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The path to the fixup script for this check.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fixupScriptLocation")
        private String fixupScriptLocation;

        /**
         * The path to the fixup script for this check.
         *
         * @param fixupScriptLocation the value to set
         * @return this builder
         **/
        public Builder fixupScriptLocation(String fixupScriptLocation) {
            this.fixupScriptLocation = fixupScriptLocation;
            this.__explicitlySet__.add("fixupScriptLocation");
            return this;
        }
        /**
         * If false, objects cannot be excluded from migration.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isExclusionAllowed")
        private Boolean isExclusionAllowed;

        /**
         * If false, objects cannot be excluded from migration.
         *
         * @param isExclusionAllowed the value to set
         * @return this builder
         **/
        public Builder isExclusionAllowed(Boolean isExclusionAllowed) {
            this.isExclusionAllowed = isExclusionAllowed;
            this.__explicitlySet__.add("isExclusionAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * Array of the column of the objects table.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<AdvisorReportCheckColumn> columns;

        /**
         * Array of the column of the objects table.
         *
         * @param columns the value to set
         * @return this builder
         **/
        public Builder columns(java.util.List<AdvisorReportCheckColumn> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }
        /**
         * Number of database objects to migrate.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectCount")
        private Integer objectCount;

        /**
         * Number of database objects to migrate.
         *
         * @param objectCount the value to set
         * @return this builder
         **/
        public Builder objectCount(Integer objectCount) {
            this.objectCount = objectCount;
            this.__explicitlySet__.add("objectCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdvisorReportCheckSummary build() {
            AdvisorReportCheckSummary model =
                    new AdvisorReportCheckSummary(
                            this.key,
                            this.displayName,
                            this.resultType,
                            this.isReviewed,
                            this.issue,
                            this.impact,
                            this.action,
                            this.fixupScriptLocation,
                            this.isExclusionAllowed,
                            this.metadata,
                            this.columns,
                            this.objectCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdvisorReportCheckSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("resultType")) {
                this.resultType(model.getResultType());
            }
            if (model.wasPropertyExplicitlySet("isReviewed")) {
                this.isReviewed(model.getIsReviewed());
            }
            if (model.wasPropertyExplicitlySet("issue")) {
                this.issue(model.getIssue());
            }
            if (model.wasPropertyExplicitlySet("impact")) {
                this.impact(model.getImpact());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("fixupScriptLocation")) {
                this.fixupScriptLocation(model.getFixupScriptLocation());
            }
            if (model.wasPropertyExplicitlySet("isExclusionAllowed")) {
                this.isExclusionAllowed(model.getIsExclusionAllowed());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("columns")) {
                this.columns(model.getColumns());
            }
            if (model.wasPropertyExplicitlySet("objectCount")) {
                this.objectCount(model.getObjectCount());
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
     * Pre-Migration \u0441heck id.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Pre-Migration \u0441heck id.
     *
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Pre-Migration \u0441heck display name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Pre-Migration \u0441heck display name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Pre-Migration advisor result.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resultType")
    private final AdvisorResults resultType;

    /**
     * Pre-Migration advisor result.
     *
     * @return the value
     **/
    public AdvisorResults getResultType() {
        return resultType;
    }

    /**
     * User flag for advisor report check.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReviewed")
    private final Boolean isReviewed;

    /**
     * User flag for advisor report check.
     *
     * @return the value
     **/
    public Boolean getIsReviewed() {
        return isReviewed;
    }

    /**
     * Description of the issue.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issue")
    private final String issue;

    /**
     * Description of the issue.
     *
     * @return the value
     **/
    public String getIssue() {
        return issue;
    }

    /**
     * Impact of the issue on data migration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("impact")
    private final String impact;

    /**
     * Impact of the issue on data migration.
     *
     * @return the value
     **/
    public String getImpact() {
        return impact;
    }

    /**
     * Fixing the issue.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    /**
     * Fixing the issue.
     *
     * @return the value
     **/
    public String getAction() {
        return action;
    }

    /**
     * The path to the fixup script for this check.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fixupScriptLocation")
    private final String fixupScriptLocation;

    /**
     * The path to the fixup script for this check.
     *
     * @return the value
     **/
    public String getFixupScriptLocation() {
        return fixupScriptLocation;
    }

    /**
     * If false, objects cannot be excluded from migration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isExclusionAllowed")
    private final Boolean isExclusionAllowed;

    /**
     * If false, objects cannot be excluded from migration.
     *
     * @return the value
     **/
    public Boolean getIsExclusionAllowed() {
        return isExclusionAllowed;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * Array of the column of the objects table.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<AdvisorReportCheckColumn> columns;

    /**
     * Array of the column of the objects table.
     *
     * @return the value
     **/
    public java.util.List<AdvisorReportCheckColumn> getColumns() {
        return columns;
    }

    /**
     * Number of database objects to migrate.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectCount")
    private final Integer objectCount;

    /**
     * Number of database objects to migrate.
     *
     * @return the value
     **/
    public Integer getObjectCount() {
        return objectCount;
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
        sb.append("AdvisorReportCheckSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", resultType=").append(String.valueOf(this.resultType));
        sb.append(", isReviewed=").append(String.valueOf(this.isReviewed));
        sb.append(", issue=").append(String.valueOf(this.issue));
        sb.append(", impact=").append(String.valueOf(this.impact));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", fixupScriptLocation=").append(String.valueOf(this.fixupScriptLocation));
        sb.append(", isExclusionAllowed=").append(String.valueOf(this.isExclusionAllowed));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", objectCount=").append(String.valueOf(this.objectCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdvisorReportCheckSummary)) {
            return false;
        }

        AdvisorReportCheckSummary other = (AdvisorReportCheckSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.resultType, other.resultType)
                && java.util.Objects.equals(this.isReviewed, other.isReviewed)
                && java.util.Objects.equals(this.issue, other.issue)
                && java.util.Objects.equals(this.impact, other.impact)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.fixupScriptLocation, other.fixupScriptLocation)
                && java.util.Objects.equals(this.isExclusionAllowed, other.isExclusionAllowed)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.columns, other.columns)
                && java.util.Objects.equals(this.objectCount, other.objectCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.resultType == null ? 43 : this.resultType.hashCode());
        result = (result * PRIME) + (this.isReviewed == null ? 43 : this.isReviewed.hashCode());
        result = (result * PRIME) + (this.issue == null ? 43 : this.issue.hashCode());
        result = (result * PRIME) + (this.impact == null ? 43 : this.impact.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.fixupScriptLocation == null
                                ? 43
                                : this.fixupScriptLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.isExclusionAllowed == null
                                ? 43
                                : this.isExclusionAllowed.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result = (result * PRIME) + (this.objectCount == null ? 43 : this.objectCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
