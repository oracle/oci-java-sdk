/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Assessor Check Summary
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
    builder = AssessorCheckSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AssessorCheckSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "displayName",
        "description",
        "assessorCheckGroup",
        "helpLinkUrl",
        "helpLinkText",
        "assessorCheckState",
        "checkAction",
        "key",
        "issue",
        "impact",
        "action",
        "fixupScriptLocation",
        "isExclusionAllowed",
        "metadata",
        "columns",
        "objectCount",
        "objectsDisplayName",
        "logLocation"
    })
    public AssessorCheckSummary(
            String name,
            String displayName,
            String description,
            AssessorCheckGroup assessorCheckGroup,
            String helpLinkUrl,
            String helpLinkText,
            AssessorCheckStates assessorCheckState,
            AssessorCheckAction checkAction,
            String key,
            String issue,
            String impact,
            String action,
            String fixupScriptLocation,
            Boolean isExclusionAllowed,
            ObjectMetadata metadata,
            java.util.List<AdvisorReportCheckColumn> columns,
            Integer objectCount,
            String objectsDisplayName,
            LogLocationBucketDetails logLocation) {
        super();
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.assessorCheckGroup = assessorCheckGroup;
        this.helpLinkUrl = helpLinkUrl;
        this.helpLinkText = helpLinkText;
        this.assessorCheckState = assessorCheckState;
        this.checkAction = checkAction;
        this.key = key;
        this.issue = issue;
        this.impact = impact;
        this.action = action;
        this.fixupScriptLocation = fixupScriptLocation;
        this.isExclusionAllowed = isExclusionAllowed;
        this.metadata = metadata;
        this.columns = columns;
        this.objectCount = objectCount;
        this.objectsDisplayName = objectsDisplayName;
        this.logLocation = logLocation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Name of the Check.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The Name of the Check.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
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
         * A user-friendly description. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-friendly description. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assessorCheckGroup")
        private AssessorCheckGroup assessorCheckGroup;

        public Builder assessorCheckGroup(AssessorCheckGroup assessorCheckGroup) {
            this.assessorCheckGroup = assessorCheckGroup;
            this.__explicitlySet__.add("assessorCheckGroup");
            return this;
        }
        /**
         * The Help URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("helpLinkUrl")
        private String helpLinkUrl;

        /**
         * The Help URL.
         * @param helpLinkUrl the value to set
         * @return this builder
         **/
        public Builder helpLinkUrl(String helpLinkUrl) {
            this.helpLinkUrl = helpLinkUrl;
            this.__explicitlySet__.add("helpLinkUrl");
            return this;
        }
        /**
         * The Help link text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("helpLinkText")
        private String helpLinkText;

        /**
         * The Help link text.
         * @param helpLinkText the value to set
         * @return this builder
         **/
        public Builder helpLinkText(String helpLinkText) {
            this.helpLinkText = helpLinkText;
            this.__explicitlySet__.add("helpLinkText");
            return this;
        }
        /**
         * The current state of the Assessor Check.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assessorCheckState")
        private AssessorCheckStates assessorCheckState;

        /**
         * The current state of the Assessor Check.
         * @param assessorCheckState the value to set
         * @return this builder
         **/
        public Builder assessorCheckState(AssessorCheckStates assessorCheckState) {
            this.assessorCheckState = assessorCheckState;
            this.__explicitlySet__.add("assessorCheckState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("checkAction")
        private AssessorCheckAction checkAction;

        public Builder checkAction(AssessorCheckAction checkAction) {
            this.checkAction = checkAction;
            this.__explicitlySet__.add("checkAction");
            return this;
        }
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
        /**
         * The objects display name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectsDisplayName")
        private String objectsDisplayName;

        /**
         * The objects display name.
         *
         * @param objectsDisplayName the value to set
         * @return this builder
         **/
        public Builder objectsDisplayName(String objectsDisplayName) {
            this.objectsDisplayName = objectsDisplayName;
            this.__explicitlySet__.add("objectsDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logLocation")
        private LogLocationBucketDetails logLocation;

        public Builder logLocation(LogLocationBucketDetails logLocation) {
            this.logLocation = logLocation;
            this.__explicitlySet__.add("logLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssessorCheckSummary build() {
            AssessorCheckSummary model =
                    new AssessorCheckSummary(
                            this.name,
                            this.displayName,
                            this.description,
                            this.assessorCheckGroup,
                            this.helpLinkUrl,
                            this.helpLinkText,
                            this.assessorCheckState,
                            this.checkAction,
                            this.key,
                            this.issue,
                            this.impact,
                            this.action,
                            this.fixupScriptLocation,
                            this.isExclusionAllowed,
                            this.metadata,
                            this.columns,
                            this.objectCount,
                            this.objectsDisplayName,
                            this.logLocation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssessorCheckSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("assessorCheckGroup")) {
                this.assessorCheckGroup(model.getAssessorCheckGroup());
            }
            if (model.wasPropertyExplicitlySet("helpLinkUrl")) {
                this.helpLinkUrl(model.getHelpLinkUrl());
            }
            if (model.wasPropertyExplicitlySet("helpLinkText")) {
                this.helpLinkText(model.getHelpLinkText());
            }
            if (model.wasPropertyExplicitlySet("assessorCheckState")) {
                this.assessorCheckState(model.getAssessorCheckState());
            }
            if (model.wasPropertyExplicitlySet("checkAction")) {
                this.checkAction(model.getCheckAction());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
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
            if (model.wasPropertyExplicitlySet("objectsDisplayName")) {
                this.objectsDisplayName(model.getObjectsDisplayName());
            }
            if (model.wasPropertyExplicitlySet("logLocation")) {
                this.logLocation(model.getLogLocation());
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
     * The Name of the Check.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The Name of the Check.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A user-friendly description. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("assessorCheckGroup")
    private final AssessorCheckGroup assessorCheckGroup;

    public AssessorCheckGroup getAssessorCheckGroup() {
        return assessorCheckGroup;
    }

    /**
     * The Help URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("helpLinkUrl")
    private final String helpLinkUrl;

    /**
     * The Help URL.
     * @return the value
     **/
    public String getHelpLinkUrl() {
        return helpLinkUrl;
    }

    /**
     * The Help link text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("helpLinkText")
    private final String helpLinkText;

    /**
     * The Help link text.
     * @return the value
     **/
    public String getHelpLinkText() {
        return helpLinkText;
    }

    /**
     * The current state of the Assessor Check.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assessorCheckState")
    private final AssessorCheckStates assessorCheckState;

    /**
     * The current state of the Assessor Check.
     * @return the value
     **/
    public AssessorCheckStates getAssessorCheckState() {
        return assessorCheckState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("checkAction")
    private final AssessorCheckAction checkAction;

    public AssessorCheckAction getCheckAction() {
        return checkAction;
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

    /**
     * The objects display name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectsDisplayName")
    private final String objectsDisplayName;

    /**
     * The objects display name.
     *
     * @return the value
     **/
    public String getObjectsDisplayName() {
        return objectsDisplayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logLocation")
    private final LogLocationBucketDetails logLocation;

    public LogLocationBucketDetails getLogLocation() {
        return logLocation;
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
        sb.append("AssessorCheckSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", assessorCheckGroup=").append(String.valueOf(this.assessorCheckGroup));
        sb.append(", helpLinkUrl=").append(String.valueOf(this.helpLinkUrl));
        sb.append(", helpLinkText=").append(String.valueOf(this.helpLinkText));
        sb.append(", assessorCheckState=").append(String.valueOf(this.assessorCheckState));
        sb.append(", checkAction=").append(String.valueOf(this.checkAction));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", issue=").append(String.valueOf(this.issue));
        sb.append(", impact=").append(String.valueOf(this.impact));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", fixupScriptLocation=").append(String.valueOf(this.fixupScriptLocation));
        sb.append(", isExclusionAllowed=").append(String.valueOf(this.isExclusionAllowed));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", objectCount=").append(String.valueOf(this.objectCount));
        sb.append(", objectsDisplayName=").append(String.valueOf(this.objectsDisplayName));
        sb.append(", logLocation=").append(String.valueOf(this.logLocation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssessorCheckSummary)) {
            return false;
        }

        AssessorCheckSummary other = (AssessorCheckSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.assessorCheckGroup, other.assessorCheckGroup)
                && java.util.Objects.equals(this.helpLinkUrl, other.helpLinkUrl)
                && java.util.Objects.equals(this.helpLinkText, other.helpLinkText)
                && java.util.Objects.equals(this.assessorCheckState, other.assessorCheckState)
                && java.util.Objects.equals(this.checkAction, other.checkAction)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.issue, other.issue)
                && java.util.Objects.equals(this.impact, other.impact)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.fixupScriptLocation, other.fixupScriptLocation)
                && java.util.Objects.equals(this.isExclusionAllowed, other.isExclusionAllowed)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.columns, other.columns)
                && java.util.Objects.equals(this.objectCount, other.objectCount)
                && java.util.Objects.equals(this.objectsDisplayName, other.objectsDisplayName)
                && java.util.Objects.equals(this.logLocation, other.logLocation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.assessorCheckGroup == null
                                ? 43
                                : this.assessorCheckGroup.hashCode());
        result = (result * PRIME) + (this.helpLinkUrl == null ? 43 : this.helpLinkUrl.hashCode());
        result = (result * PRIME) + (this.helpLinkText == null ? 43 : this.helpLinkText.hashCode());
        result =
                (result * PRIME)
                        + (this.assessorCheckState == null
                                ? 43
                                : this.assessorCheckState.hashCode());
        result = (result * PRIME) + (this.checkAction == null ? 43 : this.checkAction.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
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
        result =
                (result * PRIME)
                        + (this.objectsDisplayName == null
                                ? 43
                                : this.objectsDisplayName.hashCode());
        result = (result * PRIME) + (this.logLocation == null ? 43 : this.logLocation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
