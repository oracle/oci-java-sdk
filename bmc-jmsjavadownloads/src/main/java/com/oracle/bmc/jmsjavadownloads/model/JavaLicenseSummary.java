/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.model;

/**
 * Summary of a license type for Java. <br>
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
        builder = JavaLicenseSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaLicenseSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "licenseType", "licenseUrl"})
    public JavaLicenseSummary(String displayName, LicenseType licenseType, String licenseUrl) {
        super();
        this.displayName = displayName;
        this.licenseType = licenseType;
        this.licenseUrl = licenseUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Commonly used name for the license type. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Commonly used name for the license type.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** License Type */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
        private LicenseType licenseType;

        /**
         * License Type
         *
         * @param licenseType the value to set
         * @return this builder
         */
        public Builder licenseType(LicenseType licenseType) {
            this.licenseType = licenseType;
            this.__explicitlySet__.add("licenseType");
            return this;
        }
        /** Publicly accessible license URL containing the detailed terms and conditions. */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseUrl")
        private String licenseUrl;

        /**
         * Publicly accessible license URL containing the detailed terms and conditions.
         *
         * @param licenseUrl the value to set
         * @return this builder
         */
        public Builder licenseUrl(String licenseUrl) {
            this.licenseUrl = licenseUrl;
            this.__explicitlySet__.add("licenseUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaLicenseSummary build() {
            JavaLicenseSummary model =
                    new JavaLicenseSummary(this.displayName, this.licenseType, this.licenseUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaLicenseSummary model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("licenseType")) {
                this.licenseType(model.getLicenseType());
            }
            if (model.wasPropertyExplicitlySet("licenseUrl")) {
                this.licenseUrl(model.getLicenseUrl());
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

    /** Commonly used name for the license type. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Commonly used name for the license type.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** License Type */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
    private final LicenseType licenseType;

    /**
     * License Type
     *
     * @return the value
     */
    public LicenseType getLicenseType() {
        return licenseType;
    }

    /** Publicly accessible license URL containing the detailed terms and conditions. */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseUrl")
    private final String licenseUrl;

    /**
     * Publicly accessible license URL containing the detailed terms and conditions.
     *
     * @return the value
     */
    public String getLicenseUrl() {
        return licenseUrl;
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
        sb.append("JavaLicenseSummary(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", licenseType=").append(String.valueOf(this.licenseType));
        sb.append(", licenseUrl=").append(String.valueOf(this.licenseUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaLicenseSummary)) {
            return false;
        }

        JavaLicenseSummary other = (JavaLicenseSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.licenseType, other.licenseType)
                && java.util.Objects.equals(this.licenseUrl, other.licenseUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result = (result * PRIME) + (this.licenseUrl == null ? 43 : this.licenseUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
