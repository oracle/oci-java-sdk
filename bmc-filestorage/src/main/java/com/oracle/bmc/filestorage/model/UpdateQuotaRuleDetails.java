/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details for updating a quota rule in the file system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateQuotaRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateQuotaRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "quotaLimitInGigabytes"})
    public UpdateQuotaRuleDetails(String displayName, Integer quotaLimitInGigabytes) {
        super();
        this.displayName = displayName;
        this.quotaLimitInGigabytes = quotaLimitInGigabytes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name that the quota rule will be renamed to. It does not have to be
         * unique. Avoid entering confidential information. Example: {@code UserXYZ's quota}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name that the quota rule will be renamed to. It does not have to be
         * unique. Avoid entering confidential information. Example: {@code UserXYZ's quota}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** An updated value of the quota rule in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("quotaLimitInGigabytes")
        private Integer quotaLimitInGigabytes;

        /**
         * An updated value of the quota rule in gigabytes.
         *
         * @param quotaLimitInGigabytes the value to set
         * @return this builder
         */
        public Builder quotaLimitInGigabytes(Integer quotaLimitInGigabytes) {
            this.quotaLimitInGigabytes = quotaLimitInGigabytes;
            this.__explicitlySet__.add("quotaLimitInGigabytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateQuotaRuleDetails build() {
            UpdateQuotaRuleDetails model =
                    new UpdateQuotaRuleDetails(this.displayName, this.quotaLimitInGigabytes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateQuotaRuleDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("quotaLimitInGigabytes")) {
                this.quotaLimitInGigabytes(model.getQuotaLimitInGigabytes());
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
     * A user-friendly name that the quota rule will be renamed to. It does not have to be unique.
     * Avoid entering confidential information. Example: {@code UserXYZ's quota}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name that the quota rule will be renamed to. It does not have to be unique.
     * Avoid entering confidential information. Example: {@code UserXYZ's quota}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** An updated value of the quota rule in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("quotaLimitInGigabytes")
    private final Integer quotaLimitInGigabytes;

    /**
     * An updated value of the quota rule in gigabytes.
     *
     * @return the value
     */
    public Integer getQuotaLimitInGigabytes() {
        return quotaLimitInGigabytes;
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
        sb.append("UpdateQuotaRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", quotaLimitInGigabytes=").append(String.valueOf(this.quotaLimitInGigabytes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateQuotaRuleDetails)) {
            return false;
        }

        UpdateQuotaRuleDetails other = (UpdateQuotaRuleDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.quotaLimitInGigabytes, other.quotaLimitInGigabytes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.quotaLimitInGigabytes == null
                                ? 43
                                : this.quotaLimitInGigabytes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
