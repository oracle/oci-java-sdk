/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.model;

/**
 * The attributes to generate a DownloadUrl for a Java runtime artifact. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GenerateArtifactDownloadUrlDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenerateArtifactDownloadUrlDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "artifactId"})
    public GenerateArtifactDownloadUrlDetails(String compartmentId, Long artifactId) {
        super();
        this.compartmentId = compartmentId;
        this.artifactId = artifactId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The tenancy [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the user initiating the download.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The tenancy [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the user initiating the download.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Unique identifier for the Java runtime artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
        private Long artifactId;

        /**
         * Unique identifier for the Java runtime artifact.
         *
         * @param artifactId the value to set
         * @return this builder
         */
        public Builder artifactId(Long artifactId) {
            this.artifactId = artifactId;
            this.__explicitlySet__.add("artifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateArtifactDownloadUrlDetails build() {
            GenerateArtifactDownloadUrlDetails model =
                    new GenerateArtifactDownloadUrlDetails(this.compartmentId, this.artifactId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateArtifactDownloadUrlDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("artifactId")) {
                this.artifactId(model.getArtifactId());
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

    /**
     * The tenancy [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the user initiating the download.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The tenancy [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the user initiating the download.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Unique identifier for the Java runtime artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
    private final Long artifactId;

    /**
     * Unique identifier for the Java runtime artifact.
     *
     * @return the value
     */
    public Long getArtifactId() {
        return artifactId;
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
        sb.append("GenerateArtifactDownloadUrlDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", artifactId=").append(String.valueOf(this.artifactId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateArtifactDownloadUrlDetails)) {
            return false;
        }

        GenerateArtifactDownloadUrlDetails other = (GenerateArtifactDownloadUrlDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.artifactId, other.artifactId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.artifactId == null ? 43 : this.artifactId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
