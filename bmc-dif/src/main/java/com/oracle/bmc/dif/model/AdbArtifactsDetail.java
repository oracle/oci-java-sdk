/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * ADW details to upload artifacts. <br>
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
        builder = AdbArtifactsDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AdbArtifactsDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"instanceId", "artifactObjectStoragePath", "dbCredentials"})
    public AdbArtifactsDetail(
            String instanceId,
            String artifactObjectStoragePath,
            java.util.List<DbCredentialsDetail> dbCredentials) {
        super();
        this.instanceId = instanceId;
        this.artifactObjectStoragePath = artifactObjectStoragePath;
        this.dbCredentials = dbCredentials;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Instance id of the existing ADB instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * Instance id of the existing ADB instance.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** Object storage path for the artifacts. */
        @com.fasterxml.jackson.annotation.JsonProperty("artifactObjectStoragePath")
        private String artifactObjectStoragePath;

        /**
         * Object storage path for the artifacts.
         *
         * @param artifactObjectStoragePath the value to set
         * @return this builder
         */
        public Builder artifactObjectStoragePath(String artifactObjectStoragePath) {
            this.artifactObjectStoragePath = artifactObjectStoragePath;
            this.__explicitlySet__.add("artifactObjectStoragePath");
            return this;
        }
        /** DB credential details. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbCredentials")
        private java.util.List<DbCredentialsDetail> dbCredentials;

        /**
         * DB credential details.
         *
         * @param dbCredentials the value to set
         * @return this builder
         */
        public Builder dbCredentials(java.util.List<DbCredentialsDetail> dbCredentials) {
            this.dbCredentials = dbCredentials;
            this.__explicitlySet__.add("dbCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdbArtifactsDetail build() {
            AdbArtifactsDetail model =
                    new AdbArtifactsDetail(
                            this.instanceId, this.artifactObjectStoragePath, this.dbCredentials);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdbArtifactsDetail model) {
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("artifactObjectStoragePath")) {
                this.artifactObjectStoragePath(model.getArtifactObjectStoragePath());
            }
            if (model.wasPropertyExplicitlySet("dbCredentials")) {
                this.dbCredentials(model.getDbCredentials());
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

    /** Instance id of the existing ADB instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * Instance id of the existing ADB instance.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** Object storage path for the artifacts. */
    @com.fasterxml.jackson.annotation.JsonProperty("artifactObjectStoragePath")
    private final String artifactObjectStoragePath;

    /**
     * Object storage path for the artifacts.
     *
     * @return the value
     */
    public String getArtifactObjectStoragePath() {
        return artifactObjectStoragePath;
    }

    /** DB credential details. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbCredentials")
    private final java.util.List<DbCredentialsDetail> dbCredentials;

    /**
     * DB credential details.
     *
     * @return the value
     */
    public java.util.List<DbCredentialsDetail> getDbCredentials() {
        return dbCredentials;
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
        sb.append("AdbArtifactsDetail(");
        sb.append("super=").append(super.toString());
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", artifactObjectStoragePath=")
                .append(String.valueOf(this.artifactObjectStoragePath));
        sb.append(", dbCredentials=").append(String.valueOf(this.dbCredentials));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdbArtifactsDetail)) {
            return false;
        }

        AdbArtifactsDetail other = (AdbArtifactsDetail) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(
                        this.artifactObjectStoragePath, other.artifactObjectStoragePath)
                && java.util.Objects.equals(this.dbCredentials, other.dbCredentials)
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
        result =
                (result * PRIME)
                        + (this.dbCredentials == null ? 43 : this.dbCredentials.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
