/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * Pull request properties from recommend stage of the remediation run. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PullRequestProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PullRequestProperties
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pullRequestIdentifier", "pullRequestUrl"})
    public PullRequestProperties(String pullRequestIdentifier, String pullRequestUrl) {
        super();
        this.pullRequestIdentifier = pullRequestIdentifier;
        this.pullRequestUrl = pullRequestUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the pull or merge request created in the recommend stage. */
        @com.fasterxml.jackson.annotation.JsonProperty("pullRequestIdentifier")
        private String pullRequestIdentifier;

        /**
         * Unique identifier for the pull or merge request created in the recommend stage.
         *
         * @param pullRequestIdentifier the value to set
         * @return this builder
         */
        public Builder pullRequestIdentifier(String pullRequestIdentifier) {
            this.pullRequestIdentifier = pullRequestIdentifier;
            this.__explicitlySet__.add("pullRequestIdentifier");
            return this;
        }
        /** The web link to the pull or merge request created in the recommend stage. */
        @com.fasterxml.jackson.annotation.JsonProperty("pullRequestUrl")
        private String pullRequestUrl;

        /**
         * The web link to the pull or merge request created in the recommend stage.
         *
         * @param pullRequestUrl the value to set
         * @return this builder
         */
        public Builder pullRequestUrl(String pullRequestUrl) {
            this.pullRequestUrl = pullRequestUrl;
            this.__explicitlySet__.add("pullRequestUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PullRequestProperties build() {
            PullRequestProperties model =
                    new PullRequestProperties(this.pullRequestIdentifier, this.pullRequestUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PullRequestProperties model) {
            if (model.wasPropertyExplicitlySet("pullRequestIdentifier")) {
                this.pullRequestIdentifier(model.getPullRequestIdentifier());
            }
            if (model.wasPropertyExplicitlySet("pullRequestUrl")) {
                this.pullRequestUrl(model.getPullRequestUrl());
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

    /** Unique identifier for the pull or merge request created in the recommend stage. */
    @com.fasterxml.jackson.annotation.JsonProperty("pullRequestIdentifier")
    private final String pullRequestIdentifier;

    /**
     * Unique identifier for the pull or merge request created in the recommend stage.
     *
     * @return the value
     */
    public String getPullRequestIdentifier() {
        return pullRequestIdentifier;
    }

    /** The web link to the pull or merge request created in the recommend stage. */
    @com.fasterxml.jackson.annotation.JsonProperty("pullRequestUrl")
    private final String pullRequestUrl;

    /**
     * The web link to the pull or merge request created in the recommend stage.
     *
     * @return the value
     */
    public String getPullRequestUrl() {
        return pullRequestUrl;
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
        sb.append("PullRequestProperties(");
        sb.append("super=").append(super.toString());
        sb.append("pullRequestIdentifier=").append(String.valueOf(this.pullRequestIdentifier));
        sb.append(", pullRequestUrl=").append(String.valueOf(this.pullRequestUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PullRequestProperties)) {
            return false;
        }

        PullRequestProperties other = (PullRequestProperties) o;
        return java.util.Objects.equals(this.pullRequestIdentifier, other.pullRequestIdentifier)
                && java.util.Objects.equals(this.pullRequestUrl, other.pullRequestUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.pullRequestIdentifier == null
                                ? 43
                                : this.pullRequestIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.pullRequestUrl == null ? 43 : this.pullRequestUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
