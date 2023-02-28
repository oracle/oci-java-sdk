/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Details required for exporting the model artifact from source to service bucket <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExportModelArtifactDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ExportModelArtifactDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"artifactExportDetails"})
    public ExportModelArtifactDetails(ArtifactExportDetails artifactExportDetails) {
        super();
        this.artifactExportDetails = artifactExportDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("artifactExportDetails")
        private ArtifactExportDetails artifactExportDetails;

        public Builder artifactExportDetails(ArtifactExportDetails artifactExportDetails) {
            this.artifactExportDetails = artifactExportDetails;
            this.__explicitlySet__.add("artifactExportDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportModelArtifactDetails build() {
            ExportModelArtifactDetails model =
                    new ExportModelArtifactDetails(this.artifactExportDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportModelArtifactDetails model) {
            if (model.wasPropertyExplicitlySet("artifactExportDetails")) {
                this.artifactExportDetails(model.getArtifactExportDetails());
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

    @com.fasterxml.jackson.annotation.JsonProperty("artifactExportDetails")
    private final ArtifactExportDetails artifactExportDetails;

    public ArtifactExportDetails getArtifactExportDetails() {
        return artifactExportDetails;
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
        sb.append("ExportModelArtifactDetails(");
        sb.append("super=").append(super.toString());
        sb.append("artifactExportDetails=").append(String.valueOf(this.artifactExportDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportModelArtifactDetails)) {
            return false;
        }

        ExportModelArtifactDetails other = (ExportModelArtifactDetails) o;
        return java.util.Objects.equals(this.artifactExportDetails, other.artifactExportDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.artifactExportDetails == null
                                ? 43
                                : this.artifactExportDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
