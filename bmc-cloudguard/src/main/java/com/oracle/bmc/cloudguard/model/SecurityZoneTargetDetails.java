/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details about Security Zone Target. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SecurityZoneTargetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "targetResourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecurityZoneTargetDetails extends TargetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the security zone to associate this compartment with. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityZoneId")
        private String securityZoneId;

        /**
         * The OCID of the security zone to associate this compartment with.
         *
         * @param securityZoneId the value to set
         * @return this builder
         */
        public Builder securityZoneId(String securityZoneId) {
            this.securityZoneId = securityZoneId;
            this.__explicitlySet__.add("securityZoneId");
            return this;
        }
        /** The name of the security zone to associate this compartment with. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityZoneDisplayName")
        private String securityZoneDisplayName;

        /**
         * The name of the security zone to associate this compartment with.
         *
         * @param securityZoneDisplayName the value to set
         * @return this builder
         */
        public Builder securityZoneDisplayName(String securityZoneDisplayName) {
            this.securityZoneDisplayName = securityZoneDisplayName;
            this.__explicitlySet__.add("securityZoneDisplayName");
            return this;
        }
        /** The list of security zone recipes to associate this compartment with. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetSecurityZoneRecipes")
        private java.util.List<SecurityRecipe> targetSecurityZoneRecipes;

        /**
         * The list of security zone recipes to associate this compartment with.
         *
         * @param targetSecurityZoneRecipes the value to set
         * @return this builder
         */
        public Builder targetSecurityZoneRecipes(
                java.util.List<SecurityRecipe> targetSecurityZoneRecipes) {
            this.targetSecurityZoneRecipes = targetSecurityZoneRecipes;
            this.__explicitlySet__.add("targetSecurityZoneRecipes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityZoneTargetDetails build() {
            SecurityZoneTargetDetails model =
                    new SecurityZoneTargetDetails(
                            this.securityZoneId,
                            this.securityZoneDisplayName,
                            this.targetSecurityZoneRecipes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityZoneTargetDetails model) {
            if (model.wasPropertyExplicitlySet("securityZoneId")) {
                this.securityZoneId(model.getSecurityZoneId());
            }
            if (model.wasPropertyExplicitlySet("securityZoneDisplayName")) {
                this.securityZoneDisplayName(model.getSecurityZoneDisplayName());
            }
            if (model.wasPropertyExplicitlySet("targetSecurityZoneRecipes")) {
                this.targetSecurityZoneRecipes(model.getTargetSecurityZoneRecipes());
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
    public SecurityZoneTargetDetails(
            String securityZoneId,
            String securityZoneDisplayName,
            java.util.List<SecurityRecipe> targetSecurityZoneRecipes) {
        super();
        this.securityZoneId = securityZoneId;
        this.securityZoneDisplayName = securityZoneDisplayName;
        this.targetSecurityZoneRecipes = targetSecurityZoneRecipes;
    }

    /** The OCID of the security zone to associate this compartment with. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityZoneId")
    private final String securityZoneId;

    /**
     * The OCID of the security zone to associate this compartment with.
     *
     * @return the value
     */
    public String getSecurityZoneId() {
        return securityZoneId;
    }

    /** The name of the security zone to associate this compartment with. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityZoneDisplayName")
    private final String securityZoneDisplayName;

    /**
     * The name of the security zone to associate this compartment with.
     *
     * @return the value
     */
    public String getSecurityZoneDisplayName() {
        return securityZoneDisplayName;
    }

    /** The list of security zone recipes to associate this compartment with. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetSecurityZoneRecipes")
    private final java.util.List<SecurityRecipe> targetSecurityZoneRecipes;

    /**
     * The list of security zone recipes to associate this compartment with.
     *
     * @return the value
     */
    public java.util.List<SecurityRecipe> getTargetSecurityZoneRecipes() {
        return targetSecurityZoneRecipes;
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
        sb.append("SecurityZoneTargetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", securityZoneId=").append(String.valueOf(this.securityZoneId));
        sb.append(", securityZoneDisplayName=")
                .append(String.valueOf(this.securityZoneDisplayName));
        sb.append(", targetSecurityZoneRecipes=")
                .append(String.valueOf(this.targetSecurityZoneRecipes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityZoneTargetDetails)) {
            return false;
        }

        SecurityZoneTargetDetails other = (SecurityZoneTargetDetails) o;
        return java.util.Objects.equals(this.securityZoneId, other.securityZoneId)
                && java.util.Objects.equals(
                        this.securityZoneDisplayName, other.securityZoneDisplayName)
                && java.util.Objects.equals(
                        this.targetSecurityZoneRecipes, other.targetSecurityZoneRecipes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.securityZoneId == null ? 43 : this.securityZoneId.hashCode());
        result =
                (result * PRIME)
                        + (this.securityZoneDisplayName == null
                                ? 43
                                : this.securityZoneDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.targetSecurityZoneRecipes == null
                                ? 43
                                : this.targetSecurityZoneRecipes.hashCode());
        return result;
    }
}
