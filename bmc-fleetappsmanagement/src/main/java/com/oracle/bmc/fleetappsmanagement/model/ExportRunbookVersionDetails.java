/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Request to Export Runbook Version. <br>
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
        builder = ExportRunbookVersionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportRunbookVersionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"contentDestination", "version"})
    public ExportRunbookVersionDetails(
            TransferRunbookContentDetails contentDestination, Float version) {
        super();
        this.contentDestination = contentDestination;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("contentDestination")
        private TransferRunbookContentDetails contentDestination;

        public Builder contentDestination(TransferRunbookContentDetails contentDestination) {
            this.contentDestination = contentDestination;
            this.__explicitlySet__.add("contentDestination");
            return this;
        }
        /** Export Runbook Version Details. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Float version;

        /**
         * Export Runbook Version Details.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(Float version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportRunbookVersionDetails build() {
            ExportRunbookVersionDetails model =
                    new ExportRunbookVersionDetails(this.contentDestination, this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportRunbookVersionDetails model) {
            if (model.wasPropertyExplicitlySet("contentDestination")) {
                this.contentDestination(model.getContentDestination());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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

    @com.fasterxml.jackson.annotation.JsonProperty("contentDestination")
    private final TransferRunbookContentDetails contentDestination;

    public TransferRunbookContentDetails getContentDestination() {
        return contentDestination;
    }

    /** Export Runbook Version Details. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Float version;

    /**
     * Export Runbook Version Details.
     *
     * @return the value
     */
    public Float getVersion() {
        return version;
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
        sb.append("ExportRunbookVersionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("contentDestination=").append(String.valueOf(this.contentDestination));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportRunbookVersionDetails)) {
            return false;
        }

        ExportRunbookVersionDetails other = (ExportRunbookVersionDetails) o;
        return java.util.Objects.equals(this.contentDestination, other.contentDestination)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.contentDestination == null
                                ? 43
                                : this.contentDestination.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
