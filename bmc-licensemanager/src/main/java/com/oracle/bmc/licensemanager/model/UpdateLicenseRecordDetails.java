/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * The details about updates in the license record.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateLicenseRecordDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateLicenseRecordDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "isPerpetual",
        "expirationDate",
        "supportEndDate",
        "isUnlimited",
        "licenseCount",
        "productId",
        "freeformTags",
        "definedTags"
    })
    public UpdateLicenseRecordDetails(
            String displayName,
            Boolean isPerpetual,
            java.util.Date expirationDate,
            java.util.Date supportEndDate,
            Boolean isUnlimited,
            Integer licenseCount,
            String productId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.isPerpetual = isPerpetual;
        this.expirationDate = expirationDate;
        this.supportEndDate = supportEndDate;
        this.isUnlimited = isUnlimited;
        this.licenseCount = licenseCount;
        this.productId = productId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * License record name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * License record name.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Specifies if the license record term is perpertual.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPerpetual")
        private Boolean isPerpetual;

        /**
         * Specifies if the license record term is perpertual.
         * @param isPerpetual the value to set
         * @return this builder
         **/
        public Builder isPerpetual(Boolean isPerpetual) {
            this.isPerpetual = isPerpetual;
            this.__explicitlySet__.add("isPerpetual");
            return this;
        }
        /**
         * The license record end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * date format.
         * Example: {@code 2018-09-12}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
        private java.util.Date expirationDate;

        /**
         * The license record end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * date format.
         * Example: {@code 2018-09-12}
         *
         * @param expirationDate the value to set
         * @return this builder
         **/
        public Builder expirationDate(java.util.Date expirationDate) {
            this.expirationDate = expirationDate;
            this.__explicitlySet__.add("expirationDate");
            return this;
        }
        /**
         * The license record support end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * date format.
         * Example: {@code 2018-09-12}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportEndDate")
        private java.util.Date supportEndDate;

        /**
         * The license record support end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * date format.
         * Example: {@code 2018-09-12}
         *
         * @param supportEndDate the value to set
         * @return this builder
         **/
        public Builder supportEndDate(java.util.Date supportEndDate) {
            this.supportEndDate = supportEndDate;
            this.__explicitlySet__.add("supportEndDate");
            return this;
        }
        /**
         * Specifies if the license count is unlimited.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
        private Boolean isUnlimited;

        /**
         * Specifies if the license count is unlimited.
         * @param isUnlimited the value to set
         * @return this builder
         **/
        public Builder isUnlimited(Boolean isUnlimited) {
            this.isUnlimited = isUnlimited;
            this.__explicitlySet__.add("isUnlimited");
            return this;
        }
        /**
         * The number of license units added by a user in a license record.
         * Default 1
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseCount")
        private Integer licenseCount;

        /**
         * The number of license units added by a user in a license record.
         * Default 1
         *
         * @param licenseCount the value to set
         * @return this builder
         **/
        public Builder licenseCount(Integer licenseCount) {
            this.licenseCount = licenseCount;
            this.__explicitlySet__.add("licenseCount");
            return this;
        }
        /**
         * The license record product ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("productId")
        private String productId;

        /**
         * The license record product ID.
         * @param productId the value to set
         * @return this builder
         **/
        public Builder productId(String productId) {
            this.productId = productId;
            this.__explicitlySet__.add("productId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateLicenseRecordDetails build() {
            UpdateLicenseRecordDetails model =
                    new UpdateLicenseRecordDetails(
                            this.displayName,
                            this.isPerpetual,
                            this.expirationDate,
                            this.supportEndDate,
                            this.isUnlimited,
                            this.licenseCount,
                            this.productId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateLicenseRecordDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isPerpetual")) {
                this.isPerpetual(model.getIsPerpetual());
            }
            if (model.wasPropertyExplicitlySet("expirationDate")) {
                this.expirationDate(model.getExpirationDate());
            }
            if (model.wasPropertyExplicitlySet("supportEndDate")) {
                this.supportEndDate(model.getSupportEndDate());
            }
            if (model.wasPropertyExplicitlySet("isUnlimited")) {
                this.isUnlimited(model.getIsUnlimited());
            }
            if (model.wasPropertyExplicitlySet("licenseCount")) {
                this.licenseCount(model.getLicenseCount());
            }
            if (model.wasPropertyExplicitlySet("productId")) {
                this.productId(model.getProductId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * License record name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * License record name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Specifies if the license record term is perpertual.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPerpetual")
    private final Boolean isPerpetual;

    /**
     * Specifies if the license record term is perpertual.
     * @return the value
     **/
    public Boolean getIsPerpetual() {
        return isPerpetual;
    }

    /**
     * The license record end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * date format.
     * Example: {@code 2018-09-12}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
    private final java.util.Date expirationDate;

    /**
     * The license record end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * date format.
     * Example: {@code 2018-09-12}
     *
     * @return the value
     **/
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * The license record support end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * date format.
     * Example: {@code 2018-09-12}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportEndDate")
    private final java.util.Date supportEndDate;

    /**
     * The license record support end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * date format.
     * Example: {@code 2018-09-12}
     *
     * @return the value
     **/
    public java.util.Date getSupportEndDate() {
        return supportEndDate;
    }

    /**
     * Specifies if the license count is unlimited.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
    private final Boolean isUnlimited;

    /**
     * Specifies if the license count is unlimited.
     * @return the value
     **/
    public Boolean getIsUnlimited() {
        return isUnlimited;
    }

    /**
     * The number of license units added by a user in a license record.
     * Default 1
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseCount")
    private final Integer licenseCount;

    /**
     * The number of license units added by a user in a license record.
     * Default 1
     *
     * @return the value
     **/
    public Integer getLicenseCount() {
        return licenseCount;
    }

    /**
     * The license record product ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productId")
    private final String productId;

    /**
     * The license record product ID.
     * @return the value
     **/
    public String getProductId() {
        return productId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateLicenseRecordDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", isPerpetual=").append(String.valueOf(this.isPerpetual));
        sb.append(", expirationDate=").append(String.valueOf(this.expirationDate));
        sb.append(", supportEndDate=").append(String.valueOf(this.supportEndDate));
        sb.append(", isUnlimited=").append(String.valueOf(this.isUnlimited));
        sb.append(", licenseCount=").append(String.valueOf(this.licenseCount));
        sb.append(", productId=").append(String.valueOf(this.productId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateLicenseRecordDetails)) {
            return false;
        }

        UpdateLicenseRecordDetails other = (UpdateLicenseRecordDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isPerpetual, other.isPerpetual)
                && java.util.Objects.equals(this.expirationDate, other.expirationDate)
                && java.util.Objects.equals(this.supportEndDate, other.supportEndDate)
                && java.util.Objects.equals(this.isUnlimited, other.isUnlimited)
                && java.util.Objects.equals(this.licenseCount, other.licenseCount)
                && java.util.Objects.equals(this.productId, other.productId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.isPerpetual == null ? 43 : this.isPerpetual.hashCode());
        result =
                (result * PRIME)
                        + (this.expirationDate == null ? 43 : this.expirationDate.hashCode());
        result =
                (result * PRIME)
                        + (this.supportEndDate == null ? 43 : this.supportEndDate.hashCode());
        result = (result * PRIME) + (this.isUnlimited == null ? 43 : this.isUnlimited.hashCode());
        result = (result * PRIME) + (this.licenseCount == null ? 43 : this.licenseCount.hashCode());
        result = (result * PRIME) + (this.productId == null ? 43 : this.productId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
