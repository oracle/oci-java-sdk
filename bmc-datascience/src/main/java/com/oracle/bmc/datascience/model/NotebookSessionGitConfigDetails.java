/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Git configuration Details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NotebookSessionGitConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class NotebookSessionGitConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"notebookSessionGitRepoConfigCollection"})
    public NotebookSessionGitConfigDetails(
            java.util.List<NotebookSessionGitRepoConfigDetails>
                    notebookSessionGitRepoConfigCollection) {
        super();
        this.notebookSessionGitRepoConfigCollection = notebookSessionGitRepoConfigCollection;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A collection of Git repository configurations. */
        @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionGitRepoConfigCollection")
        private java.util.List<NotebookSessionGitRepoConfigDetails>
                notebookSessionGitRepoConfigCollection;

        /**
         * A collection of Git repository configurations.
         *
         * @param notebookSessionGitRepoConfigCollection the value to set
         * @return this builder
         */
        public Builder notebookSessionGitRepoConfigCollection(
                java.util.List<NotebookSessionGitRepoConfigDetails>
                        notebookSessionGitRepoConfigCollection) {
            this.notebookSessionGitRepoConfigCollection = notebookSessionGitRepoConfigCollection;
            this.__explicitlySet__.add("notebookSessionGitRepoConfigCollection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NotebookSessionGitConfigDetails build() {
            NotebookSessionGitConfigDetails model =
                    new NotebookSessionGitConfigDetails(
                            this.notebookSessionGitRepoConfigCollection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NotebookSessionGitConfigDetails model) {
            if (model.wasPropertyExplicitlySet("notebookSessionGitRepoConfigCollection")) {
                this.notebookSessionGitRepoConfigCollection(
                        model.getNotebookSessionGitRepoConfigCollection());
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

    /** A collection of Git repository configurations. */
    @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionGitRepoConfigCollection")
    private final java.util.List<NotebookSessionGitRepoConfigDetails>
            notebookSessionGitRepoConfigCollection;

    /**
     * A collection of Git repository configurations.
     *
     * @return the value
     */
    public java.util.List<NotebookSessionGitRepoConfigDetails>
            getNotebookSessionGitRepoConfigCollection() {
        return notebookSessionGitRepoConfigCollection;
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
        sb.append("NotebookSessionGitConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("notebookSessionGitRepoConfigCollection=")
                .append(String.valueOf(this.notebookSessionGitRepoConfigCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotebookSessionGitConfigDetails)) {
            return false;
        }

        NotebookSessionGitConfigDetails other = (NotebookSessionGitConfigDetails) o;
        return java.util.Objects.equals(
                        this.notebookSessionGitRepoConfigCollection,
                        other.notebookSessionGitRepoConfigCollection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.notebookSessionGitRepoConfigCollection == null
                                ? 43
                                : this.notebookSessionGitRepoConfigCollection.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
