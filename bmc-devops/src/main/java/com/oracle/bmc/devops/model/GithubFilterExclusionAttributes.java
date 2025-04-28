/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Attributes to filter GitHub events. File filter criteria - Changes only affecting excluded files
 * will not invoke a build. if both include and exclude filter are used then exclusion filter will
 * be applied on the result set of inclusion filter. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GithubFilterExclusionAttributes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GithubFilterExclusionAttributes
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fileFilter"})
    public GithubFilterExclusionAttributes(FileFilter fileFilter) {
        super();
        this.fileFilter = fileFilter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("fileFilter")
        private FileFilter fileFilter;

        public Builder fileFilter(FileFilter fileFilter) {
            this.fileFilter = fileFilter;
            this.__explicitlySet__.add("fileFilter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GithubFilterExclusionAttributes build() {
            GithubFilterExclusionAttributes model =
                    new GithubFilterExclusionAttributes(this.fileFilter);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GithubFilterExclusionAttributes model) {
            if (model.wasPropertyExplicitlySet("fileFilter")) {
                this.fileFilter(model.getFileFilter());
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
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GithubFilterExclusionAttributes(");
        sb.append("super=").append(super.toString());
        sb.append("fileFilter=").append(String.valueOf(this.fileFilter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GithubFilterExclusionAttributes)) {
            return false;
        }

        GithubFilterExclusionAttributes other = (GithubFilterExclusionAttributes) o;
        return java.util.Objects.equals(this.fileFilter, other.fileFilter) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fileFilter == null ? 43 : this.fileFilter.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
