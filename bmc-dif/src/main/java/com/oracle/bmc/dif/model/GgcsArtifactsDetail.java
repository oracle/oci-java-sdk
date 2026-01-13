/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Details required to deploy artifacts in the GGCS deployment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GgcsArtifactsDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GgcsArtifactsDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceId",
        "artifactObjectStoragePath",
        "users",
        "sources",
        "targets"
    })
    public GgcsArtifactsDetail(
            String instanceId,
            String artifactObjectStoragePath,
            java.util.List<GgcsUserDetail> users,
            java.util.List<GgcsSourceDetail> sources,
            java.util.List<GgcsTargetDetail> targets) {
        super();
        this.instanceId = instanceId;
        this.artifactObjectStoragePath = artifactObjectStoragePath;
        this.users = users;
        this.sources = sources;
        this.targets = targets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Instance id of the exisitng GGCS instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * Instance id of the exisitng GGCS instance.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** Object storage root path containing GGCS artifacts. */
        @com.fasterxml.jackson.annotation.JsonProperty("artifactObjectStoragePath")
        private String artifactObjectStoragePath;

        /**
         * Object storage root path containing GGCS artifacts.
         *
         * @param artifactObjectStoragePath the value to set
         * @return this builder
         */
        public Builder artifactObjectStoragePath(String artifactObjectStoragePath) {
            this.artifactObjectStoragePath = artifactObjectStoragePath;
            this.__explicitlySet__.add("artifactObjectStoragePath");
            return this;
        }
        /** Ggcs user details to be created or updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("users")
        private java.util.List<GgcsUserDetail> users;

        /**
         * Ggcs user details to be created or updated.
         *
         * @param users the value to set
         * @return this builder
         */
        public Builder users(java.util.List<GgcsUserDetail> users) {
            this.users = users;
            this.__explicitlySet__.add("users");
            return this;
        }
        /** Source Detail to configure existing or new datasource. */
        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private java.util.List<GgcsSourceDetail> sources;

        /**
         * Source Detail to configure existing or new datasource.
         *
         * @param sources the value to set
         * @return this builder
         */
        public Builder sources(java.util.List<GgcsSourceDetail> sources) {
            this.sources = sources;
            this.__explicitlySet__.add("sources");
            return this;
        }
        /** Target Detail to configure existing or new datasource. */
        @com.fasterxml.jackson.annotation.JsonProperty("targets")
        private java.util.List<GgcsTargetDetail> targets;

        /**
         * Target Detail to configure existing or new datasource.
         *
         * @param targets the value to set
         * @return this builder
         */
        public Builder targets(java.util.List<GgcsTargetDetail> targets) {
            this.targets = targets;
            this.__explicitlySet__.add("targets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GgcsArtifactsDetail build() {
            GgcsArtifactsDetail model =
                    new GgcsArtifactsDetail(
                            this.instanceId,
                            this.artifactObjectStoragePath,
                            this.users,
                            this.sources,
                            this.targets);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GgcsArtifactsDetail model) {
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("artifactObjectStoragePath")) {
                this.artifactObjectStoragePath(model.getArtifactObjectStoragePath());
            }
            if (model.wasPropertyExplicitlySet("users")) {
                this.users(model.getUsers());
            }
            if (model.wasPropertyExplicitlySet("sources")) {
                this.sources(model.getSources());
            }
            if (model.wasPropertyExplicitlySet("targets")) {
                this.targets(model.getTargets());
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

    /** Instance id of the exisitng GGCS instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * Instance id of the exisitng GGCS instance.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** Object storage root path containing GGCS artifacts. */
    @com.fasterxml.jackson.annotation.JsonProperty("artifactObjectStoragePath")
    private final String artifactObjectStoragePath;

    /**
     * Object storage root path containing GGCS artifacts.
     *
     * @return the value
     */
    public String getArtifactObjectStoragePath() {
        return artifactObjectStoragePath;
    }

    /** Ggcs user details to be created or updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("users")
    private final java.util.List<GgcsUserDetail> users;

    /**
     * Ggcs user details to be created or updated.
     *
     * @return the value
     */
    public java.util.List<GgcsUserDetail> getUsers() {
        return users;
    }

    /** Source Detail to configure existing or new datasource. */
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final java.util.List<GgcsSourceDetail> sources;

    /**
     * Source Detail to configure existing or new datasource.
     *
     * @return the value
     */
    public java.util.List<GgcsSourceDetail> getSources() {
        return sources;
    }

    /** Target Detail to configure existing or new datasource. */
    @com.fasterxml.jackson.annotation.JsonProperty("targets")
    private final java.util.List<GgcsTargetDetail> targets;

    /**
     * Target Detail to configure existing or new datasource.
     *
     * @return the value
     */
    public java.util.List<GgcsTargetDetail> getTargets() {
        return targets;
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
        sb.append("GgcsArtifactsDetail(");
        sb.append("super=").append(super.toString());
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", artifactObjectStoragePath=")
                .append(String.valueOf(this.artifactObjectStoragePath));
        sb.append(", users=").append(String.valueOf(this.users));
        sb.append(", sources=").append(String.valueOf(this.sources));
        sb.append(", targets=").append(String.valueOf(this.targets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GgcsArtifactsDetail)) {
            return false;
        }

        GgcsArtifactsDetail other = (GgcsArtifactsDetail) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(
                        this.artifactObjectStoragePath, other.artifactObjectStoragePath)
                && java.util.Objects.equals(this.users, other.users)
                && java.util.Objects.equals(this.sources, other.sources)
                && java.util.Objects.equals(this.targets, other.targets)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactObjectStoragePath == null
                                ? 43
                                : this.artifactObjectStoragePath.hashCode());
        result = (result * PRIME) + (this.users == null ? 43 : this.users.hashCode());
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        result = (result * PRIME) + (this.targets == null ? 43 : this.targets.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
