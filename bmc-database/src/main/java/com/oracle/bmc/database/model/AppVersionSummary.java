/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The version details specific to an app.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AppVersionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppVersionSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "releaseDate",
        "endOfSupport",
        "supportedAppName",
        "isCertified"
    })
    public AppVersionSummary(
            String releaseDate, String endOfSupport, String supportedAppName, Boolean isCertified) {
        super();
        this.releaseDate = releaseDate;
        this.endOfSupport = endOfSupport;
        this.supportedAppName = supportedAppName;
        this.isCertified = isCertified;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Autonomous Container Database version release date.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
        private String releaseDate;

        /**
         * The Autonomous Container Database version release date.
         * @param releaseDate the value to set
         * @return this builder
         **/
        public Builder releaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            this.__explicitlySet__.add("releaseDate");
            return this;
        }
        /**
         * The Autonomous Container Database version end of support date.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endOfSupport")
        private String endOfSupport;

        /**
         * The Autonomous Container Database version end of support date.
         * @param endOfSupport the value to set
         * @return this builder
         **/
        public Builder endOfSupport(String endOfSupport) {
            this.endOfSupport = endOfSupport;
            this.__explicitlySet__.add("endOfSupport");
            return this;
        }
        /**
         * The name of the supported application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportedAppName")
        private String supportedAppName;

        /**
         * The name of the supported application.
         * @param supportedAppName the value to set
         * @return this builder
         **/
        public Builder supportedAppName(String supportedAppName) {
            this.supportedAppName = supportedAppName;
            this.__explicitlySet__.add("supportedAppName");
            return this;
        }
        /**
         * Indicates if the image is certified.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCertified")
        private Boolean isCertified;

        /**
         * Indicates if the image is certified.
         * @param isCertified the value to set
         * @return this builder
         **/
        public Builder isCertified(Boolean isCertified) {
            this.isCertified = isCertified;
            this.__explicitlySet__.add("isCertified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppVersionSummary build() {
            AppVersionSummary model =
                    new AppVersionSummary(
                            this.releaseDate,
                            this.endOfSupport,
                            this.supportedAppName,
                            this.isCertified);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppVersionSummary model) {
            if (model.wasPropertyExplicitlySet("releaseDate")) {
                this.releaseDate(model.getReleaseDate());
            }
            if (model.wasPropertyExplicitlySet("endOfSupport")) {
                this.endOfSupport(model.getEndOfSupport());
            }
            if (model.wasPropertyExplicitlySet("supportedAppName")) {
                this.supportedAppName(model.getSupportedAppName());
            }
            if (model.wasPropertyExplicitlySet("isCertified")) {
                this.isCertified(model.getIsCertified());
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

    /**
     * The Autonomous Container Database version release date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
    private final String releaseDate;

    /**
     * The Autonomous Container Database version release date.
     * @return the value
     **/
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * The Autonomous Container Database version end of support date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endOfSupport")
    private final String endOfSupport;

    /**
     * The Autonomous Container Database version end of support date.
     * @return the value
     **/
    public String getEndOfSupport() {
        return endOfSupport;
    }

    /**
     * The name of the supported application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedAppName")
    private final String supportedAppName;

    /**
     * The name of the supported application.
     * @return the value
     **/
    public String getSupportedAppName() {
        return supportedAppName;
    }

    /**
     * Indicates if the image is certified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCertified")
    private final Boolean isCertified;

    /**
     * Indicates if the image is certified.
     * @return the value
     **/
    public Boolean getIsCertified() {
        return isCertified;
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
        sb.append("AppVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("releaseDate=").append(String.valueOf(this.releaseDate));
        sb.append(", endOfSupport=").append(String.valueOf(this.endOfSupport));
        sb.append(", supportedAppName=").append(String.valueOf(this.supportedAppName));
        sb.append(", isCertified=").append(String.valueOf(this.isCertified));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppVersionSummary)) {
            return false;
        }

        AppVersionSummary other = (AppVersionSummary) o;
        return java.util.Objects.equals(this.releaseDate, other.releaseDate)
                && java.util.Objects.equals(this.endOfSupport, other.endOfSupport)
                && java.util.Objects.equals(this.supportedAppName, other.supportedAppName)
                && java.util.Objects.equals(this.isCertified, other.isCertified)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.releaseDate == null ? 43 : this.releaseDate.hashCode());
        result = (result * PRIME) + (this.endOfSupport == null ? 43 : this.endOfSupport.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedAppName == null ? 43 : this.supportedAppName.hashCode());
        result = (result * PRIME) + (this.isCertified == null ? 43 : this.isCertified.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
