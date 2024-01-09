/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Details for collecting deployment diagnostic <br>
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
        builder = CollectDeploymentDiagnosticDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CollectDeploymentDiagnosticDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "namespaceName",
        "bucketName",
        "diagnosticNamePrefix",
        "timeDiagnosticStart",
        "timeDiagnosticEnd"
    })
    public CollectDeploymentDiagnosticDetails(
            String namespaceName,
            String bucketName,
            String diagnosticNamePrefix,
            java.util.Date timeDiagnosticStart,
            java.util.Date timeDiagnosticEnd) {
        super();
        this.namespaceName = namespaceName;
        this.bucketName = bucketName;
        this.diagnosticNamePrefix = diagnosticNamePrefix;
        this.timeDiagnosticStart = timeDiagnosticStart;
        this.timeDiagnosticEnd = timeDiagnosticEnd;
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
        /** Prefix of the diagnostic collected and uploaded to object storage */
        @com.fasterxml.jackson.annotation.JsonProperty("diagnosticNamePrefix")
        private String diagnosticNamePrefix;

        /**
         * Prefix of the diagnostic collected and uploaded to object storage
         *
         * @param diagnosticNamePrefix the value to set
         * @return this builder
         */
        public Builder diagnosticNamePrefix(String diagnosticNamePrefix) {
            this.diagnosticNamePrefix = diagnosticNamePrefix;
            this.__explicitlySet__.add("diagnosticNamePrefix");
            return this;
        }
        /**
         * The time from which the diagnostic collection should collect the logs. The format is
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
         * 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDiagnosticStart")
        private java.util.Date timeDiagnosticStart;

        /**
         * The time from which the diagnostic collection should collect the logs. The format is
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
         * 2016-08-25T21:10:29.600Z}.
         *
         * @param timeDiagnosticStart the value to set
         * @return this builder
         */
        public Builder timeDiagnosticStart(java.util.Date timeDiagnosticStart) {
            this.timeDiagnosticStart = timeDiagnosticStart;
            this.__explicitlySet__.add("timeDiagnosticStart");
            return this;
        }
        /**
         * The time until which the diagnostic collection should collect the logs. The format is
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
         * 2016-08-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDiagnosticEnd")
        private java.util.Date timeDiagnosticEnd;

        /**
         * The time until which the diagnostic collection should collect the logs. The format is
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
         * 2016-08-25T21:10:29.600Z}.
         *
         * @param timeDiagnosticEnd the value to set
         * @return this builder
         */
        public Builder timeDiagnosticEnd(java.util.Date timeDiagnosticEnd) {
            this.timeDiagnosticEnd = timeDiagnosticEnd;
            this.__explicitlySet__.add("timeDiagnosticEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CollectDeploymentDiagnosticDetails build() {
            CollectDeploymentDiagnosticDetails model =
                    new CollectDeploymentDiagnosticDetails(
                            this.namespaceName,
                            this.bucketName,
                            this.diagnosticNamePrefix,
                            this.timeDiagnosticStart,
                            this.timeDiagnosticEnd);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CollectDeploymentDiagnosticDetails model) {
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("diagnosticNamePrefix")) {
                this.diagnosticNamePrefix(model.getDiagnosticNamePrefix());
            }
            if (model.wasPropertyExplicitlySet("timeDiagnosticStart")) {
                this.timeDiagnosticStart(model.getTimeDiagnosticStart());
            }
            if (model.wasPropertyExplicitlySet("timeDiagnosticEnd")) {
                this.timeDiagnosticEnd(model.getTimeDiagnosticEnd());
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

    /** Prefix of the diagnostic collected and uploaded to object storage */
    @com.fasterxml.jackson.annotation.JsonProperty("diagnosticNamePrefix")
    private final String diagnosticNamePrefix;

    /**
     * Prefix of the diagnostic collected and uploaded to object storage
     *
     * @return the value
     */
    public String getDiagnosticNamePrefix() {
        return diagnosticNamePrefix;
    }

    /**
     * The time from which the diagnostic collection should collect the logs. The format is defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDiagnosticStart")
    private final java.util.Date timeDiagnosticStart;

    /**
     * The time from which the diagnostic collection should collect the logs. The format is defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeDiagnosticStart() {
        return timeDiagnosticStart;
    }

    /**
     * The time until which the diagnostic collection should collect the logs. The format is defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDiagnosticEnd")
    private final java.util.Date timeDiagnosticEnd;

    /**
     * The time until which the diagnostic collection should collect the logs. The format is defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code 2016-08-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimeDiagnosticEnd() {
        return timeDiagnosticEnd;
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
        sb.append("CollectDeploymentDiagnosticDetails(");
        sb.append("super=").append(super.toString());
        sb.append("namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", diagnosticNamePrefix=").append(String.valueOf(this.diagnosticNamePrefix));
        sb.append(", timeDiagnosticStart=").append(String.valueOf(this.timeDiagnosticStart));
        sb.append(", timeDiagnosticEnd=").append(String.valueOf(this.timeDiagnosticEnd));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollectDeploymentDiagnosticDetails)) {
            return false;
        }

        CollectDeploymentDiagnosticDetails other = (CollectDeploymentDiagnosticDetails) o;
        return java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.diagnosticNamePrefix, other.diagnosticNamePrefix)
                && java.util.Objects.equals(this.timeDiagnosticStart, other.timeDiagnosticStart)
                && java.util.Objects.equals(this.timeDiagnosticEnd, other.timeDiagnosticEnd)
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
        result =
                (result * PRIME)
                        + (this.timeDiagnosticStart == null
                                ? 43
                                : this.timeDiagnosticStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDiagnosticEnd == null ? 43 : this.timeDiagnosticEnd.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
