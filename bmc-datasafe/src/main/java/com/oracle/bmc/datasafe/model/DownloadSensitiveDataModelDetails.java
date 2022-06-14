/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to download a sensitive data model.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DownloadSensitiveDataModelDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DownloadSensitiveDataModelDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"dataModelFormat"})
    public DownloadSensitiveDataModelDetails(DataModelFormat dataModelFormat) {
        super();
        this.dataModelFormat = dataModelFormat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The format of the sensitive data model file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataModelFormat")
        private DataModelFormat dataModelFormat;

        /**
         * The format of the sensitive data model file.
         * @param dataModelFormat the value to set
         * @return this builder
         **/
        public Builder dataModelFormat(DataModelFormat dataModelFormat) {
            this.dataModelFormat = dataModelFormat;
            this.__explicitlySet__.add("dataModelFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DownloadSensitiveDataModelDetails build() {
            DownloadSensitiveDataModelDetails __instance__ =
                    new DownloadSensitiveDataModelDetails(dataModelFormat);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DownloadSensitiveDataModelDetails o) {
            Builder copiedBuilder = dataModelFormat(o.getDataModelFormat());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The format of the sensitive data model file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataModelFormat")
    private final DataModelFormat dataModelFormat;

    /**
     * The format of the sensitive data model file.
     * @return the value
     **/
    public DataModelFormat getDataModelFormat() {
        return dataModelFormat;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DownloadSensitiveDataModelDetails(");
        sb.append("dataModelFormat=").append(String.valueOf(this.dataModelFormat));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadSensitiveDataModelDetails)) {
            return false;
        }

        DownloadSensitiveDataModelDetails other = (DownloadSensitiveDataModelDetails) o;
        return java.util.Objects.equals(this.dataModelFormat, other.dataModelFormat)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dataModelFormat == null ? 43 : this.dataModelFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
