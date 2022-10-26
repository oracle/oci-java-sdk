/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Data Source details for influx. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DataSourceDetailsInflux.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "dataSourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DataSourceDetailsInflux extends DataSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("versionSpecificDetails")
        private InfluxDetails versionSpecificDetails;

        public Builder versionSpecificDetails(InfluxDetails versionSpecificDetails) {
            this.versionSpecificDetails = versionSpecificDetails;
            this.__explicitlySet__.add("versionSpecificDetails");
            return this;
        }
        /** Username for connection to Influx */
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * Username for connection to Influx
         *
         * @param userName the value to set
         * @return this builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /** Password Secret Id for the influx connection */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * Password Secret Id for the influx connection
         *
         * @param passwordSecretId the value to set
         * @return this builder
         */
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }
        /** Measurement name for influx */
        @com.fasterxml.jackson.annotation.JsonProperty("measurementName")
        private String measurementName;

        /**
         * Measurement name for influx
         *
         * @param measurementName the value to set
         * @return this builder
         */
        public Builder measurementName(String measurementName) {
            this.measurementName = measurementName;
            this.__explicitlySet__.add("measurementName");
            return this;
        }
        /** public IP address and port to influx DB */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * public IP address and port to influx DB
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataSourceDetailsInflux build() {
            DataSourceDetailsInflux model =
                    new DataSourceDetailsInflux(
                            this.versionSpecificDetails,
                            this.userName,
                            this.passwordSecretId,
                            this.measurementName,
                            this.url);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataSourceDetailsInflux model) {
            if (model.wasPropertyExplicitlySet("versionSpecificDetails")) {
                this.versionSpecificDetails(model.getVersionSpecificDetails());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("measurementName")) {
                this.measurementName(model.getMeasurementName());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
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

    @Deprecated
    public DataSourceDetailsInflux(
            InfluxDetails versionSpecificDetails,
            String userName,
            String passwordSecretId,
            String measurementName,
            String url) {
        super();
        this.versionSpecificDetails = versionSpecificDetails;
        this.userName = userName;
        this.passwordSecretId = passwordSecretId;
        this.measurementName = measurementName;
        this.url = url;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("versionSpecificDetails")
    private final InfluxDetails versionSpecificDetails;

    public InfluxDetails getVersionSpecificDetails() {
        return versionSpecificDetails;
    }

    /** Username for connection to Influx */
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * Username for connection to Influx
     *
     * @return the value
     */
    public String getUserName() {
        return userName;
    }

    /** Password Secret Id for the influx connection */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * Password Secret Id for the influx connection
     *
     * @return the value
     */
    public String getPasswordSecretId() {
        return passwordSecretId;
    }

    /** Measurement name for influx */
    @com.fasterxml.jackson.annotation.JsonProperty("measurementName")
    private final String measurementName;

    /**
     * Measurement name for influx
     *
     * @return the value
     */
    public String getMeasurementName() {
        return measurementName;
    }

    /** public IP address and port to influx DB */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * public IP address and port to influx DB
     *
     * @return the value
     */
    public String getUrl() {
        return url;
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
        sb.append("DataSourceDetailsInflux(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", versionSpecificDetails=").append(String.valueOf(this.versionSpecificDetails));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", measurementName=").append(String.valueOf(this.measurementName));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataSourceDetailsInflux)) {
            return false;
        }

        DataSourceDetailsInflux other = (DataSourceDetailsInflux) o;
        return java.util.Objects.equals(this.versionSpecificDetails, other.versionSpecificDetails)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(this.measurementName, other.measurementName)
                && java.util.Objects.equals(this.url, other.url)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.versionSpecificDetails == null
                                ? 43
                                : this.versionSpecificDetails.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.measurementName == null ? 43 : this.measurementName.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        return result;
    }
}
