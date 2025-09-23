/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsutils.model;

/**
 * The target for the Java Migration Analysis <br>
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
        builder = JavaMigrationAnalysisTarget.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaMigrationAnalysisTarget
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "analysisProjectName",
        "inputApplicationsObjectStoragePaths",
        "targetJdkVersions",
        "includePackagePrefixes",
        "excludePackagePrefixes"
    })
    public JavaMigrationAnalysisTarget(
            String analysisProjectName,
            java.util.List<String> inputApplicationsObjectStoragePaths,
            java.util.List<String> targetJdkVersions,
            java.util.List<String> includePackagePrefixes,
            java.util.List<String> excludePackagePrefixes) {
        super();
        this.analysisProjectName = analysisProjectName;
        this.inputApplicationsObjectStoragePaths = inputApplicationsObjectStoragePaths;
        this.targetJdkVersions = targetJdkVersions;
        this.includePackagePrefixes = includePackagePrefixes;
        this.excludePackagePrefixes = excludePackagePrefixes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** Object storage paths to the input files applications to be analysed. */
        @com.fasterxml.jackson.annotation.JsonProperty("inputApplicationsObjectStoragePaths")
        private java.util.List<String> inputApplicationsObjectStoragePaths;

        /**
         * Object storage paths to the input files applications to be analysed.
         *
         * @param inputApplicationsObjectStoragePaths the value to set
         * @return this builder
         */
        public Builder inputApplicationsObjectStoragePaths(
                java.util.List<String> inputApplicationsObjectStoragePaths) {
            this.inputApplicationsObjectStoragePaths = inputApplicationsObjectStoragePaths;
            this.__explicitlySet__.add("inputApplicationsObjectStoragePaths");
            return this;
        }
        /** Version of the target JDKs. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetJdkVersions")
        private java.util.List<String> targetJdkVersions;

        /**
         * Version of the target JDKs.
         *
         * @param targetJdkVersions the value to set
         * @return this builder
         */
        public Builder targetJdkVersions(java.util.List<String> targetJdkVersions) {
            this.targetJdkVersions = targetJdkVersions;
            this.__explicitlySet__.add("targetJdkVersions");
            return this;
        }
        /**
         * Package prefixes to be included from the migration analysis. Either this or
         * excludePackagePrefixes can be specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("includePackagePrefixes")
        private java.util.List<String> includePackagePrefixes;

        /**
         * Package prefixes to be included from the migration analysis. Either this or
         * excludePackagePrefixes can be specified.
         *
         * @param includePackagePrefixes the value to set
         * @return this builder
         */
        public Builder includePackagePrefixes(java.util.List<String> includePackagePrefixes) {
            this.includePackagePrefixes = includePackagePrefixes;
            this.__explicitlySet__.add("includePackagePrefixes");
            return this;
        }
        /**
         * Package prefixes to be excluded from the migration analysis. Either this or
         * includePackagePrefixes can be specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("excludePackagePrefixes")
        private java.util.List<String> excludePackagePrefixes;

        /**
         * Package prefixes to be excluded from the migration analysis. Either this or
         * includePackagePrefixes can be specified.
         *
         * @param excludePackagePrefixes the value to set
         * @return this builder
         */
        public Builder excludePackagePrefixes(java.util.List<String> excludePackagePrefixes) {
            this.excludePackagePrefixes = excludePackagePrefixes;
            this.__explicitlySet__.add("excludePackagePrefixes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaMigrationAnalysisTarget build() {
            JavaMigrationAnalysisTarget model =
                    new JavaMigrationAnalysisTarget(
                            this.analysisProjectName,
                            this.inputApplicationsObjectStoragePaths,
                            this.targetJdkVersions,
                            this.includePackagePrefixes,
                            this.excludePackagePrefixes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaMigrationAnalysisTarget model) {
            if (model.wasPropertyExplicitlySet("analysisProjectName")) {
                this.analysisProjectName(model.getAnalysisProjectName());
            }
            if (model.wasPropertyExplicitlySet("inputApplicationsObjectStoragePaths")) {
                this.inputApplicationsObjectStoragePaths(
                        model.getInputApplicationsObjectStoragePaths());
            }
            if (model.wasPropertyExplicitlySet("targetJdkVersions")) {
                this.targetJdkVersions(model.getTargetJdkVersions());
            }
            if (model.wasPropertyExplicitlySet("includePackagePrefixes")) {
                this.includePackagePrefixes(model.getIncludePackagePrefixes());
            }
            if (model.wasPropertyExplicitlySet("excludePackagePrefixes")) {
                this.excludePackagePrefixes(model.getExcludePackagePrefixes());
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

    /** Object storage paths to the input files applications to be analysed. */
    @com.fasterxml.jackson.annotation.JsonProperty("inputApplicationsObjectStoragePaths")
    private final java.util.List<String> inputApplicationsObjectStoragePaths;

    /**
     * Object storage paths to the input files applications to be analysed.
     *
     * @return the value
     */
    public java.util.List<String> getInputApplicationsObjectStoragePaths() {
        return inputApplicationsObjectStoragePaths;
    }

    /** Version of the target JDKs. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetJdkVersions")
    private final java.util.List<String> targetJdkVersions;

    /**
     * Version of the target JDKs.
     *
     * @return the value
     */
    public java.util.List<String> getTargetJdkVersions() {
        return targetJdkVersions;
    }

    /**
     * Package prefixes to be included from the migration analysis. Either this or
     * excludePackagePrefixes can be specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("includePackagePrefixes")
    private final java.util.List<String> includePackagePrefixes;

    /**
     * Package prefixes to be included from the migration analysis. Either this or
     * excludePackagePrefixes can be specified.
     *
     * @return the value
     */
    public java.util.List<String> getIncludePackagePrefixes() {
        return includePackagePrefixes;
    }

    /**
     * Package prefixes to be excluded from the migration analysis. Either this or
     * includePackagePrefixes can be specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("excludePackagePrefixes")
    private final java.util.List<String> excludePackagePrefixes;

    /**
     * Package prefixes to be excluded from the migration analysis. Either this or
     * includePackagePrefixes can be specified.
     *
     * @return the value
     */
    public java.util.List<String> getExcludePackagePrefixes() {
        return excludePackagePrefixes;
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
        sb.append("JavaMigrationAnalysisTarget(");
        sb.append("super=").append(super.toString());
        sb.append("analysisProjectName=").append(String.valueOf(this.analysisProjectName));
        sb.append(", inputApplicationsObjectStoragePaths=")
                .append(String.valueOf(this.inputApplicationsObjectStoragePaths));
        sb.append(", targetJdkVersions=").append(String.valueOf(this.targetJdkVersions));
        sb.append(", includePackagePrefixes=").append(String.valueOf(this.includePackagePrefixes));
        sb.append(", excludePackagePrefixes=").append(String.valueOf(this.excludePackagePrefixes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaMigrationAnalysisTarget)) {
            return false;
        }

        JavaMigrationAnalysisTarget other = (JavaMigrationAnalysisTarget) o;
        return java.util.Objects.equals(this.analysisProjectName, other.analysisProjectName)
                && java.util.Objects.equals(
                        this.inputApplicationsObjectStoragePaths,
                        other.inputApplicationsObjectStoragePaths)
                && java.util.Objects.equals(this.targetJdkVersions, other.targetJdkVersions)
                && java.util.Objects.equals(
                        this.includePackagePrefixes, other.includePackagePrefixes)
                && java.util.Objects.equals(
                        this.excludePackagePrefixes, other.excludePackagePrefixes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.analysisProjectName == null
                                ? 43
                                : this.analysisProjectName.hashCode());
        result =
                (result * PRIME)
                        + (this.inputApplicationsObjectStoragePaths == null
                                ? 43
                                : this.inputApplicationsObjectStoragePaths.hashCode());
        result =
                (result * PRIME)
                        + (this.targetJdkVersions == null ? 43 : this.targetJdkVersions.hashCode());
        result =
                (result * PRIME)
                        + (this.includePackagePrefixes == null
                                ? 43
                                : this.includePackagePrefixes.hashCode());
        result =
                (result * PRIME)
                        + (this.excludePackagePrefixes == null
                                ? 43
                                : this.excludePackagePrefixes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
