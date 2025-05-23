/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Details for collecting pipeline diagnostics <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CollectPipelineDiagnosticDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CollectPipelineDiagnosticDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"namespaceName", "bucketName", "diagnosticNamePrefix"})
    public CollectPipelineDiagnosticDetails(
            String namespaceName, String bucketName, String diagnosticNamePrefix) {
        super();
        this.namespaceName = namespaceName;
        this.bucketName = bucketName;
        this.diagnosticNamePrefix = diagnosticNamePrefix;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of namespace that serves as a container for all of your buckets */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * Name of namespace that serves as a container for all of your buckets
         *
         * @param namespaceName the value to set
         * @return this builder
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /** Name of the bucket where the object is to be uploaded in the object storage */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * Name of the bucket where the object is to be uploaded in the object storage
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** Name of the diagnostic collected and uploaded to object storage */
        @com.fasterxml.jackson.annotation.JsonProperty("diagnosticNamePrefix")
        private String diagnosticNamePrefix;

        /**
         * Name of the diagnostic collected and uploaded to object storage
         *
         * @param diagnosticNamePrefix the value to set
         * @return this builder
         */
        public Builder diagnosticNamePrefix(String diagnosticNamePrefix) {
            this.diagnosticNamePrefix = diagnosticNamePrefix;
            this.__explicitlySet__.add("diagnosticNamePrefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CollectPipelineDiagnosticDetails build() {
            CollectPipelineDiagnosticDetails model =
                    new CollectPipelineDiagnosticDetails(
                            this.namespaceName, this.bucketName, this.diagnosticNamePrefix);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CollectPipelineDiagnosticDetails model) {
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("diagnosticNamePrefix")) {
                this.diagnosticNamePrefix(model.getDiagnosticNamePrefix());
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

    /** Name of namespace that serves as a container for all of your buckets */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * Name of namespace that serves as a container for all of your buckets
     *
     * @return the value
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /** Name of the bucket where the object is to be uploaded in the object storage */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * Name of the bucket where the object is to be uploaded in the object storage
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** Name of the diagnostic collected and uploaded to object storage */
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosticNamePrefix")
    private final String diagnosticNamePrefix;

    /**
     * Name of the diagnostic collected and uploaded to object storage
     *
     * @return the value
     */
    public String getDiagnosticNamePrefix() {
        return diagnosticNamePrefix;
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
        sb.append("CollectPipelineDiagnosticDetails(");
        sb.append("super=").append(super.toString());
        sb.append("namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", diagnosticNamePrefix=").append(String.valueOf(this.diagnosticNamePrefix));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollectPipelineDiagnosticDetails)) {
            return false;
        }

        CollectPipelineDiagnosticDetails other = (CollectPipelineDiagnosticDetails) o;
        return java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.diagnosticNamePrefix, other.diagnosticNamePrefix)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.diagnosticNamePrefix == null
                                ? 43
                                : this.diagnosticNamePrefix.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
