/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Admin information to provision Analytics Warehouse Servcie.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FawAdminInfoDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FawAdminInfoDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"adwAdminPass", "fawServicePass", "notificationEmail"})
    public FawAdminInfoDetails(
            String adwAdminPass, String fawServicePass, String notificationEmail) {
        super();
        this.adwAdminPass = adwAdminPass;
        this.fawServicePass = fawServicePass;
        this.notificationEmail = notificationEmail;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Password for the ADW to be created in User Tenancy
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adwAdminPass")
        private String adwAdminPass;

        /**
         * Password for the ADW to be created in User Tenancy
         * @param adwAdminPass the value to set
         * @return this builder
         **/
        public Builder adwAdminPass(String adwAdminPass) {
            this.adwAdminPass = adwAdminPass;
            this.__explicitlySet__.add("adwAdminPass");
            return this;
        }
        /**
         * Password for the auto-created FAWService user
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fawServicePass")
        private String fawServicePass;

        /**
         * Password for the auto-created FAWService user
         * @param fawServicePass the value to set
         * @return this builder
         **/
        public Builder fawServicePass(String fawServicePass) {
            this.fawServicePass = fawServicePass;
            this.__explicitlySet__.add("fawServicePass");
            return this;
        }
        /**
         * Email ID to send notification for Analytics Warehouse updates.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("notificationEmail")
        private String notificationEmail;

        /**
         * Email ID to send notification for Analytics Warehouse updates.
         * @param notificationEmail the value to set
         * @return this builder
         **/
        public Builder notificationEmail(String notificationEmail) {
            this.notificationEmail = notificationEmail;
            this.__explicitlySet__.add("notificationEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FawAdminInfoDetails build() {
            FawAdminInfoDetails __instance__ =
                    new FawAdminInfoDetails(adwAdminPass, fawServicePass, notificationEmail);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FawAdminInfoDetails o) {
            Builder copiedBuilder =
                    adwAdminPass(o.getAdwAdminPass())
                            .fawServicePass(o.getFawServicePass())
                            .notificationEmail(o.getNotificationEmail());

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
     * Password for the ADW to be created in User Tenancy
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adwAdminPass")
    private final String adwAdminPass;

    /**
     * Password for the ADW to be created in User Tenancy
     * @return the value
     **/
    public String getAdwAdminPass() {
        return adwAdminPass;
    }

    /**
     * Password for the auto-created FAWService user
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fawServicePass")
    private final String fawServicePass;

    /**
     * Password for the auto-created FAWService user
     * @return the value
     **/
    public String getFawServicePass() {
        return fawServicePass;
    }

    /**
     * Email ID to send notification for Analytics Warehouse updates.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("notificationEmail")
    private final String notificationEmail;

    /**
     * Email ID to send notification for Analytics Warehouse updates.
     * @return the value
     **/
    public String getNotificationEmail() {
        return notificationEmail;
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
        sb.append("FawAdminInfoDetails(");
        sb.append("adwAdminPass=").append(String.valueOf(this.adwAdminPass));
        sb.append(", fawServicePass=").append(String.valueOf(this.fawServicePass));
        sb.append(", notificationEmail=").append(String.valueOf(this.notificationEmail));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FawAdminInfoDetails)) {
            return false;
        }

        FawAdminInfoDetails other = (FawAdminInfoDetails) o;
        return java.util.Objects.equals(this.adwAdminPass, other.adwAdminPass)
                && java.util.Objects.equals(this.fawServicePass, other.fawServicePass)
                && java.util.Objects.equals(this.notificationEmail, other.notificationEmail)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.adwAdminPass == null ? 43 : this.adwAdminPass.hashCode());
        result =
                (result * PRIME)
                        + (this.fawServicePass == null ? 43 : this.fawServicePass.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationEmail == null ? 43 : this.notificationEmail.hashCode());
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
