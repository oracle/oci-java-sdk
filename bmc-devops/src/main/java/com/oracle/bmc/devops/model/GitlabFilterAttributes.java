/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Attributes to filter GitLab events.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GitlabFilterAttributes.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GitlabFilterAttributes
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"headRef", "baseRef", "fileFilter"})
    public GitlabFilterAttributes(String headRef, String baseRef, FileFilter fileFilter) {
        super();
        this.headRef = headRef;
        this.baseRef = baseRef;
        this.fileFilter = fileFilter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Branch for push event; source branch for pull requests.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("headRef")
        private String headRef;

        /**
         * Branch for push event; source branch for pull requests.
         * @param headRef the value to set
         * @return this builder
         **/
        public Builder headRef(String headRef) {
            this.headRef = headRef;
            this.__explicitlySet__.add("headRef");
            return this;
        }
        /**
         * The target branch for pull requests; not applicable for push requests.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("baseRef")
        private String baseRef;

        /**
         * The target branch for pull requests; not applicable for push requests.
         * @param baseRef the value to set
         * @return this builder
         **/
        public Builder baseRef(String baseRef) {
            this.baseRef = baseRef;
            this.__explicitlySet__.add("baseRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fileFilter")
        private FileFilter fileFilter;

        public Builder fileFilter(FileFilter fileFilter) {
            this.fileFilter = fileFilter;
            this.__explicitlySet__.add("fileFilter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GitlabFilterAttributes build() {
            GitlabFilterAttributes model =
                    new GitlabFilterAttributes(this.headRef, this.baseRef, this.fileFilter);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitlabFilterAttributes model) {
            if (model.wasPropertyExplicitlySet("headRef")) {
                this.headRef(model.getHeadRef());
            }
            if (model.wasPropertyExplicitlySet("baseRef")) {
                this.baseRef(model.getBaseRef());
            }
            if (model.wasPropertyExplicitlySet("fileFilter")) {
                this.fileFilter(model.getFileFilter());
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
     * Branch for push event; source branch for pull requests.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headRef")
    private final String headRef;

    /**
     * Branch for push event; source branch for pull requests.
     * @return the value
     **/
    public String getHeadRef() {
        return headRef;
    }

    /**
     * The target branch for pull requests; not applicable for push requests.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baseRef")
    private final String baseRef;

    /**
     * The target branch for pull requests; not applicable for push requests.
     * @return the value
     **/
    public String getBaseRef() {
        return baseRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fileFilter")
    private final FileFilter fileFilter;

    public FileFilter getFileFilter() {
        return fileFilter;
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
        sb.append("GitlabFilterAttributes(");
        sb.append("super=").append(super.toString());
        sb.append("headRef=").append(String.valueOf(this.headRef));
        sb.append(", baseRef=").append(String.valueOf(this.baseRef));
        sb.append(", fileFilter=").append(String.valueOf(this.fileFilter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitlabFilterAttributes)) {
            return false;
        }

        GitlabFilterAttributes other = (GitlabFilterAttributes) o;
        return java.util.Objects.equals(this.headRef, other.headRef)
                && java.util.Objects.equals(this.baseRef, other.baseRef)
                && java.util.Objects.equals(this.fileFilter, other.fileFilter)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.headRef == null ? 43 : this.headRef.hashCode());
        result = (result * PRIME) + (this.baseRef == null ? 43 : this.baseRef.hashCode());
        result = (result * PRIME) + (this.fileFilter == null ? 43 : this.fileFilter.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
