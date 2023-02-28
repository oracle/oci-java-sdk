/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to generate a downloadable sensitive data model. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GenerateSensitiveDataModelForDownloadDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class GenerateSensitiveDataModelForDownloadDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dataModelFormat"})
    public GenerateSensitiveDataModelForDownloadDetails(DataModelFormat dataModelFormat) {
        super();
        this.dataModelFormat = dataModelFormat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The format of the sensitive data model file. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataModelFormat")
        private DataModelFormat dataModelFormat;

        /**
         * The format of the sensitive data model file.
         *
         * @param dataModelFormat the value to set
         * @return this builder
         */
        public Builder dataModelFormat(DataModelFormat dataModelFormat) {
            this.dataModelFormat = dataModelFormat;
            this.__explicitlySet__.add("dataModelFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateSensitiveDataModelForDownloadDetails build() {
            GenerateSensitiveDataModelForDownloadDetails model =
                    new GenerateSensitiveDataModelForDownloadDetails(this.dataModelFormat);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateSensitiveDataModelForDownloadDetails model) {
            if (model.wasPropertyExplicitlySet("dataModelFormat")) {
                this.dataModelFormat(model.getDataModelFormat());
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

    /** The format of the sensitive data model file. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataModelFormat")
    private final DataModelFormat dataModelFormat;

    /**
     * The format of the sensitive data model file.
     *
     * @return the value
     */
    public DataModelFormat getDataModelFormat() {
        return dataModelFormat;
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
        sb.append("GenerateSensitiveDataModelForDownloadDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dataModelFormat=").append(String.valueOf(this.dataModelFormat));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateSensitiveDataModelForDownloadDetails)) {
            return false;
        }

        GenerateSensitiveDataModelForDownloadDetails other =
                (GenerateSensitiveDataModelForDownloadDetails) o;
        return java.util.Objects.equals(this.dataModelFormat, other.dataModelFormat)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dataModelFormat == null ? 43 : this.dataModelFormat.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
