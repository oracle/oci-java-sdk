/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Request configuration details for the FTP monitor type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FtpMonitorConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FtpMonitorConfiguration extends MonitorConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isFailureRetried")
        private Boolean isFailureRetried;

        public Builder isFailureRetried(Boolean isFailureRetried) {
            this.isFailureRetried = isFailureRetried;
            this.__explicitlySet__.add("isFailureRetried");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnsConfiguration")
        private DnsConfiguration dnsConfiguration;

        public Builder dnsConfiguration(DnsConfiguration dnsConfiguration) {
            this.dnsConfiguration = dnsConfiguration;
            this.__explicitlySet__.add("dnsConfiguration");
            return this;
        }
        /**
         * FTP protocol type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ftpProtocol")
        private FtpProtocol ftpProtocol;

        /**
         * FTP protocol type.
         * @param ftpProtocol the value to set
         * @return this builder
         **/
        public Builder ftpProtocol(FtpProtocol ftpProtocol) {
            this.ftpProtocol = ftpProtocol;
            this.__explicitlySet__.add("ftpProtocol");
            return this;
        }
        /**
         * FTP monitor request type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ftpRequestType")
        private FtpRequestType ftpRequestType;

        /**
         * FTP monitor request type.
         * @param ftpRequestType the value to set
         * @return this builder
         **/
        public Builder ftpRequestType(FtpRequestType ftpRequestType) {
            this.ftpRequestType = ftpRequestType;
            this.__explicitlySet__.add("ftpRequestType");
            return this;
        }
        /**
         * If enabled, Active mode will be used for the FTP connection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isActiveMode")
        private Boolean isActiveMode;

        /**
         * If enabled, Active mode will be used for the FTP connection.
         * @param isActiveMode the value to set
         * @return this builder
         **/
        public Builder isActiveMode(Boolean isActiveMode) {
            this.isActiveMode = isActiveMode;
            this.__explicitlySet__.add("isActiveMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ftpBasicAuthenticationDetails")
        private BasicAuthenticationDetails ftpBasicAuthenticationDetails;

        public Builder ftpBasicAuthenticationDetails(
                BasicAuthenticationDetails ftpBasicAuthenticationDetails) {
            this.ftpBasicAuthenticationDetails = ftpBasicAuthenticationDetails;
            this.__explicitlySet__.add("ftpBasicAuthenticationDetails");
            return this;
        }
        /**
         * Download size limit in Bytes, at which to stop the transfer. Maximum download size limit is 5 MiB.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("downloadSizeLimitInBytes")
        private Integer downloadSizeLimitInBytes;

        /**
         * Download size limit in Bytes, at which to stop the transfer. Maximum download size limit is 5 MiB.
         * @param downloadSizeLimitInBytes the value to set
         * @return this builder
         **/
        public Builder downloadSizeLimitInBytes(Integer downloadSizeLimitInBytes) {
            this.downloadSizeLimitInBytes = downloadSizeLimitInBytes;
            this.__explicitlySet__.add("downloadSizeLimitInBytes");
            return this;
        }
        /**
         * File upload size in Bytes, at which to stop the transfer. Maximum upload size is 5 MiB.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uploadFileSizeInBytes")
        private Integer uploadFileSizeInBytes;

        /**
         * File upload size in Bytes, at which to stop the transfer. Maximum upload size is 5 MiB.
         * @param uploadFileSizeInBytes the value to set
         * @return this builder
         **/
        public Builder uploadFileSizeInBytes(Integer uploadFileSizeInBytes) {
            this.uploadFileSizeInBytes = uploadFileSizeInBytes;
            this.__explicitlySet__.add("uploadFileSizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
        private NetworkConfiguration networkConfiguration;

        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            this.__explicitlySet__.add("networkConfiguration");
            return this;
        }
        /**
         * Expected FTP response codes. For status code range, set values such as 2xx, 3xx.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseCodes")
        private java.util.List<String> verifyResponseCodes;

        /**
         * Expected FTP response codes. For status code range, set values such as 2xx, 3xx.
         * @param verifyResponseCodes the value to set
         * @return this builder
         **/
        public Builder verifyResponseCodes(java.util.List<String> verifyResponseCodes) {
            this.verifyResponseCodes = verifyResponseCodes;
            this.__explicitlySet__.add("verifyResponseCodes");
            return this;
        }
        /**
         * Verify response content against regular expression based string.
         * If response content does not match the verifyResponseContent value, then it will be considered a failure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseContent")
        private String verifyResponseContent;

        /**
         * Verify response content against regular expression based string.
         * If response content does not match the verifyResponseContent value, then it will be considered a failure.
         *
         * @param verifyResponseContent the value to set
         * @return this builder
         **/
        public Builder verifyResponseContent(String verifyResponseContent) {
            this.verifyResponseContent = verifyResponseContent;
            this.__explicitlySet__.add("verifyResponseContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FtpMonitorConfiguration build() {
            FtpMonitorConfiguration model =
                    new FtpMonitorConfiguration(
                            this.isFailureRetried,
                            this.dnsConfiguration,
                            this.ftpProtocol,
                            this.ftpRequestType,
                            this.isActiveMode,
                            this.ftpBasicAuthenticationDetails,
                            this.downloadSizeLimitInBytes,
                            this.uploadFileSizeInBytes,
                            this.networkConfiguration,
                            this.verifyResponseCodes,
                            this.verifyResponseContent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FtpMonitorConfiguration model) {
            if (model.wasPropertyExplicitlySet("isFailureRetried")) {
                this.isFailureRetried(model.getIsFailureRetried());
            }
            if (model.wasPropertyExplicitlySet("dnsConfiguration")) {
                this.dnsConfiguration(model.getDnsConfiguration());
            }
            if (model.wasPropertyExplicitlySet("ftpProtocol")) {
                this.ftpProtocol(model.getFtpProtocol());
            }
            if (model.wasPropertyExplicitlySet("ftpRequestType")) {
                this.ftpRequestType(model.getFtpRequestType());
            }
            if (model.wasPropertyExplicitlySet("isActiveMode")) {
                this.isActiveMode(model.getIsActiveMode());
            }
            if (model.wasPropertyExplicitlySet("ftpBasicAuthenticationDetails")) {
                this.ftpBasicAuthenticationDetails(model.getFtpBasicAuthenticationDetails());
            }
            if (model.wasPropertyExplicitlySet("downloadSizeLimitInBytes")) {
                this.downloadSizeLimitInBytes(model.getDownloadSizeLimitInBytes());
            }
            if (model.wasPropertyExplicitlySet("uploadFileSizeInBytes")) {
                this.uploadFileSizeInBytes(model.getUploadFileSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("networkConfiguration")) {
                this.networkConfiguration(model.getNetworkConfiguration());
            }
            if (model.wasPropertyExplicitlySet("verifyResponseCodes")) {
                this.verifyResponseCodes(model.getVerifyResponseCodes());
            }
            if (model.wasPropertyExplicitlySet("verifyResponseContent")) {
                this.verifyResponseContent(model.getVerifyResponseContent());
            }
            return this;
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

    @Deprecated
    public FtpMonitorConfiguration(
            Boolean isFailureRetried,
            DnsConfiguration dnsConfiguration,
            FtpProtocol ftpProtocol,
            FtpRequestType ftpRequestType,
            Boolean isActiveMode,
            BasicAuthenticationDetails ftpBasicAuthenticationDetails,
            Integer downloadSizeLimitInBytes,
            Integer uploadFileSizeInBytes,
            NetworkConfiguration networkConfiguration,
            java.util.List<String> verifyResponseCodes,
            String verifyResponseContent) {
        super(isFailureRetried, dnsConfiguration);
        this.ftpProtocol = ftpProtocol;
        this.ftpRequestType = ftpRequestType;
        this.isActiveMode = isActiveMode;
        this.ftpBasicAuthenticationDetails = ftpBasicAuthenticationDetails;
        this.downloadSizeLimitInBytes = downloadSizeLimitInBytes;
        this.uploadFileSizeInBytes = uploadFileSizeInBytes;
        this.networkConfiguration = networkConfiguration;
        this.verifyResponseCodes = verifyResponseCodes;
        this.verifyResponseContent = verifyResponseContent;
    }

    /**
     * FTP protocol type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ftpProtocol")
    private final FtpProtocol ftpProtocol;

    /**
     * FTP protocol type.
     * @return the value
     **/
    public FtpProtocol getFtpProtocol() {
        return ftpProtocol;
    }

    /**
     * FTP monitor request type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ftpRequestType")
    private final FtpRequestType ftpRequestType;

    /**
     * FTP monitor request type.
     * @return the value
     **/
    public FtpRequestType getFtpRequestType() {
        return ftpRequestType;
    }

    /**
     * If enabled, Active mode will be used for the FTP connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isActiveMode")
    private final Boolean isActiveMode;

    /**
     * If enabled, Active mode will be used for the FTP connection.
     * @return the value
     **/
    public Boolean getIsActiveMode() {
        return isActiveMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ftpBasicAuthenticationDetails")
    private final BasicAuthenticationDetails ftpBasicAuthenticationDetails;

    public BasicAuthenticationDetails getFtpBasicAuthenticationDetails() {
        return ftpBasicAuthenticationDetails;
    }

    /**
     * Download size limit in Bytes, at which to stop the transfer. Maximum download size limit is 5 MiB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("downloadSizeLimitInBytes")
    private final Integer downloadSizeLimitInBytes;

    /**
     * Download size limit in Bytes, at which to stop the transfer. Maximum download size limit is 5 MiB.
     * @return the value
     **/
    public Integer getDownloadSizeLimitInBytes() {
        return downloadSizeLimitInBytes;
    }

    /**
     * File upload size in Bytes, at which to stop the transfer. Maximum upload size is 5 MiB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uploadFileSizeInBytes")
    private final Integer uploadFileSizeInBytes;

    /**
     * File upload size in Bytes, at which to stop the transfer. Maximum upload size is 5 MiB.
     * @return the value
     **/
    public Integer getUploadFileSizeInBytes() {
        return uploadFileSizeInBytes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
    private final NetworkConfiguration networkConfiguration;

    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * Expected FTP response codes. For status code range, set values such as 2xx, 3xx.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseCodes")
    private final java.util.List<String> verifyResponseCodes;

    /**
     * Expected FTP response codes. For status code range, set values such as 2xx, 3xx.
     * @return the value
     **/
    public java.util.List<String> getVerifyResponseCodes() {
        return verifyResponseCodes;
    }

    /**
     * Verify response content against regular expression based string.
     * If response content does not match the verifyResponseContent value, then it will be considered a failure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseContent")
    private final String verifyResponseContent;

    /**
     * Verify response content against regular expression based string.
     * If response content does not match the verifyResponseContent value, then it will be considered a failure.
     *
     * @return the value
     **/
    public String getVerifyResponseContent() {
        return verifyResponseContent;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FtpMonitorConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", ftpProtocol=").append(String.valueOf(this.ftpProtocol));
        sb.append(", ftpRequestType=").append(String.valueOf(this.ftpRequestType));
        sb.append(", isActiveMode=").append(String.valueOf(this.isActiveMode));
        sb.append(", ftpBasicAuthenticationDetails=")
                .append(String.valueOf(this.ftpBasicAuthenticationDetails));
        sb.append(", downloadSizeLimitInBytes=")
                .append(String.valueOf(this.downloadSizeLimitInBytes));
        sb.append(", uploadFileSizeInBytes=").append(String.valueOf(this.uploadFileSizeInBytes));
        sb.append(", networkConfiguration=").append(String.valueOf(this.networkConfiguration));
        sb.append(", verifyResponseCodes=").append(String.valueOf(this.verifyResponseCodes));
        sb.append(", verifyResponseContent=").append(String.valueOf(this.verifyResponseContent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FtpMonitorConfiguration)) {
            return false;
        }

        FtpMonitorConfiguration other = (FtpMonitorConfiguration) o;
        return java.util.Objects.equals(this.ftpProtocol, other.ftpProtocol)
                && java.util.Objects.equals(this.ftpRequestType, other.ftpRequestType)
                && java.util.Objects.equals(this.isActiveMode, other.isActiveMode)
                && java.util.Objects.equals(
                        this.ftpBasicAuthenticationDetails, other.ftpBasicAuthenticationDetails)
                && java.util.Objects.equals(
                        this.downloadSizeLimitInBytes, other.downloadSizeLimitInBytes)
                && java.util.Objects.equals(this.uploadFileSizeInBytes, other.uploadFileSizeInBytes)
                && java.util.Objects.equals(this.networkConfiguration, other.networkConfiguration)
                && java.util.Objects.equals(this.verifyResponseCodes, other.verifyResponseCodes)
                && java.util.Objects.equals(this.verifyResponseContent, other.verifyResponseContent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ftpProtocol == null ? 43 : this.ftpProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.ftpRequestType == null ? 43 : this.ftpRequestType.hashCode());
        result = (result * PRIME) + (this.isActiveMode == null ? 43 : this.isActiveMode.hashCode());
        result =
                (result * PRIME)
                        + (this.ftpBasicAuthenticationDetails == null
                                ? 43
                                : this.ftpBasicAuthenticationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.downloadSizeLimitInBytes == null
                                ? 43
                                : this.downloadSizeLimitInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.uploadFileSizeInBytes == null
                                ? 43
                                : this.uploadFileSizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfiguration == null
                                ? 43
                                : this.networkConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.verifyResponseCodes == null
                                ? 43
                                : this.verifyResponseCodes.hashCode());
        result =
                (result * PRIME)
                        + (this.verifyResponseContent == null
                                ? 43
                                : this.verifyResponseContent.hashCode());
        return result;
    }
}
