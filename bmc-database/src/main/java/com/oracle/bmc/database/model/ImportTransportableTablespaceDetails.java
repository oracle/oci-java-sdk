/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for importing transportable tablespace for an Autonomous AI Database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImportTransportableTablespaceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImportTransportableTablespaceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ttsBundleUrl"})
    public ImportTransportableTablespaceDetails(String ttsBundleUrl) {
        super();
        this.ttsBundleUrl = ttsBundleUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** URL for OCI Storage location for a Transportable Tablespace (TTS) bundle. */
        @com.fasterxml.jackson.annotation.JsonProperty("ttsBundleUrl")
        private String ttsBundleUrl;

        /**
         * URL for OCI Storage location for a Transportable Tablespace (TTS) bundle.
         *
         * @param ttsBundleUrl the value to set
         * @return this builder
         */
        public Builder ttsBundleUrl(String ttsBundleUrl) {
            this.ttsBundleUrl = ttsBundleUrl;
            this.__explicitlySet__.add("ttsBundleUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportTransportableTablespaceDetails build() {
            ImportTransportableTablespaceDetails model =
                    new ImportTransportableTablespaceDetails(this.ttsBundleUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportTransportableTablespaceDetails model) {
            if (model.wasPropertyExplicitlySet("ttsBundleUrl")) {
                this.ttsBundleUrl(model.getTtsBundleUrl());
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

    /** URL for OCI Storage location for a Transportable Tablespace (TTS) bundle. */
    @com.fasterxml.jackson.annotation.JsonProperty("ttsBundleUrl")
    private final String ttsBundleUrl;

    /**
     * URL for OCI Storage location for a Transportable Tablespace (TTS) bundle.
     *
     * @return the value
     */
    public String getTtsBundleUrl() {
        return ttsBundleUrl;
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
        sb.append("ImportTransportableTablespaceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ttsBundleUrl=").append(String.valueOf(this.ttsBundleUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportTransportableTablespaceDetails)) {
            return false;
        }

        ImportTransportableTablespaceDetails other = (ImportTransportableTablespaceDetails) o;
        return java.util.Objects.equals(this.ttsBundleUrl, other.ttsBundleUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ttsBundleUrl == null ? 43 : this.ttsBundleUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
