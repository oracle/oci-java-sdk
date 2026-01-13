/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Detail to deploy Artifacts for Dataflow service. <br>
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
        builder = DataflowArtifactsDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataflowArtifactsDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"instanceId", "execute", "archiveUri"})
    public DataflowArtifactsDetail(String instanceId, String execute, String archiveUri) {
        super();
        this.instanceId = instanceId;
        this.execute = execute;
        this.archiveUri = archiveUri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Instance id of the existing Dataflow Instance for artifact deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * Instance id of the existing Dataflow Instance for artifact deployment.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * Contains the main file (py/jar) along with parameters & configuration to be passed to the
         * DataFlow run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("execute")
        private String execute;

        /**
         * Contains the main file (py/jar) along with parameters & configuration to be passed to the
         * DataFlow run.
         *
         * @param execute the value to set
         * @return this builder
         */
        public Builder execute(String execute) {
            this.execute = execute;
            this.__explicitlySet__.add("execute");
            return this;
        }
        /**
         * Contains the archive from object storage bucket which can be added as dependency to data
         * flow application.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("archiveUri")
        private String archiveUri;

        /**
         * Contains the archive from object storage bucket which can be added as dependency to data
         * flow application.
         *
         * @param archiveUri the value to set
         * @return this builder
         */
        public Builder archiveUri(String archiveUri) {
            this.archiveUri = archiveUri;
            this.__explicitlySet__.add("archiveUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataflowArtifactsDetail build() {
            DataflowArtifactsDetail model =
                    new DataflowArtifactsDetail(this.instanceId, this.execute, this.archiveUri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataflowArtifactsDetail model) {
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("execute")) {
                this.execute(model.getExecute());
            }
            if (model.wasPropertyExplicitlySet("archiveUri")) {
                this.archiveUri(model.getArchiveUri());
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

    /** Instance id of the existing Dataflow Instance for artifact deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * Instance id of the existing Dataflow Instance for artifact deployment.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Contains the main file (py/jar) along with parameters & configuration to be passed to the
     * DataFlow run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("execute")
    private final String execute;

    /**
     * Contains the main file (py/jar) along with parameters & configuration to be passed to the
     * DataFlow run.
     *
     * @return the value
     */
    public String getExecute() {
        return execute;
    }

    /**
     * Contains the archive from object storage bucket which can be added as dependency to data flow
     * application.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("archiveUri")
    private final String archiveUri;

    /**
     * Contains the archive from object storage bucket which can be added as dependency to data flow
     * application.
     *
     * @return the value
     */
    public String getArchiveUri() {
        return archiveUri;
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
        sb.append("DataflowArtifactsDetail(");
        sb.append("super=").append(super.toString());
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", execute=").append(String.valueOf(this.execute));
        sb.append(", archiveUri=").append(String.valueOf(this.archiveUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataflowArtifactsDetail)) {
            return false;
        }

        DataflowArtifactsDetail other = (DataflowArtifactsDetail) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.execute, other.execute)
                && java.util.Objects.equals(this.archiveUri, other.archiveUri)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.execute == null ? 43 : this.execute.hashCode());
        result = (result * PRIME) + (this.archiveUri == null ? 43 : this.archiveUri.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
