/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Request to find runbook export dependencies. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FindRunbookExportDependencyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FindRunbookExportDependencyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"runbookId", "runbookVersionId"})
    public FindRunbookExportDependencyDetails(String runbookId, String runbookVersionId) {
        super();
        this.runbookId = runbookId;
        this.runbookVersionId = runbookVersionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
        private String runbookId;

        /**
         * The OCID of the resource.
         *
         * @param runbookId the value to set
         * @return this builder
         */
        public Builder runbookId(String runbookId) {
            this.runbookId = runbookId;
            this.__explicitlySet__.add("runbookId");
            return this;
        }
        /** The OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookVersionId")
        private String runbookVersionId;

        /**
         * The OCID of the resource.
         *
         * @param runbookVersionId the value to set
         * @return this builder
         */
        public Builder runbookVersionId(String runbookVersionId) {
            this.runbookVersionId = runbookVersionId;
            this.__explicitlySet__.add("runbookVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FindRunbookExportDependencyDetails build() {
            FindRunbookExportDependencyDetails model =
                    new FindRunbookExportDependencyDetails(this.runbookId, this.runbookVersionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FindRunbookExportDependencyDetails model) {
            if (model.wasPropertyExplicitlySet("runbookId")) {
                this.runbookId(model.getRunbookId());
            }
            if (model.wasPropertyExplicitlySet("runbookVersionId")) {
                this.runbookVersionId(model.getRunbookVersionId());
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

    /** The OCID of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
    private final String runbookId;

    /**
     * The OCID of the resource.
     *
     * @return the value
     */
    public String getRunbookId() {
        return runbookId;
    }

    /** The OCID of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookVersionId")
    private final String runbookVersionId;

    /**
     * The OCID of the resource.
     *
     * @return the value
     */
    public String getRunbookVersionId() {
        return runbookVersionId;
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
        sb.append("FindRunbookExportDependencyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("runbookId=").append(String.valueOf(this.runbookId));
        sb.append(", runbookVersionId=").append(String.valueOf(this.runbookVersionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FindRunbookExportDependencyDetails)) {
            return false;
        }

        FindRunbookExportDependencyDetails other = (FindRunbookExportDependencyDetails) o;
        return java.util.Objects.equals(this.runbookId, other.runbookId)
                && java.util.Objects.equals(this.runbookVersionId, other.runbookVersionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runbookId == null ? 43 : this.runbookId.hashCode());
        result =
                (result * PRIME)
                        + (this.runbookVersionId == null ? 43 : this.runbookVersionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
