/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The details of the local task. The local tasks are specific to a single runbook. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AssociatedLocalTaskDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "scope")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssociatedLocalTaskDetails extends AssociatedTaskDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("executionDetails")
        private ExecutionDetails executionDetails;

        public Builder executionDetails(ExecutionDetails executionDetails) {
            this.executionDetails = executionDetails;
            this.__explicitlySet__.add("executionDetails");
            return this;
        }
        /** The description of the task. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the task.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The platform of the runbook. */
        @com.fasterxml.jackson.annotation.JsonProperty("platform")
        private String platform;

        /**
         * The platform of the runbook.
         *
         * @param platform the value to set
         * @return this builder
         */
        public Builder platform(String platform) {
            this.platform = platform;
            this.__explicitlySet__.add("platform");
            return this;
        }
        /** Make a copy of this task in Library */
        @com.fasterxml.jackson.annotation.JsonProperty("isCopyToLibraryEnabled")
        private Boolean isCopyToLibraryEnabled;

        /**
         * Make a copy of this task in Library
         *
         * @param isCopyToLibraryEnabled the value to set
         * @return this builder
         */
        public Builder isCopyToLibraryEnabled(Boolean isCopyToLibraryEnabled) {
            this.isCopyToLibraryEnabled = isCopyToLibraryEnabled;
            this.__explicitlySet__.add("isCopyToLibraryEnabled");
            return this;
        }
        /** The OS for the task. */
        @com.fasterxml.jackson.annotation.JsonProperty("osType")
        private OsType osType;

        /**
         * The OS for the task.
         *
         * @param osType the value to set
         * @return this builder
         */
        public Builder osType(OsType osType) {
            this.osType = osType;
            this.__explicitlySet__.add("osType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private Properties properties;

        public Builder properties(Properties properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /** Is this a discovery output task? */
        @com.fasterxml.jackson.annotation.JsonProperty("isDiscoveryOutputTask")
        private Boolean isDiscoveryOutputTask;

        /**
         * Is this a discovery output task?
         *
         * @param isDiscoveryOutputTask the value to set
         * @return this builder
         */
        public Builder isDiscoveryOutputTask(Boolean isDiscoveryOutputTask) {
            this.isDiscoveryOutputTask = isDiscoveryOutputTask;
            this.__explicitlySet__.add("isDiscoveryOutputTask");
            return this;
        }
        /** Is this an Apply Subject Task? Ex. Patch Execution Task */
        @com.fasterxml.jackson.annotation.JsonProperty("isApplySubjectTask")
        private Boolean isApplySubjectTask;

        /**
         * Is this an Apply Subject Task? Ex. Patch Execution Task
         *
         * @param isApplySubjectTask the value to set
         * @return this builder
         */
        public Builder isApplySubjectTask(Boolean isApplySubjectTask) {
            this.isApplySubjectTask = isApplySubjectTask;
            this.__explicitlySet__.add("isApplySubjectTask");
            return this;
        }
        /** The name of the task */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the task
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociatedLocalTaskDetails build() {
            AssociatedLocalTaskDetails model =
                    new AssociatedLocalTaskDetails(
                            this.executionDetails,
                            this.description,
                            this.platform,
                            this.isCopyToLibraryEnabled,
                            this.osType,
                            this.properties,
                            this.isDiscoveryOutputTask,
                            this.isApplySubjectTask,
                            this.name);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociatedLocalTaskDetails model) {
            if (model.wasPropertyExplicitlySet("executionDetails")) {
                this.executionDetails(model.getExecutionDetails());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("platform")) {
                this.platform(model.getPlatform());
            }
            if (model.wasPropertyExplicitlySet("isCopyToLibraryEnabled")) {
                this.isCopyToLibraryEnabled(model.getIsCopyToLibraryEnabled());
            }
            if (model.wasPropertyExplicitlySet("osType")) {
                this.osType(model.getOsType());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
            }
            if (model.wasPropertyExplicitlySet("isDiscoveryOutputTask")) {
                this.isDiscoveryOutputTask(model.getIsDiscoveryOutputTask());
            }
            if (model.wasPropertyExplicitlySet("isApplySubjectTask")) {
                this.isApplySubjectTask(model.getIsApplySubjectTask());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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

    @Deprecated
    public AssociatedLocalTaskDetails(
            ExecutionDetails executionDetails,
            String description,
            String platform,
            Boolean isCopyToLibraryEnabled,
            OsType osType,
            Properties properties,
            Boolean isDiscoveryOutputTask,
            Boolean isApplySubjectTask,
            String name) {
        super();
        this.executionDetails = executionDetails;
        this.description = description;
        this.platform = platform;
        this.isCopyToLibraryEnabled = isCopyToLibraryEnabled;
        this.osType = osType;
        this.properties = properties;
        this.isDiscoveryOutputTask = isDiscoveryOutputTask;
        this.isApplySubjectTask = isApplySubjectTask;
        this.name = name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("executionDetails")
    private final ExecutionDetails executionDetails;

    public ExecutionDetails getExecutionDetails() {
        return executionDetails;
    }

    /** The description of the task. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the task.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The platform of the runbook. */
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    private final String platform;

    /**
     * The platform of the runbook.
     *
     * @return the value
     */
    public String getPlatform() {
        return platform;
    }

    /** Make a copy of this task in Library */
    @com.fasterxml.jackson.annotation.JsonProperty("isCopyToLibraryEnabled")
    private final Boolean isCopyToLibraryEnabled;

    /**
     * Make a copy of this task in Library
     *
     * @return the value
     */
    public Boolean getIsCopyToLibraryEnabled() {
        return isCopyToLibraryEnabled;
    }

    /** The OS for the task. */
    @com.fasterxml.jackson.annotation.JsonProperty("osType")
    private final OsType osType;

    /**
     * The OS for the task.
     *
     * @return the value
     */
    public OsType getOsType() {
        return osType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final Properties properties;

    public Properties getProperties() {
        return properties;
    }

    /** Is this a discovery output task? */
    @com.fasterxml.jackson.annotation.JsonProperty("isDiscoveryOutputTask")
    private final Boolean isDiscoveryOutputTask;

    /**
     * Is this a discovery output task?
     *
     * @return the value
     */
    public Boolean getIsDiscoveryOutputTask() {
        return isDiscoveryOutputTask;
    }

    /** Is this an Apply Subject Task? Ex. Patch Execution Task */
    @com.fasterxml.jackson.annotation.JsonProperty("isApplySubjectTask")
    private final Boolean isApplySubjectTask;

    /**
     * Is this an Apply Subject Task? Ex. Patch Execution Task
     *
     * @return the value
     */
    public Boolean getIsApplySubjectTask() {
        return isApplySubjectTask;
    }

    /** The name of the task */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the task
     *
     * @return the value
     */
    public String getName() {
        return name;
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
        sb.append("AssociatedLocalTaskDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", executionDetails=").append(String.valueOf(this.executionDetails));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", platform=").append(String.valueOf(this.platform));
        sb.append(", isCopyToLibraryEnabled=").append(String.valueOf(this.isCopyToLibraryEnabled));
        sb.append(", osType=").append(String.valueOf(this.osType));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", isDiscoveryOutputTask=").append(String.valueOf(this.isDiscoveryOutputTask));
        sb.append(", isApplySubjectTask=").append(String.valueOf(this.isApplySubjectTask));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociatedLocalTaskDetails)) {
            return false;
        }

        AssociatedLocalTaskDetails other = (AssociatedLocalTaskDetails) o;
        return java.util.Objects.equals(this.executionDetails, other.executionDetails)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.platform, other.platform)
                && java.util.Objects.equals(
                        this.isCopyToLibraryEnabled, other.isCopyToLibraryEnabled)
                && java.util.Objects.equals(this.osType, other.osType)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.isDiscoveryOutputTask, other.isDiscoveryOutputTask)
                && java.util.Objects.equals(this.isApplySubjectTask, other.isApplySubjectTask)
                && java.util.Objects.equals(this.name, other.name)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.executionDetails == null ? 43 : this.executionDetails.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.platform == null ? 43 : this.platform.hashCode());
        result =
                (result * PRIME)
                        + (this.isCopyToLibraryEnabled == null
                                ? 43
                                : this.isCopyToLibraryEnabled.hashCode());
        result = (result * PRIME) + (this.osType == null ? 43 : this.osType.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result =
                (result * PRIME)
                        + (this.isDiscoveryOutputTask == null
                                ? 43
                                : this.isDiscoveryOutputTask.hashCode());
        result =
                (result * PRIME)
                        + (this.isApplySubjectTask == null
                                ? 43
                                : this.isApplySubjectTask.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        return result;
    }
}
