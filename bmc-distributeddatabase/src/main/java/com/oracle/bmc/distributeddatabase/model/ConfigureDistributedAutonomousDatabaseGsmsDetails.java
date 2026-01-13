/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Details of the request to configure new global service manager(GSM) instances for the distributed
 * autonomous database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConfigureDistributedAutonomousDatabaseGsmsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigureDistributedAutonomousDatabaseGsmsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"oldGsmNames", "isLatestGsmImage"})
    public ConfigureDistributedAutonomousDatabaseGsmsDetails(
            java.util.List<String> oldGsmNames, Boolean isLatestGsmImage) {
        super();
        this.oldGsmNames = oldGsmNames;
        this.isLatestGsmImage = isLatestGsmImage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Names of old global service manager(GSM) instances corresponding to which new GSM
         * instances need to be configured.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oldGsmNames")
        private java.util.List<String> oldGsmNames;

        /**
         * Names of old global service manager(GSM) instances corresponding to which new GSM
         * instances need to be configured.
         *
         * @param oldGsmNames the value to set
         * @return this builder
         */
        public Builder oldGsmNames(java.util.List<String> oldGsmNames) {
            this.oldGsmNames = oldGsmNames;
            this.__explicitlySet__.add("oldGsmNames");
            return this;
        }
        /**
         * Flag to indicate if new global service manager(GSM) instances shall use latest image or
         * re-use image used by existing GSM instances.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isLatestGsmImage")
        private Boolean isLatestGsmImage;

        /**
         * Flag to indicate if new global service manager(GSM) instances shall use latest image or
         * re-use image used by existing GSM instances.
         *
         * @param isLatestGsmImage the value to set
         * @return this builder
         */
        public Builder isLatestGsmImage(Boolean isLatestGsmImage) {
            this.isLatestGsmImage = isLatestGsmImage;
            this.__explicitlySet__.add("isLatestGsmImage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigureDistributedAutonomousDatabaseGsmsDetails build() {
            ConfigureDistributedAutonomousDatabaseGsmsDetails model =
                    new ConfigureDistributedAutonomousDatabaseGsmsDetails(
                            this.oldGsmNames, this.isLatestGsmImage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigureDistributedAutonomousDatabaseGsmsDetails model) {
            if (model.wasPropertyExplicitlySet("oldGsmNames")) {
                this.oldGsmNames(model.getOldGsmNames());
            }
            if (model.wasPropertyExplicitlySet("isLatestGsmImage")) {
                this.isLatestGsmImage(model.getIsLatestGsmImage());
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
     * Names of old global service manager(GSM) instances corresponding to which new GSM instances
     * need to be configured.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oldGsmNames")
    private final java.util.List<String> oldGsmNames;

    /**
     * Names of old global service manager(GSM) instances corresponding to which new GSM instances
     * need to be configured.
     *
     * @return the value
     */
    public java.util.List<String> getOldGsmNames() {
        return oldGsmNames;
    }

    /**
     * Flag to indicate if new global service manager(GSM) instances shall use latest image or
     * re-use image used by existing GSM instances.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isLatestGsmImage")
    private final Boolean isLatestGsmImage;

    /**
     * Flag to indicate if new global service manager(GSM) instances shall use latest image or
     * re-use image used by existing GSM instances.
     *
     * @return the value
     */
    public Boolean getIsLatestGsmImage() {
        return isLatestGsmImage;
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
        sb.append("ConfigureDistributedAutonomousDatabaseGsmsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("oldGsmNames=").append(String.valueOf(this.oldGsmNames));
        sb.append(", isLatestGsmImage=").append(String.valueOf(this.isLatestGsmImage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigureDistributedAutonomousDatabaseGsmsDetails)) {
            return false;
        }

        ConfigureDistributedAutonomousDatabaseGsmsDetails other =
                (ConfigureDistributedAutonomousDatabaseGsmsDetails) o;
        return java.util.Objects.equals(this.oldGsmNames, other.oldGsmNames)
                && java.util.Objects.equals(this.isLatestGsmImage, other.isLatestGsmImage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.oldGsmNames == null ? 43 : this.oldGsmNames.hashCode());
        result =
                (result * PRIME)
                        + (this.isLatestGsmImage == null ? 43 : this.isLatestGsmImage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
