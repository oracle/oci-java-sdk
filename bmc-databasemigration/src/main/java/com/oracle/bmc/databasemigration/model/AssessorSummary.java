/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Assessor Summary
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AssessorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AssessorSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "assessmentId",
        "name",
        "displayName",
        "description",
        "helpLinkUrl",
        "helpLinkText",
        "lifecycleState",
        "assessorGroup",
        "actions",
        "assessorResult",
        "checksSummary",
        "hasScript",
        "script",
        "doesScriptRequireRestart"
    })
    public AssessorSummary(
            String assessmentId,
            String name,
            String displayName,
            String description,
            String helpLinkUrl,
            String helpLinkText,
            AssessorLifecycleStates lifecycleState,
            AssessorGroup assessorGroup,
            java.util.List<AssessorAction> actions,
            String assessorResult,
            String checksSummary,
            Boolean hasScript,
            String script,
            Boolean doesScriptRequireRestart) {
        super();
        this.assessmentId = assessmentId;
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.helpLinkUrl = helpLinkUrl;
        this.helpLinkText = helpLinkText;
        this.lifecycleState = lifecycleState;
        this.assessorGroup = assessorGroup;
        this.actions = actions;
        this.assessorResult = assessorResult;
        this.checksSummary = checksSummary;
        this.hasScript = hasScript;
        this.script = script;
        this.doesScriptRequireRestart = doesScriptRequireRestart;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the resource being referenced.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
        private String assessmentId;

        /**
         * The OCID of the resource being referenced.
         * @param assessmentId the value to set
         * @return this builder
         **/
        public Builder assessmentId(String assessmentId) {
            this.assessmentId = assessmentId;
            this.__explicitlySet__.add("assessmentId");
            return this;
        }
        /**
         * The Assessor Name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The Assessor Name.
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
         * The current state of the Assessor.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AssessorLifecycleStates lifecycleState;

        /**
         * The current state of the Assessor.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(AssessorLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assessorGroup")
        private AssessorGroup assessorGroup;

        public Builder assessorGroup(AssessorGroup assessorGroup) {
            this.assessorGroup = assessorGroup;
            this.__explicitlySet__.add("assessorGroup");
            return this;
        }
        /**
         * Assessor actions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actions")
        private java.util.List<AssessorAction> actions;

        /**
         * Assessor actions.
         * @param actions the value to set
         * @return this builder
         **/
        public Builder actions(java.util.List<AssessorAction> actions) {
            this.actions = actions;
            this.__explicitlySet__.add("actions");
            return this;
        }
        /**
         * The Assessor Result text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("assessorResult")
        private String assessorResult;

        /**
         * The Assessor Result text.
         * @param assessorResult the value to set
         * @return this builder
         **/
        public Builder assessorResult(String assessorResult) {
            this.assessorResult = assessorResult;
            this.__explicitlySet__.add("assessorResult");
            return this;
        }
        /**
         * The Summary of all Checks.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("checksSummary")
        private String checksSummary;

        /**
         * The Summary of all Checks.
         * @param checksSummary the value to set
         * @return this builder
         **/
        public Builder checksSummary(String checksSummary) {
            this.checksSummary = checksSummary;
            this.__explicitlySet__.add("checksSummary");
            return this;
        }
        /**
         * True if script is available either from 'script' property of through download, false otherwise.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hasScript")
        private Boolean hasScript;

        /**
         * True if script is available either from 'script' property of through download, false otherwise.
         * @param hasScript the value to set
         * @return this builder
         **/
        public Builder hasScript(Boolean hasScript) {
            this.hasScript = hasScript;
            this.__explicitlySet__.add("hasScript");
            return this;
        }
        /**
         * The generated SQL script. Can be empty if the script exceeds maxLength.
         * In this case the property 'hasScript' indicates that the script is available for download.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("script")
        private String script;

        /**
         * The generated SQL script. Can be empty if the script exceeds maxLength.
         * In this case the property 'hasScript' indicates that the script is available for download.
         *
         * @param script the value to set
         * @return this builder
         **/
        public Builder script(String script) {
            this.script = script;
            this.__explicitlySet__.add("script");
            return this;
        }
        /**
         * True if DB restart required after running the script, false otherwise.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("doesScriptRequireRestart")
        private Boolean doesScriptRequireRestart;

        /**
         * True if DB restart required after running the script, false otherwise.
         * @param doesScriptRequireRestart the value to set
         * @return this builder
         **/
        public Builder doesScriptRequireRestart(Boolean doesScriptRequireRestart) {
            this.doesScriptRequireRestart = doesScriptRequireRestart;
            this.__explicitlySet__.add("doesScriptRequireRestart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssessorSummary build() {
            AssessorSummary model =
                    new AssessorSummary(
                            this.assessmentId,
                            this.name,
                            this.displayName,
                            this.description,
                            this.helpLinkUrl,
                            this.helpLinkText,
                            this.lifecycleState,
                            this.assessorGroup,
                            this.actions,
                            this.assessorResult,
                            this.checksSummary,
                            this.hasScript,
                            this.script,
                            this.doesScriptRequireRestart);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssessorSummary model) {
            if (model.wasPropertyExplicitlySet("assessmentId")) {
                this.assessmentId(model.getAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("helpLinkUrl")) {
                this.helpLinkUrl(model.getHelpLinkUrl());
            }
            if (model.wasPropertyExplicitlySet("helpLinkText")) {
                this.helpLinkText(model.getHelpLinkText());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("assessorGroup")) {
                this.assessorGroup(model.getAssessorGroup());
            }
            if (model.wasPropertyExplicitlySet("actions")) {
                this.actions(model.getActions());
            }
            if (model.wasPropertyExplicitlySet("assessorResult")) {
                this.assessorResult(model.getAssessorResult());
            }
            if (model.wasPropertyExplicitlySet("checksSummary")) {
                this.checksSummary(model.getChecksSummary());
            }
            if (model.wasPropertyExplicitlySet("hasScript")) {
                this.hasScript(model.getHasScript());
            }
            if (model.wasPropertyExplicitlySet("script")) {
                this.script(model.getScript());
            }
            if (model.wasPropertyExplicitlySet("doesScriptRequireRestart")) {
                this.doesScriptRequireRestart(model.getDoesScriptRequireRestart());
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
     * The OCID of the resource being referenced.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
    private final String assessmentId;

    /**
     * The OCID of the resource being referenced.
     * @return the value
     **/
    public String getAssessmentId() {
        return assessmentId;
    }

    /**
     * The Assessor Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The Assessor Name.
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
     * The current state of the Assessor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AssessorLifecycleStates lifecycleState;

    /**
     * The current state of the Assessor.
     * @return the value
     **/
    public AssessorLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("assessorGroup")
    private final AssessorGroup assessorGroup;

    public AssessorGroup getAssessorGroup() {
        return assessorGroup;
    }

    /**
     * Assessor actions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actions")
    private final java.util.List<AssessorAction> actions;

    /**
     * Assessor actions.
     * @return the value
     **/
    public java.util.List<AssessorAction> getActions() {
        return actions;
    }

    /**
     * The Assessor Result text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assessorResult")
    private final String assessorResult;

    /**
     * The Assessor Result text.
     * @return the value
     **/
    public String getAssessorResult() {
        return assessorResult;
    }

    /**
     * The Summary of all Checks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checksSummary")
    private final String checksSummary;

    /**
     * The Summary of all Checks.
     * @return the value
     **/
    public String getChecksSummary() {
        return checksSummary;
    }

    /**
     * True if script is available either from 'script' property of through download, false otherwise.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hasScript")
    private final Boolean hasScript;

    /**
     * True if script is available either from 'script' property of through download, false otherwise.
     * @return the value
     **/
    public Boolean getHasScript() {
        return hasScript;
    }

    /**
     * The generated SQL script. Can be empty if the script exceeds maxLength.
     * In this case the property 'hasScript' indicates that the script is available for download.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("script")
    private final String script;

    /**
     * The generated SQL script. Can be empty if the script exceeds maxLength.
     * In this case the property 'hasScript' indicates that the script is available for download.
     *
     * @return the value
     **/
    public String getScript() {
        return script;
    }

    /**
     * True if DB restart required after running the script, false otherwise.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("doesScriptRequireRestart")
    private final Boolean doesScriptRequireRestart;

    /**
     * True if DB restart required after running the script, false otherwise.
     * @return the value
     **/
    public Boolean getDoesScriptRequireRestart() {
        return doesScriptRequireRestart;
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
        sb.append("AssessorSummary(");
        sb.append("super=").append(super.toString());
        sb.append("assessmentId=").append(String.valueOf(this.assessmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", helpLinkUrl=").append(String.valueOf(this.helpLinkUrl));
        sb.append(", helpLinkText=").append(String.valueOf(this.helpLinkText));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", assessorGroup=").append(String.valueOf(this.assessorGroup));
        sb.append(", actions=").append(String.valueOf(this.actions));
        sb.append(", assessorResult=").append(String.valueOf(this.assessorResult));
        sb.append(", checksSummary=").append(String.valueOf(this.checksSummary));
        sb.append(", hasScript=").append(String.valueOf(this.hasScript));
        sb.append(", script=").append(String.valueOf(this.script));
        sb.append(", doesScriptRequireRestart=")
                .append(String.valueOf(this.doesScriptRequireRestart));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssessorSummary)) {
            return false;
        }

        AssessorSummary other = (AssessorSummary) o;
        return java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.helpLinkUrl, other.helpLinkUrl)
                && java.util.Objects.equals(this.helpLinkText, other.helpLinkText)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.assessorGroup, other.assessorGroup)
                && java.util.Objects.equals(this.actions, other.actions)
                && java.util.Objects.equals(this.assessorResult, other.assessorResult)
                && java.util.Objects.equals(this.checksSummary, other.checksSummary)
                && java.util.Objects.equals(this.hasScript, other.hasScript)
                && java.util.Objects.equals(this.script, other.script)
                && java.util.Objects.equals(
                        this.doesScriptRequireRestart, other.doesScriptRequireRestart)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assessmentId == null ? 43 : this.assessmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.helpLinkUrl == null ? 43 : this.helpLinkUrl.hashCode());
        result = (result * PRIME) + (this.helpLinkText == null ? 43 : this.helpLinkText.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.assessorGroup == null ? 43 : this.assessorGroup.hashCode());
        result = (result * PRIME) + (this.actions == null ? 43 : this.actions.hashCode());
        result =
                (result * PRIME)
                        + (this.assessorResult == null ? 43 : this.assessorResult.hashCode());
        result =
                (result * PRIME)
                        + (this.checksSummary == null ? 43 : this.checksSummary.hashCode());
        result = (result * PRIME) + (this.hasScript == null ? 43 : this.hasScript.hashCode());
        result = (result * PRIME) + (this.script == null ? 43 : this.script.hashCode());
        result =
                (result * PRIME)
                        + (this.doesScriptRequireRestart == null
                                ? 43
                                : this.doesScriptRequireRestart.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
