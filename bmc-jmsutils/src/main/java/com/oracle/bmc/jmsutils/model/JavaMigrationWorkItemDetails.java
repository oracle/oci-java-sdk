/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsutils.model;

/**
 * The java migration work item details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250521")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JavaMigrationWorkItemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaMigrationWorkItemDetails extends WorkItemDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("workItemType")
        private WorkItemType workItemType;

        public Builder workItemType(WorkItemType workItemType) {
            this.workItemType = workItemType;
            this.__explicitlySet__.add("workItemType");
            return this;
        }
        /**
         * The JDK version against which the migration analysis was performed to identify effort
         * required to move from source JDK.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetJdkVersion")
        private String targetJdkVersion;

        /**
         * The JDK version against which the migration analysis was performed to identify effort
         * required to move from source JDK.
         *
         * @param targetJdkVersion the value to set
         * @return this builder
         */
        public Builder targetJdkVersion(String targetJdkVersion) {
            this.targetJdkVersion = targetJdkVersion;
            this.__explicitlySet__.add("targetJdkVersion");
            return this;
        }
        /**
         * Object storage path to the input artifact/s in the form of a serialized array. Example:
         * "[\\"/JMS/Utils/myartifacts1.jar\\",\\"/JMS/Utils/myartifacts2.war\\"]"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("inputApplicationsObjectStoragePaths")
        private String inputApplicationsObjectStoragePaths;

        /**
         * Object storage path to the input artifact/s in the form of a serialized array. Example:
         * "[\\"/JMS/Utils/myartifacts1.jar\\",\\"/JMS/Utils/myartifacts2.war\\"]"
         *
         * @param inputApplicationsObjectStoragePaths the value to set
         * @return this builder
         */
        public Builder inputApplicationsObjectStoragePaths(
                String inputApplicationsObjectStoragePaths) {
            this.inputApplicationsObjectStoragePaths = inputApplicationsObjectStoragePaths;
            this.__explicitlySet__.add("inputApplicationsObjectStoragePaths");
            return this;
        }
        /** Name of the analysis project. */
        @com.fasterxml.jackson.annotation.JsonProperty("analysisProjectName")
        private String analysisProjectName;

        /**
         * Name of the analysis project.
         *
         * @param analysisProjectName the value to set
         * @return this builder
         */
        public Builder analysisProjectName(String analysisProjectName) {
            this.analysisProjectName = analysisProjectName;
            this.__explicitlySet__.add("analysisProjectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaMigrationWorkItemDetails build() {
            JavaMigrationWorkItemDetails model =
                    new JavaMigrationWorkItemDetails(
                            this.workItemType,
                            this.targetJdkVersion,
                            this.inputApplicationsObjectStoragePaths,
                            this.analysisProjectName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaMigrationWorkItemDetails model) {
            if (model.wasPropertyExplicitlySet("workItemType")) {
                this.workItemType(model.getWorkItemType());
            }
            if (model.wasPropertyExplicitlySet("targetJdkVersion")) {
                this.targetJdkVersion(model.getTargetJdkVersion());
            }
            if (model.wasPropertyExplicitlySet("inputApplicationsObjectStoragePaths")) {
                this.inputApplicationsObjectStoragePaths(
                        model.getInputApplicationsObjectStoragePaths());
            }
            if (model.wasPropertyExplicitlySet("analysisProjectName")) {
                this.analysisProjectName(model.getAnalysisProjectName());
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
    public JavaMigrationWorkItemDetails(
            WorkItemType workItemType,
            String targetJdkVersion,
            String inputApplicationsObjectStoragePaths,
            String analysisProjectName) {
        super(workItemType);
        this.targetJdkVersion = targetJdkVersion;
        this.inputApplicationsObjectStoragePaths = inputApplicationsObjectStoragePaths;
        this.analysisProjectName = analysisProjectName;
    }

    /**
     * The JDK version against which the migration analysis was performed to identify effort
     * required to move from source JDK.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetJdkVersion")
    private final String targetJdkVersion;

    /**
     * The JDK version against which the migration analysis was performed to identify effort
     * required to move from source JDK.
     *
     * @return the value
     */
    public String getTargetJdkVersion() {
        return targetJdkVersion;
    }

    /**
     * Object storage path to the input artifact/s in the form of a serialized array. Example:
     * "[\\"/JMS/Utils/myartifacts1.jar\\",\\"/JMS/Utils/myartifacts2.war\\"]"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inputApplicationsObjectStoragePaths")
    private final String inputApplicationsObjectStoragePaths;

    /**
     * Object storage path to the input artifact/s in the form of a serialized array. Example:
     * "[\\"/JMS/Utils/myartifacts1.jar\\",\\"/JMS/Utils/myartifacts2.war\\"]"
     *
     * @return the value
     */
    public String getInputApplicationsObjectStoragePaths() {
        return inputApplicationsObjectStoragePaths;
    }

    /** Name of the analysis project. */
    @com.fasterxml.jackson.annotation.JsonProperty("analysisProjectName")
    private final String analysisProjectName;

    /**
     * Name of the analysis project.
     *
     * @return the value
     */
    public String getAnalysisProjectName() {
        return analysisProjectName;
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
        sb.append("JavaMigrationWorkItemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", targetJdkVersion=").append(String.valueOf(this.targetJdkVersion));
        sb.append(", inputApplicationsObjectStoragePaths=")
                .append(String.valueOf(this.inputApplicationsObjectStoragePaths));
        sb.append(", analysisProjectName=").append(String.valueOf(this.analysisProjectName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaMigrationWorkItemDetails)) {
            return false;
        }

        JavaMigrationWorkItemDetails other = (JavaMigrationWorkItemDetails) o;
        return java.util.Objects.equals(this.targetJdkVersion, other.targetJdkVersion)
                && java.util.Objects.equals(
                        this.inputApplicationsObjectStoragePaths,
                        other.inputApplicationsObjectStoragePaths)
                && java.util.Objects.equals(this.analysisProjectName, other.analysisProjectName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.targetJdkVersion == null ? 43 : this.targetJdkVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.inputApplicationsObjectStoragePaths == null
                                ? 43
                                : this.inputApplicationsObjectStoragePaths.hashCode());
        result =
                (result * PRIME)
                        + (this.analysisProjectName == null
                                ? 43
                                : this.analysisProjectName.hashCode());
        return result;
    }
}
