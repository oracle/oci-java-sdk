/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details required for syncing a repository with its upstream. <br>
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
        builder = SyncRepositoryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SyncRepositoryDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceBranch", "destinationBranch"})
    public SyncRepositoryDetails(String sourceBranch, String destinationBranch) {
        super();
        this.sourceBranch = sourceBranch;
        this.destinationBranch = destinationBranch;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The branch in the upstream repository we want to sync from. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceBranch")
        private String sourceBranch;

        /**
         * The branch in the upstream repository we want to sync from.
         *
         * @param sourceBranch the value to set
         * @return this builder
         */
        public Builder sourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            this.__explicitlySet__.add("sourceBranch");
            return this;
        }
        /** The branch in the repository we want to be updated with changes from the upstream. */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationBranch")
        private String destinationBranch;

        /**
         * The branch in the repository we want to be updated with changes from the upstream.
         *
         * @param destinationBranch the value to set
         * @return this builder
         */
        public Builder destinationBranch(String destinationBranch) {
            this.destinationBranch = destinationBranch;
            this.__explicitlySet__.add("destinationBranch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SyncRepositoryDetails build() {
            SyncRepositoryDetails model =
                    new SyncRepositoryDetails(this.sourceBranch, this.destinationBranch);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SyncRepositoryDetails model) {
            if (model.wasPropertyExplicitlySet("sourceBranch")) {
                this.sourceBranch(model.getSourceBranch());
            }
            if (model.wasPropertyExplicitlySet("destinationBranch")) {
                this.destinationBranch(model.getDestinationBranch());
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

    /** The branch in the upstream repository we want to sync from. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceBranch")
    private final String sourceBranch;

    /**
     * The branch in the upstream repository we want to sync from.
     *
     * @return the value
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    /** The branch in the repository we want to be updated with changes from the upstream. */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBranch")
    private final String destinationBranch;

    /**
     * The branch in the repository we want to be updated with changes from the upstream.
     *
     * @return the value
     */
    public String getDestinationBranch() {
        return destinationBranch;
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
        sb.append("SyncRepositoryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceBranch=").append(String.valueOf(this.sourceBranch));
        sb.append(", destinationBranch=").append(String.valueOf(this.destinationBranch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SyncRepositoryDetails)) {
            return false;
        }

        SyncRepositoryDetails other = (SyncRepositoryDetails) o;
        return java.util.Objects.equals(this.sourceBranch, other.sourceBranch)
                && java.util.Objects.equals(this.destinationBranch, other.destinationBranch)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceBranch == null ? 43 : this.sourceBranch.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationBranch == null ? 43 : this.destinationBranch.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
